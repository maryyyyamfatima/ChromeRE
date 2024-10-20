package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jU0 */
/* loaded from: classes.dex */
public class C6633jU0 extends AbstractC4228cU0 {
    @Override // defpackage.AbstractC4228cU0
    public final boolean e(Object obj) {
        return obj instanceof QV3;
    }

    @Override // defpackage.AbstractC4228cU0
    public final Object f(Object obj) {
        if (obj != null) {
            return ((QV3) obj).clone();
        }
        return null;
    }

    @Override // defpackage.AbstractC4228cU0
    public final Object r(Object obj) {
        if (obj == null) {
            return null;
        }
        C8709pW3 c8709pW3 = new C8709pW3();
        c8709pW3.I((QV3) obj);
        return c8709pW3;
    }

    @Override // defpackage.AbstractC4228cU0
    public final void p(Object obj, View view, ArrayList arrayList) {
        C8709pW3 c8709pW3 = (C8709pW3) obj;
        ArrayList arrayList2 = c8709pW3.k;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC4228cU0.d(arrayList2, (View) arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(c8709pW3, arrayList);
    }

    @Override // defpackage.AbstractC4228cU0
    public final void m(View view, Object obj) {
        if (view != null) {
            AbstractC4228cU0.g(new Rect(), view);
            ((QV3) obj).B(new C4572dU0());
        }
    }

    @Override // defpackage.AbstractC4228cU0
    public final void b(Object obj, ArrayList arrayList) {
        QV3 qv3 = (QV3) obj;
        if (qv3 == null) {
            return;
        }
        int i = 0;
        if (qv3 instanceof C8709pW3) {
            C8709pW3 c8709pW3 = (C8709pW3) qv3;
            int size = c8709pW3.C.size();
            while (i < size) {
                b((i < 0 || i >= c8709pW3.C.size()) ? null : (QV3) c8709pW3.C.get(i), arrayList);
                i++;
            }
            return;
        }
        if (((AbstractC4228cU0.h(qv3.j) && AbstractC4228cU0.h(null) && AbstractC4228cU0.h(null)) ? false : true) || !AbstractC4228cU0.h(qv3.k)) {
            return;
        }
        int size2 = arrayList.size();
        while (i < size2) {
            qv3.b((View) arrayList.get(i));
            i++;
        }
    }

    @Override // defpackage.AbstractC4228cU0
    public final Object j(Object obj, Object obj2) {
        C8709pW3 c8709pW3 = new C8709pW3();
        if (obj != null) {
            c8709pW3.I((QV3) obj);
        }
        c8709pW3.I((QV3) obj2);
        return c8709pW3;
    }

    @Override // defpackage.AbstractC4228cU0
    public final void k(Object obj, View view, ArrayList arrayList) {
        ((QV3) obj).a(new C4915eU0(view, arrayList));
    }

    @Override // defpackage.AbstractC4228cU0
    public final Object i(Object obj, Object obj2, Object obj3) {
        QV3 qv3 = (QV3) obj;
        QV3 qv32 = (QV3) obj2;
        QV3 qv33 = (QV3) obj3;
        if (qv3 != null && qv32 != null) {
            C8709pW3 c8709pW3 = new C8709pW3();
            c8709pW3.I(qv3);
            c8709pW3.I(qv32);
            c8709pW3.D = false;
            qv3 = c8709pW3;
        } else if (qv3 == null) {
            qv3 = qv32 != null ? qv32 : null;
        }
        if (qv33 == null) {
            return qv3;
        }
        C8709pW3 c8709pW32 = new C8709pW3();
        if (qv3 != null) {
            c8709pW32.I(qv3);
        }
        c8709pW32.I(qv33);
        return c8709pW32;
    }

    @Override // defpackage.AbstractC4228cU0
    public final void c(ViewGroup viewGroup, Object obj) {
        AbstractC6990kW3.a(viewGroup, (QV3) obj);
    }

    @Override // defpackage.AbstractC4228cU0
    public final void l(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((QV3) obj).a(new C5259fU0(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // defpackage.AbstractC4228cU0
    public final void o(Object obj, QF qf, RunnableC0961Hk0 runnableC0961Hk0) {
        QV3 qv3 = (QV3) obj;
        qf.a(new C5603gU0(qv3));
        qv3.a(new C5947hU0(runnableC0961Hk0));
    }

    @Override // defpackage.AbstractC4228cU0
    public final void q(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        C8709pW3 c8709pW3 = (C8709pW3) obj;
        if (c8709pW3 != null) {
            ArrayList arrayList3 = c8709pW3.k;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            s(c8709pW3, arrayList, arrayList2);
        }
    }

    public final void s(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        QV3 qv3 = (QV3) obj;
        int i = 0;
        if (!(qv3 instanceof C8709pW3)) {
            if ((AbstractC4228cU0.h(qv3.j) && AbstractC4228cU0.h(null) && AbstractC4228cU0.h(null)) ? false : true) {
                return;
            }
            ArrayList arrayList3 = qv3.k;
            if (arrayList3.size() != arrayList.size() || !arrayList3.containsAll(arrayList)) {
                return;
            }
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i < size) {
                qv3.b((View) arrayList2.get(i));
                i++;
            }
            int size2 = arrayList.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return;
                } else {
                    qv3.x((View) arrayList.get(size2));
                }
            }
        } else {
            C8709pW3 c8709pW3 = (C8709pW3) qv3;
            int size3 = c8709pW3.C.size();
            while (i < size3) {
                s((i < 0 || i >= c8709pW3.C.size()) ? null : (QV3) c8709pW3.C.get(i), arrayList, arrayList2);
                i++;
            }
        }
    }

    @Override // defpackage.AbstractC4228cU0
    public final void a(View view, Object obj) {
        ((QV3) obj).b(view);
    }

    @Override // defpackage.AbstractC4228cU0
    public final void n(Object obj, Rect rect) {
        ((QV3) obj).B(new C6291iU0());
    }
}
