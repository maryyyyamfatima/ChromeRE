package defpackage;

import org.chromium.base.Callback;
import org.chromium.chrome.browser.app.ChromeActivity;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Vp */
/* loaded from: classes.dex */
public final class C2804Vp implements Callback {
    public final /* synthetic */ ChromeActivity a;
    public final /* synthetic */ Callback g;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    public C2804Vp(ChromeActivity chromeActivity, C2544Tp c2544Tp) {
        this.a = chromeActivity;
        this.g = c2544Tp;
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        Tab tab = (Tab) obj;
        if (tab == null) {
            return;
        }
        this.a.A0.n(this);
        this.g.onResult(tab);
    }
}
