package org.chromium.base.library_loader;

import J.N;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import defpackage.AX;
import defpackage.AbstractC10254u04;
import defpackage.AbstractC4851eH1;
import defpackage.C10321uC1;
import defpackage.C10944w12;
import defpackage.C12139zX;
import defpackage.C6540jB2;
import defpackage.C7432ln3;
import defpackage.EI2;
import defpackage.FE;
import defpackage.M41;
import defpackage.RT3;
import defpackage.T60;
import defpackage.V60;
import defpackage.Z02;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.chromium.base.JNIUtils;
import org.chromium.base.TraceEvent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class b {
    public static final b n = new b();
    public volatile boolean a;
    public boolean b;
    public volatile int c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public final Object h = new Object();
    public final a i = new a(this);
    public final Object j = new Object();
    public d k;
    public boolean l;
    public boolean m;

    public final void k(int i) {
        int i2 = this.g;
        if (i == i2) {
            return;
        }
        if (i2 != 0) {
            throw new IllegalStateException(String.format("Trying to change the LibraryProcessType from %d to %d", Integer.valueOf(this.g), Integer.valueOf(i)));
        }
        this.g = i;
    }

    public final boolean c() {
        return this.d && !this.e && Build.VERSION.SDK_INT >= 29;
    }

    public final boolean l() {
        return this.d && !c();
    }

    public final d d() {
        d dVar;
        synchronized (this.j) {
            if (this.k == null) {
                this.k = this.e ? new e() : new LegacyLinker();
                AbstractC4851eH1.d("LibraryLoader", this.e ? "Using ModernLinker" : "Using LegacyLinker", new Object[0]);
            }
            dVar = this.k;
        }
        return dVar;
    }

    public final void a() {
        if (f()) {
            return;
        }
        b();
        h();
    }

    public final void b() {
        synchronized (this.j) {
            g(V60.a.getApplicationInfo(), false);
            e();
        }
    }

    public final boolean f() {
        if (this.a) {
            return this.c == 2;
        }
        return false;
    }

    public final void i(ApplicationInfo applicationInfo, String str) {
        d d = d();
        String str2 = applicationInfo.sourceDir;
        d.g(str2);
        AbstractC4851eH1.d("LibraryLoader", "Loading %s from within %s", str, str2);
        synchronized (d.a) {
            try {
                d.d(0L, 2, true);
                d.b(d.d ? 1 : 2, str);
            } catch (UnsatisfiedLinkError unused) {
                AbstractC4851eH1.f("Linker", "Failed to load native library with shared RELRO, retrying without", new Object[0]);
                try {
                    d.b.mLoadAddress = 0L;
                    d.b(0, str);
                } catch (UnsatisfiedLinkError e) {
                    AbstractC4851eH1.f("Linker", "Failed to load native library without RELRO sharing", new Object[0]);
                    throw e;
                }
            }
        }
        a aVar = this.i;
        if (aVar.d.l()) {
            d d2 = aVar.d.d();
            String a = aVar.a();
            synchronized (d2.a) {
                C10321uC1 c10321uC1 = d2.f;
                if (c10321uC1 != null) {
                    EI2.n(c10321uC1.b, "ChromiumAndroidLinker.TimeToFindWebViewReservation." + (c10321uC1.a ? "Found" : "NotFound") + "." + a);
                }
            }
        }
    }

    public final void j(ApplicationInfo applicationInfo, boolean z) {
        String str = applicationInfo.packageName;
        TraceEvent i = TraceEvent.i("LibraryLoader.preloadAlreadyLocked", null);
        if (i != null) {
            i.close();
        }
        String str2 = Z02.a[0];
        if (!(!c() && Build.VERSION.SDK_INT >= 29)) {
            boolean is64Bit = Process.is64Bit();
            String str3 = applicationInfo.sourceDir;
            boolean c = c();
            StringBuilder a = M41.a(str3, "!/");
            a.append(String.format(Locale.US, "lib/%s/%s%s", is64Bit ? "arm64-v8a" : "armeabi-v7a", c ? "crazy." : "", System.mapLibraryName(str2)));
            String sb = a.toString();
            AbstractC4851eH1.d("LibraryLoader", "libraryName: %s", sb);
            if (c) {
                AbstractC4851eH1.f("LibraryLoader", "Forcing system linker, relocations will not be shared. This negatively impacts memory usage.", new Object[0]);
            }
            System.load(sb);
            return;
        }
        System.loadLibrary(str2);
    }

    public final void g(ApplicationInfo applicationInfo, boolean z) {
        if (this.c >= 1) {
            return;
        }
        try {
            TraceEvent i = TraceEvent.i("LibraryLoader.loadMainDexAlreadyLocked", null);
            try {
                if (!this.f) {
                    this.d = true;
                    this.e = false;
                    this.f = true;
                }
                long uptimeMillis = SystemClock.uptimeMillis();
                long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
                if (l() && !this.b) {
                    i(applicationInfo, Z02.a[0]);
                } else {
                    j(applicationInfo, z);
                }
                EI2.n(SystemClock.uptimeMillis() - uptimeMillis, "ChromiumAndroidLinker." + this.i.a() + "LoadTime2");
                a aVar = this.i;
                EI2.n(SystemClock.currentThreadTimeMillis() - currentThreadTimeMillis, "ChromiumAndroidLinker." + aVar.a() + "ThreadLoadTime");
                this.c = 1;
                if (i != null) {
                    i.close();
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
        } catch (UnsatisfiedLinkError e) {
            throw new C6540jB2(2, e);
        }
    }

    public final void h() {
        if (this.c == 2) {
            return;
        }
        synchronized (this.h) {
            if (this.c == 2) {
                return;
            }
            TraceEvent i = TraceEvent.i("LibraryLoader.loadNonMainDex", null);
            try {
                if (!JNIUtils.isSelectiveJniRegistrationEnabled()) {
                    N.MIOj213u();
                }
                this.c = 2;
                if (i != null) {
                    i.close();
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

    public final void e() {
        int i;
        HashMap hashMap;
        int i2;
        if (this.a) {
            return;
        }
        int i3 = 0;
        if (this.g == 1) {
            C7432ln3 c = C7432ln3.c();
            try {
                SharedPreferences sharedPreferences = T60.a;
                if (!sharedPreferences.getBoolean("reached_code_profiler_enabled", false)) {
                    int i4 = sharedPreferences.getInt("reached_code_sampling_interval", 0);
                    c.close();
                    i2 = i4;
                } else {
                    c.close();
                    i2 = 10000;
                }
                if (i2 > 0) {
                    AX.e().a("enable-reached-code-profiler");
                    AX.e().b("reached-code-sampling-interval-us", Integer.toString(i2));
                }
                c = C7432ln3.c();
                try {
                    boolean z = sharedPreferences.getBoolean("background_thread_pool_enabled", false);
                    c.close();
                    if (z) {
                        AX.e().a("enable-background-thread-pool");
                    }
                } finally {
                }
            } finally {
            }
        }
        ArrayList arrayList = null;
        if (!this.m) {
            AtomicReference atomicReference = AX.a;
            AX ax = (AX) atomicReference.get();
            atomicReference.set(new C12139zX(ax != null ? ax.d() : null));
            this.m = true;
        }
        if (!N.M81WqFvs(this.g)) {
            AbstractC4851eH1.a("LibraryLoader", "error calling LibraryLoaderJni.get().libraryLoaded", new Object[0]);
            throw new C6540jB2(1);
        }
        AbstractC4851eH1.d("LibraryLoader", "Successfully loaded native library", new Object[0]);
        if (AbstractC10254u04.b) {
            C10944w12 c10944w12 = new C10944w12();
            FE fe = AbstractC10254u04.a;
            ReentrantReadWriteLock reentrantReadWriteLock = fe.a;
            reentrantReadWriteLock.writeLock().lock();
            try {
                fe.f = c10944w12;
                if (fe.b.isEmpty()) {
                    i = 0;
                    hashMap = null;
                } else {
                    hashMap = fe.b;
                    fe.b = new HashMap();
                    i = fe.c.getAndSet(0);
                }
                if (!fe.d.isEmpty()) {
                    arrayList = fe.d;
                    fe.d = new ArrayList();
                    int i5 = fe.e;
                    fe.e = 0;
                    i3 = i5;
                }
                reentrantReadWriteLock.readLock().lock();
                if (hashMap != null) {
                    try {
                        fe.g(hashMap, i);
                    } catch (Throwable th) {
                        reentrantReadWriteLock.readLock().unlock();
                        throw th;
                    }
                }
                if (arrayList != null) {
                    fe.h(i3, arrayList);
                }
                reentrantReadWriteLock.readLock().unlock();
            } finally {
                reentrantReadWriteLock.writeLock().unlock();
            }
        }
        TraceEvent.h.set(true);
        N.MFFzPOVw();
        RT3 rt3 = TraceEvent.k;
        if (rt3 != null) {
            rt3.a();
        }
        this.a = true;
    }
}
