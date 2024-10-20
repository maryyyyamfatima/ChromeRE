package defpackage;

import android.content.Context;
import org.chromium.base.ThreadUtils;
import org.chromium.base.library_loader.b;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.profiles.ProfileManager;
import org.chromium.components.signin.base.CoreAccountInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class HW0 {
    public static C10834vi3 a(Context context, String str, String str2, FW0 fw0) {
        boolean booleanValue = !b.n.f() ? false : ((Boolean) ThreadUtils.g(new GW0())).booleanValue();
        C10491ui3 c10491ui3 = (C10491ui3) C10834vi3.p.j();
        long currentTimeMillis = System.currentTimeMillis();
        if (c10491ui3.h) {
            c10491ui3.l();
            c10491ui3.h = false;
        }
        C10834vi3 c10834vi3 = (C10834vi3) c10491ui3.g;
        c10834vi3.j |= 1;
        c10834vi3.k = currentTimeMillis;
        if (c10491ui3.h) {
            c10491ui3.l();
            c10491ui3.h = false;
        }
        C10834vi3 c10834vi32 = (C10834vi3) c10491ui3.g;
        c10834vi32.j |= 32;
        c10834vi32.n = booleanValue;
        if (ProfileManager.b) {
            C1202Jg1 a = C1202Jg1.a();
            Profile d = Profile.d();
            a.getClass();
            String b = CoreAccountInfo.b(C1202Jg1.b(d).b(1));
            if (b != null) {
                if (c10491ui3.h) {
                    c10491ui3.l();
                    c10491ui3.h = false;
                }
                C10834vi3 c10834vi33 = (C10834vi3) c10491ui3.g;
                c10834vi33.getClass();
                c10834vi33.j |= 8;
                c10834vi33.m = b;
            }
        }
        if (!booleanValue || !NW0.c(context).a()) {
            return (C10834vi3) c10491ui3.j();
        }
        C8434oi3 c8434oi3 = (C8434oi3) C8777pi3.p.j();
        if (str == null) {
            str = "";
        }
        if (c8434oi3.h) {
            c8434oi3.l();
            c8434oi3.h = false;
        }
        C8777pi3 c8777pi3 = (C8777pi3) c8434oi3.g;
        c8777pi3.getClass();
        c8777pi3.j |= 16;
        c8777pi3.m = str;
        C7746mi3 c7746mi3 = (C7746mi3) C8090ni3.m.j();
        String packageName = context.getPackageName();
        if (c7746mi3.h) {
            c7746mi3.l();
            c7746mi3.h = false;
        }
        C8090ni3 c8090ni3 = (C8090ni3) c7746mi3.g;
        c8090ni3.getClass();
        packageName.getClass();
        c8090ni3.j |= 1;
        c8090ni3.k = packageName;
        if (str2 == null) {
            str2 = "";
        }
        if (c7746mi3.h) {
            c7746mi3.l();
            c7746mi3.h = false;
        }
        C8090ni3 c8090ni32 = (C8090ni3) c7746mi3.g;
        c8090ni32.getClass();
        c8090ni32.j |= 4;
        c8090ni32.l = str2;
        C8090ni3 c8090ni33 = (C8090ni3) c7746mi3.j();
        if (c8434oi3.h) {
            c8434oi3.l();
            c8434oi3.h = false;
        }
        C8777pi3 c8777pi32 = (C8777pi3) c8434oi3.g;
        c8777pi32.getClass();
        c8090ni33.getClass();
        c8777pi32.k = c8090ni33;
        c8777pi32.j |= 4;
        if (fw0 != null) {
            C9805si3 c9805si3 = (C9805si3) C10148ti3.n.j();
            if (c9805si3.h) {
                c9805si3.l();
                c9805si3.h = false;
            }
            C10148ti3 c10148ti3 = (C10148ti3) c9805si3.g;
            c10148ti3.getClass();
            String str3 = fw0.b;
            str3.getClass();
            c10148ti3.j |= 1;
            c10148ti3.k = str3;
            if (c9805si3.h) {
                c9805si3.l();
                c9805si3.h = false;
            }
            C10148ti3 c10148ti32 = (C10148ti3) c9805si3.g;
            c10148ti32.j |= 2;
            c10148ti32.l = fw0.c;
            if (c9805si3.h) {
                c9805si3.l();
                c9805si3.h = false;
            }
            C10148ti3 c10148ti33 = (C10148ti3) c9805si3.g;
            c10148ti33.j |= 4;
            c10148ti33.m = fw0.d;
            C10148ti3 c10148ti34 = (C10148ti3) c9805si3.j();
            if (c8434oi3.h) {
                c8434oi3.l();
                c8434oi3.h = false;
            }
            C8777pi3 c8777pi33 = (C8777pi3) c8434oi3.g;
            c8777pi33.getClass();
            c10148ti34.getClass();
            c8777pi33.n = c10148ti34;
            c8777pi33.j |= 32;
            C9120qi3 c9120qi3 = (C9120qi3) C9462ri3.n.j();
            if (c9120qi3.h) {
                c9120qi3.l();
                c9120qi3.h = false;
            }
            C9462ri3 c9462ri3 = (C9462ri3) c9120qi3.g;
            c9462ri3.getClass();
            String str4 = fw0.a;
            str4.getClass();
            c9462ri3.j |= 2;
            c9462ri3.l = str4;
            C9462ri3 c9462ri32 = (C9462ri3) c9120qi3.j();
            if (c8434oi3.h) {
                c8434oi3.l();
                c8434oi3.h = false;
            }
            C8777pi3 c8777pi34 = (C8777pi3) c8434oi3.g;
            c8777pi34.getClass();
            c9462ri32.getClass();
            c8777pi34.l = c9462ri32;
            c8777pi34.j |= 8;
        }
        C8777pi3 c8777pi35 = (C8777pi3) c8434oi3.j();
        if (c10491ui3.h) {
            c10491ui3.l();
            c10491ui3.h = false;
        }
        C10834vi3 c10834vi34 = (C10834vi3) c10491ui3.g;
        c10834vi34.getClass();
        c8777pi35.getClass();
        c10834vi34.l = c8777pi35;
        c10834vi34.j |= 2;
        return (C10834vi3) c10491ui3.j();
    }
}
