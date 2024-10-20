package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ao, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0070Ao {
    public final C5427fx0 a;
    public final C10488ui0 b;

    public C0070Ao(C5427fx0 c5427fx0, C10488ui0 c10488ui0) {
        this.a = c5427fx0;
        this.b = c10488ui0;
    }

    public final String toString() {
        return KR0.a("ResolvedElement{element=", String.valueOf(this.a), ", debuggerInfo=", String.valueOf(this.b), "}");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0070Ao)) {
            return false;
        }
        C0070Ao c0070Ao = (C0070Ao) obj;
        if (this.a.equals(c0070Ao.a)) {
            C10488ui0 c10488ui0 = c0070Ao.b;
            C10488ui0 c10488ui02 = this.b;
            if (c10488ui02 == null) {
                if (c10488ui0 == null) {
                    return true;
                }
            } else if (c10488ui02.equals(c10488ui0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        C10488ui0 c10488ui0 = this.b;
        return hashCode ^ (c10488ui0 == null ? 0 : c10488ui0.hashCode());
    }
}
