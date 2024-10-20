package defpackage;

import android.view.MenuItem;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nT1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemOnActionExpandListenerC8005nT1 implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener a;
    public final /* synthetic */ MenuItemC8692pT1 b;

    public MenuItemOnActionExpandListenerC8005nT1(MenuItemC8692pT1 menuItemC8692pT1, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.b = menuItemC8692pT1;
        this.a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.a.onMenuItemActionExpand(this.b.c(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.a.onMenuItemActionCollapse(this.b.c(menuItem));
    }
}
