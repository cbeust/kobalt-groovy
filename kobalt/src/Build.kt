
import com.beust.kobalt.plugin.packaging.assemble
import com.beust.kobalt.plugin.publish.bintray
import com.beust.kobalt.project

val project = project {
    name = "kobalt-groovy"
    group = "com.beust"
    artifactId = name
    version = "0.3"

    dependencies {
        compile("com.beust:kobalt-plugin-api:")
    }

    assemble {
        mavenJars {
        }
    }

    bintray {
        publish = true
    }

}

