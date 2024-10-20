package defpackage;

import java.util.Objects;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class GD2 extends KD2 {
    public Object a;

    public final String toString() {
        return this.a + " in " + super.toString();
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof GD2) && Objects.equals(((GD2) obj).a, this.a);
    }
}
