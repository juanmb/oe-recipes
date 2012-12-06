DESCRIPTION = "Spawns FastCGI processes"
HOMEPAGE = " http://redmine.lighttpd.net/projects/spawn-fcgi"
SECTION = "network"
PRIORITY = "optional"
PR = "r0"

SRC_URI = "http://www.lighttpd.net/download/spawn-fcgi-${PV}.tar.gz \
           file://rpl_malloc.patch;patch=1;apply=yes"

S = "${WORKDIR}/spawn-fcgi-${PV}" 

inherit autotools pkgconfig

EXTRA_OECONF = "--prefix=/usr/"

do_configure() {
    oe_runconf
}

SRC_URI[md5sum] = "6d75f9e9435056fa1e574d836d823cd0"
SRC_URI[sha256sum] = "7507a822995731629149040ee5686279b7582ae46f0296efd64b542ef052a90e"

