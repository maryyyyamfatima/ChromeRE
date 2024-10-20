package defpackage;

import android.media.MediaRouter2;
import android.os.Handler;
import android.os.Messenger;
import android.util.SparseArray;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dP1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4548dP1 extends AbstractC3866bQ1 {
    public final String f;
    public final MediaRouter2.RoutingController g;
    public final Messenger h;
    public final Messenger i;
    public final Handler k;
    public TP1 o;
    public final SparseArray j = new SparseArray();
    public final AtomicInteger l = new AtomicInteger(1);
    public final RunnableC3861bP1 m = new Runnable() { // from class: bP1
        @Override // java.lang.Runnable
        public final void run() {
            C4548dP1.this.n = -1;
        }
    };
    public int n = -1;

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0024, code lost:            r3 = r3.getControlHints();     */
    /* JADX WARN: Type inference failed for: r2v3, types: [bP1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C4548dP1(defpackage.C6267iP1 r2, android.media.MediaRouter2.RoutingController r3, java.lang.String r4) {
        /*
            r1 = this;
            r1.<init>()
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r1.j = r2
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r0 = 1
            r2.<init>(r0)
            r1.l = r2
            bP1 r2 = new bP1
            r2.<init>()
            r1.m = r2
            r2 = -1
            r1.n = r2
            r1.g = r3
            r1.f = r4
            r2 = 0
            if (r3 != 0) goto L24
            goto L2a
        L24:
            android.os.Bundle r3 = defpackage.DO1.a(r3)
            if (r3 != 0) goto L2c
        L2a:
            r3 = r2
            goto L34
        L2c:
            java.lang.String r4 = "androidx.mediarouter.media.KEY_MESSENGER"
            android.os.Parcelable r3 = r3.getParcelable(r4)
            android.os.Messenger r3 = (android.os.Messenger) r3
        L34:
            r1.h = r3
            if (r3 != 0) goto L39
            goto L43
        L39:
            android.os.Messenger r2 = new android.os.Messenger
            cP1 r3 = new cP1
            r3.<init>(r1)
            r2.<init>(r3)
        L43:
            r1.i = r2
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r2.<init>(r3)
            r1.k = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4548dP1.<init>(iP1, android.media.MediaRouter2$RoutingController, java.lang.String):void");
    }

    @Override // defpackage.AbstractC4896eQ1
    public final void f(int i) {
        MediaRouter2.RoutingController routingController = this.g;
        if (routingController == null) {
            return;
        }
        routingController.setVolume(i);
        this.n = i;
        Handler handler = this.k;
        RunnableC3861bP1 runnableC3861bP1 = this.m;
        handler.removeCallbacks(runnableC3861bP1);
        handler.postDelayed(runnableC3861bP1, 1000L);
    }

    @Override // defpackage.AbstractC4896eQ1
    public final void i(int i) {
        int volumeMax;
        MediaRouter2.RoutingController routingController = this.g;
        if (routingController == null) {
            return;
        }
        int i2 = this.n;
        if (i2 < 0) {
            i2 = routingController.getVolume();
        }
        int i3 = i2 + i;
        volumeMax = routingController.getVolumeMax();
        int max = Math.max(0, Math.min(i3, volumeMax));
        this.n = max;
        routingController.setVolume(max);
        Handler handler = this.k;
        RunnableC3861bP1 runnableC3861bP1 = this.m;
        handler.removeCallbacks(runnableC3861bP1);
        handler.postDelayed(runnableC3861bP1, 1000L);
    }

    @Override // defpackage.AbstractC4896eQ1
    public final void d() {
        this.g.release();
    }
}
