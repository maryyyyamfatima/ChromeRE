package defpackage;

import J.N;
import android.content.Context;
import org.chromium.chrome.browser.layouts.scene_layer.SceneLayer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class RA3 extends AbstractC4240cW2 {
    public long g;
    public final float h;
    public int i;
    public int j;

    public RA3(Context context) {
        this.h = context.getResources().getDisplayMetrics().density;
    }

    @Override // org.chromium.chrome.browser.layouts.scene_layer.SceneLayer
    public final void a() {
        if (this.g == 0) {
            this.g = N.M8m15MW0(this);
        }
    }

    public final void c() {
        N.MPFnESYL(this.a, this);
        this.g = 0L;
    }

    @Override // defpackage.AbstractC4240cW2
    public final void b(SceneLayer sceneLayer) {
        N.Mm9evJzJ(this.g, this, sceneLayer);
    }

    public final void d(C6064ho3 c6064ho3) {
        long j = this.g;
        if (j == 0) {
            return;
        }
        float f = c6064ho3.b;
        float f2 = c6064ho3.c;
        float f3 = this.h;
        N.MPlUOAh0(j, this, f, 0.0f, f2 * f3, c6064ho3.d * f3, c6064ho3.a, c6064ho3.e);
    }
}
