package io.github.grassproject.control.module

import org.bukkit.event.EventHandler
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.event.player.PlayerQuitEvent

class JoinQuitMessageModule : ModuleHandler("join-quit-message") {

    @EventHandler
    fun PlayerJoinEvent.on() {
        joinMessage(null)
    }

    @EventHandler
    fun PlayerQuitEvent.on() {
        quitMessage(null)
    }
}