package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pg3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8765pg3 implements Comparable {
    public final String a;
    public final String g;
    public final Object[] h;
    public int i;
    public int j;

    public final int hashCode() {
        return 0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int i = this.i;
        int i2 = ((C8765pg3) obj).i;
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public C8765pg3(Object obj, String str, String str2) {
        this.a = str;
        this.g = str2;
        this.h = obj == null ? null : new Object[]{obj};
    }

    public C8765pg3(Object... objArr) {
        this.a = "<new>";
        this.g = "</new>";
        this.h = objArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8765pg3)) {
            return false;
        }
        int i = this.i;
        int i2 = ((C8765pg3) obj).i;
        return (i < i2 ? (char) 65535 : i == i2 ? (char) 0 : (char) 1) == 0;
    }
}
