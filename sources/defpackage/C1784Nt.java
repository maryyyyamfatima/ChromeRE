package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Nt, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1784Nt extends T93 implements DV1 {
    public final C1914Ot a;

    public C1784Nt(C1914Ot c1914Ot) {
        this.a = c1914Ot;
    }

    @Override // defpackage.DV1
    public final boolean A(C8697pU1 c8697pU1) {
        try {
            C10620v43 a = c8697pU1.a();
            if (!a.d.c(1, 2)) {
                return false;
            }
            this.a.a(C1654Mt.d(a.b()).b);
            return true;
        } catch (C12221zl0 unused) {
            return false;
        }
    }
}
