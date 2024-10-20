package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.d;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Oj0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1865Oj0 implements Runnable {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ C3165Yj0 g;

    public RunnableC1865Oj0(C3165Yj0 c3165Yj0, ArrayList arrayList) {
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
                C3035Xj0 c3035Xj0 = (C3035Xj0) it.next();
                d dVar = c3035Xj0.a;
                c3165Yj0.getClass();
                View view = dVar.a;
                int i = c3035Xj0.d - c3035Xj0.b;
                int i2 = c3035Xj0.e - c3035Xj0.c;
                if (i != 0) {
                    view.animate().translationX(0.0f);
                }
                if (i2 != 0) {
                    view.animate().translationY(0.0f);
                }
                ViewPropertyAnimator animate = view.animate();
                c3165Yj0.p.add(dVar);
                animate.setDuration(c3165Yj0.e).setListener(new C2515Tj0(c3165Yj0, dVar, i, view, i2, animate)).start();
            } else {
                arrayList.clear();
                c3165Yj0.m.remove(arrayList);
                return;
            }
        }
    }
}
