package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vI3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10696vI3 extends T93 implements DV1 {
    public final InterfaceC3484aI3 a;

    public C10696vI3(InterfaceC3484aI3 interfaceC3484aI3) {
        this.a = interfaceC3484aI3;
    }

    @Override // defpackage.DV1
    public final boolean A(C8697pU1 c8697pU1) {
        try {
            C10620v43 a = c8697pU1.a();
            if (!a.d.c(1, 2)) {
                return false;
            }
            C10353uI3 d = C10353uI3.d(a.b());
            this.a.a(d.b, Integer.valueOf(d.c), Integer.valueOf(d.d));
            return true;
        } catch (C12221zl0 unused) {
            return false;
        }
    }
}
