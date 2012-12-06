DESCRIPTION = "Python bindings for Google Protocol Buffers" 
SECTION = "devel/python" 
SRCNAME = "protobuf" 
PR = "r1" 

PACKAGES =+ "${PN}" 
DEPENDS = "protobuf-native python-setuptools-native" 

SRC_URI = "http://protobuf.googlecode.com/files/${SRCNAME}-${PV}.tar.bz2" 
S = "${WORKDIR}/${SRCNAME}-${PV}/python" 

inherit distutils 
libdir = "/usr/lib" 
DISTUTILS_INSTALL_ARGS = "--root=${D} --prefix=${prefix}" 

FILES_${PN} =+ "${libdir}/python2.6/site-packages/* ${libdir}/python2.6/site-packages/${SRCNAME}-${PV}-py2.6.egg-info" 

SRC_URI[md5sum] = "f2964f636b3c67d1e9d8b90819fa8ddb"
SRC_URI[sha256sum] = "760c7707c3fe9ce801916bbd3067d711a33aa550c01b32d1e1761119cf6280ac"
