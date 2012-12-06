DESCRIPTION = "System V IPC for Python"
SECTION = "devel/python"
HOMEPAGE = "http://www.semanchuk.com/philip/sysv_ipc/"
LICENSE = "BSD"
PR = "ml1"

SRC_URI = "http://www.semanchuk.com/philip/sysv_ipc/sysv_ipc-${PV}.tar.gz"
S = "${WORKDIR}/sysv_ipc-${PV}"

inherit distutils

SRC_URI[md5sum] = "622b32edd53a6a49bf363d88be1fd9a0"
SRC_URI[sha256sum] = "7a2938d754efbd7d01c06731462934e96801c1ac3fb3193c01a75f3ecd6f939d"
