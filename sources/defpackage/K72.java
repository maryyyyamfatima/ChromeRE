package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class K72 {
    public final int a;
    public final String b;
    public final int c;

    public K72(int i, int i2, String str) {
        this.a = i2;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof K72)) {
            return false;
        }
        K72 k72 = (K72) obj;
        return this.a == k72.a && this.b.equals(k72.b) && this.c == k72.c;
    }
}
