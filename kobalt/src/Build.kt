
import com.beust.kobalt.plugin.packaging.assemble
import com.beust.kobalt.plugin.publish.bintray
import com.beust.kobalt.project

val project = project {
    name = "kobalt-groovy"
    group = "com.beust"
    artifactId = name
    version = "0.4"

    dependencies {
        compile("com.beust:kobalt-plugin-api:0.878")
    }

    assemble {
        mavenJars {
        }
    }

    bintray {
        publish = true
    }

}

