package defpackage;

import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Do, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0460Do {
    public final InterfaceC4919eV a;
    public final Map b;

    public C0460Do(InterfaceC4919eV interfaceC4919eV, Map map) {
        if (interfaceC4919eV == null) {
            throw new NullPointerException("Null clock");
        }
        this.a = interfaceC4919eV;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.b = map;
    }

    public final String toString() {
        return KR0.a("SchedulerConfig{clock=", String.valueOf(this.a), ", values=", String.valueOf(this.b), "}");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0460Do)) {
            return false;
        }
        C0460Do c0460Do = (C0460Do) obj;
        return this.a.equals(c0460Do.a) && this.b.equals(c0460Do.b);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final long a(EnumC7223lA2 enumC7223lA2, long j, int i) {
        long a = j - this.a.a();
        C0590Eo c0590Eo = (C0590Eo) this.b.get(enumC7223lA2);
        long j2 = c0590Eo.a;
        return Math.min(Math.max((long) (Math.pow(3.0d, i - 1) * j2 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j2 > 1 ? j2 : 2L) * r12))), a), c0590Eo.b);
    }
}
