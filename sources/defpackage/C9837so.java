package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: so, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9837so {
    public final C5330fh a;
    public final AbstractC9095qe2 b;
    public final boolean c;

    public C9837so(C5330fh c5330fh, C3242Yy2 c3242Yy2, boolean z) {
        if (c5330fh == null) {
            throw new NullPointerException("Null appFlow");
        }
        this.a = c5330fh;
        this.b = c3242Yy2;
        this.c = z;
    }

    public final String toString() {
        StringBuilder a = AbstractC10975w63.a("LoggedAppFlow{appFlow=", String.valueOf(this.a), ", loggedTimeNanos=", String.valueOf(this.b), ", sampledOut=");
        a.append(this.c);
        a.append("}");
        return a.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9837so)) {
            return false;
        }
        C9837so c9837so = (C9837so) obj;
        return this.a.equals(c9837so.a) && this.b.equals(c9837so.b) && this.c == c9837so.c;
    }

    public final int hashCode() {
        C5330fh c5330fh = this.a;
        int i = c5330fh.a;
        if (i == 0) {
            C7931nE2 c7931nE2 = C7931nE2.c;
            c7931nE2.getClass();
            i = c7931nE2.b(C5330fh.class).j(c5330fh);
            c5330fh.a = i;
        }
        return (this.c ? 1231 : 1237) ^ ((((i ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }
}
