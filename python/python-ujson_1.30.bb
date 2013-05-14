DESCRIPTION = "Ultra fast JSON encoder and decoder for Python"
SECTION = "devel/python"
HOMEPAGE = "http://github.com/esnme/ultrajson"
LICENSE = "BSD"
PR = "ml1"

SRC_URI = "http://pypi.python.org/packages/source/u/ujson/ujson-${PV}.zip"

S = "${WORKDIR}/ujson-${PV}"

inherit distutils

FILES_${PN}-dbg += "${libdir}/python2.*/site-packages/.debug"

SRC_URI[md5sum] = "cddd818b4602552281e31a447784113f"
SRC_URI[sha256sum] = "489a55781a50126b0af12726bde50857b82fe5bbe0e5eb1bd37abe39da578d5f"
