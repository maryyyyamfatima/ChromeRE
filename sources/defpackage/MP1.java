package defpackage;

import androidx.mediarouter.app.d;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class MP1 implements Runnable {
    public final /* synthetic */ NP1 a;

    public MP1(NP1 np1) {
        this.a = np1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d dVar = this.a.g;
        if (dVar.Q != null) {
            dVar.Q = null;
            if (dVar.g0) {
                dVar.n(dVar.h0);
            }
        }
    }
}
