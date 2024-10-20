package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qn0 */
/* loaded from: classes2.dex */
public final class C9147qn0 extends T93 implements DV1 {
    public final C9489rn0 a;

    public C9147qn0(C9489rn0 c9489rn0) {
        this.a = c9489rn0;
    }

    @Override // defpackage.DV1
    public final boolean A(C8697pU1 c8697pU1) {
        try {
            C10620v43 a = c8697pU1.a();
            if (!a.d.c(2, 2)) {
                return false;
            }
            C8804pn0 d = C8804pn0.d(a.b());
            this.a.a(Integer.valueOf(d.b), d.c);
            return true;
        } catch (C12221zl0 unused) {
            return false;
        }
    }
}
