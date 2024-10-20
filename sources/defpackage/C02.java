package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class C02 {
    public abstract int a();

    public final boolean equals(Object obj) {
        if (!(obj instanceof C02)) {
            return false;
        }
        C02 c02 = (C02) obj;
        return a() == c02.a() && V82.a(((M82) this).a, ((M82) c02).a);
    }

    public final int hashCode() {
        Object obj = ((M82) this).a;
        return (obj == null ? 0 : obj.hashCode()) ^ a();
    }

    public final String toString() {
        String valueOf = String.valueOf(((M82) this).a);
        int a = a();
        if (a == 1) {
            return valueOf;
        }
        return valueOf + " x " + a;
    }
}
