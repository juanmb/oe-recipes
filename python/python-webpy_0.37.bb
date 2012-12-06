DESCRIPTION = "A Lightweight Web Application Framework"
SECTION = "devel/python"
PRIORITY = "optional"
LICENSE = "PSF"
PR = "ml1"
SRC_URI = "http://webpy.org/static/web.py-${PV}.tar.gz"
S = "${WORKDIR}/web.py-${PV}"

inherit distutils

RDEPENDS_${PN} = "\
  python-shell \
  python-threading \
  python-netserver \
  python-netclient \
  python-pprint \
"

SRC_URI[md5sum] = "93375e3f03e74d6bf5c5096a4962a8db"
SRC_URI[sha256sum] = "748c7e99ad9e36f62ea19f7965eb7dd7860b530e8f563ed60ce3e53e7409a550"
