package com.swmansion.gesturehandler;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

public class PanGestureHandler extends GestureHandler<PanGestureHandler> {
    private static int DEFAULT_MAX_POINTERS = 10;
    private static int DEFAULT_MIN_POINTERS = 1;
    private static float MAX_VALUE_IGNORE = Float.MIN_VALUE;
    private static float MIN_VALUE_IGNORE = Float.MAX_VALUE;
    private float mActiveOffsetXEnd;
    private float mActiveOffsetXStart;
    private float mActiveOffsetYEnd;
    private float mActiveOffsetYStart;
    private boolean mAverageTouches;
    private float mFailOffsetXEnd;
    private float mFailOffsetXStart;
    private float mFailOffsetYEnd;
    private float mFailOffsetYStart;
    private float mLastVelocityX;
    private float mLastVelocityY;
    private float mLastX;
    private float mLastY;
    private int mMaxPointers = DEFAULT_MAX_POINTERS;
    private float mMinDistSq;
    private int mMinPointers = DEFAULT_MIN_POINTERS;
    private float mMinVelocitySq;
    private float mMinVelocityX;
    private float mMinVelocityY;
    private float mOffsetX;
    private float mOffsetY;
    private float mStartX;
    private float mStartY;
    private VelocityTracker mVelocityTracker;

    public PanGestureHandler(Context context) {
        float f = MAX_VALUE_IGNORE;
        this.mMinDistSq = f;
        float f2 = MIN_VALUE_IGNORE;
        this.mActiveOffsetXStart = f2;
        this.mActiveOffsetXEnd = f;
        this.mFailOffsetXStart = f;
        this.mFailOffsetXEnd = f2;
        this.mActiveOffsetYStart = f2;
        this.mActiveOffsetYEnd = f;
        this.mFailOffsetYStart = f;
        this.mFailOffsetYEnd = f2;
        this.mMinVelocityX = f2;
        this.mMinVelocityY = f2;
        this.mMinVelocitySq = f2;
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.mMinDistSq = (float) (scaledTouchSlop * scaledTouchSlop);
    }

    public PanGestureHandler setActiveOffsetXStart(float f) {
        this.mActiveOffsetXStart = f;
        return this;
    }

    public PanGestureHandler setActiveOffsetXEnd(float f) {
        this.mActiveOffsetXEnd = f;
        return this;
    }

    public PanGestureHandler setFailOffsetXStart(float f) {
        this.mFailOffsetXStart = f;
        return this;
    }

    public PanGestureHandler setFailOffsetXEnd(float f) {
        this.mFailOffsetXEnd = f;
        return this;
    }

    public PanGestureHandler setActiveOffsetYStart(float f) {
        this.mActiveOffsetYStart = f;
        return this;
    }

    public PanGestureHandler setActiveOffsetYEnd(float f) {
        this.mActiveOffsetYEnd = f;
        return this;
    }

    public PanGestureHandler setFailOffsetYStart(float f) {
        this.mFailOffsetYStart = f;
        return this;
    }

    public PanGestureHandler setFailOffsetYEnd(float f) {
        this.mFailOffsetYEnd = f;
        return this;
    }

    public PanGestureHandler setMinDist(float f) {
        this.mMinDistSq = f * f;
        return this;
    }

    public PanGestureHandler setMinPointers(int i) {
        this.mMinPointers = i;
        return this;
    }

    public PanGestureHandler setMaxPointers(int i) {
        this.mMaxPointers = i;
        return this;
    }

    public PanGestureHandler setAverageTouches(boolean z) {
        this.mAverageTouches = z;
        return this;
    }

    public PanGestureHandler setMinVelocity(float f) {
        this.mMinVelocitySq = f * f;
        return this;
    }

    public PanGestureHandler setMinVelocityX(float f) {
        this.mMinVelocityX = f;
        return this;
    }

    public PanGestureHandler setMinVelocityY(float f) {
        this.mMinVelocityY = f;
        return this;
    }

