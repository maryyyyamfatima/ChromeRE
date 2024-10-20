package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import org.chromium.chrome.browser.omnibox.a;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qc2 */
/* loaded from: classes.dex */
public final class C9083qc2 extends DK2 {
    public final /* synthetic */ C9425rc2 a;

    @Override // defpackage.DK2
    public final void s(RecyclerView recyclerView, int i, int i2) {
    }

    @Override // defpackage.DK2
    public final void r(int i, RecyclerView recyclerView) {
        InterfaceC8740pc2 interfaceC8740pc2;
        if (i != 1 || (interfaceC8740pc2 = this.a.W0) == null) {
            return;
        }
        C1245Jp c1245Jp = (C1245Jp) interfaceC8740pc2;
        if (c1245Jp.m.k) {
            c1245Jp.E = true;
            ((a) c1245Jp.g).i.c(false, false);
        }
    }

    public C9083qc2(C9425rc2 c9425rc2) {
        this.a = c9425rc2;
    }
}
