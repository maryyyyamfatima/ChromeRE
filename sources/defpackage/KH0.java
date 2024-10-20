package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class KH0 extends DK2 {
    public final /* synthetic */ NH0 a;

    public KH0(NH0 nh0) {
        this.a = nh0;
    }

    @Override // defpackage.DK2
    public final void s(RecyclerView recyclerView, int i, int i2) {
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        NH0 nh0 = this.a;
        int computeVerticalScrollRange = nh0.x.computeVerticalScrollRange();
        int i3 = nh0.w;
        int i4 = computeVerticalScrollRange - i3;
        int i5 = nh0.a;
        nh0.y = i4 > 0 && i3 >= i5;
        int computeHorizontalScrollRange = nh0.x.computeHorizontalScrollRange();
        int i6 = nh0.v;
        boolean z = computeHorizontalScrollRange - i6 > 0 && i6 >= i5;
        nh0.z = z;
        boolean z2 = nh0.y;
        if (!z2 && !z) {
            if (nh0.A != 0) {
                nh0.l(0);
                return;
            }
            return;
        }
        if (z2) {
            float f = i3;
            nh0.q = (int) ((((f / 2.0f) + computeVerticalScrollOffset) * f) / computeVerticalScrollRange);
            nh0.p = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
        }
        if (nh0.z) {
            float f2 = computeHorizontalScrollOffset;
            float f3 = i6;
            nh0.t = (int) ((((f3 / 2.0f) + f2) * f3) / computeHorizontalScrollRange);
            nh0.s = Math.min(i6, (i6 * i6) / computeHorizontalScrollRange);
        }
        int i7 = nh0.A;
        if (i7 == 0 || i7 == 1) {
            nh0.l(1);
        }
    }
}
