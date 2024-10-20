package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lX0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7336lX0 extends AbstractC9396rX0 {
    public final boolean a;

    @Override // defpackage.AbstractC9396rX0
    public final int i() {
        return 16;
    }

    public C7336lX0(int[] iArr) {
        int length = iArr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (iArr[i] == 12) {
                z = true;
                break;
            }
            i++;
        }
        this.a = z;
    }

    @Override // defpackage.AbstractC9396rX0
    public final void j(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
        AbstractC9396rX0.g(fArr2, fArr4);
        AbstractC9396rX0.h(fArr2, fArr4);
        AbstractC9396rX0.b(fArr2, fArr4);
        AbstractC9396rX0.d(fArr, fArr3);
        AbstractC9396rX0.c(fArr2, fArr3);
        float f = fArr4[106];
        float f2 = fArr4[107];
        float f3 = fArr4[98];
        float f4 = fArr4[101];
        fArr2[10] = Math.max(f, f3);
        fArr2[11] = Math.max(f2, f4);
        if (this.a) {
            float f5 = fArr3[11];
            fArr2[6] = f5 > 0.01f ? f5 : 0.0f;
            float f6 = -f5;
            fArr2[7] = f6 > 0.01f ? f6 : 0.0f;
            fArr[2] = fArr3[12];
            fArr[3] = fArr3[13];
            return;
        }
        float f7 = fArr4[104];
        float f8 = fArr4[105];
        fArr2[6] = f7;
        fArr2[7] = f8;
        AbstractC9396rX0.e(fArr, fArr3);
    }
}
