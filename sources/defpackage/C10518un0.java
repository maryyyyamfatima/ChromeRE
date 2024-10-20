package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: un0 */
/* loaded from: classes2.dex */
public final class C10518un0 extends T93 implements DV1 {
    public final C10861vn0 a;

    public C10518un0(C10861vn0 c10861vn0) {
        this.a = c10861vn0;
    }

    @Override // defpackage.DV1
    public final boolean A(C8697pU1 c8697pU1) {
        try {
            C10620v43 a = c8697pU1.a();
            if (!a.d.c(1, 2)) {
                return false;
            }
            C10175tn0 d = C10175tn0.d(a.b());
            this.a.a(Integer.valueOf(d.b), d.c);
            return true;
        } catch (C12221zl0 unused) {
            return false;
        }
    }
}
