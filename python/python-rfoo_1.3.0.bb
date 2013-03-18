DESCRIPTION = "rfoo (remote foo) is a fast Python RPC package"
SECTION = "devel/python"
PRIORITY = "optional"
LICENSE = "BSD"
PR = "ml1"
SRC_URI = "http://rfoo.googlecode.com/files/rfoo-${PV}.tar.gz"
S = "${WORKDIR}/rfoo-${PV}"

inherit distutils

PACKAGES = "${PN}"

# leave debug files out of the package
FILES_${PN} = "\
    ${libdir}/python2.*/site-packages/rfoo/*.pyo \
    ${libdir}/python2.*/site-packages/rfoo/utils/*.pyo \
    ${libdir}/python2.*/site-packages/rfoo/marsh.so"

SRC_URI[md5sum] = "def659ff85f14de51b455e88510b7f4b"
SRC_URI[sha256sum] = "c2de80d246efa113f18669cccbda2d1a573672d1534ba61ad862692323570960"
