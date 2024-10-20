package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: We, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2879We extends LinearLayout.LayoutParams {
    public final int a;
    public C2749Ve b;
    public final Interpolator c;

    public C2879We(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, JG2.j);
        this.a = obtainStyledAttributes.getInt(1, 0);
        this.b = obtainStyledAttributes.getInt(0, 0) != 1 ? null : new C2749Ve();
        if (obtainStyledAttributes.hasValue(2)) {
            this.c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(2, 0));
        }
        obtainStyledAttributes.recycle();
    }

    public C2879We() {
        super(-1, -2);
        this.a = 1;
    }

    public C2879We(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 1;
    }

    public C2879We(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.a = 1;
    }

    public C2879We(LinearLayout.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 1;
    }
}
