package defpackage;

import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class A13 {
    public static volatile Looper w;
    public final C4513dI1 a;
    public final HandlerC6212iE1 b;
    public final C3390a13 c;
    public final C8176nx d;
    public final C4213cR0 e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final boolean j;
    public final boolean k;
    public final C10945w13 l;
    public final C10945w13 m;
    public Y03 n;
    public Y03 o;
    public boolean p;
    public int q;
    public final C11631y13 r;
    public final ArrayList s;
    public final AtomicBoolean t;
    public final HashMap i = new HashMap();
    public final C6892kD0 u = new C6892kD0();
    public final QD0 v = new QD0();

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c A[Catch: all -> 0x0075, TryCatch #0 {all -> 0x0075, blocks: (B:2:0x0000, B:4:0x0014, B:5:0x0018, B:7:0x001f, B:13:0x0035, B:14:0x0042, B:16:0x004c, B:18:0x0055, B:20:0x0061, B:22:0x0071, B:26:0x007d, B:29:0x0084, B:30:0x008a, B:32:0x00a0, B:33:0x00a8, B:36:0x00ae, B:37:0x00b1, B:39:0x00b9, B:41:0x00c9, B:45:0x00ff, B:47:0x0105, B:50:0x00f5, B:52:0x010b, B:53:0x0128, B:56:0x0129, B:58:0x012d, B:61:0x00a6, B:64:0x003d), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0 A[Catch: all -> 0x0075, TryCatch #0 {all -> 0x0075, blocks: (B:2:0x0000, B:4:0x0014, B:5:0x0018, B:7:0x001f, B:13:0x0035, B:14:0x0042, B:16:0x004c, B:18:0x0055, B:20:0x0061, B:22:0x0071, B:26:0x007d, B:29:0x0084, B:30:0x008a, B:32:0x00a0, B:33:0x00a8, B:36:0x00ae, B:37:0x00b1, B:39:0x00b9, B:41:0x00c9, B:45:0x00ff, B:47:0x0105, B:50:0x00f5, B:52:0x010b, B:53:0x0128, B:56:0x0129, B:58:0x012d, B:61:0x00a6, B:64:0x003d), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b9 A[Catch: all -> 0x0075, TryCatch #0 {all -> 0x0075, blocks: (B:2:0x0000, B:4:0x0014, B:5:0x0018, B:7:0x001f, B:13:0x0035, B:14:0x0042, B:16:0x004c, B:18:0x0055, B:20:0x0061, B:22:0x0071, B:26:0x007d, B:29:0x0084, B:30:0x008a, B:32:0x00a0, B:33:0x00a8, B:36:0x00ae, B:37:0x00b1, B:39:0x00b9, B:41:0x00c9, B:45:0x00ff, B:47:0x0105, B:50:0x00f5, B:52:0x010b, B:53:0x0128, B:56:0x0129, B:58:0x012d, B:61:0x00a6, B:64:0x003d), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012d A[Catch: all -> 0x0075, TRY_LEAVE, TryCatch #0 {all -> 0x0075, blocks: (B:2:0x0000, B:4:0x0014, B:5:0x0018, B:7:0x001f, B:13:0x0035, B:14:0x0042, B:16:0x004c, B:18:0x0055, B:20:0x0061, B:22:0x0071, B:26:0x007d, B:29:0x0084, B:30:0x008a, B:32:0x00a0, B:33:0x00a8, B:36:0x00ae, B:37:0x00b1, B:39:0x00b9, B:41:0x00c9, B:45:0x00ff, B:47:0x0105, B:50:0x00f5, B:52:0x010b, B:53:0x0128, B:56:0x0129, B:58:0x012d, B:61:0x00a6, B:64:0x003d), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a6 A[Catch: all -> 0x0075, TryCatch #0 {all -> 0x0075, blocks: (B:2:0x0000, B:4:0x0014, B:5:0x0018, B:7:0x001f, B:13:0x0035, B:14:0x0042, B:16:0x004c, B:18:0x0055, B:20:0x0061, B:22:0x0071, B:26:0x007d, B:29:0x0084, B:30:0x008a, B:32:0x00a0, B:33:0x00a8, B:36:0x00ae, B:37:0x00b1, B:39:0x00b9, B:41:0x00c9, B:45:0x00ff, B:47:0x0105, B:50:0x00f5, B:52:0x010b, B:53:0x0128, B:56:0x0129, B:58:0x012d, B:61:0x00a6, B:64:0x003d), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void h(defpackage.C3390a13 r9, defpackage.Y03 r10, defpackage.Y03 r11, java.util.HashMap r12) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.A13.h(a13, Y03, Y03, java.util.HashMap):void");
    }

    public static void i(Y03 y03) {
        C3390a13 c3390a13 = y03.h;
        if (y03.h()) {
            return;
        }
        ArrayList arrayList = y03.n;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            i((Y03) arrayList.get(i));
        }
    }

    public static void m(Y03 y03) {
        C3390a13 c3390a13 = y03.h;
        if (y03.h()) {
            return;
        }
        ArrayList arrayList = y03.n;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            m((Y03) arrayList.get(i));
        }
    }

    public static void n(Y03 y03) {
        C3390a13 c3390a13 = y03.h;
        if (y03.h()) {
            return;
        }
        ArrayList arrayList = y03.n;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            n((Y03) arrayList.get(i));
        }
    }

    public final void e(Y03 y03) {
        this.u.a(y03.h, y03, y03.o);
        if (y03.h()) {
            return;
        }
        ArrayList arrayList = y03.n;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            e((Y03) arrayList.get(i));
        }
    }

    public final synchronized void f(Y03 y03) {
        C3390a13 c3390a13 = y03.h;
        ArrayList arrayList = y03.n;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                f((Y03) arrayList.get(i));
            }
        }
    }

    public A13(C10602v13 c10602v13) {
        Looper looper;
        HandlerC6212iE1 handlerC6212iE1 = new HandlerC6212iE1(Looper.getMainLooper());
        this.b = handlerC6212iE1;
        C4513dI1 c4513dI1 = new C4513dI1();
        this.a = c4513dI1;
        boolean z = c10602v13.c;
        this.f = z;
        boolean z2 = c10602v13.g;
        this.j = z2;
        if (z && z2) {
            throw new RuntimeException("Cannot force both sync and async state updates at the same time");
        }
        this.g = c10602v13.d;
        String str = c10602v13.e;
        this.h = str;
        C8176nx c8176nx = new C8176nx(c10602v13.b, c4513dI1, str);
        this.d = c8176nx;
        this.k = c8176nx.d();
        this.e = new C4213cR0(c8176nx);
        C3390a13 c3390a13 = new C3390a13(c10602v13.a);
        c3390a13.q = this;
        new WeakReference(this);
        this.c = c3390a13;
        this.s = new ArrayList();
        this.r = new C11631y13();
        InterfaceC6554jE1 interfaceC6554jE1 = c10602v13.f;
        if (interfaceC6554jE1 == null) {
            synchronized (A13.class) {
                if (w == null) {
                    HandlerThread handlerThread = new HandlerThread("SectionChangeSetThread", 0);
                    handlerThread.start();
                    w = handlerThread.getLooper();
                }
                looper = w;
            }
            interfaceC6554jE1 = new HandlerC6212iE1(looper);
        }
        this.m = new C10945w13(this, interfaceC6554jE1);
        this.l = new C10945w13(this, handlerC6212iE1);
        this.t = new AtomicBoolean(c10602v13.h);
    }

    public final void j(Y03 y03, boolean z, boolean z2, long j, int i) {
        if (y03.h()) {
            return;
        }
        ArrayList arrayList = y03.n;
        int size = arrayList.size();
        int i2 = i;
        for (int i3 = 0; i3 < size; i3++) {
            Y03 y032 = (Y03) arrayList.get(i3);
            j(y032, z, z2, j, i2);
            i2 += y032.m;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(defpackage.Y03 r18, int r19, int r20, int r21, int r22, int r23) {
        /*
            r17 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r12 = r17
            java.util.HashMap r5 = r12.i
            java.lang.String r6 = r0.o
            java.lang.Object r6 = r5.get(r6)
            x13 r6 = (defpackage.C11288x13) r6
            int r7 = r0.m
            if (r6 != 0) goto L25
            x13 r6 = new x13
            r6.<init>()
            java.lang.String r8 = r0.o
            r5.put(r8, r6)
            goto L3f
        L25:
            int r5 = r6.a
            if (r5 != r1) goto L3f
            int r5 = r6.b
            if (r5 != r2) goto L3f
            int r5 = r6.c
            if (r5 != r3) goto L3f
            int r5 = r6.d
            if (r5 != r4) goto L3f
            int r5 = r6.e
            if (r5 != r7) goto L3f
            r5 = 1
            r13 = r23
            if (r13 == r5) goto L41
            return
        L3f:
            r13 = r23
        L41:
            r6.b = r2
            r6.a = r1
            r6.c = r3
            r6.d = r4
            r6.e = r7
            boolean r5 = r18.h()
            if (r5 == 0) goto L52
            return
        L52:
            java.util.ArrayList r0 = r0.n
            int r14 = r0.size()
            r5 = 0
            r11 = 0
        L5a:
            if (r11 >= r14) goto Lac
            java.lang.Object r6 = r0.get(r11)
            Y03 r6 = (defpackage.Y03) r6
            int r7 = r1 - r5
            int r8 = r2 - r5
            int r9 = r3 - r5
            int r10 = r4 - r5
            int r15 = r6.m
            r16 = -1
            if (r7 >= r15) goto L81
            if (r8 >= 0) goto L73
            goto L81
        L73:
            r15 = 0
            int r7 = java.lang.Math.max(r7, r15)
            int r15 = r6.m
            int r15 = r15 + (-1)
            int r8 = java.lang.Math.min(r8, r15)
            goto L84
        L81:
            r7 = r16
            r8 = r7
        L84:
            int r15 = r6.m
            if (r9 >= r15) goto L99
            if (r10 >= 0) goto L8b
            goto L99
        L8b:
            r15 = 0
            int r9 = java.lang.Math.max(r9, r15)
            int r15 = r6.m
            int r15 = r15 + (-1)
            int r10 = java.lang.Math.min(r10, r15)
            goto L9c
        L99:
            r9 = r16
            r10 = r9
        L9c:
            int r15 = r6.m
            int r15 = r15 + r5
            r5 = r17
            r16 = r11
            r11 = r23
            r5.q(r6, r7, r8, r9, r10, r11)
            int r11 = r16 + 1
            r5 = r15
            goto L5a
        Lac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.A13.q(Y03, int, int, int, int, int):void");
    }

    public final synchronized void o(String str, C6383ik3 c6383ik3, String str2) {
        if (this.f) {
            p(str, c6383ik3, str2);
        } else {
            C10945w13 c10945w13 = this.l;
            synchronized (c10945w13) {
                if (c10945w13.h) {
                    c10945w13.h = false;
                    c10945w13.i = -1;
                    c10945w13.j = null;
                    c10945w13.g.c(c10945w13);
                }
            }
            a(str, c6383ik3, false);
            this.l.b(2, str2);
            AbstractC10674vE1.h.addAndGet(1L);
        }
    }

    public final synchronized void p(String str, C6383ik3 c6383ik3, String str2) {
        if (this.j) {
            o(str, c6383ik3, str2);
        } else {
            C10945w13 c10945w13 = this.m;
            synchronized (c10945w13) {
                if (c10945w13.h) {
                    c10945w13.h = false;
                    c10945w13.i = -1;
                    c10945w13.j = null;
                    c10945w13.g.c(c10945w13);
                }
            }
            a(str, c6383ik3, false);
            this.m.b(3, str2);
            AbstractC10674vE1.i.addAndGet(1L);
        }
    }

    public static Y03 g(Y03 y03, boolean z) {
        if (y03 != null) {
            return y03.q(z);
        }
        return null;
    }

    public final synchronized void a(String str, C6383ik3 c6383ik3, boolean z) {
        if (this.n == null && this.o == null) {
            throw new IllegalStateException("State set with no attached Section");
        }
        C11631y13 c11631y13 = this.r;
        HashMap hashMap = c11631y13.a;
        List list = (List) hashMap.get(str);
        if (list == null) {
            list = new ArrayList();
            hashMap.put(str, list);
        }
        list.add(c6383ik3);
        if (!z) {
            HashMap hashMap2 = c11631y13.b;
            List list2 = (List) hashMap2.get(str);
            if (list2 == null) {
                list2 = new ArrayList();
                hashMap2.put(str, list2);
            }
            list2.add(c6383ik3);
        }
        if (z) {
            return;
        }
        if (this.p) {
            int i = this.q + 1;
            this.q = i;
            if (i == 50) {
                E10.a(3, "SectionTree:StateUpdatesFromInsideChangeSetCalculateExceedsThreshold", "Large number of state updates detected which indicates an infinite loop leading to unresponsive apps");
            }
        }
        Y03 y03 = this.o;
        if (y03 == null) {
            this.o = g(this.n, false);
        } else {
            this.o = g(y03, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b A[Catch: all -> 0x0050, TryCatch #2 {all -> 0x0050, blocks: (B:18:0x001a, B:22:0x0038, B:25:0x0044, B:27:0x0048, B:31:0x005b, B:32:0x0070, B:33:0x0072, B:42:0x0081, B:44:0x0084, B:49:0x009f, B:52:0x00a6, B:86:0x0113, B:87:0x0116, B:89:0x011f, B:91:0x0132, B:92:0x013f, B:103:0x016a, B:120:0x016c, B:125:0x016f, B:129:0x0172, B:131:0x0173, B:134:0x0183, B:137:0x0189, B:143:0x017a, B:145:0x019e, B:146:0x019f, B:152:0x01a2, B:46:0x0098, B:20:0x001b, B:21:0x0037, B:94:0x0140, B:96:0x0158, B:97:0x0165, B:99:0x0161, B:56:0x00ac, B:61:0x00b7, B:64:0x00c4, B:66:0x00c8, B:71:0x00d5, B:74:0x00e0, B:79:0x00ec, B:81:0x0104, B:82:0x0107, B:83:0x010e, B:108:0x00e6, B:109:0x00e7, B:51:0x00a2, B:35:0x0073, B:37:0x0077, B:38:0x007a, B:40:0x007e), top: B:17:0x001a, inners: #0, #1, #5, #6, #7, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ec A[Catch: all -> 0x010b, TryCatch #6 {all -> 0x010b, blocks: (B:56:0x00ac, B:61:0x00b7, B:64:0x00c4, B:66:0x00c8, B:71:0x00d5, B:74:0x00e0, B:79:0x00ec, B:81:0x0104, B:82:0x0107, B:83:0x010e, B:108:0x00e6, B:109:0x00e7, B:73:0x00d6), top: B:55:0x00ac, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(int r17, java.lang.String r18, defpackage.GK3 r19) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.A13.d(int, java.lang.String, GK3):void");
    }

    public final void l(GK3 gk3) {
        boolean z = this.k;
        if (z) {
            if (!z) {
                throw new IllegalStateException("Must use UIThread-only variant when background change sets are not enabled.");
            }
            synchronized (this) {
                c(this.n, this.s);
                this.s.clear();
            }
            if (LK3.b()) {
                this.e.getClass();
                return;
            } else {
                this.b.getClass();
                this.b.post(new C9916t13(this, gk3));
                return;
            }
        }
        if (LK3.b()) {
            try {
                b();
            } catch (IndexOutOfBoundsException e) {
                throw new RuntimeException(AbstractC4199cO1.a("Index out of bounds while applying a new section. This indicates a bad diff was sent to the RecyclerBinder. See https://bit.ly/39Oq0Hs for more information. Debug info: ", k(this), e.getMessage()), e);
            }
        } else {
            this.b.getClass();
            C9573s13 c9573s13 = new C9573s13(this, gk3);
            if (!this.t.compareAndSet(true, false)) {
                this.b.post(c9573s13);
            } else {
                this.b.postAtFrontOfQueue(c9573s13);
            }
        }
    }

    public final void b() {
        ArrayList arrayList;
        Y03 y03;
        LK3.a();
        if (this.k) {
            throw new IllegalStateException("Cannot use UIThread-only variant when background change sets are enabled.");
        }
        synchronized (this) {
            arrayList = new ArrayList(this.s);
            this.s.clear();
            y03 = this.n;
        }
        c(y03, arrayList);
        this.e.getClass();
    }

    public final void c(Y03 y03, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        try {
            int size = arrayList.size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                MI mi = (MI) arrayList.get(i);
                if (mi.a.size() > 0) {
                    int size2 = mi.a.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        AI ai = (AI) mi.a.get(i2);
                        switch (ai.a) {
                            case -3:
                                this.d.n(ai.b, ai.d);
                                break;
                            case -2:
                                this.d.l(ai.f, ai.b, ai.d);
                                break;
                            case -1:
                                this.d.g(ai.f, ai.b, ai.d);
                                break;
                            case 0:
                                this.d.m(ai.b, ai.c);
                                break;
                            case 1:
                                this.d.i(ai.b, ai.e);
                                break;
                            case 2:
                                this.d.k(ai.b, ai.e);
                                break;
                            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                                this.d.a(ai.b);
                                break;
                        }
                        z = true;
                    }
                    this.d.c();
                }
                arrayList2.addAll(mi.a);
            }
            this.d.o(z, new C10259u13(this, new OI(arrayList2), z, y03));
        } catch (Throwable th) {
            throw th;
        }
    }

    public static String k(A13 a13) {
        String sb;
        synchronized (a13) {
            StringBuilder sb2 = new StringBuilder("tag: ");
            sb2.append(a13.h);
            sb2.append(", currentSection.size: ");
            Y03 y03 = a13.n;
            sb2.append(y03 != null ? Integer.valueOf(y03.m) : null);
            sb2.append(", currentSection.name: ");
            Y03 y032 = a13.n;
            sb2.append(y032 != null ? y032.j : null);
            sb2.append(", nextSection.size: ");
            Y03 y033 = a13.o;
            sb2.append(y033 != null ? Integer.valueOf(y033.m) : null);
            sb2.append(", nextSection.name: ");
            Y03 y034 = a13.o;
            sb2.append(y034 != null ? y034.j : null);
            sb2.append(", pendingChangeSets.size: ");
            sb2.append(a13.s.size());
            sb2.append(", pendingStateUpdates.size: ");
            sb2.append(a13.r.a.size());
            sb2.append(", pendingNonLazyStateUpdates.size: ");
            sb2.append(a13.r.b.size());
            sb2.append("\n");
            sb = sb2.toString();
        }
        return sb;
    }
}
