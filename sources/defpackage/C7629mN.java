package defpackage;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import android.speech.SpeechRecognizer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.BundleUtils;
import org.chromium.base.ContentUriUtils;
import org.chromium.base.SysUtils;
import org.chromium.base.ThreadUtils;
import org.chromium.base.TraceEvent;
import org.chromium.base.library_loader.b;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.AppHooks;
import org.chromium.chrome.browser.download.DownloadManagerService;
import org.chromium.chrome.browser.flags.CachedFeatureFlags;
import org.chromium.chrome.browser.metrics.UmaUtils;
import org.chromium.components.crash.browser.ChildProcessCrashObserver;
import org.chromium.components.policy.CombinedPolicyProvider;
import org.chromium.components.safe_browsing.SafeBrowsingApiBridge;
import org.chromium.content.browser.BrowserStartupControllerImpl;
import org.chromium.content.browser.SpeechRecognitionImpl;
import org.chromium.net.NetworkChangeNotifier;
import org.chromium.ui.base.DeviceFormFactor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mN */
/* loaded from: classes.dex */
public final class C7629mN {
    public static C7629mN h;
    public static BrowserStartupControllerImpl i;
    public final Locale a = Locale.getDefault();
    public ArrayList b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;

    public static C7629mN a() {
        if (h == null) {
            h = new C7629mN();
        }
        return h;
    }

    public final void f(Runnable runnable) {
        if (this.f) {
            runnable.run();
            return;
        }
        if (this.b == null) {
            this.b = new ArrayList();
        }
        this.b.add(runnable);
    }

    public final void d(boolean z) {
        ThreadUtils.a();
        C6255iN c6255iN = new C6255iN(z);
        c(c6255iN);
        b(false, c6255iN);
    }

