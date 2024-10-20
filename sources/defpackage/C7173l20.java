package defpackage;

import org.chromium.base.Callback;
import org.chromium.chrome.browser.layouts.scene_layer.SceneLayer;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: l20 */
/* loaded from: classes.dex */
public final class C7173l20 {
    public final SceneLayer a;
    public final PropertyModel b;
    public final TD2 c;
    public final C6829k20 d;
    public final C6485j20 e;
    public final C6143i20 f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [i20, org.chromium.base.Callback] */
    /* JADX WARN: Type inference failed for: r2v3, types: [VD2, j20] */
    public C7173l20(PropertyModel propertyModel, SceneLayer sceneLayer, TD2 td2, C6829k20 c6829k20) {
        this.b = propertyModel;
        this.a = sceneLayer;
        this.c = td2;
        this.d = c6829k20;
        ?? r2 = new Callback() { // from class: i20
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C7173l20 c7173l20 = C7173l20.this;
                c7173l20.c.d(c7173l20.b, c7173l20.a, null);
            }
        };
        this.f = r2;
        c6829k20.m(r2);
        c6829k20.i.run();
        ?? r22 = new VD2() { // from class: j20
            @Override // defpackage.VD2
            public final void d(WD2 wd2, Object obj) {
                C7173l20.this.d.i.run();
            }
        };
        this.e = r22;
        propertyModel.a(r22);
    }
}
