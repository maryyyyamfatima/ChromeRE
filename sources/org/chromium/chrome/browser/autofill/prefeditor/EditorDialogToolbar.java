package org.chromium.chrome.browser.autofill.prefeditor;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class EditorDialogToolbar extends Toolbar {
    public boolean W;

    public EditorDialogToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.W = true;
        s(R.menu.f62180_resource_name_obfuscated_res_0x7f100009);
        MenuItem findItem = o().findItem(R.id.delete_menu_id);
        if (findItem != null) {
            findItem.setVisible(this.W);
        }
    }
}
