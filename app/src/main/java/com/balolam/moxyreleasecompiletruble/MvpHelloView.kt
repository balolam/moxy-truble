package com.balolam.moxyreleasecompiletruble

import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType

interface MvpHelloView : MvpView {

    @StateStrategyType(AddToEndSingleStrategy::class)
    fun setMessage(message: String)
}