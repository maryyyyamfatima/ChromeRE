package defpackage;

import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ef4 */
/* loaded from: classes.dex */
public final class C4979ef4 {
    public final C7580mD0 a;
    public boolean e;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public final C6168i61 f = C6168i61.f();
    public final C6168i61 g = C6168i61.f();

    public C4979ef4(C7580mD0 c7580mD0) {
        this.a = c7580mD0;
    }

    public final void a(int i, VT vt, C6168i61 c6168i61) {
        H74 h74 = (H74) this.f.g(Integer.valueOf(i), vt);
        if (h74 != null) {
            c6168i61.b(Integer.valueOf(i), vt, h74);
        }
        A0 a0 = (A0) this.g.g(Integer.valueOf(i), vt);
        if (a0 == null) {
            return;
        }
        Iterator it = a0.a().iterator();
        while (true) {
            C2773Vi3 c2773Vi3 = (C2773Vi3) it;
            if (!c2773Vi3.hasNext()) {
                return;
            }
            AE3 ae3 = (AE3) ((AbstractC12048zE3) c2773Vi3.next());
            int intValue = ((Integer) ae3.a).intValue();
            VT vt2 = (VT) ae3.g;
            if (!c6168i61.e(Integer.valueOf(intValue), vt2)) {
                a(intValue, vt2, c6168i61);
            }
        }
    }

    public final boolean b() {
        if (this.e) {
            return this.c > 0 && this.d > 0;
        }
        return false;
    }

    public final synchronized void c() {
        this.b = 0;
        this.f.g.clear();
        this.g.g.clear();
    }
}
