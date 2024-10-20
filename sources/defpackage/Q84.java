package defpackage;

import android.view.View;
import com.facebook.litho.ComponentTree;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class Q84 {
    public static void a(C7849n00 c7849n00, int i, int i2, C8753pe3 c8753pe3, ComponentTree componentTree, WZ wz, boolean z, boolean z2) {
        if (z && (!z2 || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE)) {
            Sq4 p0 = Tq4.p0(c7849n00);
            p0.x(wz);
            ((BY) p0.h.b0()).O(View.MeasureSpec.getSize(i2));
            wz = p0.d();
        }
        componentTree.t(wz, i, View.MeasureSpec.makeMeasureSpec(0, 0), c8753pe3);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            c8753pe3.b = Math.min(View.MeasureSpec.getSize(i2), c8753pe3.b);
        } else {
            if (mode != 1073741824) {
                return;
            }
            c8753pe3.b = View.MeasureSpec.getSize(i2);
        }
    }
}
