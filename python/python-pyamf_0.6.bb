DESCRIPTION = "PyAMF provides Action Message Format (AMF) support for Python that is compatible with the Adobe Flash Player" 
SECTION = "devel/python" 
PRIORITY = "optional" 
LICENSE = "MIT" 
HOMEPAGE = "http://www.pyamf.org" 
SRCNAME = "PyAMF" 
DEPENDS = "python" 

SRC_URI = "http://pypi.python.org/packages/source/P/${SRCNAME}/${SRCNAME}-${PV}.tar.gz" 
S = "${WORKDIR}/pyamf-${PV}" 

inherit distutils 

SRC_URI[md5sum] = "280b3f943e633f55853a00aa742ae669"
SRC_URI[sha256sum] = "0dbd9c904e4f3096ad17fd3ee9e4a0eab9ab1f8615ee40e8c1160382511193e0"
