package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Zm0 */
/* loaded from: classes2.dex */
public final class C3310Zm0 extends T93 implements DV1 {
    public final C3649an0 a;

    public C3310Zm0(C3649an0 c3649an0) {
        this.a = c3649an0;
    }

    @Override // defpackage.DV1
    public final boolean A(C8697pU1 c8697pU1) {
        try {
            C10620v43 a = c8697pU1.a();
            if (!a.d.c(0, 2)) {
                return false;
            }
            C3180Ym0 d = C3180Ym0.d(a.b());
            this.a.a(Integer.valueOf(d.b), d.c);
            return true;
        } catch (C12221zl0 unused) {
            return false;
        }
    }
}
