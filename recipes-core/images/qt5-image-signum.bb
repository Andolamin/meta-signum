SUMMARY = "A Qt5 image with all modules from meta-qt5"

LICENSE = "MIT"

include recipes-core/images/rpi-basic-image.bb

inherit core-image

IMAGE_FEATURES += "\
    package-management \
    ssh-server-openssh \
    "

IMAGE_INSTALL += "\
    gstreamer1.0-meta-base \
    gstreamer1.0-meta-video \
    gstreamer1.0-plugins-bad-fbdevsink \
    gstreamer1.0-plugins-bad-mpegpsdemux \
    hidrawtouch \
    kernel-modules \
    ntp \
    ntpdate \
    openssh-sftp-server \
    packagegroup-qt5-base \
    packagegroup-qt5-extra \
    packagegroup-qt5-fonts \
    packagegroup-qt5-graphics \
    packagegroup-qt5-web \
    quickews \
    quicknetwork \
    signum \
    tzdata \
    "
