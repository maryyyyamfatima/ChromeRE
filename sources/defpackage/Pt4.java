package defpackage;

import android.os.Bundle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class Pt4 extends Iu4 {
    public final Vv4 a;
    public final /* synthetic */ St4 g;

    public Pt4(St4 st4, Vv4 vv4) {
        this.g = st4;
        this.a = vv4;
    }

    public void B0(Bundle bundle) {
        this.g.b.a();
        St4.c.b(4, "onDeferredLanguageInstall", new Object[0]);
    }

    @Override // defpackage.Ku4
    public void P(Bundle bundle) {
        this.g.b.a();
        St4.c.b(4, "onDeferredInstall", new Object[0]);
    }

    public void t0(int i, Bundle bundle) {
        this.g.b.a();
        St4.c.b(4, "onStartInstall(%d)", new Object[]{Integer.valueOf(i)});
    }
}
