package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Qf3 */
/* loaded from: classes.dex */
public final class C2108Qf3 extends DK2 {
    public boolean a = false;
    public final /* synthetic */ AbstractC2368Sf3 g;

    public C2108Qf3(AbstractC2368Sf3 abstractC2368Sf3) {
        this.g = abstractC2368Sf3;
    }

    @Override // defpackage.DK2
    public final void r(int i, RecyclerView recyclerView) {
        if (i == 0 && this.a) {
            this.a = false;
            this.g.h();
        }
    }

    @Override // defpackage.DK2
    public final void s(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.a = true;
    }
}
