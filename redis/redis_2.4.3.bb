DESCRIPTION = "Open source, advanced key-value store"
HOMEPAGE = "http://redis.io"
LICENSE = "Copyright"
SECTION = "misc"
DEPENDS = ""
PR = "r0"

SRC_URI = "http://redis.googlecode.com/files/redis-${PV}.tar.gz \
           file://fix_prefix.patch;patch=1;apply=yes \
           file://redis-server.conf file://redis"

S = "${WORKDIR}/redis-${PV}" 

FILES_${PN} += "/etc/redis.conf"
FILES_${PN} += "/etc/init.d/redis"

do_compile () {
    make FORCE_LIBC_MALLOC=yes
}

do_install_prepend () {
    install -m 0755 -d ${D}/etc
    install ${WORKDIR}/redis-server.conf ${D}${sysconfdir}/redis.conf
    install -m 0755 -d ${D}/etc/init.d
    install -m 0755 ${WORKDIR}/redis ${D}${sysconfdir}/init.d/redis
}

do_install () {
    DESTDIR=${D} oe_runmake FORCE_LIBC_MALLOC=yes install
}

SRC_URI[md5sum] = "2511481019d1ba5ae18dea30ea77abb8"
SRC_URI[sha256sum] = "4e0f39968776819a942d1502626ac6072a28e1b148a25f662d80bbcb54d5ba4c"

pkg_postinst() {
    update-rc.d redis defaults 90
}

pkg_postrm() {
    update-rc.d redis remove
}

