package defpackage;

import java.util.Objects;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lG1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7252lG1 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    public C7252lG1(String str, String str2, int i, int i2, int i3, int i4, int i5) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7252lG1.class != obj.getClass()) {
            return false;
        }
        C7252lG1 c7252lG1 = (C7252lG1) obj;
        return this.c == c7252lG1.c && this.d == c7252lG1.d && this.e == c7252lG1.e && this.f == c7252lG1.f && this.g == c7252lG1.g && this.a.equals(c7252lG1.a) && this.b.equals(c7252lG1.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g));
    }
}
