package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: aR0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3526aR0 {
    public final LinearLayout a;
    public final View b;
    public final int c;
    public final ArrayList d = a();

    public C3526aR0(LinearLayout linearLayout, AbstractViewOnClickListenerC1897Op2 abstractViewOnClickListenerC1897Op2, RunnableC3327Zp2 runnableC3327Zp2) {
        this.a = linearLayout;
        this.b = abstractViewOnClickListenerC1897Op2;
        this.c = linearLayout.getChildCount();
        linearLayout.addOnLayoutChangeListener(new VQ0(this, runnableC3327Zp2));
    }

    public final void b() {
        LinearLayout linearLayout = this.a;
        ViewGroup viewGroup = (ViewGroup) linearLayout.getParent();
        if (linearLayout.getParent() == null) {
            return;
        }
        View view = this.b;
        if (view != null) {
            viewGroup.requestChildFocus(linearLayout, view);
        }
        int max = Math.max(0, linearLayout.getMeasuredHeight() - (viewGroup.getBottom() - viewGroup.getTop()));
        if (viewGroup.getScrollY() > max) {
            viewGroup.setScrollY(max);
        }
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (true) {
            LinearLayout linearLayout = this.a;
            if (i < linearLayout.getChildCount()) {
                arrayList.add(Integer.valueOf(i2));
                i2 += linearLayout.getChildAt(i).getMeasuredHeight();
                i++;
            } else {
                arrayList.add(Integer.valueOf(i2));
                return arrayList;
            }
        }
    }
}
