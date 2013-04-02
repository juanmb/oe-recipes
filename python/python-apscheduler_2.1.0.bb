DESCRIPTION = "In-process task scheduler with Cron-like capabilities"

SECTION = "devel/python"
HOMEPAGE = "http://pypi.python.org/pypi/APScheduler/"
LICENSE = "MIT"
DEPENDS = "python-core"
PR = "r1"

SRC_URI = "https://pypi.python.org/packages/source/A/APScheduler/APScheduler-${PV}.tar.gz"
S = "${WORKDIR}/APScheduler-${PV}"

inherit setuptools
SRC_URI[md5sum] = "b837d23822fc46651862dd2186ec361a"
SRC_URI[sha256sum] = "3b4b44387616902ad6d13122961013630eb25519937e5aa7c450de85656c9753"
