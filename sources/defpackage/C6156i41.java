package defpackage;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: i41, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6156i41 implements N74 {
    public int a;

    public C6156i41(int i) {
        this.a = i;
    }

    @Override // defpackage.N74
    public final Object a(AbstractC3086Xt1 abstractC3086Xt1, float f) {
        int i;
        int i2;
        int i3;
        ArrayList arrayList = new ArrayList();
        int i4 = 1;
        int i5 = 0;
        boolean z = abstractC3086Xt1.u() == 1;
        if (z) {
            abstractC3086Xt1.b();
        }
        while (abstractC3086Xt1.i()) {
            arrayList.add(Float.valueOf((float) abstractC3086Xt1.k()));
        }
        if (z) {
            abstractC3086Xt1.e();
        }
        if (this.a == -1) {
            this.a = arrayList.size() / 4;
        }
        int i6 = this.a;
        float[] fArr = new float[i6];
        int[] iArr = new int[i6];
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            i = this.a * 4;
            if (i7 >= i) {
                break;
            }
            int i10 = i7 / 4;
            double floatValue = ((Float) arrayList.get(i7)).floatValue();
            int i11 = i7 % 4;
            if (i11 == 0) {
                if (i10 > 0) {
                    float f2 = (float) floatValue;
                    if (fArr[i10 - 1] >= f2) {
                        fArr[i10] = f2 + 0.01f;
                    }
                }
                fArr[i10] = (float) floatValue;
            } else if (i11 == 1) {
                i8 = (int) (floatValue * 255.0d);
            } else if (i11 == 2) {
                i9 = (int) (floatValue * 255.0d);
            } else if (i11 == 3) {
                iArr[i10] = Color.argb(255, i8, i9, (int) (floatValue * 255.0d));
            }
            i7++;
        }
        C5124f41 c5124f41 = new C5124f41(fArr, iArr);
        if (arrayList.size() > i) {
            int size = (arrayList.size() - i) / 2;
            double[] dArr = new double[size];
            double[] dArr2 = new double[size];
            int i12 = 0;
            while (i < arrayList.size()) {
                if (i % 2 == 0) {
                    dArr[i12] = ((Float) arrayList.get(i)).floatValue();
                } else {
                    dArr2[i12] = ((Float) arrayList.get(i)).floatValue();
                    i12++;
                }
                i++;
            }
            while (true) {
                int[] iArr2 = c5124f41.b;
                if (i5 >= iArr2.length) {
                    break;
                }
                int i13 = iArr2[i5];
                double d = c5124f41.a[i5];
                int i14 = i4;
                while (true) {
                    if (i14 < size) {
                        int i15 = i14 - 1;
                        double d2 = dArr[i15];
                        double d3 = dArr[i14];
                        if (d3 >= d) {
                            double d4 = (d - d2) / (d3 - d2);
                            PointF pointF = CX1.a;
                            i2 = i5;
                            double max = Math.max(0.0d, Math.min(1.0d, d4));
                            double d5 = dArr2[i15];
                            i3 = (int) ((((dArr2[i14] - d5) * max) + d5) * 255.0d);
                            break;
                        }
                        i14++;
                    } else {
                        i2 = i5;
                        i3 = (int) (dArr2[size - 1] * 255.0d);
                        break;
                    }
                }
                iArr2[i2] = Color.argb(i3, Color.red(i13), Color.green(i13), Color.blue(i13));
                i5 = i2 + 1;
                i4 = 1;
            }
        }
        return c5124f41;
    }
}
