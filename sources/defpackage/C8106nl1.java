package defpackage;

import android.app.Activity;
import org.chromium.chrome.browser.infobar.InfoBarContainer;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nl1 */
/* loaded from: classes.dex */
public final class C8106nl1 extends BA0 {
    public final /* synthetic */ InfoBarContainer a;

    @Override // defpackage.BA0
    public final void v0(TabImpl tabImpl, NavigationHandle navigationHandle) {
        C0967Hl1 c0967Hl1 = this.a.q;
        if (c0967Hl1 != null) {
            c0967Hl1.setTranslationY(0.0f);
        }
    }

    public C8106nl1(InfoBarContainer infoBarContainer) {
        this.a = infoBarContainer;
    }

    @Override // defpackage.BA0
    public final void l0(Tab tab) {
        InfoBarContainer.a(this.a);
    }

    @Override // defpackage.BA0
    public final void g0(Tab tab, WindowAndroid windowAndroid) {
        InfoBarContainer infoBarContainer = this.a;
        if (windowAndroid != null) {
            int i = InfoBarContainer.u;
            infoBarContainer.d((Activity) tab.m().k().get());
            InfoBarContainer.a(infoBarContainer);
        } else {
            int i2 = InfoBarContainer.u;
            infoBarContainer.b();
        }
    }

    @Override // defpackage.BA0
    public final void w0(NavigationHandle navigationHandle) {
        boolean z = navigationHandle.a;
    }

    @Override // defpackage.BA0
    public final void t0(TabImpl tabImpl, NavigationHandle navigationHandle) {
        if (navigationHandle.g && navigationHandle.a) {
            this.a.e(false);
        }
    }
}
