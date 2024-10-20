package defpackage;

import j$.util.Optional;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: No, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1759No {
    public final Optional a;

    public C1759No(Optional optional) {
        if (optional == null) {
            throw new NullPointerException("Null timestamp");
        }
        this.a = optional;
    }

    public final String toString() {
        return AbstractC4199cO1.a("TransitionMetadata{timestamp=", String.valueOf(this.a), "}");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1759No)) {
            return false;
        }
        return this.a.equals(((C1759No) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }
}
