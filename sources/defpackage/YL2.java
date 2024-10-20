package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class YL2 extends DK2 {
    public final /* synthetic */ ZL2 a;

    public YL2(ZL2 zl2) {
        this.a = zl2;
    }

    @Override // defpackage.DK2
    public final void r(int i, RecyclerView recyclerView) {
        ZL2 zl2 = this.a;
        if (i == 1) {
            zl2.t.v = true;
        }
        if (i == 0) {
            zl2.e(false);
        }
    }
}
