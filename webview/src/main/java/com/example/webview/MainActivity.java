package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.TargetApi;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = findViewById(R.id.webViewElement);
        webView.setWebViewClient(new MyWebViewClient());
        webView.loadUrl("http://polcol.ru/");
        webView.getSettings().setJavaScriptEnabled(true);
    }
    @Override
    public void onBackPressed(){
        if (webView.canGoBack()) {
            webView.goBack();
        }
        else onBackPressed();
    }
    private class MyWebViewClient extends WebViewClient {
        @TargetApi(Build.VERSION_CODES.N)
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request){
            view.loadUrl(request.getUrl().toString());
            return true;
        }
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url){
            if(Uri.parse(url).getHost().length() == 0){
                return false;
            }
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            view.getContext().startActivity(intent);
            //view.loadUrl(url);
            return true;
        }
    }
}