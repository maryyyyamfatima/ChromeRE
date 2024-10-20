package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Sf0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2365Sf0 {
    public final C6206iD0 a;

    public C2365Sf0(C6206iD0 c6206iD0, C3390a13 c3390a13) {
        this.a = c6206iD0;
    }

    public final InterfaceC7976nN2 a(int i, Object obj) {
        int i2 = C2105Qf0.w;
        C7632mN2 c7632mN2 = new C7632mN2();
        c7632mN2.a = i;
        c7632mN2.b = obj;
        C6206iD0 c6206iD0 = this.a;
        InterfaceC7976nN2 interfaceC7976nN2 = (InterfaceC7976nN2) c6206iD0.a.b().c(c6206iD0, c7632mN2);
        if (interfaceC7976nN2 == null) {
            throw new IllegalStateException("Method annotated with '@OnEvent(RenderEvent.class)' is not allowed to return 'null'.");
        }
        boolean z = B10.a;
        return interfaceC7976nN2;
    }
}
