package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fz1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5438fz1 {
    public final String a;

    public C5438fz1(String str) {
        this.a = str;
    }

    public final String toString() {
        return Y5.a(new StringBuilder("StringHeaderFactory{value='"), this.a, "'}");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5438fz1) {
            return this.a.equals(((C5438fz1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
