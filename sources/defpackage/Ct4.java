package defpackage;

import android.os.Parcel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Ct4 implements Tt4 {
    public final /* synthetic */ String b;
    public final /* synthetic */ Cv4 c;
    public final /* synthetic */ Xt4 d;

    public Ct4(Xt4 xt4, String str, Cv4 cv4) {
        this.d = xt4;
        this.b = str;
        this.c = cv4;
    }

    @Override // defpackage.Tt4
    public final void a() {
        ww4 ww4Var = (ww4) this.d.f;
        Parcel a = ww4Var.a();
        a.writeString(this.b);
        int i = AbstractC5419fv4.a;
        Cv4 cv4 = this.c;
        a.writeStrongBinder(cv4 != null ? cv4.asBinder() : null);
        ww4Var.h(24, a);
    }
}
