plugins {
    id("featherpatcher") version "0.0.0.4"
}

patcher {
    this.datafolder(rootProject.projectDir.toPath())

    this.workspace("workspace")

    this.autoupdate(true)

    this.url("https://github.com/Vagdedes/SpartanAPI.git")
}
