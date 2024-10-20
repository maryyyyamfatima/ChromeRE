package defpackage;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.android.chrome.R;
import org.chromium.content.browser.selection.SelectionPopupControllerImpl;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.DeviceFormFactor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Do2 */
/* loaded from: classes.dex */
public final class C0463Do2 extends ActionMode.Callback2 {
    public final SelectionPopupControllerImpl a;

    public C0463Do2(WebContents webContents) {
        SelectionPopupControllerImpl k = SelectionPopupControllerImpl.k(webContents);
        k.getClass();
        this.a = k;
        k.t = 0;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        this.a.w(actionMode, menu);
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        SelectionPopupControllerImpl selectionPopupControllerImpl = this.a;
        if (selectionPopupControllerImpl.t()) {
            return selectionPopupControllerImpl.v(actionMode, menuItem);
        }
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        SelectionPopupControllerImpl selectionPopupControllerImpl = this.a;
        actionMode.setTitle(DeviceFormFactor.b(selectionPopupControllerImpl.i) ? selectionPopupControllerImpl.h.getString(R.string.0_resource_name_obfuscated_res_0x7f1401b6) : null);
        actionMode.setSubtitle((CharSequence) null);
        return true;
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        rect.set(this.a.q());
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        SelectionPopupControllerImpl selectionPopupControllerImpl = this.a;
        selectionPopupControllerImpl.r = null;
        selectionPopupControllerImpl.s.p(Boolean.valueOf(selectionPopupControllerImpl.t()));
        if (selectionPopupControllerImpl.z) {
            selectionPopupControllerImpl.e();
        }
    }
}
