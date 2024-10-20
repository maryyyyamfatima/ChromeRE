package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class V41 extends AbstractC4099c51 {
    public final /* synthetic */ Z41 c;

    public V41(Z41 z41) {
        this.c = z41;
    }

    @Override // defpackage.AbstractC4099c51
    public final int c(int i) {
        InterfaceC7976nN2 f;
        InterfaceC3366Zx1 interfaceC3366Zx1 = this.c.b;
        if (interfaceC3366Zx1 == null) {
            return 1;
        }
        KJ2 kj2 = (KJ2) interfaceC3366Zx1;
        synchronized (kj2) {
            LK3.a();
            f = ((O00) kj2.a.get(i)).f();
        }
        if (!f.q()) {
            return f.e();
        }
        return this.c.a.F;
    }
}
