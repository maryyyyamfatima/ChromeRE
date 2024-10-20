package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Uo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2669Uo {
    public static final C2669Uo d = new C2669Uo("", C3697av0.b, true);
    public final String a;
    public final C3697av0 b;
    public final boolean c;

    public C2669Uo(String str, C3697av0 c3697av0, boolean z) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.a = str;
        this.b = c3697av0;
        this.c = z;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder("YouTubeWrapperVideo{id=");
        AbstractC9972tB0.a(sb, this.a, ", startTime=", valueOf, ", autoplayMuted=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2669Uo)) {
            return false;
        }
        C2669Uo c2669Uo = (C2669Uo) obj;
        return this.a.equals(c2669Uo.a) && this.b.equals(c2669Uo.b) && this.c == c2669Uo.c;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ ((int) this.b.a)) * 1000003) ^ (this.c ? 1231 : 1237);
    }
}
