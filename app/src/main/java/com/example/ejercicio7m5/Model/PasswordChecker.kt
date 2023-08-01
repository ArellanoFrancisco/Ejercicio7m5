package com.example.ejercicio7m5.Model

class PasswordChecker {

    fun calcularFortaleza(password: String): Int {
        val length = password.length

        if (length < 6) {
            return 0 // Contraseña débil
        }

        var hasUpperCase = false
        var hasLowerCase = false
        var hasNumber = false

        for (char in password) {
            when {
                char.isUpperCase() -> hasUpperCase = true
                char.isLowerCase() -> hasLowerCase = true
                char.isDigit() -> hasNumber = true
            }
        }

        if (hasUpperCase && hasLowerCase && hasNumber) {
            return 2 // Contraseña fuerte
        }

        return 1 // Contraseña media
    }

}