package defpackage;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class CW {
    public static final AW f = new AW();
    public final int[] a;
    public final int[] b;
    public final ArrayList c;
    public final C9119qi2[] d;
    public final float[] e = new float[3];

    public static int b(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    public CW(int[] iArr, int i, C9119qi2[] c9119qi2Arr) {
        BW bw;
        this.d = c9119qi2Arr;
        int[] iArr2 = new int[32768];
        this.b = iArr2;
        int i2 = 0;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            int i4 = iArr[i3];
            int b = b(Color.blue(i4), 8, 5) | (b(Color.red(i4), 8, 5) << 10) | (b(Color.green(i4), 8, 5) << 5);
            iArr[i3] = b;
            iArr2[b] = iArr2[b] + 1;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < 32768; i6++) {
            if (iArr2[i6] > 0) {
                int rgb = Color.rgb(b((i6 >> 10) & 31, 5, 8), b((i6 >> 5) & 31, 5, 8), b(i6 & 31, 5, 8));
                ThreadLocal threadLocal = AbstractC4242cX.a;
                int red = Color.red(rgb);
                int green = Color.green(rgb);
                int blue = Color.blue(rgb);
                float[] fArr = this.e;
                AbstractC4242cX.a(red, green, blue, fArr);
                if (c(fArr)) {
                    iArr2[i6] = 0;
                }
            }
            if (iArr2[i6] > 0) {
                i5++;
            }
        }
        int[] iArr3 = new int[i5];
        this.a = iArr3;
        int i7 = 0;
        for (int i8 = 0; i8 < 32768; i8++) {
            if (iArr2[i8] > 0) {
                iArr3[i7] = i8;
                i7++;
            }
        }
        if (i5 <= i) {
            this.c = new ArrayList();
            while (i2 < i5) {
                int i9 = iArr3[i2];
                this.c.add(new C9804si2(Color.rgb(b((i9 >> 10) & 31, 5, 8), b((i9 >> 5) & 31, 5, 8), b(i9 & 31, 5, 8)), iArr2[i9]));
                i2++;
            }
            return;
        }
        PriorityQueue priorityQueue = new PriorityQueue(i, f);
        priorityQueue.offer(new BW(this, 0, this.a.length - 1));
        while (priorityQueue.size() < i && (bw = (BW) priorityQueue.poll()) != null) {
            int i10 = bw.b;
            int i11 = bw.a;
            if (((i10 + 1) - i11 > 1 ? 1 : i2) == 0) {
                break;
            }
            if (((i10 + 1) - i11 > 1 ? 1 : i2) == 0) {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
            int i12 = bw.e - bw.d;
            int i13 = bw.g - bw.f;
            int i14 = bw.i - bw.h;
            int i15 = (i12 < i13 || i12 < i14) ? (i13 < i12 || i13 < i14) ? -1 : -2 : -3;
            CW cw = bw.j;
            int[] iArr4 = cw.a;
            a(iArr4, i15, i11, i10);
            Arrays.sort(iArr4, i11, bw.b + 1);
            a(iArr4, i15, i11, bw.b);
            int i16 = bw.c / 2;
            int i17 = i2;
            int i18 = i11;
            while (true) {
                int i19 = bw.b;
                if (i18 <= i19) {
                    i17 += cw.b[iArr4[i18]];
                    if (i17 >= i16) {
                        i11 = Math.min(i19 - 1, i18);
                        break;
                    }
                    i18++;
                }
            }
            BW bw2 = new BW(cw, i11 + 1, bw.b);
            bw.b = i11;
            bw.a();
            priorityQueue.offer(bw2);
            priorityQueue.offer(bw);
            i2 = 0;
        }
        ArrayList arrayList = new ArrayList(priorityQueue.size());
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            BW bw3 = (BW) it.next();
            CW cw2 = bw3.j;
            int[] iArr5 = cw2.a;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            for (int i24 = bw3.a; i24 <= bw3.b; i24++) {
                int i25 = iArr5[i24];
                int i26 = cw2.b[i25];
                i21 += i26;
                i20 += ((i25 >> 10) & 31) * i26;
                i22 += ((i25 >> 5) & 31) * i26;
                i23 += i26 * (i25 & 31);
            }
            float f2 = i21;
            C9804si2 c9804si2 = new C9804si2(Color.rgb(b(Math.round(i20 / f2), 5, 8), b(Math.round(i22 / f2), 5, 8), b(Math.round(i23 / f2), 5, 8)), i21);
            if (!c(c9804si2.b())) {
                arrayList.add(c9804si2);
            }
        }
        this.c = arrayList;
    }

    public static void a(int[] iArr, int i, int i2, int i3) {
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = (i4 & 31) | (((i4 >> 5) & 31) << 10) | (((i4 >> 10) & 31) << 5);
                i2++;
            }
            return;
        }
        if (i != -1) {
            return;
        }
        while (i2 <= i3) {
            int i5 = iArr[i2];
            iArr[i2] = ((i5 >> 10) & 31) | ((i5 & 31) << 10) | (((i5 >> 5) & 31) << 5);
            i2++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004f A[LOOP:0: B:6:0x000a->B:25:0x004f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(float[] r8) {
        /*
            r7 = this;
            r0 = 0
            qi2[] r1 = r7.d
            if (r1 == 0) goto L52
            int r2 = r1.length
            if (r2 <= 0) goto L52
            int r2 = r1.length
            r3 = r0
        La:
            if (r3 >= r2) goto L52
            r4 = r1[r3]
            r4.getClass()
            r4 = 2
            r4 = r8[r4]
            r5 = 1064514355(0x3f733333, float:0.95)
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            r6 = 1
            if (r5 < 0) goto L1e
            r5 = r6
            goto L1f
        L1e:
            r5 = r0
        L1f:
            if (r5 != 0) goto L4b
            r5 = 1028443341(0x3d4ccccd, float:0.05)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L2a
            r4 = r6
            goto L2b
        L2a:
            r4 = r0
        L2b:
            if (r4 != 0) goto L4b
            r4 = r8[r0]
            r5 = 1092616192(0x41200000, float:10.0)
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 < 0) goto L46
            r5 = 1108606976(0x42140000, float:37.0)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L46
            r4 = r8[r6]
            r5 = 1062333317(0x3f51eb85, float:0.82)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L46
            r4 = r6
            goto L47
        L46:
            r4 = r0
        L47:
            if (r4 != 0) goto L4b
            r4 = r6
            goto L4c
        L4b:
            r4 = r0
        L4c:
            if (r4 != 0) goto L4f
            return r6
        L4f:
            int r3 = r3 + 1
            goto La
        L52:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.CW.c(float[]):boolean");
    }
}
