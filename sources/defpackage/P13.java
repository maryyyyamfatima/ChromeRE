package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class P13 extends AbstractC4472dA0 {
    public final /* synthetic */ R13 a;

    public P13(R13 r13) {
        this.a = r13;
    }

    @Override // defpackage.AbstractC4472dA0, defpackage.InterfaceC4481dC
    public final void h(int i, int i2) {
        if (i != 0) {
            return;
        }
        R13 r13 = this.a;
        O13 o13 = r13.b;
        if (o13 != null) {
            o13.run();
            r13.b = null;
        }
        r13.c.onResult(Boolean.FALSE);
    }
}
