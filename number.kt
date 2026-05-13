package com.example.tapcountergame // change to your package name

import android.os.Bundle
import android.os.CountDownTimer
import android.view.MotionEvent
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat

class MainActivity : AppCompatActivity() {

    private lateinit var scoreText: TextView
    private lateinit var timerText: TextView
    private lateinit var gameOverText: TextView

    private var score = 0
    private var gameActive = true
    private var timer: CountDownTimer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        scoreText = findViewById(R.id.scoreText)
        timerText = findViewById(R.id.timerText)
        gameOverText = findViewById(R.id.gameOverText)

        val gameContainer = findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.gameContainer)

        // Start game on first touch
        gameContainer.setOnTouchListener { _, _ ->
            if (gameActive) {
                score++
                scoreText.text = "Score: $score"
            } else {
                // If game over, restart on tap
                if (!gameActive && timer?.cancelled == true) {
                    resetAndStartGame()
                }
            }
            true
        }

        resetAndStartGame()
    }

    private fun resetAndStartGame() {
        gameActive = true
        score = 0
        scoreText.text = "Score: 0"
        timerText.text = "Time: 10"
        gameOverText.visibility = TextView.GONE
        gameOverText.text = ""

        timer?.cancel()
        timer = object : CountDownTimer(10000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                val secondsLeft = millisUntilFinished / 1000
                timerText.text = "Time: $secondsLeft"
            }

            override fun onFinish() {
                gameActive = false
                timerText.text = "Time: 0"
                gameOverText.text = "Game Over! Final Score: $score\nTap to replay"
                gameOverText.visibility = TextView.VISIBLE
            }
        }.start()
    }

    override fun onDestroy() {
        super.onDestroy()
        timer?.cancel()
    }
}