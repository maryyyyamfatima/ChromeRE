package defpackage;

import android.content.res.Resources;
import android.os.SystemClock;
import com.android.chrome.R;
import java.util.HashMap;
import java.util.Iterator;
import org.chromium.chrome.browser.metrics.UmaUtils;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Xj3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3038Xj3 implements InterfaceC1283Jw2 {
    public final Tab a;
    public final C6040hk3 b = new C6040hk3();
    public final YD3 c;
    public Runnable d;
    public C2778Vj3 e;
    public final C2908Wj3 f;
    public int g;
    public boolean h;
    public boolean i;
    public int j;
    public boolean k;
    public long l;
    public InterfaceC0079Ap3 m;
    public InterfaceC0079Ap3 n;

    @Override // defpackage.InterfaceC1283Jw2
    public final void g() {
    }

    public C3038Xj3(Tab tab, C3799bD c3799bD, RunnableC3168Yj3 runnableC3168Yj3, C3298Zj3 c3298Zj3) {
        this.a = tab;
        YD3 b = YD3.b(tab);
        this.c = b;
        b.k = c3799bD;
        b.m = c3298Zj3;
        b.l = runnableC3168Yj3;
        C2908Wj3 c2908Wj3 = new C2908Wj3(this);
        this.f = c2908Wj3;
        this.g = 0;
        tab.v(c2908Wj3);
    }

    public final void j(int i) {
        Runnable runnable = this.d;
        if (runnable != null) {
            runnable.run();
        }
        this.d = null;
        Tab tab = this.a;
        tab.w(this.f);
        int i2 = this.g;
        this.g = 2;
        if (i2 != 1) {
            return;
        }
        this.c.e(i == 3 || i == 1 || i == 0);
        if (i == 3 && !tab.isHidden()) {
            ZN3.b(R.string.f79960_resource_name_obfuscated_res_0x7f140786, 0, tab.getContext()).d();
        }
        i();
        int i3 = this.j;
        C6040hk3 c6040hk3 = this.b;
        c6040hk3.getClass();
        if (i == 1) {
            FI2.a("PaintPreview.TabbedPlayer.Actionbar.Action");
        }
        FI2.a("PaintPreview.TabbedPlayer.Removed");
        EI2.e(i3, "Browser.PaintPreview.TabbedPlayer.SnackbarCount");
        EI2.h(i, 10, "Browser.PaintPreview.TabbedPlayer.ExitCause");
        if (c6040hk3.a != 0) {
            HashMap hashMap = C6040hk3.d;
            if (hashMap.containsKey(Integer.valueOf(i))) {
                EI2.j(System.currentTimeMillis() - c6040hk3.a, (String) hashMap.get(Integer.valueOf(i)));
            }
        }
    }

    @Override // defpackage.InterfaceC1283Jw2
    public final void b() {
        Tab tab = this.a;
        if (tab == null || tab.m() == null || this.k || AbstractC1329Kf3.a(tab.m()) == null) {
            return;
        }
        if (this.e == null) {
            this.e = new C2778Vj3(this);
        }
        Resources resources = tab.getContext().getResources();
        C12188zf3 a = C12188zf3.a(resources.getString(R.string.f79980_resource_name_obfuscated_res_0x7f140788), this.e, 1, 36);
        a.d = resources.getString(R.string.f79970_resource_name_obfuscated_res_0x7f140787);
        a.e = null;
        a.j = 8000;
        AbstractC1329Kf3.a(tab.m()).c(a);
        this.k = true;
        this.j++;
    }

    public final void i() {
        Tab tab;
        ViewOnClickListenerC1069If3 a;
        if (this.e == null || (tab = this.a) == null || tab.m() == null || (a = AbstractC1329Kf3.a(tab.m())) == null) {
            return;
        }
        a.a(this.e);
    }

    @Override // defpackage.InterfaceC1283Jw2
    public final void e(int i) {
        if (this.g != 1) {
            return;
        }
        this.b.getClass();
        EI2.h(i, 16, "Browser.PaintPreview.TabbedPlayer.CompositorFailureReason");
        j(2);
    }

    @Override // defpackage.InterfaceC1283Jw2
    public final void h() {
        if (this.h) {
            j(3);
            return;
        }
        C6040hk3 c6040hk3 = this.b;
        c6040hk3.getClass();
        c6040hk3.a = System.currentTimeMillis();
    }

    @Override // defpackage.InterfaceC1283Jw2
    public final void d() {
        if (this.g != 1) {
            return;
        }
        long j = this.l;
        InterfaceC0079Ap3 interfaceC0079Ap3 = this.m;
        C6040hk3 c6040hk3 = this.b;
        c6040hk3.b = true;
        C12157za2 c12157za2 = c6040hk3.c;
        if (interfaceC0079Ap3 != null && ((Boolean) interfaceC0079Ap3.get()).booleanValue()) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - j;
            EI2.j(elapsedRealtime, "Browser.PaintPreview.TabbedPlayer.TimeToFirstBitmap");
            Iterator it = c12157za2.iterator();
            while (true) {
                C11814ya2 c11814ya2 = (C11814ya2) it;
                if (!c11814ya2.hasNext()) {
                    return;
                }
                C7884n6 c7884n6 = (C7884n6) c11814ya2.next();
                c7884n6.getClass();
                EI2.b("Startup.Android.Cold.FirstPaintOccurredPreForeground", false);
                C8571p6 c8571p6 = c7884n6.a;
                if (!c8571p6.h) {
                    c8571p6.h = true;
                    EI2.k(elapsedRealtime, "Startup.Android.Cold.TimeToFirstVisibleContent");
                }
                if (!c8571p6.i) {
                    c8571p6.i = true;
                    EI2.k(elapsedRealtime, "Startup.Android.Cold.TimeToVisibleContent");
                }
            }
        } else {
            if (interfaceC0079Ap3 == null) {
                return;
            }
            Iterator it2 = c12157za2.iterator();
            while (true) {
                C11814ya2 c11814ya22 = (C11814ya2) it2;
                if (!c11814ya22.hasNext()) {
                    return;
                }
                C7884n6 c7884n62 = (C7884n6) c11814ya22.next();
                c7884n62.getClass();
                if (!UmaUtils.c() && !UmaUtils.b()) {
                    c7884n62.a.k = true;
                }
            }
        }
    }

    @Override // defpackage.InterfaceC1283Jw2
    public final void c() {
        j(0);
    }

    @Override // defpackage.InterfaceC1283Jw2
    public final void f(GURL gurl) {
        Tab tab = this.a;
        if (tab == null || !gurl.b || gurl.k()) {
            return;
        }
        tab.d(new LoadUrlParams(gurl.i(), 0));
        j(4);
    }

    @Override // defpackage.InterfaceC1283Jw2
    public final boolean isAccessibilityEnabled() {
        return C10021tL.f().c();
    }

    @Override // defpackage.InterfaceC1283Jw2
    public final void a() {
        if (isAccessibilityEnabled()) {
            j(9);
        }
    }
}
