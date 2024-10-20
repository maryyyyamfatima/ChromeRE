package defpackage;

import J.N;
import android.content.Context;
import org.chromium.chrome.browser.compositor.layouts.content.TabContentManager;
import org.chromium.chrome.browser.layouts.scene_layer.SceneLayer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bR3 */
/* loaded from: classes.dex */
public final class C3873bR3 extends SceneLayer {
    public final Context g;
    public long h;

    public C3873bR3(Context context, TabContentManager tabContentManager) {
        this.g = context;
        N.Mdsem$C6(this.h, this, tabContentManager);
    }

    public final void b(C1551Ly1 c1551Ly1, boolean z, int i) {
        float f = this.g.getResources().getDisplayMetrics().density;
        N.M_4pjYxH(this.h, this, c1551Ly1 != null ? c1551Ly1.h(C1551Ly1.e) : -1, z, c1551Ly1 != null ? c1551Ly1.j(C1551Ly1.B) : false, i, c1551Ly1 != null ? c1551Ly1.g(C1551Ly1.h) * f : 0.0f, c1551Ly1 != null ? c1551Ly1.g(C1551Ly1.i) * f : 0.0f);
    }

    @Override // org.chromium.chrome.browser.layouts.scene_layer.SceneLayer
    public final void a() {
        if (this.h == 0) {
            this.h = N.MRop2ASy(this);
        }
    }
}
