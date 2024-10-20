package defpackage;

import org.chromium.ui.base.LocalizationUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: io3 */
/* loaded from: classes.dex */
public abstract class AbstractC6407io3 {
    public abstract void b(int i, C5720go3[] c5720go3Arr, float f);

    public abstract void c(int i, C5720go3[] c5720go3Arr, float f, float f2, float f3, float f4, boolean z, boolean z2, float f5);

    public float a(C5720go3[] c5720go3Arr, float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
        float i;
        float f7;
        float f8;
        float f9;
        int i2 = 0;
        if (!LocalizationUtils.isLayoutRtl()) {
            boolean a = UN.T.a();
            int length = c5720go3Arr.length;
            while (i2 < length) {
                C5720go3 c5720go3 = c5720go3Arr[i2];
                if (!a || !z) {
                    i = c5720go3.i();
                    f7 = c5720go3.u;
                    f8 = c5720go3.s;
                } else {
                    f8 = c5720go3.o;
                    i = 1.0f;
                    f7 = f6;
                }
                f2 = Math.max(((f7 - f) * i) + f8, f2);
                i2++;
            }
            return Math.min(f2 + f, f4 - f3) + 12.0f;
        }
        boolean a2 = UN.T.a();
        float f10 = f4 - f3;
        int length2 = c5720go3Arr.length;
        while (i2 < length2) {
            C5720go3 c5720go32 = c5720go3Arr[i2];
            if (!a2 || !z) {
                f9 = c5720go32.s;
            } else {
                f9 = c5720go32.o;
            }
            f10 = Math.min(f9, f10);
            i2++;
        }
        return (Math.max(f10, f2) - 12.0f) - f5;
    }
}
