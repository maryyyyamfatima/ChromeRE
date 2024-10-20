package org.chromium.components.thinwebview.internal;

import J.N;
import android.content.Context;
import android.view.TextureView;
import defpackage.C6586jK3;
import defpackage.G20;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class CompositorViewImpl {
    public final TextureView a;
    public long b;

    public final void onCompositorLayout() {
    }

    public final void recreateSurface() {
    }

    public CompositorViewImpl(Context context, WindowAndroid windowAndroid, C6586jK3 c6586jK3) {
        TextureView textureView = new TextureView(context);
        textureView.setSurfaceTextureListener(new G20(this));
        this.a = textureView;
        this.b = N.MPS$crjv(this, windowAndroid, c6586jK3.a);
    }

    public final long getNativePtr() {
        return this.b;
    }
}
