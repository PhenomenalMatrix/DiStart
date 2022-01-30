package com.mrflaitx.distart.example1

class Activity {

    //Научимся inject-ить обычнай класс в котором нет ничего в конструкторе
    lateinit var keyboard: Keyboard

    //onCreate
    init {
        Component().inject(this)
    }

}

// Для чего используем DI если можно все в ручную ?
// библиотеки сами сосздают код (под капотом) на достаточно обьявить соотв интерфейсы
