package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jZ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6657jZ extends VY {
    public final H4 a;

    public C6657jZ(H4 h4) {
        this.a = h4;
    }

    @Override // defpackage.VY
    public final void d(InterfaceC10434uZ interfaceC10434uZ) {
        FR2 fr2 = new FR2(TV0.b);
        interfaceC10434uZ.c(fr2);
        try {
            this.a.run();
            if (fr2.a()) {
                return;
            }
            interfaceC10434uZ.b();
        } catch (Throwable th) {
            AbstractC4148cE0.a(th);
            if (!fr2.a()) {
                interfaceC10434uZ.onError(th);
            } else {
                MR2.b(th);
            }
        }
    }
}
