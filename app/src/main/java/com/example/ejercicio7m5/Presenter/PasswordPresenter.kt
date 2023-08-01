package com.example.ejercicio7m5.Presenter

import com.example.ejercicio7m5.Model.PasswordChecker

class PasswordPresenter(private val view: PasswordInterface.View) : PasswordInterface.Presenter {

    private val passwordChecker = PasswordChecker()

    override fun EscribiendoPass(password: String) {

        val strength = passwordChecker.calcularFortaleza(password)
        view.Actualizarfortaleza(strength)

    }


}