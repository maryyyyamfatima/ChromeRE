package defpackage;

import J.N;
import org.chromium.chrome.browser.layouts.scene_layer.SceneLayer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class NS3 extends AbstractC4240cW2 {
    public long g;
    public final InterfaceC0079Ap3 h;

    public NS3(InterfaceC0079Ap3 interfaceC0079Ap3) {
        this.h = interfaceC0079Ap3;
    }

    public final void c() {
        N.MPFnESYL(this.a, this);
        this.g = 0L;
    }

    @Override // defpackage.AbstractC4240cW2
    public final void b(SceneLayer sceneLayer) {
        N.M9k8YKLL(this.g, this, sceneLayer);
    }

    @Override // org.chromium.chrome.browser.layouts.scene_layer.SceneLayer
    public final void a() {
        if (this.g == 0) {
            this.g = N.MFC6akug(this);
        }
    }
}
