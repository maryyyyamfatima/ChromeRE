package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.preference.Preference;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sy2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnCreateContextMenuListenerC9898sy2 implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {
    public final Preference a;

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Preference preference = this.a;
        ClipboardManager clipboardManager = (ClipboardManager) preference.a.getSystemService("clipboard");
        CharSequence n = preference.n();
        clipboardManager.setPrimaryClip(ClipData.newPlainText("Preference", n));
        Context context = preference.a;
        Toast.makeText(context, context.getString(R.string.f81780_resource_name_obfuscated_res_0x7f140842, n), 0).show();
        return true;
    }

    public ViewOnCreateContextMenuListenerC9898sy2(Preference preference) {
        this.a = preference;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        Preference preference = this.a;
        CharSequence n = preference.n();
        if (!preference.I || TextUtils.isEmpty(n)) {
            return;
        }
        contextMenu.setHeaderTitle(n);
        contextMenu.add(0, 0, 0, R.string.f71800_resource_name_obfuscated_res_0x7f1403d5).setOnMenuItemClickListener(this);
    }
}
