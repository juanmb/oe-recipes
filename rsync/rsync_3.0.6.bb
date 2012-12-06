require rsync.inc

SRC_URI += "\
  file://m4.patch \
  file://rsyncd.conf \
  file://rsyncd.users \
  file://rsync \
"
# The source tarball from 3.0.6 seems to need this
do_configure_append(){
  oe_runmake reconfigure
}

do_install_append() {
	install -d ${D}/etc
	install -d ${D}/etc/init.d
	install -m 0644 ${WORKDIR}/rsyncd.conf ${D}/etc
	install -m 0600 ${WORKDIR}/rsyncd.users ${D}/etc
	install -m 0755 ${WORKDIR}/rsync ${D}/etc/init.d
}


pkg_postinst() {
    update-rc.d rsync defaults 90
}

pkg_postrm() {
    update-rc.d rsync remove
}

SRC_URI[md5sum] = "e9865d093a18e4668b9d31b635dc8e99"
SRC_URI[sha256sum] = "33cc969364cb66b3e345fa7db2c651a8e07de0e58743ec03899c4ba86953e1b3"
