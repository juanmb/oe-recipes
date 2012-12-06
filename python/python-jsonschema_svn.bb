DESCRIPTION = "Simple validator for JSON Schema"
SECTION = "devel/python" 
PRIORITY = "optional" 
HOMEPAGE = "https://bitbucket.org/IanLewis/jsonschema"
SRCNAME = "jsonschema" 
DEPENDS = "python" 

SRC_URI = "svn://arda2/svn/pulse/ems_firmware/trunk;module=jsonschema;proto=http;rev=head"

S = "${WORKDIR}/jsonschema"
inherit distutils 

