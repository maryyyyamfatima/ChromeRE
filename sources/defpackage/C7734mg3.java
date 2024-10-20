package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mg3 */
/* loaded from: classes.dex */
public final class C7734mg3 implements InterfaceC3015Xf0 {
    public final /* synthetic */ C7686mY1 a;
    public final /* synthetic */ C8078ng3 g;

    public C7734mg3(C8078ng3 c8078ng3, C7686mY1 c7686mY1) {
        this.g = c8078ng3;
        this.a = c7686mY1;
    }

    @Override // defpackage.InterfaceC3015Xf0
    public final void f(Object obj) {
        C8078ng3 c8078ng3 = this.g;
        C7686mY1 c7686mY1 = this.a;
        C7686mY1 c7686mY12 = c8078ng3.k;
        if (c7686mY12 != null && c7686mY12 == c7686mY1) {
            C8078ng3 c8078ng32 = this.g;
            C7686mY1 c7686mY13 = this.a;
            AbstractC6410ip0 abstractC6410ip0 = c8078ng32.a.p;
            if (obj != null && abstractC6410ip0.c(c7686mY13.c.e())) {
                c8078ng32.j = obj;
                c8078ng32.g.a();
            } else {
                InterfaceC3275Zf0 interfaceC3275Zf0 = c8078ng32.g;
                InterfaceC6098hu1 interfaceC6098hu1 = c7686mY13.a;
                InterfaceC3145Yf0 interfaceC3145Yf0 = c7686mY13.c;
                interfaceC3275Zf0.d(interfaceC6098hu1, obj, interfaceC3145Yf0, interfaceC3145Yf0.e(), c8078ng32.l);
            }
        }
    }

    @Override // defpackage.InterfaceC3015Xf0
    public final void d(Exception exc) {
        C8078ng3 c8078ng3 = this.g;
        C7686mY1 c7686mY1 = this.a;
        C7686mY1 c7686mY12 = c8078ng3.k;
        if (c7686mY12 != null && c7686mY12 == c7686mY1) {
            C8078ng3 c8078ng32 = this.g;
            C7686mY1 c7686mY13 = this.a;
            InterfaceC3275Zf0 interfaceC3275Zf0 = c8078ng32.g;
            C1715Nf0 c1715Nf0 = c8078ng32.l;
            InterfaceC3145Yf0 interfaceC3145Yf0 = c7686mY13.c;
            interfaceC3275Zf0.b(c1715Nf0, exc, interfaceC3145Yf0, interfaceC3145Yf0.e());
        }
    }
}
