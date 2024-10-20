package org.chromium.chrome.browser.customtabs;

import J.N;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.browser.customtabs.CustomTabsSessionToken;
import defpackage.AX;
import defpackage.AbstractC2281Ro1;
import defpackage.AbstractC4851eH1;
import defpackage.AbstractC5103f04;
import defpackage.AbstractC7239lD3;
import defpackage.C0118Ax2;
import defpackage.C0146Bd0;
import defpackage.C10712vM;
import defpackage.C10720vN2;
import defpackage.C1096Il0;
import defpackage.C1193Je2;
import defpackage.C12064zI;
import defpackage.C1761No1;
import defpackage.C2049Pu;
import defpackage.C2750Ve0;
import defpackage.C2880We0;
import defpackage.C3353Zu3;
import defpackage.C3498aL2;
import defpackage.C4632df0;
import defpackage.C7702mb1;
import defpackage.C7928nE;
import defpackage.C8668pO2;
import defpackage.DU;
import defpackage.EI2;
import defpackage.EU;
import defpackage.F71;
import defpackage.G71;
import defpackage.H43;
import defpackage.H71;
import defpackage.InterfaceC3241Yy1;
import defpackage.Oj4;
import defpackage.Pj4;
import defpackage.QF3;
import defpackage.R44;
import defpackage.UN;
import defpackage.V60;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.base.Callback;
import org.chromium.base.SysUtils;
import org.chromium.base.ThreadUtils;
import org.chromium.base.TraceEvent;
import org.chromium.base.library_loader.b;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.AppHooks;
import org.chromium.chrome.browser.customtabs.CustomTabsConnection;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.content.browser.ChildProcessLauncherHelperImpl;
import org.chromium.content.browser.LauncherThread;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.content_public.browser.WebContents;
import org.chromium.net.NetworkChangeNotifier;
import org.chromium.ui.base.WindowAndroid;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class CustomTabsConnection {
    public static final HashSet i = new HashSet(Arrays.asList("/bg_non_interactive", "/apps/bg_non_interactive", "/background"));
    public static final String[] j = {"No request", "Success", "Chrome not initialized", "Not authorized", "Invalid URL", "Invalid referrer", "Invalid referrer for session"};
    public static CustomTabsConnection k;
    public Callback g;
    public volatile C12064zI h;
    public final H71 a = new H71();
    public final AtomicBoolean e = new AtomicBoolean();
    public final AtomicBoolean f = new AtomicBoolean();
    public final EU c = new EU();
    public final boolean d = AX.e().g("custom-tabs-log-service-requests");
    public final H43 b = (H43) C10712vM.e().q.get();

    public Bundle d(String str, Bundle bundle) {
        return null;
    }

    public String h() {
        return null;
    }

    public void u(Bundle bundle, boolean z) {
    }

    public void v(CustomTabsSessionToken customTabsSessionToken, String str, String str2, Uri uri) {
    }

    public void w(CustomTabsSessionToken customTabsSessionToken, WebContents webContents) {
    }

    public void y(Intent intent) {
    }

    public static CustomTabsConnection g() {
        if (k == null) {
            k = AppHooks.get().e();
        }
        return k;
    }

    public final void l(Object obj, String str) {
        if (this.d) {
            AbstractC4851eH1.f("ChromeConnection", "%s = %b, Calling UID = %d", str, obj, Integer.valueOf(Binder.getCallingUid()));
        }
    }

    public final void m(Object obj, String str) {
        if (this.d) {
            AbstractC4851eH1.f("ChromeConnection", "%s args = %s", str, obj);
        }
    }

    public static JSONObject a(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        if (bundle == null) {
            return jSONObject;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            try {
                if (obj instanceof Bundle) {
                    jSONObject.put(str, a((Bundle) obj));
                } else {
                    if (!(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Boolean)) {
                        if (obj == null) {
                            jSONObject.put(str, JSONObject.NULL);
                        } else {
                            jSONObject.put(str, obj.toString());
                        }
                    }
                    jSONObject.put(str, obj);
                }
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    public boolean o(CustomTabsSessionToken customTabsSessionToken) {
        boolean z;
        C2750Ve0 c2750Ve0 = new C2750Ve0(this);
        C2880We0 c2880We0 = new C2880We0(customTabsSessionToken);
        C0118Ax2 c0118Ax2 = new C0118Ax2(c2880We0);
        EU eu = this.c;
        int callingUid = Binder.getCallingUid();
        synchronized (eu) {
            if (customTabsSessionToken.c == null) {
                z = false;
            } else {
                if (eu.c.containsKey(customTabsSessionToken)) {
                    ((DU) eu.c.get(customTabsSessionToken)).b = customTabsSessionToken.c;
                } else {
                    eu.c.put(customTabsSessionToken, new DU(V60.a, callingUid, customTabsSessionToken.c, c2750Ve0, c0118Ax2, c2880We0));
                }
                z = true;
            }
        }
        l(Boolean.valueOf(z), "newSession()");
        return z;
    }

    public final boolean B(boolean z) {
        if (!j()) {
            return false;
        }
        final int callingUid = Binder.getCallingUid();
        EU eu = this.c;
        synchronized (eu) {
            eu.e = true;
            eu.d.put(callingUid, true);
        }
        boolean z2 = !this.e.compareAndSet(false, true);
        C12064zI c12064zI = new C12064zI();
        if (!z2) {
            c12064zI.a(AbstractC5103f04.e, new Runnable() { // from class: Qe0
                @Override // java.lang.Runnable
                public final void run() {
                    HashSet hashSet = CustomTabsConnection.i;
                    CustomTabsConnection customTabsConnection = CustomTabsConnection.this;
                    customTabsConnection.getClass();
                    TraceEvent i2 = TraceEvent.i("CustomTabsConnection.initializeBrowser()", null);
                    try {
                        Context context = V60.a;
                        Object obj = ThreadUtils.a;
                        C7629mN.a().d(true);
                        boolean z3 = ChildProcessLauncherHelperImpl.m;
                        LauncherThread.a(new RunnableC8988qK(context, true));
                        C7629mN a = C7629mN.a();
                        if (!a.g) {
                            a.g = true;
                            TraceEvent.b("NetworkChangeNotifier.init", null);
                            NetworkChangeNotifier.init();
                            NetworkChangeNotifier.setAutoDetectConnectivityState(true);
                            TraceEvent.c("NetworkChangeNotifier.init");
                        }
                        customTabsConnection.f.set(true);
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
            });
        }
        if (z) {
            if (!(this.a.a != null)) {
                c12064zI.a(AbstractC5103f04.e, new Runnable() { // from class: Re0
                    @Override // java.lang.Runnable
                    public final void run() {
                        HashSet hashSet = CustomTabsConnection.i;
                        if (RC.a().e()) {
                            TraceEvent i2 = TraceEvent.i("CreateSpareWebContents", null);
                            try {
                                CustomTabsConnection.b();
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
                    }
                });
            }
        }
        QF3 qf3 = AbstractC5103f04.e;
        c12064zI.a(qf3, new Runnable() { // from class: Se0
            @Override // java.lang.Runnable
            public final void run() {
                HashSet hashSet = CustomTabsConnection.i;
                TraceEvent i2 = TraceEvent.i("InitializeViewHierarchy", null);
                try {
                    Pj4.a().b(V60.a);
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
        });
        if (!z2) {
            c12064zI.a(qf3, new Runnable() { // from class: Te0
                @Override // java.lang.Runnable
                public final void run() {
                    HashSet hashSet = CustomTabsConnection.i;
                    TraceEvent i2 = TraceEvent.i("WarmupInternalFinishInitialization", null);
                    try {
                        Profile d = Profile.d();
                        Object obj = ThreadUtils.a;
                        N.MejOrYY2(d);
                        C8668pO2.b();
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
            });
        }
        c12064zI.a(qf3, new Runnable() { // from class: Ue0
            @Override // java.lang.Runnable
            public final void run() {
                ArrayList arrayList;
                CustomTabsConnection customTabsConnection = CustomTabsConnection.this;
                int i2 = callingUid;
                HashSet hashSet = CustomTabsConnection.i;
                customTabsConnection.getClass();
                Object obj = ThreadUtils.a;
                EU eu2 = customTabsConnection.c;
                synchronized (eu2) {
                    arrayList = new ArrayList();
                    for (Map.Entry entry : eu2.c.entrySet()) {
                        if (((DU) entry.getValue()).a == i2) {
                            arrayList.add((CustomTabsSessionToken) entry.getKey());
                        }
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    customTabsConnection.s((CustomTabsSessionToken) it.next(), "onWarmupCompleted", null);
                }
            }
        });
        c12064zI.b(false);
        this.h = c12064zI;
        return true;
    }

    public static boolean k(Uri uri) {
        if (uri == null) {
            return false;
        }
        String scheme = uri.normalizeScheme().getScheme();
        return scheme == null || scheme.equals("http") || scheme.equals("https");
    }

    public final void i(CustomTabsSessionToken customTabsSessionToken, String str, Bundle bundle, List list) {
        int i2;
        Object obj = ThreadUtils.a;
        if (TextUtils.isEmpty(str)) {
            H71 h71 = this.a;
            G71 g71 = h71.a;
            if (g71 == null) {
                return;
            }
            if (customTabsSessionToken == null || customTabsSessionToken.equals(g71.a)) {
                h71.a.c.destroy();
                h71.a = null;
                return;
            }
            return;
        }
        if (!C1096Il0.c().d) {
            i2 = 5;
        } else if (R44.a(Profile.d()).b("profile.cookie_controls_mode") == 1) {
            i2 = 6;
        } else if (N.MaV3tKHW() == 0) {
            i2 = 7;
        } else {
            if (((ConnectivityManager) V60.a.getSystemService("connectivity")).isActiveNetworkMetered()) {
                EU eu = this.c;
                Boolean bool = Boolean.FALSE;
                synchronized (eu) {
                    DU du = (DU) eu.c.get(customTabsSessionToken);
                    if (du != null) {
                        bool = Boolean.valueOf(du.m);
                    }
                }
                if (!bool.booleanValue()) {
                    C7928nE c7928nE = UN.a;
                    if (!N.M09VlOh_("PredictivePrefetchingAllowedOnAllConnectionTypes")) {
                        i2 = 9;
                    }
                }
            }
            i2 = 0;
        }
        EI2.h(i2, 10, "CustomTabs.SpeculationStatusOnStart");
        if (i2 == 0) {
            EU eu2 = this.c;
            Boolean bool2 = Boolean.FALSE;
            synchronized (eu2) {
                DU du2 = (DU) eu2.c.get(customTabsSessionToken);
                if (du2 != null) {
                    bool2 = Boolean.valueOf(du2.r);
                }
            }
            boolean z = bool2.booleanValue() && !C1761No1.o(bundle);
            Pj4 a = Pj4.a();
            Profile d = Profile.d();
            H71 h712 = this.a;
            G71 g712 = h712.a;
            if (g712 != null) {
                g712.c.destroy();
                h712.a = null;
            }
            if (z) {
                EI2.h(3, 10, "CustomTabs.SpeculationStatusOnStart");
                H71 h713 = this.a;
                h713.getClass();
                Intent intent = new Intent();
                if (bundle != null) {
                    intent.putExtras(bundle);
                }
                if (C1761No1.f(intent) == null) {
                    Context context = V60.a;
                    C3353Zu3 c3353Zu3 = new C3353Zu3();
                    c3353Zu3.e = new WindowAndroid(context);
                    c3353Zu3.b(8);
                    c3353Zu3.j = new C0146Bd0(null, false, false, null, 1, false, null, null, null, null, new InterfaceC3241Yy1() { // from class: vd0
                        @Override // defpackage.InterfaceC3241Yy1
                        public final Object get() {
                            return null;
                        }
                    }, null, null, null, null, new C2049Pu(), new C2049Pu(), new C2049Pu(), null, null, 1);
                    c3353Zu3.k = true;
                    TabImpl a2 = c3353Zu3.a();
                    Rect a3 = AbstractC7239lD3.a(context);
                    a2.l.b(a3.right - a3.left, a3.bottom - a3.top);
                    Tab tab = C10720vN2.a(a2).a;
                    WebContents b = tab.b();
                    if (b != null) {
                        b.i1(null);
                    }
                    tab.G(null, null);
                    w(customTabsSessionToken, a2.l);
                    a2.v(new F71(h713, a2.j));
                    WebContents webContents = a2.l;
                    EU eu3 = this.c;
                    eu3.e(customTabsSessionToken, webContents);
                    LoadUrlParams loadUrlParams = new LoadUrlParams(str, 0);
                    String h = C1761No1.h(intent);
                    if (h == null && eu3.c(customTabsSessionToken) != null) {
                        h = eu3.c(customTabsSessionToken).a;
                    }
                    if (h == null) {
                        h = "";
                    }
                    if (!h.isEmpty()) {
                        loadUrlParams.e = new C3498aL2(h, 1);
                    }
                    h713.a = new G71(customTabsSessionToken, str, a2, h);
                    a2.d(loadUrlParams);
                }
            } else {
                b();
            }
            a.c(str, d);
        }
        r(list);
    }

    public static boolean r(List list) {
        boolean z = false;
        if (list == null) {
            return false;
        }
        Pj4 a = Pj4.a();
        Profile d = Profile.d();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                Uri uri = (Uri) AbstractC2281Ro1.r("android.support.customtabs.otherurls.URL", (Bundle) it.next());
                if (k(uri)) {
                    a.c(uri.toString(), d);
                    z = true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return z;
    }

    public final boolean n(final CustomTabsSessionToken customTabsSessionToken, Uri uri, final Bundle bundle, final ArrayList arrayList) {
        boolean z;
        if (C1761No1.o(bundle)) {
            return false;
        }
        final boolean z2 = (uri == null || TextUtils.isEmpty(uri.toString())) && arrayList != null;
        final String uri2 = k(uri) ? uri.toString() : null;
        if (uri != null && uri2 == null && !z2) {
            return false;
        }
        final int callingUid = Binder.getCallingUid();
        if (!B(false)) {
            return false;
        }
        EU eu = this.c;
        boolean z3 = arrayList != null;
        synchronized (eu) {
            DU du = (DU) eu.c.get(customTabsSessionToken);
            if (du != null && du.a == callingUid) {
                boolean z4 = TextUtils.isEmpty(uri2) && z3 && !du.i;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                du.p = uri2;
                du.q = elapsedRealtime;
                du.j |= !TextUtils.isEmpty(uri2);
                du.i = z3 | du.i;
                if (z4) {
                    z = true;
                } else {
                    C8668pO2 a = C8668pO2.a(callingUid);
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j2 = elapsedRealtime2 - a.a;
                    long j3 = a.b;
                    if (j2 < j3) {
                        z = false;
                    } else {
                        a.a = elapsedRealtime2;
                        long j4 = j3 * 2;
                        if (j2 < j4) {
                            a.b = Math.min(10000L, j4);
                        } else {
                            a.b = 100L;
                        }
                        z = true;
                    }
                }
            }
            z = false;
        }
        if (!z) {
            return false;
        }
        PostTask.c(AbstractC5103f04.a, new Runnable() { // from class: Pe0
            @Override // java.lang.Runnable
            public final void run() {
                CustomTabsConnection customTabsConnection = CustomTabsConnection.this;
                boolean z5 = z2;
                CustomTabsSessionToken customTabsSessionToken2 = customTabsSessionToken;
                int i2 = callingUid;
                String str = uri2;
                Bundle bundle2 = bundle;
                List list = arrayList;
                HashSet hashSet = CustomTabsConnection.i;
                customTabsConnection.c(z5, customTabsSessionToken2, i2, str, bundle2, list, true);
            }
        });
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:            if (r(r18) != false) goto L184;     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:            b();     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(final boolean r13, final androidx.browser.customtabs.CustomTabsSessionToken r14, final int r15, final java.lang.String r16, final android.os.Bundle r17, final java.util.List r18, boolean r19) {
        /*
            r12 = this;
            r0 = r17
            java.lang.Object r1 = org.chromium.base.ThreadUtils.a
            r1 = 0
            java.lang.String r2 = "CustomTabsConnection.mayLaunchUrlOnUiThread"
            org.chromium.base.TraceEvent r9 = org.chromium.base.TraceEvent.i(r2, r1)
            org.chromium.content.browser.BrowserStartupControllerImpl r1 = defpackage.RC.a()     // Catch: java.lang.Throwable -> L52
            boolean r1 = r1.e()     // Catch: java.lang.Throwable -> L52
            if (r1 != 0) goto L32
            if (r19 == 0) goto L2c
            QF3 r10 = defpackage.AbstractC5103f04.a     // Catch: java.lang.Throwable -> L52
            Ke0 r11 = new Ke0     // Catch: java.lang.Throwable -> L52
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r1.<init>()     // Catch: java.lang.Throwable -> L52
            org.chromium.base.task.PostTask.c(r10, r11)     // Catch: java.lang.Throwable -> L52
        L2c:
            if (r9 == 0) goto L31
            r9.close()
        L31:
            return
        L32:
            if (r0 != 0) goto L35
            goto L44
        L35:
            java.lang.String r1 = "org.chromium.chrome.browser.customtabs.AGA_EXPERIMENT_IDS"
            int[] r1 = defpackage.AbstractC2281Ro1.n(r1, r0)     // Catch: java.lang.Throwable -> L52
            if (r1 != 0) goto L3e
            goto L44
        L3e:
            java.lang.String r2 = "GsaExperiments"
            r3 = 0
            J.N.MwmPuE$v(r2, r1, r3)     // Catch: java.lang.Throwable -> L52
        L44:
            if (r13 == 0) goto L55
            boolean r0 = r(r18)     // Catch: java.lang.Throwable -> L52
            if (r0 != 0) goto L4e
        L4c:
            r1 = r12
            goto L5e
        L4e:
            b()     // Catch: java.lang.Throwable -> L52
            goto L4c
        L52:
            r0 = move-exception
            r1 = r12
            goto L65
        L55:
            r1 = r12
            r2 = r14
            r3 = r16
            r4 = r18
            r12.i(r14, r3, r0, r4)     // Catch: java.lang.Throwable -> L64
        L5e:
            if (r9 == 0) goto L63
            r9.close()
        L63:
            return
        L64:
            r0 = move-exception
        L65:
            if (r9 == 0) goto L6a
            r9.close()     // Catch: java.lang.Throwable -> L6a
        L6a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.customtabs.CustomTabsConnection.c(boolean, androidx.browser.customtabs.CustomTabsSessionToken, int, java.lang.String, android.os.Bundle, java.util.List, boolean):void");
    }

    public final boolean A() {
        TraceEvent i2 = TraceEvent.i("CustomTabsConnection.warmup", null);
        try {
            boolean B = B(true);
            l(Boolean.valueOf(B), "warmup()");
            if (i2 != null) {
                i2.close();
            }
            return B;
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

    public Uri z(int i2, CustomTabsSessionToken customTabsSessionToken, C1193Je2 c1193Je2) {
        if (i2 == Process.myUid()) {
            return Uri.EMPTY;
        }
        return null;
    }

    public final boolean x(CustomTabsSessionToken customTabsSessionToken) {
        EU eu = this.c;
        Boolean bool = Boolean.FALSE;
        synchronized (eu) {
            DU du = (DU) eu.c.get(customTabsSessionToken);
            if (du != null) {
                bool = Boolean.valueOf(du.n);
            }
        }
        return bool.booleanValue();
    }

    public final String e(CustomTabsSessionToken customTabsSessionToken) {
        return this.c.b(customTabsSessionToken);
    }

    public final void p(CustomTabsSessionToken customTabsSessionToken, int i2) {
        C4632df0 a = this.c.a(customTabsSessionToken);
        if (a == null) {
            return;
        }
        try {
            try {
                ((C7702mb1) a.a.a).h(i2, f(customTabsSessionToken));
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
            m(Integer.valueOf(i2), "onNavigationEvent()");
        } catch (Exception unused2) {
        }
    }

    public Bundle f(CustomTabsSessionToken customTabsSessionToken) {
        Bundle bundle = new Bundle();
        bundle.putLong("timestampUptimeMillis", SystemClock.uptimeMillis());
        return bundle;
    }

    public final boolean q(CustomTabsSessionToken customTabsSessionToken, Bundle bundle) {
        EU eu = this.c;
        Boolean bool = Boolean.FALSE;
        synchronized (eu) {
            DU du = (DU) eu.c.get(customTabsSessionToken);
            if (du != null) {
                bool = Boolean.valueOf(du.u);
            }
        }
        if (!bool.booleanValue() || !s(customTabsSessionToken, "NavigationMetrics", bundle)) {
            return false;
        }
        if (!this.d) {
            return true;
        }
        m(a(bundle).toString(), "extraCallback(NavigationMetrics)");
        return true;
    }

    public final boolean s(CustomTabsSessionToken customTabsSessionToken, String str, Bundle bundle) {
        C4632df0 a = this.c.a(customTabsSessionToken);
        if (a == null) {
            return false;
        }
        try {
            TraceEvent i2 = TraceEvent.i("CustomTabsConnection::safeExtraCallback", str);
            try {
                a.a(str, bundle);
                if (i2 == null) {
                    return true;
                }
                i2.close();
                return true;
            } catch (Throwable th) {
                if (i2 != null) {
                    try {
                        i2.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th;
            }
        } catch (Exception unused2) {
            return false;
        }
    }

    public final Bundle t(CustomTabsSessionToken customTabsSessionToken, String str, Bundle bundle) {
        Bundle bundle2;
        C4632df0 a = this.c.a(customTabsSessionToken);
        if (a == null) {
            return null;
        }
        try {
            TraceEvent i2 = TraceEvent.i("CustomTabsConnection::safeExtraCallbackWithResult", str);
            try {
                try {
                    bundle2 = ((C7702mb1) a.a.a).e(str, bundle);
                } catch (RemoteException unused) {
                    Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
                    bundle2 = null;
                }
                if (i2 != null) {
                    i2.close();
                }
                return bundle2;
            } catch (Throwable th) {
                if (i2 != null) {
                    try {
                        i2.close();
                    } catch (Throwable unused2) {
                    }
                }
                throw th;
            }
        } catch (Exception unused3) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:            r0 = r1[2];     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:            r5.close();     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0076, code lost:            r3.close();     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean j() {
        /*
            int r0 = android.os.Binder.getCallingUid()
            int r1 = android.os.Process.myUid()
            r2 = 1
            if (r0 != r1) goto Lc
            return r2
        Lc:
            int r0 = android.os.Build.VERSION.SDK_INT
            int r1 = android.os.Binder.getCallingPid()
            java.lang.String r3 = "/proc/"
            java.lang.String r4 = defpackage.AbstractC9076qb1.a(r3, r1)
            java.io.File r5 = new java.io.File
            r5.<init>(r4)
            boolean r4 = r5.exists()
            if (r4 == 0) goto L31
            boolean r4 = r5.isDirectory()
            if (r4 == 0) goto L31
            boolean r4 = r5.canExecute()
            if (r4 == 0) goto L31
            r4 = r2
            goto L32
        L31:
            r4 = 0
        L32:
            if (r4 != 0) goto L35
            return r2
        L35:
            java.util.HashSet r4 = org.chromium.chrome.browser.customtabs.CustomTabsConnection.i
            java.lang.String r5 = "/cgroup"
            java.lang.String r1 = defpackage.AbstractC9307rF1.a(r3, r1, r5)
            r3 = 26
            if (r0 < r3) goto L44
            java.lang.String r0 = "cpuset"
            goto L46
        L44:
            java.lang.String r0 = "cpu"
        L46:
            ln3 r3 = defpackage.C7432ln3.c()     // Catch: java.io.IOException -> L8b
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L86
            java.io.FileReader r6 = new java.io.FileReader     // Catch: java.lang.Throwable -> L86
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L86
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L86
        L54:
            java.lang.String r1 = r5.readLine()     // Catch: java.lang.Throwable -> L81
            if (r1 == 0) goto L7a
            java.lang.String r1 = r1.trim()     // Catch: java.lang.Throwable -> L81
            java.lang.String r6 = ":"
            java.lang.String[] r1 = r1.split(r6)     // Catch: java.lang.Throwable -> L81
            int r6 = r1.length     // Catch: java.lang.Throwable -> L81
            r7 = 3
            if (r6 != r7) goto L54
            r6 = r1[r2]     // Catch: java.lang.Throwable -> L81
            boolean r6 = r6.equals(r0)     // Catch: java.lang.Throwable -> L81
            if (r6 == 0) goto L54
            r0 = 2
            r0 = r1[r0]     // Catch: java.lang.Throwable -> L81
            r5.close()     // Catch: java.lang.Throwable -> L86
            r3.close()     // Catch: java.io.IOException -> L8b
            goto L8c
        L7a:
            r5.close()     // Catch: java.lang.Throwable -> L86
            r3.close()     // Catch: java.io.IOException -> L8b
            goto L8b
        L81:
            r0 = move-exception
            r5.close()     // Catch: java.lang.Throwable -> L85
        L85:
            throw r0     // Catch: java.lang.Throwable -> L86
        L86:
            r0 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L8a
        L8a:
            throw r0     // Catch: java.io.IOException -> L8b
        L8b:
            r0 = 0
        L8c:
            boolean r0 = r4.contains(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.customtabs.CustomTabsConnection.j():boolean");
    }

    public static void notifyClientOfDetachedRequestCompletion(CustomTabsSessionToken customTabsSessionToken, String str, int i2) {
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("CCTReportParallelRequestStatus")) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("url", Uri.parse(str));
            bundle.putInt("net_error", i2);
            CustomTabsConnection g = g();
            g.s(customTabsSessionToken, "onDetachedRequestCompleted", bundle);
            if (g.d) {
                g.m(a(bundle).toString(), "onDetachedRequestCompleted");
            }
        }
    }

    public static void b() {
        if (SysUtils.isLowEndDevice()) {
            return;
        }
        Pj4 a = Pj4.a();
        a.getClass();
        Object obj = ThreadUtils.a;
        if (b.n.f() && a.e == null) {
            a.h = true;
            WebContents webContents = (WebContents) N.MDMZjIJS(Profile.d(), true, true);
            a.e = webContents;
            Oj4 oj4 = new Oj4(a);
            a.g = oj4;
            webContents.h0(oj4);
            a.f = SystemClock.elapsedRealtime();
            if (a.h) {
                EI2.h(0, 5, "CustomTabs.SpareWebContents.Status2");
            }
        }
    }
}
