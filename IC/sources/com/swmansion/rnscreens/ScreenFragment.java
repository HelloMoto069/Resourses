package com.swmansion.rnscreens;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.swmansion.rnscreens.events.HeaderBackButtonClickedEvent;
import com.swmansion.rnscreens.events.ScreenAppearEvent;
import com.swmansion.rnscreens.events.ScreenDisappearEvent;
import com.swmansion.rnscreens.events.ScreenDismissedEvent;
import com.swmansion.rnscreens.events.ScreenTransitionProgressEvent;
import com.swmansion.rnscreens.events.ScreenWillAppearEvent;
import com.swmansion.rnscreens.events.ScreenWillDisappearEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 @2\u00020\u0001:\u0003@ABB\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u0000H\u0002J\u0010\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0006\u0010 \u001a\u00020\u001dJ\b\u0010!\u001a\u00020\u001dH\u0002J\b\u0010\"\u001a\u00020\u001dH\u0002J\b\u0010#\u001a\u00020\u001dH\u0002J\b\u0010$\u001a\u00020\u001dH\u0002J\u0016\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u0007J\u0010\u0010(\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020\u0007H\u0002J\b\u0010*\u001a\u00020\u001dH\u0016J&\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u0001002\b\u00101\u001a\u0004\u0018\u000102H\u0016J\b\u00103\u001a\u00020\u001dH\u0016J\b\u00104\u001a\u00020\u001dH\u0016J\b\u00105\u001a\u00020\u001dH\u0016J\u0006\u00106\u001a\u00020\u001dJ\u0012\u00107\u001a\u00020\u001d2\n\u00108\u001a\u0006\u0012\u0002\b\u00030\u000bJ\u0010\u00109\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010:\u001a\u0004\u0018\u00010;J\b\u0010<\u001a\u0004\u0018\u00010=J\u0012\u0010>\u001a\u00020\u001d2\n\u00108\u001a\u0006\u0012\u0002\b\u00030\u000bJ\b\u0010?\u001a\u00020\u001dH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R \u0010\u0013\u001a\u00020\u0004X.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0014\u0010\u0002\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0005R\u000e\u0010\u0018\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006C"}, d2 = {"Lcom/swmansion/rnscreens/ScreenFragment;", "Landroidx/fragment/app/Fragment;", "()V", "screenView", "Lcom/swmansion/rnscreens/Screen;", "(Lcom/swmansion/rnscreens/Screen;)V", "canDispatchAppear", "", "canDispatchWillAppear", "childScreenContainers", "", "Lcom/swmansion/rnscreens/ScreenContainer;", "getChildScreenContainers", "()Ljava/util/List;", "isTransitioning", "mChildScreenContainers", "", "mProgress", "", "screen", "getScreen$annotations", "getScreen", "()Lcom/swmansion/rnscreens/Screen;", "setScreen", "shouldUpdateOnResume", "canDispatchEvent", "event", "Lcom/swmansion/rnscreens/ScreenFragment$ScreenLifecycleEvent;", "dispatchEvent", "", "fragment", "dispatchEventInChildContainers", "dispatchHeaderBackButtonClickedEvent", "dispatchOnAppear", "dispatchOnDisappear", "dispatchOnWillAppear", "dispatchOnWillDisappear", "dispatchTransitionProgress", "alpha", "closing", "dispatchViewAnimationEvent", "animationEnd", "onContainerUpdate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onResume", "onViewAnimationEnd", "onViewAnimationStart", "registerChildScreenContainer", "screenContainer", "setLastEventDispatched", "tryGetActivity", "Landroid/app/Activity;", "tryGetContext", "Lcom/facebook/react/bridge/ReactContext;", "unregisterChildScreenContainer", "updateWindowTraits", "Companion", "ScreenLifecycleEvent", "ScreensFrameLayout", "react-native-screens_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: ScreenFragment.kt */
public class ScreenFragment extends Fragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private boolean canDispatchAppear = true;
    private boolean canDispatchWillAppear = true;
    private boolean isTransitioning;
    private final List<ScreenContainer<?>> mChildScreenContainers = new ArrayList();
    private float mProgress = -1.0f;
    public Screen screen;
    private boolean shouldUpdateOnResume;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/swmansion/rnscreens/ScreenFragment$ScreenLifecycleEvent;", "", "(Ljava/lang/String;I)V", "Appear", "WillAppear", "Disappear", "WillDisappear", "react-native-screens_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* compiled from: ScreenFragment.kt */
    public enum ScreenLifecycleEvent {
        Appear,
        WillAppear,
        Disappear,
        WillDisappear
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* compiled from: ScreenFragment.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ScreenLifecycleEvent.values().length];
            iArr[ScreenLifecycleEvent.WillAppear.ordinal()] = 1;
            iArr[ScreenLifecycleEvent.Appear.ordinal()] = 2;
            iArr[ScreenLifecycleEvent.WillDisappear.ordinal()] = 3;
            iArr[ScreenLifecycleEvent.Disappear.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ void getScreen$annotations() {
    }

    @JvmStatic
    protected static final View recycleView(View view) {
        return Companion.recycleView(view);
    }

    public final Screen getScreen() {
        Screen screen2 = this.screen;
        if (screen2 != null) {
            return screen2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("screen");
        return null;
    }

    public final void setScreen(Screen screen2) {
        Intrinsics.checkNotNullParameter(screen2, "<set-?>");
        this.screen = screen2;
    }

    public ScreenFragment() {
        throw new IllegalStateException("Screen fragments should never be restored. Follow instructions from https://github.com/software-mansion/react-native-screens/issues/17#issuecomment-424704067 to properly configure your main activity.");
    }

    public ScreenFragment(Screen screen2) {
        Intrinsics.checkNotNullParameter(screen2, "screenView");
        setScreen(screen2);
    }

    public void onResume() {
        super.onResume();
        if (this.shouldUpdateOnResume) {
            this.shouldUpdateOnResume = false;
            ScreenWindowTraits.INSTANCE.trySetWindowTraits$react_native_screens_release(getScreen(), tryGetActivity(), tryGetContext());
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ScreensFrameLayout screensFrameLayout;
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        getScreen().setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Context context = getContext();
        if (context != null) {
            screensFrameLayout = new ScreensFrameLayout(context);
            screensFrameLayout.addView(recycleView(getScreen()));
        } else {
            screensFrameLayout = null;
        }
        return screensFrameLayout;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/swmansion/rnscreens/ScreenFragment$ScreensFrameLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "clearFocus", "", "react-native-screens_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* compiled from: ScreenFragment.kt */
    private static final class ScreensFrameLayout extends FrameLayout {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ScreensFrameLayout(Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
        }

        public void clearFocus() {
            if (getVisibility() != 4) {
                super.clearFocus();
            }
        }
    }

    public void onContainerUpdate() {
        updateWindowTraits();
    }

    private final void updateWindowTraits() {
        Activity activity = getActivity();
        if (activity == null) {
            this.shouldUpdateOnResume = true;
        } else {
            ScreenWindowTraits.INSTANCE.trySetWindowTraits$react_native_screens_release(getScreen(), activity, tryGetContext());
        }
    }

    public final Activity tryGetActivity() {
        ScreenFragment fragment;
        FragmentActivity activity;
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            return activity2;
        }
        Context context = getScreen().getContext();
        if (context instanceof ReactContext) {
            ReactContext reactContext = (ReactContext) context;
            if (reactContext.getCurrentActivity() != null) {
                return reactContext.getCurrentActivity();
            }
        }
        for (ViewParent container = getScreen().getContainer(); container != null; container = container.getParent()) {
            if ((container instanceof Screen) && (fragment = ((Screen) container).getFragment()) != null && (activity = fragment.getActivity()) != null) {
                return activity;
            }
        }
        return null;
    }

    public final ReactContext tryGetContext() {
        if (getContext() instanceof ReactContext) {
            Context context = getContext();
            Objects.requireNonNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            return (ReactContext) context;
        } else if (getScreen().getContext() instanceof ReactContext) {
            Context context2 = getScreen().getContext();
            Objects.requireNonNull(context2, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            return (ReactContext) context2;
        } else {
            for (ViewParent container = getScreen().getContainer(); container != null; container = container.getParent()) {
                if (container instanceof Screen) {
                    Screen screen2 = (Screen) container;
                    if (screen2.getContext() instanceof ReactContext) {
                        Context context3 = screen2.getContext();
                        Objects.requireNonNull(context3, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                        return (ReactContext) context3;
                    }
                }
            }
            return null;
        }
    }

    public final List<ScreenContainer<?>> getChildScreenContainers() {
        return this.mChildScreenContainers;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0024 A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean canDispatchEvent(com.swmansion.rnscreens.ScreenFragment.ScreenLifecycleEvent r4) {
        /*
            r3 = this;
            int[] r0 = com.swmansion.rnscreens.ScreenFragment.WhenMappings.$EnumSwitchMapping$0
            int r4 = r4.ordinal()
            r4 = r0[r4]
            r0 = 0
            r1 = 1
            if (r4 == r1) goto L_0x0029
            r2 = 2
            if (r4 == r2) goto L_0x0026
            r2 = 3
            if (r4 == r2) goto L_0x0020
            r2 = 4
            if (r4 != r2) goto L_0x001a
            boolean r4 = r3.canDispatchAppear
            if (r4 != 0) goto L_0x002b
            goto L_0x0024
        L_0x001a:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        L_0x0020:
            boolean r4 = r3.canDispatchWillAppear
            if (r4 != 0) goto L_0x002b
        L_0x0024:
            r0 = 1
            goto L_0x002b
        L_0x0026:
            boolean r0 = r3.canDispatchAppear
            goto L_0x002b
        L_0x0029:
            boolean r0 = r3.canDispatchWillAppear
        L_0x002b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.ScreenFragment.canDispatchEvent(com.swmansion.rnscreens.ScreenFragment$ScreenLifecycleEvent):boolean");
    }

    private final void setLastEventDispatched(ScreenLifecycleEvent screenLifecycleEvent) {
        int i = WhenMappings.$EnumSwitchMapping$0[screenLifecycleEvent.ordinal()];
        if (i == 1) {
            this.canDispatchWillAppear = false;
        } else if (i == 2) {
            this.canDispatchAppear = false;
        } else if (i == 3) {
            this.canDispatchWillAppear = true;
        } else if (i == 4) {
            this.canDispatchAppear = true;
        }
    }

    private final void dispatchOnWillAppear() {
        dispatchEvent(ScreenLifecycleEvent.WillAppear, this);
        dispatchTransitionProgress(0.0f, false);
    }

    private final void dispatchOnAppear() {
        dispatchEvent(ScreenLifecycleEvent.Appear, this);
        dispatchTransitionProgress(1.0f, false);
    }

    private final void dispatchOnWillDisappear() {
        dispatchEvent(ScreenLifecycleEvent.WillDisappear, this);
        dispatchTransitionProgress(0.0f, true);
    }

    private final void dispatchOnDisappear() {
        dispatchEvent(ScreenLifecycleEvent.Disappear, this);
        dispatchTransitionProgress(1.0f, true);
    }

    private final void dispatchEvent(ScreenLifecycleEvent screenLifecycleEvent, ScreenFragment screenFragment) {
        Event event;
        if ((screenFragment instanceof ScreenStackFragment) && screenFragment.canDispatchEvent(screenLifecycleEvent)) {
            Screen screen2 = screenFragment.getScreen();
            screenFragment.setLastEventDispatched(screenLifecycleEvent);
            int i = WhenMappings.$EnumSwitchMapping$0[screenLifecycleEvent.ordinal()];
            if (i == 1) {
                event = new ScreenWillAppearEvent(screen2.getId());
            } else if (i == 2) {
                event = new ScreenAppearEvent(screen2.getId());
            } else if (i == 3) {
                event = new ScreenWillDisappearEvent(screen2.getId());
            } else if (i == 4) {
                event = new ScreenDisappearEvent(screen2.getId());
            } else {
                throw new NoWhenBranchMatchedException();
            }
            Context context = getScreen().getContext();
            Objects.requireNonNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, getScreen().getId());
            if (eventDispatcherForReactTag != null) {
                eventDispatcherForReactTag.dispatchEvent(event);
            }
            screenFragment.dispatchEventInChildContainers(screenLifecycleEvent);
        }
    }

    private final void dispatchEventInChildContainers(ScreenLifecycleEvent screenLifecycleEvent) {
        ScreenFragment fragment;
        Collection arrayList = new ArrayList();
        for (Object next : this.mChildScreenContainers) {
            if (((ScreenContainer) next).getScreenCount() > 0) {
                arrayList.add(next);
            }
        }
        for (ScreenContainer topScreen : (List) arrayList) {
            Screen topScreen2 = topScreen.getTopScreen();
            if (!(topScreen2 == null || (fragment = topScreen2.getFragment()) == null)) {
                dispatchEvent(screenLifecycleEvent, fragment);
            }
        }
    }

    public final void dispatchHeaderBackButtonClickedEvent() {
        Context context = getScreen().getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, getScreen().getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new HeaderBackButtonClickedEvent(getScreen().getId()));
        }
    }

    public final void dispatchTransitionProgress(float f, boolean z) {
        if (this instanceof ScreenStackFragment) {
            int i = 1;
            if (!(this.mProgress == f)) {
                float max = Math.max(0.0f, Math.min(1.0f, f));
                this.mProgress = max;
                if (!(max == 0.0f)) {
                    if (max != 1.0f) {
                        i = 0;
                    }
                    i = i != 0 ? 2 : 3;
                }
                short s = (short) i;
                ScreenContainer<?> container = getScreen().getContainer();
                boolean goingForward = container instanceof ScreenStack ? ((ScreenStack) container).getGoingForward() : false;
                Context context = getScreen().getContext();
                Objects.requireNonNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, getScreen().getId());
                if (eventDispatcherForReactTag != null) {
                    eventDispatcherForReactTag.dispatchEvent(new ScreenTransitionProgressEvent(getScreen().getId(), this.mProgress, z, goingForward, s));
                }
            }
        }
    }

    public final void registerChildScreenContainer(ScreenContainer<?> screenContainer) {
        Intrinsics.checkNotNullParameter(screenContainer, "screenContainer");
        this.mChildScreenContainers.add(screenContainer);
    }

    public final void unregisterChildScreenContainer(ScreenContainer<?> screenContainer) {
        Intrinsics.checkNotNullParameter(screenContainer, "screenContainer");
        this.mChildScreenContainers.remove(screenContainer);
    }

    public final void onViewAnimationStart() {
        dispatchViewAnimationEvent(false);
    }

    public void onViewAnimationEnd() {
        dispatchViewAnimationEvent(true);
    }

    private final void dispatchViewAnimationEvent(boolean z) {
        this.isTransitioning = !z;
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null && (!(parentFragment instanceof ScreenFragment) || ((ScreenFragment) parentFragment).isTransitioning)) {
            return;
        }
        if (isResumed()) {
            UiThreadUtil.runOnUiThread(new Runnable(z, this) {
                public final /* synthetic */ boolean f$0;
                public final /* synthetic */ ScreenFragment f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final void run() {
                    ScreenFragment.m4dispatchViewAnimationEvent$lambda8(this.f$0, this.f$1);
                }
            });
        } else if (z) {
            dispatchOnDisappear();
        } else {
            dispatchOnWillDisappear();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: dispatchViewAnimationEvent$lambda-8  reason: not valid java name */
    public static final void m4dispatchViewAnimationEvent$lambda8(boolean z, ScreenFragment screenFragment) {
        Intrinsics.checkNotNullParameter(screenFragment, "this$0");
        if (z) {
            screenFragment.dispatchOnAppear();
        } else {
            screenFragment.dispatchOnWillAppear();
        }
    }

    public void onDestroy() {
        EventDispatcher eventDispatcherForReactTag;
        super.onDestroy();
        ScreenContainer<?> container = getScreen().getContainer();
        if (container == null || !container.hasScreen(this)) {
            Context context = getScreen().getContext();
            if ((context instanceof ReactContext) && (eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, getScreen().getId())) != null) {
                eventDispatcherForReactTag.dispatchEvent(new ScreenDismissedEvent(getScreen().getId()));
            }
        }
        this.mChildScreenContainers.clear();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0005¨\u0006\u0006"}, d2 = {"Lcom/swmansion/rnscreens/ScreenFragment$Companion;", "", "()V", "recycleView", "Landroid/view/View;", "view", "react-native-screens_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* compiled from: ScreenFragment.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* access modifiers changed from: protected */
        @JvmStatic
        public final View recycleView(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            ViewParent parent = view.getParent();
            if (parent != null) {
                ViewGroup viewGroup = (ViewGroup) parent;
                viewGroup.endViewTransition(view);
                viewGroup.removeView(view);
            }
            view.setVisibility(0);
            return view;
        }
    }
}
