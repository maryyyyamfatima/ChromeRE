package defpackage;

import android.media.MediaRouter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class YQ1 extends MediaRouter.VolumeCallback {
    public final XQ1 a;

    public YQ1(XQ1 xq1) {
        this.a = xq1;
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i) {
        this.a.b(i, routeInfo);
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i) {
        this.a.a(i, routeInfo);
    }
}
