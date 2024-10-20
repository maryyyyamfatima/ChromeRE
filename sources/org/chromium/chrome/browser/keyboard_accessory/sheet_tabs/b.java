package org.chromium.chrome.browser.keyboard_accessory.sheet_tabs;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;
import defpackage.AbstractC5798h2;
import defpackage.C1791Nu1;
import java.util.ArrayList;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.keyboard_accessory.data.UserInfoField;
import org.chromium.components.browser_ui.widget.chips.ChipView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class b extends AbstractC5798h2 {
    @Override // defpackage.AbstractC5798h2
    public final void v(View view, Object obj) {
        C1791Nu1 c1791Nu1 = (C1791Nu1) obj;
        AddressAccessoryInfoView addressAccessoryInfoView = (AddressAccessoryInfoView) view;
        w(addressAccessoryInfoView.a, (UserInfoField) c1791Nu1.c.get(0));
        ChipView chipView = addressAccessoryInfoView.g;
        ArrayList arrayList = c1791Nu1.c;
        w(chipView, (UserInfoField) arrayList.get(1));
        w(addressAccessoryInfoView.h, (UserInfoField) arrayList.get(2));
        w(addressAccessoryInfoView.i, (UserInfoField) arrayList.get(3));
        w(addressAccessoryInfoView.j, (UserInfoField) arrayList.get(4));
        w(addressAccessoryInfoView.k, (UserInfoField) arrayList.get(5));
        w(addressAccessoryInfoView.l, (UserInfoField) arrayList.get(6));
        w(addressAccessoryInfoView.m, (UserInfoField) arrayList.get(7));
        w(addressAccessoryInfoView.n, (UserInfoField) arrayList.get(8));
        w(addressAccessoryInfoView.o, (UserInfoField) arrayList.get(9));
    }

    public b(RecyclerView recyclerView) {
        super(R.layout.0_resource_name_obfuscated_res_0x7f0e014f, recyclerView);
    }

    public final void w(ChipView chipView, final UserInfoField userInfoField) {
        chipView.g.setText(userInfoField.getDisplayText());
        chipView.g.setContentDescription(userInfoField.getA11yDescription());
        if (!userInfoField.isSelectable() || userInfoField.getDisplayText().isEmpty()) {
            chipView.setVisibility(8);
            return;
        }
        chipView.setVisibility(0);
        chipView.setOnClickListener(new View.OnClickListener() { // from class: z7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserInfoField userInfoField2 = UserInfoField.this;
                Callback callback = userInfoField2.f;
                if (callback != null) {
                    callback.onResult(userInfoField2);
                }
            }
        });
        chipView.setClickable(true);
        chipView.setEnabled(true);
    }
}
