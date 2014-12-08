package de.kasoki.bigohandroid

import org.scaloid.common._
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.webkit.WebView

class MainActivity extends SActivity {

    private var webview:WebView = null

    override def onCreate(bundle:Bundle) {
        super.onCreate(bundle);

        this.setContentView(R.layout.activity_main)

        webview = findViewById(R.id.webview).asInstanceOf[WebView]

        val settings = webview.getSettings()
        settings.setJavaScriptEnabled(true)
        settings.setDomStorageEnabled(true)
        settings.setDatabaseEnabled(true)

        settings.setDatabasePath("/data/data/de.kasoki.bigohandroid/databases/")

        webview.loadUrl("file:///android_asset/index.html")

    }

    override def onCreateOptionsMenu(menu:Menu):Boolean = {
        // Inflate the menu; this adds items to the action bar if it is present.
        // this.getMenuInflater().inflate(R.menu.main, menu)
        return true;
    }

    override def onOptionsItemSelected(item:MenuItem):Boolean = {
        val id = item.getItemId()

        return super.onOptionsItemSelected(item);
    }

    override def onSaveInstanceState(instance:Bundle) {
        super.onSaveInstanceState(instance)

        webview.saveState(instance)
    }

    override def onRestoreInstanceState(instance:Bundle) {
        super.onRestoreInstanceState(instance)

        webview.restoreState(instance)
    }
}
