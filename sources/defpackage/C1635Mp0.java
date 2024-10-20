package defpackage;

import J.N;
import android.content.Intent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Mp0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1635Mp0 extends AbstractC4815eA0 {
    public final /* synthetic */ Intent a;

    public C1635Mp0(Intent intent) {
        this.a = intent;
    }

    @Override // defpackage.AbstractC4815eA0, defpackage.LC
    public final void l() {
        Intent intent = this.a;
        int p = AbstractC2281Ro1.p(-1, intent, "org.chromium.chrome.browser.notifications.scheduler.EXTRA_INTENT_TYPE");
        String w = AbstractC2281Ro1.w(intent, "org.chromium.chrome.browser.notifications.scheduler.EXTRA_GUID");
        int p2 = AbstractC2281Ro1.p(0, intent, "org.chromium.chrome.browser.notifications.scheduler.EXTRA_SCHEDULER_CLIENT_TYPE ");
        if (p == 0) {
            N.MJnQd5Zg(p2, 0, w, 0, null);
            new C6861k72(V60.a).b(w.hashCode(), "NotificationSchedulerDisplayAgent");
        } else if (p == 1) {
            N.MJnQd5Zg(p2, 1, w, AbstractC2281Ro1.p(0, intent, "org.chromium.chrome.browser.notifications.scheduler.EXTRA_ACTION_BUTTON_TYPE"), AbstractC2281Ro1.w(intent, "org.chromium.chrome.browser.notifications.scheduler.EXTRA_ACTION_BUTTON_ID"));
            new C6861k72(V60.a).b(w.hashCode(), "NotificationSchedulerDisplayAgent");
        } else {
            if (p != 2) {
                return;
            }
            N.MJnQd5Zg(p2, 2, w, 0, null);
        }
    }
}
