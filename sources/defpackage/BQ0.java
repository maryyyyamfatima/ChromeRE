package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class BQ0 implements RE2 {
    public static final int a = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    public abstract void c(InterfaceC0334Co3 interfaceC0334Co3);

    public final void b(InterfaceC0334Co3 interfaceC0334Co3) {
        a((QQ0) interfaceC0334Co3);
    }

    public final void a(QQ0 qq0) {
        try {
            c(qq0);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            AbstractC4148cE0.a(th);
            MR2.b(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}
