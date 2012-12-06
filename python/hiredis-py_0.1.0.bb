DESCRIPTION = "Python extension that wraps hiredis" 
SECTION = "devel/python" 
PRIORITY = "optional" 
LICENSE = "BSD" 
HOMEPAGE = "http://pypi.python.org/pypi/hiredis" 
SRCNAME = "hiredis" 
DEPENDS = "python" 

SRC_URI = "http://pypi.python.org/packages/source/h/hiredis/hiredis-${PV}.tar.gz"

S = "${WORKDIR}/hiredis-${PV}" 

inherit distutils 

SRC_URI[md5sum] = "0030abe2fd3acbecbd0d960d60844142"
SRC_URI[sha256sum] = "06648b06d6f8380c31c3e7e0e6790c2b3ddf1e3f74ac8998fef7b2dc46da82f2"
