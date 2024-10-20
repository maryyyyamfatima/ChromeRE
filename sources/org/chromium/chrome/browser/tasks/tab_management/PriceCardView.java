package org.chromium.chrome.browser.tasks.tab_management;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PriceCardView extends FrameLayout {
    public TextView a;
    public TextView g;

    public PriceCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        LayoutInflater.from(getContext()).inflate(R.layout.f59930_resource_name_obfuscated_res_0x7f0e0218, this);
        this.a = (TextView) findViewById(R.id.current_price);
        TextView textView = (TextView) findViewById(R.id.previous_price);
        this.g = textView;
        textView.setPaintFlags(textView.getPaintFlags() | 16);
        this.a.setTextColor(getContext().getColor(R.color.f25730_resource_name_obfuscated_res_0x7f07081c));
        this.g.setTextColor(getContext().getColor(R.color.f17170_resource_name_obfuscated_res_0x7f0700c7));
    }
}
