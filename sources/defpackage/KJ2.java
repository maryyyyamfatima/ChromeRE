package defpackage;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.litho.ComponentTree;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class KJ2 implements InterfaceC2194Qx, InterfaceC3366Zx1, InterfaceC5480g61 {
    public static final C8753pe3 o0 = new C8753pe3();
    public static final Rect p0 = new Rect();
    public static final String q0 = KJ2.class.getSimpleName();
    public static final WI2 r0 = new WI2();
    public final boolean B;
    public final YI2 K;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public boolean Q;
    public C8753pe3 T;
    public RecyclerView U;
    public int X;
    public int Y;
    public int Z;
    public volatile C8753pe3 a0;
    public C3646am3 b0;
    public final InterfaceC9671sJ2 c;
    public final C11049wK3 c0;
    public final InterfaceC4058by1 d;
    public C6206iD0 d0;
    public final C7849n00 f;
    public final WI2 g;
    public final int i;
    public final float j;
    public final C4292cf4 j0;
    public int l0;
    public final boolean m;
    public final C8320oN2 m0;
    public final int n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final List r;
    public final InterfaceC4867eK2 s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final Handler h = new Handler(Looper.getMainLooper());
    public final AtomicBoolean k = new AtomicBoolean(false);
    public final AtomicBoolean l = new AtomicBoolean(false);
    public final AtomicLong A = new AtomicLong(-1);
    public final ArrayDeque C = new ArrayDeque();
    public final AtomicBoolean D = new AtomicBoolean(false);
    public final AtomicBoolean E = new AtomicBoolean(false);
    public final ArrayDeque F = new ArrayDeque();
    public final RunnableC5206fJ2 G = new RunnableC5206fJ2(this);
    public final C5894hJ2 H = new C5894hJ2(this);
    public final ViewTreeObserverOnPreDrawListenerC6238iJ2 I = new ViewTreeObserverOnPreDrawListenerC6238iJ2(this);

    /* renamed from: J */
    public final RunnableC6580jJ2 f11451J = new RunnableC6580jJ2(this);
    public final C7268lJ2 L = new C7268lJ2(this);
    public final C7612mJ2 M = new C7612mJ2(this);
    public int R = -1;
    public int S = -1;
    public int V = -1;
    public int W = -1;
    public volatile boolean e0 = false;
    public boolean f0 = false;
    public int g0 = 0;
    public boolean h0 = false;
    public C10014tJ2 i0 = null;
    public final C7956nJ2 k0 = new C7956nJ2(this);
    public final RunnableC8300oJ2 n0 = new RunnableC8300oJ2(this);
    public final HJ2 e = new HJ2(this);

    @Override // defpackage.InterfaceC2194Qx
    public final /* bridge */ /* synthetic */ void t(C8617pE1 c8617pE1) {
    }

    @Override // defpackage.InterfaceC2194Qx
    public final /* bridge */ /* synthetic */ void u(C8617pE1 c8617pE1) {
    }

    public static void Y(O00 o00, boolean z) {
        boolean z2;
        synchronized (o00) {
            z2 = o00.n;
        }
        if (z2) {
            Object l = o00.u.l("prevent_release");
            if ((l instanceof Boolean ? ((Boolean) l).booleanValue() : false) || o00.f().p() || o00.e() == null || o00.e().getLithoView() != null) {
                return;
            }
            o00.a(z);
        }
    }

    @Override // defpackage.InterfaceC2194Qx
    public final boolean e() {
        return this.P;
    }

    @Override // defpackage.InterfaceC2194Qx
    public final boolean j() {
        return this.Q;
    }

    @Override // defpackage.InterfaceC2194Qx
    public final void c() {
        ArrayList arrayList;
        if (LK3.b()) {
            ArrayList arrayList2 = this.a;
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                ((O00) arrayList2.get(i)).i();
            }
            return;
        }
        synchronized (this) {
            arrayList = new ArrayList(this.a);
        }
        this.h.post(new XI2(arrayList));
    }

    public KJ2(CJ2 cj2) {
        this.Z = -1;
        this.f = cj2.d;
        this.g = cj2.c;
        this.m = cj2.j;
        this.c = cj2.v;
        boolean z = cj2.w;
        this.q = z;
        this.i = z ? 0 : -1;
        this.j = cj2.a;
        InterfaceC4058by1 interfaceC4058by1 = cj2.b;
        this.d = interfaceC4058by1;
        this.p = cj2.u;
        cj2.getClass();
        boolean z2 = B10.a;
        this.c0 = null;
        boolean z3 = cj2.h;
        this.m0 = new C8320oN2(z3 ? cj2.i : 0, z3);
        this.N = cj2.e;
        boolean z4 = interfaceC4058by1.p() == 0 ? cj2.f : false;
        this.O = z4;
        this.K = z4 ? new YI2(this) : null;
        this.P = cj2.g;
        this.Q = false;
        AbstractC12077zK2 q = interfaceC4058by1.q();
        boolean z5 = q instanceof LinearLayoutManager ? ((LinearLayoutManager) q).v : false;
        AbstractC12077zK2 q2 = interfaceC4058by1.q();
        boolean z6 = z5 ^ (q2 instanceof LinearLayoutManager ? ((LinearLayoutManager) q2).t : false);
        this.B = z6;
        if (z6) {
            this.s = InterfaceC4867eK2.b;
        } else {
            this.s = InterfaceC4867eK2.a;
        }
        this.j0 = new C4292cf4(this.V, this.W, cj2.b);
        this.r = cj2.k;
        int i = cj2.p;
        if (i != -1) {
            this.Z = i;
            this.x = true;
        } else {
            this.x = false;
        }
        this.t = cj2.l;
        this.u = cj2.m;
        this.o = cj2.t;
        this.v = cj2.n;
        this.w = cj2.o;
        this.y = cj2.q;
        this.z = cj2.r;
        this.n = cj2.s;
    }

    public final void K() {
        if (!LK3.b()) {
            ((C3839bL) C3839bL.a()).b(this.M);
            return;
        }
        A(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c2, code lost:            z(r0);     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A(int r8) {
        /*
            r7 = this;
            java.lang.String r0 = ", isSubAdapter: false, isAttachedToWindow: "
            java.lang.String r1 = "Too many retries -- RecyclerView is stuck in layout. Batch size: "
            defpackage.LK3.a()
            java.util.concurrent.atomic.AtomicBoolean r2 = r7.D     // Catch: java.lang.Throwable -> L2b
            boolean r2 = r2.get()     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto Lcc
            java.util.concurrent.atomic.AtomicBoolean r2 = r7.k     // Catch: java.lang.Throwable -> L2b
            boolean r2 = r2.get()     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto Lcc
            java.util.concurrent.atomic.AtomicBoolean r2 = r7.E     // Catch: java.lang.Throwable -> L2b
            boolean r2 = r2.get()     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L21
            goto Lcc
        L21:
            androidx.recyclerview.widget.RecyclerView r2 = r7.U     // Catch: java.lang.Throwable -> L2b
            r3 = 0
            if (r2 == 0) goto L2e
            boolean r2 = r2.S()     // Catch: java.lang.Throwable -> L2b
            goto L2f
        L2b:
            r8 = move-exception
            goto Lcd
        L2e:
            r2 = r3
        L2f:
            if (r2 == 0) goto L70
            r2 = 100
            if (r8 <= r2) goto L61
            androidx.recyclerview.widget.RecyclerView r8 = r7.U     // Catch: java.lang.Throwable -> L2b
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L2b
            java.util.ArrayDeque r3 = r7.C     // Catch: java.lang.Throwable -> L2b
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L2b
            if (r8 == 0) goto L4a
            boolean r8 = r8.isAttachedToWindow()     // Catch: java.lang.Throwable -> L2b
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch: java.lang.Throwable -> L2b
            goto L4b
        L4a:
            r8 = 0
        L4b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L2b
            r4.append(r3)     // Catch: java.lang.Throwable -> L2b
            r4.append(r0)     // Catch: java.lang.Throwable -> L2b
            r4.append(r8)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r8 = r4.toString()     // Catch: java.lang.Throwable -> L2b
            r2.<init>(r8)     // Catch: java.lang.Throwable -> L2b
            throw r2     // Catch: java.lang.Throwable -> L2b
        L61:
            ZK r0 = defpackage.C3839bL.a()     // Catch: java.lang.Throwable -> L2b
            ZI2 r1 = new ZI2     // Catch: java.lang.Throwable -> L2b
            r1.<init>(r7, r8)     // Catch: java.lang.Throwable -> L2b
            bL r0 = (defpackage.C3839bL) r0     // Catch: java.lang.Throwable -> L2b
            r0.b(r1)     // Catch: java.lang.Throwable -> L2b
            return
        L70:
            r8 = r3
        L71:
            monitor-enter(r7)     // Catch: java.lang.Throwable -> L2b
            java.util.ArrayDeque r0 = r7.C     // Catch: java.lang.Throwable -> Lc9
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> Lc9
            if (r0 == 0) goto L81
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.D     // Catch: java.lang.Throwable -> Lc9
            r0.set(r3)     // Catch: java.lang.Throwable -> Lc9
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lc9
            goto Lb4
        L81:
            java.util.ArrayDeque r0 = r7.C     // Catch: java.lang.Throwable -> Lc9
            java.lang.Object r0 = r0.peekFirst()     // Catch: java.lang.Throwable -> Lc9
            tJ2 r0 = (defpackage.C10014tJ2) r0     // Catch: java.lang.Throwable -> Lc9
            int r1 = r0.d     // Catch: java.lang.Throwable -> Lc9
            if (r1 != 0) goto L8e
            goto Lb0
        L8e:
            java.util.ArrayList r1 = r0.a     // Catch: java.lang.Throwable -> Lc9
            int r2 = r1.size()     // Catch: java.lang.Throwable -> Lc9
            r4 = r3
        L95:
            if (r4 >= r2) goto Lb0
            java.lang.Object r5 = r1.get(r4)     // Catch: java.lang.Throwable -> Lc9
            wJ2 r5 = (defpackage.AbstractC11043wJ2) r5     // Catch: java.lang.Throwable -> Lc9
            boolean r6 = r5 instanceof defpackage.C10357uJ2     // Catch: java.lang.Throwable -> Lc9
            if (r6 == 0) goto Lad
            uJ2 r5 = (defpackage.C10357uJ2) r5     // Catch: java.lang.Throwable -> Lc9
            O00 r5 = r5.c     // Catch: java.lang.Throwable -> Lc9
            boolean r5 = r5.g()     // Catch: java.lang.Throwable -> Lc9
            if (r5 != 0) goto Lad
            r1 = r3
            goto Lb1
        Lad:
            int r4 = r4 + 1
            goto L95
        Lb0:
            r1 = 1
        Lb1:
            if (r1 != 0) goto Lbc
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lc9
        Lb4:
            if (r8 == 0) goto Lbb
            int r8 = defpackage.AbstractC10331uE1.a     // Catch: java.lang.Throwable -> L2b
            r7.d0()     // Catch: java.lang.Throwable -> L2b
        Lbb:
            return
        Lbc:
            java.util.ArrayDeque r1 = r7.C     // Catch: java.lang.Throwable -> Lc9
            r1.pollFirst()     // Catch: java.lang.Throwable -> Lc9
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lc9
            r7.z(r0)     // Catch: java.lang.Throwable -> L2b
            boolean r0 = r0.b     // Catch: java.lang.Throwable -> L2b
            r8 = r8 | r0
            goto L71
        Lc9:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lc9
            throw r8     // Catch: java.lang.Throwable -> L2b
        Lcc:
            return
        Lcd:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.KJ2.A(int):void");
    }

    public final void z(C10014tJ2 c10014tJ2) {
        synchronized (this) {
            int size = c10014tJ2.a.size();
            for (int i = 0; i < size; i++) {
                AbstractC11043wJ2 abstractC11043wJ2 = (AbstractC11043wJ2) c10014tJ2.a.get(i);
                int i2 = abstractC11043wJ2.a;
                if (i2 == 0) {
                    y((C10357uJ2) abstractC11043wJ2);
                } else if (i2 == 1) {
                    C12072zJ2 c12072zJ2 = (C12072zJ2) abstractC11043wJ2;
                    n0(c12072zJ2.b, c12072zJ2.c);
                } else if (i2 == 2) {
                    AJ2 aj2 = (AJ2) abstractC11043wJ2;
                    o0(aj2.b, aj2.c);
                } else if (i2 == 3) {
                    i0(((C11386xJ2) abstractC11043wJ2).b);
                } else if (i2 == 4) {
                    C11729yJ2 c11729yJ2 = (C11729yJ2) abstractC11043wJ2;
                    j0(c11729yJ2.b, c11729yJ2.c);
                } else if (i2 == 5) {
                    C10700vJ2 c10700vJ2 = (C10700vJ2) abstractC11043wJ2;
                    f0(c10700vJ2.b, c10700vJ2.c);
                } else {
                    throw new RuntimeException("Unhandled operation type: " + abstractC11043wJ2.a);
                }
            }
        }
        C10259u13 c10259u13 = c10014tJ2.c;
        c10259u13.c.getClass();
        if (c10259u13.a) {
            Y03 y03 = c10259u13.b;
            LK3.a();
            if (y03 != null) {
                A13.i(y03);
            }
        }
        this.F.addLast(c10014tJ2.c);
        Z();
    }

    public final void y(C10357uJ2 c10357uJ2) {
        boolean z;
        O00 o00 = c10357uJ2.c;
        synchronized (o00) {
            z = o00.p;
        }
        if (z) {
            return;
        }
        boolean z2 = D13.a;
        this.m0.a(c10357uJ2.c.f());
        this.a.add(c10357uJ2.b, c10357uJ2.c);
        O00 o002 = c10357uJ2.c;
        synchronized (o002) {
            o002.p = true;
        }
        HJ2 hj2 = this.e;
        hj2.a.e(c10357uJ2.b, 1);
        this.j0.a(c10357uJ2.b, this.Z);
    }

    public final void h0(C10357uJ2 c10357uJ2) {
        x(c10357uJ2);
        O00 o00 = c10357uJ2.c;
        C7268lJ2 c7268lJ2 = this.L;
        synchronized (o00) {
            ComponentTree componentTree = o00.s;
            if (componentTree == null) {
                o00.v = c7268lJ2;
            } else {
                componentTree.D = c7268lJ2;
            }
        }
        if (W()) {
            G(o00);
        }
    }

    public final void x(AbstractC11043wJ2 abstractC11043wJ2) {
        if (this.i0 == null) {
            this.i0 = new C10014tJ2(this.g0);
        }
        this.i0.a.add(abstractC11043wJ2);
    }

    public final C8753pe3 R(int i, int i2, boolean z) {
        int size;
        C8753pe3 c8753pe3 = new C8753pe3();
        int p = this.d.p();
        int i3 = 0;
        boolean z2 = !(p != 1 ? View.MeasureSpec.getMode(i2) == 1073741824 : View.MeasureSpec.getMode(i) == 1073741824) && z;
        if (p != 1) {
            int size2 = View.MeasureSpec.getSize(i);
            if (!z2) {
                i3 = View.MeasureSpec.getSize(i2);
            } else if (this.a0 != null) {
                i3 = this.a0.b;
            }
            size = i3;
            i3 = size2;
        } else {
            size = View.MeasureSpec.getSize(i2);
            if (!z2) {
                i3 = View.MeasureSpec.getSize(i);
            } else if (this.a0 != null) {
                i3 = this.a0.a;
            }
        }
        c8753pe3.a = i3;
        c8753pe3.b = size;
        return c8753pe3;
    }

    public final void k0() {
        boolean z = D13.a;
        RecyclerView recyclerView = this.U;
        Handler handler = this.h;
        RunnableC5206fJ2 runnableC5206fJ2 = this.G;
        if (recyclerView != null) {
            handler.removeCallbacks(runnableC5206fJ2);
            this.U.removeCallbacks(runnableC5206fJ2);
            RecyclerView recyclerView2 = this.U;
            WeakHashMap weakHashMap = Ec4.a;
            recyclerView2.postOnAnimation(runnableC5206fJ2);
            return;
        }
        handler.removeCallbacks(runnableC5206fJ2);
        handler.post(runnableC5206fJ2);
    }

    public final void U(int i, ArrayList arrayList) {
        LK3.a();
        B();
        if (D13.a) {
            String[] strArr = new String[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                strArr[i2] = ((InterfaceC7976nN2) arrayList.get(i2)).getName();
            }
            arrayList.size();
            Arrays.toString(strArr);
        }
        synchronized (this) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                InterfaceC7976nN2 interfaceC7976nN2 = (InterfaceC7976nN2) arrayList.get(i3);
                D(interfaceC7976nN2);
                O00 J2 = J(interfaceC7976nN2);
                if (this.e0) {
                    throw new RuntimeException("Trying to do a sync insert when using asynchronous mutations!");
                }
                this.a.add(i + i3, J2);
                this.m0.a(interfaceC7976nN2);
            }
        }
        this.e.y(i, arrayList.size());
        C4292cf4 c4292cf4 = this.j0;
        arrayList.size();
        c4292cf4.c(c4292cf4.a(i, this.Z));
    }

    public final void n0(int i, InterfaceC7976nN2 interfaceC7976nN2) {
        boolean g;
        boolean z;
        LK3.a();
        if (D13.a) {
            interfaceC7976nN2.getName();
        }
        synchronized (this) {
            O00 o00 = (O00) this.a.get(i);
            g = o00.f().g();
            D(interfaceC7976nN2);
            this.m0.a(interfaceC7976nN2);
            o00.f();
            synchronized (o00) {
                synchronized (o00) {
                    z = false;
                    o00.n = false;
                }
            }
            o00.u = interfaceC7976nN2;
        }
        if (g || interfaceC7976nN2.g()) {
            this.e.v(i);
        }
        C4292cf4 c4292cf4 = this.j0;
        if (!c4292cf4.d()) {
            for (int i2 = i; i2 < i + 1; i2++) {
                if (c4292cf4.a > i2 || i2 > c4292cf4.b) {
                }
            }
            c4292cf4.c(z);
        }
        z = true;
        c4292cf4.c(z);
    }

    public final void o0(int i, List list) {
        LK3.a();
        boolean z = false;
        if (D13.a) {
            String[] strArr = new String[list.size()];
            for (int i2 = 0; i2 < list.size(); i2++) {
                strArr[i2] = ((InterfaceC7976nN2) list.get(i2)).getName();
            }
            list.size();
            Arrays.toString(strArr);
        }
        synchronized (this) {
            try {
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    int i4 = i + i3;
                    O00 o00 = (O00) this.a.get(i4);
                    InterfaceC7976nN2 interfaceC7976nN2 = (InterfaceC7976nN2) list.get(i3);
                    D(interfaceC7976nN2);
                    if (interfaceC7976nN2.g() || o00.f().g()) {
                        this.e.v(i4);
                    }
                    this.m0.a(interfaceC7976nN2);
                    o00.f();
                    synchronized (o00) {
                        synchronized (o00) {
                            o00.n = false;
                        }
                    }
                    o00.u = interfaceC7976nN2;
                }
            } catch (IndexOutOfBoundsException e) {
                String[] strArr2 = new String[list.size()];
                for (int i5 = 0; i5 < list.size(); i5++) {
                    strArr2[i5] = ((InterfaceC7976nN2) list.get(i5)).getName();
                }
                throw new IndexOutOfBoundsException(("(" + hashCode() + ") updateRangeAt " + i + ", size: " + list.size() + ", names: " + Arrays.toString(strArr2)) + e.getMessage());
            }
        }
        C4292cf4 c4292cf4 = this.j0;
        int size2 = list.size();
        if (!c4292cf4.d()) {
            for (int i6 = i; i6 < i + size2; i6++) {
                if (c4292cf4.a > i6 || i6 > c4292cf4.b) {
                }
            }
            c4292cf4.c(z);
        }
        z = true;
        c4292cf4.c(z);
    }

    public final void f0(int i, int i2) {
        O00 o00;
        boolean z;
        boolean z2;
        boolean z3;
        LK3.a();
        boolean z4 = D13.a;
        synchronized (this) {
            o00 = (O00) this.a.remove(i);
            this.a.add(i2, o00);
            int i3 = this.Z;
            z = true;
            if (i3 != -1) {
                float f = i2;
                int i4 = this.V;
                float f2 = i3 * this.j;
                if (f >= i4 - f2 && f <= f2 + i4 + i3) {
                    z2 = true;
                }
            }
            z2 = false;
        }
        synchronized (o00) {
            z3 = o00.n;
        }
        if (z3 && !z2) {
            o00.a(this.p);
        }
        this.e.w(i, i2);
        C4292cf4 c4292cf4 = this.j0;
        int i5 = this.Z;
        if (!c4292cf4.d() && i5 != -1) {
            int i6 = c4292cf4.a;
            boolean z5 = i2 >= i6 && i2 <= (i6 + i5) - 1;
            boolean z6 = i >= i6 && i <= (i6 + i5) - 1;
            if (!z5 && !z6) {
                z = false;
            }
        }
        c4292cf4.c(z);
    }

    public final void i0(int i) {
        O00 o00;
        LK3.a();
        boolean z = true;
        C(1);
        boolean z2 = D13.a;
        synchronized (this) {
            o00 = (O00) this.a.remove(i);
        }
        this.e.a.f(i, 1);
        C4292cf4 c4292cf4 = this.j0;
        if (!c4292cf4.d() && i > c4292cf4.b) {
            z = false;
        }
        c4292cf4.c(z);
        this.h.post(new RunnableC3488aJ2(o00));
    }

    public final void j0(int i, int i2) {
        LK3.a();
        C(i2);
        boolean z = D13.a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            for (int i3 = 0; i3 < i2; i3++) {
                arrayList.add((O00) this.a.remove(i));
            }
        }
        this.e.z(i, i2);
        C4292cf4 c4292cf4 = this.j0;
        boolean z2 = true;
        if (!c4292cf4.d()) {
            z2 = i <= c4292cf4.b;
        }
        c4292cf4.c(z2);
        this.h.post(new XI2(arrayList));
    }

    public final void g0(boolean z, C10259u13 c10259u13) {
        try {
            boolean z2 = D13.a;
            LK3.a();
            if (this.e0) {
                throw new RuntimeException("Trying to do a sync notifyChangeSetComplete when using asynchronous mutations!");
            }
            if (c10259u13 != null) {
                c10259u13.c.getClass();
                if (c10259u13.a) {
                    Y03 y03 = c10259u13.b;
                    LK3.a();
                    if (y03 != null) {
                        A13.i(y03);
                    }
                }
                this.F.addLast(c10259u13);
            }
            Z();
            if (z) {
                int i = AbstractC10331uE1.a;
                d0();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void a0() {
        if (!this.t || this.h0) {
            return;
        }
        this.g0 = 1;
        if (LK3.b()) {
            A(0);
        } else {
            if (!this.a.isEmpty()) {
                C8753pe3 c8753pe3 = this.T;
                L(c8753pe3.a, c8753pe3.b, null);
            } else {
                ArrayDeque arrayDeque = this.C;
                if (!arrayDeque.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((C10014tJ2) arrayDeque.getFirst()).a.iterator();
                    while (it.hasNext()) {
                        AbstractC11043wJ2 abstractC11043wJ2 = (AbstractC11043wJ2) it.next();
                        if (abstractC11043wJ2 instanceof C10357uJ2) {
                            arrayList.add(((C10357uJ2) abstractC11043wJ2).c);
                        }
                    }
                    C8753pe3 c8753pe32 = this.T;
                    H(arrayList, 0, c8753pe32.a, c8753pe32.b, null);
                }
            }
            ((C3839bL) C3839bL.a()).b(this.M);
        }
        this.h0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Z() {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.KJ2.Z():void");
    }

    public final synchronized void F(boolean z, C10259u13 c10259u13) {
        if (this.i0 == null) {
            this.i0 = new C10014tJ2(this.g0);
        }
        C10014tJ2 c10014tJ2 = this.i0;
        c10014tJ2.b = z;
        c10014tJ2.c = c10259u13;
        this.C.addLast(c10014tJ2);
        this.D.set(true);
        this.i0 = null;
    }

    public final void d0() {
        ArrayList arrayList;
        int M;
        if (this.k.get()) {
            boolean z = this.l.get();
            boolean z2 = this.P;
            if (z || z2) {
                C8753pe3 c8753pe3 = this.T;
                if (c8753pe3.a == 0 || c8753pe3.b == 0) {
                    k0();
                } else {
                    C8753pe3 R = R(this.R, this.S, true);
                    C8753pe3 c8753pe32 = new C8753pe3();
                    L(R.a, R.b, c8753pe32);
                    int i = c8753pe32.a;
                    C8753pe3 c8753pe33 = this.T;
                    if (i != c8753pe33.a || c8753pe32.b != c8753pe33.b) {
                        k0();
                    }
                }
                if (!z2) {
                    return;
                }
            }
            if (!S() && (M = M((arrayList = this.a), this.B)) >= 0) {
                EJ2 ej2 = new EJ2(M, arrayList);
                C8753pe3 c8753pe34 = this.T;
                T(c8753pe34.a, c8753pe34.b, ej2, this.d.p());
            }
            b0();
        }
    }

    public final void E() {
        if (B10.a || B10.b) {
            long id = Thread.currentThread().getId();
            long andSet = this.A.getAndSet(id);
            if (id == andSet || andSet == -1) {
                return;
            }
            throw new IllegalStateException("Multiple threads applying change sets at once! (" + andSet + " and " + id + ")");
        }
    }

    public final synchronized ComponentTree P(int i) {
        O00 o00 = (O00) this.a.get(i);
        int O = O(o00);
        int N = N(o00);
        if (o00.h(O, N)) {
            return o00.e();
        }
        o00.c(this.f, O, N, null);
        return o00.e();
    }

    public static void D(InterfaceC7976nN2 interfaceC7976nN2) {
        if (interfaceC7976nN2 == null) {
            throw new RuntimeException("Received null RenderInfo to insert/update!");
        }
    }

    @Override // defpackage.InterfaceC2194Qx
    public final void h(C8753pe3 c8753pe3, int i, int i2, C6206iD0 c6206iD0) {
        EJ2 Q;
        boolean z;
        boolean z2 = c6206iD0 != null;
        int p = this.d.p();
        if (p != 0) {
            if (p != 1) {
                throw new UnsupportedOperationException("The orientation defined by LayoutInfo should be either OrientationHelper.HORIZONTAL or OrientationHelper.VERTICAL");
            }
            if (View.MeasureSpec.getMode(i2) == 0) {
                throw new IllegalStateException("Height mode has to be EXACTLY OR AT MOST for a vertical scrolling RecyclerView");
            }
            if (!z2 && View.MeasureSpec.getMode(i) == 0) {
                throw new IllegalStateException("Can't use Unspecified width on a vertical scrolling Recycler if dynamic measurement is not allowed");
            }
        } else {
            if (View.MeasureSpec.getMode(i) == 0) {
                throw new IllegalStateException("Width mode has to be EXACTLY OR AT MOST for an horizontal scrolling RecyclerView");
            }
            if (!z2 && View.MeasureSpec.getMode(i2) == 0) {
                throw new IllegalStateException("Can't use Unspecified height on an horizontal scrolling Recycler if dynamic measurement is not allowed");
            }
        }
        boolean z3 = !(p != 1 ? View.MeasureSpec.getMode(i2) == 1073741824 : View.MeasureSpec.getMode(i) == 1073741824) && z2;
        if (this.x && z3) {
            throw new RuntimeException("Cannot use manual estimated viewport count when the RecyclerBinder needs an item to determine its size!");
        }
        this.E.set(true);
        try {
            synchronized (this) {
                try {
                    if (this.R != -1 && !this.l.get() && !this.P) {
                        if (p != 1) {
                            if (OM1.a(this.S, i2, this.T.b)) {
                                c8753pe3.a = this.P ? this.T.a : View.MeasureSpec.getSize(i);
                                c8753pe3.b = this.T.b;
                                if (z) {
                                    return;
                                } else {
                                    return;
                                }
                            }
                        } else if (OM1.a(this.R, i, this.T.a)) {
                            C8753pe3 c8753pe32 = this.T;
                            c8753pe3.a = c8753pe32.a;
                            c8753pe3.b = this.P ? c8753pe32.b : View.MeasureSpec.getSize(i2);
                            this.E.set(false);
                            if (this.e0) {
                                K();
                                return;
                            }
                            return;
                        }
                        this.k.set(false);
                        V();
                    }
                    this.R = i;
                    this.S = i2;
                    if (!S() && (Q = Q()) != null) {
                        T(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2), Q, p);
                    }
                    C8753pe3 R = R(i, i2, z2);
                    if (p != 1) {
                        if (z3 && this.a0 == null) {
                            this.d0 = c6206iD0;
                            this.l.set(!this.P);
                        }
                        boolean z4 = this.O;
                        if (!z4 && !this.P) {
                            c6206iD0 = null;
                        }
                        this.d0 = c6206iD0;
                        this.l.set(z4);
                    } else {
                        if (z3 && this.a0 == null) {
                            this.d0 = c6206iD0;
                            this.l.set(!this.P);
                        }
                        if (!this.P) {
                            c6206iD0 = null;
                        }
                        this.d0 = c6206iD0;
                    }
                    if (this.P) {
                        C8753pe3 c8753pe33 = new C8753pe3();
                        L(R.a, R.b, c8753pe33);
                        c8753pe3.a = c8753pe33.a;
                        c8753pe3.b = c8753pe33.b;
                    } else {
                        c8753pe3.a = R.a;
                        c8753pe3.b = R.b;
                    }
                    this.T = new C8753pe3(c8753pe3.a, c8753pe3.b);
                    this.k.set(true);
                    a0();
                    Iterator it = this.C.iterator();
                    while (it.hasNext()) {
                        m0((C10014tJ2) it.next());
                    }
                    C10014tJ2 c10014tJ2 = this.i0;
                    if (c10014tJ2 != null) {
                        m0(c10014tJ2);
                    }
                    if (this.Z != -1) {
                        I(this.V, this.W, this.s);
                    }
                    this.E.set(false);
                    if (this.e0) {
                        K();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
            this.E.set(false);
            if (this.e0) {
                K();
            }
        }
    }

    public final boolean W() {
        return this.k.get() && !this.l.get();
    }

    public final void L(int i, int i2, C8753pe3 c8753pe3) {
        EJ2 Q;
        boolean z = this.P;
        InterfaceC4058by1 interfaceC4058by1 = this.d;
        int g = z ? 0 : interfaceC4058by1.g();
        H(this.a, g != -1 ? g : 0, i, i2, c8753pe3);
        if (S() || (Q = Q()) == null) {
            return;
        }
        T(i, i2, Q, interfaceC4058by1.p());
    }

    public final void H(ArrayList arrayList, int i, int i2, int i3, C8753pe3 c8753pe3) {
        InterfaceC4058by1 interfaceC4058by1 = this.d;
        InterfaceC3715ay1 i4 = interfaceC4058by1.i(i2, i3);
        if (i4 == null) {
            return;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        C8753pe3 c8753pe32 = new C8753pe3();
        while (i4.a() && i < arrayList.size()) {
            O00 o00 = (O00) arrayList.get(i);
            InterfaceC7976nN2 f = o00.f();
            if (f.g()) {
                break;
            }
            o00.c(this.f, interfaceC4058by1.k(makeMeasureSpec, f), interfaceC4058by1.d(makeMeasureSpec2, f), c8753pe32);
            i4.b(f, c8753pe32.a, c8753pe32.b);
            i++;
        }
        if (c8753pe3 != null) {
            int c = i4.c();
            if (interfaceC4058by1.p() == 1) {
                c8753pe3.a = i2;
                c8753pe3.b = Math.min(c, i3);
            } else {
                c8753pe3.a = Math.min(c, i2);
                c8753pe3.b = i3;
            }
        }
        arrayList.size();
        boolean z = D13.a;
    }

    public final void m0(C10014tJ2 c10014tJ2) {
        Iterator it = c10014tJ2.a.iterator();
        while (it.hasNext()) {
            AbstractC11043wJ2 abstractC11043wJ2 = (AbstractC11043wJ2) it.next();
            if (abstractC11043wJ2 instanceof C10357uJ2) {
                G(((C10357uJ2) abstractC11043wJ2).c);
            }
        }
    }

    public final void G(O00 o00) {
        int O = O(o00);
        int N = N(o00);
        if (!o00.h(O, N)) {
            o00.b(this.f, O, N, null);
        } else if (o00.g()) {
            ComponentTree e = o00.e();
            if (e.D != null) {
                e.D = null;
            }
        }
    }

    public static int M(List list, boolean z) {
        if (z) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (((O00) list.get(size)).f().b()) {
                    return size;
                }
            }
            return -1;
        }
        int size2 = list.size();
        for (int i = 0; i < size2; i++) {
            if (((O00) list.get(i)).f().b()) {
                return i;
            }
        }
        return -1;
    }

    public final void B() {
        if (this.N && !this.a.isEmpty()) {
            throw new UnsupportedOperationException("Circular lists do not support insert operation");
        }
    }

    public final void C(int i) {
        if (this.N) {
            ArrayList arrayList = this.a;
            if (!arrayList.isEmpty() && arrayList.size() != i) {
                throw new UnsupportedOperationException("Circular lists do not support insert operation");
            }
        }
    }

    public final void V() {
        if (!this.x) {
            this.Z = -1;
        }
        this.a0 = null;
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            O00 o00 = (O00) this.a.get(i);
            synchronized (o00) {
                o00.n = false;
            }
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            RecyclerView recyclerView = this.U;
            if (!(recyclerView != null ? recyclerView.S() : false)) {
                this.e.t();
                return;
            }
        }
        this.h.removeCallbacks(this.f11451J);
        this.h.post(this.f11451J);
    }

    public final void c0(DJ2 dj2) {
        O00 next = dj2.next();
        ArrayList arrayList = this.a;
        if (arrayList == null || arrayList.isEmpty() || next == null || this.Z != -1) {
            return;
        }
        int O = O(next);
        int N = N(next);
        if (next.h(O, N)) {
            return;
        }
        next.b(this.f, O, N, new C4175cJ2(this, dj2, next));
    }

    public final void T(int i, int i2, EJ2 ej2, int i3) {
        C5524gE1 d;
        String o;
        InterfaceC9173qr2 b;
        C8753pe3 c8753pe3;
        if (this.x) {
            return;
        }
        int i4 = AbstractC10331uE1.a;
        DJ2 dj2 = new DJ2(ej2.b, ej2.a, this.a.size() - 1, this.B);
        ArrayList arrayList = this.a;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i5 = 0; i5 < 1; i5++) {
                c0(dj2);
            }
        }
        O00 o00 = (O00) ej2.b.get(ej2.a);
        int O = O(o00);
        int N = N(o00);
        if (this.f.e() != null) {
            d = this.f.e();
            o = this.f.d();
        } else {
            d = o00.f().d();
            o = o00.f().o();
        }
        if (d == null) {
            b = null;
        } else {
            C7849n00 c7849n00 = this.f;
            b = VH1.b(d, o, d.b(c7849n00, 20), c7849n00.g());
        }
        try {
            if (this.i > 0 && LK3.b()) {
                if (i3 == 0) {
                    c8753pe3 = new C8753pe3(i / this.i, i2);
                } else {
                    c8753pe3 = new C8753pe3(i, i2 / this.i);
                }
                this.a0 = c8753pe3;
                this.Z = this.i;
            } else {
                C8753pe3 c8753pe32 = new C8753pe3();
                o00.c(this.f, O, N, c8753pe32);
                if (this.q) {
                    ArrayList arrayList2 = this.a;
                    C7849n00 c7849n002 = this.f;
                    C8753pe3 c8753pe33 = new C8753pe3();
                    Iterator it = arrayList2.iterator();
                    int i6 = 0;
                    while (it.hasNext()) {
                        ((O00) it.next()).c(c7849n002, View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0), c8753pe33);
                        i6 = Math.max(i6, c8753pe33.b);
                    }
                    c8753pe32.b = i6;
                }
                int max = Math.max(this.d.n(c8753pe32.a, c8753pe32.b, i, i2), 1);
                this.a0 = c8753pe32;
                this.Z = max;
            }
        } finally {
            if (b != null) {
                d.getClass();
                C5524gE1.a(b);
            }
        }
    }

    public static void w(KJ2 kj2, int i) {
        int i2;
        if (kj2.a0 == null || kj2.x) {
            return;
        }
        int size = kj2.a.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            O00 o00 = (O00) kj2.a.get(i4);
            synchronized (o00) {
                i2 = o00.r;
            }
            if (i2 > i3) {
                i3 = i2;
            }
        }
        if (i3 == kj2.a0.b) {
            return;
        }
        int max = Math.max(kj2.d.n(View.MeasureSpec.getSize(kj2.R), View.MeasureSpec.getSize(kj2.S), i, i3), 1);
        kj2.a0.b = i3;
        kj2.Z = max;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:            if (r0 != false) goto L108;     */
    @Override // defpackage.InterfaceC2194Qx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void b(int r7, int r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            int r0 = r6.R     // Catch: java.lang.Throwable -> L48
            r1 = -1
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L37
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r2)     // Catch: java.lang.Throwable -> L48
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r2)     // Catch: java.lang.Throwable -> L48
            by1 r4 = r6.d     // Catch: java.lang.Throwable -> L48
            int r4 = r4.p()     // Catch: java.lang.Throwable -> L48
            int r5 = r6.R     // Catch: java.lang.Throwable -> L48
            if (r5 == r1) goto L34
            if (r4 == 0) goto L29
            r1 = 1
            if (r4 == r1) goto L20
            goto L34
        L20:
            pe3 r1 = r6.T     // Catch: java.lang.Throwable -> L48
            int r1 = r1.a     // Catch: java.lang.Throwable -> L48
            boolean r0 = defpackage.OM1.a(r5, r0, r1)     // Catch: java.lang.Throwable -> L48
            goto L35
        L29:
            int r0 = r6.S     // Catch: java.lang.Throwable -> L48
            pe3 r1 = r6.T     // Catch: java.lang.Throwable -> L48
            int r1 = r1.b     // Catch: java.lang.Throwable -> L48
            boolean r0 = defpackage.OM1.a(r0, r3, r1)     // Catch: java.lang.Throwable -> L48
            goto L35
        L34:
            r0 = 0
        L35:
            if (r0 != 0) goto L46
        L37:
            pe3 r0 = defpackage.KJ2.o0     // Catch: java.lang.Throwable -> L48
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r2)     // Catch: java.lang.Throwable -> L48
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r2)     // Catch: java.lang.Throwable -> L48
            iD0 r1 = r6.d0     // Catch: java.lang.Throwable -> L48
            r6.h(r0, r7, r8, r1)     // Catch: java.lang.Throwable -> L48
        L46:
            monitor-exit(r6)
            return
        L48:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.KJ2.b(int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC2194Qx
    /* renamed from: e0 */
    public final void f(RecyclerView recyclerView) {
        LK3.a();
        RecyclerView recyclerView2 = this.U;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            v(recyclerView2);
        }
        int i = 0;
        if (this.e0) {
            A(0);
        }
        this.U = recyclerView;
        this.f0 = true;
        AbstractC12077zK2 q = this.d.q();
        if (q.i) {
            q.i = false;
            q.j = 0;
            RecyclerView recyclerView3 = q.b;
            if (recyclerView3 != null) {
                recyclerView3.h.m();
            }
        }
        recyclerView.getPaddingLeft();
        recyclerView.q0(q);
        recyclerView.n0(this.e);
        recyclerView.i(this.j0.i);
        if (recyclerView instanceof InterfaceC5136f61) {
            ((C8617pE1) ((InterfaceC5136f61) recyclerView)).P0 = this.H;
        } else if (recyclerView.getViewTreeObserver() != null) {
            recyclerView.getViewTreeObserver().addOnPreDrawListener(this.I);
        }
        this.d.o(this);
        C4292cf4 c4292cf4 = this.j0;
        C7956nJ2 c7956nJ2 = this.k0;
        if (c7956nJ2 == null) {
            c4292cf4.getClass();
        } else {
            synchronized (c4292cf4) {
                c4292cf4.g.add(c7956nJ2);
            }
        }
        int i2 = this.V;
        if (i2 != -1 && i2 >= 0 && !this.N) {
            int i3 = this.Y;
            if (i3 != 0) {
                int i4 = this.X;
                if (this.U == null) {
                    this.V = i2;
                    this.X = i4;
                    this.Y = i3;
                } else {
                    VB1 a = AbstractC3148Yf3.a(this.f.a, i4, i3);
                    a.a = i2;
                    this.U.s.E0(a);
                }
            } else {
                this.d.r(i2, this.X);
            }
        } else if (this.N) {
            int size = 1073741823 - (this.a.isEmpty() ? 0 : 1073741823 % this.a.size());
            int i5 = this.V;
            if (i5 != -1 && i5 >= 0) {
                i = i5;
            }
            recyclerView.m0(size + i);
            C4519dJ2 c4519dJ2 = new C4519dJ2(this, recyclerView, q);
            recyclerView.u0 = c4519dJ2;
            Ec4.m(recyclerView, c4519dJ2);
        }
        RecyclerView recyclerView4 = this.U;
        if (this.N) {
            Log.w(q0, "Sticky header is not supported for circular RecyclerViews");
            return;
        }
        if (recyclerView4 == null) {
            return;
        }
        int i6 = G13.T;
        G13 g13 = recyclerView4.getParent() instanceof G13 ? (G13) recyclerView4.getParent() : null;
        if (g13 == null) {
            return;
        }
        C3646am3 c3646am3 = new C3646am3(this);
        this.b0 = c3646am3;
        if (c3646am3.g != null) {
            throw new RuntimeException("SectionsRecyclerView has already been initialized but never reset.");
        }
        c3646am3.g = g13;
        C11703yE1 c11703yE1 = g13.O;
        c11703yE1.K();
        c11703yE1.setVisibility(8);
        AbstractC12077zK2 abstractC12077zK2 = g13.P.s;
        c3646am3.h = abstractC12077zK2;
        if (abstractC12077zK2 == null) {
            throw new RuntimeException("LayoutManager of RecyclerView is not initialized yet.");
        }
        c3646am3.g.P.i(c3646am3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC2194Qx
    /* renamed from: l0 */
    public final void v(RecyclerView recyclerView) {
        int top;
        int I;
        int left;
        int G;
        LK3.a();
        AbstractC12077zK2 q = this.d.q();
        View r = q.r(this.V);
        if (r == null) {
            this.X = 0;
        } else {
            AbstractC12077zK2 q2 = this.d.q();
            boolean z = q2 instanceof LinearLayoutManager ? ((LinearLayoutManager) q2).t : false;
            if (this.d.p() == 0) {
                if (z) {
                    left = recyclerView.getWidth() - q.H();
                    G = AbstractC12077zK2.L(r) + r.getRight();
                } else {
                    left = r.getLeft() - AbstractC12077zK2.E(r);
                    G = q.G();
                }
                this.X = left - G;
            } else {
                if (z) {
                    top = recyclerView.getHeight() - q.F();
                    I = AbstractC12077zK2.v(r) + r.getBottom();
                } else {
                    top = r.getTop() - AbstractC12077zK2.N(r);
                    I = q.I();
                }
                this.X = top - I;
            }
        }
        recyclerView.h0(this.j0.i);
        if (recyclerView instanceof InterfaceC5136f61) {
            ((C8617pE1) ((InterfaceC5136f61) recyclerView)).P0 = null;
        } else if (recyclerView.getViewTreeObserver() != null) {
            recyclerView.getViewTreeObserver().removeOnPreDrawListener(this.I);
        }
        Z();
        recyclerView.n0(null);
        recyclerView.q0(null);
        C4292cf4 c4292cf4 = this.j0;
        C7956nJ2 c7956nJ2 = this.k0;
        if (c7956nJ2 == null) {
            c4292cf4.getClass();
        } else {
            synchronized (c4292cf4) {
                if (!c4292cf4.g.isEmpty()) {
                    c4292cf4.g.remove(c7956nJ2);
                }
            }
        }
        synchronized (this) {
            int size = this.a.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((O00) this.a.get(size)).a(this.p);
                }
            }
        }
        if (this.U != recyclerView) {
            return;
        }
        this.U = null;
        C3646am3 c3646am3 = this.b0;
        if (c3646am3 != null) {
            G13 g13 = c3646am3.g;
            if (g13 == null) {
                throw new IllegalStateException("SectionsRecyclerView has not been set yet.");
            }
            g13.P.h0(c3646am3);
            c3646am3.h = null;
            c3646am3.g = null;
        }
        this.d.o(null);
    }

    @Override // defpackage.InterfaceC3605af4
    public final int g() {
        return this.d.g();
    }

    @Override // defpackage.InterfaceC3605af4
    public final int s() {
        return this.d.s();
    }

    public final boolean X(int i) {
        ArrayList arrayList = this.a;
        return (i >= 0 && i < arrayList.size()) && ((O00) arrayList.get(i)).f().p();
    }

    public final void b0() {
        if (this.U != null && this.j0.d()) {
            RecyclerView recyclerView = this.U;
            RunnableC8300oJ2 runnableC8300oJ2 = this.n0;
            recyclerView.removeCallbacks(runnableC8300oJ2);
            RecyclerView recyclerView2 = this.U;
            WeakHashMap weakHashMap = Ec4.a;
            recyclerView2.postOnAnimation(runnableC8300oJ2);
        }
        I(this.V, this.W, this.s);
    }

    public final void I(int i, int i2, InterfaceC4867eK2 interfaceC4867eK2) {
        int i3;
        int i4;
        synchronized (this) {
            if (W() && (i3 = this.Z) != -1) {
                int i5 = 0;
                if (i == -1 || i2 == -1) {
                    i = 0;
                    i2 = 0;
                }
                int max = Math.max(i3, i2 - i);
                int size = this.a.size();
                if (this.N) {
                    i4 = size;
                } else {
                    int i6 = (int) (max * this.j);
                    i4 = max + i + i6;
                    i5 = i - i6;
                }
                interfaceC4867eK2.a(size, i, i2, new C4862eJ2(this, i5, i4, size));
            }
        }
    }

    public final boolean S() {
        return !(this.a0 == null || this.Z == -1) || this.x;
    }

    public final int O(O00 o00) {
        boolean W = W();
        InterfaceC4058by1 interfaceC4058by1 = this.d;
        if (W) {
            return interfaceC4058by1.k(View.MeasureSpec.makeMeasureSpec(this.T.a, 1073741824), o00.f());
        }
        return interfaceC4058by1.k(this.R, o00.f());
    }

    public final int N(O00 o00) {
        if (this.O) {
            return 0;
        }
        boolean W = W();
        InterfaceC4058by1 interfaceC4058by1 = this.d;
        if (W) {
            return interfaceC4058by1.d(View.MeasureSpec.makeMeasureSpec(this.T.b, 1073741824), o00.f());
        }
        return interfaceC4058by1.d(this.S, o00.f());
    }

    public final O00 J(InterfaceC7976nN2 interfaceC7976nN2) {
        C11049wK3 c11049wK3 = this.c0;
        if (c11049wK3 == null) {
            c11049wK3 = null;
        }
        this.g.getClass();
        AtomicInteger atomicInteger = O00.y;
        N00 n00 = new N00();
        if (interfaceC7976nN2 == null) {
            interfaceC7976nN2 = A00.r();
        }
        n00.a = interfaceC7976nN2;
        n00.b = c11049wK3;
        n00.c = this.K;
        n00.f = this.u;
        n00.n = this.o;
        n00.i = false;
        n00.h = this.w;
        n00.g = this.v;
        n00.j = this.y;
        n00.m = this.n;
        n00.k = this.z;
        n00.d = null;
        n00.e = false;
        n00.l = false;
        return new O00(n00);
    }

    public final EJ2 Q() {
        int M;
        ArrayList arrayList = this.a;
        boolean isEmpty = arrayList.isEmpty();
        boolean z = this.B;
        if (!isEmpty) {
            int M2 = M(arrayList, z);
            if (this.V < arrayList.size() && M2 >= 0) {
                return new EJ2(M2, arrayList);
            }
        } else {
            ArrayList arrayList2 = this.b;
            if (!arrayList2.isEmpty() && (M = M(arrayList2, z)) >= 0) {
                return new EJ2(M, arrayList2);
            }
        }
        return null;
    }
}
