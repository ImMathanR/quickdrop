enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
enableFeaturePreview("VERSION_CATALOGS")

rootProject.name = "quickdrop"

include(":app-android", ":app-desktop")

include(":ui:common")
include(":ui:welcome")

include(":domain:history")

include(":data:network")