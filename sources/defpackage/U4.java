package defpackage;

import androidx.appcompat.view.menu.ActionMenuItemView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class U4 extends AbstractViewOnTouchListenerC12115zS0 {
    public final /* synthetic */ ActionMenuItemView o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U4(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.o = actionMenuItemView;
    }

    @Override // defpackage.AbstractViewOnTouchListenerC12115zS0
    public final Q93 b() {
        V4 v4;
        W4 w4 = this.o.p;
        if (w4 == null || (v4 = w4.a.y) == null) {
            return null;
        }
        return v4.a();
    }

    @Override // defpackage.AbstractViewOnTouchListenerC12115zS0
    public final boolean c() {
        Q93 b;
        ActionMenuItemView actionMenuItemView = this.o;
        AS1 as1 = actionMenuItemView.n;
        return as1 != null && as1.a(actionMenuItemView.k) && (b = b()) != null && b.a();
    }
}
