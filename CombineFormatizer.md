CombineFormatizer 
===================
The CombineFormatizer contains methods to obtain format URIs for certain file types.

* see [Formatizer class](https://github.com/SemsProject/CombineExt/blob/master/src/main/java/de/unirostock/sems/cbext/Formatizer.java)
* [JavaDoc](http://jdoc.sems.uni-rostock.de/CombineExt/de/unirostock/sems/cbext/Formatizer.html)

About Formats 
--------------

Within the COMBINE community, file formats are usually expressed as URIs, e.g. in combinearchive:wiki. That is, an SBML file may for example be of format `http://identifiers.org/combine.specifications/sbml`. This often makes things extra complicated and, thus, we developed the CombineFormatizer.

Getting Formats 
----------------

The [Formatizer class](https://github.com/SemsProject/CombineExt/blob/master/src/main/java/de/unirostock/sems/cbext/Formatizer.java) provides some methods to retrieve a format given a file:

### Get Format given a File Extension 

If you just have a file extension you may pass it to `Formatizer.getFormatFromExtension (String)` [JavaDoc](http://jdoc.sems.uni-rostock.de/CombineExt/de/unirostock/sems/cbext/Formatizer.html/#getFormatFromExtension(java.lang.String)):

```java
File f = ...
String extension = f.getName ().substring (f.getName ().lastIndexOf (".") + 1);
URI format = Formatizer.getFormatFromExtension (extension);
```

That is obviously not the best method, but it might be a good start.

### Get Format given a Media Type 

The CombineFormatizer is also able to guess formats from media types using `Formatizer.getFormatFromMime (String)` [JavaDoc](http://jdoc.sems.uni-rostock.de/CombineExt/de/unirostock/sems/cbext/Formatizer.html/#getFormatFromMime(java.lang.String)):

```java
File f = ...
String mime = Files.probeContentType (f.toPath ());
URI format = Formatizer.getFormatFromMime (mime);
```

### Guess the Format 

You can also pass a file object to `Formatizer.guessFormat (File)` [JavaDoc](http://jdoc.sems.uni-rostock.de/CombineExt/de/unirostock/sems/cbext/Formatizer.html/#guessFormat(java.io.File)):

```java
File f = ...
URI format = Formatizer.guessFormat (f);
```

Extend the Formatizer with your formats 
----------------------------------------

To learn how to extend the Formatizer to also recognize other file types see [ExtendCombineFormatizer](ExtendCombineFormatizer).
