package defpackage;

import java.io.File;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class OA3 {
    public static final Object a = new Object();
    public static final Object b = new Object();
    public static File c;
    public static File d;

    public static File a() {
        synchronized (a) {
            if (c == null) {
                c = new File(NA3.a, "0");
                C7432ln3 e = C7432ln3.e();
                try {
                    if (!c.exists() && !c.mkdirs()) {
                        AbstractC4851eH1.a("tabpersistence", "Failed to create state folder: " + c, new Object[0]);
                    }
                    e.close();
                } catch (Throwable th) {
                    try {
                        e.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            }
        }
        return c;
    }
}
