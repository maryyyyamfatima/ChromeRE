package com.facebook.litho;

import android.graphics.Rect;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewParent;
import androidx.viewpager.widget.ViewPager;
import defpackage.AbstractC0400Dc;
import defpackage.B10;
import defpackage.C0772Fy1;
import defpackage.C1032Hy1;
import defpackage.C1095Il;
import defpackage.C11703yE1;
import defpackage.C11866yj0;
import defpackage.C12151zZ1;
import defpackage.C2526Tl1;
import defpackage.C2651Uk1;
import defpackage.C2781Vk1;
import defpackage.C3752b43;
import defpackage.C3963bi0;
import defpackage.C5277fX3;
import defpackage.C5524gE1;
import defpackage.C6892kD0;
import defpackage.C7070kk3;
import defpackage.C7268lJ2;
import defpackage.C7586mE1;
import defpackage.C7849n00;
import defpackage.C8663pN2;
import defpackage.C8753pe3;
import defpackage.D00;
import defpackage.E00;
import defpackage.E10;
import defpackage.Ec4;
import defpackage.F00;
import defpackage.FV3;
import defpackage.G00;
import defpackage.HandlerC6212iE1;
import defpackage.I00;
import defpackage.IR0;
import defpackage.InterfaceC6554jE1;
import defpackage.J00;
import defpackage.J1;
import defpackage.K00;
import defpackage.L00;
import defpackage.LK3;
import defpackage.OM1;
import defpackage.Pq4;
import defpackage.QD0;
import defpackage.RunnableC2391Sk1;
import defpackage.RunnableC2521Tk1;
import defpackage.WZ;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ComponentTree {
    public static volatile Looper j0;
    public static volatile Looper k0;
    public InterfaceC6554jE1 A;
    public final HandlerC6212iE1 B;
    public final E00 C;
    public volatile C7268lJ2 D;
    public final Object E;
    public G00 F;
    public final Object G;
    public final boolean H;
    public final ArrayList I;

    /* renamed from: J */
    public volatile boolean f11494J;
    public volatile boolean K;
    public FV3 L;
    public FV3 M;
    public WZ N;
    public int O;
    public int P;
    public int Q;
    public C5277fX3 R;
    public int S;
    public int T;
    public int U;
    public C0772Fy1 V;
    public C0772Fy1 W;
    public C7070kk3 X;
    public C8663pN2 Y;
    public final int Z;
    public final boolean a;
    public final C11866yj0 a0;
    public boolean b;
    public final C6892kD0 b0;
    public String c;
    public final QD0 c0;
    public volatile C1095Il d;
    public final Pq4 d0;
    public ArrayDeque e;
    public final boolean e0;
    public C3963bi0 f;
    public final boolean f0;
    public int g;
    public final String g0;
    public final int h;
    public final C5524gE1 h0;
    public ArrayList j;
    public final C2781Vk1 k;
    public final boolean l;
    public L00 o;
    public final C7849n00 p;
    public final InterfaceC6554jE1 q;
    public boolean r;
    public boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public boolean x;
    public final boolean y;
    public C11703yE1 z;
    public static final AtomicInteger i0 = new AtomicInteger(0);
    public static final ThreadLocal l0 = new ThreadLocal();
    public final C2526Tl1 i = new C2526Tl1();
    public final D00 m = new D00(this);
    public final Object n = new Object();

    public static boolean l(int i) {
        return i == 0 || i == 2 || i == 4 || i == 6 || i == 8;
    }

    public static F00 f(WZ wz, C7849n00 c7849n00) {
        F00 f00 = new F00(c7849n00);
        if (wz == null) {
            throw new NullPointerException("Creating a ComponentTree with a null root is not allowed!");
        }
        f00.d = wz;
        return f00;
    }

    public ComponentTree(F00 f00) {
        boolean z;
        Looper looper;
        HandlerC6212iE1 handlerC6212iE1 = new HandlerC6212iE1(Looper.getMainLooper());
        this.B = handlerC6212iE1;
        this.C = new E00(this);
        this.E = new Object();
        this.G = new Object();
        this.I = new ArrayList();
        this.O = -1;
        this.Q = -1;
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.b0 = new C6892kD0();
        this.c0 = new QD0();
        this.d0 = new Pq4();
        C7849n00 c7849n00 = new C7849n00(f00.a, new C7070kk3(null), (C5277fX3) null, (C1032Hy1) null);
        c7849n00.l = this;
        c7849n00.f = null;
        this.p = c7849n00;
        this.N = f00.d;
        if (f00.e) {
            boolean z2 = B10.a;
            z = true;
        } else {
            z = false;
        }
        this.t = z;
        this.v = f00.b;
        this.u = f00.f;
        this.w = f00.g;
        this.A = f00.h;
        this.l = f00.m;
        InterfaceC6554jE1 interfaceC6554jE1 = f00.i;
        this.q = interfaceC6554jE1;
        this.y = true;
        this.f11494J = f00.k;
        this.K = false;
        J00 j00 = f00.l;
        if (j00 != null) {
            synchronized (this) {
                if (this.j == null) {
                    this.j = new ArrayList();
                }
                this.j.add(j00);
            }
        }
        this.H = f00.r;
        this.f0 = f00.q;
        boolean z3 = B10.a;
        this.e0 = f00.o;
        this.h = f00.c;
        this.a0 = f00.p;
        if (interfaceC6554jE1 == null && f00.n) {
            synchronized (ComponentTree.class) {
                if (k0 == null) {
                    HandlerThread handlerThread = new HandlerThread("PreallocateMountContentThread");
                    handlerThread.start();
                    k0 = handlerThread.getLooper();
                }
                looper = k0;
            }
            this.q = new HandlerC6212iE1(looper);
        }
        C7070kk3 c7070kk3 = f00.j;
        this.X = c7070kk3 == null ? new C7070kk3(null) : c7070kk3;
        this.Z = i0.getAndIncrement();
        this.k = new C2781Vk1(this);
        this.B = handlerC6212iE1;
        this.A = h(this.A);
        InterfaceC6554jE1 interfaceC6554jE12 = this.q;
        if (interfaceC6554jE12 != null) {
            this.q = interfaceC6554jE12;
        }
        this.h0 = f00.t;
        this.g0 = f00.s;
        this.a = AbstractC0400Dc.a(c7849n00.a);
    }

    public static C3752b43 h(InterfaceC6554jE1 interfaceC6554jE1) {
        Looper looper;
        if (interfaceC6554jE1 == null) {
            boolean z = B10.a;
            synchronized (ComponentTree.class) {
                if (j0 == null) {
                    HandlerThread handlerThread = new HandlerThread("ComponentLayoutThread", 5);
                    handlerThread.start();
                    j0 = handlerThread.getLooper();
                }
                looper = j0;
            }
            interfaceC6554jE1 = new HandlerC6212iE1(looper);
        } else if (j0 != null) {
            boolean z2 = B10.a;
        }
        boolean z3 = B10.a;
        return new C3752b43(interfaceC6554jE1);
    }

    public final void b() {
        boolean z;
        LK3.a();
        synchronized (this) {
            if (this.N == null) {
                return;
            }
            C0772Fy1 c0772Fy1 = this.W;
            if (c0772Fy1 == null) {
                throw new RuntimeException("Unexpected null mCommittedLayoutState");
            }
            boolean z2 = true;
            if (this.V != c0772Fy1) {
                q();
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C7268lJ2 c7268lJ2 = this.D;
                if (c7268lJ2 != null) {
                    c7268lJ2.a.A(0);
                    this.D = null;
                }
                if (!this.x || this.s) {
                    return;
                }
                int measuredWidth = this.z.getMeasuredWidth();
                int measuredHeight = this.z.getMeasuredHeight();
                if (measuredWidth == 0 && measuredHeight == 0) {
                    return;
                }
                C0772Fy1 c0772Fy12 = this.V;
                if (c0772Fy12.v == measuredWidth && c0772Fy12.w == measuredHeight) {
                    z2 = false;
                }
                if (z2) {
                    this.z.requestLayout();
                } else {
                    o();
                }
            }
        }
    }

    public final void a() {
        boolean z;
        LK3.a();
        C11703yE1 c11703yE1 = this.z;
        if (c11703yE1 == null) {
            throw new IllegalStateException("Trying to attach a ComponentTree without a set View");
        }
        C2781Vk1 c2781Vk1 = this.k;
        if (c2781Vk1 != null) {
            ComponentTree componentTree = c2781Vk1.a;
            if (componentTree.t) {
                for (ViewParent parent = c11703yE1.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent instanceof ViewPager) {
                        ViewPager viewPager = (ViewPager) parent;
                        C2651Uk1 c2651Uk1 = new C2651Uk1(componentTree, viewPager);
                        try {
                            viewPager.b(c2651Uk1);
                        } catch (ConcurrentModificationException unused) {
                            RunnableC2391Sk1 runnableC2391Sk1 = new RunnableC2391Sk1(viewPager, c2651Uk1);
                            WeakHashMap weakHashMap = Ec4.a;
                            viewPager.postOnAnimation(runnableC2391Sk1);
                        }
                        c2781Vk1.b.add(c2651Uk1);
                    }
                }
            }
        }
        synchronized (this) {
            z = true;
            this.x = true;
            C0772Fy1 c0772Fy1 = this.W;
            if (c0772Fy1 != null && this.V != c0772Fy1) {
                q();
            }
            if (this.N == null) {
                throw new IllegalStateException("Trying to attach a ComponentTree with a null root. Is released: " + this.b + ", Released Component name is: " + this.c);
            }
        }
        int measuredWidth = this.z.getMeasuredWidth();
        int measuredHeight = this.z.getMeasuredHeight();
        if (measuredWidth == 0 && measuredHeight == 0) {
            return;
        }
        C0772Fy1 c0772Fy12 = this.V;
        if (c0772Fy12 != null && c0772Fy12.v == measuredWidth && c0772Fy12.w == measuredHeight) {
            z = false;
        }
        if (z || this.z.v()) {
            this.z.requestLayout();
        } else {
            this.z.G();
        }
    }

    public final boolean o() {
        if (!this.z.v()) {
            C12151zZ1 c12151zZ1 = this.z.E;
            c12151zZ1.getClass();
            LK3.a();
            if (!c12151zZ1.g) {
                if (!this.u) {
                    return false;
                }
                this.z.E.getClass();
                LK3.a();
                this.z.G();
                return false;
            }
        }
        if (this.t) {
            j();
        } else {
            Rect rect = new Rect();
            this.z.getLocalVisibleRect(rect);
            n(rect, true);
        }
        return true;
    }

    public final void j() {
        LK3.a();
        if (!this.t) {
            throw new IllegalStateException("Calling incrementalMountComponent() but incremental mount is not enabled");
        }
        if (this.z == null) {
            return;
        }
        Rect rect = new Rect();
        if (!this.z.getLocalVisibleRect(rect)) {
            if (!(!this.f11494J && ((this.M != null && rect.height() == 0) || (this.L != null && rect.width() == 0)))) {
                return;
            }
        }
        n(rect, true);
    }

    public final void n(Rect rect, boolean z) {
        String str;
        LK3.a();
        if (this.r) {
            K00 k00 = new K00(rect, z);
            ArrayDeque arrayDeque = this.e;
            if (arrayDeque == null) {
                this.e = new ArrayDeque();
            } else if (arrayDeque.size() > 25) {
                C11703yE1 c11703yE1 = this.z;
                if (c11703yE1 != null) {
                    str = LithoViewTestHelper.viewToString(c11703yE1, true);
                    if (TextUtils.isEmpty(str)) {
                        str = "(" + c11703yE1.getLeft() + "," + c11703yE1.getTop() + "-" + c11703yE1.getRight() + "," + c11703yE1.getBottom() + ")";
                    }
                } else {
                    str = null;
                }
                Object obj = this.N;
                if (obj == null) {
                    obj = i();
                }
                E10.a(3, "ComponentTree:ReentrantMountsExceedMaxAttempts", IR0.a("Reentrant mounts exceed max attempts, view=", str, ", component=", String.valueOf(obj)));
                this.e.clear();
                return;
            }
            this.e.add(k00);
            return;
        }
        p(rect, z);
        if (this.e != null) {
            ArrayDeque arrayDeque2 = new ArrayDeque(this.e);
            this.e.clear();
            while (!arrayDeque2.isEmpty()) {
                K00 k002 = (K00) arrayDeque2.pollFirst();
                this.z.J();
                p(k002.a, k002.b);
            }
        }
    }

    public final void p(Rect rect, boolean z) {
        C0772Fy1 c0772Fy1 = this.V;
        if (c0772Fy1 == null) {
            Log.w("ComponentTree", "Main Thread Layout state is not found");
            return;
        }
        boolean v = this.z.v();
        this.r = true;
        if (!this.f11494J) {
            this.K = true;
            this.f11494J = true;
        }
        try {
            try {
                this.z.w(c0772Fy1, rect, z);
                if (v) {
                    r(c0772Fy1);
                }
            } catch (Exception e) {
                if (e instanceof C7586mE1) {
                    throw ((C7586mE1) e);
                }
                throw new C7586mE1(null, this, e);
            }
        } finally {
            this.r = false;
            this.M = null;
            this.L = null;
            if (v) {
                this.z.getClass();
            }
        }
    }

    public final void g() {
        LK3.a();
        C2781Vk1 c2781Vk1 = this.k;
        if (c2781Vk1 != null) {
            ArrayList arrayList = c2781Vk1.b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C2651Uk1 c2651Uk1 = (C2651Uk1) arrayList.get(i);
                c2651Uk1.a.clear();
                ViewPager viewPager = (ViewPager) c2651Uk1.b.get();
                if (viewPager != null) {
                    RunnableC2521Tk1 runnableC2521Tk1 = new RunnableC2521Tk1(c2651Uk1, viewPager);
                    WeakHashMap weakHashMap = Ec4.a;
                    viewPager.postOnAnimation(runnableC2521Tk1);
                }
            }
            arrayList.clear();
        }
        synchronized (this) {
            this.x = false;
        }
    }

    public final void q() {
        C0772Fy1 c0772Fy1 = this.W;
        if (c0772Fy1 == null) {
            throw new RuntimeException("Cannot promote null LayoutState!");
        }
        if (c0772Fy1 == this.V) {
            return;
        }
        this.V = c0772Fy1;
        C11703yE1 c11703yE1 = this.z;
        if (c11703yE1 != null) {
            c11703yE1.J();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005a A[Catch: all -> 0x0158, TryCatch #3 {all -> 0x0158, blocks: (B:5:0x0010, B:7:0x0014, B:9:0x0018, B:11:0x001e, B:12:0x0021, B:14:0x0025, B:16:0x0029, B:19:0x0030, B:21:0x0036, B:23:0x003c, B:30:0x005a, B:39:0x007e, B:83:0x0073), top: B:4:0x0010, outer: #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(int r19, int r20, int[] r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.ComponentTree.m(int, int, int[], boolean):void");
    }

    public final void w(String str, boolean z, boolean z2) {
        C5277fX3 c5277fX3;
        boolean z3 = B10.a;
        synchronized (this) {
            WZ wz = this.N;
            if (wz == null) {
                return;
            }
            WZ k02 = wz.k0();
            C5277fX3 c5277fX32 = this.R;
            if (c5277fX32 == null) {
                c5277fX3 = null;
            } else {
                C5277fX3 c5277fX33 = new C5277fX3();
                synchronized (c5277fX32.a) {
                    c5277fX33.a.putAll(c5277fX32.a);
                }
                c5277fX3 = c5277fX33;
            }
            if (z2) {
                int i = this.g + 1;
                this.g = i;
                if (i == 50) {
                    E10.a(3, "ComponentTree:StateUpdatesWhenLayoutInProgressExceedsThreshold", "State Updates when create layout in progress exceeds threshold");
                }
            }
            v(k02, -1, -1, z, null, z ? 5 : 4, str, c5277fX3, z2, false);
        }
    }

    public final synchronized void e() {
        C0772Fy1 c0772Fy1 = this.W;
        if (c0772Fy1 != null) {
            c0772Fy1.h(this.d0);
        }
        this.d0.a.clear();
    }

    public final void t(WZ wz, int i, int i2, C8753pe3 c8753pe3) {
        if (wz == null) {
            throw new IllegalArgumentException("Root component can't be null");
        }
        u(wz, i, i2, false, c8753pe3, 0, null);
    }

    public C11703yE1 getLithoView() {
        return this.z;
    }

    public final void u(WZ wz, int i, int i2, boolean z, C8753pe3 c8753pe3, int i3, C5277fX3 c5277fX3) {
        v(wz, i, i2, z, c8753pe3, i3, null, c5277fX3, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0084 A[Catch: all -> 0x0046, TryCatch #1 {all -> 0x0046, blocks: (B:4:0x000d, B:6:0x0011, B:13:0x0025, B:14:0x0027, B:21:0x0036, B:23:0x0039, B:38:0x0074, B:42:0x007c, B:44:0x0084, B:52:0x00a6, B:53:0x00ae, B:58:0x00b2, B:60:0x00b6, B:62:0x00ba, B:64:0x00be, B:66:0x00d0, B:67:0x00d7, B:68:0x00d9, B:90:0x00d4, B:91:0x0072, B:92:0x006c, B:93:0x0066, B:101:0x004a, B:102:0x004b, B:104:0x0019, B:107:0x001f, B:109:0x0021, B:110:0x0127, B:111:0x012e, B:16:0x0028, B:18:0x002c), top: B:3:0x000d, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b2 A[Catch: all -> 0x0046, TryCatch #1 {all -> 0x0046, blocks: (B:4:0x000d, B:6:0x0011, B:13:0x0025, B:14:0x0027, B:21:0x0036, B:23:0x0039, B:38:0x0074, B:42:0x007c, B:44:0x0084, B:52:0x00a6, B:53:0x00ae, B:58:0x00b2, B:60:0x00b6, B:62:0x00ba, B:64:0x00be, B:66:0x00d0, B:67:0x00d7, B:68:0x00d9, B:90:0x00d4, B:91:0x0072, B:92:0x006c, B:93:0x0066, B:101:0x004a, B:102:0x004b, B:104:0x0019, B:107:0x001f, B:109:0x0021, B:110:0x0127, B:111:0x012e, B:16:0x0028, B:18:0x002c), top: B:3:0x000d, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b6 A[Catch: all -> 0x0046, TryCatch #1 {all -> 0x0046, blocks: (B:4:0x000d, B:6:0x0011, B:13:0x0025, B:14:0x0027, B:21:0x0036, B:23:0x0039, B:38:0x0074, B:42:0x007c, B:44:0x0084, B:52:0x00a6, B:53:0x00ae, B:58:0x00b2, B:60:0x00b6, B:62:0x00ba, B:64:0x00be, B:66:0x00d0, B:67:0x00d7, B:68:0x00d9, B:90:0x00d4, B:91:0x0072, B:92:0x006c, B:93:0x0066, B:101:0x004a, B:102:0x004b, B:104:0x0019, B:107:0x001f, B:109:0x0021, B:110:0x0127, B:111:0x012e, B:16:0x0028, B:18:0x002c), top: B:3:0x000d, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ba A[Catch: all -> 0x0046, TryCatch #1 {all -> 0x0046, blocks: (B:4:0x000d, B:6:0x0011, B:13:0x0025, B:14:0x0027, B:21:0x0036, B:23:0x0039, B:38:0x0074, B:42:0x007c, B:44:0x0084, B:52:0x00a6, B:53:0x00ae, B:58:0x00b2, B:60:0x00b6, B:62:0x00ba, B:64:0x00be, B:66:0x00d0, B:67:0x00d7, B:68:0x00d9, B:90:0x00d4, B:91:0x0072, B:92:0x006c, B:93:0x0066, B:101:0x004a, B:102:0x004b, B:104:0x0019, B:107:0x001f, B:109:0x0021, B:110:0x0127, B:111:0x012e, B:16:0x0028, B:18:0x002c), top: B:3:0x000d, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00be A[Catch: all -> 0x0046, TryCatch #1 {all -> 0x0046, blocks: (B:4:0x000d, B:6:0x0011, B:13:0x0025, B:14:0x0027, B:21:0x0036, B:23:0x0039, B:38:0x0074, B:42:0x007c, B:44:0x0084, B:52:0x00a6, B:53:0x00ae, B:58:0x00b2, B:60:0x00b6, B:62:0x00ba, B:64:0x00be, B:66:0x00d0, B:67:0x00d7, B:68:0x00d9, B:90:0x00d4, B:91:0x0072, B:92:0x006c, B:93:0x0066, B:101:0x004a, B:102:0x004b, B:104:0x0019, B:107:0x001f, B:109:0x0021, B:110:0x0127, B:111:0x012e, B:16:0x0028, B:18:0x002c), top: B:3:0x000d, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d0 A[Catch: all -> 0x0046, TryCatch #1 {all -> 0x0046, blocks: (B:4:0x000d, B:6:0x0011, B:13:0x0025, B:14:0x0027, B:21:0x0036, B:23:0x0039, B:38:0x0074, B:42:0x007c, B:44:0x0084, B:52:0x00a6, B:53:0x00ae, B:58:0x00b2, B:60:0x00b6, B:62:0x00ba, B:64:0x00be, B:66:0x00d0, B:67:0x00d7, B:68:0x00d9, B:90:0x00d4, B:91:0x0072, B:92:0x006c, B:93:0x0066, B:101:0x004a, B:102:0x004b, B:104:0x0019, B:107:0x001f, B:109:0x0021, B:110:0x0127, B:111:0x012e, B:16:0x0028, B:18:0x002c), top: B:3:0x000d, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00d4 A[Catch: all -> 0x0046, TryCatch #1 {all -> 0x0046, blocks: (B:4:0x000d, B:6:0x0011, B:13:0x0025, B:14:0x0027, B:21:0x0036, B:23:0x0039, B:38:0x0074, B:42:0x007c, B:44:0x0084, B:52:0x00a6, B:53:0x00ae, B:58:0x00b2, B:60:0x00b6, B:62:0x00ba, B:64:0x00be, B:66:0x00d0, B:67:0x00d7, B:68:0x00d9, B:90:0x00d4, B:91:0x0072, B:92:0x006c, B:93:0x0066, B:101:0x004a, B:102:0x004b, B:104:0x0019, B:107:0x001f, B:109:0x0021, B:110:0x0127, B:111:0x012e, B:16:0x0028, B:18:0x002c), top: B:3:0x000d, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0072 A[Catch: all -> 0x0046, TryCatch #1 {all -> 0x0046, blocks: (B:4:0x000d, B:6:0x0011, B:13:0x0025, B:14:0x0027, B:21:0x0036, B:23:0x0039, B:38:0x0074, B:42:0x007c, B:44:0x0084, B:52:0x00a6, B:53:0x00ae, B:58:0x00b2, B:60:0x00b6, B:62:0x00ba, B:64:0x00be, B:66:0x00d0, B:67:0x00d7, B:68:0x00d9, B:90:0x00d4, B:91:0x0072, B:92:0x006c, B:93:0x0066, B:101:0x004a, B:102:0x004b, B:104:0x0019, B:107:0x001f, B:109:0x0021, B:110:0x0127, B:111:0x012e, B:16:0x0028, B:18:0x002c), top: B:3:0x000d, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x006c A[Catch: all -> 0x0046, TryCatch #1 {all -> 0x0046, blocks: (B:4:0x000d, B:6:0x0011, B:13:0x0025, B:14:0x0027, B:21:0x0036, B:23:0x0039, B:38:0x0074, B:42:0x007c, B:44:0x0084, B:52:0x00a6, B:53:0x00ae, B:58:0x00b2, B:60:0x00b6, B:62:0x00ba, B:64:0x00be, B:66:0x00d0, B:67:0x00d7, B:68:0x00d9, B:90:0x00d4, B:91:0x0072, B:92:0x006c, B:93:0x0066, B:101:0x004a, B:102:0x004b, B:104:0x0019, B:107:0x001f, B:109:0x0021, B:110:0x0127, B:111:0x012e, B:16:0x0028, B:18:0x002c), top: B:3:0x000d, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0066 A[Catch: all -> 0x0046, TryCatch #1 {all -> 0x0046, blocks: (B:4:0x000d, B:6:0x0011, B:13:0x0025, B:14:0x0027, B:21:0x0036, B:23:0x0039, B:38:0x0074, B:42:0x007c, B:44:0x0084, B:52:0x00a6, B:53:0x00ae, B:58:0x00b2, B:60:0x00b6, B:62:0x00ba, B:64:0x00be, B:66:0x00d0, B:67:0x00d7, B:68:0x00d9, B:90:0x00d4, B:91:0x0072, B:92:0x006c, B:93:0x0066, B:101:0x004a, B:102:0x004b, B:104:0x0019, B:107:0x001f, B:109:0x0021, B:110:0x0127, B:111:0x012e, B:16:0x0028, B:18:0x002c), top: B:3:0x000d, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(defpackage.WZ r18, int r19, int r20, boolean r21, defpackage.C8753pe3 r22, int r23, java.lang.String r24, defpackage.C5277fX3 r25, boolean r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.ComponentTree.v(WZ, int, int, boolean, pe3, int, java.lang.String, fX3, boolean, boolean):void");
    }

    public static boolean k(C0772Fy1 c0772Fy1, int i, int i2) {
        if (c0772Fy1 == null) {
            return false;
        }
        if (OM1.a(c0772Fy1.e, i, c0772Fy1.v) && OM1.a(c0772Fy1.f, i2, c0772Fy1.w)) {
            return J1.a(c0772Fy1.I) == c0772Fy1.f11443J;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0056 A[Catch: all -> 0x021d, TryCatch #6 {, blocks: (B:10:0x0015, B:12:0x001b, B:16:0x0024, B:19:0x002a, B:21:0x0032, B:23:0x0038, B:30:0x0056, B:37:0x006c, B:38:0x0076, B:41:0x0078, B:42:0x0088, B:184:0x021b), top: B:9:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078 A[Catch: all -> 0x021d, TryCatch #6 {, blocks: (B:10:0x0015, B:12:0x001b, B:16:0x0024, B:19:0x002a, B:21:0x0032, B:23:0x0038, B:30:0x0056, B:37:0x006c, B:38:0x0076, B:41:0x0078, B:42:0x0088, B:184:0x021b), top: B:9:0x0015 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.C8753pe3 r17, int r18, java.lang.String r19, defpackage.C5277fX3 r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 547
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.ComponentTree.c(pe3, int, java.lang.String, fX3, boolean):void");
    }

    public final void r(C0772Fy1 c0772Fy1) {
        ArrayList arrayList = c0772Fy1.L;
        ArrayList arrayList2 = c0772Fy1.M;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (this.Y == null) {
            this.Y = new C8663pN2();
        }
        C8663pN2 c8663pN2 = this.Y;
        c8663pN2.getClass();
        if (arrayList.size() > 0) {
            WZ wz = (WZ) arrayList.get(0);
            wz.getClass();
            throw new RuntimeException("Trying to record previous render data for component that doesn't support it");
        }
        c8663pN2.a.clear();
    }

    public final void s() {
        if (this.r) {
            throw new IllegalStateException("Releasing a ComponentTree that is currently being mounted");
        }
        synchronized (this) {
            this.B.removeCallbacks(this.C);
            synchronized (this.E) {
                G00 g00 = this.F;
                if (g00 != null) {
                    this.A.c(g00);
                    this.F = null;
                }
            }
            synchronized (this.n) {
                L00 l00 = this.o;
                if (l00 != null) {
                    this.A.c(l00);
                    this.o = null;
                }
            }
            synchronized (this.G) {
                for (int i = 0; i < this.I.size(); i++) {
                    try {
                        I00 i00 = (I00) this.I.get(i);
                        synchronized (i00) {
                            if (!i00.n) {
                                i00.n = true;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.I.clear();
            }
            InterfaceC6554jE1 interfaceC6554jE1 = this.q;
            if (interfaceC6554jE1 != null) {
                interfaceC6554jE1.c(this.m);
            }
            this.b = true;
            WZ wz = this.N;
            if (wz != null) {
                this.c = wz.c0();
            }
            C11703yE1 c11703yE1 = this.z;
            if (c11703yE1 != null) {
                c11703yE1.H(null);
            }
            this.N = null;
            e();
            this.V = null;
            this.W = null;
            this.X = null;
            this.Y = null;
            this.j = null;
        }
        synchronized (this.c0) {
            QD0 qd0 = this.c0;
            synchronized (qd0) {
                HashMap hashMap = qd0.a;
                if (hashMap != null) {
                    hashMap.clear();
                }
                HashMap hashMap2 = qd0.b;
                if (hashMap2 != null) {
                    hashMap2.clear();
                }
            }
        }
        if (this.d != null) {
            this.d.b();
        }
    }

    public final synchronized String i() {
        WZ wz;
        wz = this.N;
        return wz == null ? null : wz.c0();
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a3 A[Catch: all -> 0x00d9, TryCatch #13 {all -> 0x00d9, blocks: (B:151:0x00ca, B:139:0x019b, B:141:0x01a3, B:142:0x01a5, B:143:0x01a6, B:144:0x01af), top: B:150:0x00ca }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a6 A[Catch: all -> 0x00d9, TryCatch #13 {all -> 0x00d9, blocks: (B:151:0x00ca, B:139:0x019b, B:141:0x01a3, B:142:0x01a5, B:143:0x01a6, B:144:0x01af), top: B:150:0x00ca }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00ed A[Catch: all -> 0x0195, CancellationException -> 0x0197, ExecutionException -> 0x0199, TRY_LEAVE, TryCatch #13 {CancellationException -> 0x0197, ExecutionException -> 0x0199, all -> 0x0195, blocks: (B:94:0x00e3, B:96:0x00ed, B:134:0x00f4, B:98:0x00f7, B:100:0x00fb, B:102:0x00ff, B:115:0x010f, B:106:0x0105, B:111:0x010c), top: B:93:0x00e3, inners: #3, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.C0772Fy1 d(defpackage.C7849n00 r15, defpackage.WZ r16, int r17, int r18, int r19, boolean r20, defpackage.C5277fX3 r21, int r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.ComponentTree.d(n00, WZ, int, int, int, boolean, fX3, int, java.lang.String):Fy1");
    }
}
