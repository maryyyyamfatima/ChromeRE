package defpackage;

import androidx.appcompat.widget.ActionMenuView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class GO3 implements InterfaceC11778yT1 {
    public boolean a;
    public final /* synthetic */ JO3 g;

    public GO3(JO3 jo3) {
        this.g = jo3;
    }

    @Override // defpackage.InterfaceC11778yT1
    public final boolean d(BS1 bs1) {
        this.g.b.onMenuOpened(108, bs1);
        return true;
    }

    @Override // defpackage.InterfaceC11778yT1
    public final void c(BS1 bs1, boolean z) {
        C4097c5 c4097c5;
        if (this.a) {
            return;
        }
        this.a = true;
        JO3 jo3 = this.g;
        ActionMenuView actionMenuView = jo3.a.a.a;
        if (actionMenuView != null && (c4097c5 = actionMenuView.y) != null) {
            c4097c5.b();
            V4 v4 = c4097c5.y;
            if (v4 != null && v4.b()) {
                v4.j.dismiss();
            }
        }
        jo3.b.onPanelClosed(108, bs1);
        this.a = false;
    }
}
