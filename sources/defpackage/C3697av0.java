package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: av0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3697av0 {
    public static final C3697av0 b = new C3697av0(0);
    public final long a;

    public C3697av0(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3697av0) && this.a == ((C3697av0) obj).a;
    }

    public final int hashCode() {
        return (int) this.a;
    }
}
