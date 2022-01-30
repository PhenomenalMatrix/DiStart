package com.mrflaitx.distart.example1

class Activity {
//    не есть хорошо(из-за того что активити сама запрашивает зависимость от компонента)
//    val computer: Computer = Component().getComputer()

    // для присваивание значение извне
    lateinit var computer: Computer
    //Exaple keyBoard
    lateinit var keyboard: Keyboard

    //onCreate
    init {
        Component().inject(this)
    }

}
