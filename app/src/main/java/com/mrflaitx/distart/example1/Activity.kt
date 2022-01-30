package com.mrflaitx.distart.example1

import javax.inject.Inject

class Activity {

    //Научимся inject-ить обычнай класс в котором нет ничего в конструкторе
    @Inject
    //Переменная должна быть паблик иначе дагер не сможет сам вставить
    lateinit var keyboard: Keyboard

    //onCreate
    init {
//        Component().inject(this)
        DaggerNewComponent.create().inject(this)
    }

}

// Для чего используем DI если можно все в ручную ?
// библиотеки сами сосздают код (под капотом) на достаточно обьявить соотв интерфейсы
