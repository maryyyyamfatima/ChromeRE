package defpackage;

import org.chromium.components.browser_ui.widget.chips.ChipView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Hm4 implements InterfaceC3467aF1 {
    public boolean a;
    public final /* synthetic */ ChipView g;

    @Override // defpackage.InterfaceC3467aF1
    public final void n() {
    }

    public Hm4(ChipView chipView) {
        this.g = chipView;
    }

    @Override // defpackage.InterfaceC3467aF1
    public final void P() {
        if (this.a) {
            return;
        }
        this.a = true;
        this.g.setVisibility(0);
    }
}
