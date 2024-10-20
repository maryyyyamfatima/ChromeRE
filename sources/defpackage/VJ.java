package defpackage;

import J.N;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.chromium.base.BuildInfo;
import org.chromium.base.MemoryPressureListener;
import org.chromium.base.ThreadUtils;
import org.chromium.base.TraceEvent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class VJ {
    public static int H;
    public static boolean I;
    public int A;
    public boolean B;
    public int C;
    public boolean D;
    public IJ E;
    public String F;
    public boolean G;
    public final Object a = new Object();
    public final Handler b = new Handler();
    public final HJ c = new Executor() { // from class: HJ
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            VJ.this.b.post(runnable);
        }
    };
    public final ComponentName d;
    public final Bundle e;
    public final boolean f;
    public UJ g;
    public TJ h;
    public C5208fK i;
    public C4864eK j;
    public InterfaceC2471Ta1 k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public int p;
    public final LJ q;
    public final OJ r;
    public final String s;
    public final boolean t;
    public DK u;
    public DK v;
    public DK w;
    public int x;
    public int y;
    public int z;

    public static String e() {
        ClassLoader classLoader = VJ.class.getClassLoader();
        return classLoader.toString() + classLoader.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [HJ] */
    public VJ(Context context, ComponentName componentName, ComponentName componentName2, boolean z, boolean z2, Bundle bundle, String str) {
        this.d = componentName2;
        this.e = bundle;
        bundle.putBoolean("org.chromium.base.process_launcher.extra.bind_to_caller", z);
        bundle.putString("org.chromium.base.process_launcher.extra.browser_package_name", AbstractC6547jD.a.c);
        this.f = z;
        this.s = str;
        this.t = z2;
        this.q = new LJ(this, context);
        this.r = new OJ(this);
        if (I && componentName2 != null) {
            componentName = componentName2;
        }
        c(componentName);
    }

    public final void c(ComponentName componentName) {
        Intent intent = new Intent();
        intent.setComponent(componentName);
        Bundle bundle = this.e;
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        int i = (this.t ? Integer.MIN_VALUE : 0) | 1;
        LJ lj = this.q;
        OJ oj = this.r;
        String str = this.s;
        this.v = lj.a(intent, i, oj, str);
        this.u = lj.a(intent, i | 64, oj, str);
        this.w = lj.a(intent, i | 32, oj, str);
    }

    public final boolean g() {
        return this.k != null;
    }

    /* JADX WARN: Type inference failed for: r13v20, types: [IJ] */
    public final void h(IBinder iBinder) {
        InterfaceC2471Ta1 c2211Ra1;
        boolean z;
        PackageManager packageManager;
        BuildInfo buildInfo;
        if (this.l) {
            return;
        }
        String str = null;
        try {
            TraceEvent.b("ChildProcessConnection.ChildServiceConnection.onServiceConnected", null);
            this.l = true;
            int i = AbstractBinderC2341Sa1.a;
            if (iBinder == null) {
                c2211Ra1 = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("org.chromium.base.process_launcher.IChildProcessService");
                c2211Ra1 = (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC2471Ta1)) ? new C2211Ra1(iBinder) : (InterfaceC2471Ta1) queryLocalInterface;
            }
            this.k = c2211Ra1;
            if (this.f) {
                try {
                    if (!c2211Ra1.y0(e())) {
                        UJ uj = this.g;
                        if (uj != null) {
                            uj.b(this);
                        }
                        m();
                        TraceEvent.c("ChildProcessConnection.ChildServiceConnection.onServiceConnected");
                        return;
                    }
                } catch (RemoteException e) {
                    AbstractC4851eH1.a("ChildProcessConn", "Failed to bind service to connection.", e);
                    TraceEvent.c("ChildProcessConnection.ChildServiceConnection.onServiceConnected");
                    return;
                }
            }
            try {
                ApplicationInfo b0 = this.k.b0();
                AbstractC6547jD.a.getClass();
                ApplicationInfo applicationInfo = BuildInfo.m;
                if (!Objects.equals(applicationInfo.sourceDir, b0.sourceDir)) {
                    EI2.h(1, 3, "Android.ChildMismatch.AppInfoError2");
                    str = "sourceDir mismatch; parent=" + applicationInfo.sourceDir + " child=" + b0.sourceDir;
                } else if (!Arrays.equals(applicationInfo.sharedLibraryFiles, b0.sharedLibraryFiles)) {
                    EI2.h(2, 3, "Android.ChildMismatch.AppInfoError2");
                    str = "sharedLibraryFiles mismatch; parent=" + Arrays.toString(applicationInfo.sharedLibraryFiles) + " child=" + Arrays.toString(b0.sharedLibraryFiles);
                }
            } catch (RemoteException unused) {
                EI2.h(3, 3, "Android.ChildMismatch.AppInfoError2");
                str = "child didn't handle getAppInfo()";
            }
            if (str != null) {
                try {
                    packageManager = V60.a.getPackageManager();
                    buildInfo = AbstractC6547jD.a;
                } catch (PackageManager.NameNotFoundException unused2) {
                }
                if ((Build.VERSION.SDK_INT >= 28 ? packageManager.getPackageInfo(buildInfo.c, 0).getLongVersionCode() : r13.versionCode) == buildInfo.d) {
                    z = false;
                    EI2.b("Android.ChildMismatch.BrowserVersionChanged2", z);
                    String str2 = str + "; browser version has changed: " + z;
                    AbstractC4851eH1.a("ChildProcessConn", "Child process code mismatch: %s", str2);
                    boolean MA9sJ3RR = N.MA9sJ3RR("CrashBrowserOnChildMismatchIfBrowserChanged");
                    if (!N.MA9sJ3RR("CrashBrowserOnAnyChildMismatch") || (z && MA9sJ3RR)) {
                        throw new SJ(str2);
                    }
                }
                z = true;
                EI2.b("Android.ChildMismatch.BrowserVersionChanged2", z);
                String str22 = str + "; browser version has changed: " + z;
                AbstractC4851eH1.a("ChildProcessConn", "Child process code mismatch: %s", str22);
                boolean MA9sJ3RR2 = N.MA9sJ3RR("CrashBrowserOnChildMismatchIfBrowserChanged");
                if (!N.MA9sJ3RR("CrashBrowserOnAnyChildMismatch")) {
                }
                throw new SJ(str22);
            }
            EI2.h(0, 3, "Android.ChildMismatch.AppInfoError2");
            UJ uj2 = this.g;
            if (uj2 != null) {
                uj2.c();
            }
            this.m = true;
            if (this.E == null) {
                final ?? r13 = new InterfaceC8000nS1() { // from class: IJ
                    @Override // defpackage.InterfaceC8000nS1
                    public final void a(final int i2) {
                        final VJ vj = VJ.this;
                        vj.b.post(new Runnable() { // from class: KJ
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i3 = i2;
                                InterfaceC2471Ta1 interfaceC2471Ta1 = vj.k;
                                if (interfaceC2471Ta1 != null) {
                                    try {
                                        interfaceC2471Ta1.W0(i3);
                                    } catch (RemoteException unused3) {
                                    }
                                }
                            }
                        });
                    }
                };
                ThreadUtils.d(new Runnable() { // from class: JJ
                    @Override // java.lang.Runnable
                    public final void run() {
                        MemoryPressureListener.a(r13);
                    }
                });
                this.E = r13;
            }
            if (this.h != null) {
                d();
            }
            TraceEvent.c("ChildProcessConnection.ChildServiceConnection.onServiceConnected");
        } catch (Throwable th) {
            TraceEvent.c("ChildProcessConnection.ChildServiceConnection.onServiceConnected");
            throw th;
        }
    }

    public final void i() {
        if (this.n) {
            return;
        }
        this.n = true;
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(this.o);
        StringBuilder sb = new StringBuilder("bindings:");
        sb.append(this.w.m ? "W" : " ");
        sb.append(this.v.m ? "M" : " ");
        sb.append(this.u.m ? "S" : " ");
        objArr[1] = sb.toString();
        AbstractC4851eH1.f("ChildProcessConn", "onServiceDisconnected (crash or killed by oom): pid=%d %s", objArr);
        m();
        UJ uj = this.g;
        if (uj != null) {
            this.g = null;
            uj.a(this);
        }
        C5208fK c5208fK = this.i;
        if (c5208fK != null) {
            c5208fK.a();
            this.i = null;
        }
    }

    public final void d() {
        try {
            TraceEvent.b("ChildProcessConnection.doConnectionSetup", null);
            RJ rj = new RJ(this);
            try {
                InterfaceC2471Ta1 interfaceC2471Ta1 = this.k;
                TJ tj = this.h;
                interfaceC2471Ta1.r0(tj.a, rj, tj.b);
            } catch (RemoteException e) {
                AbstractC4851eH1.a("ChildProcessConn", "Failed to setup connection.", e);
            }
            this.h = null;
        } finally {
            TraceEvent.c("ChildProcessConnection.doConnectionSetup");
        }
    }

    public final void l(boolean z, C10011tJ c10011tJ) {
        try {
            TraceEvent.b("ChildProcessConnection.start", null);
            this.g = c10011tJ;
            if (!b(z)) {
                AbstractC4851eH1.a("ChildProcessConn", "Failed to establish the service connection.", new Object[0]);
                UJ uj = this.g;
                if (uj != null) {
                    this.g = null;
                    uj.a(this);
                }
            }
        } finally {
            TraceEvent.c("ChildProcessConnection.start");
        }
    }

    public final boolean b(boolean z) {
        boolean a;
        boolean z2 = I;
        ComponentName componentName = this.d;
        boolean z3 = z2 && componentName != null;
        if (z) {
            a = this.u.a();
        } else {
            this.y++;
            a = this.v.a();
        }
        if (!a) {
            if (z3 || componentName == null || !k()) {
                return false;
            }
            z3 = true;
        }
        if (!z3 && componentName != null) {
            this.b.postDelayed(new Runnable() { // from class: GJ
                @Override // java.lang.Runnable
                public final void run() {
                    VJ vj = VJ.this;
                    if (vj.l || vj.n || vj.B) {
                        return;
                    }
                    VJ.I = true;
                    vj.k();
                }
            }, 10000L);
        }
        this.w.a();
        n();
        return true;
    }

    public final boolean k() {
        ComponentName componentName = this.d;
        AbstractC4851eH1.f("ChildProcessConn", "Fallback to %s", componentName);
        DK dk = this.u;
        boolean z = dk.m;
        boolean z2 = this.v.m;
        boolean z3 = this.w.m;
        dk.k = null;
        dk.b();
        DK dk2 = this.v;
        dk2.k = null;
        dk2.b();
        DK dk3 = this.w;
        dk3.k = null;
        dk3.b();
        c(componentName);
        if (z && !this.u.a()) {
            return false;
        }
        if (!z2 || this.v.a()) {
            return !z3 || this.w.a();
        }
        return false;
    }

    public final void m() {
        this.k = null;
        this.h = null;
        this.B = true;
        this.u.b();
        this.w.b();
        this.v.b();
        n();
        final IJ ij = this.E;
        if (ij != null) {
            ThreadUtils.d(new Runnable() { // from class: FJ
                @Override // java.lang.Runnable
                public final void run() {
                    Object obj = ThreadUtils.a;
                    C12157za2 c12157za2 = MemoryPressureListener.a;
                    if (c12157za2 == null) {
                        return;
                    }
                    c12157za2.d(InterfaceC8000nS1.this);
                }
            });
            this.E = null;
        }
    }

    public final void o(int i, int i2) {
        if (this.z == i && this.A == i2) {
            return;
        }
        this.z = i;
        this.A = i2;
        if (g()) {
            DK dk = this.w;
            if (dk.m && AbstractC2064Px.c()) {
                try {
                    AbstractC7718me.a(dk.a, dk, i, i2);
                    AbstractC2064Px.b(dk.a, dk.g, dk, dk.h, dk.i, dk.j, dk.l);
                } catch (IllegalArgumentException unused) {
                }
            }
        }
    }

    public final void a() {
        if (!g()) {
            AbstractC4851eH1.f("ChildProcessConn", "The connection is not bound for %d", Integer.valueOf(this.o));
            return;
        }
        if (this.y == 0) {
            this.v.a();
            n();
        }
        this.y++;
    }

    public final void j() {
        if (g()) {
            int i = this.y - 1;
            this.y = i;
            if (i == 0) {
                this.v.b();
                n();
            }
        }
    }

    public final boolean f() {
        boolean z;
        synchronized (this.a) {
            z = this.G;
        }
        return z;
    }

    public final void n() {
        int i;
        if (this.B) {
            i = 0;
        } else if (this.u.m) {
            i = 3;
        } else {
            i = this.v.m ? 2 : 1;
        }
        synchronized (this.a) {
            if (!this.B) {
                this.C = i;
            }
        }
    }
}
