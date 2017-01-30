Extensions for COMBINE projects 
================================
Here we collect some useful resources and other stuff, especially useful for the [COMBINE community](http://co.mbine.org/).

Parts of this Repository 
-------------------------
* /CombineIconizer: get icons for certain file types associated with COMBINE
* /CombineFormatizer: generate format URLs from certain file types associated with COMBINE

* This library can easily be extended:
 * see /ExtendCombineFormatizer
 * see /ExtendCombineIconizer

Download and Use 
-----------------
* Binaries are available from our binary repository, or see /BuildCombineExt
* include the project via Maven: ([find latest version id](http://mvn.sems.uni-rostock.de/releases/de/unirostock/sems///CombineExt), import the [SEMS Maven repository](https://sems.uni-rostock.de/2013/10/maven-repository/))
```
#!xml
<dependency>
    <groupId>de.unirostock.sems</groupId>
    <artifactId>CombineExt</artifactId>
    <version>$VERSION</version>
</dependency>
```
* see above (parts of this project) to learn how to use this package

DEV 
----
* /src/main/java/de/unirostock/sems/cbext 
* [JavaDoc](http://jdoc.sems.uni-rostock.de///CombineExt/)
* /BuildCombineExt
* find open bugs/issues and requests: {1}
* file an issue or feature request: [None](/newticket)