package com.github.kright.simpleplugin

import org.gradle.api.Plugin
import org.gradle.api.Project;

/**
 * Created by lgor on 24.09.2016.
 */
class SimplePlugin implements Plugin<Project> {
    void apply(Project target) {
        target.task('hello', type: HelloTask)
    }
}
