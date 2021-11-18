package com.example.actividadnavdreawercesar;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class webcomponente extends AppCompatActivity {
    WebView wv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_webcomponent);

        wv1 = (WebView)findViewById(R.id.webView);

        String URL = getIntent().getStringExtra("SitioWeb");
        wv1.setWebViewClient(new WebViewClient());
        wv1.loadUrl("http://" + URL);
    }

    public void Retornar(View view) {
        finish();
    }
}

