DESCRIPTION = "A sophisticated Numeric Processing Package for Python"
SECTION = "devel/python"
PRIORITY = "optional"
LICENSE = "PSF"
PR = "ml0"

inherit native
inherit distutils

DEPENDS = "python-native"
SRC_URI = "${SOURCEFORGE_MIRROR}/numpy/numpy-${PV}.tar.gz"
S = "${WORKDIR}/numpy-${PV}"

do_stage() {
	distutils_stage_all
}

SRC_URI[md5sum] = "5c7b5349dc3161763f7f366ceb96516b"
SRC_URI[sha256sum] = "2e7bb84573e5123e07f3c919fd433bc09b78d606252b6b719e385c2a981d8e06"
