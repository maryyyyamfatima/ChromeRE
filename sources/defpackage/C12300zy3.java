package defpackage;

import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zy3 */
/* loaded from: classes.dex */
public final class C12300zy3 extends BA0 {
    @Override // defpackage.BA0
    public final void K0(final Tab tab, GURL gurl) {
        if (tab.b() == null) {
            return;
        }
        PostTask.c(AbstractC5103f04.d, new Runnable() { // from class: yy3
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC0124Ay3.a(Tab.this);
            }
        });
        tab.w(AbstractC0124Ay3.a);
    }
}
