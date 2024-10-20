package defpackage;

import android.content.Intent;
import android.text.TextUtils;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class WK2 extends BA0 implements J44 {
    public Tab a;
    public final VK2 g = new VK2();

    @Override // defpackage.BA0
    public final void g0(Tab tab, WindowAndroid windowAndroid) {
    }

    public static void V0(Tab tab, Intent intent) {
        K44 F = tab.F();
        WK2 wk2 = (WK2) F.b(WK2.class);
        if (wk2 == null) {
            wk2 = new WK2(tab);
            F.d(WK2.class, wk2);
            tab.v(wk2);
        }
        boolean g = C0507Dx1.g(intent);
        boolean j = AbstractC2281Ro1.j(intent, "android.support.customtabs.extra.SEND_TO_EXTERNAL_HANDLER", false);
        boolean j2 = AbstractC2281Ro1.j(intent, "org.chromium.chrome.browser.started_chrome_task", false);
        VK2 vk2 = wk2.g;
        if (intent != null) {
            vk2.getClass();
            if ("android.intent.action.VIEW".equals(intent.getAction())) {
                String packageName = V60.a.getPackageName();
                boolean z = (g && j) ? false : TextUtils.equals(packageName, intent.getPackage()) || TextUtils.equals(packageName, AbstractC2281Ro1.w(intent, "com.android.browser.application_id"));
                Intent intent2 = new Intent(intent);
                C12055zG0.s(intent2);
                vk2.b = new TK2(intent2, z, g, j2);
                return;
            }
        }
        vk2.b = null;
    }

    public WK2(Tab tab) {
        this.a = tab;
    }

    @Override // defpackage.J44
    public final void destroy() {
        this.a.w(this);
        this.a = null;
    }

    @Override // defpackage.BA0
    public final void A0(int i, Tab tab) {
        VK2 vk2 = this.g;
        vk2.b = null;
        vk2.c = null;
    }

    @Override // defpackage.BA0
    public final void t0(TabImpl tabImpl, NavigationHandle navigationHandle) {
        if (navigationHandle.r) {
            VK2 vk2 = this.g;
            vk2.b = null;
            vk2.c = null;
        }
    }
}
