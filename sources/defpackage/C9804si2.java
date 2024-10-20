package defpackage;

import android.graphics.Color;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: si2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9804si2 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public boolean f;
    public int g;
    public int h;
    public float[] i;

    public C9804si2(int i, int i2) {
        this.a = Color.red(i);
        this.b = Color.green(i);
        this.c = Color.blue(i);
        this.d = i;
        this.e = i2;
    }

    public final float[] b() {
        if (this.i == null) {
            this.i = new float[3];
        }
        AbstractC4242cX.a(this.a, this.b, this.c, this.i);
        return this.i;
    }

    public final void a() {
        int g;
        int g2;
        if (this.f) {
            return;
        }
        int i = this.d;
        int e = AbstractC4242cX.e(4.5f, -1, i);
        int e2 = AbstractC4242cX.e(3.0f, -1, i);
        if (e != -1 && e2 != -1) {
            this.h = AbstractC4242cX.g(-1, e);
            this.g = AbstractC4242cX.g(-1, e2);
            this.f = true;
            return;
        }
        int e3 = AbstractC4242cX.e(4.5f, -16777216, i);
        int e4 = AbstractC4242cX.e(3.0f, -16777216, i);
        if (e3 != -1 && e4 != -1) {
            this.h = AbstractC4242cX.g(-16777216, e3);
            this.g = AbstractC4242cX.g(-16777216, e4);
            this.f = true;
            return;
        }
        if (e != -1) {
            g = AbstractC4242cX.g(-1, e);
        } else {
            g = AbstractC4242cX.g(-16777216, e3);
        }
        this.h = g;
        if (e2 != -1) {
            g2 = AbstractC4242cX.g(-1, e2);
        } else {
            g2 = AbstractC4242cX.g(-16777216, e4);
        }
        this.g = g2;
        this.f = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(C9804si2.class.getSimpleName());
        sb.append(" [RGB: #");
        sb.append(Integer.toHexString(this.d));
        sb.append("] [HSL: ");
        sb.append(Arrays.toString(b()));
        sb.append("] [Population: ");
        sb.append(this.e);
        sb.append("] [Title Text: #");
        a();
        sb.append(Integer.toHexString(this.g));
        sb.append("] [Body Text: #");
        a();
        sb.append(Integer.toHexString(this.h));
        sb.append(']');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9804si2.class != obj.getClass()) {
            return false;
        }
        C9804si2 c9804si2 = (C9804si2) obj;
        return this.e == c9804si2.e && this.d == c9804si2.d;
    }

    public final int hashCode() {
        return (this.d * 31) + this.e;
    }
}
