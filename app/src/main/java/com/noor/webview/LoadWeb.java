package com.noor.webview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class LoadWeb extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_web);

        webView = (WebView) findViewById(R.id.webView);


        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setBuiltInZoomControls(true);

        String getData = getIntent().getExtras().getString("data");

        if (getData.equals("1")) {

            //location of html file
            webView.loadUrl("file:///android_asset/about.html");

        }


        if (getData.equals("2")) {

            //load website
            webView.loadUrl("http://www.facebook.com");
        }
    }

  //for back press load previous web pages
    public boolean onKeyDown(int keyCode,KeyEvent event)
    {
      if ((keyCode==KeyEvent.KEYCODE_BACK) && webView.canGoBack()) {
        webView.goBack();
          return true;

    }
        return super.onKeyDown(keyCode,event);
    }
    }

