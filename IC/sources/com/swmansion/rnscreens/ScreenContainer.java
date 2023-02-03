package com.swmansion.rnscreens;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.ChoreographerCompat;
import com.facebook.react.modules.core.ReactChoreographer;
import com.swmansion.rnscreens.Screen;
import com.swmansion.rnscreens.ScreenFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u000f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0015\u0010\u001d\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00020\u001aH\u0014¢\u0006\u0002\u0010\u001fJ\u0016\u0010 \u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u0016J\u0018\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0002H\u0002J\b\u0010'\u001a\u00020%H\u0004J\u0018\u0010(\u001a\u00020!2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0002H\u0002J\u0010\u0010)\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020+H\u0002J\u0012\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010&\u001a\u00020\u0002H\u0002J\u000e\u0010.\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u0016J\u0012\u0010/\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010\u0002H\u0016J\u0006\u00100\u001a\u00020!J\b\u00101\u001a\u00020!H\u0014J\b\u00102\u001a\u00020!H\u0014J\b\u00103\u001a\u00020!H\u0014J0\u00104\u001a\u00020!2\u0006\u00105\u001a\u00020\b2\u0006\u00106\u001a\u00020\u00162\u0006\u00107\u001a\u00020\u00162\u0006\u00108\u001a\u00020\u00162\u0006\u00109\u001a\u00020\u0016H\u0014J\u0018\u0010:\u001a\u00020!2\u0006\u0010;\u001a\u00020\u00162\u0006\u0010<\u001a\u00020\u0016H\u0014J\b\u0010=\u001a\u00020!H\u0002J\b\u0010>\u001a\u00020!H\u0016J\u0006\u0010?\u001a\u00020!J\b\u0010@\u001a\u00020!H\u0004J\b\u0010A\u001a\u00020!H\u0016J\u0010\u0010B\u001a\u00020!2\u0006\u0010C\u001a\u00020\u000bH\u0002J\u0010\u0010D\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0016H\u0016J\u0010\u0010E\u001a\u00020!2\u0006\u0010F\u001a\u00020GH\u0016J\b\u0010H\u001a\u00020!H\u0016J\u0010\u0010I\u001a\u00020!2\u0006\u0010J\u001a\u00020\u000bH\u0002J\b\u0010K\u001a\u00020!H\u0002R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0004@\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u0002\n\u0000R \u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0013j\b\u0012\u0004\u0012\u00028\u0000`\u00148\u0004X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0015\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u001a8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006L"}, d2 = {"Lcom/swmansion/rnscreens/ScreenContainer;", "T", "Lcom/swmansion/rnscreens/ScreenFragment;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "isNested", "", "()Z", "mFragmentManager", "Landroidx/fragment/app/FragmentManager;", "mIsAttached", "mLayoutCallback", "Lcom/facebook/react/modules/core/ChoreographerCompat$FrameCallback;", "mLayoutEnqueued", "mNeedUpdate", "mParentScreenFragment", "mScreenFragments", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "screenCount", "", "getScreenCount", "()I", "topScreen", "Lcom/swmansion/rnscreens/Screen;", "getTopScreen", "()Lcom/swmansion/rnscreens/Screen;", "adapt", "screen", "(Lcom/swmansion/rnscreens/Screen;)Lcom/swmansion/rnscreens/ScreenFragment;", "addScreen", "", "index", "attachScreen", "transaction", "Landroidx/fragment/app/FragmentTransaction;", "screenFragment", "createTransaction", "detachScreen", "findFragmentManagerForReactRootView", "rootView", "Lcom/facebook/react/ReactRootView;", "getActivityState", "Lcom/swmansion/rnscreens/Screen$ActivityState;", "getScreenAt", "hasScreen", "notifyChildUpdate", "notifyContainerUpdate", "onAttachedToWindow", "onDetachedFromWindow", "onLayout", "changed", "l", "t", "r", "b", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onScreenChanged", "onUpdate", "performUpdates", "performUpdatesNow", "removeAllScreens", "removeMyFragments", "fragmentManager", "removeScreenAt", "removeView", "view", "Landroid/view/View;", "requestLayout", "setFragmentManager", "fm", "setupFragmentManager", "react-native-screens_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: ScreenContainer.kt */
public class ScreenContainer<T extends ScreenFragment> extends ViewGroup {
    protected FragmentManager mFragmentManager;
    private boolean mIsAttached;
    private final ChoreographerCompat.FrameCallback mLayoutCallback = new ScreenContainer$mLayoutCallback$1(this);
    /* access modifiers changed from: private */
    public boolean mLayoutEnqueued;
    private boolean mNeedUpdate;
    private ScreenFragment mParentScreenFragment;
    protected final ArrayList<T> mScreenFragments = new ArrayList<>();

