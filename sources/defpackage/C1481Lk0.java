package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Lk0 */
/* loaded from: classes.dex */
public final class C1481Lk0 extends AbstractC2633Ug3 {
    public C1481Lk0(ViewGroup viewGroup) {
        super(viewGroup);
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x060c A[LOOP:6: B:142:0x0606->B:144:0x060c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0536  */
    @Override // defpackage.AbstractC2633Ug3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.util.ArrayList r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 1568
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1481Lk0.b(java.util.ArrayList, boolean):void");
    }

    public static void k(C4317ck c4317ck, Collection collection) {
        Iterator it = ((C2904Wj) c4317ck.entrySet()).iterator();
        while (true) {
            C3294Zj c3294Zj = (C3294Zj) it;
            if (!c3294Zj.hasNext()) {
                return;
            }
            c3294Zj.next();
            View view = (View) c3294Zj.getValue();
            WeakHashMap weakHashMap = Ec4.a;
            if (!collection.contains(view.getTransitionName())) {
                c3294Zj.remove();
            }
        }
    }

    public static void i(View view, ArrayList arrayList) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.isTransitionGroup()) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    i(childAt, arrayList);
                }
            }
            return;
        }
        if (arrayList.contains(view)) {
            return;
        }
        arrayList.add(view);
    }

    public static void j(C4317ck c4317ck, View view) {
        WeakHashMap weakHashMap = Ec4.a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            c4317ck.put(transitionName, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    j(c4317ck, childAt);
                }
            }
        }
    }
}
