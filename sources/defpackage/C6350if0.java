package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: if0 */
/* loaded from: classes.dex */
public final class C6350if0 extends RC1 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C6350if0(androidx.recyclerview.widget.RecyclerView r4) {
        /*
            r3 = this;
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            android.content.Context r4 = r4.getContext()
            r0.<init>(r4)
            r3.<init>(r0)
            android.view.ViewGroup$LayoutParams r4 = new android.view.ViewGroup$LayoutParams
            r1 = -1
            r2 = -2
            r4.<init>(r1, r2)
            r0.setLayoutParams(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6350if0.<init>(androidx.recyclerview.widget.RecyclerView):void");
    }

    @Override // defpackage.RC1
    public final void v(PropertyModel propertyModel, OC1 oc1) {
        NC1 nc1 = (NC1) oc1;
        ViewGroup viewGroup = (ViewGroup) this.a;
        if (viewGroup.getChildCount() <= 0 || viewGroup.getChildAt(0) != nc1.d) {
            ViewParent parent = nc1.d.getParent();
            boolean z = parent instanceof ViewGroup;
            View view = nc1.d;
            if (z) {
                ((ViewGroup) parent).removeView(view);
            }
            viewGroup.removeAllViews();
            viewGroup.addView(view, new ViewGroup.LayoutParams(-1, -2));
        }
    }
}
