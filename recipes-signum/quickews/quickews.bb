SUMMARY = "QML bindings for EWS"

DESCRIPTION = "Qt Declarative plugin providing EWS API to QML applications."

HOMEPAGE = "https://github.com/kovrov/quickews"

LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://${WORKDIR}/COPYING;md5=a6f89e2100d9b6cdffcea4f398e37343"

DEPENDS += "qtbase qtdeclarative"

inherit qmake5

SRC_URI = "git://github.com/kovrov/quickews.git;protocol=https \
           file://COPYING \
"

SRCREV = "8e9333a7ccc346642acaebf4ec245714db37d771"

PV = "0.1+git${SRCPV}"
S = "${WORKDIR}/git/"

FILES_${PN} += "${OE_QMAKE_PATH_QML}/EWS/"
FILES_${PN}-dbg += "${OE_QMAKE_PATH_QML}/EWS/.debug/"
