package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.facebook.litho.ComponentTree;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Fy1 */
/* loaded from: classes.dex */
public final class C0772Fy1 implements GW3 {
    public static final AtomicInteger Z = new AtomicInteger(1);
    public static final Object a0 = new Object();
    public long A;
    public int B;
    public boolean C;
    public boolean D;
    public int E;
    public final int F;
    public final int G;
    public boolean H;
    public AccessibilityManager I;

    /* renamed from: J */
    public boolean f11443J;
    public C7070kk3 K;
    public ArrayList L;
    public ArrayList M;
    public YV3 N;
    public C3603af2 O;
    public final LinkedHashMap P;
    public final HashSet Q;
    public ArrayList R;
    public final int S;
    public volatile boolean T;
    public volatile boolean U;
    public Oq4 V;
    public LinkedHashMap W;
    public final HashMap X;
    public boolean Y;
    public final HashMap a = new HashMap();
    public ArrayList b;
    public final C7849n00 c;
    public WZ d;
    public int e;
    public int f;
    public C1032Hy1 g;
    public final ArrayList h;
    public final ArrayList i;
    public final C3487aJ1 j;
    public final LinkedHashMap k;
    public final ArrayList l;
    public final ArrayList m;
    public final C5348fk n;
    public final HashMap o;
    public C1162Iy1 p;
    public final ArrayList q;
    public InterfaceC3331Zq1 r;
    public YV3 s;
    public String t;
    public C11523xj0 u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    public final C10926vy1 i(C2911Wk1 c2911Wk1) {
        return j(c2911Wk1.a).b.j;
    }

    public static C10926vy1 b(C9006qN2 c9006qN2, InterfaceC3331Zq1 interfaceC3331Zq1, C0772Fy1 c0772Fy1, C10926vy1 c10926vy1, Drawable drawable, int i, boolean z) {
        WZ c0616Et0 = new C0616Et0(drawable);
        boolean z2 = c10926vy1 != null ? !c0616Et0.R(c10926vy1 == null ? null : c10926vy1.a, c10926vy1.i, null, c0616Et0) : false;
        long j = c10926vy1 != null ? c10926vy1.s : -1L;
        c0616Et0.y(c0772Fy1.c, interfaceC3331Zq1);
        C10926vy1 g = g(c0616Et0, null, c0772Fy1.A, c0772Fy1, interfaceC3331Zq1, false, 2, c0772Fy1.C, false, z);
        c0772Fy1.d(g, c0772Fy1.z, i, j, z2);
        c(c0772Fy1, g, c9006qN2);
        int size = c0772Fy1.h.size() - 1;
        C3487aJ1 c3487aJ1 = c0772Fy1.j;
        if (c3487aJ1 != null) {
            c3487aJ1.i(g.s, Integer.valueOf(size));
        }
        C3603af2 c3603af2 = c0772Fy1.O;
        if (c3603af2 != null) {
            c3603af2.a(i, g);
        }
        return g;
    }

