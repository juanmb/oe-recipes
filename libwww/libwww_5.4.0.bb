DESCRIPTION = "the W3C Protocol Library"
SECTION = "libs"
PRIORITY = "optional"
LICENSE = "BSD"
PR = "r0"

SRC_URI = "http://www.w3.org/Library/Distribution/w3c-libwww-${PV}.tgz \
           file://gnu_hash_style.patch;patch=1 \
           file://configure.patch;patch=1"

S = "${WORKDIR}/w3c-libwww-${PV}"

EXTRA_OECONF = "--disable-fast-install"
inherit autotools

do_configure() {
    oe_runconf
}

do_stage() {
    autotools_stage_all
}

