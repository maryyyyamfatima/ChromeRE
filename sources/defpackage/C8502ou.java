package defpackage;

import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ou, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8502ou implements BK2 {
    public int a = -1;
    public final AbstractC12077zK2 g;

    public C8502ou(AbstractC12077zK2 abstractC12077zK2) {
        this.g = abstractC12077zK2;
    }

    @Override // defpackage.BK2
    public final void d(View view) {
        a(this.a, true);
    }

    @Override // defpackage.BK2
    public final void b(View view) {
        view.setSelected(false);
        a(this.a, true);
    }

    public final void a(int i, boolean z) {
        AbstractC12077zK2 abstractC12077zK2 = this.g;
        if (abstractC12077zK2 == null) {
            return;
        }
        if (i == -1 || (i >= 0 && i < abstractC12077zK2.C())) {
            if (z || i != this.a) {
                View r = abstractC12077zK2.r(this.a);
                if (r != null) {
                    r.setSelected(false);
                }
                this.a = i;
                abstractC12077zK2.t0(i);
                View r2 = abstractC12077zK2.r(i);
                if (r2 != null) {
                    r2.setSelected(true);
                }
            }
        }
    }
}
