package defpackage;

import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class XO1 extends MediaRouter2$ControllerCallback {
    public final /* synthetic */ C6267iP1 a;

    public XO1(C6267iP1 c6267iP1) {
        this.a = c6267iP1;
    }

    public final void onControllerUpdated(MediaRouter2.RoutingController routingController) {
        this.a.k(routingController);
    }
}
