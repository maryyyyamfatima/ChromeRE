package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.content_public.browser.NavigationHandle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Nu3 */
/* loaded from: classes.dex */
public final class C1793Nu3 extends AbstractC1429Kz3 {
    public C1793Nu3(InterfaceC10590uz3 interfaceC10590uz3) {
        super(interfaceC10590uz3);
    }

    @Override // defpackage.BA0
    public final void S0(TabImpl tabImpl) {
        if (tabImpl.isIncognito()) {
            return;
        }
        C2183Qu3.d().edit().putString(C2183Qu3.g(tabImpl.getId()), tabImpl.getUrl().m()).apply();
    }

    @Override // defpackage.BA0
    public final void Q0(Tab tab) {
        if (tab.isIncognito()) {
            return;
        }
        C2183Qu3.d().edit().putString(C2183Qu3.f(tab.getId()), tab.getTitle()).apply();
    }

    @Override // defpackage.AbstractC1429Kz3
    public final void V0(int i, Tab tab) {
        if (tab.isIncognito()) {
            return;
        }
        C2183Qu3.d().edit().putInt(C2183Qu3.c(tab.getId()), i).apply();
    }

    @Override // defpackage.AbstractC1429Kz3
    public final void Y0(Tab tab, long j) {
        if (tab.isIncognito()) {
            return;
        }
        C2183Qu3.d().edit().putLong(C2183Qu3.e(tab.getId()), j).apply();
    }

    @Override // defpackage.BA0
    public final void t0(TabImpl tabImpl, NavigationHandle navigationHandle) {
        if (tabImpl.isIncognito() || !navigationHandle.a || tabImpl.l == null) {
            return;
        }
        C2183Qu3.a(tabImpl);
    }
}
