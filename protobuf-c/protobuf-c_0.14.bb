DESCRIPTION = "C bindings for Google's Protocol Buffers" 
SECTION = "devel" 
SRCNAME = "protobuf-c" 
PR = "r1" 

PACKAGES =+ "${PN}" 
DEPENDS = "protobuf-c-native"

SRC_URI = "http://protobuf-c.googlecode.com/files/${SRCNAME}-${PV}.tar.gz \
           file://notests.patch;patch=1"
S = "${WORKDIR}/${SRCNAME}-${PV}" 

inherit autotools

do_configure() {
	libtoolize
	aclocal
	autoconf
    automake -a --foreign
	oe_runconf
}

SRC_URI[md5sum] = "37684f04b8ee6690df2d45786a469f3a"
SRC_URI[sha256sum] = "c9a1c39518145a11918f4ac79666b0966815da77eb5e412b4ca7901532afb59d"
