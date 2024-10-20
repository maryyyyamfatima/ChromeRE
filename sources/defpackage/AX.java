package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class AX {
    public static final AtomicReference a = new AtomicReference();

    public abstract void a(String str);

    public abstract void b(String str, String str2);

    public void c() {
    }

    public abstract String[] d();

    public abstract String f(String str);

    public abstract boolean g(String str);

    public static AX e() {
        return (AX) a.get();
    }

    public static void h(String[] strArr) {
        AX ax = (AX) a.getAndSet(new C11796yX(strArr));
        if (ax != null) {
            ax.c();
        }
    }
}
