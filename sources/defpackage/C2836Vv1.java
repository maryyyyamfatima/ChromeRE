package defpackage;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Vv1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2836Vv1 extends ActionMode.Callback2 {
    public final /* synthetic */ ActionMode.Callback2 a;

    public C2836Vv1(ActionMode.Callback2 callback2) {
        this.a = callback2;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.a.onCreateActionMode(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.a.onPrepareActionMode(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.a.onActionItemClicked(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        PostTask.c(AbstractC5103f04.a, new RunnableC2706Uv1(this, actionMode));
    }
}
