package defpackage;

import android.app.Notification;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vU3 */
/* loaded from: classes2.dex */
public abstract class AbstractC10756vU3 {
    public static PO a;
    public static int b;

    public static PO a() {
        PO a2 = X72.a("browser", null);
        a2.a.x = 1;
        a2.l(R.drawable.0_resource_name_obfuscated_res_0x7f0901d9);
        K62 k62 = a2.a;
        k62.l = false;
        k62.t = true;
        return a2;
    }

    public static void b(Notification notification) {
        C6861k72 c6861k72 = new C6861k72(V60.a);
        if (notification == null) {
            AbstractC4851eH1.a("NotifManagerProxy", "Failed to create notification.", new Object[0]);
        } else {
            c6861k72.c("tracing_status", 100, notification);
        }
    }
}
