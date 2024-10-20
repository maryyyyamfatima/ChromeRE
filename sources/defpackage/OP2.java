package defpackage;

import java.io.Serializable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class OP2 implements Serializable {
    public final Throwable a;

    public OP2(Throwable th) {
        AbstractC0087Ar1.e(th, "exception");
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof OP2) {
            if (AbstractC0087Ar1.a(this.a, ((OP2) obj).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.a + ')';
    }
}
