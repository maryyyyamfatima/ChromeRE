package defpackage;

import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class OJ1 {
    public final Object a;
    public final Throwable b;

    public OJ1(C8985qJ1 c8985qJ1) {
        this.a = c8985qJ1;
        this.b = null;
    }

    public OJ1(Throwable th) {
        this.b = th;
        this.a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OJ1)) {
            return false;
        }
        OJ1 oj1 = (OJ1) obj;
        Object obj2 = this.a;
        if (obj2 != null && obj2.equals(oj1.a)) {
            return true;
        }
        Throwable th = this.b;
        if (th == null || oj1.b == null) {
            return false;
        }
        return th.toString().equals(th.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}
