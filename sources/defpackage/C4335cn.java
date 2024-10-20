package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cn */
/* loaded from: classes.dex */
public final class C4335cn extends T93 implements DV1 {
    public final InterfaceC11883ym a;

    public C4335cn(C4679dn c4679dn) {
        this.a = c4679dn;
    }

    @Override // defpackage.DV1
    public final boolean A(C8697pU1 c8697pU1) {
        try {
            C10620v43 a = c8697pU1.a();
            if (!a.d.c(0, 2)) {
                return false;
            }
            C3992bn d = C3992bn.d(a.b());
            this.a.a(Integer.valueOf(d.b), d.c, d.d);
            return true;
        } catch (C12221zl0 unused) {
            return false;
        }
    }
}
