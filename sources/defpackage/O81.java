package defpackage;

import J.N;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import org.chromium.chrome.browser.document.ChromeLauncherActivity;
import org.chromium.chrome.browser.history.BrowsingHistoryBridge;
import org.chromium.chrome.browser.history.HistoryActivity;
import org.chromium.chrome.browser.preferences.PrefChangeRegistrar;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.components.favicon.LargeIconBridge;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class O81 implements InterfaceC5298fb3, InterfaceC8184ny2 {
    public final Activity a;
    public final N81 g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final String l;
    public final InterfaceC0079Ap3 m;
    public final C4117c81 n;
    public final RecyclerView o;
    public LargeIconBridge p;
    public final C7526m33 q;
    public boolean r;
    public final PrefChangeRegistrar s;

    @Override // defpackage.InterfaceC5298fb3
    public final /* synthetic */ void i() {
    }

    public final void e() {
        C4117c81 c4117c81 = this.n;
        c4117c81.w = true;
        BrowsingHistoryBridge browsingHistoryBridge = c4117c81.n;
        long j = browsingHistoryBridge.b;
        if (j != 0) {
            N.MZEuRD6z(j, browsingHistoryBridge);
            browsingHistoryBridge.b = 0L;
        }
        c4117c81.n = null;
        VH0 vh0 = c4117c81.m;
        vh0.a = null;
        vh0.b = null;
        vh0.c = null;
        vh0.d = null;
        this.p.a();
        this.p = null;
        C1202Jg1 a = C1202Jg1.a();
        Profile d = Profile.d();
        a.getClass();
        C1202Jg1.c(d).f(this);
        this.s.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public O81(android.app.Activity r1, defpackage.N81 r2, boolean r3, boolean r4, boolean r5, boolean r6, java.lang.String r7, defpackage.C7526m33 r8, defpackage.InterfaceC0079Ap3 r9, defpackage.C8385oa2 r10, defpackage.BV0 r11, org.chromium.chrome.browser.history.BrowsingHistoryBridge r12) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.O81.<init>(android.app.Activity, N81, boolean, boolean, boolean, boolean, java.lang.String, m33, Ap3, oa2, BV0, org.chromium.chrome.browser.history.BrowsingHistoryBridge):void");
    }

    public final boolean d() {
        return this.k && AbstractC8650pL.a("history.deleting_enabled");
    }

    public final void f(GURL gurl, Boolean bool, boolean z) {
        if (!this.h) {
            Tab tab = (Tab) this.m.get();
            if (z) {
                new C11598xv3(bool != null ? bool.booleanValue() : this.i).b(0, tab, new LoadUrlParams(gurl.i(), 2));
                return;
            } else {
                tab.d(new LoadUrlParams(gurl.i(), 2));
                return;
            }
        }
        C1761No1.y(null, a(gurl, bool, z), null);
    }

    @Override // defpackage.InterfaceC5298fb3
    public final void b() {
        this.g.j();
        this.n.X();
    }

    @Override // defpackage.InterfaceC5298fb3
    public final void g() {
        this.g.j();
        this.n.X();
    }

    @Override // defpackage.InterfaceC8184ny2
    public final void c() {
        this.g.j();
        this.n.X();
    }

    public final Intent a(GURL gurl, Boolean bool, boolean z) {
        ComponentName componentName;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(gurl.i()));
        Activity activity = this.a;
        intent.putExtra("com.android.browser.application_id", activity.getApplicationContext().getPackageName());
        intent.addFlags(268435456);
        intent.putExtra("com.google.chrome.transition_type", 2);
        if (activity instanceof HistoryActivity) {
            componentName = (ComponentName) AbstractC2281Ro1.s(activity.getIntent(), "org.chromium.chrome.browser.parent_component");
        } else {
            componentName = activity.getComponentName();
        }
        if (componentName != null) {
            AbstractC9942t6.c(intent, componentName);
        } else {
            intent.setClass(activity, ChromeLauncherActivity.class);
        }
        AbstractC2281Ro1.a(intent);
        if (bool != null) {
            intent.putExtra("com.google.android.apps.chrome.EXTRA_OPEN_NEW_INCOGNITO_TAB", bool);
        }
        if (z) {
            intent.putExtra("create_new_tab", true);
        }
        return intent;
    }
}
