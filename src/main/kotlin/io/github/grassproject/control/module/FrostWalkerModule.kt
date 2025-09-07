package io.github.grassproject.control.module

import org.bukkit.enchantments.Enchantment
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.block.EntityBlockFormEvent

class FrostWalkerModule : ModuleHandler("frost-walker") {

    @EventHandler
    fun EntityBlockFormEvent.on() {
        val player = entity as? Player ?: return
        val boots = player.inventory.armorContents.getOrNull(0)
        if (boots?.containsEnchantment(Enchantment.FROST_WALKER) == true) isCancelled = true
    }
}