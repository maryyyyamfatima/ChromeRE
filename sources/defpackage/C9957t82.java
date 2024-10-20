package defpackage;

import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: t82, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9957t82 extends AbstractC11818yb0 {
    public static final Map i = Collections.emptyMap();
    public final byte[] a = new byte[0];
    public TL2 g;
    public F0 h;

    public C9957t82(F0 f0) {
        if (f0 != null) {
            this.h = f0;
            C0822Gi1 a = AbstractC0952Hi1.a();
            a.b("Authorization", Collections.singletonList("Bearer " + f0.a));
            a.c(i.entrySet());
            this.g = a.a(true);
        }
    }

    public final int hashCode() {
        return Objects.hash(this.g, this.h);
    }

    public final String toString() {
        UY1 a = VY1.a(this);
        a.a(this.g, "requestMetadata");
        a.a(this.h, "temporaryAccess");
        return a.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9957t82)) {
            return false;
        }
        C9957t82 c9957t82 = (C9957t82) obj;
        return Objects.equals(this.g, c9957t82.g) && Objects.equals(this.h, c9957t82.h);
    }
}
