package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.b;
import org.chromium.chrome.browser.omnibox.a;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lc2 */
/* loaded from: classes.dex */
public final class C7365lc2 extends LinearLayoutManager {
    public final /* synthetic */ C9425rc2 E;

    public C7365lc2(C9425rc2 c9425rc2) {
        this.E = c9425rc2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.AbstractC12077zK2
    public final int u0(int i, b bVar, LK2 lk2) {
        int u0 = super.u0(i, bVar, lk2);
        if (u0 == 0 && i < 0) {
            ((a) ((C1245Jp) this.E.T0.a.W0).g).i.c(true, false);
        }
        return u0;
    }
}
