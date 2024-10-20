package defpackage;

import java.util.Collections;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ME3 {
    public static final CE3 b = new CE3();
    public static final ME3 c = new ME3(new GE3(Collections.emptyList()));
    public final GE3 a;

    public ME3(GE3 ge3) {
        this.a = ge3;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ME3) && ((ME3) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return ~this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
