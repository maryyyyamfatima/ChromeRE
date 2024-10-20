package defpackage;

import org.chromium.gfx.mojom.Rect;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iI3 */
/* loaded from: classes.dex */
public final class C6234iI3 extends T93 implements DV1 {
    public final C6576jI3 a;

    public C6234iI3(C6576jI3 c6576jI3) {
        this.a = c6576jI3;
    }

    @Override // defpackage.DV1
    public final boolean A(C8697pU1 c8697pU1) {
        try {
            C10620v43 a = c8697pU1.a();
            if (!a.d.c(5, 2)) {
                return false;
            }
            C1730Ni0 c1730Ni0 = new C1730Ni0(a.b());
            c1730Ni0.b();
            try {
                c1730Ni0.c(C5890hI3.c);
                Rect d = Rect.d(c1730Ni0.s(8, false));
                c1730Ni0.a();
                this.a.a(d);
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
