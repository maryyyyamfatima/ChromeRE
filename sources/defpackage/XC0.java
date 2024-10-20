package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class XC0 {
    public static volatile YC0 a;

    public static YC0 a() {
        if (a == null) {
            synchronized (XC0.class) {
                if (a == null) {
                    a = new C12209zj0();
                }
            }
        }
        return a;
    }
}
