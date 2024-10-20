package defpackage;

import android.content.Intent;
import com.android.chrome.R;
import org.chromium.chrome.browser.media.router.ChromeMediaRouterClient;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class PE extends AbstractC1534Lv {
    public PE(AbstractC6450iw abstractC6450iw) {
        super(abstractC6450iw);
        abstractC6450iw.e.add(this);
    }

    @Override // defpackage.AbstractC1534Lv
    public final Intent f() {
        ChromeMediaRouterClient chromeMediaRouterClient = ChromeMediaRouterClient.a;
        int i = this.g.c.e;
        chromeMediaRouterClient.getClass();
        Intent a = C1761No1.a(i, 1);
        a.putExtra("org.chromium.chrome.browser.metrics.MediaNotificationUma.EXTRA_CLICK_SOURCE", 1);
        return a;
    }

    @Override // defpackage.AbstractC1534Lv
    public final int g() {
        ChromeMediaRouterClient.a.getClass();
        return R.id.presentation_notification;
    }
}
