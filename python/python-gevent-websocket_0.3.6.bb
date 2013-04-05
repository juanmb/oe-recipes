DESCRIPTION = "Websocket library for the gevent networking library"

SECTION = "devel/python"
HOMEPAGE = "http://bitbucket.org/Jeffrey/gevent-websocket/src"
LICENSE = "BSD"
RDEPENDS = "python-gevent"
PR = "r1"

SRC_URI = "https://pypi.python.org/packages/source/g/gevent-websocket/gevent-websocket-${PV}.tar.gz"
S = "${WORKDIR}/gevent-websocket-${PV}"

inherit setuptools

SRC_URI[md5sum] = "b953f8d4b9476f1645da8b8aa55b4530"
SRC_URI[sha256sum] = "1806bd1e78cfbd6f5b38e00c6b6f5a5ed0015b1eee94f78adba62d199c23ad6d"

