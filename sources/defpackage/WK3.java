package defpackage;

import J.N;
import android.view.View;
import org.chromium.content.browser.input.ImeAdapterImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class WK3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C5561gL3 g;

    @Override // java.lang.Runnable
    public final void run() {
        ImeAdapterImpl imeAdapterImpl = this.g.e;
        imeAdapterImpl.getClass();
        int i = this.a;
        boolean z = (i & 1) != 0;
        boolean z2 = (i & 2) != 0;
        if (imeAdapterImpl.f()) {
            N.MdwW1P2L(imeAdapterImpl.a, imeAdapterImpl, z, z2);
        }
        C11138wc0 c11138wc0 = imeAdapterImpl.m;
        if (c11138wc0 == null) {
            return;
        }
        View d = imeAdapterImpl.d();
        boolean z3 = c11138wc0.a;
        if (z3) {
            if (c11138wc0.c && !z2 && z3) {
                c11138wc0.n = null;
            }
            c11138wc0.c = z2;
            if (z) {
                c11138wc0.b = true;
                c11138wc0.a(d);
            }
        }
    }

    public WK3(C5561gL3 c5561gL3, int i) {
        this.g = c5561gL3;
        this.a = i;
    }
}
