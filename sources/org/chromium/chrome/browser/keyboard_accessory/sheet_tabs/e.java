package org.chromium.chrome.browser.keyboard_accessory.sheet_tabs;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;
import defpackage.AbstractC0266Cb0;
import defpackage.AbstractC2884Wf;
import defpackage.AbstractC5798h2;
import defpackage.C1531Lu1;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class e extends AbstractC5798h2 {
    @Override // defpackage.AbstractC5798h2
    public final void v(View view, Object obj) {
        C1531Lu1 c1531Lu1 = (C1531Lu1) obj;
        PromoCodeAccessoryInfoView promoCodeAccessoryInfoView = (PromoCodeAccessoryInfoView) view;
        AbstractC0266Cb0.a(promoCodeAccessoryInfoView.g, c1531Lu1.a);
        promoCodeAccessoryInfoView.h.setText(c1531Lu1.b);
        promoCodeAccessoryInfoView.h.setVisibility(c1531Lu1.b.isEmpty() ? 8 : 0);
        Drawable a = AbstractC2884Wf.a(promoCodeAccessoryInfoView.getContext(), R.drawable.0_resource_name_obfuscated_res_0x7f09024f);
        if (a == null) {
            promoCodeAccessoryInfoView.a.setVisibility(8);
        } else {
            promoCodeAccessoryInfoView.a.setVisibility(0);
            promoCodeAccessoryInfoView.a.setImageDrawable(a);
        }
    }

    public e(RecyclerView recyclerView) {
        super(R.layout.0_resource_name_obfuscated_res_0x7f0e0155, recyclerView);
    }
}
