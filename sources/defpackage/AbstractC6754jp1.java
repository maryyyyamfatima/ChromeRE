package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jp1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6754jp1 {
    public abstract InterfaceC7098kp1 c(InterfaceC7559m90 interfaceC7559m90, C11889yn c11889yn);

    public abstract AbstractC7442lp1 d(InterfaceC7559m90 interfaceC7559m90, InterfaceC7786mp1 interfaceC7786mp1);

    public abstract String e();

    public abstract void f();

    public final C9026qR2 b(InterfaceC7786mp1 interfaceC7786mp1, InterfaceC11102wV1 interfaceC11102wV1) {
        C9026qR2 c9026qR2 = new C9026qR2(interfaceC11102wV1);
        InterfaceC7559m90 J0 = interfaceC11102wV1.J0();
        c9026qR2.a.j = interfaceC7786mp1;
        c9026qR2.g = d(J0, interfaceC7786mp1);
        c9026qR2.b();
        return c9026qR2;
    }

    public final InterfaceC7098kp1 a(InterfaceC11102wV1 interfaceC11102wV1, int i) {
        C9026qR2 c9026qR2 = new C9026qR2(interfaceC11102wV1);
        InterfaceC7559m90 J0 = interfaceC11102wV1.J0();
        InterfaceC7098kp1 c = c(J0, new C11889yn(J0, c9026qR2));
        C7761ml0 c7761ml0 = new C7761ml0();
        c7761ml0.a.add(c);
        c9026qR2.a.j = c7761ml0;
        c9026qR2.b();
        c.G0().h = i;
        return c;
    }
}
