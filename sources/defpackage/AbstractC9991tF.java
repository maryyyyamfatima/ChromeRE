package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9991tF {
    public static final C10368uL3 a;

    static {
        C10368uL3 c10368uL3;
        String[] strArr = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
        int i = 0;
        while (true) {
            if (i >= 2) {
                c10368uL3 = new C10368uL3();
                break;
            }
            try {
                c10368uL3 = (C10368uL3) Class.forName(strArr[i]).asSubclass(C10368uL3.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused) {
                c10368uL3 = null;
            }
            if (c10368uL3 != null) {
                break;
            } else {
                i++;
            }
        }
        a = c10368uL3;
    }

    public static StackTraceElement a(Class cls) {
        AbstractC5203fJ.a(cls, "target");
        a.getClass();
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int a2 = C10368uL3.a(stackTrace, cls, 3);
        if (a2 != -1) {
            return stackTrace[a2];
        }
        return null;
    }
}
