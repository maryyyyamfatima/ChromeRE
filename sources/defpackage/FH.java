package defpackage;

import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class FH {
    public int a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FH)) {
            return false;
        }
        FH fh = (FH) obj;
        fh.getClass();
        return this.a == fh.a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{0, Integer.valueOf(this.a), 0, 0, 0, Boolean.FALSE});
    }
}
