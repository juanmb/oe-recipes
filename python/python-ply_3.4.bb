DESCRIPTION = "PLY is an implementation of lex and yacc parsing tools for Python"

SECTION = "devel/python"
HOMEPAGE = "http://www.dabeaz.com/ply/"
LICENSE = "BSD"
PR = "r1"

SRC_URI = "http://www.dabeaz.com/ply/ply-${PV}.tar.gz"

S = "${WORKDIR}/ply-${PV}"

inherit setuptools

SRC_URI[md5sum] = "ffdc95858819347bf92d7c2acc074894"
SRC_URI[sha256sum] = "af435f11b7bdd69da5ffbc3fecb8d70a7073ec952e101764c88720cdefb2546b"
