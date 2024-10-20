package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.d;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Pj0 */
/* loaded from: classes.dex */
public final class RunnableC1995Pj0 implements Runnable {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ C3165Yj0 g;

    public RunnableC1995Pj0(C3165Yj0 c3165Yj0, ArrayList arrayList) {
        this.g = c3165Yj0;
        this.a = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.a;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            C3165Yj0 c3165Yj0 = this.g;
            if (hasNext) {
                C2905Wj0 c2905Wj0 = (C2905Wj0) it.next();
                c3165Yj0.getClass();
                d dVar = c2905Wj0.a;
                View view = dVar == null ? null : dVar.a;
                d dVar2 = c2905Wj0.b;
                View view2 = dVar2 != null ? dVar2.a : null;
                ArrayList arrayList2 = c3165Yj0.r;
                if (view != null) {
                    ViewPropertyAnimator duration = view.animate().setDuration(c3165Yj0.f);
                    arrayList2.add(c2905Wj0.a);
                    duration.translationX(c2905Wj0.e - c2905Wj0.c);
                    duration.translationY(c2905Wj0.f - c2905Wj0.d);
                    duration.alpha(0.0f).setListener(new C2645Uj0(c3165Yj0, c2905Wj0, duration, view)).start();
                }
                if (view2 != null) {
                    ViewPropertyAnimator animate = view2.animate();
                    arrayList2.add(c2905Wj0.b);
                    animate.translationX(0.0f).translationY(0.0f).setDuration(c3165Yj0.f).alpha(1.0f).setListener(new C2775Vj0(c3165Yj0, c2905Wj0, animate, view2)).start();
                }
            } else {
                arrayList.clear();
                c3165Yj0.n.remove(arrayList);
                return;
            }
        }
    }
}
