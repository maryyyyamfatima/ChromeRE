package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oJ2 */
/* loaded from: classes.dex */
public final class RunnableC8300oJ2 implements Runnable {
    public final /* synthetic */ KJ2 a;

    public RunnableC8300oJ2(KJ2 kj2) {
        this.a = kj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        KJ2 kj2 = this.a;
        RecyclerView recyclerView = kj2.U;
        C4292cf4 c4292cf4 = kj2.j0;
        if (recyclerView == null || !recyclerView.Q()) {
            if (c4292cf4.d()) {
                c4292cf4.b(1);
            }
            kj2.l0 = 0;
            return;
        }
        if (!kj2.U.isAttachedToWindow() || kj2.U.getVisibility() == 8) {
            kj2.l0 = 0;
            return;
        }
        int i = kj2.l0;
        if (i >= 3) {
            kj2.l0 = 0;
            if (c4292cf4.d()) {
                c4292cf4.b(1);
                return;
            }
            return;
        }
        kj2.l0 = i + 1;
        RecyclerView recyclerView2 = kj2.U;
        WeakHashMap weakHashMap = Ec4.a;
        recyclerView2.postOnAnimation(kj2.n0);
    }
}
