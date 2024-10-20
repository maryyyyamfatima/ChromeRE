package defpackage;

import android.app.Activity;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.android.chrome.R;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.TraceEvent;
import org.chromium.chrome.browser.compositor.CompositorViewHolder;
import org.chromium.chrome.browser.customtabs.TranslucentCustomTabActivity;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.chrome.browser.webapps.SameTaskWebApkActivity;
import org.chromium.content.browser.ScreenOrientationProviderImpl;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fh3 */
/* loaded from: classes.dex */
public final class C5334fh3 extends AbstractC2338Rz3 implements InterfaceC6044hl1, InterfaceC0186Bl0 {
    public final Activity a;
    public final I5 g;
    public final C2468Sz3 h;
    public final XY3 i;
    public final C4620dd0 j;
    public final InterfaceC3241Yy1 k;
    public InterfaceC5678gh3 l;
    public ViewGroup m;
    public View n;
    public ViewPropertyAnimator o;
    public long p;
    public final int q;
    public boolean r;
    public boolean s;
    public long t;
    public boolean u;
    public final C12157za2 v;

    @Override // defpackage.InterfaceC6044hl1
    public final /* synthetic */ void H() {
    }

    public C5334fh3(Activity activity, I5 i5, C2468Sz3 c2468Sz3, C3135Yd0 c3135Yd0, XY3 xy3, C4620dd0 c4620dd0, InterfaceC3241Yy1 interfaceC3241Yy1) {
        this.a = activity;
        this.g = i5;
        this.h = c2468Sz3;
        C12157za2 c12157za2 = new C12157za2();
        this.v = c12157za2;
        this.q = 0;
        this.i = xy3;
        this.j = c4620dd0;
        this.k = interfaceC3241Yy1;
        int i = AbstractActivityC1529Lu.h1;
        boolean z = (activity instanceof TranslucentCustomTabActivity) || (activity instanceof SameTaskWebApkActivity);
        this.q = z ? (Build.VERSION.SDK_INT < 24 || !UN.O.a()) ? 1 : 2 : 0;
        c3135Yd0.getClass();
        if (z && Build.VERSION.SDK_INT == 26) {
            ScreenOrientationProviderImpl screenOrientationProviderImpl = ScreenOrientationProviderImpl.getInstance();
            screenOrientationProviderImpl.getClass();
            Activity activity2 = (Activity) c3135Yd0.a.k().get();
            if (activity2 != null) {
                WeakHashMap weakHashMap = screenOrientationProviderImpl.h;
                if (!weakHashMap.containsKey(activity2)) {
                    weakHashMap.put(activity2, null);
                    ApplicationStatus.e(screenOrientationProviderImpl, activity2);
                }
            }
            c12157za2.a(new C3005Xd0(c3135Yd0));
        }
        i5.b(this);
        c2468Sz3.d(this);
    }

    @Override // defpackage.InterfaceC6044hl1
    public final void i() {
        this.r = true;
        if (this.l != null) {
            b1();
        }
    }

    @Override // defpackage.InterfaceC6044hl1
    public final void W() {
        if (this.q == 1) {
            this.a.findViewById(R.id.coordinator).setVisibility(4);
        }
        View view = this.n;
        if (view == null) {
            return;
        }
        if (view.getParent() != null) {
            this.m.removeView(this.n);
        }
        this.m.addView(this.n);
    }

