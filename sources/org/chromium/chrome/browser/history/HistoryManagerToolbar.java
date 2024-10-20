package org.chromium.chrome.browser.history;

import J.N;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.android.chrome.R;
import defpackage.AbstractC8650pL;
import defpackage.AbstractViewOnClickListenerC4089c33;
import defpackage.X81;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class HistoryManagerToolbar extends AbstractViewOnClickListenerC4089c33 {
    public X81 B0;

    public HistoryManagerToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        s(R.menu.0_resource_name_obfuscated_res_0x7f100005);
        o().findItem(R.id.selection_mode_open_in_incognito).setTitle(R.string.0_resource_name_obfuscated_res_0x7f1403aa);
        V();
    }

    @Override // defpackage.AbstractViewOnClickListenerC4089c33
    public final void O() {
        super.O();
        S(this.B0.w(), this.B0.n.r);
    }

    @Override // defpackage.AbstractViewOnClickListenerC4089c33, defpackage.InterfaceC7182l33
    public final void d(ArrayList arrayList) {
        MenuItem menuItem;
        boolean z = this.W;
        super.d(arrayList);
        if (this.W) {
            int size = this.a0.c.size();
            View findViewById = findViewById(R.id.selection_mode_delete_menu_id);
            if (findViewById != null) {
                findViewById.setContentDescription(getResources().getQuantityString(R.plurals.0_resource_name_obfuscated_res_0x7f120008, size, Integer.valueOf(size)));
            }
            Menu o = o();
            int i = 0;
            while (true) {
                if (i >= o.size()) {
                    menuItem = null;
                    break;
                }
                menuItem = o.getItem(i);
                if (menuItem.getItemId() == R.id.selection_mode_copy_link) {
                    break;
                } else {
                    i++;
                }
            }
            menuItem.setVisible(size == 1);
            if (z) {
                return;
            }
            this.B0.u("SelectionEstablished");
        }
    }

    @Override // defpackage.AbstractViewOnClickListenerC4089c33
    public final void N(boolean z) {
        super.N(z);
        S(this.B0.w(), this.B0.n.r);
    }

    public final void V() {
        if (!AbstractC8650pL.a("history.deleting_enabled")) {
            o().removeItem(R.id.selection_mode_delete_menu_id);
        }
        if (N.M$3vpOHw()) {
            return;
        }
        o().removeItem(R.id.selection_mode_open_in_incognito);
    }
}
