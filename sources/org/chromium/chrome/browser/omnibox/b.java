package org.chromium.chrome.browser.omnibox;

import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import defpackage.InterpolatorC0485Dt;
import defpackage.YF1;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class b implements YF1 {
    public LocationBarPhone a;

    public b(LocationBarPhone locationBarPhone) {
        this.a = locationBarPhone;
    }

    @Override // defpackage.YF1
    public final void destroy() {
        this.a = null;
    }

    public final int a() {
        View childAt;
        int i = 0;
        for (int i2 = 0; i2 < this.a.getChildCount() && (childAt = this.a.getChildAt(i2)) != this.a.q; i2++) {
            if (childAt.getVisibility() != 8) {
                i = childAt.getMeasuredWidth() + i;
            }
        }
        return i;
    }

    public final void b(ArrayList arrayList, long j, long j2, float f) {
        View childAt;
        for (int i = 0; i < this.a.getChildCount() && (childAt = this.a.getChildAt(i)) != this.a.q; i++) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, f);
            ofFloat.setStartDelay(j);
            ofFloat.setDuration(j2);
            ofFloat.setInterpolator(InterpolatorC0485Dt.c);
            arrayList.add(ofFloat);
        }
    }
}
