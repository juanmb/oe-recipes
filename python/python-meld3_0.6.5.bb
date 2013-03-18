DESCRIPTION = "meld3 is an HTML/XML templating system"
SECTION = "devel/python"
PRIORITY = "optional"
LICENSE = "Zope Public License"
PR = "r0"

SRC_URI = "http://www.plope.com/software/meld3/meld3-${PV}.tar.gz"
SRC_URI[md5sum] = "65b1f926050bffc04495f7113948e940"
SRC_URI[sha256sum] = "732505cb37d7f14bdb16fa306222c3cee227051af904902ef333a9ddcb2a2ec3"

S = "${WORKDIR}/meld3-${PV}"

inherit distutils

