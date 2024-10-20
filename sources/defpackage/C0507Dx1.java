package defpackage;

import J.N;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsSessionToken;
import java.util.ArrayList;
import java.util.HashSet;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.customtabs.CustomTabActivity;
import org.chromium.chrome.browser.customtabs.CustomTabsConnection;
import org.chromium.chrome.browser.customtabs.TranslucentCustomTabActivity;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.searchwidget.SearchActivity;
import org.chromium.content_public.browser.LoadUrlParams;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Dx1 */
/* loaded from: classes.dex */
public final class C0507Dx1 implements InterfaceC1631Mo1 {
    public final Activity a;
    public final Intent b;

    @Override // defpackage.InterfaceC1631Mo1
    public final long a() {
        return 0L;
    }

    @Override // defpackage.InterfaceC1631Mo1
    public final void b(String str, String str2) {
    }

    @Override // defpackage.InterfaceC1631Mo1
    public final void d(LoadUrlParams loadUrlParams, int i, String str, int i2, Intent intent) {
    }

    public C0507Dx1(Activity activity, Intent intent) {
        this.a = activity;
        Intent y = AbstractC2281Ro1.y(intent);
        this.b = y;
        if (y != null && y.getLongExtra("org.chromium.chrome.browser.timestamp", -1L) == -1) {
            y.putExtra("org.chromium.chrome.browser.timestamp", SystemClock.elapsedRealtime());
        }
        int c = C1761No1.c(y);
        if (y.getPackage() == null && c != 5) {
            EI2.m(268959744 & y.getFlags(), "Launch.IntentFlags");
        }
        int intExtra = y.getIntExtra("org.chromium.chrome.browser.metrics.MediaNotificationUma.EXTRA_CLICK_SOURCE", -1);
        if (intExtra == -1 || intExtra >= 3) {
            return;
        }
        EI2.h(intExtra, 3, "Media.Notification.Click");
    }

