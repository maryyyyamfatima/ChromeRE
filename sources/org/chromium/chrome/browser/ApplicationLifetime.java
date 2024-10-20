package org.chromium.chrome.browser;

import android.app.Activity;
import defpackage.C11814ya2;
import defpackage.C12157za2;
import defpackage.C5916hO;
import defpackage.InterfaceC8779pj;
import java.util.Iterator;
import org.chromium.base.ApplicationStatus;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ApplicationLifetime {
    public static final C12157za2 a = new C12157za2();

    public static void terminate(boolean z) {
        Iterator it = a.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            }
            C5916hO c5916hO = (C5916hO) ((InterfaceC8779pj) c11814ya2.next());
            c5916hO.i = z;
            Iterator it2 = ApplicationStatus.b().iterator();
            while (it2.hasNext()) {
                Activity activity = (Activity) it2.next();
                ApplicationStatus.e(c5916hO, activity);
                c5916hO.j++;
                activity.finish();
            }
            c5916hO.a.postDelayed(c5916hO.g, 1000L);
        }
    }
}
