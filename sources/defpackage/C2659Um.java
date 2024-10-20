package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Um */
/* loaded from: classes.dex */
public final class C2659Um extends T93 implements DV1 {
    public final InterfaceC11197wm a;

    public C2659Um(C2789Vm c2789Vm) {
        this.a = c2789Vm;
    }

    @Override // defpackage.DV1
    public final boolean A(C8697pU1 c8697pU1) {
        try {
            C10620v43 a = c8697pU1.a();
            if (!a.d.c(1, 2)) {
                return false;
            }
            C2529Tm d = C2529Tm.d(a.b());
            this.a.a(Integer.valueOf(d.b), d.c, d.d);
            return true;
        } catch (C12221zl0 unused) {
            return false;
        }
    }
}
