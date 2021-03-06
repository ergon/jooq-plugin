package com.revolut.jooq

import org.gradle.api.Plugin
import org.gradle.api.Project

open class JooqDockerPlugin : Plugin<Project> {

    override fun apply(project: Project) {
        project.extensions.create("jooq", JooqExtension::class.java, project.name)
        project.configurations.create("jdbc")
        project.tasks.create("generateJooqClasses", GenerateJooqClassesTask::class.java) {
            group = "jooq"
        }
    }
}