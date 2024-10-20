package defpackage;

import androidx.fragment.app.h;
import org.chromium.components.media_router.BrowserMediaRouterDialogController;
import org.chromium.components.media_router.MediaRouteControllerDialogManager$Fragment;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class RP1 extends AbstractC1015Hv {
    public final String f;
    public final PP1 g;

    public RP1(String str, C6614jQ1 c6614jQ1, String str2, BrowserMediaRouterDialogController browserMediaRouterDialogController) {
        super(str, c6614jQ1, browserMediaRouterDialogController);
        this.g = new PP1(this);
        this.f = str2;
    }

    @Override // defpackage.AbstractC1015Hv
    public final DialogInterfaceOnCancelListenerC7423lm0 b(h hVar) {
        if (hVar.B("androidx.mediarouter:MediaRouteControllerDialogFragment") != null) {
            return null;
        }
        PP1 pp1 = this.g;
        MediaRouteControllerDialogManager$Fragment mediaRouteControllerDialogManager$Fragment = new MediaRouteControllerDialogManager$Fragment(this, pp1);
        this.c.a(this.b, pp1, 0);
        mediaRouteControllerDialogManager$Fragment.Q0(hVar, "androidx.mediarouter:MediaRouteControllerDialogFragment");
        hVar.w(true);
        hVar.C();
        return mediaRouteControllerDialogManager$Fragment;
    }
}
