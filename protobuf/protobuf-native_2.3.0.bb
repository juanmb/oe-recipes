DESCRIPTION = "Google Protocol Buffers" 
SECTION = "devel/python" 
SRCNAME = "protobuf" 
PR = "r1" 

PACKAGES =+ "${PN}" 

SRC_URI = "http://protobuf.googlecode.com/files/${SRCNAME}-${PV}.tar.bz2" 
S = "${WORKDIR}/${SRCNAME}-${PV}" 

inherit autotools native 

SRC_URI[md5sum] = "f2964f636b3c67d1e9d8b90819fa8ddb"
SRC_URI[sha256sum] = "760c7707c3fe9ce801916bbd3067d711a33aa550c01b32d1e1761119cf6280ac"
