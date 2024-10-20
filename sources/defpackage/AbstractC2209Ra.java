package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ra, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2209Ra {
    public static final I51 a;

    static {
        try {
            I51 i51 = AbstractC2079Qa.a;
            if (i51 != null) {
                a = i51;
                return;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            throw ZD0.a(th);
        }
    }

    public static I51 a() {
        I51 i51 = a;
        if (i51 != null) {
            return i51;
        }
        throw new NullPointerException("scheduler == null");
    }
}
