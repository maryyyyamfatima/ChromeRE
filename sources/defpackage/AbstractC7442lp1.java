package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lp1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC7442lp1 implements EV1 {
    public final InterfaceC7559m90 a;
    public final InterfaceC7786mp1 g;

    public AbstractC7442lp1(InterfaceC7559m90 interfaceC7559m90, InterfaceC7786mp1 interfaceC7786mp1) {
        this.a = interfaceC7559m90;
        this.g = interfaceC7786mp1;
    }

    @Override // defpackage.DV1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.g.close();
    }
}
