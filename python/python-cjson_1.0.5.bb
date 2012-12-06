DESCRIPTION = "Fast JSON encoder/decoder for Python"
SECTION = "devel/python" 
PRIORITY = "optional" 
LICENSE = "LGPL" 
HOMEPAGE = "http://ag-projects.com/" 
SRCNAME = "python-cjson" 
DEPENDS = "python" 

SRC_URI = "http://pypi.python.org/packages/source/p/python-cjson/${SRCNAME}-${PV}.tar.gz"

S = "${WORKDIR}/${SRCNAME}-${PV}" 

inherit distutils 

SRC_URI[md5sum] = "4d55b66ecdf0300313af9d030d9644a3"
SRC_URI[sha256sum] = "85bbe7a9fb6617e24bb4dbef528af8ef6eae07f8809dcd05ec926142feca7714"
