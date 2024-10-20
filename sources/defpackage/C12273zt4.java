package defpackage;

import android.os.Parcel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zt4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12273zt4 implements Tt4 {
    public final /* synthetic */ String b;
    public final /* synthetic */ Xt4 c;

    public C12273zt4(Xt4 xt4, String str) {
        this.c = xt4;
        this.b = str;
    }

    @Override // defpackage.Tt4
    public final void a() {
        ww4 ww4Var = (ww4) this.c.f;
        Parcel a = ww4Var.a();
        a.writeString(this.b);
        ww4Var.h(14, a);
    }
}
