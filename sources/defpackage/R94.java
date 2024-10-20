package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.view.accessibility.AccessibilityManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class R94 implements Q94 {
    public static final C6492j31 d = C6492j31.k("com/google/chrome/elements/video/eligibility/VideoEligibilityCheckerImpl");
    public final InterfaceC2938Wp3 a;
    public final AccessibilityManager b;
    public final ConnectivityManager c;

    public R94(WB2 wb2, InterfaceC2938Wp3 interfaceC2938Wp3) {
        this.a = interfaceC2938Wp3;
        Context context = ((NJ0) wb2).a;
        this.b = (AccessibilityManager) context.getSystemService("accessibility");
        this.c = (ConnectivityManager) context.getSystemService("connectivity");
    }

    public final boolean a(C7017kb4 c7017kb4) {
        char c;
        int i = c7017kb4.k;
        if (i == 0) {
            c = 5;
        } else if (i != 1) {
            c = 2;
            if (i != 2) {
                c = 3;
                if (i != 3) {
                    c = i != 11 ? (char) 0 : (char) 4;
                }
            }
        } else {
            c = 1;
        }
        if (c != 5) {
            return true;
        }
        ((InterfaceC5462g31) d.d().g("com/google/chrome/elements/video/eligibility/VideoEligibilityCheckerImpl", 67, "isVideoEligible", "VideoEligibilityCheckerImpl.java")).h("Video will not play because there is no valid video data.");
        return false;
    }
}
