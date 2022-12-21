package com.example.demogradletheme

import com.intellij.ide.AppLifecycleListener
import com.intellij.ide.ui.UISettings
import com.intellij.openapi.project.Project
import com.intellij.openapi.startup.StartupActivity

class DummyStartup: AppLifecycleListener, StartupActivity {
    override fun welcomeScreenDisplayed() {
        UISettings.getInstance().showMainToolbar = false
        println("Screen displayed!")
    }

    override fun runActivity(project: Project) {
        println("started up!")
    }
}