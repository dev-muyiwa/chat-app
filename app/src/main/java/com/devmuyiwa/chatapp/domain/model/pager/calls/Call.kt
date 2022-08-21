package com.devmuyiwa.chatapp.domain.model.pager.calls

data class Call(
    val contactID: String,
    val contactImage: Int,
    val contactName: String,
    val callType: String,
    val callDate: String
)
