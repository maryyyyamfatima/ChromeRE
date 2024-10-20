package org.chromium.chrome.browser.keyboard_accessory.sheet_tabs;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.android.chrome.R;
import org.chromium.components.browser_ui.widget.chips.ChipView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
class AddressAccessoryInfoView extends LinearLayout {
    public ChipView a;
    public ChipView g;
    public ChipView h;
    public ChipView i;
    public ChipView j;
    public ChipView k;
    public ChipView l;
    public ChipView m;
    public ChipView n;
    public ChipView o;

    public AddressAccessoryInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (ChipView) findViewById(R.id.name_full);
        this.g = (ChipView) findViewById(R.id.company_name);
        this.h = (ChipView) findViewById(R.id.address_home_line_1);
        this.i = (ChipView) findViewById(R.id.address_home_line_2);
        this.j = (ChipView) findViewById(R.id.address_home_zip);
        this.k = (ChipView) findViewById(R.id.address_home_city);
        this.l = (ChipView) findViewById(R.id.address_home_state);
        this.m = (ChipView) findViewById(R.id.address_home_country);
        this.n = (ChipView) findViewById(R.id.phone_home_whole_number);
        this.o = (ChipView) findViewById(R.id.email_address);
    }
}
