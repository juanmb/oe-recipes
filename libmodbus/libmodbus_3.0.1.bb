DESCRIPTION = "A Modbus library for Linux, Mac OS X, FreeBSD, QNX and Win32"
SECTION = "libs"
PRIORITY = "optional"
LICENSE = "GPL"
PR = "r0"

SRC_URI = "http://github.com/downloads/stephane/libmodbus/libmodbus-${PV}.tar.gz"

S = "${WORKDIR}/libmodbus-${PV}" 

ac_cv_func_malloc_0_nonnull=yes

inherit autotools pkgconfig

EXTRA_OECONF = "--prefix=/usr/"

do_configure() {
    oe_runconf
}

do_stage() {
    autotools_stage_all
}

SRC_URI[md5sum] = "7ad8afbd02a7a2afd70c5bb7271a593b"
SRC_URI[sha256sum] = "c45bd1d64a3a8970fbbfa1f6671d3f67bced9ff27b47360724aebc5512b0e0af"

