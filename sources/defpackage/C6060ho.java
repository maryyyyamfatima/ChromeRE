package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ho, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6060ho {
    public final boolean a;
    public final boolean b;

    public C6060ho(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final String toString() {
        return "ExperimentConfiguration{tiktokIntegrationEnabled=" + this.a + ", throwExceptionForEventsLoggedInFuture=" + this.b + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6060ho)) {
            return false;
        }
        C6060ho c6060ho = (C6060ho) obj;
        return this.a == c6060ho.a && this.b == c6060ho.b;
    }

    public final int hashCode() {
        return (((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237);
    }
}
