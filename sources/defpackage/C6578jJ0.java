package defpackage;

import java.util.HashMap;
import java.util.HashSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jJ0 */
/* loaded from: classes.dex */
public final class C6578jJ0 implements InterfaceC2376Sh1 {
    public final C6922kJ0 a;
    public boolean d = true;
    public final HashSet b = new HashSet();
    public final HashMap c = new HashMap();

    @Override // defpackage.InterfaceC2376Sh1
    public final void b(int i) {
    }

    @Override // defpackage.InterfaceC2376Sh1
    public final void e(int i) {
    }

    public C6578jJ0(C6922kJ0 c6922kJ0) {
        this.a = c6922kJ0;
    }

    @Override // defpackage.InterfaceC2376Sh1
    public final void c(int i) {
        g(i, true);
    }

    @Override // defpackage.InterfaceC2376Sh1
    public final void a(int i) {
        g(i, false);
    }

    @Override // defpackage.InterfaceC2376Sh1
    public final void d(int i) {
        C6922kJ0 c6922kJ0 = this.a;
        if (c6922kJ0.h) {
            HashSet hashSet = this.b;
            if (hashSet.isEmpty()) {
                c6922kJ0.t(AbstractC2629Ug.h.a(), System.nanoTime());
            }
            if (this.d) {
                hashSet.add(Integer.valueOf(i));
            }
        }
    }

    @Override // defpackage.InterfaceC2376Sh1
    public final void f(int i) {
        C6922kJ0 c6922kJ0 = this.a;
        if (c6922kJ0.h) {
            long nanoTime = System.nanoTime();
            C2369Sg c2369Sg = new C2369Sg(AbstractC2629Ug.i.a);
            c2369Sg.e = new C3242Yy2(4);
            c2369Sg.f = new C3242Yy2("DISCOVER_IMAGES_LOAD");
            c6922kJ0.t(c2369Sg, nanoTime);
            c6922kJ0.c(2, System.nanoTime());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(int r6, boolean r7) {
        /*
            r5 = this;
            kJ0 r0 = r5.a
            boolean r1 = r0.h
            if (r1 != 0) goto L7
            return
        L7:
            java.util.HashMap r1 = r5.c
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r1.put(r6, r7)
            java.util.Set r6 = r1.keySet()
            java.util.HashSet r7 = r5.b
            boolean r6 = r6.containsAll(r7)
            if (r6 != 0) goto L21
            return
        L21:
            java.util.Iterator r6 = r7.iterator()
            r2 = 0
        L26:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L49
            java.lang.Object r3 = r6.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r3 = r1.get(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L26
            int r2 = r2 + 1
            goto L26
        L49:
            int r6 = r7.size()
            r7 = 4
            if (r2 != r6) goto L51
            goto L56
        L51:
            if (r2 <= 0) goto L55
            r6 = 3
            goto L57
        L55:
            r7 = 2
        L56:
            r6 = r7
        L57:
            long r1 = java.lang.System.nanoTime()
            Xg r3 = defpackage.AbstractC2629Ug.i
            if (r6 == 0) goto L8b
            int r6 = r6 + (-1)
            Sg r4 = new Sg
            b30 r3 = r3.a
            r4.<init>(r3)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            Yy2 r3 = new Yy2
            r3.<init>(r6)
            r4.e = r3
            Yy2 r6 = new Yy2
            java.lang.String r3 = "DISCOVER_IMAGES_LOAD"
            r6.<init>(r3)
            r4.f = r6
            r0.t(r4, r1)
            long r1 = java.lang.System.nanoTime()
            int r6 = defpackage.AbstractC3060Xo0.a(r7)
            r0.c(r6, r1)
            return
        L8b:
            r6 = 0
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6578jJ0.g(int, boolean):void");
    }
}
