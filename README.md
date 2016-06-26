# Groovy plug-in for [Kobalt](http://github.com/cbeust/kobalt)

To use, import the plug-in and add the source directories to your build file:

```
val pl = plugins("com.beust:kobalt-groovy:")

val p = project {
    sourceDirectories {
        path("src/main/groovy")
    }

```
