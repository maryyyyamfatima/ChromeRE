package defpackage;

import android.app.Activity;
import java.util.HashSet;
import java.util.Iterator;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public abstract class L5 {
    public static volatile J5 a;

    public static void a() {
        J5 j5 = a;
        j5.getClass();
        Object obj = ThreadUtils.a;
        J5.h.clear();
        j5.a.getClass();
        Iterator it = ApplicationStatus.b().iterator();
        while (it.hasNext()) {
            Activity activity = (Activity) it.next();
            if (ApplicationStatus.c(activity) == 3) {
                Integer valueOf = Integer.valueOf(activity.hashCode());
                HashSet hashSet = J5.h;
                if (!hashSet.contains(valueOf)) {
                    hashSet.add(valueOf);
                    j5.g.a(activity);
                }
            }
        }
    }
}
