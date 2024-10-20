package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class H21 {
    public static final H21 c = new H21(true, null, null);
    public final boolean a;
    public final Throwable b;

    public void c() {
    }

    public H21(boolean z, String str, Exception exc) {
        this.a = z;
        this.b = exc;
    }

    public static H21 a(String str) {
        return new H21(false, str, null);
    }

    public static H21 b(String str, Exception exc) {
        return new H21(false, str, exc);
    }
}
