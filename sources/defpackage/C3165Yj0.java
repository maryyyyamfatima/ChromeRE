package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Yj0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3165Yj0 extends AbstractC2348Sb3 {
    public static TimeInterpolator s;
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public final ArrayList j = new ArrayList();
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();
    public final ArrayList n = new ArrayList();
    public final ArrayList o = new ArrayList();
    public final ArrayList p = new ArrayList();
    public final ArrayList q = new ArrayList();
    public final ArrayList r = new ArrayList();

    @Override // defpackage.AbstractC2348Sb3
    public final void m() {
        long j;
        ArrayList arrayList = this.h;
        boolean z = !arrayList.isEmpty();
        ArrayList arrayList2 = this.j;
        boolean z2 = !arrayList2.isEmpty();
        ArrayList arrayList3 = this.k;
        boolean z3 = !arrayList3.isEmpty();
        ArrayList arrayList4 = this.i;
        boolean z4 = !arrayList4.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator it = arrayList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                j = this.d;
                if (!hasNext) {
                    break;
                }
                d dVar = (d) it.next();
                View view = dVar.a;
                ViewPropertyAnimator animate = view.animate();
                this.q.add(dVar);
                animate.setDuration(j).alpha(0.0f).setListener(new C2255Rj0(view, animate, this, dVar)).start();
            }
            arrayList.clear();
            if (z2) {
                ArrayList arrayList5 = new ArrayList();
                arrayList5.addAll(arrayList2);
                this.m.add(arrayList5);
                arrayList2.clear();
                RunnableC1865Oj0 runnableC1865Oj0 = new RunnableC1865Oj0(this, arrayList5);
                if (z) {
                    View view2 = ((C3035Xj0) arrayList5.get(0)).a.a;
                    WeakHashMap weakHashMap = Ec4.a;
                    view2.postOnAnimationDelayed(runnableC1865Oj0, j);
                } else {
                    runnableC1865Oj0.run();
                }
            }
            if (z3) {
                ArrayList arrayList6 = new ArrayList();
                arrayList6.addAll(arrayList3);
                this.n.add(arrayList6);
                arrayList3.clear();
                RunnableC1995Pj0 runnableC1995Pj0 = new RunnableC1995Pj0(this, arrayList6);
                if (z) {
                    View view3 = ((C2905Wj0) arrayList6.get(0)).a.a;
                    WeakHashMap weakHashMap2 = Ec4.a;
                    view3.postOnAnimationDelayed(runnableC1995Pj0, j);
                } else {
                    runnableC1995Pj0.run();
                }
            }
            if (z4) {
                ArrayList arrayList7 = new ArrayList();
                arrayList7.addAll(arrayList4);
                this.l.add(arrayList7);
                arrayList4.clear();
                RunnableC2125Qj0 runnableC2125Qj0 = new RunnableC2125Qj0(this, arrayList7);
                if (z || z2 || z3) {
                    if (!z) {
                        j = 0;
                    }
                    long max = Math.max(z2 ? this.e : 0L, z3 ? this.f : 0L) + j;
                    View view4 = ((d) arrayList7.get(0)).a;
                    WeakHashMap weakHashMap3 = Ec4.a;
                    view4.postOnAnimationDelayed(runnableC2125Qj0, max);
                    return;
                }
                runnableC2125Qj0.run();
            }
        }
    }

    @Override // defpackage.AbstractC2348Sb3
    public final void e(d dVar) {
        r(dVar);
        this.h.add(dVar);
    }

    @Override // defpackage.AbstractC2348Sb3
    public final void a(d dVar) {
        r(dVar);
        dVar.a.setAlpha(0.0f);
        this.i.add(dVar);
    }

    @Override // defpackage.AbstractC2348Sb3
    public final boolean d(d dVar, int i, int i2, int i3, int i4) {
        View view = dVar.a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) dVar.a.getTranslationY());
        r(dVar);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 != 0 || i6 != 0) {
            if (i5 != 0) {
                view.setTranslationX(-i5);
            }
            if (i6 != 0) {
                view.setTranslationY(-i6);
            }
            this.j.add(new C3035Xj0(dVar, translationX, translationY, i3, i4));
            return true;
        }
        h(dVar);
        return false;
    }

    @Override // defpackage.AbstractC2348Sb3
    public final boolean b(d dVar, d dVar2, int i, int i2, int i3, int i4) {
        if (dVar == dVar2) {
            return d(dVar, i, i2, i3, i4);
        }
        View view = dVar.a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        r(dVar);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        r(dVar2);
        float f = -((int) ((i3 - i) - translationX));
        View view2 = dVar2.a;
        view2.setTranslationX(f);
        view2.setTranslationY(-((int) ((i4 - i2) - translationY)));
        view2.setAlpha(0.0f);
        this.k.add(new C2905Wj0(dVar, dVar2, i, i2, i3, i4));
        return true;
    }

    public final void p(d dVar, ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            C2905Wj0 c2905Wj0 = (C2905Wj0) arrayList.get(size);
            if (q(c2905Wj0, dVar) && c2905Wj0.a == null && c2905Wj0.b == null) {
                arrayList.remove(c2905Wj0);
            }
        }
    }

    public final boolean q(C2905Wj0 c2905Wj0, d dVar) {
        if (c2905Wj0.b == dVar) {
            c2905Wj0.b = null;
        } else {
            if (c2905Wj0.a != dVar) {
                return false;
            }
            c2905Wj0.a = null;
        }
        dVar.a.setAlpha(1.0f);
        View view = dVar.a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        h(dVar);
        return true;
    }

    @Override // defpackage.AbstractC2348Sb3
    public void i(d dVar) {
        View view = dVar.a;
        view.animate().cancel();
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C3035Xj0) arrayList.get(size)).a == dVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                h(dVar);
                arrayList.remove(size);
            }
        }
        p(dVar, this.k);
        if (this.h.remove(dVar)) {
            view.setAlpha(1.0f);
            h(dVar);
        }
        if (this.i.remove(dVar)) {
            view.setAlpha(1.0f);
            h(dVar);
        }
        ArrayList arrayList2 = this.n;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            p(dVar, arrayList3);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.m;
        int size3 = arrayList4.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                }
                if (((C3035Xj0) arrayList5.get(size4)).a == dVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    h(dVar);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                }
            }
        }
        ArrayList arrayList6 = this.l;
        int size5 = arrayList6.size();
        while (true) {
            size5--;
            if (size5 >= 0) {
                ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
                if (arrayList7.remove(dVar)) {
                    view.setAlpha(1.0f);
                    h(dVar);
                    if (arrayList7.isEmpty()) {
                        arrayList6.remove(size5);
                    }
                }
            } else {
                this.q.remove(dVar);
                this.o.remove(dVar);
                this.r.remove(dVar);
                this.p.remove(dVar);
                o();
                return;
            }
        }
    }

    public final void r(d dVar) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        dVar.a.animate().setInterpolator(s);
        i(dVar);
    }

    @Override // defpackage.AbstractC2348Sb3
    public final boolean k() {
        return (this.i.isEmpty() && this.k.isEmpty() && this.j.isEmpty() && this.h.isEmpty() && this.p.isEmpty() && this.q.isEmpty() && this.o.isEmpty() && this.r.isEmpty() && this.m.isEmpty() && this.l.isEmpty() && this.n.isEmpty()) ? false : true;
    }

    public final void o() {
        if (k()) {
            return;
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC9676sK2) arrayList.get(i)).a();
        }
        arrayList.clear();
    }

    @Override // defpackage.AbstractC2348Sb3
    public final void j() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C3035Xj0 c3035Xj0 = (C3035Xj0) arrayList.get(size);
            View view = c3035Xj0.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            h(c3035Xj0.a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.h;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            h((d) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            d dVar = (d) arrayList3.get(size3);
            dVar.a.setAlpha(1.0f);
            h(dVar);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.k;
        int size4 = arrayList4.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            C2905Wj0 c2905Wj0 = (C2905Wj0) arrayList4.get(size4);
            d dVar2 = c2905Wj0.a;
            if (dVar2 != null) {
                q(c2905Wj0, dVar2);
            }
            d dVar3 = c2905Wj0.b;
            if (dVar3 != null) {
                q(c2905Wj0, dVar3);
            }
        }
        arrayList4.clear();
        if (k()) {
            ArrayList arrayList5 = this.m;
            int size5 = arrayList5.size();
            while (true) {
                size5--;
                if (size5 < 0) {
                    break;
                }
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                int size6 = arrayList6.size();
                while (true) {
                    size6--;
                    if (size6 >= 0) {
                        C3035Xj0 c3035Xj02 = (C3035Xj0) arrayList6.get(size6);
                        View view2 = c3035Xj02.a.a;
                        view2.setTranslationY(0.0f);
                        view2.setTranslationX(0.0f);
                        h(c3035Xj02.a);
                        arrayList6.remove(size6);
                        if (arrayList6.isEmpty()) {
                            arrayList5.remove(arrayList6);
                        }
                    }
                }
            }
            ArrayList arrayList7 = this.l;
            int size7 = arrayList7.size();
            while (true) {
                size7--;
                if (size7 < 0) {
                    break;
                }
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                int size8 = arrayList8.size();
                while (true) {
                    size8--;
                    if (size8 >= 0) {
                        d dVar4 = (d) arrayList8.get(size8);
                        dVar4.a.setAlpha(1.0f);
                        h(dVar4);
                        arrayList8.remove(size8);
                        if (arrayList8.isEmpty()) {
                            arrayList7.remove(arrayList8);
                        }
                    }
                }
            }
            ArrayList arrayList9 = this.n;
            int size9 = arrayList9.size();
            while (true) {
                size9--;
                if (size9 < 0) {
                    break;
                }
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                int size10 = arrayList10.size();
                while (true) {
                    size10--;
                    if (size10 >= 0) {
                        C2905Wj0 c2905Wj02 = (C2905Wj0) arrayList10.get(size10);
                        d dVar5 = c2905Wj02.a;
                        if (dVar5 != null) {
                            q(c2905Wj02, dVar5);
                        }
                        d dVar6 = c2905Wj02.b;
                        if (dVar6 != null) {
                            q(c2905Wj02, dVar6);
                        }
                        if (arrayList10.isEmpty()) {
                            arrayList9.remove(arrayList10);
                        }
                    }
                }
            }
            n(this.q);
            n(this.p);
            n(this.o);
            n(this.r);
            ArrayList arrayList11 = this.b;
            int size11 = arrayList11.size();
            for (int i = 0; i < size11; i++) {
                ((InterfaceC9676sK2) arrayList11.get(i)).a();
            }
            arrayList11.clear();
        }
    }

    public static void n(ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((d) arrayList.get(size)).a.animate().cancel();
            }
        }
    }

    @Override // defpackage.AbstractC2348Sb3
    public final boolean g(d dVar, List list) {
        return !list.isEmpty() || super.g(dVar, list);
    }
}
