package defpackage;

import java.util.BitSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nX0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8024nX0 extends AbstractC9396rX0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;

    public C8024nX0(int[] iArr, BitSet bitSet) {
        this.a = -1;
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.f = bitSet.get(110);
        int i = 0;
        for (int i2 : iArr) {
            switch (i2) {
                case 11:
                case 12:
                    this.c = i2;
                    break;
                case 13:
                case 14:
                    this.d = i2;
                    break;
                case 15:
                case 16:
                    i++;
                    break;
                case 17:
                case 23:
                    this.a = i2;
                    break;
                case 18:
                case 19:
                case 22:
                    this.b = i2;
                    break;
            }
        }
        if (i == 2) {
            this.e = true;
        }
    }

    @Override // defpackage.AbstractC9396rX0
    public final int i() {
        return this.f ? 17 : 16;
    }

    @Override // defpackage.AbstractC9396rX0
    public final void j(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
        int i;
        int i2;
        AbstractC9396rX0.g(fArr2, fArr4);
        AbstractC9396rX0.h(fArr2, fArr4);
        AbstractC9396rX0.a(fArr2, fArr4);
        AbstractC9396rX0.b(fArr2, fArr4);
        AbstractC9396rX0.d(fArr, fArr3);
        int i3 = this.a;
        if (i3 == -1 || (i2 = this.b) == -1) {
            float f = fArr4[104];
            float f2 = fArr4[105];
            fArr2[6] = f;
            fArr2[7] = f2;
        } else {
            float f3 = fArr3[i3];
            float f4 = fArr3[i2];
            fArr2[6] = f3;
            fArr2[7] = f4;
        }
        int i4 = this.c;
        if (i4 != -1 && (i = this.d) != -1) {
            float f5 = fArr3[i4];
            float f6 = fArr3[i];
            fArr[2] = f5;
            fArr[3] = f6;
        }
        if (this.e) {
            AbstractC9396rX0.c(fArr2, fArr3);
        } else {
            AbstractC9396rX0.f(fArr2, fArr4);
        }
    }
}
