package org.chromium.components.browser_ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.Ec4;
import defpackage.NC2;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class PromoDialogLayout extends BoundedLinearLayout {
    public LinearLayout k;
    public ViewGroup l;
    public LinearLayout m;
    public ImageView n;
    public TextView o;
    public TextView p;
    public NC2 q;

    public PromoDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        this.k = (LinearLayout) findViewById(R.id.full_promo_content);
        this.l = (ViewGroup) findViewById(R.id.promo_container);
        this.m = (LinearLayout) findViewById(R.id.scrollable_promo_content);
        this.n = (ImageView) findViewById(R.id.illustration);
        this.o = (TextView) findViewById(R.id.header);
        this.p = (TextView) findViewById(R.id.subheader);
        super.onFinishInflate();
    }

    @Override // org.chromium.components.browser_ui.widget.BoundedLinearLayout, android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        LinearLayout linearLayout;
        boolean z;
        boolean z2 = false;
        if (View.MeasureSpec.getSize(i) > View.MeasureSpec.getSize(i2) * 1.5d) {
            this.k.setOrientation(0);
        } else {
            this.k.setOrientation(1);
        }
        super.onMeasure(i, i2);
        this.q.getClass();
        if (this.q.a == 0) {
            if (this.l.getMeasuredHeight() < getResources().getDimensionPixelSize(R.dimen.f38980_resource_name_obfuscated_res_0x7f0806a5)) {
                linearLayout = this.m;
                z = false;
            } else {
                linearLayout = this;
                z = true;
            }
            if (this.o.getParent() != linearLayout) {
                ((ViewGroup) this.o.getParent()).removeView(this.o);
                linearLayout.addView(this.o, 0);
                int dimensionPixelSize = z ? getResources().getDimensionPixelSize(R.dimen.f38990_resource_name_obfuscated_res_0x7f0806a6) : 0;
                TextView textView = this.o;
                WeakHashMap weakHashMap = Ec4.a;
                textView.setPaddingRelative(dimensionPixelSize, 0, dimensionPixelSize, 0);
                z2 = true;
            }
        }
        if (z2) {
            super.onMeasure(i, i2);
        }
    }
}
