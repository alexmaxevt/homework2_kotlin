package ru.evtukhov.profile.model

class Profile  (
    var id: Int = 0,
    var login: String = "",
    var name: String = "",
    var surname: String = "",
    var status: String = "",
    var linkImage: String = ""
){
    val fullname: String
        get() {
            return "$name $surname"
        }
}