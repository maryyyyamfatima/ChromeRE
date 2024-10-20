package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vt4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10901vt4 implements Tt4 {
    public final /* synthetic */ Xt4 b;

    public C10901vt4(Xt4 xt4) {
        this.b = xt4;
    }

    @Override // defpackage.Tt4
    public final void a() {
        Xt4 xt4 = this.b;
        Aw4 aw4 = xt4.f;
        Bundle bundle = xt4.a;
        ww4 ww4Var = (ww4) aw4;
        Parcel a = ww4Var.a();
        int i = AbstractC5419fv4.a;
        if (bundle != null) {
            a.writeInt(1);
            bundle.writeToParcel(a, 0);
        } else {
            a.writeInt(0);
        }
        ww4Var.h(10, a);
        xt4.a = null;
    }
}
