package org.chromium.components.download;

import J.N;
import defpackage.C5119f32;
import defpackage.InterfaceC1390Ks;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class NetworkStatusListenerAndroid implements InterfaceC1390Ks {
    public static C5119f32 b;
    public long a;

    public NetworkStatusListenerAndroid(long j) {
        Object obj = ThreadUtils.a;
        this.a = j;
        C5119f32 c5119f32 = b;
        if (c5119f32 == null) {
            c5119f32 = new C5119f32();
            b = c5119f32;
        }
        c5119f32.e.a(this);
        if (c5119f32.c) {
            c(c5119f32.d);
        }
    }

    public int getCurrentConnectionType() {
        Object obj = ThreadUtils.a;
        C5119f32 c5119f32 = b;
        if (c5119f32 == null) {
            c5119f32 = new C5119f32();
            b = c5119f32;
        }
        return c5119f32.d;
    }

    public final void clearNativePtr() {
        Object obj = ThreadUtils.a;
        final C5119f32 c5119f32 = b;
        if (c5119f32 == null) {
            c5119f32 = new C5119f32();
            b = c5119f32;
        }
        c5119f32.a.post(new Runnable() { // from class: d32
            @Override // java.lang.Runnable
            public final void run() {
                C1519Ls c1519Ls = C5119f32.this.b;
                c1519Ls.getClass();
                Object obj2 = ThreadUtils.a;
                c1519Ls.a.f();
            }
        });
        c5119f32.e.d(this);
        this.a = 0L;
    }

    public static NetworkStatusListenerAndroid create(long j) {
        Object obj = ThreadUtils.a;
        return new NetworkStatusListenerAndroid(j);
    }

    @Override // defpackage.InterfaceC1390Ks
    public final void c(int i) {
        Object obj = ThreadUtils.a;
        long j = this.a;
        if (j != 0) {
            N.MtmFml6u(j, this, i);
        }
    }

    @Override // defpackage.InterfaceC1390Ks
    public final void b(int i) {
        Object obj = ThreadUtils.a;
        long j = this.a;
        if (j != 0) {
            N.M9CWqWuv(j, this, i);
        }
    }
}
