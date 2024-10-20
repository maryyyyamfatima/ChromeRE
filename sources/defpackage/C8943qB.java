package defpackage;

import android.graphics.PathEffect;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8943qB {
    public float a;
    public float b;
    public float c;
    public float d;
    public int e;
    public int f;
    public int g;
    public int h;
    public PathEffect i;
    public float[] j;

    public final int hashCode() {
        int i = (((((((((((((((((int) this.a) + 0) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31;
        PathEffect pathEffect = this.i;
        return Arrays.hashCode(this.j) + ((i + (pathEffect != null ? pathEffect.hashCode() : 0)) * 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8943qB.class != obj.getClass()) {
            return false;
        }
        C8943qB c8943qB = (C8943qB) obj;
        return c8943qB.a == this.a && c8943qB.b == this.b && c8943qB.c == this.c && c8943qB.d == this.d && this.e == c8943qB.e && this.f == c8943qB.f && this.g == c8943qB.g && this.h == c8943qB.h && EY.b(this.i, c8943qB.i) && Arrays.equals(this.j, c8943qB.j);
    }
}
