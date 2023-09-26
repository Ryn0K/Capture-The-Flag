package com.example.helloworld

import android.app.Activity
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import java.io.FileReader
import java.security.MessageDigest

class Filehasher : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val uri : String = intent.data?.path.toString()
        Log.i("MOBISEC", "Uri found $uri")
        val data = readFL(uri)
        Log.i("MOBISEC","Inside data : $data")
        val hash = createSHA256(data)
        Log.i("MOBISEC","SHA256 HASH : $hash")

        //sent data back to activity
        val resultIntent = intent
        resultIntent.putExtra("hash",hash)
        setResult(Activity.RESULT_OK,resultIntent)
        finish()
    }
    private fun readFL(path:String): String {
        val reader = FileReader(path)
        val txt =reader.readText()
        reader.close()
        return txt
    }
    private fun createSHA256(data: String): String {
        val md = MessageDigest.getInstance("SHA-256")
        return md.digest(data.toByteArray()).toHex()

    }
    private fun ByteArray.toHex(): String = joinToString(separator = "") { eachByte -> "%02x".format(eachByte) }
}