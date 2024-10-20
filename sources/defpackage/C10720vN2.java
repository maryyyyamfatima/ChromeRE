package defpackage;

import J.N;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import org.chromium.chrome.browser.document.ChromeLauncherActivity;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vN2 */
/* loaded from: classes.dex */
public final class C10720vN2 implements J44 {
    public final Tab a;

    @Override // defpackage.J44
    public final /* synthetic */ void destroy() {
    }

    public static C10720vN2 a(Tab tab) {
        C10720vN2 c10720vN2 = (C10720vN2) tab.F().b(C10720vN2.class);
        return c10720vN2 == null ? (C10720vN2) tab.F().d(C10720vN2.class, new C10720vN2(tab)) : c10720vN2;
    }

    public C10720vN2(Tab tab) {
        this.a = tab;
    }

    public final void b(Intent intent, RunnableC1700Nc0 runnableC1700Nc0) {
        if (intent.getComponent() == null) {
            intent.setClass(V60.a, ChromeLauncherActivity.class);
        }
        intent.setAction("android.intent.action.VIEW");
        boolean isEmpty = TextUtils.isEmpty(intent.getDataString());
        Tab tab = this.a;
        if (isEmpty) {
            intent.setData(Uri.parse(tab.getUrl().i()));
        }
        if (tab.isIncognito()) {
            intent.putExtra("com.android.browser.application_id", V60.a.getPackageName());
            intent.putExtra("com.google.android.apps.chrome.EXTRA_OPEN_NEW_INCOGNITO_TAB", true);
        }
        AbstractC2281Ro1.a(intent);
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("TabReparenting")) {
            intent.putExtra("com.android.chrome.tab_id", tab.getId());
            AbstractC10848vl.a.a(tab.getId(), new C10313uA3(tab, runnableC1700Nc0));
            WebContents b = tab.b();
            if (b != null) {
                b.i1(null);
            }
            tab.G(null, null);
        }
    }
}
