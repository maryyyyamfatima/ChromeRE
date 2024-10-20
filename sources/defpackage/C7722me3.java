package defpackage;

import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: me3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7722me3 {
    public final String a;
    public final GURL b;
    public final int c;
    public final int d;
    public final int e;

    public C7722me3(int i, int i2, int i3, String str, GURL gurl) {
        this.a = str;
        this.b = gurl;
        this.d = i2;
        this.c = i;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7722me3.class != obj.getClass()) {
            return false;
        }
        C7722me3 c7722me3 = (C7722me3) obj;
        if (this.d == c7722me3.d && this.c == c7722me3.c && this.e == c7722me3.e && this.a.equals(c7722me3.a)) {
            return this.b.equals(c7722me3.b);
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) + this.d) * 31) + this.e) * 31) + this.c;
    }
}
