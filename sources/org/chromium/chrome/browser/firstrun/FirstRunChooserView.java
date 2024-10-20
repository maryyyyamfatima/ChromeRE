package org.chromium.chrome.browser.firstrun;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class FirstRunChooserView extends ScrollView {
    public View a;

    @Override // android.widget.ScrollView, android.view.View
    public final float getTopFadingEdgeStrength() {
        return 0.0f;
    }

    public FirstRunChooserView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = findViewById(R.id.chooser_title);
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
        if (size2 > size) {
            layoutParams.height = (size * 9) / 16;
            View view = this.a;
            view.setPadding(view.getPaddingLeft(), 0, this.a.getPaddingRight(), this.a.getPaddingBottom());
        } else {
            layoutParams.height = -2;
            View view2 = this.a;
            view2.setPadding(view2.getPaddingLeft(), getResources().getDimensionPixelOffset(R.dimen.f40310_resource_name_obfuscated_res_0x7f080735), this.a.getPaddingRight(), this.a.getPaddingBottom());
        }
        this.a.setLayoutParams(layoutParams);
        super.onMeasure(i, i2);
    }
}
