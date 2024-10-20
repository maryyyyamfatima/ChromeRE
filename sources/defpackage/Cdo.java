package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: do, reason: invalid class name */
/* loaded from: classes.dex */
public final class Cdo {
    public final int a;

    public Cdo(int i) {
        if (i == 0) {
            throw new NullPointerException("Null eventType");
        }
        this.a = i;
    }

    public final String toString() {
        return AbstractC4199cO1.a("Event{eventType=", RD0.a(this.a), "}");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Cdo)) {
            return false;
        }
        return AbstractC2373Sg3.a(this.a, ((Cdo) obj).a);
    }

    public final int hashCode() {
        return AbstractC2373Sg3.b(this.a) ^ 1000003;
    }
}
