package com.devmuyiwa.chatapp.domain.model.pager.calls

data class Call(
    val contactID: String,
    val contactImage: String,
    val contactName: String,
    val callType: String,
    val callDate: String
)
