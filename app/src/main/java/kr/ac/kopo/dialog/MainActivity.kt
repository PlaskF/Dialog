package kr.ac.kopo.dialog

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var btnDialog = findViewById<Button>(R.id.btnDialog)

        btnDialog.setOnClickListener {
            var dialog = AlertDialog.Builder(this@MainActivity)
            dialog.setTitle("안내메시지")
            dialog.setMessage("오늘은 목요일")
            dialog.setIcon(R.drawable.dialogo)
            dialog.setPositiveButton("확인") { dialog, which ->
                Toast.makeText(this@MainActivity,
                    "확인 버튼 클릭", Toast.LENGTH_SHORT).show()
            }
            dialog.show()
        }
    }
}