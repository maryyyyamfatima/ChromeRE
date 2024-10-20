package defpackage;

import org.chromium.chrome.browser.toolbar.top.ToolbarPhone;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class IQ3 extends HF {
    public final /* synthetic */ ToolbarPhone g;

    @Override // defpackage.HF
    public final void b() {
        ToolbarPhone toolbarPhone = this.g;
        toolbarPhone.G = null;
        toolbarPhone.A0();
        toolbarPhone.postInvalidate();
        toolbarPhone.w0.run();
    }

    public IQ3(ToolbarPhone toolbarPhone) {
        this.g = toolbarPhone;
    }

    @Override // defpackage.HF
    public final void c() {
        int i = ToolbarPhone.L0;
        this.g.A0();
    }
}
