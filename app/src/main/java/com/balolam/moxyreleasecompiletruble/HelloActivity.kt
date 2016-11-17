package com.balolam.moxyreleasecompiletruble

import android.os.Bundle
import com.arellomobile.mvp.MvpActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.PresenterType
import com.arellomobile.mvp.presenter.ProvidePresenter
import kotlinx.android.synthetic.main.activity_hello.*

class HelloActivity : MvpActivity(), MvpHelloView {

    /*
     * Если убрать комментарий - Presenter не будет проинициализирован...
     */
    @InjectPresenter(type = PresenterType.LOCAL /* ,tag = MvpHelloPresenter.TAG */)
    lateinit var presenter: MvpHelloPresenter

    @Suppress("unused")
    @ProvidePresenter(type = PresenterType.LOCAL)
    fun createPresenter() = MvpHelloPresenter(intent.extras.getString("name"))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)
    }

    override fun setMessage(message: String) {
        messageTextView.text = message
    }
}
