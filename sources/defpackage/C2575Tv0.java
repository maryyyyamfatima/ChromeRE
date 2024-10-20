package defpackage;

import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Tv0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2575Tv0 implements SC0 {
    public static final int i = EnumC10209ts4.values().length;
    public static final int j = 8;
    public static final int k = 6;
    public static final int l = 7;
    public long a = -1;
    public float[] g;
    public boolean h;

    @Override // defpackage.SC0
    public final boolean a(Object obj) {
        C2575Tv0 c2575Tv0 = (C2575Tv0) obj;
        if (this == c2575Tv0) {
            return true;
        }
        return c2575Tv0 != null && this.a == c2575Tv0.a && this.h == c2575Tv0.h && Arrays.equals(this.g, c2575Tv0.g);
    }

    public final float e(EnumC10209ts4 enumC10209ts4) {
        byte c = c(enumC10209ts4.a);
        if (c == 15) {
            return Float.NaN;
        }
        return this.g[c];
    }

    public final void f(EnumC10209ts4 enumC10209ts4, float f) {
        byte b;
        int i2 = enumC10209ts4.a;
        float d = d(i2);
        if (Float.isNaN(d) || Float.isNaN(f) ? Float.isNaN(d) && Float.isNaN(f) : Math.abs(f - d) < 1.0E-5f) {
            return;
        }
        byte c = c(i2);
        if (AbstractC9523rs4.a(f)) {
            this.a = (15 << (i2 * 4)) | this.a;
            this.g[c] = Float.NaN;
        } else if (c != 15) {
            this.g[c] = f;
        } else {
            float[] fArr = this.g;
            int i3 = i;
            if (fArr == null) {
                this.g = new float[]{Float.NaN, Float.NaN};
                b = 0;
            } else {
                int i4 = 0;
                while (true) {
                    float[] fArr2 = this.g;
                    if (i4 < fArr2.length) {
                        if (AbstractC9523rs4.a(fArr2[i4])) {
                            break;
                        } else {
                            i4++;
                        }
                    } else {
                        float[] fArr3 = new float[Math.min(fArr2.length * 2, i3)];
                        this.g = fArr3;
                        System.arraycopy(fArr2, 0, fArr3, 0, fArr2.length);
                        float[] fArr4 = this.g;
                        Arrays.fill(fArr4, fArr2.length, fArr4.length, Float.NaN);
                        i4 = fArr2.length;
                        break;
                    }
                }
                b = (byte) i4;
            }
            if (b >= i3) {
                throw new IllegalStateException("The newIndex for the array cannot be bigger than the amount of Yoga Edges.");
            }
            int i5 = i2 * 4;
            this.a = ((~(15 << i5)) & this.a) | (b << i5);
            this.g[b] = f;
        }
        this.h = ((~((int) (this.a >> 24))) & 4095) != 0;
    }

    public final float b(EnumC10209ts4 enumC10209ts4) {
        float f = (enumC10209ts4 == EnumC10209ts4.k || enumC10209ts4 == EnumC10209ts4.l) ? Float.NaN : 0.0f;
        if (this.a == -1) {
            return f;
        }
        byte c = c(enumC10209ts4.a);
        if (c != 15) {
            return this.g[c];
        }
        if (this.h) {
            byte c2 = c((enumC10209ts4 == EnumC10209ts4.h || enumC10209ts4 == EnumC10209ts4.j) ? l : k);
            if (c2 != 15) {
                return this.g[c2];
            }
            int i2 = j;
            if (c(i2) != 15) {
                return this.g[c(i2)];
            }
        }
        return f;
    }

    public final float d(int i2) {
        byte c = c(i2);
        if (c == 15) {
            return Float.NaN;
        }
        return this.g[c];
    }

    public final byte c(int i2) {
        return (byte) ((this.a >> (i2 * 4)) & 15);
    }
}
