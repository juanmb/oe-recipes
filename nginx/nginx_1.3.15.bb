DESCRIPTION = "Nginx is a free, open-source, high-performance HTTP server and reverse proxy, as well as an IMAP/POP3 proxy server."
HOMEPAGE = "http://wiki.nginx.org"
SECTION = "net"
PRIORITY = "optional"
LICENSE = "BSD"
PR = "r2"

SRC_URI = "http://nginx.org/download/nginx-${PV}.tar.gz \
           file://allow-cross.patch file://nginx.init file://nginx.conf \
           file://mime.types"

DEPENDS = "libpcre"

do_configure() {
    export cross_compiling="yes"
    ${S}/configure \
    --with-cc="${HOST_PREFIX}gcc -Wl,--hash-style=gnu" \
    --sbin-path=${sbindir}/nginx \
    --pid-path=${localstatedir}/run/nginx.pid \
    --lock-path=${localstatedir}/lock/nginx.lock \
    --error-log-path=${localstatedir}/log/nginx_error \
    --conf-path=${sysconfdir}/nginx/nginx.conf \
    --http-log-path=${localstatedir}/log/nginx_access \
    --http-client-body-temp-path=${localstatedir}/lib/nginx/client_body_temp \
    --http-proxy-temp-path=${localstatedir}/lib/nginx/proxy_temp \
    --http-fastcgi-temp-path=${localstatedir}/lib/nginx/fastcgi_temp \
    --http-uwsgi-temp-path=${localstatedir}/lib/nginx/uwsgi_temp \
    --http-scgi-temp-path=${localstatedir}/lib/nginx/scgi_temp
}

do_install() {
    install -d ${D}${sysconfdir}/init.d
    install -d ${D}${localstatedir}/lib/nginx
    install -d ${D}${localstatedir}/log
    install -d ${D}${sysconfdir}/nginx/conf.d
    install -m 0644 ${WORKDIR}/nginx.conf ${D}${sysconfdir}/nginx/nginx.conf
    install -m 0644 ${WORKDIR}/mime.types ${D}${sysconfdir}/nginx/mime.types
    install -m 0755 ${WORKDIR}/nginx.init ${D}${sysconfdir}/init.d/nginx
    oe_runmake DESTDIR=${D} install
}

pkg_postinst() {
    update-rc.d nginx defaults 94
}

pkg_postrm() {
    update-rc.d nginx remove
}

SRC_URI[md5sum] = "ded252047393c79a31b0862e9166a065"
SRC_URI[sha256sum] = "3267574f007cba5d947ad04d2aebd45ffec06565d019791bc536229bbc6d3b84"
