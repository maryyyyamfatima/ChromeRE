package com.google.vr.ndk.base;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.animation.AnimationUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
class FadeOverlayView extends View {
    private final boolean autoFadeEnabled;
    private final Handler autoFadeHandler;
    private long fadeDurationMillis;
    private float fadeStartOpacity;
    private long fadeStartTimeMillis;
    private int fadeType;
    private final Runnable fadeUpdateRunnable;
    private boolean flushAutoFadeOnVisible;
    private boolean visible;

    public FadeOverlayView(Context context, boolean z) {
        super(context);
        this.fadeType = 0;
        this.fadeUpdateRunnable = new Runnable() { // from class: com.google.vr.ndk.base.FadeOverlayView.1
            @Override // java.lang.Runnable
            public void run() {
                FadeOverlayView.this.updateFade();
            }
        };
        this.autoFadeHandler = new Handler(Looper.getMainLooper()) { // from class: com.google.vr.ndk.base.FadeOverlayView.2
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.what == 77337733) {
                    FadeOverlayView.this.startFade(1, 350L, -16777216);
                } else {
                    super.handleMessage(message);
                }
            }
        };
        setBackgroundColor(-16777216);
        this.autoFadeEnabled = z;
    }

    public void startFade(int i, long j, int i2) {
        if (!isEnabled()) {
            Log.w("FadeOverlayView", "Ignoring fade request while disabled.");
            return;
        }
        if (!this.visible) {
            Log.w("FadeOverlayView", "Ignoring fade request while invisible.");
            return;
        }
        setBackgroundColor(i2);
        removeFadeCallbacks();
        this.fadeType = i;
        this.fadeDurationMillis = j;
        this.fadeStartTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        this.fadeStartOpacity = getAlpha();
        updateFade();
    }

    public void onInvisible() {
        if (this.visible) {
            this.visible = false;
            if (isEnabled() && this.autoFadeEnabled) {
                removeFadeCallbacks();
                this.fadeType = 2;
                endFade();
            }
        }
    }

    public void onVisible() {
        if (this.visible && getAlpha() == 0.0f) {
            return;
        }
        this.visible = true;
        if (isEnabled() && this.autoFadeEnabled) {
            removeFadeCallbacks();
            this.autoFadeHandler.sendEmptyMessageDelayed(77337733, this.flushAutoFadeOnVisible ? 200L : 1000L);
        } else {
            this.fadeType = 1;
            endFade();
        }
    }

    public void flushAutoFade() {
        if (this.autoFadeEnabled) {
            if (this.autoFadeHandler.hasMessages(77337733)) {
                this.autoFadeHandler.removeMessages(77337733);
                this.autoFadeHandler.sendEmptyMessageDelayed(77337733, 200L);
            } else {
                if (this.visible) {
                    return;
                }
                this.flushAutoFadeOnVisible = true;
            }
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        if (isEnabled() == z) {
            return;
        }
        super.setEnabled(z);
        if (z) {
            return;
        }
        removeFadeCallbacks();
        this.fadeType = 1;
        endFade();
    }

    private void removeFadeCallbacks() {
        this.autoFadeHandler.removeMessages(77337733);
        removeCallbacks(this.fadeUpdateRunnable);
    }

    private void endFade() {
        int i = this.fadeType;
        if (i == 0) {
            return;
        }
        setVisibility(i == 2 ? 0 : 8);
        setAlpha(this.fadeType == 2 ? 1.0f : 0.0f);
        removeCallbacks(this.fadeUpdateRunnable);
        this.fadeType = 0;
        this.flushAutoFadeOnVisible = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateFade() {
        int i;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis() - this.fadeStartTimeMillis;
        float f = ((float) currentAnimationTimeMillis) / ((float) this.fadeDurationMillis);
        if (this.fadeType == 1) {
            f = -f;
        }
        float min = Math.min(Math.max(this.fadeStartOpacity + f, 0.0f), 1.0f);
        setAlpha(min);
        if (currentAnimationTimeMillis < this.fadeDurationMillis && getVisibility() != 0) {
            setVisibility(0);
        }
        if (currentAnimationTimeMillis >= this.fadeDurationMillis || (((i = this.fadeType) == 1 && min <= 0.0f) || (i == 2 && min >= 1.0f))) {
            endFade();
        } else {
            postOnAnimation(this.fadeUpdateRunnable);
        }
    }
}
