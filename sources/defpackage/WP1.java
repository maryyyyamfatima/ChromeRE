package defpackage;

import android.os.Bundle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class WP1 {
    public final Bundle a;
    public C6614jQ1 b;

    public WP1(C6614jQ1 c6614jQ1, boolean z) {
        if (c6614jQ1 == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        Bundle bundle = new Bundle();
        this.a = bundle;
        this.b = c6614jQ1;
        bundle.putBundle("selector", c6614jQ1.a);
        bundle.putBoolean("activeScan", z);
    }

    public final int hashCode() {
        a();
        return this.b.hashCode() ^ (b() ? 1 : 0);
    }

    public final void a() {
        if (this.b == null) {
            C6614jQ1 b = C6614jQ1.b(this.a.getBundle("selector"));
            this.b = b;
            if (b == null) {
                this.b = C6614jQ1.c;
            }
        }
    }

    public final boolean b() {
        return this.a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WP1)) {
            return false;
        }
        WP1 wp1 = (WP1) obj;
        a();
        C6614jQ1 c6614jQ1 = this.b;
        wp1.a();
        return c6614jQ1.equals(wp1.b) && b() == wp1.b();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb.append(this.b);
        sb.append(", activeScan=");
        sb.append(b());
        sb.append(", isValid=");
        a();
        this.b.a();
        sb.append(!r1.b.contains(null));
        sb.append(" }");
        return sb.toString();
    }
}
