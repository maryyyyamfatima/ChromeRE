package org.chromium.chrome.browser.compositor.scene_layer;

import J.N;
import android.text.TextUtils;
import defpackage.AbstractC4240cW2;
import defpackage.C8921q70;
import org.chromium.chrome.browser.layouts.scene_layer.SceneLayer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ContextualSearchSceneLayer extends AbstractC4240cW2 {
    public long g;
    public boolean h;
    public final float i;
    public C8921q70 j;

    public ContextualSearchSceneLayer(float f) {
        this.i = f;
    }

    public void onThumbnailFetched(boolean z) {
        C8921q70 c8921q70 = this.j;
        if (c8921q70 != null) {
            boolean z2 = z && !TextUtils.isEmpty(c8921q70.e);
            c8921q70.f = z2;
            if (z2) {
                c8921q70.a(true);
            }
        }
    }

    @Override // defpackage.AbstractC4240cW2
    public final void b(SceneLayer sceneLayer) {
        N.MhNzVlSH(this.g, this, sceneLayer);
    }

    @Override // org.chromium.chrome.browser.layouts.scene_layer.SceneLayer
    public final void a() {
        if (this.g == 0) {
            this.g = N.MPHuAHE_(this);
        }
    }
}
