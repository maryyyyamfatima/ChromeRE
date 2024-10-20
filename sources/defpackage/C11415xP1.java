package defpackage;

import androidx.fragment.app.h;
import org.chromium.components.media_router.BrowserMediaRouterDialogController;
import org.chromium.components.media_router.MediaRouteChooserDialogManager$Fragment;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xP1 */
/* loaded from: classes2.dex */
public final class C11415xP1 extends AbstractC1015Hv {
    public C11415xP1(String str, C6614jQ1 c6614jQ1, BrowserMediaRouterDialogController browserMediaRouterDialogController) {
        super(str, c6614jQ1, browserMediaRouterDialogController);
    }

    @Override // defpackage.AbstractC1015Hv
    public final DialogInterfaceOnCancelListenerC7423lm0 b(h hVar) {
        if (hVar.B("android.support.v7.mediarouter:MediaRouteChooserDialogFragment") != null) {
            return null;
        }
        MediaRouteChooserDialogManager$Fragment mediaRouteChooserDialogManager$Fragment = new MediaRouteChooserDialogManager$Fragment(this);
        mediaRouteChooserDialogManager$Fragment.T0(this.b);
        mediaRouteChooserDialogManager$Fragment.Q0(hVar, "android.support.v7.mediarouter:MediaRouteChooserDialogFragment");
        hVar.w(true);
        hVar.C();
        return mediaRouteChooserDialogManager$Fragment;
    }
}
