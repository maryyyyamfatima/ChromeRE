package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vK3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10706vK3 {
    public static final ThreadLocal a = new ThreadLocal();

    public static AbstractC8611pD0 a() {
        ThreadLocal threadLocal = a;
        AbstractC8611pD0 abstractC8611pD0 = (AbstractC8611pD0) threadLocal.get();
        if (abstractC8611pD0 != null) {
            return abstractC8611pD0;
        }
        C8186nz c8186nz = new C8186nz(Thread.currentThread());
        threadLocal.set(c8186nz);
        return c8186nz;
    }
}
