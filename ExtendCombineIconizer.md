Extend the Iconizer to provide icons for further Formats 
=========================================================

The CombineIconizer maintains a list of icon collections which provide icons for certain file formatas, see `List<IconCollection> iconCollectionsList` in [`/src/main/java/de/unirostock/sems/cbext/Iconizer.java`](https://github.com/SemsProject/CombineExt/tree/master/src/main/java/de/unirostock/sems/cbext/Iconizer.java)


Extending the List of Icon Collections 
---------------------------------------

* to extend the Iconizer you can simply pass another recognizer to the method `Iconizer.addIconCollection (IconCollection collection)`
* every icon collection needs to extend the `IconCollection` class, see [`/src/main/java/de/unirostock/sems/cbext/IconCollection.java`](https://github.com/SemsProject/CombineExt/tree/master/src/main/java/de/unirostock/sems/cbext/IconCollection.java)
* there is a default icon collection, see [`/src/main/java/de/unirostock/sems/cbext/collections/DefaultIconCollection.java`](https://github.com/SemsProject/CombineExt/tree/master/src/main/java/de/unirostock/sems/cbext/collections/DefaultIconCollection.java)
* every icon collection has a **priority**
* the default icon collection has a priority of 100:
  * if you want your icon collection to be asked first give it a higher priority
* you can remove all icon collections using `Iconizer.removeCollections ()`
* you can add the default icon collection using `Iconizer.addDefaultCollection ()`

Extending the IconCollection class 
------------------------------------

The abstract class has 4 functions that you need to implement:

* `int getPriority ()` must return a positive priority. Default icon collections have a priority of 100. Icon collections with a higher priority are asked first for an icon. The first who provides an icon given a format wins this competition.
* `URL formatToIconUrl (URI format)` you'll get a format and you're asked to return the URL to an icon
* `InputStream formatToIconStream (URI format)` you'll get a format and you're asked to return a stream delivering the icon
* `String formatToIconName (URI format)` you'll get a format and you're asked to return the icon's name. That's useful if the client has the icons somewhere else unpacked (e.g. for web servers etc.)


* The format will always be an URI and should be an *identifiers.org* URL, or, if that does not exist, a *purl.org* url.
* If you can't identify a format unambiguously you should return `null` and the next icon collection will be asked

An example of an extension can be found at [PharmMLRecognizer](https://github.com/SemsProject/CombineExt-PharmMl)
There the Iconizer was extended to also deliver a PharmML icon.
