DESCRIPTION = "Publish - subscribe API that allows data to be sent between independent parts of your application"
SECTION = "devel/python"
PRIORITY = "optional"
LICENSE = "BSD"
PR = "r0"

SRC_URI = "${SOURCEFORGE_MIRROR}/pubsub/PyPubSub-${PV}.zip \
           file://fix_setup.patch"
SRC_URI[md5sum] = "a2312db7165d0b3b94bb3691136e7ca6"
SRC_URI[sha256sum] = "b12ed5541999ef3169bf1c58c139064b352342f68e8cbbe66da9120543cae977"

S = "${WORKDIR}/PyPubSub-${PV}"

inherit setuptools

