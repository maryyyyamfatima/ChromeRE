package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Vy */
/* loaded from: classes.dex */
public final class C2849Vy extends T93 implements DV1 {
    public final C2979Wy a;

    public C2849Vy(C2979Wy c2979Wy) {
        this.a = c2979Wy;
    }

    @Override // defpackage.DV1
    public final boolean A(C8697pU1 c8697pU1) {
        try {
            C10620v43 a = c8697pU1.a();
            if (!a.d.c(6, 6)) {
                return false;
            }
            C2719Uy d = C2719Uy.d(a.b());
            C2979Wy c2979Wy = this.a;
            Long valueOf = Long.valueOf(d.b);
            IM3 im3 = d.c;
            c2979Wy.getClass();
            C2719Uy c2719Uy = new C2719Uy(0);
            c2719Uy.b = valueOf.longValue();
            c2719Uy.c = im3;
            c2979Wy.b.A(c2719Uy.c(c2979Wy.a, new C5953hV1(6, 6, c2979Wy.c)));
            return true;
        } catch (C12221zl0 unused) {
            return false;
        }
    }
}
