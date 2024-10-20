package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class YJ2 {
    public G13 a;
    public int b;

    public YJ2() {
        new RunnableC3837bK2(this);
        this.b = Integer.MIN_VALUE;
    }

    public final void b(int i, boolean z) {
        G13 g13 = this.a;
        if (g13 == null) {
            return;
        }
        RecyclerView recyclerView = g13.P;
        if (z) {
            recyclerView.u0(i);
        } else {
            recyclerView.m0(i);
        }
    }

    public final RecyclerView a() {
        G13 g13 = this.a;
        if (g13 == null) {
            return null;
        }
        return g13.P;
    }
}
