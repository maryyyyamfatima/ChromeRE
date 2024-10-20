package defpackage;

import org.chromium.chrome.browser.toolbar.top.ToolbarPhone;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class HQ3 extends HF {
    public final /* synthetic */ ToolbarPhone g;

    public HQ3(ToolbarPhone toolbarPhone) {
        this.g = toolbarPhone;
    }

    @Override // defpackage.HF
    public final void b() {
        int i = ToolbarPhone.L0;
        ToolbarPhone toolbarPhone = this.g;
        toolbarPhone.A0();
        toolbarPhone.postInvalidate();
        toolbarPhone.w0.run();
    }
}