    private boolean shouldActivate() {
        float f = (this.mLastX - this.mStartX) + this.mOffsetX;
        float f2 = this.mActiveOffsetXStart;
        float f3 = MIN_VALUE_IGNORE;
        if (f2 != f3 && f < f2) {
            return true;
        }
        float f4 = this.mActiveOffsetXEnd;
        float f5 = MAX_VALUE_IGNORE;
        if (f4 != f5 && f > f4) {
            return true;
        }
        float f6 = (this.mLastY - this.mStartY) + this.mOffsetY;
        float f7 = this.mActiveOffsetYStart;
        if (f7 != f3 && f6 < f7) {
            return true;
        }
        float f8 = this.mActiveOffsetYEnd;
        if (f8 != f5 && f6 > f8) {
            return true;
        }
        float f9 = (f * f) + (f6 * f6);
        float f10 = this.mMinDistSq;
        if (f10 != f3 && f9 >= f10) {
            return true;
        }
        float f11 = this.mLastVelocityX;
        float f12 = this.mMinVelocityX;
        if (f12 != f3 && ((f12 < 0.0f && f11 <= f12) || (f12 >= 0.0f && f11 >= f12))) {
            return true;
        }
        float f13 = this.mLastVelocityY;
        float f14 = this.mMinVelocityY;
        if (f14 != f3 && ((f14 < 0.0f && f11 <= f14) || (f14 >= 0.0f && f11 >= f14))) {
            return true;
        }
        float f15 = (f11 * f11) + (f13 * f13);
        float f16 = this.mMinVelocitySq;
        if (f16 == f3 || f15 < f16) {
            return false;
        }
        return true;
    }

    private boolean shouldFail() {
        float f = (this.mLastX - this.mStartX) + this.mOffsetX;
        float f2 = this.mFailOffsetXStart;
        float f3 = MAX_VALUE_IGNORE;
        if (f2 != f3 && f < f2) {
            return true;
        }
        float f4 = this.mFailOffsetXEnd;
        float f5 = MIN_VALUE_IGNORE;
        if (f4 != f5 && f > f4) {
            return true;
        }
        float f6 = (this.mLastY - this.mStartY) + this.mOffsetY;
        float f7 = this.mFailOffsetYStart;
        if (f7 != f3 && f6 < f7) {
            return true;
        }
        float f8 = this.mFailOffsetYEnd;
        if (f8 == f5 || f6 <= f8) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onHandle(MotionEvent motionEvent) {
        int state = getState();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 6 || actionMasked == 5) {
            this.mOffsetX += this.mLastX - this.mStartX;
            this.mOffsetY += this.mLastY - this.mStartY;
            this.mLastX = GestureUtils.getLastPointerX(motionEvent, this.mAverageTouches);
            float lastPointerY = GestureUtils.getLastPointerY(motionEvent, this.mAverageTouches);
            this.mLastY = lastPointerY;
            this.mStartX = this.mLastX;
            this.mStartY = lastPointerY;
        } else {
            this.mLastX = GestureUtils.getLastPointerX(motionEvent, this.mAverageTouches);
            this.mLastY = GestureUtils.getLastPointerY(motionEvent, this.mAverageTouches);
        }
        if (state != 0 || motionEvent.getPointerCount() < this.mMinPointers) {
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                addVelocityMovement(velocityTracker, motionEvent);
                this.mVelocityTracker.computeCurrentVelocity(1000);
                this.mLastVelocityX = this.mVelocityTracker.getXVelocity();
                this.mLastVelocityY = this.mVelocityTracker.getYVelocity();
            }
        } else {
            this.mStartX = this.mLastX;
            this.mStartY = this.mLastY;
            this.mOffsetX = 0.0f;
            this.mOffsetY = 0.0f;
            VelocityTracker obtain = VelocityTracker.obtain();
            this.mVelocityTracker = obtain;
            addVelocityMovement(obtain, motionEvent);
            begin();
        }
        if (actionMasked == 1) {
            if (state == 4 || state == 2) {
                end();
            } else {
                fail();
            }
        } else if (actionMasked != 5 || motionEvent.getPointerCount() <= this.mMaxPointers) {
            if (actionMasked == 6 && state == 4 && motionEvent.getPointerCount() < this.mMinPointers) {
                fail();
            } else if (state != 2) {
            } else {
                if (shouldFail()) {
                    fail();
                } else if (shouldActivate()) {
                    this.mStartX = this.mLastX;
                    this.mStartY = this.mLastY;
                    activate();
                }
            }
        } else if (state == 4) {
            cancel();
        } else {
            fail();
        }
    }

    /* access modifiers changed from: protected */
    public void onReset() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    public float getTranslationX() {
        return (this.mLastX - this.mStartX) + this.mOffsetX;
    }

    public float getTranslationY() {
        return (this.mLastY - this.mStartY) + this.mOffsetY;
    }

    public float getVelocityX() {
        return this.mLastVelocityX;
    }

    public float getVelocityY() {
        return this.mLastVelocityY;
    }

    private static void addVelocityMovement(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX() - motionEvent.getX();
        float rawY = motionEvent.getRawY() - motionEvent.getY();
        motionEvent.offsetLocation(rawX, rawY);
        velocityTracker.addMovement(motionEvent);
        motionEvent.offsetLocation(-rawX, -rawY);
    }
}
