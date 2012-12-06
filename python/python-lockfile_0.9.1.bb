DESCRIPTION = "Platform-independent file locking for Python"
SECTION = "devel/python"
HOMEPAGE = "http://code.google.com/p/pylockfile/"
LICENSE = "MIT"
PR = "ml1"

SRC_URI = "http://pylockfile.googlecode.com/files/lockfile-${PV}.tar.gz"
S = "${WORKDIR}/lockfile-${PV}"

inherit distutils

SRC_URI[md5sum] = "4e4c7ea4c4301500da5e7f3b51e01cfe"
SRC_URI[sha256sum] = "88d8ea8d435ee5691117a87d1ca8fed2f8da881eb145295bf6895ac2c416e95d"
