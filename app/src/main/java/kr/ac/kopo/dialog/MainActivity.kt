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
            // 체크박스 목록 대화상자
            var palceArr = arrayOf("싱가포르", "대만", "뉴욕")
            var selectArr = booleanArrayOf(false, false, true)
            var dialog = AlertDialog.Builder(this@MainActivity)

            dialog.setTitle("좋아하는 관광지")
            dialog.setIcon(R.drawable.dialogo)
            dialog.setMultiChoiceItems(palceArr, selectArr) { d1, which, isChecked ->
                btnDialog.text = palceArr[which]
            }
            dialog.setPositiveButton("닫기", null)
            dialog.show()
        }
    }
}