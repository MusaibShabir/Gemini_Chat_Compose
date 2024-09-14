package com.example.geminichatcompose.gemini.chat.components

import java.util.UUID

enum class Participant {
    USER, GEMINI, ERROR
}

data class ChatMessage(
    val id: String = UUID.randomUUID().toString(),
    var text: String? = "",
    val participant: Participant = Participant.USER,
    var isPending: Boolean = false
)
