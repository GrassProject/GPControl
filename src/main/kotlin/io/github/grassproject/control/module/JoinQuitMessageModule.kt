package io.github.grassproject.control.module

import net.kyori.adventure.text.Component
import org.bukkit.event.EventHandler
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.event.player.PlayerQuitEvent

class JoinQuitMessageModule : ModuleHandler("join-quit-message") {

    @EventHandler
    fun PlayerJoinEvent.on() {
        joinMessage(Component.empty())
    }

    @EventHandler
    fun PlayerQuitEvent.on() {
        quitMessage(Component.empty())
    }
}