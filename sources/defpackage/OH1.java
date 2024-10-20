package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class OH1 implements PH1 {
    public static final MH1 a = new MH1();

    public abstract String a();

    public abstract String b();

    public abstract int c();

    public abstract String d();

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogSite{ class=");
        sb.append(a());
        sb.append(", method=");
        sb.append(d());
        sb.append(", line=");
        sb.append(c());
        if (b() != null) {
            sb.append(", file=");
            sb.append(b());
        }
        sb.append(" }");
        return sb.toString();
    }
}
