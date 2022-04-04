package com.nisaardiyanti.activitylist
//nama package
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import javax.security.auth.login.LoginException

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//
        val btnLogin :Button = findViewById(R.id.btnLogin)
        btnLogin.setOnClickListener(this)
//setOnClickListener() akan dijalankan ketika pengguna mengklik loginButton

    }
//akan dilakukan sesuatu saat tombol di klik
    override fun onClick(v: View) {
       when(v.id){
           R.id.btnLogin ->{
               //variabel login dari class intent ,konfigurasi/parameter yang digunakan:
               //dari activity yang aktif sekarang (MainActivity ke class UtamaActivity )
               val login = Intent(this@MainActivity, UtamaActivity::class.java)
               startActivity(login)
           }

       }       }
}
