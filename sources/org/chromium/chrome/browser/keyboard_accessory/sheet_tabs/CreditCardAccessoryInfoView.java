package org.chromium.chrome.browser.keyboard_accessory.sheet_tabs;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.android.chrome.R;
import org.chromium.components.browser_ui.widget.chips.ChipView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
class CreditCardAccessoryInfoView extends LinearLayout {
    public ImageView a;
    public ChipView g;
    public LinearLayout h;
    public ChipView i;
    public ChipView j;
    public ChipView k;
    public ChipView l;

    public CreditCardAccessoryInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (ImageView) findViewById(R.id.icon);
        this.g = (ChipView) findViewById(R.id.cc_number);
        this.h = (LinearLayout) findViewById(R.id.exp_group);
        this.i = (ChipView) findViewById(R.id.exp_month);
        this.j = (ChipView) findViewById(R.id.exp_year);
        this.k = (ChipView) findViewById(R.id.cardholder);
        this.l = (ChipView) findViewById(R.id.cvc);
    }
}
