package defpackage;

import java.util.Locale;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Nn1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1756Nn1 {
    public final int a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final int f;
    public final int g;
    public final boolean h;

    public C1756Nn1(int i, int i2, int i3, String str, String str2, int i4, int i5, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = str;
        this.e = str2;
        this.f = i4;
        this.g = i5;
        this.h = z;
    }

    public final String toString() {
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[7];
        objArr[0] = Integer.valueOf(this.a);
        objArr[1] = Integer.valueOf(this.b);
        objArr[2] = this.h ? "O" : "-";
        objArr[3] = Integer.valueOf(this.f);
        objArr[4] = Integer.valueOf(this.g);
        objArr[5] = this.e;
        objArr[6] = this.d;
        return String.format(locale, "(%d,%3d) incognito: %s ntab:%d itab:%d (%s,%s)", objArr);
    }
}
