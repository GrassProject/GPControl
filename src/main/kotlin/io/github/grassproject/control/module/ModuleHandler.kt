package io.github.grassproject.control.module

import io.github.grassproject.framework.core.GPPlugin
import org.bukkit.event.Listener

abstract class ModuleHandler(val name: String) : Listener {

    companion object {
        val modules = mutableListOf<ModuleHandler>()
    }

    init {
        modules.add(this)
    }

    open fun apply(plugin: GPPlugin) {
        plugin.registerListener(this)
    }
}