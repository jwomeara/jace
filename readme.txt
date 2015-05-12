Jace 1.3.0

Requires
--------
GCC/MSVC++
Boost
JDK

Build & Install
---------------

# generate sources only
mvn install -Dsources

# generate sources and platform specific binaries
mvn install -P <platform*>

* Run "mvn help:all-profiles" to list available build platforms
