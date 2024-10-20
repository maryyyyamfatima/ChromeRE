package defpackage;

import com.google.android.gms.common.Feature;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ed */
/* loaded from: classes.dex */
public final class C4962ed extends AbstractC4275cd {
    public final C6590jL2 c;

    public C4962ed(C6590jL2 c6590jL2, C6905kF3 c6905kF3) {
        super(3, c6905kF3);
        this.c = c6590jL2;
    }

    @Override // defpackage.AbstractC4275cd
    public final void h(C4425d21 c4425d21) {
        AL2 al2 = this.c.a;
        al2.e.a.accept(c4425d21.g, this.b);
        YD1 yd1 = this.c.a.a.c;
        if (yd1 != null) {
            c4425d21.k.put(yd1, this.c);
        }
    }

    @Override // defpackage.AbstractC3932bd
    public final Feature[] f(C4425d21 c4425d21) {
        return this.c.a.b;
    }

    @Override // defpackage.AbstractC3932bd
    public final boolean g(C4425d21 c4425d21) {
        return this.c.a.c;
    }
}
