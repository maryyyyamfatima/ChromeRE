package defpackage;

import android.content.Intent;
import com.android.chrome.R;
import org.chromium.chrome.browser.media.router.ChromeMediaRouterClient;
import org.chromium.components.media_router.caf.remoting.CafExpandedControllerActivity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class OM2 extends AbstractC1534Lv {
    public OM2(AbstractC6450iw abstractC6450iw) {
        super(abstractC6450iw);
        abstractC6450iw.e.add(this);
    }

    @Override // defpackage.AbstractC1534Lv
    public final Intent f() {
        Intent intent = new Intent(V60.a, (Class<?>) CafExpandedControllerActivity.class);
        intent.putExtra("org.chromium.chrome.browser.metrics.MediaNotificationUma.EXTRA_CLICK_SOURCE", 2);
        return intent;
    }

    @Override // defpackage.AbstractC1534Lv
    public final int g() {
        ChromeMediaRouterClient.a.getClass();
        return R.id.remote_playback_notification;
    }
}