    public ScreenContainer(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            getChildAt(i5).layout(0, 0, getWidth(), getHeight());
        }
    }

    public void removeView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view == getFocusedChild()) {
            Object systemService = getContext().getSystemService("input_method");
            Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(getWindowToken(), 2);
        }
        super.removeView(view);
    }

    public void requestLayout() {
        super.requestLayout();
        if (!this.mLayoutEnqueued && this.mLayoutCallback != null) {
            this.mLayoutEnqueued = true;
            ReactChoreographer.getInstance().postFrameCallback(ReactChoreographer.CallbackType.NATIVE_ANIMATED_MODULE, this.mLayoutCallback);
        }
    }

    public final boolean isNested() {
        return this.mParentScreenFragment != null;
    }

    public final void notifyChildUpdate() {
        performUpdatesNow();
    }

    /* access modifiers changed from: protected */
    public T adapt(Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        return new ScreenFragment(screen);
    }

    public final void addScreen(Screen screen, int i) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        ScreenFragment adapt = adapt(screen);
        screen.setFragment(adapt);
        this.mScreenFragments.add(i, adapt);
        screen.setContainer(this);
        onScreenChanged();
    }

    public void removeScreenAt(int i) {
        ((ScreenFragment) this.mScreenFragments.get(i)).getScreen().setContainer((ScreenContainer<?>) null);
        this.mScreenFragments.remove(i);
        onScreenChanged();
    }

    public void removeAllScreens() {
        Iterator<T> it = this.mScreenFragments.iterator();
        while (it.hasNext()) {
            ((ScreenFragment) it.next()).getScreen().setContainer((ScreenContainer<?>) null);
        }
        this.mScreenFragments.clear();
        onScreenChanged();
    }

    public final int getScreenCount() {
        return this.mScreenFragments.size();
    }

    public final Screen getScreenAt(int i) {
        return ((ScreenFragment) this.mScreenFragments.get(i)).getScreen();
    }

    public Screen getTopScreen() {
        Object obj;
        boolean z;
        Iterator it = this.mScreenFragments.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (getActivityState((ScreenFragment) obj) == Screen.ActivityState.ON_TOP) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        ScreenFragment screenFragment = (ScreenFragment) obj;
        if (screenFragment != null) {
            return screenFragment.getScreen();
        }
        return null;
    }

    private final void setFragmentManager(FragmentManager fragmentManager) {
        this.mFragmentManager = fragmentManager;
        performUpdatesNow();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0015  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final androidx.fragment.app.FragmentManager findFragmentManagerForReactRootView(com.facebook.react.ReactRootView r4) {
        /*
            r3 = this;
            android.content.Context r0 = r4.getContext()
        L_0x0004:
            boolean r1 = r0 instanceof androidx.fragment.app.FragmentActivity
            if (r1 != 0) goto L_0x0013
            boolean r2 = r0 instanceof android.content.ContextWrapper
            if (r2 == 0) goto L_0x0013
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            goto L_0x0004
        L_0x0013:
            if (r1 == 0) goto L_0x0044
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            androidx.fragment.app.FragmentManager r1 = r0.getSupportFragmentManager()
            java.util.List r1 = r1.getFragments()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x002f
            androidx.fragment.app.FragmentManager r4 = r0.getSupportFragmentManager()
            java.lang.String r0 = "{\n            // We are …FragmentManager\n        }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)
            goto L_0x0043
        L_0x002f:
            android.view.View r4 = (android.view.View) r4     // Catch:{ IllegalStateException -> 0x003a }
            androidx.fragment.app.Fragment r4 = androidx.fragment.app.FragmentManager.findFragment(r4)     // Catch:{ IllegalStateException -> 0x003a }
            androidx.fragment.app.FragmentManager r4 = r4.getChildFragmentManager()     // Catch:{ IllegalStateException -> 0x003a }
            goto L_0x003e
        L_0x003a:
            androidx.fragment.app.FragmentManager r4 = r0.getSupportFragmentManager()
        L_0x003e:
            java.lang.String r0 = "{\n            // We are …r\n            }\n        }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)
        L_0x0043:
            return r4
        L_0x0044:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "In order to use RNScreens components your app's activity need to extend ReactActivity"
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.ScreenContainer.findFragmentManagerForReactRootView(com.facebook.react.ReactRootView):androidx.fragment.app.FragmentManager");
    }

    private final void setupFragmentManager() {
        boolean z;
        Unit unit;
        ViewParent viewParent = this;
        while (true) {
            z = viewParent instanceof ReactRootView;
            if (!z && !(viewParent instanceof Screen) && viewParent.getParent() != null) {
                viewParent = viewParent.getParent();
                Intrinsics.checkNotNullExpressionValue(viewParent, "parent.parent");
            }
        }
        if (viewParent instanceof Screen) {
            ScreenFragment fragment = ((Screen) viewParent).getFragment();
            if (fragment != null) {
                this.mParentScreenFragment = fragment;
                fragment.registerChildScreenContainer(this);
                FragmentManager childFragmentManager = fragment.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "screenFragment.childFragmentManager");
                setFragmentManager(childFragmentManager);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                throw new IllegalStateException("Parent Screen does not have its Fragment attached".toString());
            }
        } else if (z) {
            setFragmentManager(findFragmentManagerForReactRootView((ReactRootView) viewParent));
        } else {
            throw new IllegalStateException("ScreenContainer is not attached under ReactRootView".toString());
        }
    }

    /* access modifiers changed from: protected */
    public final FragmentTransaction createTransaction() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            FragmentTransaction reorderingAllowed = fragmentManager.beginTransaction().setReorderingAllowed(true);
            Intrinsics.checkNotNullExpressionValue(reorderingAllowed, "requireNotNull(mFragment…etReorderingAllowed(true)");
            return reorderingAllowed;
        }
        throw new IllegalArgumentException("mFragmentManager is null when creating transaction".toString());
    }

    private final void attachScreen(FragmentTransaction fragmentTransaction, ScreenFragment screenFragment) {
        fragmentTransaction.add(getId(), (Fragment) screenFragment);
    }

    private final void detachScreen(FragmentTransaction fragmentTransaction, ScreenFragment screenFragment) {
        fragmentTransaction.remove(screenFragment);
    }

    private final Screen.ActivityState getActivityState(ScreenFragment screenFragment) {
        return screenFragment.getScreen().getActivityState();
    }

    public boolean hasScreen(ScreenFragment screenFragment) {
        return CollectionsKt.contains(this.mScreenFragments, screenFragment);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mIsAttached = true;
        setupFragmentManager();
    }

    private final void removeMyFragments(FragmentManager fragmentManager) {
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(beginTransaction, "fragmentManager.beginTransaction()");
        boolean z = false;
        for (Fragment next : fragmentManager.getFragments()) {
            if ((next instanceof ScreenFragment) && ((ScreenFragment) next).getScreen().getContainer() == this) {
                beginTransaction.remove(next);
                z = true;
            }
        }
        if (z) {
            beginTransaction.commitNowAllowingStateLoss();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null && !fragmentManager.isDestroyed()) {
            removeMyFragments(fragmentManager);
            fragmentManager.executePendingTransactions();
        }
        ScreenFragment screenFragment = this.mParentScreenFragment;
        if (screenFragment != null) {
            screenFragment.unregisterChildScreenContainer(this);
        }
        this.mParentScreenFragment = null;
        super.onDetachedFromWindow();
        this.mIsAttached = false;
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 < childCount) {
                removeViewAt(childCount);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).measure(i, i2);
        }
    }

    private final void onScreenChanged() {
        this.mNeedUpdate = true;
        Context context = getContext();
        ReactContext reactContext = context instanceof ReactContext ? (ReactContext) context : null;
        if (reactContext != null) {
            reactContext.runOnUiQueueThread(new Runnable() {
                public final void run() {
                    ScreenContainer.m3onScreenChanged$lambda7(ScreenContainer.this);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: onScreenChanged$lambda-7  reason: not valid java name */
    public static final void m3onScreenChanged$lambda7(ScreenContainer screenContainer) {
        Intrinsics.checkNotNullParameter(screenContainer, "this$0");
        screenContainer.performUpdates();
    }

    /* access modifiers changed from: protected */
    public final void performUpdatesNow() {
        this.mNeedUpdate = true;
        performUpdates();
    }

    public final void performUpdates() {
        FragmentManager fragmentManager;
        if (this.mNeedUpdate && this.mIsAttached && (fragmentManager = this.mFragmentManager) != null) {
            boolean z = true;
            if (fragmentManager == null || !fragmentManager.isDestroyed()) {
                z = false;
            }
            if (!z) {
                this.mNeedUpdate = false;
                onUpdate();
                notifyContainerUpdate();
            }
        }
    }

    public void onUpdate() {
        FragmentTransaction createTransaction = createTransaction();
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            Set hashSet = new HashSet(fragmentManager.getFragments());
            Iterator<T> it = this.mScreenFragments.iterator();
            while (it.hasNext()) {
                ScreenFragment screenFragment = (ScreenFragment) it.next();
                Intrinsics.checkNotNullExpressionValue(screenFragment, "screenFragment");
                if (getActivityState(screenFragment) == Screen.ActivityState.INACTIVE && screenFragment.isAdded()) {
                    detachScreen(createTransaction, screenFragment);
                }
                hashSet.remove(screenFragment);
            }
            Collection collection = hashSet;
            boolean z = false;
            if (!collection.isEmpty()) {
                Object[] array = collection.toArray(new Fragment[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                for (Fragment fragment : (Fragment[]) array) {
                    if (fragment instanceof ScreenFragment) {
                        ScreenFragment screenFragment2 = (ScreenFragment) fragment;
                        if (screenFragment2.getScreen().getContainer() == null) {
                            detachScreen(createTransaction, screenFragment2);
                        }
                    }
                }
            }
            boolean z2 = getTopScreen() == null;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = this.mScreenFragments.iterator();
            while (it2.hasNext()) {
                ScreenFragment screenFragment3 = (ScreenFragment) it2.next();
                Intrinsics.checkNotNullExpressionValue(screenFragment3, "screenFragment");
                Screen.ActivityState activityState = getActivityState(screenFragment3);
                if (activityState != Screen.ActivityState.INACTIVE && !screenFragment3.isAdded()) {
                    attachScreen(createTransaction, screenFragment3);
                    z = true;
                } else if (activityState != Screen.ActivityState.INACTIVE && z) {
                    detachScreen(createTransaction, screenFragment3);
                    arrayList.add(screenFragment3);
                }
                screenFragment3.getScreen().setTransitioning(z2);
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ScreenFragment screenFragment4 = (ScreenFragment) it3.next();
                Intrinsics.checkNotNullExpressionValue(screenFragment4, "screenFragment");
                attachScreen(createTransaction, screenFragment4);
            }
            createTransaction.commitNowAllowingStateLoss();
            return;
        }
        throw new IllegalArgumentException("mFragmentManager is null when performing update in ScreenContainer".toString());
    }

    /* access modifiers changed from: protected */
    public void notifyContainerUpdate() {
        ScreenFragment fragment;
        Screen topScreen = getTopScreen();
        if (topScreen != null && (fragment = topScreen.getFragment()) != null) {
            fragment.onContainerUpdate();
        }
    }
}
