package defpackage;

import java.lang.reflect.Method;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Gu3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0884Gu3 {
    public static final Method a;
    public static final Method b;
    public static final Method c;

    static {
        Method method;
        Method method2;
        Class<?> cls;
        try {
            try {
                cls = Class.forName("android.os.SystemProperties");
                method = cls.getMethod("get", String.class, String.class);
                try {
                    cls.getMethod("getInt", String.class, Integer.TYPE);
                    method2 = cls.getMethod("getLong", String.class, Long.TYPE);
                } catch (Exception e) {
                    e = e;
                    method2 = null;
                } catch (Throwable th) {
                    th = th;
                    method2 = null;
                    a = method;
                    b = method2;
                    c = null;
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                method = null;
                method2 = null;
            } catch (Throwable th2) {
                th = th2;
                method = null;
                method2 = null;
            }
            try {
                Method method3 = cls.getMethod("getBoolean", String.class, Boolean.TYPE);
                a = method;
                b = method2;
                c = method3;
            } catch (Exception e3) {
                e = e3;
                e.printStackTrace();
                a = method;
                b = method2;
                c = null;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
