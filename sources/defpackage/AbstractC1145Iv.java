package defpackage;

import android.content.Context;
import android.view.MenuItem;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Iv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1145Iv {
    public final Context a;
    public C1439Lb3 b;

    public AbstractC1145Iv(Context context) {
        this.a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC2028Pp3)) {
            return menuItem;
        }
        InterfaceMenuItemC2028Pp3 interfaceMenuItemC2028Pp3 = (InterfaceMenuItemC2028Pp3) menuItem;
        if (this.b == null) {
            this.b = new C1439Lb3();
        }
        MenuItem menuItem2 = (MenuItem) this.b.get(interfaceMenuItemC2028Pp3);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC8692pT1 menuItemC8692pT1 = new MenuItemC8692pT1(this.a, interfaceMenuItemC2028Pp3);
        this.b.put(interfaceMenuItemC2028Pp3, menuItemC8692pT1);
        return menuItemC8692pT1;
    }
}
