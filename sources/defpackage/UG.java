package defpackage;

import android.graphics.RectF;
import org.chromium.ui.base.LocalizationUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class UG extends AbstractC6407io3 {
    @Override // defpackage.AbstractC6407io3
    public final void c(int i, C5720go3[] c5720go3Arr, float f, float f2, float f3, float f4, boolean z, boolean z2, float f5) {
        float f6;
        C5720go3 c5720go3 = i >= 0 ? c5720go3Arr[i] : null;
        float f7 = 4.0f;
        float f8 = ((c5720go3 != null ? c5720go3.u : 0.0f) - 4.0f) - f;
        int i2 = 0;
        while (i2 < c5720go3Arr.length) {
            C5720go3 c5720go32 = c5720go3Arr[i2];
            float f9 = c5720go32.o;
            int min = i2 < i ? Math.min(i2, 4) : Math.min(4, i) + Math.min(4, i2 - i);
            boolean z3 = true;
            int min2 = i2 >= i ? Math.min((c5720go3Arr.length - 1) - i2, 4) : Math.min(i - i2, 4) + Math.min((c5720go3Arr.length - 1) - i, 4);
            if (LocalizationUtils.isLayoutRtl()) {
                int i3 = min;
                min = min2;
                min2 = i3;
            }
            float f10 = (min * f7) + f2;
            float f11 = (f4 - (min2 * f7)) - f3;
            float b = JM1.b(c5720go32.p + f9, f10, f11 - c5720go32.u);
            c5720go32.k(b);
            float f12 = c5720go32.q;
            RectF rectF = c5720go32.g.a;
            float f13 = (f12 - c5720go32.t) + rectF.top;
            rectF.bottom = rectF.height() + f13;
            rectF.top = f13;
            c5720go32.t = f12;
            RectF rectF2 = c5720go32.w;
            rectF2.top = f12;
            rectF2.bottom = f12 + c5720go32.v;
            float f14 = 1.0f;
            if (i2 != i) {
                float max = Math.max(c5720go32.u, 1.0f);
                if (!LocalizationUtils.isLayoutRtl() ? i2 >= i : i2 <= i) {
                    z3 = false;
                }
                if (!z3) {
                    f10 += f8;
                }
                if (z3) {
                    f11 -= f8;
                }
                f14 = JM1.b((Math.min(f9 + max, f11) - Math.max(f9, f10)) / max, 0.0f, 1.0f);
            }
            c5720go32.m = f14;
            c5720go32.e();
            if (i2 <= (z ? i + 1 : i) || i2 <= 0) {
                f6 = 0.0f;
            } else {
                C5720go3 c5720go33 = c5720go3Arr[i2 - 1];
                float i4 = c5720go33.i() * (c5720go33.u - f);
                float f15 = c5720go33.s;
                if (!LocalizationUtils.isLayoutRtl()) {
                    f15 += i4;
                }
                f6 = Math.max(f15 - b, 0.0f);
                if (LocalizationUtils.isLayoutRtl()) {
                    f6 = i4 - f6;
                }
            }
            c5720go32.l = JM1.b(f6, 0.0f, c5720go32.u);
            i2++;
            f7 = 4.0f;
        }
    }

    @Override // defpackage.AbstractC6407io3
    public final void b(int i, C5720go3[] c5720go3Arr, float f) {
        for (int i2 = 1; i2 < c5720go3Arr.length; i2++) {
            int i3 = i2 - 1;
            C5720go3 c5720go3 = c5720go3Arr[i3];
            C5720go3 c5720go32 = c5720go3Arr[i2];
            if (((int) c5720go3.t) == ((int) c5720go32.t) && ((int) c5720go3.s) == ((int) c5720go32.s)) {
                if (i2 <= i) {
                    c5720go3.l(false);
                } else if (i2 > i) {
                    c5720go32.l(false);
                }
            } else if (((int) c5720go3.s) != ((int) c5720go32.s)) {
                if (i2 <= i) {
                    c5720go3.l(true);
                } else if (i2 > i) {
                    c5720go32.l(true);
                }
            }
            if (i2 == i) {
                c5720go32.l(true);
            }
            if (i3 == i) {
                c5720go3.l(true);
            }
        }
    }
}
