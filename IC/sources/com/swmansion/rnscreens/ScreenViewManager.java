package com.swmansion.rnscreens;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNSScreenManagerDelegate;
import com.facebook.react.viewmanagers.RNSScreenManagerInterface;
import com.swmansion.rnscreens.Screen;
import com.swmansion.rnscreens.events.HeaderBackButtonClickedEvent;
import com.swmansion.rnscreens.events.ScreenAppearEvent;
import com.swmansion.rnscreens.events.ScreenDisappearEvent;
import com.swmansion.rnscreens.events.ScreenDismissedEvent;
import com.swmansion.rnscreens.events.ScreenTransitionProgressEvent;
import com.swmansion.rnscreens.events.ScreenWillAppearEvent;
import com.swmansion.rnscreens.events.ScreenWillDisappearEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0007\u0018\u0000 ;2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001;B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0014J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0014J\u0014\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0016J\b\u0010\u000f\u001a\u00020\rH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0015H\u0007J\u001a\u0010\u0016\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u001a\u0010\u0019\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0018H\u0017J\u001c\u0010\u001c\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u001dH\u0016J\u001a\u0010\u001e\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u001a\u0010\u001f\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010 \u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0018H\u0017J\u001f\u0010\"\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\u0015H\u0017¢\u0006\u0002\u0010$J\u0018\u0010%\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0018H\u0017J\u001a\u0010'\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u001a\u0010(\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\b\u0010)\u001a\u0004\u0018\u00010\rH\u0017J\u001a\u0010*\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\b\u0010+\u001a\u0004\u0018\u00010\rH\u0017J\u001a\u0010,\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\b\u0010)\u001a\u0004\u0018\u00010\rH\u0017J\u001a\u0010-\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\b\u0010.\u001a\u0004\u0018\u00010\rH\u0017J\u001a\u0010/\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\b\u00100\u001a\u0004\u0018\u00010\rH\u0017J\u001f\u00101\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\b\u00102\u001a\u0004\u0018\u00010\u0015H\u0017¢\u0006\u0002\u0010$J\u0018\u00103\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u00104\u001a\u00020\u0018H\u0017J\u001a\u00105\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\b\u00106\u001a\u0004\u0018\u00010\rH\u0017J\u0018\u00107\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u0018H\u0017J\u001c\u00109\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\rH\u0016J\u001a\u0010:\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0017\u001a\u00020\u0015H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lcom/swmansion/rnscreens/ScreenViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/Screen;", "Lcom/facebook/react/viewmanagers/RNSScreenManagerInterface;", "()V", "mDelegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getDelegate", "getExportedCustomDirectEventTypeConstants", "", "", "", "getName", "setActivityState", "", "view", "activityState", "", "", "setCustomAnimationOnSwipe", "value", "", "setFullScreenSwipeEnabled", "setGestureEnabled", "gestureEnabled", "setGestureResponseDistance", "Lcom/facebook/react/bridge/ReadableMap;", "setHideKeyboardOnSwipe", "setHomeIndicatorHidden", "setNativeBackButtonDismissalEnabled", "nativeBackButtonDismissalEnabled", "setNavigationBarColor", "navigationBarColor", "(Lcom/swmansion/rnscreens/Screen;Ljava/lang/Integer;)V", "setNavigationBarHidden", "navigationBarHidden", "setPreventNativeDismiss", "setReplaceAnimation", "animation", "setScreenOrientation", "screenOrientation", "setStackAnimation", "setStackPresentation", "presentation", "setStatusBarAnimation", "statusBarAnimation", "setStatusBarColor", "statusBarColor", "setStatusBarHidden", "statusBarHidden", "setStatusBarStyle", "statusBarStyle", "setStatusBarTranslucent", "statusBarTranslucent", "setSwipeDirection", "setTransitionDuration", "Companion", "react-native-screens_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@ReactModule(name = "RNSScreen")
/* compiled from: ScreenViewManager.kt */
public final class ScreenViewManager extends ViewGroupManager<Screen> implements RNSScreenManagerInterface<Screen> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String REACT_CLASS = "RNSScreen";
    private final ViewManagerDelegate<Screen> mDelegate = new RNSScreenManagerDelegate(this);

    public String getName() {
        return REACT_CLASS;
    }

    public void setCustomAnimationOnSwipe(Screen screen, boolean z) {
    }

    public void setFullScreenSwipeEnabled(Screen screen, boolean z) {
    }

    public void setGestureResponseDistance(Screen screen, ReadableMap readableMap) {
    }

    public void setHideKeyboardOnSwipe(Screen screen, boolean z) {
    }

    public void setHomeIndicatorHidden(Screen screen, boolean z) {
    }

    public void setPreventNativeDismiss(Screen screen, boolean z) {
    }

    public void setSwipeDirection(Screen screen, String str) {
    }

    public void setTransitionDuration(Screen screen, int i) {
    }

    /* access modifiers changed from: protected */
    public Screen createViewInstance(ThemedReactContext themedReactContext) {
        Intrinsics.checkNotNullParameter(themedReactContext, "reactContext");
        return new Screen(themedReactContext);
    }

    public void setActivityState(Screen screen, float f) {
        Intrinsics.checkNotNullParameter(screen, "view");
        setActivityState(screen, (int) f);
    }

    @ReactProp(name = "activityState")
    public final void setActivityState(Screen screen, int i) {
        Intrinsics.checkNotNullParameter(screen, "view");
        if (i != -1) {
            if (i == 0) {
                screen.setActivityState(Screen.ActivityState.INACTIVE);
            } else if (i == 1) {
                screen.setActivityState(Screen.ActivityState.TRANSITIONING_OR_BELOW_TOP);
            } else if (i == 2) {
                screen.setActivityState(Screen.ActivityState.ON_TOP);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        if (r4.equals("containedModal") != false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
        if (r4.equals("modal") != false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        r4 = com.swmansion.rnscreens.Screen.StackPresentation.MODAL;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004f, code lost:
        if (r4.equals("transparentModal") != false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0051, code lost:
        r4 = com.swmansion.rnscreens.Screen.StackPresentation.TRANSPARENT_MODAL;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0053, code lost:
        r3.setStackPresentation(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0056, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r4.equals("formSheet") != false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        if (r4.equals("fullScreenModal") != false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        if (r4.equals("containedTransparentModal") != false) goto L_0x0051;
     */
    @com.facebook.react.uimanager.annotations.ReactProp(name = "stackPresentation")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setStackPresentation(com.swmansion.rnscreens.Screen r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            if (r4 == 0) goto L_0x0057
            int r0 = r4.hashCode()
            switch(r0) {
                case -76271493: goto L_0x0049;
                case 3452698: goto L_0x003e;
                case 104069805: goto L_0x0033;
                case 438078970: goto L_0x002a;
                case 955284238: goto L_0x0021;
                case 1171936146: goto L_0x0018;
                case 1798290171: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0057
        L_0x000f:
            java.lang.String r0 = "formSheet"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0057
            goto L_0x003b
        L_0x0018:
            java.lang.String r0 = "fullScreenModal"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0057
            goto L_0x003b
        L_0x0021:
            java.lang.String r0 = "containedTransparentModal"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0057
            goto L_0x0051
        L_0x002a:
            java.lang.String r0 = "containedModal"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0057
            goto L_0x003b
        L_0x0033:
            java.lang.String r0 = "modal"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0057
        L_0x003b:
            com.swmansion.rnscreens.Screen$StackPresentation r4 = com.swmansion.rnscreens.Screen.StackPresentation.MODAL
            goto L_0x0053
        L_0x003e:
            java.lang.String r0 = "push"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0057
            com.swmansion.rnscreens.Screen$StackPresentation r4 = com.swmansion.rnscreens.Screen.StackPresentation.PUSH
            goto L_0x0053
        L_0x0049:
            java.lang.String r0 = "transparentModal"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0057
        L_0x0051:
            com.swmansion.rnscreens.Screen$StackPresentation r4 = com.swmansion.rnscreens.Screen.StackPresentation.TRANSPARENT_MODAL
        L_0x0053:
            r3.setStackPresentation(r4)
            return
        L_0x0057:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r3 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown presentation type "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.ScreenViewManager.setStackPresentation(com.swmansion.rnscreens.Screen, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
        if (r4.equals("flip") != false) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006a, code lost:
        if (r4.equals("simple_push") != false) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0083, code lost:
        throw new com.facebook.react.bridge.JSApplicationIllegalArgumentException("Unknown animation type " + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (r4.equals("default") != false) goto L_0x0084;
     */
    @com.facebook.react.uimanager.annotations.ReactProp(name = "stackAnimation")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setStackAnimation(com.swmansion.rnscreens.Screen r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            if (r4 == 0) goto L_0x0084
            int r0 = r4.hashCode()
            switch(r0) {
                case -1418955385: goto L_0x0064;
                case -427095442: goto L_0x0059;
                case -349395819: goto L_0x004e;
                case 3135100: goto L_0x0043;
                case 3145837: goto L_0x003a;
                case 3387192: goto L_0x002f;
                case 182437661: goto L_0x0024;
                case 1544803905: goto L_0x001b;
                case 1601504978: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x006d
        L_0x000f:
            java.lang.String r0 = "slide_from_bottom"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x006d
            com.swmansion.rnscreens.Screen$StackAnimation r4 = com.swmansion.rnscreens.Screen.StackAnimation.SLIDE_FROM_BOTTOM
            goto L_0x0086
        L_0x001b:
            java.lang.String r0 = "default"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x006d
            goto L_0x0084
        L_0x0024:
            java.lang.String r0 = "fade_from_bottom"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x006d
            com.swmansion.rnscreens.Screen$StackAnimation r4 = com.swmansion.rnscreens.Screen.StackAnimation.FADE_FROM_BOTTOM
            goto L_0x0086
        L_0x002f:
            java.lang.String r0 = "none"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x006d
            com.swmansion.rnscreens.Screen$StackAnimation r4 = com.swmansion.rnscreens.Screen.StackAnimation.NONE
            goto L_0x0086
        L_0x003a:
            java.lang.String r0 = "flip"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x006d
            goto L_0x0084
        L_0x0043:
            java.lang.String r0 = "fade"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x006d
            com.swmansion.rnscreens.Screen$StackAnimation r4 = com.swmansion.rnscreens.Screen.StackAnimation.FADE
            goto L_0x0086
        L_0x004e:
            java.lang.String r0 = "slide_from_right"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x006d
            com.swmansion.rnscreens.Screen$StackAnimation r4 = com.swmansion.rnscreens.Screen.StackAnimation.SLIDE_FROM_RIGHT
            goto L_0x0086
        L_0x0059:
            java.lang.String r0 = "slide_from_left"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x006d
            com.swmansion.rnscreens.Screen$StackAnimation r4 = com.swmansion.rnscreens.Screen.StackAnimation.SLIDE_FROM_LEFT
            goto L_0x0086
        L_0x0064:
            java.lang.String r0 = "simple_push"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x006d
            goto L_0x0084
        L_0x006d:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r3 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown animation type "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        L_0x0084:
            com.swmansion.rnscreens.Screen$StackAnimation r4 = com.swmansion.rnscreens.Screen.StackAnimation.DEFAULT
        L_0x0086:
            r3.setStackAnimation(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.ScreenViewManager.setStackAnimation(com.swmansion.rnscreens.Screen, java.lang.String):void");
    }

    @ReactProp(defaultBoolean = true, name = "gestureEnabled")
    public void setGestureEnabled(Screen screen, boolean z) {
        Intrinsics.checkNotNullParameter(screen, "view");
        screen.setGestureEnabled(z);
    }

    @ReactProp(name = "replaceAnimation")
    public void setReplaceAnimation(Screen screen, String str) {
        Screen.ReplaceAnimation replaceAnimation;
        Intrinsics.checkNotNullParameter(screen, "view");
        if (str == null ? true : Intrinsics.areEqual((Object) str, (Object) "pop")) {
            replaceAnimation = Screen.ReplaceAnimation.POP;
        } else if (Intrinsics.areEqual((Object) str, (Object) "push")) {
            replaceAnimation = Screen.ReplaceAnimation.PUSH;
        } else {
            throw new JSApplicationIllegalArgumentException("Unknown replace animation type " + str);
        }
        screen.setReplaceAnimation(replaceAnimation);
    }

    @ReactProp(name = "screenOrientation")
    public void setScreenOrientation(Screen screen, String str) {
        Intrinsics.checkNotNullParameter(screen, "view");
        screen.setScreenOrientation(str);
    }

    @ReactProp(name = "statusBarAnimation")
    public void setStatusBarAnimation(Screen screen, String str) {
        Intrinsics.checkNotNullParameter(screen, "view");
        screen.setStatusBarAnimated(Boolean.valueOf(str != null && !Intrinsics.areEqual((Object) ViewProps.NONE, (Object) str)));
    }

    @ReactProp(customType = "Color", name = "statusBarColor")
    public void setStatusBarColor(Screen screen, Integer num) {
        Intrinsics.checkNotNullParameter(screen, "view");
        screen.setStatusBarColor(num);
    }

    @ReactProp(name = "statusBarStyle")
    public void setStatusBarStyle(Screen screen, String str) {
        Intrinsics.checkNotNullParameter(screen, "view");
        screen.setStatusBarStyle(str);
    }

    @ReactProp(name = "statusBarTranslucent")
    public void setStatusBarTranslucent(Screen screen, boolean z) {
        Intrinsics.checkNotNullParameter(screen, "view");
        screen.setStatusBarTranslucent(Boolean.valueOf(z));
    }

    @ReactProp(name = "statusBarHidden")
    public void setStatusBarHidden(Screen screen, boolean z) {
        Intrinsics.checkNotNullParameter(screen, "view");
        screen.setStatusBarHidden(Boolean.valueOf(z));
    }

    @ReactProp(customType = "Color", name = "navigationBarColor")
    public void setNavigationBarColor(Screen screen, Integer num) {
        Intrinsics.checkNotNullParameter(screen, "view");
        screen.setNavigationBarColor(num);
    }

    @ReactProp(name = "navigationBarHidden")
    public void setNavigationBarHidden(Screen screen, boolean z) {
        Intrinsics.checkNotNullParameter(screen, "view");
        screen.setNavigationBarHidden(Boolean.valueOf(z));
    }

    @ReactProp(name = "nativeBackButtonDismissalEnabled")
    public void setNativeBackButtonDismissalEnabled(Screen screen, boolean z) {
        Intrinsics.checkNotNullParameter(screen, "view");
        screen.setNativeBackButtonDismissalEnabled(z);
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> of = MapBuilder.of(ScreenDismissedEvent.EVENT_NAME, MapBuilder.of("registrationName", "onDismissed"), ScreenWillAppearEvent.EVENT_NAME, MapBuilder.of("registrationName", "onWillAppear"), ScreenAppearEvent.EVENT_NAME, MapBuilder.of("registrationName", "onAppear"), ScreenWillDisappearEvent.EVENT_NAME, MapBuilder.of("registrationName", "onWillDisappear"), ScreenDisappearEvent.EVENT_NAME, MapBuilder.of("registrationName", "onDisappear"), HeaderBackButtonClickedEvent.EVENT_NAME, MapBuilder.of("registrationName", "onHeaderBackButtonClicked"), ScreenTransitionProgressEvent.EVENT_NAME, MapBuilder.of("registrationName", "onTransitionProgress"));
        Intrinsics.checkNotNullExpressionValue(of, "of(\n            ScreenDi…itionProgress\")\n        )");
        return of;
    }

    /* access modifiers changed from: protected */
    public ViewManagerDelegate<Screen> getDelegate() {
        return this.mDelegate;
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/swmansion/rnscreens/ScreenViewManager$Companion;", "", "()V", "REACT_CLASS", "", "react-native-screens_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* compiled from: ScreenViewManager.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
