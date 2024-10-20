package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Sk3 */
/* loaded from: classes2.dex */
public final class C2393Sk3 extends AbstractC5822h6 {
    public final /* synthetic */ C2913Wk3 i;

    @Override // defpackage.AbstractC5822h6
    public final void V0(Tab tab) {
        C2913Wk3 c2913Wk3 = this.i;
        c2913Wk3.t = tab;
        c2913Wk3.z = c2913Wk3.h();
        if (tab == null) {
            return;
        }
        c2913Wk3.j();
    }

    @Override // defpackage.BA0
    public final void g0(Tab tab, WindowAndroid windowAndroid) {
        if (windowAndroid == null) {
            this.i.t = null;
        }
    }

    @Override // defpackage.BA0
    public final void l0(Tab tab) {
        C2913Wk3 c2913Wk3 = this.i;
        boolean h = c2913Wk3.h();
        if (c2913Wk3.z || h) {
            c2913Wk3.j();
        }
        c2913Wk3.z = h;
    }

    @Override // defpackage.BA0
    public final void r0(Tab tab) {
        C2913Wk3 c2913Wk3 = this.i;
        c2913Wk3.t = null;
        c2913Wk3.z = false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2393Sk3(C2913Wk3 c2913Wk3, C6166i6 c6166i6) {
        super(c6166i6);
        this.i = c2913Wk3;
    }

    @Override // defpackage.BA0
    public final void P0(int i, Tab tab) {
        this.i.j();
    }

    @Override // defpackage.BA0
    public final void s0(int i, Tab tab) {
        this.i.j();
    }
}
