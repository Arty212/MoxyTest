package com.example.arturbaboskin.moxytest

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter

@InjectViewState
class LoginPresenter : MvpPresenter<LoginView>() {
    fun startLogin() {
        viewState.login()
        APIHelper.login { viewState.ok() }
    }
}