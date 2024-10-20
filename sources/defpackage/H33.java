package defpackage;

import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.browser_ui.bottomsheet.m;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class H33 extends AbstractC4472dA0 implements InterfaceC1528Lt3 {
    public final QB a;
    public final String g;
    public final Runnable h;
    public final Profile i;

    public H33(QB qb, String str, E33 e33, Profile profile) {
        this.a = qb;
        this.g = str;
        this.h = e33;
        this.i = profile;
        AbstractC1658Mt3.b().a(this);
        ((m) qb).a(this);
        k();
    }

    @Override // defpackage.AbstractC4472dA0, defpackage.InterfaceC4481dC
    public final void d(int i) {
        AbstractC1658Mt3.b().l(this);
        ((m) this.a).o(this);
    }

    @Override // defpackage.InterfaceC1528Lt3
    public final void B() {
        k();
    }

    public final void k() {
        AbstractC9095qe2 a = C33.a(this.g, this.i);
        if (a.c() && ((Integer) a.b()).intValue() != 1) {
            AbstractC1658Mt3.b().l(this);
            ((m) this.a).o(this);
            this.h.run();
        }
    }
}
