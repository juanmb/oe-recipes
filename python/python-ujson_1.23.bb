DESCRIPTION = "Ultra fast JSON encoder and decoder for Python"
SECTION = "devel/python"
HOMEPAGE = "http://github.com/esnme/ultrajson"
LICENSE = "BSD"
PR = "ml1"

SRC_URI = "http://pypi.python.org/packages/source/u/ujson/ujson-${PV}.zip \
           file://ujson-build.patch"

S = "${WORKDIR}/ujson-${PV}"

inherit distutils

SRC_URI[md5sum] = "e55986d2ebdaa0380e2f61e56d7cc9d8"
SRC_URI[sha256sum] = "6fc94fcbf6a6f56fd0814d1eadbfccf35e4215eeba647333ce59dcee03b589f3"
