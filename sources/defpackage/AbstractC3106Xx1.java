package defpackage;

import android.content.res.TypedArray;
import android.os.Build;
import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Xx1 */
/* loaded from: classes.dex */
public abstract class AbstractC3106Xx1 {
    public static final boolean a = "robolectric".equals(Build.FINGERPRINT);

    public static InterfaceC3331Zq1 d(C1032Hy1 c1032Hy1, C7849n00 c7849n00, WZ wz, int i, int i2, InterfaceC3331Zq1 interfaceC3331Zq1, C11523xj0 c11523xj0, InterfaceC9173qr2 interfaceC9173qr2) {
        InterfaceC3331Zq1 f0;
        C0772Fy1 c0772Fy1;
        if (interfaceC9173qr2 != null) {
            interfaceC9173qr2.e(interfaceC3331Zq1 == null ? "start_create_layout" : "start_reconcile_layout");
        }
        c7849n00.i = i;
        c7849n00.j = i2;
        if (interfaceC3331Zq1 == null) {
            f0 = b(c7849n00, wz, true, false);
            C1032Hy1 c1032Hy12 = c7849n00.o;
            if (c1032Hy12 == null ? false : c1032Hy12.a()) {
                if (interfaceC9173qr2 != null) {
                    interfaceC9173qr2.e("end_create_layout");
                }
                return f0;
            }
            C1032Hy1 c1032Hy13 = c7849n00.o;
            if (c1032Hy13 != null && (c0772Fy1 = c1032Hy13.a) != null) {
                c0772Fy1.U = false;
            }
        } else {
            WZ wz2 = h(c7849n00, wz, true).f;
            f0 = interfaceC3331Zq1.f0(c1032Hy1, c7849n00, wz2, A10.c(wz2));
        }
        if (interfaceC9173qr2 != null) {
            interfaceC9173qr2.e(interfaceC3331Zq1 != null ? "end_reconcile_layout" : "end_create_layout");
        }
        if (interfaceC9173qr2 != null) {
            interfaceC9173qr2.e("start_measure");
        }
        f(c7849n00, f0, i, i2, c11523xj0);
        if (interfaceC9173qr2 != null) {
            interfaceC9173qr2.e("end_measure");
        }
        return f0;
    }

