package defpackage;

import android.os.SystemClock;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Oj4 extends Fl4 {
    public final /* synthetic */ Pj4 g;

    public Oj4(Pj4 pj4) {
        this.g = pj4;
    }

    @Override // defpackage.Fl4
    public final void renderProcessGone() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Pj4 pj4 = this.g;
        EI2.j(elapsedRealtime - pj4.f, "CustomTabs.SpareWebContents.TimeBeforeDeath");
        if (pj4.h) {
            EI2.h(2, 5, "CustomTabs.SpareWebContents.Status2");
        }
        pj4.e.P(pj4.g);
        pj4.e.destroy();
        pj4.e = null;
        pj4.g = null;
    }
}
