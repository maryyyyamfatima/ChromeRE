package defpackage;

import J.N;
import android.app.Activity;
import org.chromium.base.ApplicationStatus;
import org.chromium.chrome.browser.ChromeTabbedActivity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Y60 {
    public static Y60 a;

    public static void b() {
        C9608s72 a2;
        C7928nE c7928nE = UN.a;
        if (N.M6bsIDpc("NotificationPermissionVariant", "enable_contextual_permission_requests", false) && (a2 = a()) != null) {
            a2.a();
        }
    }

    public static C9608s72 a() {
        Activity activity = ApplicationStatus.c;
        if (!(activity instanceof ChromeTabbedActivity)) {
            return null;
        }
        C10285u6 c10285u6 = ((ChromeTabbedActivity) activity).H;
        if (c10285u6 == null) {
            K14 k14 = C9608s72.h;
            return null;
        }
        return (C9608s72) C9608s72.h.e(c10285u6.t);
    }
}
