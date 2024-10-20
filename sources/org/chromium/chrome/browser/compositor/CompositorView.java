package org.chromium.chrome.browser.compositor;

import J.N;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.AbstractC11746yN;
import defpackage.AbstractC1354Kk3;
import defpackage.AbstractC2976Wx1;
import defpackage.AbstractC4240cW2;
import defpackage.AbstractC4892eP2;
import defpackage.AbstractC8604pB3;
import defpackage.B20;
import defpackage.C2541To1;
import defpackage.C4424d20;
import defpackage.C6829k20;
import defpackage.C7638mO3;
import defpackage.C7851n02;
import defpackage.C9897sy1;
import defpackage.C9919t20;
import defpackage.CC;
import defpackage.InterfaceC0512Dy1;
import defpackage.InterfaceC3897bW2;
import defpackage.InterfaceC4080c20;
import defpackage.InterfaceC5039ep4;
import defpackage.InterfaceC7517m20;
import defpackage.InterfaceC7839my1;
import defpackage.InterfaceC7861n20;
import defpackage.Q50;
import defpackage.SurfaceHolderCallback2C9576s20;
import defpackage.V10;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.chromium.base.ThreadUtils;
import org.chromium.base.TraceEvent;
import org.chromium.chrome.browser.compositor.layouts.content.TabContentManager;
import org.chromium.chrome.browser.layouts.scene_layer.SceneLayer;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.DeviceFormFactor;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.resources.ResourceManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class CompositorView extends FrameLayout implements InterfaceC7517m20, InterfaceC5039ep4 {
    public final Rect a;
    public InterfaceC7861n20 g;
    public boolean h;
    public boolean i;
    public int j;
    public long k;
    public final InterfaceC0512Dy1 l;
    public int m;
    public ResourceManager n;
    public WindowAndroid o;
    public TabContentManager p;
    public View q;
    public boolean r;
    public Runnable s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public C9919t20 y;

    public CompositorView(Context context, InterfaceC0512Dy1 interfaceC0512Dy1) {
        super(context);
        this.a = new Rect();
        this.m = -1;
        this.l = interfaceC0512Dy1;
        c();
    }

    public final void c() {
        if (ThreadUtils.h() || Build.VERSION.SDK_INT >= 26) {
            this.g = new SurfaceHolderCallback2C9576s20(this, this);
            if (Build.VERSION.SDK_INT >= 28) {
                this.y = new C9919t20(this);
            }
            setBackgroundColor(AbstractC11746yN.b(getContext(), false));
            super.setVisibility(0);
            this.g.h(-1);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        View view = this.q;
        if (view != null) {
            Rect rect = this.a;
            view.getWindowVisibleDisplayFrame(rect);
            int i3 = rect.top;
            boolean z = true;
            boolean z2 = i3 != this.m;
            this.m = i3;
            WindowAndroid windowAndroid = this.o;
            Activity activity = windowAndroid != null ? (Activity) windowAndroid.k().get() : null;
            C7851n02.i.getClass();
            if (!C7851n02.q(activity) && !C7851n02.p(activity)) {
                z = false;
            }
            if (!z2 && !z && getMeasuredWidth() == View.MeasureSpec.getSize(i) && getMeasuredHeight() > View.MeasureSpec.getSize(i2)) {
                i2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.m = -1;
    }

    public final void e(boolean z) {
        if (!this.u || this.t || this.v == z) {
            return;
        }
        this.v = z;
        if (z) {
            N.Mlw_qgLA(this.k, this);
        }
        this.g.h(b());
    }

    public final int b() {
        if (this.h || this.i) {
            return -3;
        }
        if (this.u) {
            return !this.t && !this.v ? -3 : -1;
        }
        return -1;
    }

    public final void j(Runnable runnable) {
        f();
        this.s = runnable;
        if (this.x) {
            f();
        }
        k();
        long j = this.k;
        if (j != 0) {
            N.M_Nkznfe(j, this);
        }
    }

    public final void g(Surface surface, int i, int i2, int i3) {
        CompositorView compositorView;
        long j = this.k;
        if (j == 0) {
            return;
        }
        N.MH1eqy7s(j, this, i, i2, i3, (this.t || this.v) ? false : true, surface);
        CompositorViewHolder compositorViewHolder = (CompositorViewHolder) this.l;
        Q50 g = compositorViewHolder.g();
        WebContents l = compositorViewHolder.l();
        if (g == null || l == null || (compositorView = compositorViewHolder.l) == null) {
            return;
        }
        N.MzYzRqF3(compositorView.k, compositorView, l, i2, i3);
    }

    public final void h(Surface surface) {
        if (this.k == 0) {
            return;
        }
        C9919t20 c9919t20 = this.y;
        if (c9919t20 != null) {
            c9919t20.a = c9919t20.a && c9919t20.b != surface;
            c9919t20.b = null;
        }
        this.j = 2;
        this.x = false;
        k();
        N.MGPC4Ktv(this.k, this);
        CompositorViewHolder compositorViewHolder = (CompositorViewHolder) this.l;
        compositorViewHolder.o = 0;
        compositorViewHolder.c();
    }

    public final void i(Surface surface, boolean z) {
        long j = this.k;
        if (j == 0) {
            return;
        }
        if (z) {
            N.Mszb0mNw(j, this);
        }
        N.MyANQhkH(this.k, this);
        C9919t20 c9919t20 = this.y;
        if (c9919t20 != null) {
            c9919t20.b = surface;
            if (c9919t20.a) {
                c9919t20.a = false;
                CompositorView compositorView = c9919t20.c;
                InterfaceC7861n20 interfaceC7861n20 = compositorView.g;
                if (interfaceC7861n20 != null) {
                    interfaceC7861n20.g();
                    compositorView.a();
                }
            }
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        WindowAndroid windowAndroid = this.o;
        if (windowAndroid == null) {
            return;
        }
        if (i == 8) {
            long j = windowAndroid.h;
            if (j != 0) {
                N.MrnNdVRa(j, windowAndroid, false);
            }
        } else if (i == 0) {
            long j2 = windowAndroid.h;
            if (j2 != 0) {
                N.MrnNdVRa(j2, windowAndroid, true);
            }
        }
        C2541To1 a = C2541To1.a();
        a.c = null;
        a.d = null;
        a.b = null;
    }

    public final void onCompositorLayout() {
        String str;
        boolean isEmpty;
        boolean z;
        CompositorViewHolder compositorViewHolder = (CompositorViewHolder) this.l;
        compositorViewHolder.getClass();
        String str2 = "CompositorViewHolder:layout";
        TraceEvent.b("CompositorViewHolder:layout", null);
        C9897sy1 c9897sy1 = compositorViewHolder.k;
        if (c9897sy1 != null) {
            TraceEvent.b("LayoutDriver:onUpdate", null);
            long uptimeMillis = SystemClock.uptimeMillis();
            boolean z2 = c9897sy1.y;
            int i = 0;
            C6829k20 c6829k20 = c9897sy1.K;
            if (!z2) {
                c6829k20.p(Long.valueOf(uptimeMillis));
                str = "CompositorViewHolder:layout";
            } else {
                c9897sy1.y = false;
                V10 v10 = c9897sy1.H;
                v10.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                long j = currentTimeMillis - v10.e;
                v10.e = currentTimeMillis;
                v10.d = false;
                ArrayList arrayList = v10.a;
                if (arrayList.isEmpty()) {
                    str = "CompositorViewHolder:layout";
                    isEmpty = true;
                } else {
                    ArrayList arrayList2 = v10.c;
                    arrayList2.addAll(arrayList);
                    while (i < arrayList2.size()) {
                        C4424d20 c4424d20 = (C4424d20) arrayList2.get(i);
                        c4424d20.k = c4424d20.k + j;
                        long j2 = j;
                        float f = (float) c4424d20.p;
                        float f2 = C4424d20.s;
                        String str3 = str2;
                        long min = Math.min(((float) r9) - (f * f2), ((float) c4424d20.o) * f2);
                        if (min >= 0) {
                            c4424d20.l = 1.0f;
                            long j3 = ((float) c4424d20.o) * C4424d20.s;
                            if (j3 > 0) {
                                c4424d20.l = c4424d20.j.getInterpolation(((float) min) / ((float) j3));
                            }
                            ArrayList arrayList3 = c4424d20.i;
                            arrayList3.addAll(c4424d20.h);
                            for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                                ((InterfaceC4080c20) arrayList3.get(i2)).a(c4424d20);
                            }
                            arrayList3.clear();
                            if (min == ((float) c4424d20.o) * C4424d20.s) {
                                c4424d20.r = true;
                                c4424d20.end();
                            }
                        }
                        if (c4424d20.q == 3) {
                            arrayList.remove(c4424d20);
                        }
                        i++;
                        j = j2;
                        str2 = str3;
                    }
                    str = str2;
                    arrayList2.clear();
                    v10.b.run();
                    isEmpty = arrayList.isEmpty();
                }
                AbstractC2976Wx1 abstractC2976Wx1 = c9897sy1.r;
                if (abstractC2976Wx1 != null) {
                    boolean E = abstractC2976Wx1.E();
                    if (abstractC2976Wx1 == ((C9897sy1) abstractC2976Wx1.n).r) {
                        abstractC2976Wx1.M();
                    }
                    if (E && isEmpty) {
                        if (!abstractC2976Wx1.q) {
                            if (abstractC2976Wx1.r) {
                                abstractC2976Wx1.g();
                            }
                        } else {
                            abstractC2976Wx1.f();
                        }
                    }
                }
                int i3 = 0;
                while (true) {
                    ArrayList arrayList4 = c9897sy1.M;
                    if (i3 >= arrayList4.size()) {
                        break;
                    }
                    ((InterfaceC3897bW2) arrayList4.get(i3)).p(uptimeMillis);
                    i3++;
                }
                c6829k20.p(Long.valueOf(uptimeMillis));
            }
            TraceEvent.c("LayoutDriver:onUpdate");
            CompositorView compositorView = compositorViewHolder.l;
            C9897sy1 c9897sy12 = compositorViewHolder.k;
            compositorView.getClass();
            TraceEvent.b("CompositorView:finalizeLayers", null);
            if (c9897sy12.r == null || compositorView.k == 0) {
                TraceEvent.c("CompositorView:finalizeLayers");
            } else {
                if (!compositorView.r) {
                    ResourceManager resourceManager = compositorView.n;
                    boolean a = DeviceFormFactor.a(compositorView.getContext());
                    int[] iArr = AbstractC1354Kk3.c;
                    int[] iArr2 = a ? AbstractC1354Kk3.a : iArr;
                    if (DeviceFormFactor.a(compositorView.getContext())) {
                        iArr = AbstractC1354Kk3.b;
                    }
                    AbstractC4892eP2 abstractC4892eP2 = (AbstractC4892eP2) resourceManager.a.get(0);
                    for (int i4 : iArr) {
                        abstractC4892eP2.c(Integer.valueOf(i4).intValue());
                    }
                    for (int i5 : iArr2) {
                        abstractC4892eP2.a(Integer.valueOf(i5).intValue());
                    }
                    compositorView.r = true;
                }
                N.Mjz8vYEz(compositorView.k, compositorView);
                TabContentManager tabContentManager = compositorView.p;
                ResourceManager resourceManager2 = compositorView.n;
                InterfaceC7839my1 interfaceC7839my1 = c9897sy12.g;
                CC cc = interfaceC7839my1 != null ? ((CompositorViewHolder) interfaceC7839my1).t : null;
                ArrayList arrayList5 = c9897sy12.M;
                if (cc != null) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= arrayList5.size()) {
                            z = false;
                            break;
                        } else {
                            if (((InterfaceC3897bW2) arrayList5.get(i6)).s()) {
                                z = true;
                                break;
                            }
                            i6++;
                        }
                    }
                    C7638mO3 c7638mO3 = cc.i;
                    if (!z && !c9897sy12.r.i()) {
                        c7638mO3.c(c9897sy12.x);
                    } else {
                        int i7 = c9897sy12.x;
                        int a2 = c7638mO3.a();
                        c7638mO3.c(i7);
                        c9897sy12.x = a2;
                    }
                }
                RectF rectF = c9897sy12.C;
                c9897sy12.A(rectF);
                RectF rectF2 = c9897sy12.D;
                ((CompositorViewHolder) interfaceC7839my1).m(rectF2);
                AbstractC2976Wx1 abstractC2976Wx12 = c9897sy12.r;
                abstractC2976Wx12.N(rectF, tabContentManager, resourceManager2, cc);
                SceneLayer n = abstractC2976Wx12.n();
                float f3 = c9897sy12.L == null ? 0.0f : r5.r;
                for (int i8 = 0; i8 < arrayList5.size(); i8++) {
                    if (((InterfaceC3897bW2) arrayList5.get(i8)).p0()) {
                        AbstractC4240cW2 j4 = ((InterfaceC3897bW2) arrayList5.get(i8)).j(rectF2, resourceManager2, c9897sy12.a * f3);
                        j4.b(n);
                        n = j4;
                    }
                }
                N.MPdbXv3F(compositorView.k, compositorView, n);
                long j5 = AbstractC8604pB3.a;
                if (j5 > 0 && AbstractC8604pB3.c) {
                    if (j5 > 0 && !AbstractC8604pB3.d) {
                        AbstractC8604pB3.a(true);
                        AbstractC8604pB3.d = true;
                    }
                    AbstractC8604pB3.a(false);
                    AbstractC8604pB3.a = 0L;
                    AbstractC8604pB3.c = false;
                }
                N.MPzbdzfI(compositorView.k, compositorView);
                TraceEvent.c("CompositorView:finalizeLayers");
            }
        } else {
            str = "CompositorViewHolder:layout";
        }
        HashSet hashSet = compositorViewHolder.R;
        HashSet hashSet2 = compositorViewHolder.Q;
        hashSet.addAll(hashSet2);
        hashSet2.clear();
        compositorViewHolder.A();
        TraceEvent.c(str);
    }

    public final void recreateSurface() {
        this.g.d();
    }

    public final void k() {
        long j = this.k;
        if (j == 0) {
            return;
        }
        N.MsdzyWED(j, this.w || this.j > 0 || this.s != null);
    }

    public final void didSwapFrame(int i) {
        CompositorViewHolder compositorViewHolder = (CompositorViewHolder) this.l;
        compositorViewHolder.getClass();
        TraceEvent.f("didSwapFrame");
        ViewGroup viewGroup = (ViewGroup) compositorViewHolder.w;
        if (compositorViewHolder.H) {
            compositorViewHolder.post(new B20(compositorViewHolder, viewGroup));
        }
        compositorViewHolder.H = true;
        compositorViewHolder.o = i;
        if (!compositorViewHolder.q || i == 0) {
            compositorViewHolder.c();
        }
        compositorViewHolder.q = !compositorViewHolder.q;
        HashSet hashSet = compositorViewHolder.S;
        HashSet hashSet2 = compositorViewHolder.R;
        hashSet.addAll(hashSet2);
        hashSet2.clear();
        compositorViewHolder.A();
    }

    public final void didSwapBuffers(boolean z) {
        int i = this.j;
        if (i > 1) {
            this.j = i - 1;
            long j = this.k;
            if (j != 0) {
                N.M_Nkznfe(j, this);
            }
        } else if (i == 1) {
            this.j = 0;
            N.MVesqb5U(this.k, this);
            this.g.a();
        }
        if (z) {
            f();
        }
        this.x = true;
        CompositorViewHolder compositorViewHolder = (CompositorViewHolder) this.l;
        HashSet hashSet = compositorViewHolder.S;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        hashSet.clear();
        compositorViewHolder.A();
        k();
    }

    public final void notifyWillUseSurfaceControl() {
        this.u = true;
    }

    @Override // android.view.View
    public final void setWillNotDraw(boolean z) {
        this.g.c(z);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        this.g.e(drawable);
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        this.g.f(i);
        if (i == 4) {
            f();
        }
    }

    public final void f() {
        Runnable runnable = this.s;
        this.s = null;
        if (runnable != null) {
            runnable.run();
        }
        k();
    }

    public final void d(WindowAndroid windowAndroid) {
        this.t = false;
        if (this.k == 0) {
            return;
        }
        this.o.y.d(this);
        this.o = windowAndroid;
        windowAndroid.y.a(this);
        e(windowAndroid.x);
        int windowVisibility = getWindowVisibility();
        WindowAndroid windowAndroid2 = this.o;
        if (windowAndroid2 != null) {
            if (windowVisibility == 8) {
                long j = windowAndroid2.h;
                if (j != 0) {
                    N.MrnNdVRa(j, windowAndroid2, false);
                }
            } else if (windowVisibility == 0) {
                long j2 = windowAndroid2.h;
                if (j2 != 0) {
                    N.MrnNdVRa(j2, windowAndroid2, true);
                }
            }
            C2541To1 a = C2541To1.a();
            a.c = null;
            a.d = null;
            a.b = null;
        }
        this.g.g();
        N.M0hIhbxf(this.k, this, this.o);
        a();
    }

    public final void a() {
        SurfaceHolderCallback2C9576s20 surfaceHolderCallback2C9576s20 = new SurfaceHolderCallback2C9576s20(this, this);
        this.g = surfaceHolderCallback2C9576s20;
        surfaceHolderCallback2C9576s20.h(b());
        N.M_Nkznfe(this.k, this);
        this.g.f(getVisibility());
    }
}
