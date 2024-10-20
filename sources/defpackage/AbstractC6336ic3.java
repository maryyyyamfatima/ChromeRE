package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ic3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6336ic3 {
    public abstract void c(InterfaceC1314Kc3 interfaceC1314Kc3);

    public final void b(InterfaceC1314Kc3 interfaceC1314Kc3) {
        try {
            c(interfaceC1314Kc3);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            AbstractC4148cE0.a(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}