    public final void c(LC lc) {
        ThreadUtils.a();
        if (lc.m()) {
            return;
        }
        RB2.a().e();
        TraceEvent i2 = TraceEvent.i("ChromeBrowserInitializer.preInflationStartup", null);
        try {
            e();
            lc.B();
            if (i2 != null) {
                i2.close();
            }
            if (lc.m()) {
                return;
            }
            if (SysUtils.isLowEndDevice()) {
                AX.e().a("disable-domain-reliability");
            }
            if (Process.is64Bit()) {
                String str = Z02.a[0];
                if (str.equals("monochrome") || str.equals("monochrome.cr")) {
                    throw new RuntimeException("Starting in 64-bit mode requires the 64-bit native library. If the device is 64-bit only, see alternatives here: https://crbug.com/1303857#c7.");
                }
            }
            lc.q(new RunnableC5911hN(this, lc));
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

    public final void e() {
        Object obj = ThreadUtils.a;
        if (this.c) {
            return;
        }
        if (UN.q.a()) {
            new Thread(new Runnable() { // from class: XM
                @Override // java.lang.Runnable
                public final void run() {
                    SafeBrowsingApiBridge.ensureInitialized();
                }
            }).start();
        }
        if (!OP.a) {
            OP.a = true;
        }
        RR.c();
        if (Build.VERSION.SDK_INT >= 24) {
            PostTask.c(QF3.h, new Runnable() { // from class: YM
                @Override // java.lang.Runnable
                public final void run() {
                    DownloadManagerService.f();
                    TraceEvent i2 = TraceEvent.i("BackgroundTaskSchedulerPrefs.warmUpSharedPrefs", null);
                    try {
                        AbstractC12268zt.e();
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
        } else {
            DownloadManagerService.f();
            TraceEvent i2 = TraceEvent.i("BackgroundTaskSchedulerPrefs.warmUpSharedPrefs", null);
            try {
                AbstractC12268zt.e();
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
        C7432ln3 c = C7432ln3.c();
        try {
            if (!DeviceFormFactor.isTablet()) {
                AX.e().a("use-mobile-user-agent");
            }
            c.close();
            ApplicationStatus.f(new C7285lN(this));
            this.c = true;
        } catch (Throwable th2) {
            try {
                c.close();
            } catch (Throwable unused2) {
            }
            throw th2;
        }
    }

    public final void b(boolean z, final LC lc) {
        if (!this.d) {
            throw new IllegalStateException("ChromeBrowserInitializer.handlePostNativeStartup called before ChromeBrowserInitializer.postInflationStartup has been run.");
        }
        C12064zI c12064zI = new C12064zI();
        if (!lc.W() && !RB2.a().b) {
            c12064zI.a(AbstractC5103f04.e, new Runnable() { // from class: WM
                @Override // java.lang.Runnable
                public final void run() {
                    RB2 a = RB2.a();
                    a.getClass();
                    ThreadUtils.a();
                    if (a.b) {
                        return;
                    }
                    a.c();
                    a.b = true;
                }
            });
        }
        if (!this.g) {
            c12064zI.a(AbstractC5103f04.e, new Runnable() { // from class: ZM
                @Override // java.lang.Runnable
                public final void run() {
                    C7629mN c7629mN = C7629mN.this;
                    if (c7629mN.g) {
                        return;
                    }
                    c7629mN.g = true;
                    Object obj = ThreadUtils.a;
                    TraceEvent.b("NetworkChangeNotifier.init", null);
                    NetworkChangeNotifier.init();
                    NetworkChangeNotifier.setAutoDetectConnectivityState(true);
                    TraceEvent.c("NetworkChangeNotifier.init");
                }
            });
        }
        QF3 qf3 = AbstractC5103f04.e;
        c12064zI.a(qf3, new Runnable() { // from class: aN
            @Override // java.lang.Runnable
            public final void run() {
                ComponentName a;
                C7629mN c7629mN = C7629mN.this;
                c7629mN.getClass();
                lc.U();
                Object obj = ThreadUtils.a;
                if (c7629mN.e) {
                    return;
                }
                AppHooks.get().A(CombinedPolicyProvider.a());
                if (SpeechRecognizer.isRecognitionAvailable(V60.a)) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        a = SpeechRecognitionImpl.a(-1, "com.google.android.tts");
                    } else {
                        a = SpeechRecognitionImpl.a(300207030, "com.google.android.googlequicksearchbox");
                    }
                    SpeechRecognitionImpl.f = a;
                }
            }
        });
        c12064zI.a(qf3, new Runnable() { // from class: bN
            @Override // java.lang.Runnable
            public final void run() {
                LC lc2 = LC.this;
                if (lc2.m()) {
                    return;
                }
                lc2.I();
            }
        });
        c12064zI.a(qf3, new Runnable() { // from class: cN
            @Override // java.lang.Runnable
            public final void run() {
                LC lc2 = LC.this;
                if (lc2.m()) {
                    return;
                }
                lc2.v();
            }
        });
        c12064zI.a(qf3, new Runnable() { // from class: dN
            @Override // java.lang.Runnable
            public final void run() {
                LC lc2 = LC.this;
                if (lc2.m()) {
                    return;
                }
                lc2.u();
            }
        });
        if (!this.e) {
            c12064zI.a(AbstractC5103f04.a, new Runnable() { // from class: eN
                @Override // java.lang.Runnable
                public final void run() {
                    boolean isBackgroundRestricted;
                    C7629mN c7629mN = C7629mN.this;
                    if (c7629mN.e) {
                        return;
                    }
                    c7629mN.e = true;
                    WM0 wm0 = new WM0();
                    synchronized (ContentUriUtils.b) {
                        ContentUriUtils.a = wm0;
                    }
                    C6941kN c6941kN = new C6941kN();
                    Object obj = ThreadUtils.a;
                    ChildProcessCrashObserver.a = c6941kN;
                    V60.a.registerComponentCallbacks(new ComponentCallbacks2C10401uS1("Browser"));
                    if (Build.VERSION.SDK_INT >= 28) {
                        Context context = V60.a;
                        isBackgroundRestricted = ((ActivityManager) context.getSystemService("activity")).isBackgroundRestricted();
                        EI2.b("Android.BackgroundRestrictions.IsBackgroundRestricted", isBackgroundRestricted);
                        int a = UmaUtils.a(context);
                        EI2.h(a, 6, "Android.BackgroundRestrictions.StandbyBucket");
                        EI2.h(a, 6, isBackgroundRestricted ? "Android.BackgroundRestrictions.StandbyBucket.WithUserRestriction" : "Android.BackgroundRestrictions.StandbyBucket.WithoutUserRestriction");
                    }
                    C9688sN c9688sN = C9688sN.b;
                    TL2 tl2 = CachedFeatureFlags.a;
                    O83.a.s(System.currentTimeMillis(), "Chrome.Flags.LastCachedMinimalBrowserFlagsTimeMillis");
                    CachedFeatureFlags.a(new C9345rN());
                    Iterator<E> it = C9688sN.c.iterator();
                    while (it.hasNext()) {
                        ((AbstractC7584mE) it.next()).a();
                    }
                    if (BundleUtils.c()) {
                        EI2.n(C9692sN3.h, "Android.FeatureModules.StartupTime");
                    }
                    AppHooks.get().d().a();
                }
            });
        }
        if (!lc.W()) {
            c12064zI.a(AbstractC5103f04.a, new Runnable() { // from class: fN
                @Override // java.lang.Runnable
                public final void run() {
                    C7629mN c7629mN = C7629mN.this;
                    c7629mN.f = true;
                    ArrayList arrayList = c7629mN.b;
                    if (arrayList != null) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((Runnable) it.next()).run();
                        }
                        c7629mN.b = null;
                    }
                }
            });
        }
        if (i == null) {
            i = RC.a();
        }
        BrowserStartupControllerImpl browserStartupControllerImpl = i;
        final int a = B43.a(browserStartupControllerImpl.f, browserStartupControllerImpl.j, lc.W());
        c12064zI.a(AbstractC5103f04.a, new Runnable() { // from class: gN
            @Override // java.lang.Runnable
            public final void run() {
                C0225Bt c = C0225Bt.c();
                int i2 = a;
                if (i2 >= 0) {
                    c.getClass();
                    C0225Bt.b(i2, "Servicification.Startup3");
                } else {
                    c.getClass();
                }
            }
        });
        if (z) {
            boolean o = lc.o();
            boolean W = lc.W();
            C6597jN c6597jN = new C6597jN(lc, c12064zI);
            try {
                TraceEvent.b("ChromeBrowserInitializer.startChromeBrowserProcessesAsync", null);
                if (i == null) {
                    i = RC.a();
                }
                i.h(o, W, c6597jN);
                return;
            } finally {
                TraceEvent.c("ChromeBrowserInitializer.startChromeBrowserProcessesAsync");
            }
        }
        try {
            TraceEvent.b("ChromeBrowserInitializer.startChromeBrowserProcessesSync", null);
            Object obj = ThreadUtils.a;
            StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
            b.n.a();
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            AbstractC9968tA1.a();
            if (i == null) {
                i = RC.a();
            }
            i.i();
            AbstractC0654Fa3.a();
            TraceEvent.c("ChromeBrowserInitializer.startChromeBrowserProcessesSync");
            c12064zI.b(true);
        } catch (Throwable th) {
            TraceEvent.c("ChromeBrowserInitializer.startChromeBrowserProcessesSync");
            throw th;
        }
    }
}
