package org.chromium.chrome.browser.history_clusters;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;
import com.android.chrome.R;
import defpackage.AbstractViewOnClickListenerC4089c33;
import defpackage.InterfaceC3746b33;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class HistoryClustersToolbar extends AbstractViewOnClickListenerC4089c33 {
    public EditText B0;

    public HistoryClustersToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        s(R.menu.f62130_resource_name_obfuscated_res_0x7f100004);
    }

    @Override // defpackage.AbstractViewOnClickListenerC4089c33
    public final void K(InterfaceC3746b33 interfaceC3746b33, int i, int i2) {
        super.K(interfaceC3746b33, R.string.f74630_resource_name_obfuscated_res_0x7f140509, R.id.search_menu_id);
        this.B0 = (EditText) findViewById(R.id.search_text);
    }

    @Override // defpackage.AbstractViewOnClickListenerC4089c33, defpackage.InterfaceC7182l33
    public final void d(ArrayList arrayList) {
        super.d(arrayList);
        if (this.W) {
            o().findItem(R.id.selection_mode_copy_link).setVisible(this.a0.c.size() == 1);
        }
    }
}
