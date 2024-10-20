package defpackage;

import android.app.Activity;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gV0 */
/* loaded from: classes.dex */
public final class C5608gV0 implements Callback {
    public final Activity a;
    public Tab g;
    public C5952hV0 h;
    public final /* synthetic */ C6638jV0 i;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        Tab tab = (Tab) obj;
        if (this.g == tab) {
            return;
        }
        C5952hV0 c5952hV0 = this.h;
        if (c5952hV0 != null) {
            c5952hV0.V0();
            Tab tab2 = c5952hV0.g;
            if (tab2 != null) {
                tab2.w(c5952hV0);
            }
            this.h = null;
        }
        this.g = tab;
        C6638jV0 c6638jV0 = this.i;
        Activity activity = this.a;
        C6638jV0.a(c6638jV0, activity, 4);
        Tab tab3 = this.g;
        if (tab3 != null && tab3 != null) {
            this.h = new C5952hV0(c6638jV0, activity, tab3);
        }
        c6638jV0.h();
    }

    public C5608gV0(C6638jV0 c6638jV0, Activity activity) {
        this.i = c6638jV0;
        this.a = activity;
        C6166i6 c6166i6 = c6638jV0.e;
        this.g = (Tab) c6166i6.g;
        c6166i6.m(this);
        Tab tab = this.g;
        if (tab == null) {
            return;
        }
        this.h = new C5952hV0(c6638jV0, activity, tab);
    }
}
