package defpackage;

import com.android.chrome.R;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.toolbar.top.ToggleTabStackButton;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dO3 */
/* loaded from: classes2.dex */
public final class C4545dO3 extends BA0 {
    public final /* synthetic */ C5232fO3 a;

    public C4545dO3(C5232fO3 c5232fO3) {
        this.a = c5232fO3;
    }

    @Override // defpackage.BA0
    public final void J0(Tab tab, GURL gurl) {
        C6269iP3 c6269iP3;
        final C5232fO3 c5232fO3 = this.a;
        ToggleTabStackButton toggleTabStackButton = c5232fO3.c;
        if (toggleTabStackButton == null || !toggleTabStackButton.isShown() || c5232fO3.e.a()) {
            return;
        }
        InterfaceC0408Dd2 interfaceC0408Dd2 = c5232fO3.g;
        if (interfaceC0408Dd2.get() == null || ((Boolean) interfaceC0408Dd2.get()).booleanValue() || (c6269iP3 = (C6269iP3) c5232fO3.f.get()) == null || AbstractC10007tI0.a("IPH_TabSwitcherButton", "isMainIntentFromLauncher", c6269iP3.a) || AbstractC10007tI0.a("IPH_TabSwitcherButton", "intentWithEffect", c6269iP3.b)) {
            return;
        }
        Yc4 yc4 = new Yc4(1);
        yc4.b = true;
        C12180ze1 c12180ze1 = new C12180ze1(c5232fO3.b.getResources(), "IPH_TabSwitcherButton", R.string.0_resource_name_obfuscated_res_0x7f14056e, R.string.0_resource_name_obfuscated_res_0x7f14056d);
        c12180ze1.h = toggleTabStackButton;
        c12180ze1.i = new Runnable() { // from class: bO3
            @Override // java.lang.Runnable
            public final void run() {
                C5232fO3.this.l = true;
            }
        };
        c12180ze1.k = new Runnable() { // from class: cO3
            @Override // java.lang.Runnable
            public final void run() {
                C5232fO3.this.l = false;
            }
        };
        c12180ze1.o = yc4;
        c5232fO3.d.a(c12180ze1.a());
    }
}
