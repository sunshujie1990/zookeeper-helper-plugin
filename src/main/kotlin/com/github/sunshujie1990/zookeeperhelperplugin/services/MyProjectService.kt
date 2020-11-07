package com.github.sunshujie1990.zookeeperhelperplugin.services

import com.intellij.openapi.project.Project
import com.github.sunshujie1990.zookeeperhelperplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
