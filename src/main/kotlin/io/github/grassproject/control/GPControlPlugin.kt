package io.github.grassproject.control

import io.github.grassproject.control.module.ModuleHandler
import io.github.grassproject.framework.core.GPPlugin

class GPControlPlugin : GPPlugin() {

    override fun load() {}

    override fun enable() {
        saveDefaultConfig()

        ModuleHandler.modules.forEach { module ->
            if (config.getBoolean("modules.${module.name}", false)) {
                module.apply(this)
                logger.info("${module.name} module enabled")
            }
        }
    }

    override fun disable() {}
}