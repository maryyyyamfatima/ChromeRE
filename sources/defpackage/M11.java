package defpackage;

import java.lang.ref.WeakReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class M11 extends U31 {
    public final WeakReference a;

    public M11(N11 n11) {
        this.a = new WeakReference(n11);
    }

    @Override // defpackage.U31
    public final void a() {
        N11 n11 = (N11) this.a.get();
        if (n11 == null) {
            return;
        }
        n11.b.lock();
        try {
            if (n11.i) {
                n11.c.j = true;
                n11.d.connect();
            }
        } finally {
            n11.b.unlock();
        }
    }
}
