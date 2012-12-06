DESCRIPTION = "oftpd is designed to be as secure as an anonymous FTP server can possibly be"
PRIORITY = "optional"
LICENSE = "Copyright"
PR = "r0"
SRC_URI = "http://www.time-travellers.org/oftpd/oftpd-${PV}.tar.gz \
           file://oftpd.init"

S = "${WORKDIR}/oftpd-${PV}" 

inherit autotools pkgconfig

FILES_${PN} += "/etc/init.d/oftpd"

do_install_prepend () {
    install -m 0755 -d ${D}/etc
    install -m 0755 -d ${D}/etc/init.d
    install -m 0755 ${WORKDIR}/oftpd.init ${D}${sysconfdir}/init.d/oftpd
}

SRC_URI[md5sum] = "1a396ad12584c7efe3a0e712dadf28be"
SRC_URI[sha256sum] = "b135cd2bc6c54e03e5374845964eab73d5e567160c15bb4226c1c922b1e6d64e"

pkg_postinst() {
    update-rc.d oftpd defaults 90
}

pkg_postrm() {
    update-rc.d oftpd remove
}

