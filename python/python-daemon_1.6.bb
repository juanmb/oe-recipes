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

SRC_URI[md5sum] = "c774eda27d6c5d80b42037826d29e523"
SRC_URI[sha256sum] = "1665fb16bfeae72f16aa2de40bc75661458bd42731a7d463a911a8d5eaf96c0b"
