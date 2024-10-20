package defpackage;

import com.google.vr.ndk.base.DaydreamApi;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ji4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6715ji4 {
    public DaydreamApi a;

    public final DaydreamApi a() {
        if (this.a == null) {
            this.a = DaydreamApi.create(V60.a);
        }
        return this.a;
    }

    public final boolean b() {
        DaydreamApi a = a();
        if (a == null) {
            return false;
        }
        try {
            C7432ln3 e = C7432ln3.e();
            try {
                int currentViewerType = a.getCurrentViewerType();
                e.close();
                return currentViewerType == 1;
            } catch (Throwable th) {
                try {
                    e.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (RuntimeException unused2) {
            return false;
        }
    }

    public final void c() {
        DaydreamApi a = a();
        if (a == null) {
            return;
        }
        a.launchVrHomescreen();
    }
}
