package com.mrflaitx.distart.example1

import javax.inject.Inject

//нужно сообщить дайгеру как способом соз кейбоард, есть несколько способов
//1ый способ иньексия через конструктор (то есть говорим дайгеру если нужен будет кейбоард создай
// его вызвав пустой конструктор)
class Keyboard @Inject constructor() {
}