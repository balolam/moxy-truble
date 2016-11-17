package com.balolam.moxyreleasecompiletruble

import android.text.TextUtils
import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter

@InjectViewState
class MvpHelloPresenter(private val name: String) : MvpPresenter<MvpHelloView>() {

    companion object {
        const val TAG = "MvpHelloPresenter_TAG"
        const val ID = "MvpHelloPresenter_ID"
    }

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()

        if (TextUtils.isEmpty(name)) {
            viewState.setMessage("Ooops!")
        } else {
            viewState.setMessage("Hello $name!!!")
        }
    }
}