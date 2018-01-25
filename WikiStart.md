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
* include the project via Maven:

```xml
<dependency>
    <groupId>de.uni-rostock.sbi</groupId>
    <artifactId>CombineExt</artifactId>
    <version>$VERSION</version>
</dependency>
```

 ([find latest version on Maven Central](http://search.maven.org/#search%7Cga%7C1%7Cg%3A%22de.uni-rostock.sbi%22%20AND%20a%3A%22CombineExt%22)

* see above (parts of this project) to learn how to use this package

DEV 
----

* [JavaDoc](http://jdoc.sems.uni-rostock.de/CombineExt/)
* [BuildCombineExt](BuildCombineExt)
* find open bugs/issues and requests at [GitHub](https://github.com/SemsProject/maven-repository/issues)
