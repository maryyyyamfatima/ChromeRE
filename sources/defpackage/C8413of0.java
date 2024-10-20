package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: of0 */
/* loaded from: classes.dex */
public final class C8413of0 implements InterfaceC7381lf0 {
    public final C0358Ct2 a;
    public final C0098At2 b;

    public C8413of0(C0748Ft2 c0748Ft2) {
        c0748Ft2.getClass();
        Object obj = AbstractC0878Gt2.g;
        this.a = new C0358Ct2(c0748Ft2, "chrome_homepage_url");
        this.b = new C0098At2(c0748Ft2, "chrome_bookmark_immutable", Boolean.FALSE, false);
    }

    @Override // defpackage.InterfaceC7381lf0
    public final String a() {
        return (String) this.a.c();
    }

    @Override // defpackage.InterfaceC7381lf0
    public final boolean b() {
        return ((Boolean) this.b.c()).booleanValue();
    }
}
