package com.radziowojak.plantreningowy

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_import_export.*
import java.io.File
import android.os.Environment
import android.widget.Toast




class ImportExportActivity : AppCompatActivity() {
    /* Checks if external storage is available for read and write */
    /*fun isExternalStorageWritable(): Boolean {
        return Environment.getExternalStorageState() == Environment.MEDIA_MOUNTED
    }

    /* Checks if external storage is available to at least read */
    fun isExternalStorageReadable(): Boolean {
        return Environment.getExternalStorageState() in
                setOf(Environment.MEDIA_MOUNTED, Environment.MEDIA_MOUNTED_READ_ONLY)
    }*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_import_export)

        export_btn.setOnClickListener {
            /*val root = Environment.getExternalStorageDirectory()
            Toast.makeText(this@ImportExportActivity,  "External file system root:  $root", Toast.LENGTH_LONG).show()
            val dir = File(root.absolutePath + "/")
            dir.mkdirs()
            val file = File(dir, "myData.txt")
            Toast.makeText(this@ImportExportActivity,  "dir.exists():  ${dir.exists()}", Toast.LENGTH_LONG).show()*/
            /*val file = File(Environment.DIRECTORY_DOWNLOADS,"statystyki.txt")
            var success = true
            if (!file.exists())
                success = file.mkdir()
            if (success)
            {
                // directory exists or already created
                try {
                    // response is the data written to file
                    file.printWriter().use { out ->
                        out.println("First line")
                        out.println("Second line")
                    }
                    Toast.makeText(this@ImportExportActivity,  "Zapisano w ${file}!", Toast.LENGTH_LONG).show()
                } catch (e: Exception) {
                    // handle the exception
                    Toast.makeText(this@ImportExportActivity,  "Wystąpił problem! e:${e}", Toast.LENGTH_LONG).show()
                }
            }
            else
            {
                // directory creation is not successful
                Toast.makeText(this@ImportExportActivity,  "Wystąpił problem!", Toast.LENGTH_LONG).show()
            }*/
        }
    }
}
