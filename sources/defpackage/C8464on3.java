package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: on3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8464on3 extends AbstractC7094ko3 {
    public static final C4638dg0 c = new C4638dg0(16, 0);
    public short[] b;

    public C8464on3() {
        super(16);
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(c);
        short[] sArr = this.b;
        if (sArr == null) {
            t.q(8, AbstractC3104Xx.a(0));
            return;
        }
        KA0 s = t.s(2, sArr.length, 8, -1);
        IA0 ia0 = s.b;
        ia0.b.position(s.a + 8);
        ia0.b.asShortBuffer().put(sArr);
    }
}
