package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.appcompat.app.a;
import com.android.chrome.R;
import org.chromium.chrome.browser.app.reengagement.ReengagementActivity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class YK2 {
    public final Context a;
    public final KU3 b;

    public YK2(a aVar, KU3 ku3) {
        this.a = aVar;
        this.b = ku3;
    }

    public final boolean a(String str) {
        int i;
        int i2;
        int i3;
        if (TextUtils.equals(str, "IPH_ChromeReengagementNotification1")) {
            i = R.string.f70200_resource_name_obfuscated_res_0x7f140332;
            i2 = R.string.f70190_resource_name_obfuscated_res_0x7f140331;
            i3 = 25;
        } else if (TextUtils.equals(str, "IPH_ChromeReengagementNotification2")) {
            i = R.string.f70220_resource_name_obfuscated_res_0x7f140334;
            i2 = R.string.f70210_resource_name_obfuscated_res_0x7f140333;
            i3 = 26;
        } else {
            if (!TextUtils.equals(str, "IPH_ChromeReengagementNotification3")) {
                return false;
            }
            i = R.string.f70240_resource_name_obfuscated_res_0x7f140336;
            i2 = R.string.f70230_resource_name_obfuscated_res_0x7f140335;
            i3 = 27;
        }
        KU3 ku3 = this.b;
        if (!ku3.shouldTriggerHelpUI(str)) {
            return false;
        }
        ku3.dismissed(str);
        PO a = X72.a("updates", new C7893n72(i3, "reengagement_notification", 200));
        Context context = this.a;
        Intent intent = new Intent(context, (Class<?>) ReengagementActivity.class);
        intent.addFlags(268435456);
        intent.setAction("launch_ntp");
        C4705dr2 a2 = C4705dr2.a(context, 0, intent, 134217728);
        a.a.f(context.getString(i));
        String string = context.getString(i2);
        K62 k62 = a.a;
        k62.e(string);
        a.l(R.drawable.f47180_resource_name_obfuscated_res_0x7f0901d9);
        a.f(a2);
        k62.d(true);
        C6861k72 c6861k72 = new C6861k72(context);
        W72 d = a.d();
        Notification notification = d.a;
        if (notification == null) {
            AbstractC4851eH1.a("NotifManagerProxy", "Failed to create notification.", new Object[0]);
        } else {
            C7893n72 c7893n72 = d.b;
            c6861k72.c(c7893n72.b, c7893n72.c, notification);
        }
        U72.a.b(i3, notification);
        return true;
    }
}
