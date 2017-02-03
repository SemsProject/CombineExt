Extensions for COMBINE projects 
================================

Here we collect some useful resources and other stuff, especially useful for the [COMBINE community](http://co.mbine.org/).

Parts of this Repository 
-------------------------

* [CombineIconizer](CombineIconizer): get icons for certain file types associated with COMBINE
* [CombineFormatizer](CombineFormatizer): generate format URLs from certain file types associated with COMBINE

* This library can easily be extended:
 * see [Extend CombineFormatizer](ExtendCombineFormatizer)
 * see [Extend CombineIconizer](ExtendCombineIconizer)

Download and Use 
-----------------

* Binaries are available from our binary repository, or see [build instructions](BuildCombineExt)
* include the project via Maven: ([find latest version id](https://github.com/SemsProject/maven-repository/tree/releases/de/unirostock/sems/CombineExt), import the [SEMS Maven repository](https://sems.uni-rostock.de/2013/10/maven-repository/))

```xml
<dependency>
    <groupId>de.unirostock.sems</groupId>
    <artifactId>CombineExt</artifactId>
    <version>$VERSION</version>
</dependency>
```

* see above (parts of this project) to learn how to use this package

DEV 
----

* [JavaDoc](http://jdoc.sems.uni-rostock.de/CombineExt/)
* [BuildCombineExt](BuildCombineExt)
* find open bugs/issues and requests at [GitHub](https://github.com/SemsProject/maven-repository/issues)
