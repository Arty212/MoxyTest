package com.example.arturbaboskin.moxytest

import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.arellomobile.mvp.MvpAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import com.arellomobile.mvp.presenter.InjectPresenter


class LoginActivity : MvpAppCompatActivity(), LoginView {

    @InjectPresenter
    lateinit var mPresenter: LoginPresenter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn.setOnClickListener { mPresenter.startLogin() }
    }

    override fun ok() {
        setProgress(false)
        Toast.makeText(applicationContext, "Все ок!", Toast.LENGTH_LONG).show()
    }

    override fun error() {
        setProgress(false)
        Toast.makeText(applicationContext, "Грусть, печаль =(", Toast.LENGTH_LONG).show()
    }

    override fun login() {
        setProgress(true)
    }

    private fun setProgress(flag: Boolean) {
        if (flag) {
            login.visibility = View.GONE
            progress.visibility = View.VISIBLE
        } else {
            login.visibility = View.VISIBLE
            progress.visibility = View.GONE
        }
    }
}
