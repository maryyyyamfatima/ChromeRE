package defpackage;

import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class N41 {
    public final K41[] a;
    public int b;
    public final K41[][] c;
    public final int[] d;
    public final /* synthetic */ O41 e;

    public N41(O41 o41, K41[] k41Arr) {
        this.e = o41;
        int length = k41Arr.length;
        this.a = new K41[length];
        this.b = length - 1;
        int f = o41.f() + 1;
        K41[][] k41Arr2 = new K41[f];
        int[] iArr = new int[f];
        for (K41 k41 : k41Arr) {
            int i = k41.a.a;
            iArr[i] = iArr[i] + 1;
        }
        for (int i2 = 0; i2 < f; i2++) {
            k41Arr2[i2] = new K41[iArr[i2]];
        }
        Arrays.fill(iArr, 0);
        for (K41 k412 : k41Arr) {
            int i3 = k412.a.a;
            K41[] k41Arr3 = k41Arr2[i3];
            int i4 = iArr[i3];
            iArr[i3] = i4 + 1;
            k41Arr3[i4] = k412;
        }
        this.c = k41Arr2;
        this.d = new int[this.e.f() + 1];
    }

    public final void a(int i) {
        int[] iArr = this.d;
        if (iArr[i] != 0) {
            return;
        }
        iArr[i] = 1;
        for (K41 k41 : this.c[i]) {
            a(k41.a.b);
            int i2 = this.b;
            this.b = i2 - 1;
            this.a[i2] = k41;
        }
        iArr[i] = 2;
    }
}
