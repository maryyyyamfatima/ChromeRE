package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class YW3 {
    public final String a;
    public final String b;
    public final Integer c;

    public YW3(String str, String str2, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof YW3)) {
            return false;
        }
        YW3 yw3 = (YW3) obj;
        return this.a.equals(yw3.a) && this.b.equals(yw3.b) && this.c.equals(yw3.c);
    }

    public final int hashCode() {
        return (this.a + this.b).hashCode();
    }

    public final String toString() {
        return "mLanguageCode:" + this.a + " - mLanguageRepresentation " + this.b + " - mLanguageUMAHashCode " + this.c;
    }
}