    public static InterfaceC3331Zq1 b(C7849n00 c7849n00, WZ wz, boolean z, boolean z2) {
        WZ z3;
        InterfaceC3331Zq1 interfaceC3331Zq1;
        InterfaceC3331Zq1 b;
        C5277fX3 c5277fX3;
        InterfaceC3331Zq1 interfaceC3331Zq12 = C7849n00.p;
        try {
            wz.getClass();
            C7849n00 h = h(c7849n00, wz, z2);
            h.c();
            WZ wz2 = h.f;
            if (WZ.j0(wz2, h) && !z) {
                C9181qs4 c9181qs4 = D52.a;
                InterfaceC3331Zq1 c1605Mj0 = new C1605Mj0(h);
                C5277fX3 c5277fX32 = h.k;
                c1605Mj0.w().a = true;
                C3201Yq1 w = c1605Mj0.w();
                if (c5277fX32 == null) {
                    c5277fX3 = null;
                } else {
                    c5277fX3 = new C5277fX3();
                    synchronized (c5277fX32.a) {
                        c5277fX3.a.putAll(c5277fX32.a);
                    }
                }
                w.f = c5277fX3;
                interfaceC3331Zq1 = c1605Mj0;
            } else if (wz2.U()) {
                interfaceC3331Zq1 = wz2.P(h);
            } else if (WZ.h0(wz2)) {
                C9181qs4 c9181qs42 = D52.a;
                C1605Mj0 c1605Mj02 = new C1605Mj0(h);
                YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(((YogaNodeJNIBase) c1605Mj02.a).j, 0);
                interfaceC3331Zq1 = c1605Mj02;
            } else if (wz2.m() == 1) {
                if (WZ.g0(wz2)) {
                    z3 = wz2.A(h, h.i);
                } else {
                    z3 = wz2.z(h);
                }
                if (z3 == null || z3.l <= 0) {
                    z3 = null;
                }
                if (z3 == wz2) {
                    b = z3.P(h);
                } else if (z3 != null) {
                    b = b(h, z3, false, false);
                } else {
                    interfaceC3331Zq1 = null;
                }
                interfaceC3331Zq1 = b;
            } else {
                throw new IllegalArgumentException("component:" + wz2.c0());
            }
            if (interfaceC3331Zq1 == null || interfaceC3331Zq1 == interfaceC3331Zq12) {
                return interfaceC3331Zq12;
            }
            if (interfaceC3331Zq1.t0() == null) {
                if ((wz2.e() && WZ.h0(wz2)) || (WZ.j0(wz2, h) && !z)) {
                    boolean z4 = B10.a;
                    interfaceC3331Zq1.y(AbstractC10593v00.g);
                }
            }
            BY by = wz2.t;
            if (by != null && ((!WZ.g0(wz2) || !z) && interfaceC3331Zq1 != interfaceC3331Zq12)) {
                int i = by.n;
                int i2 = by.o;
                if (i != 0 || i2 != 0) {
                    h.n = i;
                    h.m = i2;
                    TypedArray obtainStyledAttributes = h.a.obtainStyledAttributes(null, JG2.G, i, i2);
                    interfaceC3331Zq1.b(obtainStyledAttributes);
                    obtainStyledAttributes.recycle();
                    h.n = 0;
                    h.m = 0;
                }
                C3975bk0 c3975bk0 = by.h;
                if (c3975bk0 != null) {
                    c3975bk0.b(interfaceC3331Zq1.U1());
                }
                if ((by.a & 1) != 0) {
                    interfaceC3331Zq1.Z0(by.j);
                }
                if ((by.a & 2) != 0) {
                    interfaceC3331Zq1.Y0(by.k);
                }
                if (by.m || ((long) (by.a & 28)) != 0) {
                    interfaceC3331Zq1.r1();
                }
                C12144zY c12144zY = by.i;
                if (c12144zY != null) {
                    c12144zY.U(interfaceC3331Zq1);
                }
                AY ay = by.g;
                if (ay != null) {
                    if ((ay.a & 1) != 0) {
                        interfaceC3331Zq1.z1(ay.j);
                    }
                    if ((ay.a & 2) != 0) {
                        interfaceC3331Zq1.W(false);
                    }
                    if ((ay.a & 262144) != 0) {
                        interfaceC3331Zq1.G(false);
                    }
                    if ((ay.a & 4) != 0) {
                        interfaceC3331Zq1.D1(null);
                    }
                    if ((ay.a & 1024) != 0) {
                        interfaceC3331Zq1.r1();
                    }
                    if ((ay.a & 8) != 0) {
                        interfaceC3331Zq1.h1(ay.g);
                    }
                    if ((ay.a & 1073741824) != 0) {
                        interfaceC3331Zq1.Q0(ay.h);
                    }
                    if ((ay.a & 16) != 0) {
                        interfaceC3331Zq1.V(null);
                    }
                    if ((ay.a & 32) != 0) {
                        interfaceC3331Zq1.T0(null);
                    }
                    if ((ay.a & 64) != 0) {
                        interfaceC3331Zq1.I0(ay.i);
                    }
                    if ((ay.a & 128) != 0) {
                        interfaceC3331Zq1.x0(null);
                    }
                    if ((ay.a & 65536) != 0) {
                        interfaceC3331Zq1.F(null);
                    }
                    if ((ay.a & 512) != 0) {
                        interfaceC3331Zq1.z(ay.m, ay.l);
                    }
                    if ((ay.a & 131072) != 0) {
                        interfaceC3331Zq1.i0(ay.n);
                    }
                    if ((ay.a & Integer.MIN_VALUE) != 0) {
                        interfaceC3331Zq1.G0(ay.o);
                    }
                    if ((ay.a & 2048) != 0) {
                        interfaceC3331Zq1.K1(0.0f);
                    }
                    if ((ay.a & 4096) != 0) {
                        interfaceC3331Zq1.Z(0.0f);
                    }
                    if ((ay.a & 256) != 0) {
                        for (int i3 = 0; i3 < C2575Tv0.i; i3++) {
                            float d = ay.k.d(i3);
                            if (!AbstractC9523rs4.a(d)) {
                                interfaceC3331Zq1.H(EnumC10209ts4.a(i3), (int) d);
                            }
                        }
                    }
                    if ((ay.a & 8192) != 0) {
                        interfaceC3331Zq1.S1(ay.p);
                    }
                    if ((ay.a & 16384) != 0) {
                        interfaceC3331Zq1.u0(null);
                    }
                    if ((ay.a & 32768) != 0) {
                        interfaceC3331Zq1.n(0);
                    }
                    interfaceC3331Zq1.T(-1, null);
                }
            }
            interfaceC3331Zq1.Y1(wz2, A10.c(wz2));
            if (h.l == null) {
                AbstractC0400Dc.a(null);
            }
            if (WZ.h0(wz2)) {
                wz2.K(h);
            }
            ArrayList arrayList = wz2.k;
            if (arrayList != null && !arrayList.isEmpty()) {
                interfaceC3331Zq1.x(wz2.k);
            }
            return interfaceC3331Zq1;
        } catch (Exception e) {
            e(c7849n00, wz, e);
            return interfaceC3331Zq12;
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005c, code lost:            if ((defpackage.OM1.a(r1.U0(), r13, (int) r1.B0()) && defpackage.OM1.a(r1.b0(), r14, (int) r1.r0())) == false) goto L238;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.InterfaceC3331Zq1 c(defpackage.C7849n00 r11, defpackage.InterfaceC3331Zq1 r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC3106Xx1.c(n00, Zq1, int, int):Zq1");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:            if (r0.getResources().getConfiguration().getLayoutDirection() == 1) goto L130;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void f(defpackage.C7849n00 r3, defpackage.InterfaceC3331Zq1 r4, int r5, int r6, defpackage.C11523xj0 r7) {
        /*
            ss4 r0 = r4.e1()
            ss4 r1 = defpackage.EnumC9866ss4.g
            if (r0 != r1) goto L2d
            android.content.Context r0 = r3.a
            android.content.pm.ApplicationInfo r1 = r0.getApplicationInfo()
            int r1 = r1.flags
            r2 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 & r2
            if (r1 == 0) goto L25
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.getLayoutDirection()
            r1 = 1
            if (r0 != r1) goto L25
            goto L26
        L25:
            r1 = 0
        L26:
            if (r1 == 0) goto L2d
            ss4 r0 = defpackage.EnumC9866ss4.i
            r4.j1(r0)
        L2d:
            float r0 = r4.K0()
            boolean r0 = defpackage.AbstractC9523rs4.a(r0)
            if (r0 == 0) goto L3a
            r4.p0(r5)
        L3a:
            float r0 = r4.C()
            boolean r0 = defpackage.AbstractC9523rs4.a(r0)
            if (r0 == 0) goto L47
            r4.S(r6)
        L47:
            if (r7 == 0) goto L4e
            Hy1 r3 = r3.o
            a(r3, r4, r7)
        L4e:
            int r3 = android.view.View.MeasureSpec.getMode(r5)
            r7 = 2143289344(0x7fc00000, float:NaN)
            if (r3 != 0) goto L58
            r3 = r7
            goto L5d
        L58:
            int r3 = android.view.View.MeasureSpec.getSize(r5)
            float r3 = (float) r3
        L5d:
            int r5 = android.view.View.MeasureSpec.getMode(r6)
            if (r5 != 0) goto L64
            goto L69
        L64:
            int r5 = android.view.View.MeasureSpec.getSize(r6)
            float r7 = (float) r5
        L69:
            r4.k1(r3, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC3106Xx1.f(n00, Zq1, int, int, xj0):void");
    }

    public static C7849n00 h(C7849n00 c7849n00, WZ wz, boolean z) {
        AtomicBoolean atomicBoolean = wz.q;
        WZ k0 = (atomicBoolean != null && atomicBoolean.getAndSet(true)) ? wz.k0() : wz;
        if (z) {
            k0.n = A10.c(wz);
        }
        C5277fX3 g = c7849n00.g();
        k0.O(g);
        C7849n00 o0 = k0.o0(c7849n00);
        o0.k = k0.n(g);
        if (B10.a) {
            X5.a(C3025Xh0.c.get(C3025Xh0.a(o0, o0.c())));
        }
        return o0;
    }

    public static void g(InterfaceC3331Zq1 interfaceC3331Zq1) {
        List M1 = interfaceC3331Zq1.M1();
        if (M1 != null) {
            int size = M1.size();
            for (int i = 0; i < size; i++) {
                interfaceC3331Zq1.A1((WZ) M1.get(i));
            }
            interfaceC3331Zq1.M1().clear();
        }
        int L = interfaceC3331Zq1.L();
        for (int i2 = 0; i2 < L; i2++) {
            g(interfaceC3331Zq1.a(i2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e A[Catch: all -> 0x00b2, TryCatch #0 {all -> 0x00b2, blocks: (B:3:0x0001, B:6:0x000c, B:9:0x0018, B:16:0x003e, B:21:0x0053, B:26:0x0065, B:28:0x0071, B:32:0x008f, B:35:0x0079, B:38:0x007e, B:42:0x008a, B:43:0x0084, B:45:0x0099, B:47:0x00a5, B:48:0x00ae, B:51:0x0020, B:57:0x002f), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(defpackage.C1032Hy1 r6, defpackage.InterfaceC3331Zq1 r7, defpackage.C11523xj0 r8) {
        /*
            r0 = 0
            Zq1 r1 = r7.getParent()     // Catch: java.lang.Throwable -> Lb2
            r2 = 0
            r3 = 1
            if (r1 != 0) goto Lb
            r1 = r3
            goto Lc
        Lb:
            r1 = r2
        Lc:
            WZ r4 = r7.t0()     // Catch: java.lang.Throwable -> Lb2
            boolean r4 = defpackage.WZ.g0(r4)     // Catch: java.lang.Throwable -> Lb2
            if (r4 == 0) goto L1c
            if (r1 != 0) goto L1c
            r7.M(r8)     // Catch: java.lang.Throwable -> Lb2
            return
        L1c:
            if (r8 != 0) goto L20
        L1e:
            r1 = r2
            goto L3b
        L20:
            WZ r1 = r7.t0()     // Catch: java.lang.Throwable -> Lb2
            WZ r4 = r8.j     // Catch: java.lang.Throwable -> Lb2
            if (r1 != r4) goto L2a
            r1 = r3
            goto L3b
        L2a:
            if (r1 == 0) goto L1e
            if (r4 != 0) goto L2f
            goto L1e
        L2f:
            java.lang.Class r1 = r1.getClass()     // Catch: java.lang.Throwable -> Lb2
            java.lang.Class r4 = r4.getClass()     // Catch: java.lang.Throwable -> Lb2
            boolean r1 = r1.equals(r4)     // Catch: java.lang.Throwable -> Lb2
        L3b:
            if (r1 != 0) goto L3e
            return
        L3e:
            r7.M(r8)     // Catch: java.lang.Throwable -> Lb2
            int r1 = r7.L()     // Catch: java.lang.Throwable -> Lb2
            java.util.ArrayList r4 = r8.o     // Catch: java.lang.Throwable -> Lb2
            int r4 = r4.size()     // Catch: java.lang.Throwable -> Lb2
            if (r1 == 0) goto L65
            if (r4 == 0) goto L65
        L4f:
            if (r2 >= r1) goto Lb1
            if (r2 >= r4) goto Lb1
            Zq1 r3 = r7.a(r2)     // Catch: java.lang.Throwable -> Lb2
            java.util.ArrayList r5 = r8.o     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object r5 = r5.get(r2)     // Catch: java.lang.Throwable -> Lb2
            xj0 r5 = (defpackage.C11523xj0) r5     // Catch: java.lang.Throwable -> Lb2
            a(r6, r3, r5)     // Catch: java.lang.Throwable -> Lb2
            int r2 = r2 + 1
            goto L4f
        L65:
            WZ r1 = r7.t0()     // Catch: java.lang.Throwable -> Lb2
            r7.O0()     // Catch: java.lang.Throwable -> Lb2
            defpackage.A10.c(r1)     // Catch: java.lang.Throwable -> Lb2
            if (r1 == 0) goto L97
            WZ r2 = r8.j     // Catch: java.lang.Throwable -> Lb2
            if (r2 != 0) goto L76
            goto L88
        L76:
            if (r6 != 0) goto L79
            goto L88
        L79:
            com.facebook.litho.ComponentTree r6 = r6.b     // Catch: java.lang.Throwable -> Lb2
            if (r6 != 0) goto L7e
            goto L88
        L7e:
            Fy1 r6 = r6.W     // Catch: java.lang.Throwable -> Lb2
            if (r6 != 0) goto L84
            r6 = r0
            goto L86
        L84:
            Hy1 r6 = r6.g     // Catch: java.lang.Throwable -> Lb2
        L86:
            if (r6 != 0) goto L8a
        L88:
            r6 = r0
            goto L8f
        L8a:
            defpackage.A10.c(r2)     // Catch: java.lang.Throwable -> Lb2
            n00 r6 = r2.r     // Catch: java.lang.Throwable -> Lb2
        L8f:
            WZ r2 = r8.j     // Catch: java.lang.Throwable -> Lb2
            n00 r3 = r1.r     // Catch: java.lang.Throwable -> Lb2
            boolean r3 = r1.R(r6, r2, r3, r1)     // Catch: java.lang.Throwable -> Lb2
        L97:
            if (r3 != 0) goto Lb1
            WZ r6 = r7.t0()     // Catch: java.lang.Throwable -> Lb2
            r7.O0()     // Catch: java.lang.Throwable -> Lb2
            defpackage.A10.c(r6)     // Catch: java.lang.Throwable -> Lb2
            if (r6 == 0) goto Lae
            Uo1 r1 = r6.A     // Catch: java.lang.Throwable -> Lb2
            WZ r8 = r8.j     // Catch: java.lang.Throwable -> Lb2
            Uo1 r8 = r8.A     // Catch: java.lang.Throwable -> Lb2
            r6.V(r1, r8)     // Catch: java.lang.Throwable -> Lb2
        Lae:
            r7.v()     // Catch: java.lang.Throwable -> Lb2
        Lb1:
            return
        Lb2:
            r6 = move-exception
            mE1 r8 = new mE1
            n00 r1 = r7.getContext()
            r8.<init>(r1, r0, r6)
            WZ r6 = r7.t0()
            if (r6 == 0) goto Lc7
            java.util.ArrayList r7 = r8.g
            r7.add(r6)
        Lc7:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC3106Xx1.a(Hy1, Zq1, xj0):void");
    }

    public static void e(C7849n00 c7849n00, WZ wz, Exception exc) {
        C7586mE1 c7586mE1;
        C6206iD0 b = c7849n00.b();
        boolean z = exc instanceof C7586mE1;
        C6206iD0 c6206iD0 = z ? ((C7586mE1) exc).a : null;
        if (!z) {
            c7586mE1 = new C7586mE1(c7849n00, null, exc);
        } else {
            c7586mE1 = (C7586mE1) exc;
        }
        c7586mE1.g.add(wz);
        if (c6206iD0 == b) {
            c7586mE1.a = c6206iD0;
            throw c7586mE1;
        }
        if (b instanceof VC0) {
            ((C11866yj0) ((VC0) b)).getClass();
            throw c7586mE1;
        }
        C12046zE1 c12046zE1 = AbstractC10593v00.g;
        UC0 uc0 = new UC0();
        uc0.a = exc;
        A10.b(c7849n00, uc0);
    }
}
