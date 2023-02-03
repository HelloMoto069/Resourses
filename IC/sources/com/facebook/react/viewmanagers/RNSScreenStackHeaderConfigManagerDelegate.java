package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface;

public class RNSScreenStackHeaderConfigManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & RNSScreenStackHeaderConfigManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    public RNSScreenStackHeaderConfigManagerDelegate(U u) {
        super(u);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v29, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v30, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v31, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v32, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v33, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v34, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v35, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v36, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setProperty(T r4, java.lang.String r5, java.lang.Object r6) {
        /*
            r3 = this;
            r5.hashCode()
            int r0 = r5.hashCode()
            r1 = 0
            r2 = -1
            switch(r0) {
                case -1822687399: goto L_0x0149;
                case -1799367701: goto L_0x013e;
                case -1774658170: goto L_0x0133;
                case -1715368693: goto L_0x0128;
                case -1503810304: goto L_0x011d;
                case -1225100257: goto L_0x0112;
                case -1217487446: goto L_0x0107;
                case -1094575123: goto L_0x00fc;
                case -962590849: goto L_0x00ee;
                case -389245640: goto L_0x00e0;
                case -140063148: goto L_0x00d2;
                case 347216: goto L_0x00c4;
                case 94842723: goto L_0x00b6;
                case 110371416: goto L_0x00a8;
                case 183888321: goto L_0x009a;
                case 243070244: goto L_0x008c;
                case 339462402: goto L_0x007e;
                case 490615652: goto L_0x0070;
                case 1038753243: goto L_0x0062;
                case 1287124693: goto L_0x0054;
                case 1324688817: goto L_0x0046;
                case 1518161768: goto L_0x0038;
                case 1564506303: goto L_0x002a;
                case 2029798365: goto L_0x001c;
                case 2099541337: goto L_0x000e;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0153
        L_0x000e:
            java.lang.String r0 = "topInsetEnabled"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0018
            goto L_0x0153
        L_0x0018:
            r2 = 24
            goto L_0x0153
        L_0x001c:
            java.lang.String r0 = "largeTitle"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0026
            goto L_0x0153
        L_0x0026:
            r2 = 23
            goto L_0x0153
        L_0x002a:
            java.lang.String r0 = "largeTitleHideShadow"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0034
            goto L_0x0153
        L_0x0034:
            r2 = 22
            goto L_0x0153
        L_0x0038:
            java.lang.String r0 = "titleFontSize"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0042
            goto L_0x0153
        L_0x0042:
            r2 = 21
            goto L_0x0153
        L_0x0046:
            java.lang.String r0 = "backTitle"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0050
            goto L_0x0153
        L_0x0050:
            r2 = 20
            goto L_0x0153
        L_0x0054:
            java.lang.String r0 = "backgroundColor"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x005e
            goto L_0x0153
        L_0x005e:
            r2 = 19
            goto L_0x0153
        L_0x0062:
            java.lang.String r0 = "hideBackButton"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x006c
            goto L_0x0153
        L_0x006c:
            r2 = 18
            goto L_0x0153
        L_0x0070:
            java.lang.String r0 = "largeTitleFontWeight"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x007a
            goto L_0x0153
        L_0x007a:
            r2 = 17
            goto L_0x0153
        L_0x007e:
            java.lang.String r0 = "hideShadow"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0088
            goto L_0x0153
        L_0x0088:
            r2 = 16
            goto L_0x0153
        L_0x008c:
            java.lang.String r0 = "backTitleFontFamily"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0096
            goto L_0x0153
        L_0x0096:
            r2 = 15
            goto L_0x0153
        L_0x009a:
            java.lang.String r0 = "backTitleFontSize"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x00a4
            goto L_0x0153
        L_0x00a4:
            r2 = 14
            goto L_0x0153
        L_0x00a8:
            java.lang.String r0 = "title"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x00b2
            goto L_0x0153
        L_0x00b2:
            r2 = 13
            goto L_0x0153
        L_0x00b6:
            java.lang.String r0 = "color"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x00c0
            goto L_0x0153
        L_0x00c0:
            r2 = 12
            goto L_0x0153
        L_0x00c4:
            java.lang.String r0 = "largeTitleFontFamily"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x00ce
            goto L_0x0153
        L_0x00ce:
            r2 = 11
            goto L_0x0153
        L_0x00d2:
            java.lang.String r0 = "backButtonInCustomView"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x00dc
            goto L_0x0153
        L_0x00dc:
            r2 = 10
            goto L_0x0153
        L_0x00e0:
            java.lang.String r0 = "largeTitleBackgroundColor"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x00ea
            goto L_0x0153
        L_0x00ea:
            r2 = 9
            goto L_0x0153
        L_0x00ee:
            java.lang.String r0 = "direction"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x00f8
            goto L_0x0153
        L_0x00f8:
            r2 = 8
            goto L_0x0153
        L_0x00fc:
            java.lang.String r0 = "largeTitleFontSize"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0105
            goto L_0x0153
        L_0x0105:
            r2 = 7
            goto L_0x0153
        L_0x0107:
            java.lang.String r0 = "hidden"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0110
            goto L_0x0153
        L_0x0110:
            r2 = 6
            goto L_0x0153
        L_0x0112:
            java.lang.String r0 = "titleFontWeight"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x011b
            goto L_0x0153
        L_0x011b:
            r2 = 5
            goto L_0x0153
        L_0x011d:
            java.lang.String r0 = "disableBackButtonMenu"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0126
            goto L_0x0153
        L_0x0126:
            r2 = 4
            goto L_0x0153
        L_0x0128:
            java.lang.String r0 = "titleFontFamily"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0131
            goto L_0x0153
        L_0x0131:
            r2 = 3
            goto L_0x0153
        L_0x0133:
            java.lang.String r0 = "largeTitleColor"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x013c
            goto L_0x0153
        L_0x013c:
            r2 = 2
            goto L_0x0153
        L_0x013e:
            java.lang.String r0 = "titleColor"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0147
            goto L_0x0153
        L_0x0147:
            r2 = 1
            goto L_0x0153
        L_0x0149:
            java.lang.String r0 = "translucent"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0152
            goto L_0x0153
        L_0x0152:
            r2 = 0
        L_0x0153:
            r0 = 0
            switch(r2) {
                case 0: goto L_0x02e5;
                case 1: goto L_0x02d5;
                case 2: goto L_0x02c5;
                case 3: goto L_0x02b7;
                case 4: goto L_0x02a6;
                case 5: goto L_0x0298;
                case 6: goto L_0x0287;
                case 7: goto L_0x0275;
                case 8: goto L_0x026a;
                case 9: goto L_0x0259;
                case 10: goto L_0x0247;
                case 11: goto L_0x0238;
                case 12: goto L_0x0227;
                case 13: goto L_0x0218;
                case 14: goto L_0x0206;
                case 15: goto L_0x01f7;
                case 16: goto L_0x01e5;
                case 17: goto L_0x01d6;
                case 18: goto L_0x01c4;
                case 19: goto L_0x01b3;
                case 20: goto L_0x01a4;
                case 21: goto L_0x0192;
                case 22: goto L_0x0180;
                case 23: goto L_0x016e;
                case 24: goto L_0x015c;
                default: goto L_0x0157;
            }
        L_0x0157:
            super.setProperty(r4, r5, r6)
            goto L_0x02f5
        L_0x015c:
            com.facebook.react.uimanager.BaseViewManagerInterface r5 = r3.mViewManager
            com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface r5 = (com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface) r5
            if (r6 != 0) goto L_0x0163
            goto L_0x0169
        L_0x0163:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r1 = r6.booleanValue()
        L_0x0169:
            r5.setTopInsetEnabled(r4, r1)
            goto L_0x02f5
        L_0x016e:
            com.facebook.react.uimanager.BaseViewManagerInterface r5 = r3.mViewManager
            com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface r5 = (com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface) r5
            if (r6 != 0) goto L_0x0175
            goto L_0x017b
        L_0x0175:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r1 = r6.booleanValue()
        L_0x017b:
            r5.setLargeTitle(r4, r1)
            goto L_0x02f5
        L_0x0180:
            com.facebook.react.uimanager.BaseViewManagerInterface r5 = r3.mViewManager
            com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface r5 = (com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface) r5
            if (r6 != 0) goto L_0x0187
            goto L_0x018d
        L_0x0187:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r1 = r6.booleanValue()
        L_0x018d:
            r5.setLargeTitleHideShadow(r4, r1)
            goto L_0x02f5
        L_0x0192:
            com.facebook.react.uimanager.BaseViewManagerInterface r5 = r3.mViewManager
            com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface r5 = (com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface) r5
            if (r6 != 0) goto L_0x0199
            goto L_0x019f
        L_0x0199:
            java.lang.Double r6 = (java.lang.Double) r6
            int r1 = r6.intValue()
        L_0x019f:
            r5.setTitleFontSize(r4, r1)
            goto L_0x02f5
        L_0x01a4:
            com.facebook.react.uimanager.BaseViewManagerInterface r5 = r3.mViewManager
            com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface r5 = (com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface) r5
            if (r6 != 0) goto L_0x01ab
            goto L_0x01ae
        L_0x01ab:
            r0 = r6
            java.lang.String r0 = (java.lang.String) r0
        L_0x01ae:
            r5.setBackTitle(r4, r0)
            goto L_0x02f5
        L_0x01b3:
            com.facebook.react.uimanager.BaseViewManagerInterface r5 = r3.mViewManager
            com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface r5 = (com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface) r5
            android.content.Context r0 = r4.getContext()
            java.lang.Integer r6 = com.facebook.react.bridge.ColorPropConverter.getColor(r6, r0)
            r5.setBackgroundColor(r4, r6)
            goto L_0x02f5
        L_0x01c4:
            com.facebook.react.uimanager.BaseViewManagerInterface r5 = r3.mViewManager
            com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface r5 = (com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface) r5
            if (r6 != 0) goto L_0x01cb
            goto L_0x01d1
        L_0x01cb:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r1 = r6.booleanValue()
        L_0x01d1:
            r5.setHideBackButton(r4, r1)
            goto L_0x02f5
        L_0x01d6:
            com.facebook.react.uimanager.BaseViewManagerInterface r5 = r3.mViewManager
            com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface r5 = (com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface) r5
            if (r6 != 0) goto L_0x01dd
            goto L_0x01e0
        L_0x01dd:
            r0 = r6
            java.lang.String r0 = (java.lang.String) r0
        L_0x01e0:
            r5.setLargeTitleFontWeight(r4, r0)
            goto L_0x02f5
        L_0x01e5:
            com.facebook.react.uimanager.BaseViewManagerInterface r5 = r3.mViewManager
            com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface r5 = (com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface) r5
            if (r6 != 0) goto L_0x01ec
            goto L_0x01f2
        L_0x01ec:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r1 = r6.booleanValue()
        L_0x01f2:
            r5.setHideShadow(r4, r1)
            goto L_0x02f5
        L_0x01f7:
            com.facebook.react.uimanager.BaseViewManagerInterface r5 = r3.mViewManager
            com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface r5 = (com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface) r5
            if (r6 != 0) goto L_0x01fe
            goto L_0x0201
        L_0x01fe:
            r0 = r6
            java.lang.String r0 = (java.lang.String) r0
        L_0x0201:
            r5.setBackTitleFontFamily(r4, r0)
            goto L_0x02f5
        L_0x0206:
            com.facebook.react.uimanager.BaseViewManagerInterface r5 = r3.mViewManager
            com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface r5 = (com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface) r5
            if (r6 != 0) goto L_0x020d
            goto L_0x0213
        L_0x020d:
            java.lang.Double r6 = (java.lang.Double) r6
            int r1 = r6.intValue()
        L_0x0213:
            r5.setBackTitleFontSize(r4, r1)
            goto L_0x02f5
        L_0x0218:
            com.facebook.react.uimanager.BaseViewManagerInterface r5 = r3.mViewManager
            com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface r5 = (com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface) r5
            if (r6 != 0) goto L_0x021f
            goto L_0x0222
        L_0x021f:
            r0 = r6
            java.lang.String r0 = (java.lang.String) r0
        L_0x0222:
            r5.setTitle(r4, r0)
            goto L_0x02f5
        L_0x0227:
            com.facebook.react.uimanager.BaseViewManagerInterface r5 = r3.mViewManager
            com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface r5 = (com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface) r5
            android.content.Context r0 = r4.getContext()
            java.lang.Integer r6 = com.facebook.react.bridge.ColorPropConverter.getColor(r6, r0)
            r5.setColor(r4, r6)
            goto L_0x02f5
        L_0x0238:
            com.facebook.react.uimanager.BaseViewManagerInterface r5 = r3.mViewManager
            com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface r5 = (com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface) r5
            if (r6 != 0) goto L_0x023f
            goto L_0x0242
        L_0x023f:
            r0 = r6
            java.lang.String r0 = (java.lang.String) r0
        L_0x0242:
            r5.setLargeTitleFontFamily(r4, r0)
            goto L_0x02f5
        L_0x0247:
            com.facebook.react.uimanager.BaseViewManagerInterface r5 = r3.mViewManager
            com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface r5 = (com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface) r5
            if (r6 != 0) goto L_0x024e
            goto L_0x0254
        L_0x024e:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r1 = r6.booleanValue()
        L_0x0254:
            r5.setBackButtonInCustomView(r4, r1)
            goto L_0x02f5
        L_0x0259:
            com.facebook.react.uimanager.BaseViewManagerInterface r5 = r3.mViewManager
            com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface r5 = (com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface) r5
            android.content.Context r0 = r4.getContext()
            java.lang.Integer r6 = com.facebook.react.bridge.ColorPropConverter.getColor(r6, r0)
            r5.setLargeTitleBackgroundColor(r4, r6)
            goto L_0x02f5
        L_0x026a:
            com.facebook.react.uimanager.BaseViewManagerInterface r5 = r3.mViewManager
            com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface r5 = (com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface) r5
            java.lang.String r6 = (java.lang.String) r6
            r5.setDirection(r4, r6)
            goto L_0x02f5
        L_0x0275:
            com.facebook.react.uimanager.BaseViewManagerInterface r5 = r3.mViewManager
            com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface r5 = (com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface) r5
            if (r6 != 0) goto L_0x027c
            goto L_0x0282
        L_0x027c:
            java.lang.Double r6 = (java.lang.Double) r6
            int r1 = r6.intValue()
        L_0x0282:
            r5.setLargeTitleFontSize(r4, r1)
            goto L_0x02f5
        L_0x0287:
            com.facebook.react.uimanager.BaseViewManagerInterface r5 = r3.mViewManager
            com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface r5 = (com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface) r5
            if (r6 != 0) goto L_0x028e
            goto L_0x0294
        L_0x028e:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r1 = r6.booleanValue()
        L_0x0294:
            r5.setHidden(r4, r1)
            goto L_0x02f5
        L_0x0298:
            com.facebook.react.uimanager.BaseViewManagerInterface r5 = r3.mViewManager
            com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface r5 = (com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface) r5
            if (r6 != 0) goto L_0x029f
            goto L_0x02a2
        L_0x029f:
            r0 = r6
            java.lang.String r0 = (java.lang.String) r0
        L_0x02a2:
            r5.setTitleFontWeight(r4, r0)
            goto L_0x02f5
        L_0x02a6:
            com.facebook.react.uimanager.BaseViewManagerInterface r5 = r3.mViewManager
            com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface r5 = (com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface) r5
            if (r6 != 0) goto L_0x02ad
            goto L_0x02b3
        L_0x02ad:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r1 = r6.booleanValue()
        L_0x02b3:
            r5.setDisableBackButtonMenu(r4, r1)
            goto L_0x02f5
        L_0x02b7:
            com.facebook.react.uimanager.BaseViewManagerInterface r5 = r3.mViewManager
            com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface r5 = (com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface) r5
            if (r6 != 0) goto L_0x02be
            goto L_0x02c1
        L_0x02be:
            r0 = r6
            java.lang.String r0 = (java.lang.String) r0
        L_0x02c1:
            r5.setTitleFontFamily(r4, r0)
            goto L_0x02f5
        L_0x02c5:
            com.facebook.react.uimanager.BaseViewManagerInterface r5 = r3.mViewManager
            com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface r5 = (com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface) r5
            android.content.Context r0 = r4.getContext()
            java.lang.Integer r6 = com.facebook.react.bridge.ColorPropConverter.getColor(r6, r0)
            r5.setLargeTitleColor(r4, r6)
            goto L_0x02f5
        L_0x02d5:
            com.facebook.react.uimanager.BaseViewManagerInterface r5 = r3.mViewManager
            com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface r5 = (com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface) r5
            android.content.Context r0 = r4.getContext()
            java.lang.Integer r6 = com.facebook.react.bridge.ColorPropConverter.getColor(r6, r0)
            r5.setTitleColor(r4, r6)
            goto L_0x02f5
        L_0x02e5:
            com.facebook.react.uimanager.BaseViewManagerInterface r5 = r3.mViewManager
            com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface r5 = (com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface) r5
            if (r6 != 0) goto L_0x02ec
            goto L_0x02f2
        L_0x02ec:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r1 = r6.booleanValue()
        L_0x02f2:
            r5.setTranslucent(r4, r1)
        L_0x02f5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerDelegate.setProperty(android.view.View, java.lang.String, java.lang.Object):void");
    }
}
