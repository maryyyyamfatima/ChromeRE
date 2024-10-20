package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dl4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4672dl4 implements Comparable {
    public static final C4328cl4 j = new C4328cl4();
    public final String a;
    public final int g;
    public int h = 0;
    public final int i;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a.compareTo(((C4672dl4) obj).a);
    }

    public C4672dl4(int i, int i2, String str) {
        this.a = str;
        this.g = i;
        this.i = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4672dl4)) {
            return false;
        }
        return this.a.equals(((C4672dl4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
