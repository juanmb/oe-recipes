DESCRIPTION = "A system for controlling process state under UNIX"
HOMEPAGE = "http://supervisord.org"
SECTION = "admin"
PRIORITY = "optional"
LICENSE = "BSD"
PR = "ml1"

SRC_URI = "https://pypi.python.org/packages/source/s/supervisor/supervisor-${PV}.tar.gz \
	   file://supervisord.init file://supervisord.conf"

S = "${WORKDIR}/supervisor-${PV}"

inherit setuptools

RDEPENDS_${PN} = "python-setuptools python-misc python-html python-unixadmin python-meld3"

PACKAGES = "${PN}"

site_packages="${libdir}/python2.*/site-packages"

FILES_${PN} = "\
	${sysconfdir}/* \
	${bindir}/* \
	${site_packages}/*.egg-info \
	${site_packages}/*.pth \
	${site_packages}/supervisor/*.pyo \
	${site_packages}/supervisor/*.txt \
	${site_packages}/supervisor/ui \
	${site_packages}/supervisor/medusa/*.pyo \
	${site_packages}/supervisor/medusa/*.txt \
	${site_packages}/supervisor/medusa/thread/*.pyo"

do_install_prepend() {
	install -d ${D}${sysconfdir}/init.d
	install -d ${D}${sysconfdir}/supervisor/conf.d

	install -m 0644 ${WORKDIR}/supervisord.conf ${D}${sysconfdir}/supervisord.conf
	install -m 0755 ${WORKDIR}/supervisord.init ${D}${sysconfdir}/init.d/supervisord
}

pkg_postinst() {
    update-rc.d supervisord defaults 90
}

pkg_postrm() {
    update-rc.d supervisord remove
}

SRC_URI[md5sum] = "5a2f1bb052bb2bbfd6d69ba8b1e1dad7"
SRC_URI[sha256sum] = "7361e224871257534cac3bc035e90571c35b9fa9245ec46207de9d89191a7d0c"
