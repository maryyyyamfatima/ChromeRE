package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tG3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10000tG3 {
    public final AbstractC8702pV1 a = C8099nk0.b;
    public final String b;

    public C10000tG3(String str) {
        AbstractC5203fJ.a(str, "message");
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10000tG3)) {
            return false;
        }
        C10000tG3 c10000tG3 = (C10000tG3) obj;
        return this.a.equals(c10000tG3.a) && this.b.equals(c10000tG3.b);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }
}
