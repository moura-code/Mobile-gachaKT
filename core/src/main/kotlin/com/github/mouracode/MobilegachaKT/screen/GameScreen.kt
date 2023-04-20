package com.github.mouracode.MobilegachaKT.screen

import com.badlogic.gdx.graphics.g2d.Batch
import com.github.mouracode.MobilegachaKT.Main
import ktx.app.KtxScreen

abstract class GameScreen(val game: Main,val batch: Batch = game.batch): KtxScreen
