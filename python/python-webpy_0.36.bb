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
  python-flup \
"

SRC_URI[md5sum] = "3f9ee778c5c34357a0233c1f0e024d00"
SRC_URI[sha256sum] = "c45ec5b5feaaba53bbae69dd971c281832f1332d5949cd6e5ca27747fe92256a"