    @Override // defpackage.InterfaceC0186Bl0
    public final void onDestroy() {
        ViewPropertyAnimator viewPropertyAnimator = this.o;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // defpackage.BA0
    public final void C0(Tab tab, boolean z) {
        if (!tab.e() && z && this.j.c == 2 && (!this.l.c())) {
            Y0(tab, false);
        }
    }

    @Override // defpackage.BA0
    public final void q0(TabImpl tabImpl) {
        Y0(tabImpl, true);
    }

    public final void b1() {
        this.t = SystemClock.elapsedRealtime();
        TraceEvent i = TraceEvent.i("SplashScreen.build", null);
        try {
            this.n = this.l.b();
            if (i != null) {
                i.close();
            }
            View view = this.n;
            int i2 = this.q;
            if (view == null) {
                this.h.j(this);
                this.g.c(this);
                if (i2 != 0) {
                    a1();
                    return;
                }
                return;
            }
            ViewGroup viewGroup = (ViewGroup) this.a.findViewById(android.R.id.content);
            this.m = viewGroup;
            viewGroup.addView(this.n);
            ViewGroup viewGroup2 = this.m;
            viewGroup2.getViewTreeObserver().addOnDrawListener(new ViewTreeObserverOnDrawListenerC4990eh3(viewGroup2, new Runnable() { // from class: Zg3
                @Override // java.lang.Runnable
                public final void run() {
                    TraceEvent.j(C5334fh3.this.hashCode(), "SplashScreen.visible");
                }
            }));
            if (i2 == 1) {
                a1();
            }
            this.i.d = true;
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

    @Override // defpackage.BA0
    public final void I0(int i, Tab tab) {
        if (!this.l.c()) {
            Y0(tab, true);
        }
    }

    @Override // defpackage.BA0
    public final void J0(Tab tab, GURL gurl) {
        if (!this.l.c()) {
            Y0(tab, false);
        }
    }

    @Override // defpackage.BA0
    public final void f0(TabImpl tabImpl) {
        if (!this.l.c()) {
            Y0(tabImpl, false);
        }
    }

    public final void Y0(final Tab tab, boolean z) {
        if (this.g.a()) {
            return;
        }
        if (this.q == 2 && !this.u) {
            a1();
            this.a.getWindow().setFormat(-2);
            this.m.invalidate();
        }
        if (z) {
            X0(tab);
        } else {
            ((CompositorViewHolder) this.k.get()).l.j(new Runnable() { // from class: ah3
                @Override // java.lang.Runnable
                public final void run() {
                    C5334fh3.this.X0(tab);
                }
            });
        }
    }

    public final void a1() {
        this.u = true;
        try {
            Method declaredMethod = Activity.class.getDeclaredMethod("convertFromTranslucent", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(this.a, new Object[0]);
        } catch (ReflectiveOperationException unused) {
        }
        Iterator it = this.v.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC6365ih3) c11814ya2.next()).a();
            }
        }
    }

    public final void X0(final Tab tab) {
        if (this.s) {
            return;
        }
        this.s = true;
        this.h.j(this);
        TraceEvent.j(hashCode(), "SplashScreen.hidingAnimation");
        this.a.findViewById(R.id.coordinator).setVisibility(0);
        if (this.p == 0) {
            Z0(tab);
        } else {
            this.o = this.n.animate().alpha(0.0f).setDuration(this.p).withEndAction(new Runnable() { // from class: bh3
                @Override // java.lang.Runnable
                public final void run() {
                    C5334fh3.this.Z0(tab);
                }
            });
        }
    }

    public final void Z0(Tab tab) {
        this.m.removeView(this.n);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        TraceEvent.e(hashCode(), "SplashScreen.hidingAnimation");
        ViewGroup viewGroup = this.m;
        viewGroup.getViewTreeObserver().addOnDrawListener(new ViewTreeObserverOnDrawListenerC4990eh3(viewGroup, new Runnable() { // from class: ch3
            @Override // java.lang.Runnable
            public final void run() {
                TraceEvent.e(C5334fh3.this.hashCode(), "WebappSplashScreen.visible");
            }
        }));
        this.l.a(tab);
        long j = this.t;
        C12157za2 c12157za2 = this.v;
        Iterator it = c12157za2.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (c11814ya2.hasNext()) {
                ((InterfaceC6365ih3) c11814ya2.next()).b(j, elapsedRealtime);
            } else {
                c12157za2.clear();
                this.i.d = false;
                this.g.c(this);
                this.l = null;
                this.n = null;
                this.o = null;
                return;
            }
        }
    }
}
