package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mI3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7608mI3 extends T93 implements DV1 {
    public final YH3 a;

    public C7608mI3(YH3 yh3) {
        this.a = yh3;
    }

    @Override // defpackage.DV1
    public final boolean A(C8697pU1 c8697pU1) {
        try {
            C10620v43 a = c8697pU1.a();
            if (!a.d.c(3, 2)) {
                return false;
            }
            this.a.a(C7264lI3.d(a.b()).b);
            return true;
        } catch (C12221zl0 unused) {
            return false;
        }
    }
}
