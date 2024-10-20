package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kK1 */
/* loaded from: classes.dex */
public final class C6928kK1 extends C4866eK1 {
    public InterfaceC7312lS1 d;

    @Override // defpackage.C4866eK1
    public final int b(Object obj) {
        JO2 jo2 = (JO2) obj;
        if (jo2 == null) {
            return 1;
        }
        return jo2.d();
    }

    @Override // defpackage.C4866eK1
    public final void c(Object obj, Object obj2) {
        JO2 jo2 = (JO2) obj2;
        InterfaceC7312lS1 interfaceC7312lS1 = this.d;
        if (interfaceC7312lS1 == null || jo2 == null) {
            return;
        }
        ((C6538jB0) interfaceC7312lS1).e.a(jo2, true);
    }

    public C6928kK1(long j) {
        super(j);
    }
}
