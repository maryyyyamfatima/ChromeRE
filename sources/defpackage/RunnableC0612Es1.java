package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Es1 */
/* loaded from: classes.dex */
public final class RunnableC0612Es1 implements Runnable {
    public final /* synthetic */ C0482Ds1 a;
    public final /* synthetic */ C1521Ls1 g;

    public RunnableC0612Es1(C1521Ls1 c1521Ls1, C0482Ds1 c0482Ds1, int i) {
        this.g = c1521Ls1;
        this.a = c0482Ds1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1521Ls1 c1521Ls1 = this.g;
        RecyclerView recyclerView = c1521Ls1.w;
        if (recyclerView == null || !recyclerView.isAttachedToWindow()) {
            return;
        }
        C0482Ds1 c0482Ds1 = this.a;
        if (c0482Ds1.p) {
            return;
        }
        d dVar = c0482Ds1.j;
        if (dVar.f() != -1) {
            AbstractC2348Sb3 abstractC2348Sb3 = c1521Ls1.w.S;
            if (abstractC2348Sb3 == null || !abstractC2348Sb3.l(null)) {
                ArrayList arrayList = c1521Ls1.u;
                int size = arrayList.size();
                boolean z = false;
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    if (!((C0482Ds1) arrayList.get(i)).q) {
                        z = true;
                        break;
                    }
                    i++;
                }
                if (!z) {
                    c1521Ls1.r.j(dVar);
                    return;
                }
            }
            c1521Ls1.w.post(this);
        }
    }
}
