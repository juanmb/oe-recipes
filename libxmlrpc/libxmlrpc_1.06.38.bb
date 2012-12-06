DESCRIPTION = "A lightweight RPC library based on XML and HTTP"
SECTION = "libs"
PRIORITY = "optional"
LICENSE = "BSD"
PR = "r0"
LEAD_SONAME = "libxmlrpc.so.0"

SRC_URI = "${SOURCEFORGE_MIRROR}/xmlrpc-c/xmlrpc-c-${PV}.tgz \
           file://nametab.patch;patch=1 \
           file://libwww.patch;patch=1 \
           file://gnu_hash_style.patch;patch=1"

S = "${WORKDIR}/xmlrpc-c-${PV}"

EXTRA_OECONF = "--disable-curl-client --enable-libwww-client \
                --disable-wininet-client --disable-cplusplus"

inherit autotools

do_configure() {
    oe_runconf
}

do_stage() {
    autotools_stage_all
}

