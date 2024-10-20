package defpackage;

import android.app.Activity;
import android.content.Intent;
import org.chromium.chrome.browser.ChromeTabbedActivity;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.content_public.browser.WebContents;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xv3 */
/* loaded from: classes.dex */
public final class C11598xv3 extends AbstractC9476rl {
    public final boolean a;

    @Override // defpackage.AbstractC10569uv3
    public final boolean d() {
        return true;
    }

    public C11598xv3(boolean z) {
        this.a = z;
    }

    @Override // defpackage.AbstractC10569uv3
    public final Tab a(IA3 ia3, C6844k43 c6844k43, int i, boolean z, int i2) {
        boolean z2 = this.a;
        if (z != z2) {
            throw new IllegalStateException("Incognito state mismatch. isIncognito: " + z + ". TabDelegate: " + z2);
        }
        C3353Zu3 c3353Zu3 = new C3353Zu3();
        c3353Zu3.b(3);
        c3353Zu3.g = 2;
        c3353Zu3.a = i;
        c3353Zu3.d = z;
        return c3353Zu3.a();
    }

    @Override // defpackage.AbstractC10569uv3
    public final boolean c(Tab tab, WebContents webContents, int i, GURL gurl) {
        g(new C9134ql(new LoadUrlParams(gurl.i(), 6), webContents, null, null), i, tab != null ? tab.getId() : -1);
        return true;
    }

    public final void i(LoadUrlParams loadUrlParams, Activity activity, int i, Activity activity2) {
        Intent h = h(new C9134ql(loadUrlParams, null, null, null), i, false);
        Class h2 = C7851n02.i.h(activity);
        if (h2 == null) {
            return;
        }
        C7851n02.v(h, activity, h2);
        AbstractC2281Ro1.a(h);
        LZ1.s = 0;
        if (C7851n02.r()) {
            if (activity2 != null) {
                ((ChromeTabbedActivity) activity2).onNewIntent(h);
                return;
            } else {
                h.addFlags(268435456);
                h.addFlags(134217728);
            }
        }
        activity.startActivity(h, C7851n02.i(activity));
    }

    @Override // defpackage.AbstractC10569uv3
    public final Tab f(int i, String str) {
        b(2, null, new LoadUrlParams(str, 0));
        return null;
    }

    @Override // defpackage.AbstractC10569uv3
    public final Tab b(int i, Tab tab, LoadUrlParams loadUrlParams) {
        g(new C9134ql(loadUrlParams, null, null, null), i, tab == null ? -1 : tab.getId());
        return null;
    }

    public final void g(C9134ql c9134ql, int i, int i2) {
        C1761No1.y(null, h(c9134ql, i2, i == 2), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.content.Intent h(defpackage.C9134ql r6, int r7, boolean r8) {
        /*
            r5 = this;
            nx3 r0 = defpackage.C8180nx3.a()
            java.util.concurrent.atomic.AtomicInteger r1 = r0.a
            int r2 = r1.getAndIncrement()
            int r3 = r2 + 1
            int r4 = r1.get()
            int r3 = r3 - r4
            if (r3 >= 0) goto L14
            goto L22
        L14:
            r1.addAndGet(r3)
            int r1 = r1.get()
            Q83 r0 = r0.b
            java.lang.String r3 = "org.chromium.chrome.browser.tab.TabIdManager.NEXT_ID"
            r0.q(r1, r3)
        L22:
            ul r0 = defpackage.AbstractC10848vl.a
            r0.a(r2, r6)
            android.content.Intent r0 = new android.content.Intent
            org.chromium.content_public.browser.LoadUrlParams r1 = r6.a
            java.lang.String r3 = r1.a
            android.net.Uri r3 = android.net.Uri.parse(r3)
            java.lang.String r4 = "android.intent.action.VIEW"
            r0.<init>(r4, r3)
            android.content.ComponentName r3 = r6.d
            if (r3 != 0) goto L42
            android.content.Context r3 = defpackage.V60.a
            java.lang.Class<org.chromium.chrome.browser.document.ChromeLauncherActivity> r4 = org.chromium.chrome.browser.document.ChromeLauncherActivity.class
            r0.setClass(r3, r4)
            goto L45
        L42:
            defpackage.AbstractC9942t6.c(r0, r3)
        L45:
            java.util.Map r1 = r1.f
            defpackage.C1761No1.w(r1, r0)
            java.lang.String r1 = "com.android.chrome.tab_id"
            r0.putExtra(r1, r2)
            java.lang.String r1 = "com.google.android.apps.chrome.EXTRA_OPEN_NEW_INCOGNITO_TAB"
            boolean r2 = r5.a
            r0.putExtra(r1, r2)
            java.lang.String r1 = "com.android.chrome.parent_tab_id"
            r0.putExtra(r1, r7)
            if (r2 != 0) goto L5f
            if (r8 == 0) goto L6a
        L5f:
            android.content.Context r1 = defpackage.V60.a
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r2 = "com.android.browser.application_id"
            r0.putExtra(r2, r1)
        L6a:
            if (r8 == 0) goto L72
            java.lang.String r8 = "create_new_tab"
            r1 = 1
            r0.putExtra(r8, r1)
        L72:
            r8 = -1
            if (r7 != r8) goto L76
            goto L8c
        L76:
            DD3 r8 = defpackage.ED3.a()
            org.chromium.chrome.browser.tab.Tab r7 = r8.b(r7)
            if (r7 != 0) goto L81
            goto L8c
        L81:
            android.content.Context r7 = r7.getContext()
            boolean r8 = r7 instanceof android.app.Activity
            if (r8 == 0) goto L8c
            android.app.Activity r7 = (android.app.Activity) r7
            goto L8d
        L8c:
            r7 = 0
        L8d:
            if (r7 == 0) goto L9e
            android.content.Intent r8 = r7.getIntent()
            if (r8 == 0) goto L9e
            java.lang.String r8 = "com.android.chrome.parent_intent"
            android.content.Intent r7 = r7.getIntent()
            r0.putExtra(r8, r7)
        L9e:
            java.lang.Integer r6 = r6.c
            if (r6 == 0) goto Lab
            int r6 = r6.intValue()
            java.lang.String r7 = "org.chromium.chrome.browser.ServiceTabLauncher.LAUNCH_REQUEST_ID"
            r0.putExtra(r7, r6)
        Lab:
            r6 = 268435456(0x10000000, float:2.524355E-29)
            r0.setFlags(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11598xv3.h(ql, int, boolean):android.content.Intent");
    }
}
