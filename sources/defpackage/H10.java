package defpackage;

import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class H10 implements InterfaceC6416iq0, InterfaceC7103kq0 {
    public C1967Pd2 a;
    public volatile boolean g;

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        if (this.g) {
            return;
        }
        synchronized (this) {
            if (this.g) {
                return;
            }
            this.g = true;
            C1967Pd2 c1967Pd2 = this.a;
            this.a = null;
            d(c1967Pd2);
        }
    }

    @Override // defpackage.InterfaceC7103kq0
    public final boolean a(InterfaceC6416iq0 interfaceC6416iq0) {
        if (interfaceC6416iq0 == null) {
            throw new NullPointerException("disposable is null");
        }
        if (!this.g) {
            synchronized (this) {
                if (!this.g) {
                    C1967Pd2 c1967Pd2 = this.a;
                    if (c1967Pd2 == null) {
                        c1967Pd2 = new C1967Pd2();
                        this.a = c1967Pd2;
                    }
                    c1967Pd2.a(interfaceC6416iq0);
                    return true;
                }
            }
        }
        interfaceC6416iq0.dispose();
        return false;
    }

    @Override // defpackage.InterfaceC7103kq0
    public final boolean b(InterfaceC6416iq0 interfaceC6416iq0) {
        if (!c(interfaceC6416iq0)) {
            return false;
        }
        interfaceC6416iq0.dispose();
        return true;
    }

    public static void d(C1967Pd2 c1967Pd2) {
        if (c1967Pd2 == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : c1967Pd2.d) {
            if (obj instanceof InterfaceC6416iq0) {
                try {
                    ((InterfaceC6416iq0) obj).dispose();
                } catch (Throwable th) {
                    AbstractC4148cE0.a(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
        }
        if (arrayList != null) {
            if (arrayList.size() == 1) {
                throw ZD0.a((Throwable) arrayList.get(0));
            }
            throw new M10(arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a A[Catch: all -> 0x004e, DONT_GENERATE, TryCatch #0 {, blocks: (B:9:0x000b, B:11:0x000f, B:13:0x0011, B:15:0x0015, B:21:0x004a, B:23:0x002b, B:25:0x0031, B:27:0x0035, B:29:0x003d, B:32:0x0043, B:35:0x004c), top: B:8:0x000b }] */
    @Override // defpackage.InterfaceC7103kq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(defpackage.InterfaceC6416iq0 r8) {
        /*
            r7 = this;
            java.lang.String r0 = "disposables is null"
            if (r8 == 0) goto L51
            boolean r0 = r7.g
            r1 = 0
            if (r0 == 0) goto La
            return r1
        La:
            monitor-enter(r7)
            boolean r0 = r7.g     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto L11
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L4e
            return r1
        L11:
            Pd2 r0 = r7.a     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto L4c
            java.lang.Object[] r2 = r0.d     // Catch: java.lang.Throwable -> L4e
            int r3 = r0.a     // Catch: java.lang.Throwable -> L4e
            int r4 = r8.hashCode()     // Catch: java.lang.Throwable -> L4e
            r5 = -1640531527(0xffffffff9e3779b9, float:-9.713111E-21)
            int r4 = r4 * r5
            int r5 = r4 >>> 16
            r4 = r4 ^ r5
            r4 = r4 & r3
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L4e
            r6 = 1
            if (r5 != 0) goto L2b
            goto L3b
        L2b:
            boolean r5 = r5.equals(r8)     // Catch: java.lang.Throwable -> L4e
            if (r5 == 0) goto L35
            r0.b(r4, r3, r2)     // Catch: java.lang.Throwable -> L4e
            goto L46
        L35:
            int r4 = r4 + r6
            r4 = r4 & r3
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L4e
            if (r5 != 0) goto L3d
        L3b:
            r8 = r1
            goto L47
        L3d:
            boolean r5 = r5.equals(r8)     // Catch: java.lang.Throwable -> L4e
            if (r5 == 0) goto L35
            r0.b(r4, r3, r2)     // Catch: java.lang.Throwable -> L4e
        L46:
            r8 = r6
        L47:
            if (r8 != 0) goto L4a
            goto L4c
        L4a:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L4e
            return r6
        L4c:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L4e
            return r1
        L4e:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L4e
            throw r8
        L51:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.H10.c(iq0):boolean");
    }
}
