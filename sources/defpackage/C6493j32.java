package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.components.offline_items_collection.OfflineContentAggregatorBridge;
import org.chromium.components.offline_items_collection.OfflineItem;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: j32 */
/* loaded from: classes.dex */
public final class C6493j32 extends BA0 implements J44, H14, InterfaceC9985tD3 {
    public final Tab a;
    public final Activity g;
    public final C0606Er0 h;

    @Override // defpackage.InterfaceC9985tD3
    public final int N() {
        return 3;
    }

    @Override // defpackage.InterfaceC9985tD3
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.H14
    public final /* synthetic */ void t() {
    }

    @Override // defpackage.H14
    public final /* synthetic */ void x() {
    }

    public static void V0(WindowAndroid windowAndroid) {
        C6493j32 c6493j32;
        if (windowAndroid != null) {
            c6493j32 = (C6493j32) AbstractC6837k32.a.e(windowAndroid.t);
        } else {
            K14 k14 = AbstractC6837k32.a;
            c6493j32 = null;
        }
        if (c6493j32 != null) {
            c6493j32.destroy();
            c6493j32.g.finish();
        }
    }

    @Override // defpackage.InterfaceC9985tD3
    public final View a() {
        return this.h.a.a;
    }

    @Override // defpackage.BA0
    public final void g0(Tab tab, WindowAndroid windowAndroid) {
        Tab tab2 = this.a;
        if (windowAndroid == null) {
            tab2.q().c(this);
        } else {
            tab2.q().a(this);
        }
    }

    @Override // defpackage.InterfaceC9985tD3
    public final void v() {
        this.a.q().c(this);
    }

    @Override // defpackage.BA0
    public final void K0(Tab tab, GURL gurl) {
        if (TextUtils.equals(gurl.d(), "recent-tabs")) {
            destroy();
        }
    }

    @Override // defpackage.J44
    public final void destroy() {
        Tab tab = this.a;
        tab.w(this);
        tab.q().c(this);
        C0606Er0 c0606Er0 = this.h;
        C2165Qr0 c2165Qr0 = c0606Er0.b;
        C2035Pr0 c2035Pr0 = c2165Qr0.f;
        OfflineContentAggregatorBridge offlineContentAggregatorBridge = c2165Qr0.d;
        offlineContentAggregatorBridge.b.d(c2035Pr0);
        boolean z = c2165Qr0.j;
        PropertyModel propertyModel = c2165Qr0.b;
        if (z || propertyModel.h(InterfaceC2295Rr0.b) == 3) {
            offlineContentAggregatorBridge.b(((OfflineItem) propertyModel.i(InterfaceC2295Rr0.a)).a);
        }
        if (!c2165Qr0.g.n("Chrome.DownloadInterstitial.PendingRemoval")) {
            AbstractC4851eH1.a("DownloadInterstitial", "Failed to clear DownloadInfo Chrome.DownloadInterstitial.PendingRemoval", new Object[0]);
        }
        c0606Er0.c.b();
        AbstractC6837k32.a.b(this);
    }

    public C6493j32(TabImpl tabImpl, C0606Er0 c0606Er0, Activity activity) {
        this.a = tabImpl;
        this.g = activity;
        this.h = c0606Er0;
        WindowAndroid windowAndroid = tabImpl.j;
        K14 k14 = AbstractC6837k32.a;
        AbstractC6837k32.a.a(this, windowAndroid.t);
    }
}
