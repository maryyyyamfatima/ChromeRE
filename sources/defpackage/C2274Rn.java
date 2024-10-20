package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Rn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2274Rn extends AbstractC7832mx {
    public final List a;

    public C2274Rn(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final String toString() {
        return AbstractC4199cO1.a("BatchedLogRequest{logRequests=", String.valueOf(this.a), "}");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC7832mx)) {
            return false;
        }
        return this.a.equals(((C2274Rn) ((AbstractC7832mx) obj)).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }
}
