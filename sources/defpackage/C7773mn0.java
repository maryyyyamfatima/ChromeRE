package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mn0 */
/* loaded from: classes2.dex */
public final class C7773mn0 extends T93 implements DV1 {
    public final C8117nn0 a;

    public C7773mn0(C8117nn0 c8117nn0) {
        this.a = c8117nn0;
    }

    @Override // defpackage.DV1
    public final boolean A(C8697pU1 c8697pU1) {
        try {
            C10620v43 a = c8697pU1.a();
            if (!a.d.c(0, 2)) {
                return false;
            }
            C7429ln0 d = C7429ln0.d(a.b());
            this.a.a(Integer.valueOf(d.b), d.c);
            return true;
        } catch (C12221zl0 unused) {
            return false;
        }
    }
}
