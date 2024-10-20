package defpackage;

import java.io.Serializable;
import java.util.Objects;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class F0 implements Serializable {
    public final String a;
    public final Long g = null;

    public F0(String str) {
        this.a = str;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.g);
    }

    public final String toString() {
        UY1 a = VY1.a(this);
        a.a(this.a, "tokenValue");
        a.a(this.g, "expirationTimeMillis");
        return a.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof F0)) {
            return false;
        }
        F0 f0 = (F0) obj;
        return Objects.equals(this.a, f0.a) && Objects.equals(this.g, f0.g);
    }
}
