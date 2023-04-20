package com.github.mouracode.MobilegachaKT

import com.badlogic.gdx.Application.LOG_DEBUG
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.g2d.Batch
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.github.mouracode.MobilegachaKT.screen.FirstScreen
import com.github.mouracode.MobilegachaKT.screen.GameScreen
import ktx.app.KtxGame
import ktx.log.logger

const val UNIT_SCALE = 1/16f
private val LOG = logger<Main>()
class Main : KtxGame<GameScreen>() {
    val batch :  Batch by lazy {  SpriteBatch()  }

    override fun create() {
        Gdx.app.logLevel = LOG_DEBUG
        LOG.debug { "Creating the games" }
        addScreen(FirstScreen(this))
        setScreen<FirstScreen>()
    }
}
