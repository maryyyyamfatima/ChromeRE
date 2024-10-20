package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xF0 */
/* loaded from: classes.dex */
public final class C11364xF0 extends DK2 {
    public final /* synthetic */ C11707yF0 a;

    @Override // defpackage.DK2
    public final void s(RecyclerView recyclerView, int i, int i2) {
        C11707yF0 c11707yF0 = this.a;
        if (c11707yF0.s || i2 == 0) {
            return;
        }
        c11707yF0.s = true;
        FI2.a("Android.ExploreSitesPage.Scrolled");
    }

    public C11364xF0(C11707yF0 c11707yF0) {
        this.a = c11707yF0;
    }
}
