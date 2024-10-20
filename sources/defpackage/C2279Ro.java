package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ro, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2279Ro {
    public static final /* synthetic */ int b = 0;
    public final int a;

    public C2279Ro(int i) {
        this.a = i;
    }

    public final String toString() {
        return AbstractC8207o22.a(new StringBuilder("VideoOptions{lookaheadOffset="), this.a, "}");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2279Ro) {
            return this.a == ((C2279Ro) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return 1000003 ^ this.a;
    }

    static {
        if (((byte) (0 | 1)) != 1) {
            throw new IllegalStateException("Missing required properties: lookaheadOffset");
        }
    }
}
