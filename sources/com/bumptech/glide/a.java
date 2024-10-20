package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.Log;
import defpackage.AbstractC10296u74;
import defpackage.AbstractC11121wZ0;
import defpackage.AbstractC6933kL1;
import defpackage.AbstractC7392lh;
import defpackage.BZ0;
import defpackage.C10092tZ0;
import defpackage.C10494uj0;
import defpackage.C10744vS1;
import defpackage.C11430xS1;
import defpackage.C11807yZ0;
import defpackage.C11953yy;
import defpackage.C2156Qp1;
import defpackage.C3492aK1;
import defpackage.C4179cK1;
import defpackage.C4317ck;
import defpackage.C6369ii1;
import defpackage.C6538jB0;
import defpackage.C6928kK1;
import defpackage.C7293lO2;
import defpackage.ComponentCallbacks2C5575gO2;
import defpackage.GZ0;
import defpackage.IZ0;
import defpackage.InterfaceC11610xy;
import defpackage.LZ0;
import defpackage.ML2;
import defpackage.MZ0;
import defpackage.NZ0;
import defpackage.X5;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class a implements ComponentCallbacks2 {
    public static volatile a m;
    public static volatile boolean n;
    public final InterfaceC11610xy a;
    public final C6928kK1 g;
    public final BZ0 h;
    public final C3492aK1 i;
    public final C7293lO2 j;
    public final C10494uj0 k;
    public final ArrayList l = new ArrayList();

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    public static a b(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (m == null) {
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) GeneratedAppGlideModuleImpl.class.getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
                generatedAppGlideModule = null;
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e);
            } catch (InstantiationException e2) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e2);
            } catch (NoSuchMethodException e3) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e3);
            } catch (InvocationTargetException e4) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e4);
            }
            synchronized (a.class) {
                if (m == null) {
                    a(context, generatedAppGlideModule);
                }
            }
        }
        return m;
    }

    public static void a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (n) {
            throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
        }
        n = true;
        C11807yZ0 c11807yZ0 = new C11807yZ0();
        Context applicationContext = context.getApplicationContext();
        List emptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || generatedAppGlideModule.b()) {
            emptyList = new ArrayList();
            try {
                ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                if (applicationInfo.metaData != null) {
                    if (Log.isLoggable("ManifestParser", 2)) {
                        String.valueOf(applicationInfo.metaData);
                    }
                    for (String str : applicationInfo.metaData.keySet()) {
                        if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                            AbstractC6933kL1.a(str);
                            throw null;
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("Unable to find metadata to parse GlideModules", e);
            }
        }
        List list = emptyList;
        if (generatedAppGlideModule != null && !generatedAppGlideModule.d().isEmpty()) {
            generatedAppGlideModule.d();
            Iterator it = list.iterator();
            if (it.hasNext()) {
                X5.a(it.next());
                throw null;
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = list.iterator();
            if (it2.hasNext()) {
                X5.a(it2.next());
                throw null;
            }
        }
        c11807yZ0.n = generatedAppGlideModule != null ? generatedAppGlideModule.e() : null;
        Iterator it3 = list.iterator();
        if (it3.hasNext()) {
            X5.a(it3.next());
            throw null;
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.a(applicationContext, c11807yZ0);
        }
        if (c11807yZ0.g == null) {
            GZ0 gz0 = new GZ0();
            if (LZ0.h == 0) {
                LZ0.h = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i = LZ0.h;
            if (TextUtils.isEmpty("source")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
            }
            c11807yZ0.g = new LZ0(new ThreadPoolExecutor(i, i, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new IZ0(gz0, "source", false)));
        }
        if (c11807yZ0.h == null) {
            int i2 = LZ0.h;
            GZ0 gz02 = new GZ0();
            if (TextUtils.isEmpty("disk-cache")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
            }
            c11807yZ0.h = new LZ0(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new IZ0(gz02, "disk-cache", true)));
        }
        if (c11807yZ0.o == null) {
            if (LZ0.h == 0) {
                LZ0.h = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i3 = LZ0.h >= 4 ? 2 : 1;
            GZ0 gz03 = new GZ0();
            if (TextUtils.isEmpty("animation")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
            }
            c11807yZ0.o = new LZ0(new ThreadPoolExecutor(i3, i3, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new IZ0(gz03, "animation", true)));
        }
        if (c11807yZ0.j == null) {
            c11807yZ0.j = new C11430xS1(new C10744vS1(applicationContext));
        }
        if (c11807yZ0.k == null) {
            c11807yZ0.k = new C10494uj0();
        }
        if (c11807yZ0.d == null) {
            int i4 = c11807yZ0.j.a;
            if (i4 > 0) {
                c11807yZ0.d = new C4179cK1(i4);
            } else {
                c11807yZ0.d = new C11953yy();
            }
        }
        if (c11807yZ0.e == null) {
            c11807yZ0.e = new C3492aK1(c11807yZ0.j.c);
        }
        if (c11807yZ0.f == null) {
            c11807yZ0.f = new C6928kK1(c11807yZ0.j.b);
        }
        if (c11807yZ0.i == null) {
            c11807yZ0.i = new C2156Qp1(applicationContext);
        }
        if (c11807yZ0.c == null) {
            c11807yZ0.c = new C6538jB0(c11807yZ0.f, c11807yZ0.i, c11807yZ0.h, c11807yZ0.g, new LZ0(new ThreadPoolExecutor(0, Integer.MAX_VALUE, LZ0.g, TimeUnit.MILLISECONDS, new SynchronousQueue(), new IZ0(new GZ0(), "source-unlimited", false))), c11807yZ0.o);
        }
        List list2 = c11807yZ0.p;
        if (list2 == null) {
            c11807yZ0.p = Collections.emptyList();
        } else {
            c11807yZ0.p = Collections.unmodifiableList(list2);
        }
        MZ0 mz0 = c11807yZ0.b;
        mz0.getClass();
        NZ0 nz0 = new NZ0(mz0);
        a aVar = new a(applicationContext, c11807yZ0.c, c11807yZ0.f, c11807yZ0.d, c11807yZ0.e, new C7293lO2(c11807yZ0.n, nz0), c11807yZ0.k, c11807yZ0.l, c11807yZ0.m, c11807yZ0.a, c11807yZ0.p, list, generatedAppGlideModule, nz0);
        applicationContext.registerComponentCallbacks(aVar);
        m = aVar;
        n = false;
    }

    public a(Context context, C6538jB0 c6538jB0, C6928kK1 c6928kK1, InterfaceC11610xy interfaceC11610xy, C3492aK1 c3492aK1, C7293lO2 c7293lO2, C10494uj0 c10494uj0, int i, C10092tZ0 c10092tZ0, C4317ck c4317ck, List list, List list2, AbstractC7392lh abstractC7392lh, NZ0 nz0) {
        this.a = interfaceC11610xy;
        this.i = c3492aK1;
        this.g = c6928kK1;
        this.j = c7293lO2;
        this.k = c10494uj0;
        X5.a(nz0.a.get(AbstractC11121wZ0.class));
        this.h = new BZ0(context, c3492aK1, new ML2(this, list2, abstractC7392lh), new C6369ii1(), c10092tZ0, c4317ck, list, c6538jB0, nz0, i);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        AbstractC10296u74.a();
        this.g.e(0L);
        this.a.e();
        C3492aK1 c3492aK1 = this.i;
        synchronized (c3492aK1) {
            c3492aK1.b(0);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        long j;
        AbstractC10296u74.a();
        synchronized (this.l) {
            Iterator it = this.l.iterator();
            while (it.hasNext()) {
                ((ComponentCallbacks2C5575gO2) it.next()).getClass();
            }
        }
        C6928kK1 c6928kK1 = this.g;
        c6928kK1.getClass();
        if (i >= 40) {
            c6928kK1.e(0L);
        } else if (i >= 20 || i == 15) {
            synchronized (c6928kK1) {
                j = c6928kK1.b;
            }
            c6928kK1.e(j / 2);
        }
        this.a.d(i);
        C3492aK1 c3492aK1 = this.i;
        synchronized (c3492aK1) {
            try {
                if (i >= 40) {
                    synchronized (c3492aK1) {
                        c3492aK1.b(0);
                    }
                } else if (i >= 20 || i == 15) {
                    c3492aK1.b(c3492aK1.e / 2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ComponentCallbacks2C5575gO2 d(Context context) {
        if (context == null) {
            throw new NullPointerException("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        }
        return b(context).j.c(context);
    }

    public final void c(ComponentCallbacks2C5575gO2 componentCallbacks2C5575gO2) {
        synchronized (this.l) {
            if (!this.l.contains(componentCallbacks2C5575gO2)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            this.l.remove(componentCallbacks2C5575gO2);
        }
    }
}
