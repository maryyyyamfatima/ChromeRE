package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lK2 */
/* loaded from: classes.dex */
public final class C7273lK2 {
    public final /* synthetic */ RecyclerView a;

    public C7273lK2(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final void b(d dVar, C10019tK2 c10019tK2, C10019tK2 c10019tK22) {
        boolean z;
        RecyclerView recyclerView = this.a;
        recyclerView.h.l(dVar);
        recyclerView.f(dVar);
        dVar.s(false);
        AbstractC2348Sb3 abstractC2348Sb3 = recyclerView.S;
        abstractC2348Sb3.getClass();
        int i = c10019tK2.a;
        int i2 = c10019tK2.b;
        View view = dVar.a;
        int left = c10019tK22 == null ? view.getLeft() : c10019tK22.a;
        int top = c10019tK22 == null ? view.getTop() : c10019tK22.b;
        if (!dVar.n() && (i != left || i2 != top)) {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z = abstractC2348Sb3.d(dVar, i, i2, left, top);
        } else {
            abstractC2348Sb3.e(dVar);
            z = true;
        }
        if (z) {
            recyclerView.Z();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(androidx.recyclerview.widget.d r9, defpackage.C10019tK2 r10, defpackage.C10019tK2 r11) {
        /*
            r8 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r8.a
            r0.getClass()
            r1 = 0
            r9.s(r1)
            Sb3 r2 = r0.S
            if (r10 == 0) goto L26
            r2.getClass()
            int r4 = r10.a
            int r6 = r11.a
            if (r4 != r6) goto L1c
            int r1 = r10.b
            int r3 = r11.b
            if (r1 == r3) goto L26
        L1c:
            int r5 = r10.b
            int r7 = r11.b
            r3 = r9
            boolean r9 = r2.d(r3, r4, r5, r6, r7)
            goto L2a
        L26:
            r2.a(r9)
            r9 = 1
        L2a:
            if (r9 == 0) goto L2f
            r0.Z()
        L2f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7273lK2.a(androidx.recyclerview.widget.d, tK2, tK2):void");
    }
}
