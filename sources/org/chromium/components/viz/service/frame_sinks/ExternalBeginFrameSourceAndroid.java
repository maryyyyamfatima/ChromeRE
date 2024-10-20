package org.chromium.components.viz.service.frame_sinks;

import J.N;
import android.view.Choreographer;
import org.chromium.base.TraceEvent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ExternalBeginFrameSourceAndroid implements Choreographer.FrameCallback {
    public boolean a;
    public boolean g;
    public long h;
    public boolean i;
    public boolean j;
    public final Choreographer k;
    public long l;
    public final long m;
    public boolean n;

    public ExternalBeginFrameSourceAndroid(long j, float f) {
        updateRefreshRate(f);
        this.k = Choreographer.getInstance();
        this.l = System.nanoTime();
        this.m = j;
    }

    public final void setEnabled(boolean z) {
        if (this.n == z) {
            return;
        }
        this.n = z;
        if (!z || this.j) {
            return;
        }
        this.j = true;
        this.a = this.g;
        this.k.postFrameCallback(this);
    }

    public final void updateRefreshRate(float f) {
        this.i = f < 30.0f;
        if (f <= 0.0f) {
            f = 60.0f;
        }
        this.h = 1.0E9f / f;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        TraceEvent.b("VSync", null);
        try {
            if (this.i && this.a) {
                long j2 = j - this.l;
                this.h = this.h + (((float) (j2 - r4)) * 0.1f);
            }
            this.l = j;
            this.g = true;
            this.j = false;
            if (this.n) {
                N.Mhc_M_H$(this.m, this, j / 1000, this.h / 1000);
                if (!this.j) {
                    this.j = true;
                    this.a = this.g;
                    this.k.postFrameCallback(this);
                }
            }
        } finally {
            this.g = false;
            TraceEvent.c("VSync");
        }
    }
}
