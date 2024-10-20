package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.d;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Qj0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2125Qj0 implements Runnable {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ C3165Yj0 g;

    public RunnableC2125Qj0(C3165Yj0 c3165Yj0, ArrayList arrayList) {
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
                d dVar = (d) it.next();
                c3165Yj0.getClass();
                View view = dVar.a;
                ViewPropertyAnimator animate = view.animate();
                c3165Yj0.o.add(dVar);
                animate.alpha(1.0f).setDuration(c3165Yj0.c).setListener(new C2385Sj0(view, animate, c3165Yj0, dVar)).start();
            } else {
                arrayList.clear();
                c3165Yj0.l.remove(arrayList);
                return;
            }
        }
    }
}
