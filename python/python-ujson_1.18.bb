DESCRIPTION = "Ultra fast JSON encoder and decoder for Python"
SECTION = "devel/python"
HOMEPAGE = "http://github.com/esnme/ultrajson"
LICENSE = "BSD"
PR = "ml1"

SRC_URI = "http://pypi.python.org/packages/source/u/ujson/ujson-${PV}.zip"
S = "${WORKDIR}/ujson-${PV}"

inherit distutils

SRC_URI[md5sum] = "8d033858770ff2222a001ee1fcd0ee15"
SRC_URI[sha256sum] = "03a1cfa97714eaf075f436b99f6750ca007ba348aea9d4877878745e6c4a82fc"
