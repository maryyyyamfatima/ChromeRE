package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: q92, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8935q92 extends AbstractC6336ic3 implements UV0 {
    public final InterfaceC7353la2 a;
    public final long b = 0;
    public final Object c;

    public C8935q92(InterfaceC7353la2 interfaceC7353la2, Object obj) {
        this.a = interfaceC7353la2;
        this.c = obj;
    }

    @Override // defpackage.AbstractC6336ic3
    public final void c(InterfaceC1314Kc3 interfaceC1314Kc3) {
        this.a.a(new C8592p92(interfaceC1314Kc3, this.b, this.c));
    }

    @Override // defpackage.UV0
    public final X82 a() {
        return new C8249o92(this.a, this.b, this.c);
    }
}
