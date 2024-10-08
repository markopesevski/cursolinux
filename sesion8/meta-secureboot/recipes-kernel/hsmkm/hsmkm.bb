SUMMARY = "My Module"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

inherit module

SRC_URI = "file://Makefile \
           file://hsmkm.c \
           file://hsmkm.h \
          "

S = "${WORKDIR}"


do_install:append(){

	install hsmkm.h ${D}${includedir}
}

# The inherit of module.bbclass will automatically name module packages with
# "kernel-module-" prefix as required by the oe-core build environment.

RPROVIDES_${PN} += "kernel-module-hsmkm"
