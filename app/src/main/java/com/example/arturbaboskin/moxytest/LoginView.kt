package com.example.arturbaboskin.moxytest

import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.viewstate.strategy.SingleStateStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType

interface LoginView : MvpView {
    @StateStrategyType(SingleStateStrategy::class)
    fun login()

    @StateStrategyType(SingleStateStrategy::class)
    fun ok()

    @StateStrategyType(SingleStateStrategy::class)
    fun error()
}