DESCRIPTION = "Nginx is a free, open-source, high-performance HTTP server and reverse proxy, as well as an IMAP/POP3 proxy server."
HOMEPAGE = "http://wiki.nginx.org"
SECTION = "net"
PRIORITY = "optional"
LICENSE = "BSD"
PR = "r0"

# Includes tcp_proxy module

SRC_URI = "http://nginx.org/download/nginx-${PV}.tar.gz;name=nginx \
           https://github.com/yaoweibin/nginx_tcp_proxy_module/archive/v0.26.zip;name=tcpproxy \
           file://allow-cross.patch \
           file://tcp.patch \
           file://nginx"

DEPENDS = "libpcre logrotate"

do_configure() {
    export cross_compiling="yes"
    ${S}/configure \
    --with-cc="${HOST_PREFIX}gcc -Wl,--hash-style=gnu" \
    --sbin-path=${sbindir}/nginx \
    --pid-path=${localstatedir}/run/nginx.pid \
    --lock-path=${localstatedir}/lock/nginx.lock \
    --error-log-path=${localstatedir}/log/nginx/error \
    --conf-path=${sysconfdir}/nginx/nginx.conf \
    --http-log-path=${localstatedir}/log/nginx/access \
    --http-client-body-temp-path=${localstatedir}/lib/nginx/client_body_temp \
    --http-proxy-temp-path=${localstatedir}/lib/nginx/proxy_temp \
    --http-fastcgi-temp-path=${localstatedir}/lib/nginx/fastcgi_temp \
    --http-uwsgi-temp-path=${localstatedir}/lib/nginx/uwsgi_temp \
    --http-scgi-temp-path=${localstatedir}/lib/nginx/scgi_temp \
    --add-module=../nginx_tcp_proxy_module-0.26
}

do_install() {
    install -d ${D}${localstatedir}/lib/nginx
    install -d ${D}${localstatedir}/log/nginx
#    install -m 0755 -d ${D}${sysconfdir}
#    install -m 0644 ${WORKDIR}/nginx ${D}${sysconfdir}/logrotate
    oe_runmake DESTDIR=${D} install
}

SRC_URI[nginx.md5sum] = "b9f7640cca35196d0e719ac5da24c7bd"
SRC_URI[nginx.sha256sum] = "d2947c98c5bed311b1e6c04e35a730af92e40e2e6bfe9201fa7f404987457137"
SRC_URI[tcpproxy.md5sum] = "43996e7609fdd5bb6839898309e32be8"
SRC_URI[tcpproxy.sha256sum] = "5be30b084a9ef31fed6b62e9288d417180e94da2d1d56868abf113a6e651eca6"
