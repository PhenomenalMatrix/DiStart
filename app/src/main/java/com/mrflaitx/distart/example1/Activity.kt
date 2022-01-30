package com.mrflaitx.distart.example1

import javax.inject.Inject

class Activity {

    //private не можем сделать так как обращаемся к этому классу в мейн
    //если бы не было то private
//    val daggerComp = DaggerNewComponent.create()
//     val keyboard: Keyboard = daggerComp.getKeyboard()
//    val mouse: Mouse = daggerComp.getMouse()
    @Inject
    lateinit var keyboard: Keyboard

    @Inject
    lateinit var mouse: Mouse

    init {
        DaggerNewComponent.create().inject(this)
    }
}

// Для чего используем DI если можно все в ручную ?
// библиотеки сами сосздают код (под капотом) на достаточно обьявить соотв интерфейсы
