package defpackage;

import android.view.MenuItem;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: g5 */
/* loaded from: classes.dex */
public final class C5472g5 implements InterfaceC12116zS1 {
    public final /* synthetic */ ActionMenuView a;

    public C5472g5(ActionMenuView actionMenuView) {
        this.a = actionMenuView;
    }

    @Override // defpackage.InterfaceC12116zS1
    public final boolean a(BS1 bs1, MenuItem menuItem) {
        boolean onMenuItemClick;
        C11069wO3 c11069wO3 = this.a.F;
        if (c11069wO3 == null) {
            return false;
        }
        Toolbar toolbar = c11069wO3.a;
        if (toolbar.L.a(menuItem)) {
            onMenuItemClick = true;
        } else {
            BO3 bo3 = toolbar.N;
            onMenuItemClick = bo3 != null ? bo3.onMenuItemClick(menuItem) : false;
        }
        return onMenuItemClick;
    }

    @Override // defpackage.InterfaceC12116zS1
    public final void b(BS1 bs1) {
        InterfaceC12116zS1 interfaceC12116zS1 = this.a.A;
        if (interfaceC12116zS1 != null) {
            interfaceC12116zS1.b(bs1);
        }
    }
}
