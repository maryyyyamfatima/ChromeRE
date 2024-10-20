package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sx3 */
/* loaded from: classes.dex */
public abstract class AbstractC9894sx3 {
    public static final ArrayList a = new ArrayList(2);

    public static void a(Tab tab) {
        Object obj = ThreadUtils.a;
        TabImpl tabImpl = (TabImpl) tab;
        if (tabImpl.z != 1) {
            tabImpl.z = 1;
            WebContents webContents = tabImpl.l;
            if (webContents != null) {
                webContents.F(1);
            }
        }
        ArrayList arrayList = a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TabImpl tabImpl2 = (TabImpl) it.next();
            if (tabImpl2.isHidden()) {
                if (tabImpl2.z != 0) {
                    tabImpl2.z = 0;
                    WebContents webContents2 = tabImpl2.l;
                    if (webContents2 != null) {
                        webContents2.F(0);
                    }
                }
                it.remove();
            }
        }
        if (arrayList.contains(tab)) {
            return;
        }
        arrayList.add(tab);
    }
}
