package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uP2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10387uP2 {
    public boolean a;
    public final Handler b = new Handler(Looper.getMainLooper(), new C10044tP2());

    public final synchronized void a(JO2 jo2, boolean z) {
        if (!this.a && !z) {
            this.a = true;
            jo2.b();
            this.a = false;
        }
        this.b.obtainMessage(1, jo2).sendToTarget();
    }
}
