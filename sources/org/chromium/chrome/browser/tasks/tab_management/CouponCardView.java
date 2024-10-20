package org.chromium.chrome.browser.tasks.tab_management;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class CouponCardView extends FrameLayout {
    public TextView a;

    public CouponCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        LayoutInflater.from(getContext()).inflate(R.layout.f56740_resource_name_obfuscated_res_0x7f0e00aa, this);
        TextView textView = (TextView) findViewById(R.id.coupon_name);
        this.a = textView;
        textView.setTextColor(getContext().getColor(R.color.f25730_resource_name_obfuscated_res_0x7f07081c));
    }
}
