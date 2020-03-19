package ru.evtukhov.profile

import ru.evtukhov.profile.model.Profile

fun main() {
    val profile = Profile(10, "ivanivanov@domain.com", "Ivan", "Ivanov", "student", "/images/ivan.png")
    print(profile.fullname)
}