# Chapter 2 #
## Introducing Jace ##
### In 60 Seconds or Less ###

Jace is a C++ runtime library consisting of a single shared library named "jace"<sup>1</sup> and a set of Proxy and Peer code-generation tools: ProxyGenerator, BatchGenerator, AutoProxy, PeerEnhancer, and PeerGenerator. In addition to providing some useful utility functions for developers, The Jace Runtime Library (JRL) uses JNI to provide the basic services that the tool-generated Proxies and Peers require to run correctly. The generated Proxy classes allow developers to instantiate and manipulate live Java objects at runtime, just as if they were native C++ classes. The generated Peer classes provide an easy method for developers to implement native methods declared in their Java classes. The following diagram is a high-level overview of the relationships between a developer, the code-generating tools, and the JRL.

![http://wiki.jace.googlecode.com/hg/interaction.png](http://wiki.jace.googlecode.com/hg/interaction.png)

<sup>1</sup> For example, "jace.lib" on Windows or "libjace.so" on Unix.

<p align='right'><a href='Chapter1.md'>Previous</a> <a href='Chapter3.md'>Next</a></p>