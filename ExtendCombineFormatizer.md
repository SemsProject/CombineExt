Extend the Formatizer to Recognize further Types of Files 
==========================================================
The /CombineFormatizer maintains a list of recognizers which are able to recognize certain file types, see ```List<FormatRecognizer> recognizerList``` in /src/main/java/de/unirostock/sems/cbext/Formatizer.java​​ 

Extending the List of Recognizers 
----------------------------------
* to extend the Formatizer you can simply pass another recognizer to the method ```Formatizer.addFormatRecognizer (FormatRecognizer recognizer)```
* every Recognizer needs to extend the ```FormatRecognizer``` class, see /src/main/java/de/unirostock/sems/cbext/FormatRecognizer.java
* there are a few recognizers added by default, see /src/main/java/de/unirostock/sems/cbext/recognizer
 * [Bio/PaxRecognizer](/src/main/java/de/unirostock/sems/cbext/recognizer//BioPaxRecognizer.java) is able to recognize !BioPax files
 * [Cell/MlRecognizer](/src/main/java/de/unirostock/sems/cbext/recognizer//CellMlRecognizer.java) is able to recognize CellML files
 * [SbgnRecognizer](/src/main/java/de/unirostock/sems/cbext/recognizer//SbgnRecognizer.java) is able to recognize SBGN files
 * [SbmlRecognizer](/src/main/java/de/unirostock/sems/cbext/recognizer//SbmlRecognizer.java) is able to recognize SBML files
 * [SbolRecognizer](/src/main/java/de/unirostock/sems/cbext/recognizer//SbolRecognizer.java) is able to recognize SBOL files
 * [Sed/MlRecognizer](/src/main/java/de/unirostock/sems/cbext/recognizer//SedMlRecognizer.java) is able to recognize SED-ML files
 * [DefaultRecognizer](/src/main/java/de/unirostock/sems/cbext/recognizer//DefaultRecognizer.java) is a fallback to recognize files by there mime type or extension
* every recognizer has a **priority**
* the default reconizer has a priority of 100:
 * if you want your recognizer to be asked first give it a higher priority
 * the priorities of recognizers shipped with this library 
 * you can change the priority of a recognizer, for example if you know that there are mainly SBML files in your project:
  * ```SbmlRecognizer.priority = 200```
  * afterwards you **must** resort the recognizers of the Formatizer using ```Formatizer.resortRecognizers ()```
* you can remove all recognizers using ```Formatizer.removeRecognizers ()```
* you can add all default recognizers using ```Formatizer.addDefaultRecognizers ()```

Extending the !FormatRecognizer class 
--------------------------------------
The abstract class has 4 functions that you need to implement:

* ```int getPriority ()``` must return a positive priority. Default recognizers have a priority of 100. Recognizers with a higher priority are asked first for a format. The first who knows a format wins this competition.
* ```URI getFormatByParsing (File file, String mimeType)``` you'll get a files and it's mime type, try to identify it's format by looking into the file
* ```URI getFormatFromMime (String mime)``` you'll get the mime type of a file, try to identify it's format
* ```URI getFormatFromExtension (String extension)``` you'll get the extension of a file, try to identify it's format

* The format must always be a URI and should be an *identifiers.org* URL, or, if that does not exist, a *purl.org* url.
* If you can't identify a format unambiguously you should return ```null``` and the next recognizer will be asked

An example of an extension can be found at http://sems.uni-rostock.de/trac/combine-ext-pharmml/wiki//src/main/java/de/unirostock/sems/cbext/pharmml/PharmMlRecognizer.java
There the Formatizer was extended to also recognize PharmML files.