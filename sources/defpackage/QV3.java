package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class QV3 implements Cloneable {
    public ArrayList p;
    public ArrayList q;
    public DV3 x;
    public static final int[] z = {2, 1, 3, 4};
    public static final C11104wV3 A = new C11104wV3();
    public static final ThreadLocal B = new ThreadLocal();
    public final String a = getClass().getName();
    public long g = -1;
    public long h = -1;
    public TimeInterpolator i = null;
    public final ArrayList j = new ArrayList();
    public final ArrayList k = new ArrayList();
    public C11109wW3 l = new C11109wW3();
    public C11109wW3 m = new C11109wW3();
    public C8709pW3 n = null;
    public final int[] o = z;
    public final ArrayList r = new ArrayList();
    public int s = 0;
    public boolean t = false;
    public boolean u = false;
    public ArrayList v = null;
    public ArrayList w = new ArrayList();
    public C11104wV3 y = A;

    public void E() {
    }

    public abstract void e(C10766vW3 c10766vW3);

    public void g(C10766vW3 c10766vW3) {
    }

    public abstract void h(C10766vW3 c10766vW3);

    public Animator l(ViewGroup viewGroup, C10766vW3 c10766vW3, C10766vW3 c10766vW32) {
        return null;
    }

    public String[] q() {
        return null;
    }

    public void A(long j) {
        this.h = j;
    }

    public void F(long j) {
        this.g = j;
    }

    public void C(TimeInterpolator timeInterpolator) {
        this.i = timeInterpolator;
    }

    public void m(ViewGroup viewGroup, C11109wW3 c11109wW3, C11109wW3 c11109wW32, ArrayList arrayList, ArrayList arrayList2) {
        Animator l;
        View view;
        Animator animator;
        C10766vW3 c10766vW3;
        Animator animator2;
        C10766vW3 c10766vW32;
        ViewGroup viewGroup2 = viewGroup;
        C4317ck p = p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C10766vW3 c10766vW33 = (C10766vW3) arrayList.get(i);
            C10766vW3 c10766vW34 = (C10766vW3) arrayList2.get(i);
            if (c10766vW33 != null && !c10766vW33.c.contains(this)) {
                c10766vW33 = null;
            }
            if (c10766vW34 != null && !c10766vW34.c.contains(this)) {
                c10766vW34 = null;
            }
            if (c10766vW33 != null || c10766vW34 != null) {
                if ((c10766vW33 == null || c10766vW34 == null || s(c10766vW33, c10766vW34)) && (l = l(viewGroup2, c10766vW33, c10766vW34)) != null) {
                    if (c10766vW34 != null) {
                        String[] q = q();
                        view = c10766vW34.b;
                        if (q != null && q.length > 0) {
                            c10766vW32 = new C10766vW3(view);
                            C10766vW3 c10766vW35 = (C10766vW3) c11109wW32.a.get(view);
                            if (c10766vW35 != null) {
                                int i2 = 0;
                                while (i2 < q.length) {
                                    HashMap hashMap = c10766vW32.a;
                                    Animator animator3 = l;
                                    String str = q[i2];
                                    hashMap.put(str, c10766vW35.a.get(str));
                                    i2++;
                                    l = animator3;
                                    q = q;
                                }
                            }
                            Animator animator4 = l;
                            int i3 = p.h;
                            int i4 = 0;
                            while (true) {
                                if (i4 >= i3) {
                                    animator2 = animator4;
                                    break;
                                }
                                C12133zV3 c12133zV3 = (C12133zV3) p.get((Animator) p.f(i4));
                                if (c12133zV3.c != null && c12133zV3.a == view && c12133zV3.b.equals(this.a) && c12133zV3.c.equals(c10766vW32)) {
                                    animator2 = null;
                                    break;
                                }
                                i4++;
                            }
                        } else {
                            animator2 = l;
                            c10766vW32 = null;
                        }
                        animator = animator2;
                        c10766vW3 = c10766vW32;
                    } else {
                        view = c10766vW33.b;
                        animator = l;
                        c10766vW3 = null;
                    }
                    if (animator != null) {
                        String str2 = this.a;
                        Re4 re4 = De4.a;
                        p.put(animator, new C12133zV3(view, str2, this, new C10877vp4(viewGroup2), c10766vW3));
                        this.w.add(animator);
                    }
                    i++;
                    viewGroup2 = viewGroup;
                }
            }
            i++;
            viewGroup2 = viewGroup;
        }
        if (sparseIntArray.size() != 0) {
            for (int i5 = 0; i5 < sparseIntArray.size(); i5++) {
                Animator animator5 = (Animator) this.w.get(sparseIntArray.keyAt(i5));
                animator5.setStartDelay(animator5.getStartDelay() + (sparseIntArray.valueAt(i5) - Long.MAX_VALUE));
            }
        }
    }

    public final boolean t(View view) {
        int id = view.getId();
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        ArrayList arrayList2 = this.k;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public static C4317ck p() {
        ThreadLocal threadLocal = B;
        C4317ck c4317ck = (C4317ck) threadLocal.get();
        if (c4317ck != null) {
            return c4317ck;
        }
        C4317ck c4317ck2 = new C4317ck();
        threadLocal.set(c4317ck2);
        return c4317ck2;
    }

    public void z() {
        G();
        C4317ck p = p();
        Iterator it = this.w.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (p.containsKey(animator)) {
                G();
                if (animator != null) {
                    animator.addListener(new C11447xV3(this, p));
                    long j = this.h;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.g;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.i;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new C11790yV3(this));
                    animator.start();
                }
            }
        }
        this.w.clear();
        n();
    }

    public void b(View view) {
        this.k.add(view);
    }

    public void x(View view) {
        this.k.remove(view);
    }

    public final void i(ViewGroup viewGroup, boolean z2) {
        j(z2);
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        ArrayList arrayList2 = this.k;
        if (size > 0 || arrayList2.size() > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                View findViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
                if (findViewById != null) {
                    C10766vW3 c10766vW3 = new C10766vW3(findViewById);
                    if (z2) {
                        h(c10766vW3);
                    } else {
                        e(c10766vW3);
                    }
                    c10766vW3.c.add(this);
                    g(c10766vW3);
                    if (z2) {
                        c(this.l, findViewById, c10766vW3);
                    } else {
                        c(this.m, findViewById, c10766vW3);
                    }
                }
            }
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                View view = (View) arrayList2.get(i2);
                C10766vW3 c10766vW32 = new C10766vW3(view);
                if (z2) {
                    h(c10766vW32);
                } else {
                    e(c10766vW32);
                }
                c10766vW32.c.add(this);
                g(c10766vW32);
                if (z2) {
                    c(this.l, view, c10766vW32);
                } else {
                    c(this.m, view, c10766vW32);
                }
            }
            return;
        }
        f(viewGroup, z2);
    }

    public static void c(C11109wW3 c11109wW3, View view, C10766vW3 c10766vW3) {
        c11109wW3.a.put(view, c10766vW3);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = c11109wW3.b;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = Ec4.a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            C4317ck c4317ck = c11109wW3.d;
            if (c4317ck.containsKey(transitionName)) {
                c4317ck.put(transitionName, null);
            } else {
                c4317ck.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C3487aJ1 c3487aJ1 = c11109wW3.c;
                if (c3487aJ1.f(itemIdAtPosition) >= 0) {
                    View view2 = (View) c3487aJ1.d(itemIdAtPosition);
                    if (view2 != null) {
                        view2.setHasTransientState(false);
                        c3487aJ1.i(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                view.setHasTransientState(true);
                c3487aJ1.i(itemIdAtPosition, view);
            }
        }
    }

    public final void j(boolean z2) {
        if (z2) {
            this.l.a.clear();
            this.l.b.clear();
            this.l.c.b();
        } else {
            this.m.a.clear();
            this.m.b.clear();
            this.m.c.b();
        }
    }

    public final void f(View view, boolean z2) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            C10766vW3 c10766vW3 = new C10766vW3(view);
            if (z2) {
                h(c10766vW3);
            } else {
                e(c10766vW3);
            }
            c10766vW3.c.add(this);
            g(c10766vW3);
            if (z2) {
                c(this.l, view, c10766vW3);
            } else {
                c(this.m, view, c10766vW3);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), z2);
            }
        }
    }

    public final C10766vW3 r(View view, boolean z2) {
        C8709pW3 c8709pW3 = this.n;
        if (c8709pW3 != null) {
            return c8709pW3.r(view, z2);
        }
        return (C10766vW3) (z2 ? this.l : this.m).a.get(view);
    }

    public final C10766vW3 o(View view, boolean z2) {
        C8709pW3 c8709pW3 = this.n;
        if (c8709pW3 != null) {
            return c8709pW3.o(view, z2);
        }
        ArrayList arrayList = z2 ? this.p : this.q;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            C10766vW3 c10766vW3 = (C10766vW3) arrayList.get(i);
            if (c10766vW3 == null) {
                return null;
            }
            if (c10766vW3.b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (C10766vW3) (z2 ? this.q : this.p).get(i);
        }
        return null;
    }

    public void v(View view) {
        if (this.u) {
            return;
        }
        ArrayList arrayList = this.r;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((Animator) arrayList.get(size)).pause();
        }
        ArrayList arrayList2 = this.v;
        if (arrayList2 != null && arrayList2.size() > 0) {
            ArrayList arrayList3 = (ArrayList) this.v.clone();
            int size2 = arrayList3.size();
            for (int i = 0; i < size2; i++) {
                ((KV3) arrayList3.get(i)).b();
            }
        }
        this.t = true;
    }

    public void y(ViewGroup viewGroup) {
        if (this.t) {
            if (!this.u) {
                ArrayList arrayList = this.r;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else {
                        ((Animator) arrayList.get(size)).resume();
                    }
                }
                ArrayList arrayList2 = this.v;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    ArrayList arrayList3 = (ArrayList) this.v.clone();
                    int size2 = arrayList3.size();
                    for (int i = 0; i < size2; i++) {
                        ((KV3) arrayList3.get(i)).e();
                    }
                }
            }
            this.t = false;
        }
    }

    public boolean s(C10766vW3 c10766vW3, C10766vW3 c10766vW32) {
        if (c10766vW3 == null || c10766vW32 == null) {
            return false;
        }
        String[] q = q();
        if (q != null) {
            for (String str : q) {
                if (!u(c10766vW3, c10766vW32, str)) {
                }
            }
            return false;
        }
        Iterator it = c10766vW3.a.keySet().iterator();
        while (it.hasNext()) {
            if (u(c10766vW3, c10766vW32, (String) it.next())) {
            }
        }
        return false;
        return true;
    }

    public static boolean u(C10766vW3 c10766vW3, C10766vW3 c10766vW32, String str) {
        Object obj = c10766vW3.a.get(str);
        Object obj2 = c10766vW32.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public final void G() {
        if (this.s == 0) {
            ArrayList arrayList = this.v;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.v.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((KV3) arrayList2.get(i)).a(this);
                }
            }
            this.u = false;
        }
        this.s++;
    }

    public final void n() {
        int i = this.s - 1;
        this.s = i;
        if (i == 0) {
            ArrayList arrayList = this.v;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.v.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((KV3) arrayList2.get(i2)).c(this);
                }
            }
            for (int i3 = 0; i3 < this.l.c.k(); i3++) {
                View view = (View) this.l.c.l(i3);
                if (view != null) {
                    WeakHashMap weakHashMap = Ec4.a;
                    view.setHasTransientState(false);
                }
            }
            for (int i4 = 0; i4 < this.m.c.k(); i4++) {
                View view2 = (View) this.m.c.l(i4);
                if (view2 != null) {
                    WeakHashMap weakHashMap2 = Ec4.a;
                    view2.setHasTransientState(false);
                }
            }
            this.u = true;
        }
    }

    public void d() {
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else {
                ((Animator) arrayList.get(size)).cancel();
            }
        }
        ArrayList arrayList2 = this.v;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            return;
        }
        ArrayList arrayList3 = (ArrayList) this.v.clone();
        int size2 = arrayList3.size();
        for (int i = 0; i < size2; i++) {
            ((KV3) arrayList3.get(i)).d();
        }
    }

    public void a(KV3 kv3) {
        if (this.v == null) {
            this.v = new ArrayList();
        }
        this.v.add(kv3);
    }

    public void w(KV3 kv3) {
        ArrayList arrayList = this.v;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(kv3);
        if (this.v.size() == 0) {
            this.v = null;
        }
    }

    public void D(C11104wV3 c11104wV3) {
        if (c11104wV3 == null) {
            this.y = A;
        } else {
            this.y = c11104wV3;
        }
    }

    public void B(DV3 dv3) {
        this.x = dv3;
    }

    public final String toString() {
        return H("");
    }

    @Override // 
    /* renamed from: k */
    public QV3 clone() {
        try {
            QV3 qv3 = (QV3) super.clone();
            qv3.w = new ArrayList();
            qv3.l = new C11109wW3();
            qv3.m = new C11109wW3();
            qv3.p = null;
            qv3.q = null;
            return qv3;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public String H(String str) {
        StringBuilder a = AbstractC10761vV3.a(str);
        a.append(getClass().getSimpleName());
        a.append("@");
        a.append(Integer.toHexString(hashCode()));
        a.append(": ");
        String sb = a.toString();
        if (this.h != -1) {
            StringBuilder a2 = M41.a(sb, "dur(");
            a2.append(this.h);
            a2.append(") ");
            sb = a2.toString();
        }
        if (this.g != -1) {
            StringBuilder a3 = M41.a(sb, "dly(");
            a3.append(this.g);
            a3.append(") ");
            sb = a3.toString();
        }
        if (this.i != null) {
            StringBuilder a4 = M41.a(sb, "interp(");
            a4.append(this.i);
            a4.append(") ");
            sb = a4.toString();
        }
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        ArrayList arrayList2 = this.k;
        if (size <= 0 && arrayList2.size() <= 0) {
            return sb;
        }
        String a5 = AbstractC7848n0.a(sb, "tgts(");
        if (arrayList.size() > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (i > 0) {
                    a5 = AbstractC7848n0.a(a5, ", ");
                }
                StringBuilder a6 = AbstractC10761vV3.a(a5);
                a6.append(arrayList.get(i));
                a5 = a6.toString();
            }
        }
        if (arrayList2.size() > 0) {
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                if (i2 > 0) {
                    a5 = AbstractC7848n0.a(a5, ", ");
                }
                StringBuilder a7 = AbstractC10761vV3.a(a5);
                a7.append(arrayList2.get(i2));
                a5 = a7.toString();
            }
        }
        return AbstractC7848n0.a(a5, ")");
    }
}
