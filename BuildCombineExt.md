Build !CombineExt 
==================
When you've cloned the source code:

```
#!sh
git clone git://sems.uni-rostock.de/combine-ext
```

There are two supported options to build this project:

* [Build with Maven](//BuildCombineExt#BuildwithMaven)
* [Build with Ant](//BuildCombineExt#BuildwithAnt)



Build with Maven 
-----------------
[Maven](https://maven.apache.org/) is a build automation tool. We ship a [source:pom.xml pom.xml] together with the sources which tells maven about versions and dependencies. Thus, maven is able to resolve everything on its own and, in order to create the library, all you need to call is ```mvn package```:

```
#!sh
usr@srv $ mvn package

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running de.unirostock.sems.cbext.TestFormats
Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.095 sec

Results :

Tests run: 2, Failures: 0, Errors: 0, Skipped: 0

```

That done, you'll find the binaries in the ```target``` directory.

Build with Ant 
---------------
[Ant](https://ant.apache.org/) is an Apache tool for automating software build processes. There is a [source:build.xml build.xml] file included in the source code that tells ant what to do. Since ant is not able to resolve the dependencies you need to create a directory ```lib``` containing the following libraries:
* [BFLog](http://bin.sems.uni-rostock.de/BFLog/)

We defined multiple targets in the ```build.xml`. They can be displayed by calling `ant -p```:

```
#!sh
usr@srv $ ant -p
Buildfile: /path/to/CombineExt/build.xml

        Extensions for COMBINE

Main targets:

 clean    clean up
 compile  compile the source
 dist     generate the distribution
 init     initialize workspace
 sign     sign a dist
Default target: dist
```

* ```clean up``` will delete all compiled files and produced libraries
* ```compile``` compiles the source code
* ```dist``` bundles all compiled binaries into a jar library

For example, to create the jar library just run ```ant dist```:

```
#!sh
usr@srv $ ant dist
Buildfile: /path/to/CombineExt/build.xml

init:

compile:
    [javac] Compiling 3 source files to /path/to/CombineExt/build

dist:
      [jar] Building jar: /path/to/CombineExt/dist/CombineExt-0.2.jar
      [jar] Building jar: /path/to/CombineExt/dist/CombineExt-0.2-fat.jar

BUILD SUCCESSFUL
```

