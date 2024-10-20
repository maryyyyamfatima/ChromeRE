package defpackage;

import android.graphics.RectF;
import org.chromium.ui.base.LocalizationUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class SY2 extends AbstractC6407io3 {
    @Override // defpackage.AbstractC6407io3
    public final void c(int i, C5720go3[] c5720go3Arr, float f, float f2, float f3, float f4, boolean z, boolean z2, float f5) {
        boolean a = UN.T.a();
        for (C5720go3 c5720go3 : c5720go3Arr) {
            if (!a) {
                c5720go3.k(c5720go3.o);
            } else if (!z2) {
                c5720go3.k(c5720go3.o + c5720go3.p);
                c5720go3.u = f5;
                c5720go3.j();
                c5720go3.w.right = c5720go3.s + c5720go3.u;
            }
            float f6 = c5720go3.q;
            RectF rectF = c5720go3.g.a;
            float f7 = (f6 - c5720go3.t) + rectF.top;
            rectF.bottom = rectF.height() + f7;
            rectF.top = f7;
            c5720go3.t = f6;
            RectF rectF2 = c5720go3.w;
            rectF2.top = f6;
            rectF2.bottom = f6 + c5720go3.v;
            c5720go3.m = 1.0f;
            c5720go3.e();
            c5720go3.l = JM1.b(0.0f, 0.0f, c5720go3.u);
        }
    }

    @Override // defpackage.AbstractC6407io3
    public final float a(C5720go3[] c5720go3Arr, float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
        float f7;
        if (UN.T.a()) {
            return super.a(c5720go3Arr, f, f2, f3, f4, f5, f6, z);
        }
        if (!LocalizationUtils.isLayoutRtl()) {
            int length = c5720go3Arr.length;
            for (int i = length > 0 ? length >= 2 ? length - 2 : length - 1 : 0; i < length; i++) {
                C5720go3 c5720go3 = c5720go3Arr[i];
                if (c5720go3.i) {
                    f7 = c5720go3.i() * c5720go3.u;
                } else {
                    f7 = c5720go3.u;
                }
                f2 = Math.max(c5720go3.s + f7, f2);
            }
            return f2 - (f / 2.0f);
        }
        float f8 = f4 - f3;
        int length2 = c5720go3Arr.length;
        if (length2 >= 1) {
            f8 = Math.min(c5720go3Arr[length2 - 1].s, f8);
        }
        return ((f / 2.0f) + f8) - f5;
    }

    @Override // defpackage.AbstractC6407io3
    public final void b(int i, C5720go3[] c5720go3Arr, float f) {
        for (C5720go3 c5720go3 : c5720go3Arr) {
            float f2 = c5720go3.s;
            c5720go3.l(c5720go3.u + f2 >= 0.0f && f2 <= f);
        }
    }
}
