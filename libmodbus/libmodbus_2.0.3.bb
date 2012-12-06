DESCRIPTION = "A Modbus library for Linux, Mac OS X, FreeBSD, QNX and Win32"
SECTION = "libs"
PRIORITY = "optional"
LICENSE = "GPL"
PR = "r0"

SRC_URI = "http://github.com/downloads/stephane/libmodbus/libmodbus-${PV}.tar.gz \
           file://ac_func_malloc.patch;patch=1;apply=yes"

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

SRC_URI[md5sum] = "0646f3edca6d7783d0356dc2fc4f9f4c"
SRC_URI[sha256sum] = "cf9d8d3981ace78a4ed559f2e28c5e0270d56a607b9ae79484e5742e36543feb"

