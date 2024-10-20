package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: p93, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8593p93 {
    public final String a;
    public final String b;

    public C8593p93(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8593p93)) {
            return false;
        }
        C8593p93 c8593p93 = (C8593p93) obj;
        return this.a.equals(c8593p93.a) && this.b.equals(c8593p93.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
