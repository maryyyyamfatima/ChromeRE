package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: in0 */
/* loaded from: classes2.dex */
public final class C6398in0 extends T93 implements DV1 {
    public final C6741jn0 a;

    public C6398in0(C6741jn0 c6741jn0) {
        this.a = c6741jn0;
    }

    @Override // defpackage.DV1
    public final boolean A(C8697pU1 c8697pU1) {
        try {
            C10620v43 a = c8697pU1.a();
            if (!a.d.c(3, 2)) {
                return false;
            }
            C1730Ni0 c1730Ni0 = new C1730Ni0(a.b());
            c1730Ni0.b();
            try {
                c1730Ni0.c(C6055hn0.c);
                int o = c1730Ni0.o(8);
                c1730Ni0.a();
                this.a.a(Integer.valueOf(o));
                return true;
            } catch (Throwable th) {
                c1730Ni0.a();
                throw th;
            }
        } catch (C12221zl0 unused) {
            return false;
        }
    }
}
