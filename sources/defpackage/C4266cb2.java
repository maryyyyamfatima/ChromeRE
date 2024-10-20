package defpackage;

import java.util.Objects;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cb2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4266cb2 {
    public final long a;
    public final Long b;
    public final int c;

    public C4266cb2(long j, Long l, int i) {
        this.a = j;
        this.b = l;
        this.c = i;
    }

    public final boolean b() {
        return this.b == null;
    }

    public final int a() {
        Long l = this.b;
        if (l.longValue() == 0) {
            return 100;
        }
        return (int) ((this.a * 100) / l.longValue());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4266cb2)) {
            return false;
        }
        C4266cb2 c4266cb2 = (C4266cb2) obj;
        return this.a == c4266cb2.a && this.c == c4266cb2.c && Objects.equals(this.b, c4266cb2.b);
    }

    public final int hashCode() {
        int i = ((int) this.a) * 31;
        Long l = this.b;
        return ((i + (l == null ? 0 : l.hashCode())) * 31) + this.c;
    }
}