    @Override // defpackage.InterfaceC1631Mo1
    public final void c(String str) {
        Intent intent = new Intent("android.intent.action.WEB_SEARCH");
        intent.putExtra("query", str);
        C7432ln3 c = C7432ln3.c();
        try {
            int size = AbstractC3017Xf2.b(intent, 64).size();
            Activity activity = this.a;
            if (size == 0) {
                Intent intent2 = new Intent("android.intent.action.MAIN");
                intent2.setClass(V60.a, SearchActivity.class);
                intent2.putExtra("query", str);
                activity.startActivity(intent2);
            } else {
                activity.startActivity(intent);
            }
            c.close();
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final void i() {
        String n;
        Intent intent = this.b;
        if (intent == null || !"android.intent.action.VIEW".equals(intent.getAction()) || (n = C1761No1.n(intent)) == null) {
            return;
        }
        Pj4 a = Pj4.a();
        a.getClass();
        Object obj = ThreadUtils.a;
        a.a.add(n);
        new Nj4(a, n).c(AbstractC0185Bl.e);
    }

    public static Intent e(Context context, Intent intent) {
        G43 g43;
        Uri parse = Uri.parse(C1761No1.n(intent));
        Intent intent2 = new Intent(intent);
        intent2.setAction("android.intent.action.VIEW");
        intent2.setData(parse);
        intent2.setClassName(context, CustomTabActivity.class.getName());
        if (AbstractC2281Ro1.p(0, intent2, "androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_IN_PIXEL") > 0) {
            intent2.setClassName(context, TranslucentCustomTabActivity.class.getName());
            intent2.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", false);
        }
        if (AbstractC2281Ro1.j(intent, "android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY", false)) {
            H43 h43 = (H43) C10712vM.e().q.get();
            h43.getClass();
            Class cls = ((context instanceof Activity) && (g43 = (G43) h43.b.get(((Activity) context).getTaskId())) != null && g43.a.equals(CustomTabsSessionToken.b(intent))) ? g43.b : null;
            if (cls != null) {
                intent2.setClassName(context, cls.getName());
                intent2.addFlags(603979776);
            }
        }
        if (parse != null && "content".equals(parse.getScheme())) {
            try {
                context.grantUriPermission(context.getPackageName(), parse, 1);
            } catch (SecurityException e) {
                AbstractC4851eH1.f("ActivitiyDispatcher", "Unable to grant Uri permission. ", e);
            }
        }
        if (AX.e().g("open-custom-tabs-in-new-task")) {
            intent2.setFlags(intent2.getFlags() | 268435456);
        }
        if ((intent2.getFlags() & 268435456) != 0 || (intent2.getFlags() & 524288) != 0) {
            intent2.setFlags(intent2.getFlags() & (-8388609));
            intent2.addFlags(134217728);
            intent2.addFlags(524288);
        }
        return intent2;
    }

    public final void h() {
        Uri uri;
        C1193Je2 b;
        final CustomTabsConnection g = CustomTabsConnection.g();
        final CustomTabsSessionToken b2 = CustomTabsSessionToken.b(this.b);
        final Intent intent = this.b;
        g.getClass();
        String n = C1761No1.n(intent);
        boolean z = true;
        if (!TextUtils.isEmpty(n)) {
            if (g.d) {
                AbstractC4851eH1.f("ChromeConnection", "onHandledIntent, URL: %s, extras: %s", n, CustomTabsConnection.a(intent.getExtras()));
            }
            if (g.h != null) {
                C12064zI c12064zI = g.h;
                synchronized (c12064zI.a) {
                    c12064zI.b = true;
                }
            }
            if (C7629mN.a().f) {
                C7928nE c7928nE = UN.a;
                if (N.M09VlOh_("CCTRedirectPreconnect") && (uri = (Uri) intent.getParcelableExtra("androidx.browser.REDIRECT_ENDPOINT")) != null && CustomTabsConnection.k(uri) && (b = C1193Je2.b(n)) != null && g.c.d(b2, b)) {
                    Pj4.a().c(uri.toString(), Profile.d());
                }
            }
            C7629mN.a().f(new Runnable() { // from class: Je0
                @Override // java.lang.Runnable
                public final void run() {
                    int i;
                    CustomTabsConnection customTabsConnection = CustomTabsConnection.this;
                    CustomTabsSessionToken customTabsSessionToken = b2;
                    Intent intent2 = intent;
                    HashSet hashSet = CustomTabsConnection.i;
                    customTabsConnection.getClass();
                    Object obj = ThreadUtils.a;
                    if (!intent2.hasExtra("android.support.customtabs.PARALLEL_REQUEST_URL")) {
                        i = 0;
                    } else if (C7629mN.a().f) {
                        EU eu = customTabsConnection.c;
                        Boolean bool = Boolean.FALSE;
                        synchronized (eu) {
                            DU du = (DU) eu.c.get(customTabsSessionToken);
                            if (du != null) {
                                bool = Boolean.valueOf(du.s);
                            }
                        }
                        if (bool.booleanValue()) {
                            Uri uri2 = (Uri) intent2.getParcelableExtra("android.support.customtabs.PARALLEL_REQUEST_REFERRER");
                            Uri uri3 = (Uri) intent2.getParcelableExtra("android.support.customtabs.PARALLEL_REQUEST_URL");
                            i = 1;
                            int intExtra = intent2.getIntExtra("android.support.customtabs.PARALLEL_REQUEST_REFERRER_POLICY", 1);
                            if (uri3 != null) {
                                if (uri2 == null) {
                                    i = 5;
                                } else {
                                    int i2 = (intExtra < 0 || intExtra > 8) ? 1 : intExtra;
                                    if (!uri3.toString().equals("") && CustomTabsConnection.k(uri3)) {
                                        C1193Je2 a = C1193Je2.a(uri2);
                                        if (a == null ? false : customTabsConnection.c.d(customTabsSessionToken, a)) {
                                            String uri4 = uri3.toString();
                                            String uri5 = uri2.toString();
                                            N.MQhlTRA4(Profile.d(), customTabsSessionToken, customTabsConnection.c.b(customTabsSessionToken), uri4, uri5, i2, 0);
                                            if (customTabsConnection.d) {
                                                AbstractC4851eH1.f("ChromeConnection", "startParallelRequest(%s, %s, %d)", uri4, uri5, Integer.valueOf(i2));
                                            }
                                        } else {
                                            i = 6;
                                        }
                                    }
                                }
                            }
                            i = 4;
                        } else {
                            i = 3;
                        }
                    } else {
                        i = 2;
                    }
                    EI2.h(i, 7, "CustomTabs.ParallelRequestStatusOnStart");
                    if (customTabsConnection.d) {
                        AbstractC4851eH1.f("ChromeConnection", "handleParallelRequest() = " + CustomTabsConnection.j[i], new Object[0]);
                    }
                    if (i == 0 || i == 2 || i == 3) {
                        return;
                    }
                    C7928nE c7928nE2 = UN.a;
                    if (N.M09VlOh_("CCTReportParallelRequestStatus")) {
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("url", (Uri) intent2.getParcelableExtra("android.support.customtabs.PARALLEL_REQUEST_URL"));
                        bundle.putInt("status", i);
                        customTabsConnection.s(customTabsSessionToken, "onDetachedRequestRequested", bundle);
                        if (customTabsConnection.d) {
                            customTabsConnection.m(CustomTabsConnection.a(bundle).toString(), "onDetachedRequestRequested");
                        }
                    }
                }
            });
            Object obj = ThreadUtils.a;
            EU eu = g.c;
            Boolean bool = Boolean.FALSE;
            synchronized (eu) {
                DU du = (DU) eu.c.get(b2);
                if (du != null) {
                    bool = Boolean.valueOf(du.t);
                }
            }
            if (bool.booleanValue()) {
                ArrayList<Uri> parcelableArrayListExtra = intent.getParcelableArrayListExtra("androidx.browser.RESOURCE_PREFETCH_URL_LIST");
                Uri uri2 = (Uri) intent.getParcelableExtra("android.support.customtabs.PARALLEL_REQUEST_REFERRER");
                int intExtra = intent.getIntExtra("android.support.customtabs.PARALLEL_REQUEST_REFERRER_POLICY", 1);
                if (parcelableArrayListExtra != null && uri2 != null) {
                    if (intExtra < 0 || intExtra > 8) {
                        intExtra = 1;
                    }
                    C1193Je2 a = C1193Je2.a(uri2);
                    if (a != null && g.c.d(b2, a)) {
                        String uri3 = uri2.toString();
                        for (Uri uri4 : parcelableArrayListExtra) {
                            String uri5 = uri4.toString();
                            if (!uri5.isEmpty() && CustomTabsConnection.k(uri4)) {
                                N.MQhlTRA4(Profile.d(), null, null, uri5, uri3, intExtra, 1);
                                if (g.d) {
                                    AbstractC4851eH1.f("ChromeConnection", "startResourcePrefetch(%s, %s, %d)", uri5, uri3, Integer.valueOf(intExtra));
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!AbstractC2281Ro1.j(this.b, "android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY", false)) {
            H43 h43 = (H43) C10712vM.e().q.get();
            Intent intent2 = this.b;
            h43.getClass();
            C3265Zd0 a2 = h43.a(CustomTabsSessionToken.b(intent2));
            if (a2 != null && a2.j.a(new C1186Jd0(1, a2.m, intent2))) {
                return;
            }
        }
        i();
        Intent e = e(this.a, this.b);
        Uri referrer = this.a.getReferrer();
        if (referrer != null) {
            e.putExtra("org.chromium.chrome.browser.activity_referrer", referrer.toString());
        }
        C7432ln3 e2 = C7432ln3.e();
        try {
            Activity activity = this.a;
            if (AbstractC2281Ro1.j(e, "android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY", false) && (AbstractC2281Ro1.s(e, "androidx.browser.trusted.EXTRA_SPLASH_SCREEN_PARAMS") != null)) {
                if (AbstractC2281Ro1.i(AbstractC2281Ro1.k(e, "androidx.browser.trusted.EXTRA_SPLASH_SCREEN_PARAMS"), "androidx.browser.trusted.KEY_SPLASH_SCREEN_SHOWN_IN_CLIENT", true)) {
                    e.setClassName(activity, TranslucentCustomTabActivity.class.getName());
                }
                e.addFlags(65536);
                activity.startActivity(e);
                activity.overridePendingTransition(0, 0);
            } else {
                z = false;
            }
            if (z) {
                return;
            }
            this.a.startActivity(e, null);
            e2.close();
        } finally {
            try {
                e2.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b4, code lost:            if (defpackage.AbstractC7403li4.a.contains(r8.substring(3, 7)) == false) goto L671;     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f5, code lost:            if (r8.getPhysicalWidth() != r10) goto L694;     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0102, code lost:            if (r8.getPhysicalHeight() != r10) goto L694;     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0173, code lost:            r7 = !defpackage.AbstractC2599Ua.c(r5, org.chromium.chrome.browser.ChromeTabbedActivity.N1).isEmpty();     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0252 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x001d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f() {
        /*
            Method dump skipped, instructions count: 662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0507Dx1.f():int");
    }

    public static boolean g(Intent intent) {
        if (intent == null) {
            return false;
        }
        return ((intent.getBooleanExtra("android.support.customtabs.extra.user_opt_out", false) && (intent.getFlags() & 268435456) != 0) || !intent.hasExtra("android.support.customtabs.extra.SESSION") || C1761No1.n(intent) == null) ? false : true;
    }
}
