package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class M81 extends DK2 {
    public final /* synthetic */ O81 a;

    public M81(O81 o81) {
        this.a = o81;
    }

    @Override // defpackage.DK2
    public final void s(RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.s;
        O81 o81 = this.a;
        C4117c81 c4117c81 = o81.n;
        boolean z = true;
        if (!(!c4117c81.y && c4117c81.A) || o81.j) {
            return;
        }
        int T0 = linearLayoutManager.T0();
        C4117c81 c4117c812 = o81.n;
        if (T0 > c4117c812.i - 25) {
            c4117c812.V();
        } else {
            z = false;
        }
        o81.g.c(z);
    }
}
