package defpackage;

import J.N;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import org.chromium.chrome.browser.document.ChromeLauncherActivity;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.share.send_tab_to_self.NotificationManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class J33 extends AbstractC4815eA0 {
    public final /* synthetic */ Intent a;

    public J33(Intent intent) {
        this.a = intent;
    }

    @Override // defpackage.AbstractC4815eA0, defpackage.LC
    public final void l() {
        Intent intent = this.a;
        String action = intent.getAction();
        String w = AbstractC2281Ro1.w(intent, "send_tab_to_self.notification.guid");
        Profile d = Profile.d();
        action.getClass();
        char c = 65535;
        switch (action.hashCode()) {
            case -138144437:
                if (action.equals("send_tab_to_self.dismiss")) {
                    c = 0;
                    break;
                }
                break;
            case 91990756:
                if (action.equals("send_tab_to_self.tap")) {
                    c = 1;
                    break;
                }
                break;
            case 1171238946:
                if (action.equals("send_tab_to_self.timeout")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                NotificationManager.hideNotification(w);
                N.Mewze4cT(d, w);
                N.MUxGHiVB();
                return;
            case 1:
                Uri data = intent.getData();
                Context context = V60.a;
                Intent putExtra = new Intent().setAction("android.intent.action.VIEW").setData(data).setClass(context, ChromeLauncherActivity.class).addFlags(268435456).putExtra("com.android.browser.application_id", context.getPackageName()).putExtra("REUSE_URL_MATCHING_TAB_ELSE_NEW_TAB", true);
                AbstractC2281Ro1.a(putExtra);
                context.startActivity(putExtra);
                NotificationManager.hideNotification(w);
                N.MOtCIw4g(d, w);
                N.MOuilZ8F();
                return;
            case 2:
                N.Mewze4cT(d, w);
                N.MU30U26Y();
                return;
            default:
                return;
        }
    }
}
