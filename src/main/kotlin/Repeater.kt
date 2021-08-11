package me.asterism

import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescription
import net.mamoe.mirai.console.plugin.jvm.KotlinPlugin
import net.mamoe.mirai.event.GlobalEventChannel
import net.mamoe.mirai.event.events.MessageEvent
import net.mamoe.mirai.utils.info

object Repeater : KotlinPlugin(
    JvmPluginDescription(
        id = "me.asterism.repeater",
        name = "Repeater(Mirai-Console)",
        version = "1.0",
    ) {
        author("Asterism12")
        info("""A hello world project of Mirai-console""")
    }
) {
    override fun onEnable() {
        logger.info { "Plugin loaded" }
        GlobalEventChannel.subscribeAlways<MessageEvent> { event -> event.source.subject.sendMessage(event.message) }
    }
}