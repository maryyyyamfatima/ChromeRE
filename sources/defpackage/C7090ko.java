package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ko, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7090ko {
    public final C9837so a;
    public final long b;

    public C7090ko(C9837so c9837so, long j) {
        this.a = c9837so;
        this.b = j;
    }

    public final String toString() {
        return "RecentAppFlow{appFlow=" + String.valueOf(this.a) + ", loggedTimeNanos=" + this.b + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7090ko)) {
            return false;
        }
        C7090ko c7090ko = (C7090ko) obj;
        return this.a.equals(c7090ko.a) && this.b == c7090ko.b;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        return hashCode ^ ((int) (j ^ (j >>> 32)));
    }
}
