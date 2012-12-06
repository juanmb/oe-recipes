DESCRIPTION = "Jansson is a C library for encoding, decoding and manipulating JSON data"
SECTION = "libs"
PRIORITY = "optional"
LICENSE = "GPL"
PR = "r0"

SRC_URI = "http://www.digip.org/jansson/releases/jansson-${PV}.tar.gz"

S = "${WORKDIR}/jansson-${PV}" 

inherit autotools pkgconfig

EXTRA_OECONF = "--prefix=/usr/"

do_configure() {
    oe_runconf
}

do_stage() {
    autotools_stage_all
}

SRC_URI[md5sum] = "198fbff8265686894b6d088dca22896d"
SRC_URI[sha256sum] = "4c47c08eac02c2f3853edcc70e6689f71ca648adc5800b8bbf5621a3d52c19b8"

