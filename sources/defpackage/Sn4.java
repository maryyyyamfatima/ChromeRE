package defpackage;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import org.chromium.base.ApplicationStatus;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.webapps.WebappActivity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public abstract class Sn4 {
    public static WeakReference a(int i) {
        if (i == -1) {
            return null;
        }
        Iterator it = ApplicationStatus.b().iterator();
        while (it.hasNext()) {
            Activity activity = (Activity) it.next();
            if (activity instanceof WebappActivity) {
                AbstractActivityC1529Lu abstractActivityC1529Lu = (AbstractActivityC1529Lu) activity;
                Tab tab = abstractActivityC1529Lu.Y0.b;
                if (tab != null && tab.getId() == i) {
                    return new WeakReference(abstractActivityC1529Lu);
                }
            }
        }
        return null;
    }
}
