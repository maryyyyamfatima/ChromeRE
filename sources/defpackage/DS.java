package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class DS extends C5621gX3 {
    public final H10 c;

    public DS(A00 a00, H10 h10) {
        super(a00, null);
        this.c = h10;
    }

    @Override // defpackage.C5621gX3, defpackage.InterfaceC7976nN2
    public final void h() {
        super.h();
        H10 h10 = this.c;
        if (h10.g) {
            return;
        }
        synchronized (h10) {
            if (!h10.g) {
                C1967Pd2 c1967Pd2 = h10.a;
                h10.a = null;
                H10.d(c1967Pd2);
            }
        }
    }
}
