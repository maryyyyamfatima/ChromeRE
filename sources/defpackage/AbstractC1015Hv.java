package defpackage;

import androidx.fragment.app.h;
import org.chromium.base.ApplicationStatus;
import org.chromium.chrome.browser.media.router.ChromeMediaRouterClient;
import org.chromium.components.media_router.BrowserMediaRouter;
import org.chromium.components.media_router.BrowserMediaRouterDialogController;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Hv */
/* loaded from: classes2.dex */
public abstract class AbstractC1015Hv {
    public final String a;
    public final C6614jQ1 b;
    public final MQ1 c = BrowserMediaRouter.a();
    public final BrowserMediaRouterDialogController d;
    public DialogInterfaceOnCancelListenerC7423lm0 e;

    public abstract DialogInterfaceOnCancelListenerC7423lm0 b(h hVar);

    public final void a() {
        MQ1 mq1 = this.c;
        BrowserMediaRouterDialogController browserMediaRouterDialogController = this.d;
        if (mq1 == null) {
            browserMediaRouterDialogController.a();
            return;
        }
        ChromeMediaRouterClient.a.getClass();
        VS0 vs0 = (VS0) ApplicationStatus.c;
        h h0 = vs0 == null ? null : vs0.h0();
        if (h0 == null) {
            browserMediaRouterDialogController.a();
            return;
        }
        DialogInterfaceOnCancelListenerC7423lm0 b = b(h0);
        this.e = b;
        if (b == null) {
            browserMediaRouterDialogController.a();
        }
    }

    public AbstractC1015Hv(String str, C6614jQ1 c6614jQ1, BrowserMediaRouterDialogController browserMediaRouterDialogController) {
        this.a = str;
        this.b = c6614jQ1;
        this.d = browserMediaRouterDialogController;
    }
}
