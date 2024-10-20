package defpackage;

import com.google.android.gms.common.Feature;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gd */
/* loaded from: classes.dex */
public final class C5650gd extends AbstractC4275cd {
    public final YD1 c;

    public C5650gd(YD1 yd1, C6905kF3 c6905kF3) {
        super(4, c6905kF3);
        this.c = yd1;
    }

    @Override // defpackage.AbstractC3932bd
    public final Feature[] f(C4425d21 c4425d21) {
        C6590jL2 c6590jL2 = (C6590jL2) c4425d21.k.get(this.c);
        if (c6590jL2 == null) {
            return null;
        }
        return c6590jL2.a.b;
    }

    @Override // defpackage.AbstractC3932bd
    public final boolean g(C4425d21 c4425d21) {
        C6590jL2 c6590jL2 = (C6590jL2) c4425d21.k.get(this.c);
        return c6590jL2 != null && c6590jL2.a.c;
    }

    @Override // defpackage.AbstractC4275cd
    public final void h(C4425d21 c4425d21) {
        C6590jL2 c6590jL2 = (C6590jL2) c4425d21.k.remove(this.c);
        C6905kF3 c6905kF3 = this.b;
        if (c6590jL2 != null) {
            c6590jL2.b.b.b.accept(c4425d21.g, c6905kF3);
            C3462aE1 c3462aE1 = c6590jL2.a.a;
            c3462aE1.b = null;
            c3462aE1.c = null;
            return;
        }
        c6905kF3.d(Boolean.FALSE);
    }
}
