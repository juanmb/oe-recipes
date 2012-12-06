DESCRIPTION = "Library to implement a well-behaved Unix daemon process" 
SECTION = "devel/python" 
PRIORITY = "optional" 
LICENSE = "PSF-2+" 
HOMEPAGE = "http://pypi.python.org/pypi/python-daemon/" 
SRCNAME = "python-daemon" 
RDEPENDS_${PN} = "python-resource" 

SRC_URI = "http://pypi.python.org/packages/source/p/python-daemon/${SRCNAME}-${PV}.tar.gz" 
S = "${WORKDIR}/${SRCNAME}-${PV}" 

inherit setuptools 

SRC_URI[md5sum] = "1f6cd41473c2e201021a0aeef395b2b1"
SRC_URI[sha256sum] = "1406962e48ce03642c6057f40f9ffd49493792a7b34357fe9e264708748c83c0"
