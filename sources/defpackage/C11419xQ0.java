package defpackage;

import J.N;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import com.android.chrome.R;
import org.chromium.content.browser.selection.SelectionPopupControllerImpl;
import org.chromium.content.browser.webcontents.WebContentsImpl;
import org.chromium.ui.base.Clipboard;
import org.chromium.ui.base.DeviceFormFactor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xQ0 */
/* loaded from: classes2.dex */
public final class C11419xQ0 extends ActionMode.Callback2 {
    public final /* synthetic */ C11762yQ0 a;

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        C11762yQ0 c11762yQ0 = this.a;
        boolean a = DeviceFormFactor.a(c11762yQ0.c);
        Context context = c11762yQ0.c;
        actionMode.setTitle(a ? context.getString(R.string.0_resource_name_obfuscated_res_0x7f1401b6) : null);
        actionMode.setSubtitle((CharSequence) null);
        boolean z = SelectionPopupControllerImpl.N;
        try {
            actionMode.getMenuInflater().inflate(R.menu.0_resource_name_obfuscated_res_0x7f10000c, menu);
        } catch (Resources.NotFoundException unused) {
            new MenuInflater(context).inflate(R.menu.0_resource_name_obfuscated_res_0x7f10000c, menu);
        }
        C9928t33 c9928t33 = c11762yQ0.b;
        c9928t33.getClass();
        if (!Clipboard.getInstance().a()) {
            menu.removeItem(R.id.select_action_menu_paste);
        }
        SelectionPopupControllerImpl selectionPopupControllerImpl = c9928t33.a;
        if (!selectionPopupControllerImpl.x) {
            menu.removeItem(R.id.select_action_menu_select_all);
        }
        boolean z2 = false;
        if (Build.VERSION.SDK_INT < 26) {
            selectionPopupControllerImpl.getClass();
        } else if (selectionPopupControllerImpl.y) {
            z2 = Clipboard.getInstance().hasHTMLOrStyledText();
        }
        if (!z2) {
            menu.removeItem(R.id.select_action_menu_paste_as_plain_text);
        }
        MenuItem findItem = menu.findItem(R.id.select_action_menu_paste_as_plain_text);
        if (findItem != null) {
            findItem.setTitle(android.R.string.paste_as_plain_text);
        }
        menu.removeItem(R.id.select_action_menu_cut);
        menu.removeItem(R.id.select_action_menu_copy);
        menu.removeItem(R.id.select_action_menu_share);
        menu.removeItem(R.id.select_action_menu_web_search);
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        C11762yQ0 c11762yQ0 = this.a;
        c11762yQ0.getClass();
        c11762yQ0.d = null;
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        rect.set(this.a.e);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        this.a.getClass();
        return false;
    }

    public C11419xQ0(C11762yQ0 c11762yQ0) {
        this.a = c11762yQ0;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        C11762yQ0 c11762yQ0 = this.a;
        if (itemId == R.id.select_action_menu_paste) {
            SelectionPopupControllerImpl selectionPopupControllerImpl = c11762yQ0.b.a;
            WebContentsImpl webContentsImpl = selectionPopupControllerImpl.j;
            webContentsImpl.q();
            N.MYRJ_nNk(webContentsImpl.g);
            selectionPopupControllerImpl.i();
            actionMode.finish();
            return true;
        }
        if (itemId == R.id.select_action_menu_paste_as_plain_text) {
            SelectionPopupControllerImpl selectionPopupControllerImpl2 = c11762yQ0.b.a;
            WebContentsImpl webContentsImpl2 = selectionPopupControllerImpl2.j;
            webContentsImpl2.q();
            N.MdSkKRWg(webContentsImpl2.g);
            selectionPopupControllerImpl2.i();
            actionMode.finish();
            return true;
        }
        if (itemId != R.id.select_action_menu_select_all) {
            c11762yQ0.getClass();
            return true;
        }
        SelectionPopupControllerImpl selectionPopupControllerImpl3 = c11762yQ0.b.a;
        WebContentsImpl webContentsImpl3 = selectionPopupControllerImpl3.j;
        webContentsImpl3.q();
        N.MNvj1u1S(webContentsImpl3.g);
        selectionPopupControllerImpl3.f11539J = null;
        if (selectionPopupControllerImpl3.v) {
            FI2.a("MobileActionMode.SelectAllWasEditable");
        } else {
            FI2.a("MobileActionMode.SelectAllWasNonEditable");
        }
        actionMode.finish();
        return true;
    }
}
