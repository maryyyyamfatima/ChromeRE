package defpackage;

import android.os.Parcel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Nt4 implements Tt4 {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Xt4 c;

    public Nt4(Xt4 xt4, boolean z) {
        this.c = xt4;
        this.b = z;
    }

    @Override // defpackage.Tt4
    public final void a() {
        ww4 ww4Var = (ww4) this.c.f;
        Parcel a = ww4Var.a();
        int i = AbstractC5419fv4.a;
        a.writeInt(this.b ? 1 : 0);
        ww4Var.h(21, a);
    }
}
