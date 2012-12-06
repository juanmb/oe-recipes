DESCRIPTION = "Portable ftp daemon"
HOMEPAGE = "http://bftpd.sourceforge.net/"
SECTION = "console/network"
PR = "r2"
LICENSE = "GPL"

TARGET_CC_ARCH += "${LDFLAGS}" 

SRC_URI = "${SOURCEFORGE_MIRROR}/${PN}/${PN}-${PV}.tar.gz \
	   file://bftpd.conf \
	   file://bftpd.users \
	   file://bftpd.init \
	   file://struct_user.patch"

S = "${WORKDIR}/${PN}"

inherit autotools

do_install() {
	install -d ${D}${sbindir}
	install -d ${D}${mandir}/man8
	install -d ${D}${sysconfdir}
	install -d ${D}${sysconfdir}/init.d

	install -m 0755 ${S}/bftpd      ${D}${sbindir}/bftpd
	install -m 0755 ${S}/bftpd.8    ${D}${mandir}/man8/bftpd.8
	install -m 0644 ${WORKDIR}/bftpd.conf ${D}${sysconfdir}/bftpd.conf
	install -m 0600 ${WORKDIR}/bftpd.users ${D}${sysconfdir}/bftpd.users
	install -m 0755 ${WORKDIR}/bftpd.init ${D}${sysconfdir}/init.d/bftpd
}

pkg_postinst() {
    update-rc.d bftpd defaults 90
}

pkg_postrm() {
    update-rc.d bftpd remove
}

SRC_URI[md5sum] = "880c1274e623ddd1e3e37f9f0cf09d70"
SRC_URI[sha256sum] = "4670488d81ffed2853fbcee9902162c8aff28d611829e0d58758579576313fc6"
