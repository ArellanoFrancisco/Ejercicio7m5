package com.example.ejercicio7m5.Presenter

interface PasswordInterface {
    interface View {
        fun Actualizarfortaleza(strength: Int)
    }

    interface Presenter {
        fun EscribiendoPass(password: String)
    }

}