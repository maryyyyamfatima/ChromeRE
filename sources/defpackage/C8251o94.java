package defpackage;

import J.N;
import android.hardware.Camera;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: o94, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8251o94 implements Camera.ErrorCallback {
    public final /* synthetic */ C94 a;

    public C8251o94(C94 c94) {
        this.a = c94;
    }

    @Override // android.hardware.Camera.ErrorCallback
    public final void onError(int i, Camera camera) {
        C94 c94 = this.a;
        N.MhmwjISE(c94.e, c94, 68, AbstractC9076qb1.a("Error id: ", i));
        synchronized (this.a.g) {
            C94 c942 = this.a;
            long j = c942.h;
            if (j == 0) {
                return;
            }
            c942.d(j);
            this.a.h = 0L;
        }
    }
}
