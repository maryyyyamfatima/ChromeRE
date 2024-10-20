package defpackage;

import J.N;
import android.app.Activity;
import android.app.ActivityManager;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.android.chrome.R;
import defpackage.C9751sZ2;
import defpackage.GG2;
import defpackage.HG2;
import defpackage.IG2;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.Callback;
import org.chromium.base.LocaleUtils;
import org.chromium.base.SysUtils;
import org.chromium.base.ThreadUtils;
import org.chromium.base.TraceEvent;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.AppHooks;
import org.chromium.chrome.browser.ApplicationLifetime;
import org.chromium.chrome.browser.enterprise.util.EnterpriseInfo;
import org.chromium.chrome.browser.feature_guide.notifications.FeatureNotificationGuideBridge;
import org.chromium.chrome.browser.history.HistoryDeletionBridge;
import org.chromium.chrome.browser.incognito.IncognitoTabLauncher;
import org.chromium.chrome.browser.media.MediaLauncherActivity;
import org.chromium.chrome.browser.metrics.UmaUtils;
import org.chromium.chrome.browser.partnercustomizations.PartnerBrowserCustomizations;
import org.chromium.chrome.browser.photo_picker.DecoderService;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.quickactionsearchwidget.QuickActionSearchWidgetProvider$QuickActionSearchWidgetProviderDino;
import org.chromium.chrome.browser.quickactionsearchwidget.QuickActionSearchWidgetProvider$QuickActionSearchWidgetProviderSearch;
import org.chromium.chrome.browser.searchwidget.SearchWidgetProvider;
import org.chromium.chrome.browser.video_tutorials.Tutorial;
import org.chromium.chrome.browser.video_tutorials.bridges.VideoTutorialServiceBridge;
import org.chromium.components.policy.PolicyService;
import org.chromium.components.search_engines.TemplateUrlService;
import org.chromium.components.signin.AccountManagerFacadeProvider;
import org.chromium.components.webapps.AppBannerManager;
import org.chromium.ui.base.Clipboard;
import org.chromium.ui.base.ResourceBundle;
import org.chromium.ui.base.SelectFileDialog;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class RB2 {
    public static final Object d = new Object();
    public static RB2 e;
    public boolean a;
    public boolean b;
    public boolean c;

    public void d() {
        if (!C4142cD.b) {
            C4142cD.b = true;
            QF3 qf3 = C5791h04.b;
            PostTask.e.set(1, new C4142cD());
        }
        C4142cD.c = !UN.x.a();
        Y2 y2 = new Y2(AppHooks.get().a());
        AtomicReference atomicReference = AccountManagerFacadeProvider.a;
        Object obj = ThreadUtils.a;
        if (AccountManagerFacadeProvider.b != null) {
            throw new IllegalStateException("AccountManagerFacade is already initialized!");
        }
        AccountManagerFacadeProvider.b = y2;
        AccountManagerFacadeProvider.a.set(y2);
        if (Build.VERSION.SDK_INT >= 30) {
            ((ActivityManager) V60.a.getSystemService("activity")).setProcessStateSummary("105.0.5195.136".getBytes());
        }
    }

    public static RB2 a() {
        ThreadUtils.a();
        if (e == null) {
            e = AppHooks.get().o();
        }
        return e;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [org.chromium.chrome.browser.quickactionsearchwidget.QuickActionSearchWidgetProvider$QuickActionSearchWidgetProviderDino] */
    /* JADX WARN: Type inference failed for: r1v7, types: [org.chromium.chrome.browser.quickactionsearchwidget.QuickActionSearchWidgetProvider$QuickActionSearchWidgetProviderSearch] */
    /* JADX WARN: Type inference failed for: r3v9, types: [tB2] */
    public void c() {
        final C8655pM a = C8655pM.a();
        a.getClass();
        Object obj = ThreadUtils.a;
        if (!a.d) {
            a.d = true;
            a.c.b();
            ApplicationStatus.d(new InterfaceC11522xj() { // from class: oM
                @Override // defpackage.InterfaceC11522xj
                public final void n(int i) {
                    C8655pM c8655pM = C8655pM.this;
                    if (i == 3) {
                        if (c8655pM.e) {
                            UmaUtils.d = SystemClock.uptimeMillis();
                            AbstractC11008wC2.a();
                            int i2 = 0;
                            c8655pM.e = false;
                            C2977Wx2 c2977Wx2 = c8655pM.a;
                            RunnableC2847Vx2 runnableC2847Vx2 = c2977Wx2.b;
                            if (runnableC2847Vx2.g == 1) {
                                runnableC2847Vx2.g = 2;
                                runnableC2847Vx2.a.removeCallbacks(runnableC2847Vx2);
                            }
                            if (c2977Wx2.a.getAndSet(false)) {
                                V60.a.unregisterReceiver(c2977Wx2);
                            }
                            C1761No1.c = null;
                            C1761No1.e = null;
                            Iterator it = ApplicationStatus.b().iterator();
                            while (it.hasNext()) {
                                InterfaceC0079Ap3 interfaceC0079Ap3 = (InterfaceC0079Ap3) c8655pM.b.get((Activity) it.next());
                                if (interfaceC0079Ap3 != null && interfaceC0079Ap3.i()) {
                                    i2 += ((AbstractC11276wz3) ((InterfaceC10590uz3) interfaceC0079Ap3.get())).n();
                                }
                            }
                            EI2.e(i2, "Tab.TotalTabCount.BeforeLeavingApp");
                            LU3.a(Profile.d()).notifyEvent("foreground_session_destroyed");
                            return;
                        }
                        return;
                    }
                    c8655pM.getClass();
                    if (i == 4 && ApplicationStatus.a.isEmpty()) {
                        PartnerBrowserCustomizations b = PartnerBrowserCustomizations.b();
                        b.e.clear();
                        b.f = null;
                        PartnerBrowserCustomizations.g = null;
                        AbstractC0185Bl.f.execute(new P63());
                    }
                }
            });
        }
        Q83 q83 = O83.a;
        long g = q83.g(0L, "com.google.android.apps.chrome.ChromeMobileApplication.BOOT_TIMESTAMP");
        long currentTimeMillis = System.currentTimeMillis() - SystemClock.uptimeMillis();
        if (Math.abs(currentTimeMillis - g) > 1000) {
            N.M4n4n4_y();
            q83.s(currentTimeMillis, "com.google.android.apps.chrome.ChromeMobileApplication.BOOT_TIMESTAMP");
        }
        AbstractC0940Hg b = AppHooks.get().b();
        AbstractC0940Hg abstractC0940Hg = AppBannerManager.d;
        if (abstractC0940Hg != null) {
            ServiceConnectionC3087Xt2 serviceConnectionC3087Xt2 = (ServiceConnectionC3087Xt2) abstractC0940Hg;
            ApplicationStatus.i(serviceConnectionC3087Xt2);
            serviceConnectionC3087Xt2.b();
        }
        AppBannerManager.d = b;
        if (C5916hO.k == null) {
            C5916hO c5916hO = new C5916hO();
            C5916hO.k = c5916hO;
            ApplicationLifetime.a.a(c5916hO);
        }
        Clipboard.getInstance().e(new QU());
        BinderC2640Ui0.x = new InterfaceC0079Ap3() { // from class: sB2
            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                return new Intent(V60.a, (Class<?>) DecoderService.class);
            }
        };
        SelectFileDialog.s = new HB2();
        O40.a = new KH();
        C10094tZ2 a2 = C10094tZ2.a();
        TemplateUrlService a3 = IG3.a();
        a3.g(a2);
        a3.a(a2);
        if (!a3.f()) {
            N.MVKcMDBb(a3.c, a3);
        }
        W03 b2 = SearchWidgetProvider.b();
        C10094tZ2 a4 = C10094tZ2.a();
        if (!a4.a.b(b2)) {
            a4.a.a(b2);
            b2.accept(a4.g);
        }
        IG2 ig2 = GG2.a;
        final ?? r0 = new GG2() { // from class: org.chromium.chrome.browser.quickactionsearchwidget.QuickActionSearchWidgetProvider$QuickActionSearchWidgetProviderDino
            @Override // defpackage.GG2
            public final RemoteViews b(Context context, C9751sZ2 c9751sZ2, AppWidgetManager appWidgetManager, int i) {
                Bundle appWidgetOptions = appWidgetManager.getAppWidgetOptions(i);
                IG2 a5 = GG2.a();
                int i2 = appWidgetOptions.getInt("appWidgetMinWidth");
                int i3 = appWidgetOptions.getInt("appWidgetMaxHeight");
                int i4 = appWidgetOptions.getInt("appWidgetMaxWidth");
                int i5 = appWidgetOptions.getInt("appWidgetMinHeight");
                RemoteViews d2 = a5.d(context, R.layout.f60230_resource_name_obfuscated_res_0x7f0e0239);
                RemoteViews d3 = a5.d(context, R.layout.f60230_resource_name_obfuscated_res_0x7f0e0239);
                Resources resources = context.getApplicationContext().getResources();
                a5.e(resources, d2, i4, i5);
                a5.e(resources, d3, i2, i3);
                return new RemoteViews(d2, d3);
            }
        };
        final ?? r1 = new GG2() { // from class: org.chromium.chrome.browser.quickactionsearchwidget.QuickActionSearchWidgetProvider$QuickActionSearchWidgetProviderSearch
            @Override // defpackage.GG2
            public final RemoteViews b(Context context, C9751sZ2 c9751sZ2, AppWidgetManager appWidgetManager, int i) {
                HG2 hg2;
                Bundle appWidgetOptions = appWidgetManager.getAppWidgetOptions(i);
                IG2 a5 = GG2.a();
                int i2 = appWidgetOptions.getInt("appWidgetMinWidth");
                int i3 = appWidgetOptions.getInt("appWidgetMaxHeight");
                int i4 = appWidgetOptions.getInt("appWidgetMaxWidth");
                int i5 = appWidgetOptions.getInt("appWidgetMinHeight");
                HG2 hg22 = a5.e;
                int i6 = hg22.c;
                HG2 hg23 = a5.f;
                HG2 hg24 = a5.d;
                if (i5 < i6) {
                    hg2 = hg23;
                } else {
                    hg2 = i5 < hg24.c ? hg22 : hg24;
                }
                RemoteViews d2 = a5.d(context, hg2.a);
                IG2.a(d2, c9751sZ2, hg2, i4);
                if (i3 < hg22.c) {
                    hg22 = hg23;
                } else if (i3 >= hg24.c) {
                    hg22 = hg24;
                }
                RemoteViews d3 = a5.d(context, hg22.a);
                IG2.a(d3, c9751sZ2, hg22, i2);
                return new RemoteViews(d2, d3);
            }
        };
        PostTask.c(QF3.g, new Runnable() { // from class: EG2
            @Override // java.lang.Runnable
            public final void run() {
                Object obj2 = ThreadUtils.a;
                Context context = V60.a;
                context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class<?>) QuickActionSearchWidgetProvider$QuickActionSearchWidgetProviderSearch.class), 1, 1);
                Context context2 = V60.a;
                context2.getPackageManager().setComponentEnabledSetting(new ComponentName(context2, (Class<?>) QuickActionSearchWidgetProvider$QuickActionSearchWidgetProviderDino.class), 1, 1);
            }
        });
        InterfaceC11646y40 interfaceC11646y40 = new InterfaceC11646y40() { // from class: FG2
            @Override // defpackage.InterfaceC11646y40
            public final void accept(Object obj2) {
                AppWidgetManager appWidgetManager;
                C9751sZ2 c9751sZ2 = (C9751sZ2) obj2;
                Context context = V60.a;
                if (context == null || (appWidgetManager = AppWidgetManager.getInstance(context)) == null) {
                    return;
                }
                r0.c(context, appWidgetManager, c9751sZ2, null);
                r1.c(context, appWidgetManager, c9751sZ2, null);
            }
        };
        C10094tZ2 a5 = C10094tZ2.a();
        if (!a5.a.b(interfaceC11646y40)) {
            a5.a.a(interfaceC11646y40);
            interfaceC11646y40.accept(a5.g);
        }
        if (HistoryDeletionBridge.b == null) {
            HistoryDeletionBridge.b = new HistoryDeletionBridge();
        }
        HistoryDeletionBridge historyDeletionBridge = HistoryDeletionBridge.b;
        historyDeletionBridge.a.a(new C4098c50(new InterfaceC0079Ap3() { // from class: tB2
            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                return C7823mv2.d;
            }
        }));
        if (HistoryDeletionBridge.b == null) {
            HistoryDeletionBridge.b = new HistoryDeletionBridge();
        }
        HistoryDeletionBridge historyDeletionBridge2 = HistoryDeletionBridge.b;
        historyDeletionBridge2.a.a(new C3064Xp());
        FeatureNotificationGuideBridge.a = new C8636pI0();
        C9626sA2 g2 = C9626sA2.g();
        if (g2.e) {
            return;
        }
        g2.e = true;
        if (g2.c != null) {
            return;
        }
        PolicyService policyService = (PolicyService) N.MXHPjU6q();
        g2.c = policyService;
        g2.d = new C9283rA2(g2);
        if (N.MCCtS0px(policyService.a, policyService)) {
            g2.h();
        }
        PolicyService policyService2 = g2.c;
        C9283rA2 c9283rA2 = g2.d;
        C12157za2 c12157za2 = policyService2.b;
        if (c12157za2.isEmpty()) {
            N.M4YsjnbO(policyService2.a, policyService2);
        }
        c12157za2.a(c9283rA2);
    }

    public void b() {
        C3637al0 b = C3637al0.b();
        b.a(new JB2(this));
        b.a(new KB2(this));
        b.a(new LB2());
        b.a(new MB2());
        b.a(new NB2());
        b.a(new OB2());
        b.a(new PB2());
        b.a(new QB2(this));
        b.a(new FB2());
        b.a(new Runnable() { // from class: kB2
            @Override // java.lang.Runnable
            public final void run() {
                char c;
                C9524rt b2 = AbstractC7808mt.b();
                Context context = V60.a;
                b2.getClass();
                TraceEvent i = TraceEvent.i("BackgroundTaskScheduler.checkForOSUpgrade", null);
                try {
                    Object obj = ThreadUtils.a;
                    TraceEvent i2 = TraceEvent.i("BackgroundTaskSchedulerPrefs.getLastSdkVersion", null);
                    try {
                        SharedPreferences sharedPreferences = T60.a;
                        int i3 = Build.VERSION.SDK_INT;
                        int i4 = sharedPreferences.getInt("bts_last_sdk_version", i3);
                        if (i2 != null) {
                            i2.close();
                        }
                        AbstractC12268zt.f();
                        if (i4 != i3) {
                            TraceEvent i5 = TraceEvent.i("BackgroundTaskSchedulerPrefs.setLastSdkVersion", Integer.toString(i3));
                            try {
                                sharedPreferences.edit().putInt("bts_last_sdk_version", i3).apply();
                                if (i5 != null) {
                                    i5.close();
                                }
                            } catch (Throwable th) {
                                if (i5 != null) {
                                    try {
                                        i5.close();
                                    } catch (Throwable unused) {
                                    }
                                }
                                throw th;
                            }
                        }
                        if (i4 != i3) {
                            if (i4 < 23) {
                                C0225Bt.c().getClass();
                                sharedPreferences.edit().remove("bts_cached_uma").apply();
                                InterfaceC7120kt c11239wt = i4 >= 23 ? new C11239wt() : new C8496ot();
                                Iterator it = AbstractC12268zt.c().iterator();
                                while (it.hasNext()) {
                                    c11239wt.a(context, ((Integer) it.next()).intValue());
                                }
                                TraceEvent i6 = TraceEvent.i("BackgroundTaskScheduler.reschedule", null);
                                try {
                                    Object obj2 = ThreadUtils.a;
                                    HashMap d2 = AbstractC12268zt.d();
                                    TraceEvent i7 = TraceEvent.i("BackgroundTaskSchedulerPrefs.removeAllTasks", null);
                                    try {
                                        T60.a.edit().remove("bts_scheduled_tasks").apply();
                                        AbstractC12268zt.e().edit().clear().apply();
                                        if (i7 != null) {
                                            i7.close();
                                        }
                                        for (Map.Entry entry : d2.entrySet()) {
                                            InterfaceC2689Us a = AbstractC7808mt.a(((Integer) entry.getKey()).intValue());
                                            if (a == null) {
                                                AbstractC4851eH1.f("BkgrdTaskScheduler", "Cannot reschedule task for task id " + entry.getKey() + ". Could not instantiate BackgroundTask class.", new Object[0]);
                                                int i8 = ((C8365oW2) entry.getValue()).j;
                                                if (i8 != 0) {
                                                    c = 2;
                                                    if (i8 != 1) {
                                                        c = i8 != 2 ? (char) 0 : (char) 3;
                                                    }
                                                } else {
                                                    c = 1;
                                                }
                                                if (c == 0) {
                                                    c = 4;
                                                }
                                                int intValue = ((Integer) entry.getKey()).intValue();
                                                if (c == 3) {
                                                    b2.b.a(context, intValue);
                                                } else {
                                                    b2.a.a(context, intValue);
                                                }
                                            } else {
                                                C0225Bt.c().getClass();
                                                C0225Bt.b(0, "Android.BackgroundTaskScheduler.TaskRescheduled");
                                                a.a();
                                            }
                                        }
                                        if (i6 != null) {
                                            i6.close();
                                        }
                                        if (i == null) {
                                            return;
                                        }
                                        i.close();
                                    } catch (Throwable th2) {
                                        if (i7 != null) {
                                            try {
                                                i7.close();
                                            } catch (Throwable unused2) {
                                            }
                                        }
                                        throw th2;
                                    }
                                } catch (Throwable th3) {
                                    if (i6 != null) {
                                        try {
                                            i6.close();
                                        } catch (Throwable unused3) {
                                        }
                                    }
                                    throw th3;
                                }
                            }
                        }
                        C0225Bt.c().getClass();
                        Set<String> stringSet = sharedPreferences.getStringSet("bts_cached_uma", new HashSet());
                        if (stringSet != null && stringSet.contains(null)) {
                            stringSet.remove(null);
                        }
                        Iterator<String> it2 = stringSet.iterator();
                        while (it2.hasNext()) {
                            C0095At a2 = C0095At.a(it2.next());
                            if (a2 != null) {
                                for (int i9 = 0; i9 < a2.c; i9++) {
                                    EI2.h(a2.b, 29, a2.a);
                                }
                            }
                        }
                        Object obj3 = ThreadUtils.a;
                        T60.a.edit().remove("bts_cached_uma").apply();
                        if (i == null) {
                            return;
                        }
                        i.close();
                    } catch (Throwable th4) {
                        if (i2 != null) {
                            try {
                                i2.close();
                            } catch (Throwable unused4) {
                            }
                        }
                        throw th4;
                    }
                } catch (Throwable th5) {
                    if (i != null) {
                        try {
                            i.close();
                        } catch (Throwable unused5) {
                        }
                    }
                    throw th5;
                }
            }
        });
        b.a(new Runnable() { // from class: DB2
            @Override // java.lang.Runnable
            public final void run() {
                final Context createDeviceProtectedStorageContext;
                if (Build.VERSION.SDK_INT < 24) {
                    return;
                }
                createDeviceProtectedStorageContext = V60.a.createDeviceProtectedStorageContext();
                PostTask.c(QF3.h, new Runnable() { // from class: wB2
                    @Override // java.lang.Runnable
                    public final void run() {
                        File codeCacheDir = createDeviceProtectedStorageContext.getCodeCacheDir();
                        if (codeCacheDir == null) {
                            return;
                        }
                        File file = new File(codeCacheDir, "com.android.opengl.shaders_cache");
                        if (file.exists()) {
                            long length = file.length() / 1024;
                            if (length < 1) {
                                length = 1;
                            }
                            if (length >= 2560) {
                                length = 2559;
                            }
                            EI2.f((int) length, 1, 2560, 50, "Memory.Experimental.Browser.EGLShaderCacheSize.Android");
                        }
                    }
                });
            }
        });
        b.a(new Runnable() { // from class: EB2
            @Override // java.lang.Runnable
            public final void run() {
                PostTask.c(QF3.h, new Runnable() { // from class: jS1
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context = V60.a;
                        PackageManager packageManager = context.getPackageManager();
                        ComponentName componentName = new ComponentName(context, (Class<?>) MediaLauncherActivity.class);
                        ComponentName componentName2 = new ComponentName(context, "org.chromium.chrome.browser.media.AudioLauncherActivity");
                        int i = AbstractC6968kS1.c() ? 1 : 2;
                        boolean z = false;
                        if (AbstractC6968kS1.c()) {
                            if (!(SysUtils.isLowEndDevice() && Build.VERSION.SDK_INT >= 26)) {
                                z = true;
                            }
                        }
                        int i2 = z ? 1 : 2;
                        if (packageManager.getComponentEnabledSetting(componentName) != i) {
                            packageManager.setComponentEnabledSetting(componentName, i, 1);
                        }
                        if (packageManager.getComponentEnabledSetting(componentName2) != i2) {
                            packageManager.setComponentEnabledSetting(componentName2, i2, 1);
                        }
                    }
                });
            }
        });
        C12185zf0 e2 = C10712vM.e();
        InterfaceC3241Yy1 a = C2680Uq0.a(e2.e);
        e2.a.getClass();
        C7629mN a2 = C7629mN.a();
        AbstractC6122hy2.a(a2);
        final C6971kT c6971kT = new C6971kT(a, a2, (C10776vY3) e2.f.get());
        b.a(new Runnable() { // from class: lB2
            @Override // java.lang.Runnable
            public final void run() {
                C6971kT c6971kT2 = C6971kT.this;
                c6971kT2.getClass();
                C7432ln3 c = C7432ln3.c();
                try {
                    c6971kT2.a("twa_dialog_number_of_dismissals_on_uninstall", true);
                    c6971kT2.a("twa_dialog_number_of_dismissals_on_clear_data", false);
                    c.close();
                } catch (Throwable th) {
                    try {
                        c.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            }
        });
        b.a(new Runnable() { // from class: mB2
            @Override // java.lang.Runnable
            public final void run() {
                Q83 q83 = O83.a;
                Set<String> j = q83.j("webapk_uninstalled_packages");
                if (j.isEmpty()) {
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                Wn4.a.d(null);
                for (String str : j) {
                    EI2.b("WebApk.Uninstall.Browser", true);
                    C12237zn4 c = Wn4.a.c(On4.b(str));
                    if (c != null) {
                        SharedPreferences sharedPreferences = c.b;
                        long j2 = sharedPreferences.getLong("webapk_uninstall_timestamp", 0L);
                        if (j2 == 0) {
                            j2 = currentTimeMillis;
                        }
                        N.MdWkMq2F(sharedPreferences.getString("webapk_manifest_url", null), 0, sharedPreferences.getInt("webapk_version_code", 0), sharedPreferences.getInt("launch_count", 0), j2 - sharedPreferences.getLong("webapk_install_timestamp", 0L));
                    }
                }
                q83.u("webapk_uninstalled_packages", new HashSet());
            }
        });
        b.a(new Runnable() { // from class: nB2
            @Override // java.lang.Runnable
            public final void run() {
                int i = IncognitoTabLauncher.a;
                C7928nE c7928nE = UN.a;
                final boolean z = N.M09VlOh_("AllowNewIncognitoTabIntents") && N.M$3vpOHw();
                PostTask.c(QF3.i, new Runnable() { // from class: yk1
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i2 = IncognitoTabLauncher.a;
                        Object obj = ThreadUtils.a;
                        Context context = V60.a;
                        PackageManager packageManager = context.getPackageManager();
                        ComponentName componentName = new ComponentName(context, (Class<?>) IncognitoTabLauncher.class);
                        int i3 = z ? 1 : 2;
                        if (packageManager.getComponentEnabledSetting(componentName) != i3) {
                            packageManager.setComponentEnabledSetting(componentName, i3, 1);
                        }
                    }
                });
            }
        });
        b.a(new Runnable() { // from class: oB2
            @Override // java.lang.Runnable
            public final void run() {
                C1173Ja2.a();
            }
        });
        b.a(new Runnable() { // from class: pB2
            @Override // java.lang.Runnable
            public final void run() {
                EnterpriseInfo.b().c();
            }
        });
        b.a(new Runnable() { // from class: qB2
            @Override // java.lang.Runnable
            public final void run() {
                C7928nE c7928nE = UN.a;
                if (!N.M09VlOh_("VideoTutorials")) {
                    O83.a.m("Chrome.VideoTutorials.ShareUrls");
                } else {
                    ((VideoTutorialServiceBridge) N.MBuXqyoS(Profile.d())).b(new Callback() { // from class: ub4
                        @Override // org.chromium.base.Callback
                        public final ZE e0(Object obj) {
                            return new ZE(this, obj);
                        }

                        @Override // org.chromium.base.Callback
                        public final void onResult(Object obj) {
                            HashSet hashSet = new HashSet();
                            for (Tutorial tutorial : (List) obj) {
                                if (!TextUtils.isEmpty(tutorial.h)) {
                                    hashSet.add(tutorial.h);
                                }
                            }
                            O83.a.u("Chrome.VideoTutorials.ShareUrls", hashSet);
                        }
                    });
                }
            }
        });
        b.a(new Runnable() { // from class: rB2
            @Override // java.lang.Runnable
            public final void run() {
                Object obj = ThreadUtils.a;
                if (O83.a.e("Chrome.FirstRun.SkippedByPolicy", false)) {
                    C5578gP0 c5578gP0 = C5578gP0.g;
                    if (c5578gP0 == null) {
                        c5578gP0 = new C5578gP0();
                    } else {
                        C5578gP0.g = null;
                    }
                    C0538Ed2 c0538Ed2 = new C0538Ed2();
                    c0538Ed2.a((PolicyService) N.MXHPjU6q());
                    new C3883bT3(new C0154Be3(c5578gP0, c0538Ed2, EnterpriseInfo.b()), c5578gP0);
                }
            }
        });
        b.a(new Runnable() { // from class: vB2
            @Override // java.lang.Runnable
            public final void run() {
                Q83 q83 = O83.a;
                q83.m("Chrome.OfflineMeasurements.LastCheckMillis");
                q83.m("Chrome.OfflineMeasurements.CurrentTaskMeasurementIntervalInMinutes");
                q83.m("Chrome.OfflineMeasurements.UserAgentString");
                q83.m("Chrome.OfflineMeasurements.HttpProbeUrl");
                q83.m("Chrome.OfflineMeasurements.HttpProbeTimeoutMs");
                q83.m("Chrome.OfflineMeasurements.HttpProbeMethod");
                q83.m("Chrome.OfflineMeasurements.SystemStateList");
            }
        });
        b.a(new Runnable() { // from class: xB2
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC9999tG2.d();
            }
        });
        b.a(new Runnable() { // from class: yB2
            @Override // java.lang.Runnable
            public final void run() {
                Context context = V60.a;
                C4502dG0 c4502dG0 = C4502dG0.b;
                TemplateUrlService a3 = IG3.a();
                NW0 c = NW0.c(context);
                Q83 q83 = O83.a;
                C1202Jg1 a4 = C1202Jg1.a();
                Profile d2 = Profile.d();
                a4.getClass();
                new C2649Uk(context, c4502dG0, a3, c, null, q83, C1202Jg1.b(d2), AccountManagerFacadeProvider.getInstance()).c(".Startup");
            }
        });
        b.a(new Runnable() { // from class: zB2
            @Override // java.lang.Runnable
            public final void run() {
                int i;
                C6132i01 c6132i01 = C6132i01.d;
                N.MUccXkXt("LanguageUsage.UI.Android.OverrideLanguage", TextUtils.equals(c6132i01.b, null) ? "" : c6132i01.b);
                String str = c6132i01.b;
                String c = LocaleUtils.c(c6132i01.a);
                if (TextUtils.equals(str, null)) {
                    i = 3;
                } else if (TextUtils.equals(str, c)) {
                    i = 2;
                } else {
                    i = TextUtils.equals(LocaleUtils.b(str), LocaleUtils.b(c)) ? 1 : 0;
                }
                EI2.h(i, 4, "LanguageUsage.UI.Android.OverrideLanguage.IsSystemLanguage");
            }
        });
        b.a(new Runnable() { // from class: AB2
            @Override // java.lang.Runnable
            public final void run() {
                Locale forLanguageTag;
                C6132i01 c6132i01 = C6132i01.d;
                c6132i01.getClass();
                if (AbstractC6205iD.a()) {
                    Locale a3 = new HF1().a();
                    c6132i01.b = a3 == null ? null : a3.toLanguageTag();
                    Iterator it = new HF1().b().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            forLanguageTag = (Locale) it.next();
                            String languageTag = forLanguageTag.toLanguageTag();
                            if (TextUtils.equals(languageTag, null) || Arrays.binarySearch(ResourceBundle.a, languageTag, AbstractC4649di.a) >= 0) {
                                break;
                            }
                        } else {
                            forLanguageTag = Locale.forLanguageTag("en-US");
                            break;
                        }
                    }
                    c6132i01.a = forLanguageTag;
                }
            }
        });
        b.a(new Runnable() { // from class: BB2
            @Override // java.lang.Runnable
            public final void run() {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(C10307u93.r() ? Arrays.asList(R71.w) : Arrays.asList(new R71[0]));
                long j = new C7033ke2(arrayList).a().a;
                if (j != 0) {
                    N.M83D7rt6(j);
                }
                if (AbstractC1947Oz2.d() && C10307u93.r()) {
                    C10307u93.t();
                }
            }
        });
        b.a(new Runnable() { // from class: CB2
            @Override // java.lang.Runnable
            public final void run() {
                C7928nE c7928nE = UN.a;
                if (N.M09VlOh_("FeatureNotificationGuide")) {
                }
            }
        });
    }

    public final void e() {
        TraceEvent i = TraceEvent.i("ProcessInitializationHandler.initializePreNative()", null);
        try {
            ThreadUtils.a();
            if (this.a) {
                if (i != null) {
                    i.close();
                }
            } else {
                d();
                this.a = true;
                if (i != null) {
                    i.close();
                }
            }
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }
}
