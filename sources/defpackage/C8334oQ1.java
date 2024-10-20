package defpackage;

import java.util.Collection;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oQ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8334oQ1 {
    public final /* synthetic */ C11420xQ1 a;

    public C8334oQ1(C11420xQ1 c11420xQ1) {
        this.a = c11420xQ1;
    }

    public final void a(AbstractC3866bQ1 abstractC3866bQ1, TP1 tp1, Collection collection) {
        C11420xQ1 c11420xQ1 = this.a;
        if (abstractC3866bQ1 == c11420xQ1.w && tp1 != null) {
            CQ1 cq1 = c11420xQ1.v.a;
            String d = tp1.d();
            DQ1 dq1 = new DQ1(cq1, d, c11420xQ1.b(cq1, d));
            dq1.i(tp1);
            if (c11420xQ1.t == dq1) {
                return;
            }
            c11420xQ1.i(c11420xQ1, dq1, c11420xQ1.w, 3, c11420xQ1.v, collection);
            c11420xQ1.v = null;
            c11420xQ1.w = null;
            return;
        }
        if (abstractC3866bQ1 == c11420xQ1.u) {
            if (tp1 != null) {
                c11420xQ1.p(c11420xQ1.t, tp1);
            }
            c11420xQ1.t.n(collection);
        }
    }
}
