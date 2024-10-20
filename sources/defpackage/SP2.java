package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class SP2 {
    public static final OP2 a(Throwable th) {
        AbstractC0087Ar1.e(th, "exception");
        return new OP2(th);
    }

    public static final void b(Object obj) {
        if (obj instanceof OP2) {
            throw ((OP2) obj).a;
        }
    }
}
