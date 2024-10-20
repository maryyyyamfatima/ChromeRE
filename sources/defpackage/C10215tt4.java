package defpackage;

import android.os.Parcel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tt4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10215tt4 implements Tt4 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Xt4 c;

    public C10215tt4(Xt4 xt4, int i) {
        this.c = xt4;
        this.b = i;
    }

    @Override // defpackage.Tt4
    public final void a() {
        ww4 ww4Var = (ww4) this.c.f;
        Parcel a = ww4Var.a();
        a.writeInt(this.b);
        ww4Var.h(8, a);
    }
}
