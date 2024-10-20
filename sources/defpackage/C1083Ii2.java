package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ii2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1083Ii2 extends BQ0 {
    public final AbstractC0173Bi2 b;
    public final int c;

    public C1083Ii2(C0043Ai2 c0043Ai2, int i) {
        this.b = c0043Ai2;
        this.c = i;
    }

    @Override // defpackage.BQ0
    public final void c(InterfaceC0334Co3 interfaceC0334Co3) {
        AbstractC0173Bi2 abstractC0173Bi2 = this.b;
        C0953Hi2 c0953Hi2 = new C0953Hi2(interfaceC0334Co3, abstractC0173Bi2.a(), this.c);
        interfaceC0334Co3.c(c0953Hi2);
        abstractC0173Bi2.b(c0953Hi2.g);
    }
}
