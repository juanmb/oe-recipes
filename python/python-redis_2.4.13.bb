DESCRIPTION = "Redis Python Client"
SECTION = "devel/python"
PRIORITY = "optional"
LICENSE = "PSF"
PR = "ml1"
SRC_URI = "https://github.com/downloads/andymccurdy/redis-py/redis-${PV}.tar.gz \
           file://no-setuptools.patch"

S = "${WORKDIR}/redis-${PV}"

inherit distutils

RDEPENDS_${PN} = "\
  python-netclient \
  python-datetime \
  redis \
"

SRC_URI[md5sum] = "996d2a38f1ac6a6c7e752fb87f3265ed"
SRC_URI[sha256sum] = "365285e161395344edc629a2e108f6bb0983e96d9b5012dab1f76cec2379a09a"
