package io.github.grassproject.control.module

import org.bukkit.Material
import org.bukkit.event.EventHandler
import org.bukkit.event.block.Action
import org.bukkit.event.entity.EntityInteractEvent
import org.bukkit.event.player.PlayerInteractEvent

class FarmProtectModule : ModuleHandler("farm-protect") {

    @EventHandler
    fun EntityInteractEvent.on() {
        if (block.type == Material.FARMLAND) isCancelled = true
    }

    @EventHandler
    fun PlayerInteractEvent.on() {
        if (action == Action.PHYSICAL && clickedBlock?.type == Material.FARMLAND)
            isCancelled = true
    }
}