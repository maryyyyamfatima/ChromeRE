package defpackage;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.Menu;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowMetrics;
import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.base.TraceEvent;
import org.chromium.base.library_loader.b;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.features.start_surface.StartSurfaceConfiguration;
import org.chromium.ui.base.DeviceFormFactor;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ll */
/* loaded from: classes.dex */
public abstract class AbstractActivityC7416ll extends LM implements InterfaceC7968nM, LC {
    public long G;
    public C10285u6 H;
    public Bundle I;

    /* renamed from: J */
    public boolean f11516J;
    public long K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean P;
    public boolean Q;
    public Runnable R;
    public boolean S;
    public final Y02 C = new Y02(this);
    public final I5 D = new I5(this);
    public final C7507m02 E = new C7507m02(this);
    public boolean O = true;
    public final Handler B = new Handler();
    public final C2021Po1 F = new C2021Po1(new C6728jl(this, this));

    public void A0() {
    }

    public boolean C0(Intent intent) {
        return true;
    }

    public int D0(Intent intent, Bundle bundle) {
        return 0;
    }

    public void E0() {
    }

    public boolean G0(String str) {
        return false;
    }

    public void H0() {
    }

    public void I() {
    }

    public void I0(Configuration configuration) {
    }

    public boolean L0(Intent intent) {
        return true;
    }

    public boolean N0(Intent intent) {
        return false;
    }

    public Bundle O0(Bundle bundle) {
        return bundle;
    }

    public abstract void P0();

    @Override // defpackage.LC
    public final /* synthetic */ boolean W() {
        return false;
    }

    public void v() {
    }

    public C10285u6 v0() {
        return null;
    }

    @Override // defpackage.InterfaceC7968nM
    public void y(Intent intent) {
    }

    @Override // defpackage.LC
    public void u() {
        l();
    }

