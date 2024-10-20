package defpackage;

import org.chromium.components.browser_ui.widget.chips.ChipView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Im4 implements InterfaceC3467aF1 {
    public boolean a;
    public final /* synthetic */ ChipView g;
    public final /* synthetic */ Runnable h;

    @Override // defpackage.InterfaceC3467aF1
    public final void P() {
    }

    public Im4(ChipView chipView, Runnable runnable) {
        this.g = chipView;
        this.h = runnable;
    }

    @Override // defpackage.InterfaceC3467aF1
    public final void n() {
        if (this.a) {
            return;
        }
        this.a = true;
        this.g.setVisibility(8);
        this.h.run();
    }
}
