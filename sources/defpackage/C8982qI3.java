package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qI3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8982qI3 extends T93 implements DV1 {
    public final ZH3 a;

    public C8982qI3(ZH3 zh3) {
        this.a = zh3;
    }

    @Override // defpackage.DV1
    public final boolean A(C8697pU1 c8697pU1) {
        try {
            C10620v43 a = c8697pU1.a();
            if (!a.d.c(4, 2)) {
                return false;
            }
            this.a.a(C8639pI3.d(a.b()).b);
            return true;
        } catch (C12221zl0 unused) {
            return false;
        }
    }
}
