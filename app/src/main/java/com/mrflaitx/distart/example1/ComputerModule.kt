package com.mrflaitx.distart.example1

import dagger.Module
import dagger.Provides

@Module
class ComputerModule {
    @Provides
    fun provideMonitor(): Monitor{
        return Monitor()
    }
}

//Модуль - предоставляет зависимости в том случае если мы не можем наметить inject constr
