DESCRIPTION = "Random Python WSGI stuff"
SECTION = "devel/python"
PRIORITY = "optional"
LICENSE = "BSD"
PR = "ml1"
SRC_URI = "http://www.saddi.com/software/flup/dist/flup-${PV}.tar.gz \
           file://flup-no-setuptools.patch"
S = "${WORKDIR}/flup-${PV}"

inherit distutils

RDEPENDS_${PN} = ""

SRC_URI[md5sum] = "24dad7edc5ada31dddd49456ee8d5254"
SRC_URI[sha256sum] = "4bad317a5fc1ce3d4fe5e9b6d846ec38a8023e16876785d4f88102f2c8097dd9"
