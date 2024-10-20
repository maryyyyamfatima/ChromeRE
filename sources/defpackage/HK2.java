package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class HK2 extends AbstractC8991qK2 {
    public final /* synthetic */ RecyclerView a;

    public HK2(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // defpackage.AbstractC8991qK2
    public final void a() {
        RecyclerView recyclerView = this.a;
        recyclerView.j(null);
        recyclerView.n0.f = true;
        recyclerView.b0(true);
        if (recyclerView.j.g()) {
            return;
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:            if (r2.size() == 1) goto L48;     */
    @Override // defpackage.AbstractC8991qK2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.lang.Object r5, int r6, int r7) {
        /*
            r4 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r4.a
            r1 = 0
            r0.j(r1)
            B6 r0 = r0.j
            r1 = 1
            if (r7 >= r1) goto Lf
            r0.getClass()
            goto L25
        Lf:
            java.util.ArrayList r2 = r0.b
            r3 = 4
            A6 r5 = r0.h(r5, r3, r6, r7)
            r2.add(r5)
            int r5 = r0.f
            r5 = r5 | r3
            r0.f = r5
            int r5 = r2.size()
            if (r5 != r1) goto L25
            goto L26
        L25:
            r1 = 0
        L26:
            if (r1 == 0) goto L2b
            r4.g()
        L2b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.HK2.c(java.lang.Object, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:            if (r3.size() == 1) goto L48;     */
    @Override // defpackage.AbstractC8991qK2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(int r5, int r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r4.a
            r1 = 0
            r0.j(r1)
            B6 r0 = r0.j
            r2 = 1
            if (r6 >= r2) goto Lf
            r0.getClass()
            goto L24
        Lf:
            java.util.ArrayList r3 = r0.b
            A6 r5 = r0.h(r1, r2, r5, r6)
            r3.add(r5)
            int r5 = r0.f
            r5 = r5 | r2
            r0.f = r5
            int r5 = r3.size()
            if (r5 != r2) goto L24
            goto L25
        L24:
            r2 = 0
        L25:
            if (r2 == 0) goto L2a
            r4.g()
        L2a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.HK2.d(int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:            if (r3.size() == 1) goto L48;     */
    @Override // defpackage.AbstractC8991qK2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(int r6, int r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r5.a
            r1 = 0
            r0.j(r1)
            B6 r0 = r0.j
            r2 = 1
            if (r7 >= r2) goto Lf
            r0.getClass()
            goto L25
        Lf:
            java.util.ArrayList r3 = r0.b
            r4 = 2
            A6 r6 = r0.h(r1, r4, r6, r7)
            r3.add(r6)
            int r6 = r0.f
            r6 = r6 | r4
            r0.f = r6
            int r6 = r3.size()
            if (r6 != r2) goto L25
            goto L26
        L25:
            r2 = 0
        L26:
            if (r2 == 0) goto L2b
            r5.g()
        L2b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.HK2.f(int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:            if (r2.size() == 1) goto L48;     */
    @Override // defpackage.AbstractC8991qK2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(int r5, int r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r4.a
            r1 = 0
            r0.j(r1)
            B6 r0 = r0.j
            r0.getClass()
            if (r5 != r6) goto Le
            goto L26
        Le:
            java.util.ArrayList r2 = r0.b
            r3 = 8
            A6 r5 = r0.h(r1, r3, r5, r6)
            r2.add(r5)
            int r5 = r0.f
            r5 = r5 | r3
            r0.f = r5
            int r5 = r2.size()
            r6 = 1
            if (r5 != r6) goto L26
            goto L27
        L26:
            r6 = 0
        L27:
            if (r6 == 0) goto L2c
            r4.g()
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.HK2.e(int, int):void");
    }

    public final void g() {
        boolean z = RecyclerView.K0;
        RecyclerView recyclerView = this.a;
        if (z && recyclerView.z && recyclerView.y) {
            WeakHashMap weakHashMap = Ec4.a;
            recyclerView.postOnAnimation(recyclerView.n);
        } else {
            recyclerView.G = true;
            recyclerView.requestLayout();
        }
    }
}
