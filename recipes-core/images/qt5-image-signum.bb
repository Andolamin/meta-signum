SUMMARY = "A Qt5 image with all modules from meta-qt5"

LICENSE = "MIT"

inherit core-image

IMAGE_FEATURES += "\
    package-management \
    splash \
    ssh-server-openssh \
    "

IMAGE_INSTALL += "\
    gstreamer1.0-meta-base \
    gstreamer1.0-meta-video \
    gstreamer1.0-plugins-bad-fbdevsink \
    gstreamer1.0-plugins-bad-mpegpsdemux \
    kernel-modules \
    openssh-sftp-server \
    packagegroup-qt5-base \
    packagegroup-qt5-extra \
    packagegroup-qt5-fonts \
    packagegroup-qt5-graphics \
    packagegroup-qt5-web \
    "
