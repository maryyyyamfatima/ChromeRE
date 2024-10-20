package defpackage;

import android.graphics.Typeface;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class VG3 extends DP2 {
    public final /* synthetic */ JF a;
    public final /* synthetic */ WG3 b;

    public VG3(WG3 wg3, JF jf) {
        this.b = wg3;
        this.a = jf;
    }

    @Override // defpackage.DP2
    public final void d(Typeface typeface) {
        WG3 wg3 = this.b;
        wg3.m = Typeface.create(typeface, wg3.c);
        wg3.l = true;
        this.a.a(wg3.m);
    }

    @Override // defpackage.DP2
    public final void c(int i) {
        this.b.l = true;
        JF jf = this.a;
        jf.a(jf.a);
    }
}
