package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Yb4 implements InterfaceC9091qd4 {
    public final C11611xy0 b;
    public final /* synthetic */ Zb4 f;
    public long a = -1;
    public final HashSet c = new HashSet();
    public final C6854k61 d = new C6854k61();
    public final HashMap e = new HashMap();

    /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(android.view.View r9) {
        /*
            r8 = this;
            r0 = 2130773948(0x7f0107bc, float:1.7151057E38)
            java.lang.Object r0 = r9.getTag(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r1 = -1
            if (r0 == 0) goto L11
            int r0 = r0.intValue()
            goto L12
        L11:
            r0 = r1
        L12:
            r2 = 0
            if (r0 == r1) goto La0
            xy0 r1 = r8.b
            yy0 r1 = r1.a
            androidx.recyclerview.widget.RecyclerView r1 = r1.j
            if (r1 == 0) goto La0
            Zb4 r3 = r8.f
            Fe4 r3 = r3.b
            r3.getClass()
            android.graphics.Rect r3 = defpackage.Fe4.a(r9)
            android.graphics.Rect r4 = defpackage.Fe4.a(r1)
            boolean r5 = r4.intersect(r3)
            r6 = 0
            if (r5 == 0) goto L49
            int r5 = r3.height()
            int r3 = r3.width()
            int r3 = r3 * r5
            int r5 = r4.height()
            int r4 = r4.width()
            int r4 = r4 * r5
            float r4 = (float) r4
            float r3 = (float) r3
            float r4 = r4 / r3
            goto L4a
        L49:
            r4 = r6
        L4a:
            r3 = 1056964608(0x3f000000, float:0.5)
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 > 0) goto L7b
            android.graphics.Rect r4 = defpackage.Fe4.a(r9)
            android.graphics.Rect r1 = defpackage.Fe4.a(r1)
            int r5 = r1.height()
            int r7 = r1.width()
            int r7 = r7 * r5
            boolean r4 = r1.intersect(r4)
            if (r4 == 0) goto L74
            int r4 = r1.height()
            int r1 = r1.width()
            int r1 = r1 * r4
            float r1 = (float) r1
            float r4 = (float) r7
            float r6 = r1 / r4
        L74:
            int r1 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r1 <= 0) goto L79
            goto L7b
        L79:
            r1 = r2
            goto L7c
        L7b:
            r1 = 1
        L7c:
            if (r1 == 0) goto La0
            j31 r1 = defpackage.Zb4.e
            g31 r1 = r1.b()
            java.lang.String r3 = "com/google/chrome/elements/actions/view/impl/ViewActionsLoggerImpl$ContainerLogger"
            java.lang.String r4 = "traverseViewHierarchy"
            r5 = 265(0x109, float:3.71E-43)
            java.lang.String r6 = "ViewActionsLoggerImpl.java"
            kI1 r1 = r1.g(r3, r5, r4, r6)
            g31 r1 = (defpackage.InterfaceC5462g31) r1
            java.lang.String r3 = "Start tracking contentKey=%s"
            r1.d(r0, r3)
            java.util.HashSet r1 = r8.c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.add(r0)
        La0:
            boolean r0 = r9 instanceof android.view.ViewGroup
            if (r0 == 0) goto Lb7
        La4:
            r0 = r9
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r1 = r0.getChildCount()
            if (r2 >= r1) goto Lb7
            android.view.View r0 = r0.getChildAt(r2)
            r8.k(r0)
            int r2 = r2 + 1
            goto La4
        Lb7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Yb4.k(android.view.View):void");
    }

    public Yb4(Zb4 zb4, C11611xy0 c11611xy0) {
        this.f = zb4;
        this.b = c11611xy0;
    }

    public final void j() {
        if (this.a < 0) {
            ((InterfaceC5462g31) Zb4.e.b().g("com/google/chrome/elements/actions/view/impl/ViewActionsLoggerImpl$ContainerLogger", 206, "stopStableViewport", "ViewActionsLoggerImpl.java")).h("Viewport not stable");
            return;
        }
        ((InterfaceC5462g31) Zb4.e.b().g("com/google/chrome/elements/actions/view/impl/ViewActionsLoggerImpl$ContainerLogger", 210, "stopStableViewport", "ViewActionsLoggerImpl.java")).h("Stop tracking content.");
        this.f.c.getClass();
        long currentTimeMillis = System.currentTimeMillis() - this.a;
        HashSet hashSet = this.c;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C6492j31 c6492j31 = Zb4.e;
            ((InterfaceC5462g31) c6492j31.b().g("com/google/chrome/elements/actions/view/impl/ViewActionsLoggerImpl$ContainerLogger", 213, "stopStableViewport", "ViewActionsLoggerImpl.java")).n(currentTimeMillis, num);
            HashMap hashMap = this.e;
            if (hashMap.containsKey(num)) {
                C2409So c2409So = (C2409So) hashMap.get(num);
                c2409So.getClass();
                long j = c2409So.a + currentTimeMillis;
                byte b = (byte) (1 | 1);
                C8908q5 c8908q5 = c2409So.b;
                CS cs = c2409So.c;
                if (b != 1 || c8908q5 == null || cs == null) {
                    StringBuilder sb = new StringBuilder();
                    if ((1 & b) == 0) {
                        sb.append(" durationMs");
                    }
                    if (c8908q5 == null) {
                        sb.append(" payload");
                    }
                    if (cs == null) {
                        sb.append(" loggingParameters");
                    }
                    throw new IllegalStateException("Missing required properties:".concat(String.valueOf(sb)));
                }
                hashMap.put(num, new C2409So(j, c8908q5, cs));
            } else {
                ((InterfaceC5462g31) c6492j31.f().g("com/google/chrome/elements/actions/view/impl/ViewActionsLoggerImpl$ContainerLogger", 223, "stopStableViewport", "ViewActionsLoggerImpl.java")).o(num, "Missing content data for tracked contentKey=%s");
            }
        }
        this.a = -1L;
        hashSet.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:            if ((1 & r5) != 0) goto L194;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0068, code lost:            r13.append(" durationMs");     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:            if (r6 != null) goto L196;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:            r13.append(" payload");     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:            if (r7 != null) goto L198;     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:            r13.append(" loggingParameters");     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:            throw new java.lang.IllegalStateException("Missing required properties:".concat(java.lang.String.valueOf(r13)));     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(boolean r13) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Yb4.h(boolean):void");
    }

    public final void i() {
        if (!this.d.isEmpty()) {
            if (this.a > 0) {
                ((InterfaceC5462g31) Zb4.e.b().g("com/google/chrome/elements/actions/view/impl/ViewActionsLoggerImpl$ContainerLogger", 192, "startStableViewport", "ViewActionsLoggerImpl.java")).h("Viewport already stable");
                return;
            }
            ((InterfaceC5462g31) Zb4.e.b().g("com/google/chrome/elements/actions/view/impl/ViewActionsLoggerImpl$ContainerLogger", 196, "startStableViewport", "ViewActionsLoggerImpl.java")).h("Start tracking content.");
            this.f.c.getClass();
            this.a = System.currentTimeMillis();
            k(this.b.a.j);
        }
    }

    @Override // defpackage.InterfaceC9091qd4
    public final void c() {
        i();
    }

    @Override // defpackage.InterfaceC9091qd4
    public final void f() {
        j();
        h(false);
        this.e.clear();
        this.c.clear();
    }

    @Override // defpackage.InterfaceC9091qd4
    public final void g() {
        j();
    }

    @Override // defpackage.InterfaceC9091qd4
    public final void d(int i, int i2) {
        i();
    }

    @Override // defpackage.InterfaceC9091qd4
    public final void a() {
        j();
        i();
    }

    @Override // defpackage.InterfaceC9091qd4
    public final void e(int i, int i2) {
        j();
        i();
    }

    @Override // defpackage.InterfaceC9091qd4
    public final void b() {
        h(true);
        this.e.clear();
        this.c.clear();
    }
}
