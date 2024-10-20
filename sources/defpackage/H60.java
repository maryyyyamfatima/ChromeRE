package defpackage;

import android.view.MenuItem;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class H60 implements MenuItem.OnMenuItemClickListener {
    public final G60 a;
    public final /* synthetic */ I60 g;

    public H60(I60 i60, G60 g60) {
        this.g = i60;
        this.a = g60;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        String str = this.g.d;
        G60 g60 = this.a;
        if (itemId == 1) {
            g60.a(4);
            FI2.a(str + ".ContextMenu.OpenItemInNewTab");
            return true;
        }
        if (itemId == 2) {
            g60.c();
            FI2.a(str + ".ContextMenu.OpenItemInNewTabInGroup");
            return true;
        }
        if (itemId == 3) {
            g60.a(8);
            FI2.a(str + ".ContextMenu.OpenItemInIncognitoTab");
            return true;
        }
        if (itemId == 4) {
            g60.a(6);
            FI2.a(str + ".ContextMenu.OpenItemInNewWindow");
            return true;
        }
        if (itemId == 5) {
            g60.a(7);
            FI2.a(str + ".ContextMenu.DownloadItem");
            return true;
        }
        if (itemId != 7) {
            return false;
        }
        g60.b();
        FI2.a(str + ".ContextMenu.RemoveItem");
        return true;
    }
}
