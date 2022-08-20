package com.devmuyiwa.chatapp.domain.model.pager.chats

data class Chat(
    val contactID: String,
    val contactImage: String,
    val contactName: String,
    val timeOfLastMessage: String,
    val lastMessage: String
)