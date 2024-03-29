plugins {
    id(BuildPlugins.ANDROID_APPLICATION).version(BuildDependencyVersions.ANDROID_VERSION).apply(false)
    id(BuildPlugins.ANDROID_KOTLIN).version(BuildDependencyVersions.KOTLIN_VERSION).apply(false)
    id(BuildPlugins.ANDROID_LIBRARY).version(BuildDependencyVersions.ANDROID_VERSION).apply(false)
    id(BuildPlugins.KOTLIN_PLUGIN_SERIALIZATION).version(BuildDependencyVersions.PLUGIN_SERIALIZATION_VERSION).apply(false)
}