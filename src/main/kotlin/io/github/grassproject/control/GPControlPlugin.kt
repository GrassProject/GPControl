package io.github.grassproject.control

import io.github.grassproject.control.module.*
import io.github.grassproject.framework.core.GPPlugin

class GPControlPlugin : GPPlugin() {

    private val modules = listOf(
        FarmProtectModule(),
        JoinQuitMessageModule(),
        FrostWalkerModule()
    )

    override fun load() {}

    override fun enable() {
        saveDefaultConfig()
        reloadConfig()

        modules.forEach { module ->
            if (config.getBoolean("modules.${module.name}", true)) {
                module.apply(this)
                logger.info("${module.name} module enabled")
            }
        }

    }

    override fun disable() {}
}