    @Override // defpackage.LM, androidx.appcompat.app.a, defpackage.VS0, android.app.Activity
    public void onDestroy() {
        this.f11516J = true;
        I5 i5 = this.D;
        i5.n = true;
        C10285u6 c10285u6 = this.H;
        if (c10285u6 != null) {
            c10285u6.destroy();
            this.H = null;
        }
        super.onDestroy();
        i5.l = 6;
        C12157za2 c12157za2 = i5.e;
        Iterator it = c12157za2.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (c11814ya2.hasNext()) {
                ((InterfaceC0186Bl0) c11814ya2.next()).onDestroy();
            } else {
                i5.a.clear();
                i5.c.clear();
                i5.d.clear();
                i5.b.clear();
                i5.f.clear();
                i5.g.clear();
                i5.h.clear();
                i5.i.clear();
                c12157za2.clear();
                i5.j.clear();
                return;
            }
        }
    }

    @Override // defpackage.LM
    public final boolean n0(Context context, Configuration configuration) {
        super.n0(context, configuration);
        configuration.smallestScreenWidthDp = x0(context);
        return true;
    }

    @Override // defpackage.InterfaceC7968nM
    public boolean C(int i, int i2, Intent intent) {
        boolean z;
        C2021Po1 c2021Po1 = this.F;
        SparseArray sparseArray = c2021Po1.a;
        InterfaceC4352cp4 interfaceC4352cp4 = (InterfaceC4352cp4) sparseArray.get(i);
        sparseArray.delete(i);
        String str = (String) c2021Po1.d.remove(Integer.valueOf(i));
        if (interfaceC4352cp4 != null) {
            interfaceC4352cp4.b(intent, i2);
            z = true;
        } else {
            if (str != null && !c2021Po1.c.a(str)) {
                C1861Oi1 c1861Oi1 = WindowAndroid.B;
                ZN3.c(V60.a, str, 0).d();
            }
            z = false;
        }
        if (z) {
            return true;
        }
        Iterator it = this.D.h.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (c11814ya2.hasNext()) {
                ((C9258r61) c11814ya2.next()).getClass();
                if (i == 777) {
                    EI2.b("Android.Survey.SurveyCompleted", i2 == -1);
                }
            } else {
                super.onActivityResult(i, i2, intent);
                return false;
            }
        }
    }

    @Override // defpackage.LC
    public final void B() {
        K0();
    }

    public void w0() {
        Iterator it = this.D.a.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC6044hl1) c11814ya2.next()).H();
            }
        }
    }

    public void K0() {
        this.L = DeviceFormFactor.a(this);
        this.M = b.n.f();
        Iterator it = this.D.a.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC6044hl1) c11814ya2.next()).i();
            }
        }
    }

    @Override // defpackage.InterfaceC7968nM
    public void c() {
        I5 i5 = this.D;
        i5.l = 3;
        Iterator it = i5.c.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC3657ao2) c11814ya2.next()).c();
            }
        }
    }

    @Override // defpackage.LC
    public final void q(RunnableC5911hN runnableC5911hN) {
        boolean z = B0() && !this.M;
        this.R = runnableC5911hN;
        if (z) {
            P0();
        }
        if (!this.P) {
            this.C.b(M0());
        }
        if (z) {
            return;
        }
        P0();
    }

    @Override // defpackage.VS0, android.app.Activity
    public void onPause() {
        Y02 y02 = this.C;
        y02.c = false;
        if (y02.h) {
            y02.a.e();
        }
        super.onPause();
    }

    @Override // defpackage.InterfaceC7968nM
    public void e() {
        I5 i5 = this.D;
        i5.l = 4;
        Iterator it = i5.c.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC3657ao2) c11814ya2.next()).e();
            }
        }
    }

    @Override // defpackage.InterfaceC7968nM
    public void f() {
        I5 i5 = this.D;
        i5.l = 2;
        Iterator it = i5.d.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC6377ij3) c11814ya2.next()).f();
            }
        }
    }

    @Override // defpackage.InterfaceC7968nM
    public void g() {
        I5 i5 = this.D;
        i5.l = 5;
        Iterator it = i5.d.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC6377ij3) c11814ya2.next()).g();
            }
        }
    }

    @Override // defpackage.AbstractActivityC6817k00, android.app.Activity
    public void onNewIntent(Intent intent) {
        if (intent == null) {
            return;
        }
        Y02 y02 = this.C;
        if (y02.h) {
            y02.a.y(intent);
        } else {
            if (y02.d == null) {
                y02.d = new ArrayList(1);
            }
            y02.d.add(intent);
        }
        setIntent(intent);
    }

    public boolean M0() {
        return !(Pj4.a().e != null);
    }

    @Override // defpackage.LC
    public final void V() {
        J0();
        w0();
        Iterator it = this.D.a.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC6044hl1) c11814ya2.next()).W();
            }
        }
    }

    @Override // defpackage.VS0, defpackage.AbstractActivityC6817k00, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        Y02 y02 = this.C;
        if (y02.h) {
            y02.a.C(i, i2, intent);
            return;
        }
        if (y02.e == null) {
            y02.e = new ArrayList(1);
        }
        y02.e.add(new X02(i, i2, intent));
    }

    public void J0() {
        HO0.a(z0(), new Runnable() { // from class: il
            @Override // java.lang.Runnable
            public final void run() {
                AbstractActivityC7416ll abstractActivityC7416ll = AbstractActivityC7416ll.this;
                abstractActivityC7416ll.Q = true;
                StartSurfaceConfiguration.b(SystemClock.elapsedRealtime() - abstractActivityC7416ll.y0(), "FirstDrawCompletedTime", abstractActivityC7416ll.B0());
                if (abstractActivityC7416ll.P) {
                    return;
                }
                TraceEvent.f("onFirstDrawComplete");
                Y02 y02 = abstractActivityC7416ll.C;
                y02.g = true;
                y02.a();
            }
        });
    }

    public View z0() {
        return findViewById(R.id.content);
    }

    @Override // defpackage.LC
    public final void Q(Exception exc) {
        throw new C6540jB2(4, exc);
    }

    public final void u0(int i) {
        super.onCreate(null);
        if (i == 1) {
            finish();
        } else {
            finishAndRemoveTask();
            overridePendingTransition(0, com.android.chrome.R.anim.0_resource_name_obfuscated_res_0x7f02004e);
        }
    }

    public long y0() {
        return this.G;
    }

    @Override // androidx.appcompat.app.a, defpackage.VS0, android.app.Activity
    public void onStart() {
        super.onStart();
        Y02 y02 = this.C;
        if (y02.h) {
            y02.c();
        } else {
            y02.b = true;
        }
        Intent intent = getIntent();
        if (AbstractC6952kP0.a(intent, N0(intent)) && L0(intent)) {
            throw new IllegalStateException("The app has not completed the FRE yet " + getClass().getName() + " is trying to start.");
        }
    }

    @Override // defpackage.VS0, android.app.Activity
    public void onResume() {
        super.onResume();
        this.N = !this.O || this.M;
        this.O = false;
        Y02 y02 = this.C;
        if (y02.h) {
            y02.a.c();
        } else {
            y02.c = true;
        }
    }

    @Override // androidx.appcompat.app.a, defpackage.VS0, android.app.Activity
    public void onStop() {
        super.onStop();
        Y02 y02 = this.C;
        y02.b = false;
        if (y02.h) {
            y02.a.g();
        }
    }

    @Override // defpackage.LC
    public final boolean m() {
        return this.f11516J || isFinishing();
    }

    @Override // defpackage.LM, androidx.appcompat.app.a, defpackage.AbstractActivityC6817k00, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        I0(configuration);
        Iterator it = this.D.i.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((T20) c11814ya2.next()).onConfigurationChanged(configuration);
            }
        }
    }

    @Override // defpackage.AbstractActivityC6817k00, android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        super.onMultiWindowModeChanged(z);
        Iterator it = this.E.b.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC7163l02) c11814ya2.next()).b(z);
            }
        }
    }

    @Override // android.app.Activity
    public final void onContextMenuClosed(Menu menu) {
        C10285u6 c10285u6 = this.H;
        if (c10285u6 == null) {
            return;
        }
        Iterator it = c10285u6.A.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            }
            I60 i60 = (I60) ((InterfaceC4695dp4) c11814ya2.next());
            if (i60.e != null) {
                i60.e = null;
                i60.b.a(true);
            }
        }
    }

    @Override // defpackage.VS0, defpackage.AbstractActivityC6817k00, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C10285u6 c10285u6 = this.H;
        if (c10285u6 == null || !c10285u6.f(i, strArr, iArr)) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Override // defpackage.LM, defpackage.AbstractActivityC6817k00, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("window_callback_errors", this.F.d);
        Iterator it = this.D.f.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((WU2) c11814ya2.next()).G(bundle);
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        Iterator it = this.D.g.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC10534up4) c11814ya2.next()).onWindowFocusChanged(z);
            }
        }
    }

    @Override // android.app.Activity
    public final void recreate() {
        super.recreate();
        Iterator it = this.D.j.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (c11814ya2.hasNext()) {
                ((LZ1) ((GI2) c11814ya2.next())).q = true;
            } else {
                Thread.dumpStack();
                return;
            }
        }
    }

    public final boolean B0() {
        return AbstractC5177fD3.k(this, this.L);
    }

    public static int x0(Context context) {
        WindowMetrics maximumWindowMetrics;
        Rect bounds;
        AbstractC1895Op0 b = AbstractC1895Op0.b(context);
        if (Build.VERSION.SDK_INT < 30) {
            Point point = b.c;
            int i = point.x;
            int i2 = point.y;
            if (i >= i2) {
                i = i2;
            }
            return (int) ((i / b.d) + 0.5f);
        }
        maximumWindowMetrics = ((WindowManager) context.getSystemService("window")).getMaximumWindowMetrics();
        bounds = maximumWindowMetrics.getBounds();
        return (int) ((Math.min(bounds.right - bounds.left, bounds.bottom - bounds.top) / b.d) + 0.5f);
    }

    @Override // android.app.Activity
    public final void onUserInteraction() {
        this.K = SystemClock.elapsedRealtime();
    }

    public void U() {
        try {
            TraceEvent.b("maybePreconnect", null);
            Intent intent = getIntent();
            if (intent != null && "android.intent.action.VIEW".equals(intent.getAction())) {
                String n = C1761No1.n(intent);
                if (n == null) {
                    return;
                }
                if (!C1761No1.o(intent.getExtras())) {
                    Pj4.a().c(n, Profile.d());
                }
            }
        } finally {
            TraceEvent.c("maybePreconnect");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x00b2  */
    @Override // defpackage.LM, defpackage.VS0, defpackage.AbstractActivityC6817k00, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            java.lang.String r0 = "AsyncInitializationActivity.onCreate()"
            r1 = 0
            org.chromium.base.TraceEvent.b(r0, r1)
            r4.H0()
            r4.A0()
            android.content.Intent r1 = r4.getIntent()
            int r2 = r1.getFlags()
            r3 = 1048576(0x100000, float:1.469368E-39)
            r2 = r2 & r3
            if (r2 == 0) goto L3b
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "android.intent.action.MAIN"
            r2.<init>(r3)
            int r3 = r1.getFlags()
            r2.setFlags(r3)
            java.lang.String r3 = "android.intent.category.LAUNCHER"
            r2.addCategory(r3)
            android.content.ComponentName r3 = r1.getComponent()
            r2.setComponent(r3)
            java.lang.String r1 = r1.getPackage()
            r2.setPackage(r1)
            r1 = r2
        L3b:
            r4.setIntent(r1)
            android.content.Intent r1 = r4.getIntent()
            int r1 = r4.D0(r1, r5)
            if (r1 == 0) goto L4c
            r4.u0(r1)
            goto L6f
        L4c:
            android.content.Intent r1 = r4.getIntent()
            boolean r2 = r4.C0(r1)
            if (r2 != 0) goto L5b
            r5 = 2
            r4.u0(r5)
            goto L6f
        L5b:
            boolean r2 = r4.L0(r1)
            r3 = 1
            if (r2 == 0) goto L71
            boolean r2 = r4.N0(r1)
            boolean r1 = defpackage.AbstractC6952kP0.c(r4, r1, r2)
            if (r1 == 0) goto L71
            r4.u0(r3)
        L6f:
            r3 = 0
            goto Lb0
        L71:
            ln3 r1 = defpackage.C7432ln3.c()
            android.os.Bundle r2 = r4.O0(r5)     // Catch: java.lang.Throwable -> Lb9
            super.onCreate(r2)     // Catch: java.lang.Throwable -> Lb9
            r1.close()
            long r1 = android.os.SystemClock.elapsedRealtime()
            r4.G = r1
            r4.I = r5
            u6 r5 = r4.v0()
            r4.H = r5
            android.os.Bundle r5 = r4.I
            Po1 r1 = r4.F
            r1.getClass()
            if (r5 != 0) goto L97
            goto La5
        L97:
            java.lang.String r2 = "window_callback_errors"
            java.io.Serializable r5 = r5.getSerializable(r2)
            boolean r2 = r5 instanceof java.util.HashMap
            if (r2 == 0) goto La5
            java.util.HashMap r5 = (java.util.HashMap) r5
            r1.d = r5
        La5:
            boolean r5 = r4 instanceof org.chromium.chrome.browser.searchwidget.SearchActivity
            r4.P = r5
            mN r5 = defpackage.C7629mN.a()
            r5.c(r4)
        Lb0:
            if (r3 != 0) goto Lb5
            r4.E0()
        Lb5:
            org.chromium.base.TraceEvent.c(r0)
            return
        Lb9:
            r5 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> Lbd
        Lbd:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractActivityC7416ll.onCreate(android.os.Bundle):void");
    }

    public void l() {
        WindowManager windowManager = getWindowManager();
        if (windowManager != null && windowManager.getDefaultDisplay() != null) {
            int i = getResources().getConfiguration().orientation;
        }
        findViewById(R.id.content).addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC7072kl(this));
        Y02 y02 = this.C;
        y02.h = true;
        if (y02.b) {
            y02.b = false;
            y02.c();
        }
        if (y02.c) {
            y02.c = false;
            if (y02.h) {
                y02.a.c();
            } else {
                y02.c = true;
            }
        }
        I5 i5 = this.D;
        i5.m = true;
        Iterator it = i5.b.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((V02) c11814ya2.next()).U();
            }
        }
    }

    public void F0() {
        Runnable runnable = this.R;
        if (runnable == null) {
            return;
        }
        runnable.run();
        this.R = null;
    }

    @Override // android.app.Activity
    public boolean moveTaskToBack(boolean z) {
        return super.moveTaskToBack(z);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.S) {
            this.S = false;
            getWindow().setWindowManager(getWindow().getWindowManager(), getWindow().getAttributes().token, getComponentName().flattenToString(), true);
        }
    }
}
