package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import com.android.chrome.R;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.webapps.WebappLauncherActivity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qn4 */
/* loaded from: classes2.dex */
public final class C9151qn4 implements InterfaceC3657ao2 {
    public final C4620dd0 a;
    public final PC g;

    @Override // defpackage.InterfaceC3657ao2
    public final void c() {
        Tab tab = this.a.b;
        In4 F = this.g.F();
        if (tab == null || F == null || F.g == 2) {
            return;
        }
        Context context = V60.a;
        C4705dr2 a = a(context, tab, "org.chromium.chrome.browser.webapps.NOTIFICATION_ACTION_FOCUS");
        C4705dr2 a2 = a(context, tab, "org.chromium.chrome.browser.webapps.NOTIFICATION_ACTION_OPEN_IN_CHROME");
        C4705dr2 a3 = a(context, tab, "org.chromium.chrome.browser.webapps.NOTIFICATION_ACTION_SHARE");
        PO a4 = X72.a("webapp_actions", new C7893n72(11, null, 5));
        a4.l(R.drawable.0_resource_name_obfuscated_res_0x7f0901d9);
        String str = F.f;
        K62 k62 = a4.a;
        k62.f(str);
        k62.e(context.getString(R.string.0_resource_name_obfuscated_res_0x7f140bd8));
        k62.l = false;
        k62.d(false);
        a4.k(true);
        k62.k = -2;
        a4.f(a);
        a4.a(R.drawable.0_resource_name_obfuscated_res_0x7f090317, context.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f140a19), a3, 7);
        a4.a(R.drawable.0_resource_name_obfuscated_res_0x7f0901ff, context.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f140635), a2, 8);
        W72 d = a4.d();
        C6861k72 c6861k72 = new C6861k72(context);
        Notification notification = d.a;
        if (notification == null) {
            AbstractC4851eH1.a("NotifManagerProxy", "Failed to create notification.", new Object[0]);
        } else {
            C7893n72 c7893n72 = d.b;
            c6861k72.c(c7893n72.b, c7893n72.c, notification);
        }
        U72.a.b(11, notification);
    }

    public C9151qn4(C4620dd0 c4620dd0, PC pc, I5 i5) {
        this.a = c4620dd0;
        this.g = pc;
        i5.b(this);
    }

    @Override // defpackage.InterfaceC3657ao2
    public final void e() {
        ((NotificationManager) V60.a.getSystemService("notification")).cancel(5);
    }

    public static C4705dr2 a(Context context, Tab tab, String str) {
        Intent intent = new Intent(str);
        intent.setClass(context, WebappLauncherActivity.class);
        intent.putExtra("com.android.chrome.tab_id", tab.getId());
        AbstractC2281Ro1.a(intent);
        return C4705dr2.a(context, 0, intent, 1207959552);
    }
}
