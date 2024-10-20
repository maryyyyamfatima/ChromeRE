package defpackage;

import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: z14, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11975z14 {
    public static final C11975z14 f = new C11975z14(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public static C11975z14 b() {
        return new C11975z14(0, new int[8], new Object[8], true);
    }

    public C11975z14(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public final void c(int i, Object obj) {
        if (!this.e) {
            throw new UnsupportedOperationException();
        }
        int i2 = this.a;
        int[] iArr = this.b;
        if (i2 == iArr.length) {
            int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
            this.b = Arrays.copyOf(iArr, i3);
            this.c = Arrays.copyOf(this.c, i3);
        }
        int[] iArr2 = this.b;
        int i4 = this.a;
        iArr2[i4] = i;
        this.c[i4] = obj;
        this.a = i4 + 1;
    }

    public final void d(LV lv) {
        if (this.a == 0) {
            return;
        }
        lv.getClass();
        for (int i = 0; i < this.a; i++) {
            int i2 = this.b[i];
            Object obj = this.c[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                lv.j(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                lv.f(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                lv.b(i3, (AbstractC4147cE) obj);
            } else if (i4 == 3) {
                KV kv = lv.a;
                kv.O(i3, 3);
                ((C11975z14) obj).d(lv);
                kv.O(i3, 4);
            } else if (i4 == 5) {
                lv.e(i3, ((Integer) obj).intValue());
            } else {
                int i5 = C1127Ir1.h;
                throw new RuntimeException(new C0997Hr1());
            }
        }
    }

    public final int a() {
        int v;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = this.b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 == 0) {
                v = KV.v(i5, ((Long) this.c[i3]).longValue());
            } else if (i6 == 1) {
                ((Long) this.c[i3]).longValue();
                v = KV.g(i5);
            } else if (i6 == 2) {
                v = KV.c(i5, (AbstractC4147cE) this.c[i3]);
            } else if (i6 == 3) {
                i2 = ((C11975z14) this.c[i3]).a() + (KV.s(i5) * 2) + i2;
            } else if (i6 == 5) {
                ((Integer) this.c[i3]).intValue();
                v = KV.f(i5);
            } else {
                int i7 = C1127Ir1.h;
                throw new IllegalStateException(new C0997Hr1());
            }
            i2 = v + i2;
        }
        this.d = i2;
        return i2;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C11975z14)) {
            return false;
        }
        C11975z14 c11975z14 = (C11975z14) obj;
        int i = this.a;
        if (i == c11975z14.a) {
            int[] iArr = this.b;
            int[] iArr2 = c11975z14.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    z = true;
                    break;
                }
                if (iArr[i2] != iArr2[i2]) {
                    z = false;
                    break;
                }
                i2++;
            }
            if (z) {
                Object[] objArr = this.c;
                Object[] objArr2 = c11975z14.c;
                int i3 = this.a;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        z2 = true;
                        break;
                    }
                    if (!objArr[i4].equals(objArr2[i4])) {
                        z2 = false;
                        break;
                    }
                    i4++;
                }
                if (z2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = (527 + i) * 31;
        int[] iArr = this.b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.c;
        int i7 = this.a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }
}
