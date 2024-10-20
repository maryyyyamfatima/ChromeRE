package defpackage;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Cs1 */
/* loaded from: classes.dex */
public final class C0352Cs1 implements CK2 {
    public final /* synthetic */ C1521Ls1 a;

    public C0352Cs1(C1521Ls1 c1521Ls1) {
        this.a = c1521Ls1;
    }

    @Override // defpackage.CK2
    public final boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        int findPointerIndex;
        C1521Ls1 c1521Ls1 = this.a;
        c1521Ls1.C.a.a.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        C0482Ds1 c0482Ds1 = null;
        if (actionMasked == 0) {
            c1521Ls1.q = motionEvent.getPointerId(0);
            c1521Ls1.i = motionEvent.getX();
            c1521Ls1.j = motionEvent.getY();
            VelocityTracker velocityTracker = c1521Ls1.y;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            c1521Ls1.y = VelocityTracker.obtain();
            if (c1521Ls1.h == null) {
                ArrayList arrayList = c1521Ls1.u;
                if (!arrayList.isEmpty()) {
                    View o = c1521Ls1.o(motionEvent);
                    int size = arrayList.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        C0482Ds1 c0482Ds12 = (C0482Ds1) arrayList.get(size);
                        if (c0482Ds12.j.a == o) {
                            c0482Ds1 = c0482Ds12;
                            break;
                        }
                        size--;
                    }
                }
                if (c0482Ds1 != null) {
                    c1521Ls1.i -= c0482Ds1.n;
                    c1521Ls1.j -= c0482Ds1.o;
                    d dVar = c0482Ds1.j;
                    c1521Ls1.n(dVar, true);
                    if (c1521Ls1.a.remove(dVar.a)) {
                        c1521Ls1.r.b(c1521Ls1.w, dVar);
                    }
                    c1521Ls1.t(dVar, c0482Ds1.k);
                    c1521Ls1.v(c1521Ls1.t, 0, motionEvent);
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            c1521Ls1.q = -1;
            c1521Ls1.t(null, 0);
        } else {
            int i = c1521Ls1.q;
            if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                c1521Ls1.l(actionMasked, findPointerIndex, motionEvent);
            }
        }
        VelocityTracker velocityTracker2 = c1521Ls1.y;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return c1521Ls1.h != null;
    }

    @Override // defpackage.CK2
    public final void a(MotionEvent motionEvent) {
        C1521Ls1 c1521Ls1 = this.a;
        c1521Ls1.C.a.a.onTouchEvent(motionEvent);
        VelocityTracker velocityTracker = c1521Ls1.y;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (c1521Ls1.q == -1) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        int findPointerIndex = motionEvent.findPointerIndex(c1521Ls1.q);
        if (findPointerIndex >= 0) {
            c1521Ls1.l(actionMasked, findPointerIndex, motionEvent);
        }
        d dVar = c1521Ls1.h;
        if (dVar == null) {
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (findPointerIndex >= 0) {
                    c1521Ls1.v(c1521Ls1.t, findPointerIndex, motionEvent);
                    c1521Ls1.r(dVar);
                    RecyclerView recyclerView = c1521Ls1.w;
                    RunnableC0222Bs1 runnableC0222Bs1 = c1521Ls1.x;
                    recyclerView.removeCallbacks(runnableC0222Bs1);
                    runnableC0222Bs1.run();
                    c1521Ls1.w.invalidate();
                    return;
                }
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked != 6) {
                    return;
                }
                int actionIndex = motionEvent.getActionIndex();
                if (motionEvent.getPointerId(actionIndex) == c1521Ls1.q) {
                    c1521Ls1.q = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                    c1521Ls1.v(c1521Ls1.t, actionIndex, motionEvent);
                    return;
                }
                return;
            }
            VelocityTracker velocityTracker2 = c1521Ls1.y;
            if (velocityTracker2 != null) {
                velocityTracker2.clear();
            }
        }
        c1521Ls1.t(null, 0);
        c1521Ls1.q = -1;
    }

    @Override // defpackage.CK2
    public final void e(boolean z) {
        if (z) {
            this.a.t(null, 0);
        }
    }
}
