package defpackage;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class KO3 implements ActionMode.Callback {
    public C8565p5 a;
    public boolean b;

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        if (this.b) {
            this.a.b();
            this.b = false;
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        boolean z = !(actionMode.getType() == 1);
        if (z != this.b) {
            if (z) {
                this.a.c();
            } else {
                this.a.b();
            }
            this.b = z;
        }
        return true;
    }
}
