package defpackage;

import android.view.MenuItem;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class FO3 implements BO3 {
    public final /* synthetic */ JO3 a;

    public FO3(JO3 jo3) {
        this.a = jo3;
    }

    @Override // defpackage.BO3
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.a.b.onMenuItemSelected(0, menuItem);
    }
}
