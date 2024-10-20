package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Y1 extends DK2 {
    public final /* synthetic */ Z1 a;

    @Override // defpackage.DK2
    public final void s(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView == null) {
            return;
        }
        this.a.a.k(AbstractC3736b2.e, recyclerView.canScrollVertically(-1));
    }

    public Y1(Z1 z1) {
        this.a = z1;
    }
}
