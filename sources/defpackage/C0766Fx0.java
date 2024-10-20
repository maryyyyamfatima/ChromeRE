package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Fx0 */
/* loaded from: classes.dex */
public final class C0766Fx0 implements InterfaceC6416iq0 {
    public final AbstractC9896sy0 a;
    public final InterfaceC8520ox0 g;
    public volatile U80 h;
    public final InterfaceC6115hx0 i;
    public H10 j;
    public C1025Hx k = new C1025Hx();
    public C0636Ex0 l;
    public volatile X82 m;

    public C0766Fx0(AbstractC9896sy0 abstractC9896sy0, InterfaceC8520ox0 interfaceC8520ox0, U80 u80, InterfaceC6115hx0 interfaceC6115hx0, H10 h10) {
        this.a = abstractC9896sy0;
        this.g = interfaceC8520ox0;
        this.h = u80;
        this.i = interfaceC6115hx0;
        this.j = h10;
    }

    public final synchronized boolean a() {
        boolean z;
        C0636Ex0 c0636Ex0 = this.l;
        if (c0636Ex0 != null) {
            z = c0636Ex0.a();
        }
        return z;
    }

    @Override // defpackage.InterfaceC6416iq0
    public final synchronized void dispose() {
        C0636Ex0 c0636Ex0 = this.l;
        if (c0636Ex0 != null) {
            c0636Ex0.dispose();
        }
        this.m = null;
        this.l = null;
        this.k.b();
    }
}
