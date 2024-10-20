package defpackage;

import android.content.Context;
import android.content.Intent;
import org.chromium.chrome.browser.customtabs.CustomTabActivity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Kc */
/* loaded from: classes.dex */
public final class C1310Kc extends AbstractC4815eA0 {
    public final /* synthetic */ Intent a;
    public final /* synthetic */ Context g;

    public C1310Kc(Intent intent, Context context) {
        this.a = intent;
        this.g = context;
    }

    @Override // defpackage.AbstractC4815eA0, defpackage.LC
    public final void l() {
        Intent intent = this.a;
        int p = AbstractC2281Ro1.p(0, intent, "org.chromium.chrome.browser.announcement.EXTRA_INTENT_TYPE");
        String w = AbstractC2281Ro1.w(intent, "org.chromium.chrome.browser.announcement.EXTRA_URL");
        Context context = this.g;
        if (p == 1) {
            CustomTabActivity.W1(context, w);
            return;
        }
        if (p == 3) {
            new C6861k72(V60.a).b(100, "announcement_notification");
        } else {
            if (p != 4) {
                return;
            }
            CustomTabActivity.W1(context, w);
            new C6861k72(V60.a).b(100, "announcement_notification");
        }
    }
}
