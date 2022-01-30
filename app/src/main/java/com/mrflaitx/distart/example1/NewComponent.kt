package com.mrflaitx.distart.example1

import dagger.Component

@Component
interface NewComponent {
    fun inject(activity: Activity)

}