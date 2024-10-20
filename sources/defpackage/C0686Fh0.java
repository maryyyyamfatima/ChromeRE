package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Fh0 */
/* loaded from: classes.dex */
public final class C0686Fh0 extends DK2 {
    public final /* synthetic */ C9177qs0 a;
    public final /* synthetic */ C1336Kh0 g;

    @Override // defpackage.DK2
    public final void s(RecyclerView recyclerView, int i, int i2) {
        boolean canScrollVertically = this.g.i.canScrollVertically(-1);
        C5237fP3 c5237fP3 = this.a.a.d;
        if (c5237fP3 == null || c5237fP3.k == canScrollVertically) {
            return;
        }
        c5237fP3.k = canScrollVertically;
        c5237fP3.a();
    }

    public C0686Fh0(C1336Kh0 c1336Kh0, C9177qs0 c9177qs0) {
        this.g = c1336Kh0;
        this.a = c9177qs0;
    }
}