    public C0772Fy1(C7849n00 c7849n00, C0772Fy1 c0772Fy1) {
        new HashMap();
        this.h = new ArrayList(8);
        this.j = new C3487aJ1(8);
        this.k = new LinkedHashMap(8);
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.n = new C5348fk(4);
        this.z = 0;
        this.A = -1L;
        this.B = -1;
        this.C = true;
        this.D = false;
        this.E = -1;
        this.f11443J = false;
        this.P = new LinkedHashMap();
        this.Q = new HashSet();
        this.U = true;
        boolean z = B10.a;
        HashMap hashMap = new HashMap();
        this.X = hashMap;
        this.c = c7849n00;
        int andIncrement = Z.getAndIncrement();
        this.F = andIncrement;
        int i = c0772Fy1 != null ? c0772Fy1.F : -1;
        this.G = i;
        this.K = c7849n00.d;
        this.q = B10.b ? new ArrayList(8) : null;
        this.S = c7849n00.f().getConfiguration().orientation;
        this.o = new HashMap();
        this.b = new ArrayList();
        this.i = new ArrayList(8);
        hashMap.put("layoutId", Integer.valueOf(andIncrement));
        hashMap.put("previousLayoutId", Integer.valueOf(i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e7, code lost:            if (r13.K == 2) goto L299;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.C10926vy1 g(defpackage.WZ r19, java.lang.String r20, long r21, defpackage.C0772Fy1 r23, defpackage.InterfaceC3331Zq1 r24, boolean r25, int r26, boolean r27, boolean r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0772Fy1.g(WZ, java.lang.String, long, Fy1, Zq1, boolean, int, boolean, boolean, boolean):vy1");
    }

    /* JADX WARN: Code restructure failed: missing block: B:329:0x01e3, code lost:            if (((android.text.TextUtils.isEmpty(r49.P()) || defpackage.WZ.i0(r49.t0())) ? false : true) != false) goto L1805;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0494 A[LOOP:4: B:155:0x0492->B:156:0x0494, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x074b  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0332 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0378  */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v62 */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r48v16 */
    /* JADX WARN: Type inference failed for: r48v5, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r48v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void f(defpackage.C7849n00 r48, defpackage.InterfaceC3331Zq1 r49, defpackage.C0772Fy1 r50, defpackage.C9006qN2 r51, defpackage.C11523xj0 r52) {
        /*
            Method dump skipped, instructions count: 1895
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0772Fy1.f(n00, Zq1, Fy1, qN2, xj0):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x007e, code lost:            if (r13 == false) goto L457;     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0084, code lost:            if (r11.next() == null) goto L515;     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0089, code lost:            if (r13 == false) goto L463;     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008b, code lost:            r13 = ' ';     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0092, code lost:            r4.append(r13);        r4.append(' ');        r12 = r12 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0090, code lost:            r13 = "│";     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(defpackage.C0772Fy1 r15) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0772Fy1.a(Fy1):void");
    }

    public static void p(C7849n00 c7849n00, C0772Fy1 c0772Fy1) {
        C3487aJ1 c3487aJ1;
        if (c7849n00.p()) {
            return;
        }
        int i = c0772Fy1.e;
        int i2 = c0772Fy1.f;
        InterfaceC3331Zq1 interfaceC3331Zq1 = c0772Fy1.r;
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            c0772Fy1.v = Math.min(interfaceC3331Zq1.getWidth(), View.MeasureSpec.getSize(i));
        } else if (mode == 0) {
            c0772Fy1.v = interfaceC3331Zq1.getWidth();
        } else if (mode == 1073741824) {
            c0772Fy1.v = View.MeasureSpec.getSize(i);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 == Integer.MIN_VALUE) {
            c0772Fy1.w = Math.min(interfaceC3331Zq1.getHeight(), View.MeasureSpec.getSize(i2));
        } else if (mode2 == 0) {
            c0772Fy1.w = interfaceC3331Zq1.getHeight();
        } else if (mode2 == 1073741824) {
            c0772Fy1.w = View.MeasureSpec.getSize(i2);
        }
        C1162Iy1 c1162Iy1 = c0772Fy1.p;
        if (c1162Iy1 != null && (c3487aJ1 = c1162Iy1.a) != null) {
            c3487aJ1.b();
        }
        c0772Fy1.A = -1L;
        if (interfaceC3331Zq1 == C7849n00.p) {
            return;
        }
        f(c7849n00, interfaceC3331Zq1, c0772Fy1, null, null);
        ArrayList arrayList = c0772Fy1.l;
        ArrayList arrayList2 = new ArrayList(arrayList);
        boolean z = false;
        try {
            Collections.sort(arrayList, AbstractC3301Zk1.a);
            ArrayList arrayList3 = c0772Fy1.m;
            ArrayList arrayList4 = new ArrayList(arrayList3);
            try {
                Collections.sort(arrayList3, AbstractC3301Zk1.b);
                ComponentTree componentTree = c7849n00.l;
                if (componentTree != null) {
                    z = componentTree.e0;
                } else {
                    boolean z2 = B10.a;
                }
                if (z || B10.a || B10.b) {
                    return;
                }
                c0772Fy1.r = null;
            } catch (IllegalArgumentException e) {
                StringBuilder sb = new StringBuilder();
                sb.append(e.getMessage());
                sb.append("\n");
                int size = arrayList4.size();
                sb.append("Error while sorting LayoutState bottoms. Size: " + size);
                sb.append("\n");
                for (int i3 = 0; i3 < size; i3++) {
                    C10926vy1 c10926vy1 = c0772Fy1.j(((C2911Wk1) arrayList4.get(i3)).a).b.j;
                    sb.append("   Index " + c10926vy1.r + " bottom: " + c10926vy1.j.bottom);
                    sb.append("\n");
                }
                throw new IllegalStateException(sb.toString());
            }
        } catch (IllegalArgumentException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(e2.getMessage());
            sb2.append("\n");
            int size2 = arrayList2.size();
            sb2.append("Error while sorting LayoutState tops. Size: " + size2);
            sb2.append("\n");
            for (int i4 = 0; i4 < size2; i4++) {
                C10926vy1 c10926vy12 = c0772Fy1.j(((C2911Wk1) arrayList2.get(i4)).a).b.j;
                sb2.append("   Index " + c10926vy12.r + " top: " + c10926vy12.j.top);
                sb2.append("\n");
            }
            throw new IllegalStateException(sb2.toString());
        }
    }

    public static String o(int i) {
        switch (i) {
            case -2:
                return "test";
            case -1:
                return "none";
            case 0:
                return "setRoot";
            case 1:
                return "setRootAsync";
            case 2:
                return "setSizeSpec";
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return "setSizeSpecAsync";
            case 4:
                return "updateStateSync";
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return "updateStateAsync";
            case 6:
                return "measure_setSizeSpec";
            case 7:
                return "measure_setSizeSpecAsync";
            case 8:
                return "reloadState";
            default:
                throw new RuntimeException(AbstractC9076qb1.a("Unknown calculate layout source: ", i));
        }
    }

    public final void d(C10926vy1 c10926vy1, int i, int i2, long j, boolean z) {
        if (this.p == null) {
            this.p = new C1162Iy1();
        }
        C1162Iy1 c1162Iy1 = this.p;
        if (c1162Iy1.a == null) {
            c1162Iy1.a = new C3487aJ1(2);
        }
        if (i >= 0 && i <= 255) {
            long j2 = ((c10926vy1.i != null ? r4.a : 0L) << 27) | 0 | (i << 19) | (i2 << 16);
            int i3 = (j <= 0 || ((int) ((j >> 19) & 255)) != i) ? -1 : (int) (j & 65535);
            int i4 = 0;
            int intValue = ((Integer) c1162Iy1.a.e(j2, 0)).intValue();
            if (i3 < intValue) {
                i3 = intValue + 1;
            } else {
                i4 = z ? 1 : 2;
            }
            c10926vy1.t = i4;
            if (i3 < 0 || i3 > 65535) {
                throw new IllegalArgumentException(AbstractC9076qb1.a("Sequence must be non-negative and no greater than 65535 actual sequence ", i3));
            }
            c10926vy1.s = i3 | j2;
            c1162Iy1.a.i(j2, Integer.valueOf(i3 + 1));
            return;
        }
        throw new IllegalArgumentException(AbstractC9076qb1.a("Level must be non-negative and no greater than 255 actual level ", i));
    }

    public final int k() {
        return this.h.size();
    }

    public final C9006qN2 j(int i) {
        return (C9006qN2) this.h.get(i);
    }

    public final boolean n(InterfaceC3331Zq1 interfaceC3331Zq1) {
        return !this.r.h0() ? interfaceC3331Zq1 != this.r : interfaceC3331Zq1 != this.r.g();
    }

    public final int l(long j) {
        return ((Integer) this.j.e(j, -1)).intValue();
    }

    public static C9006qN2 c(C0772Fy1 c0772Fy1, C10926vy1 c10926vy1, C9006qN2 c9006qN2) {
        ArrayList arrayList = c0772Fy1.h;
        c10926vy1.r = arrayList.size();
        C9006qN2 a = C10926vy1.a(c10926vy1, c9006qN2, c0772Fy1.X);
        if (c9006qN2 != null) {
            if (c9006qN2.g == null) {
                c9006qN2.g = new ArrayList(4);
            }
            c9006qN2.g.add(a);
        }
        WZ wz = c10926vy1.i;
        wz.getClass();
        if ((wz instanceof TG3) && c10926vy1.d() && c9006qN2 != null) {
            ((K91) c9006qN2.b.j.i).E = true;
        }
        arrayList.add(a);
        long j = c10926vy1.s;
        int i = c10926vy1.r;
        Rect rect = c10926vy1.j;
        LinkedHashMap linkedHashMap = c0772Fy1.k;
        C2911Wk1 c2911Wk1 = new C2911Wk1(j, i, rect, c9006qN2 != null ? (C2911Wk1) linkedHashMap.get(Long.valueOf(c9006qN2.b.j.s)) : null);
        linkedHashMap.put(Long.valueOf(c10926vy1.s), c2911Wk1);
        c0772Fy1.l.add(c2911Wk1);
        c0772Fy1.m.add(c2911Wk1);
        if (wz.p()) {
            c0772Fy1.n.add(Long.valueOf(c10926vy1.s));
        }
        return a;
    }

    public final void e(int i, int i2, int i3, int i4, int i5, Pq4 pq4) {
        LinkedHashMap linkedHashMap;
        Oq4 oq4 = this.V;
        if (oq4 == null || (linkedHashMap = oq4.a) == null) {
            return;
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            Mq4 mq4 = (Mq4) oq4.a.get((String) it.next());
            int size = mq4.c.size();
            for (int i6 = 0; i6 < size; i6++) {
                WZ wz = (WZ) mq4.c.get(i6);
                String str = mq4.a;
                boolean a = pq4.a(str, wz);
                Lq4 lq4 = mq4.b;
                HashMap hashMap = pq4.a;
                if (a || !lq4.a(i, i2, i3)) {
                    if (pq4.a(str, wz) && lq4.b(i, i2, i3)) {
                        C7849n00 c7849n00 = wz.r;
                        wz.j(str);
                        hashMap.put(AbstractC8192o0.a(str, "_", A10.c(wz)), 2);
                    }
                } else {
                    C7849n00 c7849n002 = wz.r;
                    wz.h(str);
                    hashMap.put(AbstractC8192o0.a(str, "_", A10.c(wz)), 1);
                }
            }
        }
    }

    public final void h(Pq4 pq4) {
        LinkedHashMap linkedHashMap;
        Oq4 oq4 = this.V;
        if (oq4 == null || (linkedHashMap = oq4.a) == null) {
            return;
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            Mq4 mq4 = (Mq4) oq4.a.get((String) it.next());
            int size = mq4.c.size();
            for (int i = 0; i < size; i++) {
                WZ wz = (WZ) mq4.c.get(i);
                String str = mq4.a;
                if (pq4.a(str, wz)) {
                    C7849n00 c7849n00 = wz.r;
                    wz.j(str);
                }
            }
        }
    }

    public static YV3 m(InterfaceC3331Zq1 interfaceC3331Zq1) {
        int i;
        String P = interfaceC3331Zq1.P();
        JV3 E = interfaceC3331Zq1.E();
        String q = interfaceC3331Zq1.q();
        String J2 = interfaceC3331Zq1.J();
        if (TextUtils.isEmpty(P)) {
            q = null;
            P = J2;
            i = 3;
        } else if (E == JV3.GLOBAL) {
            i = 1;
            q = null;
        } else {
            if (E != JV3.LOCAL) {
                throw new IllegalArgumentException("Unhandled transition key type ".concat(String.valueOf(E)));
            }
            i = 2;
        }
        if (P != null) {
            return new YV3(i, P, q);
        }
        return null;
    }
}
