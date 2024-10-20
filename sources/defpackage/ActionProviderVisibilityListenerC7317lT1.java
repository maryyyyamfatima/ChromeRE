package defpackage;

import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lT1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ActionProviderVisibilityListenerC7317lT1 extends AbstractC6973kT1 implements ActionProvider.VisibilityListener {
    public C5943hT1 c;

    public ActionProviderVisibilityListenerC7317lT1(MenuItemC8692pT1 menuItemC8692pT1, ActionProvider actionProvider) {
        super(menuItemC8692pT1, actionProvider);
    }

    @Override // defpackage.AbstractC9250r5
    public final View b(MenuItem menuItem) {
        return this.a.onCreateActionView(menuItem);
    }

    @Override // defpackage.AbstractC9250r5
    public final boolean c() {
        return this.a.overridesItemVisibility();
    }

    @Override // defpackage.AbstractC9250r5
    public final boolean a() {
        return this.a.isVisible();
    }

    @Override // defpackage.AbstractC9250r5
    public final void d(C5943hT1 c5943hT1) {
        this.c = c5943hT1;
        this.a.setVisibilityListener(this);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        C5943hT1 c5943hT1 = this.c;
        if (c5943hT1 != null) {
            BS1 bs1 = c5943hT1.a.n;
            bs1.h = true;
            bs1.p(true);
        }
    }
}
