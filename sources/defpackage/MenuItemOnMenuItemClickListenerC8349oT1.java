package defpackage;

import android.view.MenuItem;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oT1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC8349oT1 implements MenuItem.OnMenuItemClickListener {
    public final MenuItem.OnMenuItemClickListener a;
    public final /* synthetic */ MenuItemC8692pT1 g;

    public MenuItemOnMenuItemClickListenerC8349oT1(MenuItemC8692pT1 menuItemC8692pT1, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.g = menuItemC8692pT1;
        this.a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.a.onMenuItemClick(this.g.c(menuItem));
    }
}
