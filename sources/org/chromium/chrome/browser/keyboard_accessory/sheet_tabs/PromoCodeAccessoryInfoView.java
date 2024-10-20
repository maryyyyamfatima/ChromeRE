package org.chromium.chrome.browser.keyboard_accessory.sheet_tabs;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.components.browser_ui.widget.chips.ChipView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
class PromoCodeAccessoryInfoView extends LinearLayout {
    public ImageView a;
    public ChipView g;
    public TextView h;

    public PromoCodeAccessoryInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (ImageView) findViewById(R.id.icon);
        this.g = (ChipView) findViewById(R.id.promo_code);
        this.h = (TextView) findViewById(R.id.details_text);
    }
}
