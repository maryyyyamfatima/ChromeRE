package com.google.vr.cardboard;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Choreographer;
import android.view.Display;
import defpackage.AbstractC5729gq0;
import defpackage.ChoreographerFrameCallbackC10410uU0;
import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public class DisplaySynchronizer implements Choreographer.FrameCallback {
    public static final long l = TimeUnit.SECONDS.toNanos(1);
    public volatile long a;
    public final ChoreographerFrameCallbackC10410uU0 g;
    public volatile Display h;
    public DisplayMetrics i;
    public volatile int j = -1;
    public long k = 0;

    public DisplaySynchronizer(Context context, Display display) {
        this.a = nativeCreate(getClass().getClassLoader(), context.getApplicationContext());
        if (this.a == 0) {
            throw new IllegalStateException("Native DisplaySynchronizer creation failed, implementation unavailable.");
        }
        d(display);
        ChoreographerFrameCallbackC10410uU0 choreographerFrameCallbackC10410uU0 = new ChoreographerFrameCallbackC10410uU0(this);
        this.g = choreographerFrameCallbackC10410uU0;
        HandlerThread handlerThread = choreographerFrameCallbackC10410uU0.g;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), choreographerFrameCallbackC10410uU0);
        choreographerFrameCallbackC10410uU0.h = handler;
        handler.sendEmptyMessage(0);
    }

    public native long nativeCreate(ClassLoader classLoader, Context context);

    public native void nativeDestroy(long j);

    public native void nativeOnMetricsChanged(long j);

    public native void nativeReset(long j, long j2, long j3);

    public native void nativeUpdate(long j, long j2, int i);

    public final void d(Display display) {
        a();
        this.h = display;
        b();
        nativeReset(this.a, display.getRefreshRate() >= 30.0f ? ((float) TimeUnit.SECONDS.toNanos(1L)) / r0 : 0L, display.getAppVsyncOffsetNanos());
    }

    public final void finalize() {
        try {
            if (this.a != 0) {
                Log.w("DisplaySynchronizer", "DisplaySynchronizer.shutdown() should be called to ensure resource cleanup");
                nativeDestroy(this.a);
            }
        } finally {
            super.finalize();
        }
    }

    public void c() {
        b();
    }

    public final void e() {
        if (this.a != 0) {
            ChoreographerFrameCallbackC10410uU0 choreographerFrameCallbackC10410uU0 = this.g;
            if (choreographerFrameCallbackC10410uU0.j) {
                choreographerFrameCallbackC10410uU0.j = false;
                choreographerFrameCallbackC10410uU0.h.sendEmptyMessage(2);
            }
            ChoreographerFrameCallbackC10410uU0 choreographerFrameCallbackC10410uU02 = this.g;
            if (choreographerFrameCallbackC10410uU02.j) {
                choreographerFrameCallbackC10410uU02.j = false;
                choreographerFrameCallbackC10410uU02.h.sendEmptyMessage(2);
            }
            HandlerThread handlerThread = choreographerFrameCallbackC10410uU02.g;
            handlerThread.quitSafely();
            try {
                handlerThread.join();
            } catch (InterruptedException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(valueOf.length() + 45);
                sb.append("Interrupted when shutting down FrameMonitor: ");
                sb.append(valueOf);
                Log.e("uU0", sb.toString());
            }
            nativeDestroy(this.a);
            this.a = 0L;
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        a();
        if (this.j == -1 || j - this.k > l) {
            int rotation = this.h.getRotation();
            if (rotation == 0) {
                this.j = 0;
            } else if (rotation == 1) {
                this.j = 90;
            } else if (rotation == 2) {
                this.j = 180;
            } else if (rotation == 3) {
                this.j = 270;
            } else {
                Log.e("DisplaySynchronizer", "Unknown display rotation, defaulting to 0");
                this.j = 0;
            }
            this.k = j;
        }
        nativeUpdate(this.a, j, this.j);
    }

    public final void a() {
        if (this.a == 0) {
            throw new IllegalStateException("DisplaySynchronizer has already been shut down.");
        }
    }

    public final void b() {
        this.j = -1;
        DisplayMetrics c = AbstractC5729gq0.c(this.h);
        if (c.equals(this.i)) {
            return;
        }
        if (this.i != null) {
            nativeOnMetricsChanged(this.a);
        }
        this.i = c;
    }
}
