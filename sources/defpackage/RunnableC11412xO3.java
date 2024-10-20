package defpackage;

import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xO3 */
/* loaded from: classes.dex */
public final class RunnableC11412xO3 implements Runnable {
    public final /* synthetic */ Toolbar a;

    public RunnableC11412xO3(Toolbar toolbar) {
        this.a = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4097c5 c4097c5;
        ActionMenuView actionMenuView = this.a.a;
        if (actionMenuView == null || (c4097c5 = actionMenuView.y) == null) {
            return;
        }
        c4097c5.l();
    }
}
