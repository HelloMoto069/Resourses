package com.swmansion.rnscreens;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.swmansion.rnscreens.Screen;
import com.swmansion.rnscreens.events.StackFinishTransitioningEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 A2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002ABB\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u001cH\u0014J\u000e\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0002J\u0010\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020(H\u0014J\b\u0010)\u001a\u00020$H\u0002J\b\u0010*\u001a\u00020$H\u0002J \u0010+\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020(2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0014J\u0010\u00100\u001a\u00020$2\u0006\u00101\u001a\u00020-H\u0016J\u0012\u00102\u001a\u00020\u000b2\b\u0010%\u001a\u0004\u0018\u000103H\u0016J\b\u00104\u001a\u00020$H\u0014J\f\u00105\u001a\u00060\bR\u00020\u0000H\u0002J\b\u00106\u001a\u00020$H\u0016J\u0006\u00107\u001a\u00020$J\u0014\u00108\u001a\u00020$2\n\u00109\u001a\u00060\bR\u00020\u0000H\u0002J\b\u0010:\u001a\u00020$H\u0016J\u0010\u0010;\u001a\u00020$2\u0006\u0010<\u001a\u00020\u0019H\u0016J\u0010\u0010=\u001a\u00020$2\u0006\u00101\u001a\u00020-H\u0016J\u0010\u0010>\u001a\u00020$2\u0006\u00101\u001a\u00020-H\u0016J\u0012\u0010?\u001a\u00020$2\b\u0010@\u001a\u0004\u0018\u00010\u0002H\u0002R\u0018\u0010\u0006\u001a\f\u0012\b\u0012\u00060\bR\u00020\u00000\u0007X\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\f\u0012\b\u0012\u00060\bR\u00020\u00000\u0007X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0015j\b\u0012\u0004\u0012\u00020\u0002`\u0016X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u001b\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001c8VX\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001e¨\u0006C"}, d2 = {"Lcom/swmansion/rnscreens/ScreenStack;", "Lcom/swmansion/rnscreens/ScreenContainer;", "Lcom/swmansion/rnscreens/ScreenStackFragment;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "drawingOpPool", "", "Lcom/swmansion/rnscreens/ScreenStack$DrawingOp;", "drawingOps", "goingForward", "", "getGoingForward", "()Z", "setGoingForward", "(Z)V", "isDetachingCurrentScreen", "mDismissed", "", "mRemovalTransitionStarted", "mStack", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "mTopScreen", "previousChildrenCount", "", "reverseLastTwoChildren", "rootScreen", "Lcom/swmansion/rnscreens/Screen;", "getRootScreen", "()Lcom/swmansion/rnscreens/Screen;", "topScreen", "getTopScreen", "adapt", "screen", "dismiss", "", "screenFragment", "dispatchDraw", "canvas", "Landroid/graphics/Canvas;", "dispatchOnFinishTransitioning", "drawAndRelease", "drawChild", "child", "Landroid/view/View;", "drawingTime", "", "endViewTransition", "view", "hasScreen", "Lcom/swmansion/rnscreens/ScreenFragment;", "notifyContainerUpdate", "obtainDrawingOp", "onUpdate", "onViewAppearTransitionEnd", "performDraw", "op", "removeAllScreens", "removeScreenAt", "index", "removeView", "startViewTransition", "turnOffA11yUnderTransparentScreen", "visibleBottom", "Companion", "DrawingOp", "react-native-screens_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: ScreenStack.kt */
public final class ScreenStack extends ScreenContainer<ScreenStackFragment> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final List<DrawingOp> drawingOpPool = new ArrayList();
    private List<DrawingOp> drawingOps = new ArrayList();
    private boolean goingForward;
    private boolean isDetachingCurrentScreen;
    private final Set<ScreenStackFragment> mDismissed = new HashSet();
    private boolean mRemovalTransitionStarted;
    private final ArrayList<ScreenStackFragment> mStack = new ArrayList<>();
    private ScreenStackFragment mTopScreen;
    private int previousChildrenCount;
    private boolean reverseLastTwoChildren;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* compiled from: ScreenStack.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Screen.StackAnimation.values().length];
            iArr[Screen.StackAnimation.DEFAULT.ordinal()] = 1;
            iArr[Screen.StackAnimation.NONE.ordinal()] = 2;
            iArr[Screen.StackAnimation.FADE.ordinal()] = 3;
            iArr[Screen.StackAnimation.SLIDE_FROM_RIGHT.ordinal()] = 4;
            iArr[Screen.StackAnimation.SLIDE_FROM_LEFT.ordinal()] = 5;
            iArr[Screen.StackAnimation.SLIDE_FROM_BOTTOM.ordinal()] = 6;
            iArr[Screen.StackAnimation.FADE_FROM_BOTTOM.ordinal()] = 7;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ScreenStack(Context context) {
        super(context);
    }

    public final boolean getGoingForward() {
        return this.goingForward;
    }

    public final void setGoingForward(boolean z) {
        this.goingForward = z;
    }

    public final void dismiss(ScreenStackFragment screenStackFragment) {
        Intrinsics.checkNotNullParameter(screenStackFragment, "screenFragment");
        this.mDismissed.add(screenStackFragment);
        performUpdatesNow();
    }

    public Screen getTopScreen() {
        ScreenStackFragment screenStackFragment = this.mTopScreen;
        if (screenStackFragment != null) {
            return screenStackFragment.getScreen();
        }
        return null;
    }

    public final Screen getRootScreen() {
        int screenCount = getScreenCount();
        for (int i = 0; i < screenCount; i++) {
            Screen screenAt = getScreenAt(i);
            if (!CollectionsKt.contains(this.mDismissed, screenAt.getFragment())) {
                return screenAt;
            }
        }
        throw new IllegalStateException("Stack has no root screen set");
    }

    /* access modifiers changed from: protected */
    public ScreenStackFragment adapt(Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        return new ScreenStackFragment(screen);
    }

    public void startViewTransition(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.startViewTransition(view);
        this.mRemovalTransitionStarted = true;
    }

    public void endViewTransition(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.endViewTransition(view);
        if (this.mRemovalTransitionStarted) {
            this.mRemovalTransitionStarted = false;
            dispatchOnFinishTransitioning();
        }
    }

    public final void onViewAppearTransitionEnd() {
        if (!this.mRemovalTransitionStarted) {
            dispatchOnFinishTransitioning();
        }
    }

    private final void dispatchOnFinishTransitioning() {
        Context context = getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new StackFinishTransitioningEvent(getId()));
        }
    }

    public void removeScreenAt(int i) {
        TypeIntrinsics.asMutableCollection(this.mDismissed).remove(getScreenAt(i).getFragment());
        super.removeScreenAt(i);
    }

    public void removeAllScreens() {
        this.mDismissed.clear();
        super.removeAllScreens();
    }

    public boolean hasScreen(ScreenFragment screenFragment) {
        return super.hasScreen(screenFragment) && !CollectionsKt.contains(this.mDismissed, screenFragment);
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x01d1 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x018f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onUpdate() {
        /*
            r8 = this;
            r0 = 0
            r8.isDetachingCurrentScreen = r0
            java.util.ArrayList r1 = r8.mScreenFragments
            int r1 = r1.size()
            int r1 = r1 + -1
            r2 = 0
            r3 = r2
            r4 = r3
            if (r1 < 0) goto L_0x003a
        L_0x0010:
            int r5 = r1 + -1
            java.util.ArrayList r6 = r8.mScreenFragments
            java.lang.Object r1 = r6.get(r1)
            java.lang.String r6 = "mScreenFragments[i]"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r6)
            com.swmansion.rnscreens.ScreenStackFragment r1 = (com.swmansion.rnscreens.ScreenStackFragment) r1
            java.util.Set<com.swmansion.rnscreens.ScreenStackFragment> r6 = r8.mDismissed
            boolean r6 = r6.contains(r1)
            if (r6 != 0) goto L_0x0035
            if (r3 != 0) goto L_0x002b
            r3 = r1
            goto L_0x002c
        L_0x002b:
            r4 = r1
        L_0x002c:
            com.swmansion.rnscreens.ScreenStack$Companion r6 = Companion
            boolean r1 = r6.isTransparent(r1)
            if (r1 != 0) goto L_0x0035
            goto L_0x003a
        L_0x0035:
            if (r5 >= 0) goto L_0x0038
            goto L_0x003a
        L_0x0038:
            r1 = r5
            goto L_0x0010
        L_0x003a:
            java.util.ArrayList<com.swmansion.rnscreens.ScreenStackFragment> r1 = r8.mStack
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r1 = kotlin.collections.CollectionsKt.contains(r1, r3)
            r5 = 1
            if (r1 != 0) goto L_0x0092
            com.swmansion.rnscreens.ScreenStackFragment r1 = r8.mTopScreen
            if (r1 == 0) goto L_0x0089
            if (r3 == 0) goto L_0x0089
            if (r1 == 0) goto L_0x0057
            java.util.ArrayList r6 = r8.mScreenFragments
            boolean r1 = r6.contains(r1)
            if (r1 != r5) goto L_0x0057
            r1 = 1
            goto L_0x0058
        L_0x0057:
            r1 = 0
        L_0x0058:
            com.swmansion.rnscreens.Screen r6 = r3.getScreen()
            com.swmansion.rnscreens.Screen$ReplaceAnimation r6 = r6.getReplaceAnimation()
            com.swmansion.rnscreens.Screen$ReplaceAnimation r7 = com.swmansion.rnscreens.Screen.ReplaceAnimation.PUSH
            if (r6 != r7) goto L_0x0066
            r6 = 1
            goto L_0x0067
        L_0x0066:
            r6 = 0
        L_0x0067:
            if (r1 != 0) goto L_0x006e
            if (r6 == 0) goto L_0x006c
            goto L_0x006e
        L_0x006c:
            r1 = 0
            goto L_0x006f
        L_0x006e:
            r1 = 1
        L_0x006f:
            if (r1 == 0) goto L_0x007a
            com.swmansion.rnscreens.Screen r2 = r3.getScreen()
            com.swmansion.rnscreens.Screen$StackAnimation r2 = r2.getStackAnimation()
            goto L_0x00ae
        L_0x007a:
            com.swmansion.rnscreens.ScreenStackFragment r6 = r8.mTopScreen
            if (r6 == 0) goto L_0x00ae
            com.swmansion.rnscreens.Screen r6 = r6.getScreen()
            if (r6 == 0) goto L_0x00ae
            com.swmansion.rnscreens.Screen$StackAnimation r2 = r6.getStackAnimation()
            goto L_0x00ae
        L_0x0089:
            if (r1 != 0) goto L_0x00ad
            if (r3 == 0) goto L_0x00ad
            com.swmansion.rnscreens.Screen$StackAnimation r2 = com.swmansion.rnscreens.Screen.StackAnimation.NONE
            r8.goingForward = r5
            goto L_0x00ad
        L_0x0092:
            com.swmansion.rnscreens.ScreenStackFragment r1 = r8.mTopScreen
            if (r1 == 0) goto L_0x00ad
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x00ad
            com.swmansion.rnscreens.ScreenStackFragment r1 = r8.mTopScreen
            if (r1 == 0) goto L_0x00ab
            com.swmansion.rnscreens.Screen r1 = r1.getScreen()
            if (r1 == 0) goto L_0x00ab
            com.swmansion.rnscreens.Screen$StackAnimation r1 = r1.getStackAnimation()
            r2 = r1
        L_0x00ab:
            r1 = 0
            goto L_0x00ae
        L_0x00ad:
            r1 = 1
        L_0x00ae:
            androidx.fragment.app.FragmentTransaction r6 = r8.createTransaction()
            if (r2 == 0) goto L_0x0140
            if (r1 == 0) goto L_0x00fd
            int[] r7 = com.swmansion.rnscreens.ScreenStack.WhenMappings.$EnumSwitchMapping$0
            int r2 = r2.ordinal()
            r2 = r7[r2]
            switch(r2) {
                case 1: goto L_0x00f5;
                case 2: goto L_0x00ed;
                case 3: goto L_0x00e5;
                case 4: goto L_0x00dd;
                case 5: goto L_0x00d5;
                case 6: goto L_0x00cc;
                case 7: goto L_0x00c3;
                default: goto L_0x00c1;
            }
        L_0x00c1:
            goto L_0x0140
        L_0x00c3:
            int r2 = com.swmansion.rnscreens.R.anim.rns_fade_from_bottom
            int r7 = com.swmansion.rnscreens.R.anim.rns_no_animation_350
            r6.setCustomAnimations(r2, r7)
            goto L_0x0140
        L_0x00cc:
            int r2 = com.swmansion.rnscreens.R.anim.rns_slide_in_from_bottom
            int r7 = com.swmansion.rnscreens.R.anim.rns_no_animation_medium
            r6.setCustomAnimations(r2, r7)
            goto L_0x0140
        L_0x00d5:
            int r2 = com.swmansion.rnscreens.R.anim.rns_slide_in_from_left
            int r7 = com.swmansion.rnscreens.R.anim.rns_slide_out_to_right
            r6.setCustomAnimations(r2, r7)
            goto L_0x0140
        L_0x00dd:
            int r2 = com.swmansion.rnscreens.R.anim.rns_slide_in_from_right
            int r7 = com.swmansion.rnscreens.R.anim.rns_slide_out_to_left
            r6.setCustomAnimations(r2, r7)
            goto L_0x0140
        L_0x00e5:
            int r2 = com.swmansion.rnscreens.R.anim.rns_fade_in
            int r7 = com.swmansion.rnscreens.R.anim.rns_fade_out
            r6.setCustomAnimations(r2, r7)
            goto L_0x0140
        L_0x00ed:
            int r2 = com.swmansion.rnscreens.R.anim.rns_no_animation_20
            int r7 = com.swmansion.rnscreens.R.anim.rns_no_animation_20
            r6.setCustomAnimations(r2, r7)
            goto L_0x0140
        L_0x00f5:
            int r2 = com.swmansion.rnscreens.R.anim.rns_default_enter_in
            int r7 = com.swmansion.rnscreens.R.anim.rns_default_enter_out
            r6.setCustomAnimations(r2, r7)
            goto L_0x0140
        L_0x00fd:
            int[] r7 = com.swmansion.rnscreens.ScreenStack.WhenMappings.$EnumSwitchMapping$0
            int r2 = r2.ordinal()
            r2 = r7[r2]
            switch(r2) {
                case 1: goto L_0x0139;
                case 2: goto L_0x0131;
                case 3: goto L_0x0129;
                case 4: goto L_0x0121;
                case 5: goto L_0x0119;
                case 6: goto L_0x0111;
                case 7: goto L_0x0109;
                default: goto L_0x0108;
            }
        L_0x0108:
            goto L_0x0140
        L_0x0109:
            int r2 = com.swmansion.rnscreens.R.anim.rns_no_animation_250
            int r7 = com.swmansion.rnscreens.R.anim.rns_fade_to_bottom
            r6.setCustomAnimations(r2, r7)
            goto L_0x0140
        L_0x0111:
            int r2 = com.swmansion.rnscreens.R.anim.rns_no_animation_medium
            int r7 = com.swmansion.rnscreens.R.anim.rns_slide_out_to_bottom
            r6.setCustomAnimations(r2, r7)
            goto L_0x0140
        L_0x0119:
            int r2 = com.swmansion.rnscreens.R.anim.rns_slide_in_from_right
            int r7 = com.swmansion.rnscreens.R.anim.rns_slide_out_to_left
            r6.setCustomAnimations(r2, r7)
            goto L_0x0140
        L_0x0121:
            int r2 = com.swmansion.rnscreens.R.anim.rns_slide_in_from_left
            int r7 = com.swmansion.rnscreens.R.anim.rns_slide_out_to_right
            r6.setCustomAnimations(r2, r7)
            goto L_0x0140
        L_0x0129:
            int r2 = com.swmansion.rnscreens.R.anim.rns_fade_in
            int r7 = com.swmansion.rnscreens.R.anim.rns_fade_out
            r6.setCustomAnimations(r2, r7)
            goto L_0x0140
        L_0x0131:
            int r2 = com.swmansion.rnscreens.R.anim.rns_no_animation_20
            int r7 = com.swmansion.rnscreens.R.anim.rns_no_animation_20
            r6.setCustomAnimations(r2, r7)
            goto L_0x0140
        L_0x0139:
            int r2 = com.swmansion.rnscreens.R.anim.rns_default_exit_in
            int r7 = com.swmansion.rnscreens.R.anim.rns_default_exit_out
            r6.setCustomAnimations(r2, r7)
        L_0x0140:
            r8.goingForward = r1
            if (r1 == 0) goto L_0x0152
            if (r3 == 0) goto L_0x0152
            com.swmansion.rnscreens.ScreenStack$Companion r1 = Companion
            boolean r1 = r1.needsDrawReordering(r3)
            if (r1 == 0) goto L_0x0152
            if (r4 != 0) goto L_0x0152
            r8.isDetachingCurrentScreen = r5
        L_0x0152:
            java.util.ArrayList<com.swmansion.rnscreens.ScreenStackFragment> r1 = r8.mStack
            java.util.Iterator r1 = r1.iterator()
        L_0x0158:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x017a
            java.lang.Object r2 = r1.next()
            com.swmansion.rnscreens.ScreenStackFragment r2 = (com.swmansion.rnscreens.ScreenStackFragment) r2
            java.util.ArrayList r7 = r8.mScreenFragments
            boolean r7 = r7.contains(r2)
            if (r7 == 0) goto L_0x0174
            java.util.Set<com.swmansion.rnscreens.ScreenStackFragment> r7 = r8.mDismissed
            boolean r7 = r7.contains(r2)
            if (r7 == 0) goto L_0x0158
        L_0x0174:
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            r6.remove(r2)
            goto L_0x0158
        L_0x017a:
            java.util.ArrayList r1 = r8.mScreenFragments
            java.util.Iterator r1 = r1.iterator()
        L_0x0180:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x019f
            java.lang.Object r2 = r1.next()
            com.swmansion.rnscreens.ScreenStackFragment r2 = (com.swmansion.rnscreens.ScreenStackFragment) r2
            if (r2 != r4) goto L_0x018f
            goto L_0x019f
        L_0x018f:
            if (r2 == r3) goto L_0x0180
            java.util.Set<com.swmansion.rnscreens.ScreenStackFragment> r7 = r8.mDismissed
            boolean r7 = r7.contains(r2)
            if (r7 != 0) goto L_0x0180
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            r6.remove(r2)
            goto L_0x0180
        L_0x019f:
            if (r4 == 0) goto L_0x01d1
            boolean r1 = r4.isAdded()
            if (r1 != 0) goto L_0x01d1
            java.util.ArrayList r1 = r8.mScreenFragments
            java.util.Iterator r1 = r1.iterator()
        L_0x01ad:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x01e3
            java.lang.Object r2 = r1.next()
            com.swmansion.rnscreens.ScreenStackFragment r2 = (com.swmansion.rnscreens.ScreenStackFragment) r2
            if (r5 == 0) goto L_0x01be
            if (r2 != r4) goto L_0x01ad
            r5 = 0
        L_0x01be:
            int r7 = r8.getId()
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            androidx.fragment.app.FragmentTransaction r2 = r6.add((int) r7, (androidx.fragment.app.Fragment) r2)
            com.swmansion.rnscreens.-$$Lambda$ScreenStack$09QDs4u6bgTL_vc7DRBNAkh6PHM r7 = new com.swmansion.rnscreens.-$$Lambda$ScreenStack$09QDs4u6bgTL_vc7DRBNAkh6PHM
            r7.<init>()
            r2.runOnCommit(r7)
            goto L_0x01ad
        L_0x01d1:
            if (r3 == 0) goto L_0x01e3
            boolean r0 = r3.isAdded()
            if (r0 != 0) goto L_0x01e3
            int r0 = r8.getId()
            r1 = r3
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            r6.add((int) r0, (androidx.fragment.app.Fragment) r1)
        L_0x01e3:
            r8.mTopScreen = r3
            java.util.ArrayList<com.swmansion.rnscreens.ScreenStackFragment> r0 = r8.mStack
            r0.clear()
            java.util.ArrayList<com.swmansion.rnscreens.ScreenStackFragment> r0 = r8.mStack
            java.util.ArrayList r1 = r8.mScreenFragments
            java.util.Collection r1 = (java.util.Collection) r1
            r0.addAll(r1)
            r8.turnOffA11yUnderTransparentScreen(r4)
            r6.commitNowAllowingStateLoss()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.ScreenStack.onUpdate():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: onUpdate$lambda-2$lambda-1  reason: not valid java name */
    public static final void m5onUpdate$lambda2$lambda1(ScreenStackFragment screenStackFragment) {
        Screen screen;
        if (screenStackFragment != null && (screen = screenStackFragment.getScreen()) != null) {
            screen.bringToFront();
        }
    }

    private final void turnOffA11yUnderTransparentScreen(ScreenStackFragment screenStackFragment) {
        ScreenStackFragment screenStackFragment2;
        if (this.mScreenFragments.size() > 1 && screenStackFragment != null && (screenStackFragment2 = this.mTopScreen) != null && Companion.isTransparent(screenStackFragment2)) {
            for (ScreenStackFragment screenStackFragment3 : CollectionsKt.asReversed(CollectionsKt.slice(this.mScreenFragments, RangesKt.until(0, this.mScreenFragments.size() - 1)))) {
                screenStackFragment3.getScreen().changeAccessibilityMode(4);
                if (Intrinsics.areEqual((Object) screenStackFragment3, (Object) screenStackFragment)) {
                    break;
                }
            }
        }
        Screen topScreen = getTopScreen();
        if (topScreen != null) {
            topScreen.changeAccessibilityMode(0);
        }
    }

    /* access modifiers changed from: protected */
    public void notifyContainerUpdate() {
        for (ScreenStackFragment onContainerUpdate : this.mStack) {
            onContainerUpdate.onContainerUpdate();
        }
    }

    public void removeView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.isDetachingCurrentScreen) {
            this.isDetachingCurrentScreen = false;
            this.reverseLastTwoChildren = true;
        }
        super.removeView(view);
    }

    private final void drawAndRelease() {
        List<DrawingOp> list = this.drawingOps;
        this.drawingOps = new ArrayList();
        for (DrawingOp next : list) {
            next.draw();
            this.drawingOpPool.add(next);
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.dispatchDraw(canvas);
        if (this.drawingOps.size() < this.previousChildrenCount) {
            this.reverseLastTwoChildren = false;
        }
        this.previousChildrenCount = this.drawingOps.size();
        if (this.reverseLastTwoChildren && this.drawingOps.size() >= 2) {
            List<DrawingOp> list = this.drawingOps;
            Collections.swap(list, list.size() - 1, this.drawingOps.size() - 2);
        }
        drawAndRelease();
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(view, "child");
        this.drawingOps.add(obtainDrawingOp().set(canvas, view, j));
        return true;
    }

    /* access modifiers changed from: private */
    public final void performDraw(DrawingOp drawingOp) {
        super.drawChild(drawingOp.getCanvas(), drawingOp.getChild(), drawingOp.getDrawingTime());
    }

    private final DrawingOp obtainDrawingOp() {
        if (this.drawingOpPool.isEmpty()) {
            return new DrawingOp();
        }
        List<DrawingOp> list = this.drawingOpPool;
        return list.remove(list.size() - 1);
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0015\u001a\u00020\u0016J)\u0010\u0017\u001a\u00060\u0000R\u00020\u00182\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/swmansion/rnscreens/ScreenStack$DrawingOp;", "", "(Lcom/swmansion/rnscreens/ScreenStack;)V", "canvas", "Landroid/graphics/Canvas;", "getCanvas", "()Landroid/graphics/Canvas;", "setCanvas", "(Landroid/graphics/Canvas;)V", "child", "Landroid/view/View;", "getChild", "()Landroid/view/View;", "setChild", "(Landroid/view/View;)V", "drawingTime", "", "getDrawingTime", "()J", "setDrawingTime", "(J)V", "draw", "", "set", "Lcom/swmansion/rnscreens/ScreenStack;", "react-native-screens_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* compiled from: ScreenStack.kt */
    private final class DrawingOp {
        private Canvas canvas;
        private View child;
        private long drawingTime;

        public DrawingOp() {
        }

        public final Canvas getCanvas() {
            return this.canvas;
        }

        public final void setCanvas(Canvas canvas2) {
            this.canvas = canvas2;
        }

        public final View getChild() {
            return this.child;
        }

        public final void setChild(View view) {
            this.child = view;
        }

        public final long getDrawingTime() {
            return this.drawingTime;
        }

        public final void setDrawingTime(long j) {
            this.drawingTime = j;
        }

        public final DrawingOp set(Canvas canvas2, View view, long j) {
            this.canvas = canvas2;
            this.child = view;
            this.drawingTime = j;
            return this;
        }

        public final void draw() {
            ScreenStack.this.performDraw(this);
            this.canvas = null;
            this.child = null;
            this.drawingTime = 0;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\b"}, d2 = {"Lcom/swmansion/rnscreens/ScreenStack$Companion;", "", "()V", "isTransparent", "", "fragment", "Lcom/swmansion/rnscreens/ScreenStackFragment;", "needsDrawReordering", "react-native-screens_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* compiled from: ScreenStack.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* access modifiers changed from: private */
        public final boolean isTransparent(ScreenStackFragment screenStackFragment) {
            return screenStackFragment.getScreen().getStackPresentation() == Screen.StackPresentation.TRANSPARENT_MODAL;
        }

        /* access modifiers changed from: private */
        public final boolean needsDrawReordering(ScreenStackFragment screenStackFragment) {
            return screenStackFragment.getScreen().getStackAnimation() == Screen.StackAnimation.SLIDE_FROM_BOTTOM || screenStackFragment.getScreen().getStackAnimation() == Screen.StackAnimation.FADE_FROM_BOTTOM;
        }
    }
}
