DESCRIPTION = "A general purpose Python data validator"

SECTION = "devel/python"
HOMEPAGE = "https://pypi.python.org/pypi/validictory"
LICENSE = "MIT"
RDEPENDS = "python-core python-numbers"
PR = "r1"

SRC_URI = "https://github.com/juanmb/validictory/archive/master.zip"
S = "${WORKDIR}/validictory-master"

inherit setuptools
SRC_URI[md5sum] = "bb277b63b2582f78193056a574f1cb9e"
SRC_URI[sha256sum] = "46c91d066ee6d68b57c6a23b3e341c69c1ce5ff987bf962902db28c3be86bffc"
