package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class IE1 extends BA0 {
    public final /* synthetic */ JE1 a;

    @Override // defpackage.BA0
    public final void T0(Tab tab, boolean z, boolean z2) {
        if (z && z2) {
            JE1 je1 = this.a;
            if (je1.e) {
                return;
            }
            ME1 me1 = je1.c;
            me1.c = 0.0f;
            ND2 nd2 = KE1.a;
            PropertyModel propertyModel = me1.a;
            propertyModel.m(nd2, 0);
            propertyModel.l(KE1.b, me1.c);
            me1.b.sendEmptyMessage(1);
        }
    }

    @Override // defpackage.BA0
    public final void q0(TabImpl tabImpl) {
        this.a.a(false);
    }

    public IE1(JE1 je1) {
        this.a = je1;
    }

    @Override // defpackage.BA0
    public final void F0(TabImpl tabImpl, boolean z) {
        if (z) {
            float s = tabImpl.s();
            JE1 je1 = this.a;
            if (s > 0.05f && tabImpl.s() < 1.0f) {
                je1.c(1.0f);
            }
            je1.a(true);
        }
    }

    @Override // defpackage.BA0
    public final void D0(Tab tab, float f) {
        if (tab.getUrl() == null || T34.k(tab.getUrl()) || AbstractC5107f12.a(tab.getUrl(), tab.isIncognito())) {
            return;
        }
        this.a.c(f);
    }

    @Override // defpackage.BA0
    public final void w0(NavigationHandle navigationHandle) {
        boolean z = navigationHandle.a;
    }

    @Override // defpackage.BA0
    public final void v0(TabImpl tabImpl, NavigationHandle navigationHandle) {
        if (navigationHandle.c) {
            return;
        }
        boolean a = AbstractC5107f12.a(navigationHandle.e, tabImpl.isIncognito());
        JE1 je1 = this.a;
        if (a) {
            je1.a(false);
            return;
        }
        ME1 me1 = je1.c;
        ND2 nd2 = KE1.a;
        me1.a.m(nd2, 2);
        me1.b.removeMessages(1);
        if (!je1.e) {
            je1.a.m(nd2, 0);
        }
        je1.c(tabImpl.s());
    }
}
