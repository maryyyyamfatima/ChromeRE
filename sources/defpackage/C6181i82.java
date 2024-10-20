package defpackage;

import android.app.Activity;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.TraceEvent;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.NavigationController;
import org.chromium.content_public.browser.NavigationEntry;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: i82 */
/* loaded from: classes.dex */
public final class C6181i82 extends BK0 {
    public final Tab i;
    public final C5837h82 j;

    public C6181i82(Activity activity, Tab tab, C12075zK0 c12075zK0) {
        super(activity, c12075zK0);
        this.i = tab;
        this.g = 0;
        f();
        ApplicationStatus.e(this, activity);
        C5837h82 c5837h82 = new C5837h82(this);
        this.j = c5837h82;
        tab.v(c5837h82);
    }

    @Override // defpackage.BK0
    public final boolean a() {
        int c = ApplicationStatus.c(this.h);
        int i = this.g;
        return ((i == 0 || i == 4) && (c == 2 || c == 3)) && AbstractC8650pL.a("ntp_snippets.list_visible") && !this.i.isHidden();
    }

    @Override // defpackage.BK0
    public final void b() {
        if (this.g == 5) {
            return;
        }
        super.b();
        this.i.w(this.j);
    }

    @Override // defpackage.BK0
    public final void e() {
        NavigationController i;
        int k;
        NavigationEntry e;
        Tab tab = this.i;
        if (tab.b() == null || (e = i.e((k = (i = tab.b().i()).k()))) == null || !T34.k(e.b)) {
            return;
        }
        TraceEvent i2 = TraceEvent.i("setEntryExtraData", null);
        try {
            i.o(k, "FeedSavedInstanceState", ((C12075zK0) this.a).c());
            if (i2 != null) {
                i2.close();
            }
        } catch (Throwable th) {
            if (i2 != null) {
                try {
                    i2.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    @Override // defpackage.BK0
    public final String d() {
        Tab tab = this.i;
        if (tab.b() == null) {
            return null;
        }
        NavigationController i = tab.b().i();
        return i.v(i.k(), "FeedSavedInstanceState");
    }
}
