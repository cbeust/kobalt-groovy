import com.beust.kobalt.*
import com.beust.kobalt.plugin.packaging.*
import com.beust.kobalt.plugin.kotlin.*
import com.beust.kobalt.plugin.publish.*

val project = project {
    name = "kobalt-groovy"
    group = "com.beust"
    artifactId = name
    version = "0.1"

    dependencies {
        compile("com.beust:kobalt-plugin-api:0.822")
    }

    assemble {
        mavenJars {
        }
    }

    bintray {
        publish = true
    }

}

