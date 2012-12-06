DESCRIPTION = "Simple validator for JSON Schema"
SECTION = "devel/python" 
PRIORITY = "optional" 
HOMEPAGE = "https://bitbucket.org/IanLewis/jsonschema"
SRCNAME = "jsonschema" 
DEPENDS = "python" 

SRC_URI = "https://bitbucket.org/IanLewis/jsonschema/get/tip.tar.gz"

S = "${WORKDIR}/IanLewis-jsonschema-acf761e2573b"
inherit distutils 

SRC_URI[md5sum] = "ed47e0fb21ef7609459042a145aba8f4"
SRC_URI[sha256sum] = "e6e59d192eca1bc7e125267704a6c9796dec4ca84958aaf99b3ba715b9c37659"
