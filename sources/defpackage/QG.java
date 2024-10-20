package defpackage;

import android.view.MenuItem;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class QG implements Runnable {
    public final /* synthetic */ SG a;
    public final /* synthetic */ MenuItem g;
    public final /* synthetic */ BS1 h;
    public final /* synthetic */ RG i;

    public QG(RG rg, SG sg, C6287iT1 c6287iT1, BS1 bs1) {
        this.i = rg;
        this.a = sg;
        this.g = c6287iT1;
        this.h = bs1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SG sg = this.a;
        if (sg != null) {
            RG rg = this.i;
            rg.a.F = true;
            sg.b.c(false);
            rg.a.F = false;
        }
        MenuItem menuItem = this.g;
        if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
            this.h.q(menuItem, null, 4);
        }
    }
}
