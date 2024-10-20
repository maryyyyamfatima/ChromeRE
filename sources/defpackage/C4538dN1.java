package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dN1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4538dN1 implements InterfaceC3857bO2 {
    public final /* synthetic */ InterfaceC3857bO2 a;
    public final /* synthetic */ C6257iN1 b;

    public C4538dN1(C6257iN1 c6257iN1, InterfaceC3857bO2 interfaceC3857bO2) {
        this.b = c6257iN1;
        this.a = interfaceC3857bO2;
    }

    @Override // defpackage.InterfaceC3857bO2
    public final void a(long j, int i, C5913hN1 c5913hN1) {
        this.b.g = null;
        InterfaceC3857bO2 interfaceC3857bO2 = this.a;
        if (interfaceC3857bO2 != null) {
            interfaceC3857bO2.a(j, i, c5913hN1);
        }
    }

    @Override // defpackage.InterfaceC3857bO2
    public final void b(long j) {
        InterfaceC3857bO2 interfaceC3857bO2 = this.a;
        if (interfaceC3857bO2 != null) {
            interfaceC3857bO2.b(j);
        }
    }
}
