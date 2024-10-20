package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ls1 */
/* loaded from: classes.dex */
public class C1521Ls1 extends AbstractC10705vK2 implements BK2 {
    public ArrayList A;
    public C8029nY0 C;
    public C1132Is1 D;
    public Rect F;
    public long G;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public final AbstractC1002Hs1 r;
    public int t;
    public int v;
    public RecyclerView w;
    public VelocityTracker y;
    public ArrayList z;
    public final ArrayList a = new ArrayList();
    public final float[] g = new float[2];
    public d h = null;
    public int q = -1;
    public int s = 0;
    public final ArrayList u = new ArrayList();
    public final RunnableC0222Bs1 x = new RunnableC0222Bs1(this);
    public View B = null;
    public final C0352Cs1 E = new C0352Cs1(this);

    @Override // defpackage.BK2
    public final void d(View view) {
    }

    public C1521Ls1(AbstractC1002Hs1 abstractC1002Hs1) {
        this.r = abstractC1002Hs1;
    }

    public static boolean q(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    public final void j(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.w;
        if (recyclerView2 == recyclerView) {
            return;
        }
        C0352Cs1 c0352Cs1 = this.E;
        if (recyclerView2 != null) {
            recyclerView2.f0(this);
            this.w.g0(c0352Cs1);
            ArrayList arrayList = this.w.I;
            if (arrayList != null) {
                arrayList.remove(this);
            }
            ArrayList arrayList2 = this.u;
            int size = arrayList2.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                C0482Ds1 c0482Ds1 = (C0482Ds1) arrayList2.get(0);
                c0482Ds1.l.cancel();
                this.r.b(this.w, c0482Ds1.j);
            }
            arrayList2.clear();
            this.B = null;
            VelocityTracker velocityTracker = this.y;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.y = null;
            }
            C1132Is1 c1132Is1 = this.D;
            if (c1132Is1 != null) {
                c1132Is1.a = false;
                this.D = null;
            }
            if (this.C != null) {
                this.C = null;
            }
        }
        this.w = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.k = resources.getDimension(R.dimen.0_resource_name_obfuscated_res_0x7f080391);
            this.l = resources.getDimension(R.dimen.0_resource_name_obfuscated_res_0x7f080390);
            this.v = ViewConfiguration.get(this.w.getContext()).getScaledTouchSlop();
            this.w.g(this);
            this.w.w.add(c0352Cs1);
            this.w.h(this);
            this.D = new C1132Is1(this);
            this.C = new C8029nY0(this.w.getContext(), this.D, null);
        }
    }

    public final void p(float[] fArr) {
        if ((this.t & 12) != 0) {
            fArr[0] = (this.o + this.m) - this.h.a.getLeft();
        } else {
            fArr[0] = this.h.a.getTranslationX();
        }
        if ((this.t & 3) != 0) {
            fArr[1] = (this.p + this.n) - this.h.a.getTop();
        } else {
            fArr[1] = this.h.a.getTranslationY();
        }
    }

    @Override // defpackage.AbstractC10705vK2
    public final void i(Canvas canvas, RecyclerView recyclerView) {
        boolean z = false;
        if (this.h != null) {
            float[] fArr = this.g;
            p(fArr);
            float f = fArr[0];
            float f2 = fArr[1];
        }
        d dVar = this.h;
        ArrayList arrayList = this.u;
        this.r.getClass();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0482Ds1 c0482Ds1 = (C0482Ds1) arrayList.get(i);
            int save = canvas.save();
            View view = c0482Ds1.j.a;
            canvas.restoreToCount(save);
        }
        if (dVar != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i2 = size - 1; i2 >= 0; i2--) {
            C0482Ds1 c0482Ds12 = (C0482Ds1) arrayList.get(i2);
            boolean z2 = c0482Ds12.q;
            if (z2 && !c0482Ds12.m) {
                arrayList.remove(i2);
            } else if (!z2) {
                z = true;
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }

    @Override // defpackage.AbstractC10705vK2
    public final void h(Canvas canvas, RecyclerView recyclerView) {
        float f;
        float f2;
        if (this.h != null) {
            float[] fArr = this.g;
            p(fArr);
            float f3 = fArr[0];
            f2 = fArr[1];
            f = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        d dVar = this.h;
        ArrayList arrayList = this.u;
        int i = this.s;
        AbstractC1002Hs1 abstractC1002Hs1 = this.r;
        abstractC1002Hs1.getClass();
        int i2 = 0;
        for (int size = arrayList.size(); i2 < size; size = size) {
            C0482Ds1 c0482Ds1 = (C0482Ds1) arrayList.get(i2);
            float f4 = c0482Ds1.a;
            float f5 = c0482Ds1.h;
            d dVar2 = c0482Ds1.j;
            if (f4 == f5) {
                c0482Ds1.n = dVar2.a.getTranslationX();
            } else {
                c0482Ds1.n = AbstractC2277Rn2.a(f5, f4, c0482Ds1.r, f4);
            }
            float f6 = c0482Ds1.g;
            float f7 = c0482Ds1.i;
            if (f6 == f7) {
                c0482Ds1.o = dVar2.a.getTranslationY();
            } else {
                c0482Ds1.o = AbstractC2277Rn2.a(f7, f6, c0482Ds1.r, f6);
            }
            int save = canvas.save();
            abstractC1002Hs1.g(canvas, recyclerView, c0482Ds1.j, c0482Ds1.n, c0482Ds1.o, c0482Ds1.k, false);
            canvas.restoreToCount(save);
            i2++;
        }
        if (dVar != null) {
            int save2 = canvas.save();
            abstractC1002Hs1.g(canvas, recyclerView, dVar, f, f2, i, true);
            canvas.restoreToCount(save2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x00e4, code lost:            if (r0 == 0) goto L520;     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00b1, code lost:            if (r0 == 0) goto L520;     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00b3, code lost:            r0 = r1 << 2;     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00bd, code lost:            r2 = r0 | r2;     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00b6, code lost:            r0 = r1 << 1;        r2 = r2 | (r0 & (-789517));        r0 = (r0 & 789516) << 2;     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00c4, code lost:            if (r2 > 0) goto L540;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(androidx.recyclerview.widget.d r24, int r25) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1521Ls1.t(androidx.recyclerview.widget.d, int):void");
    }

    public final void r(d dVar) {
        ArrayList arrayList;
        int i;
        int i2;
        int bottom;
        int abs;
        int top;
        int abs2;
        int left;
        int abs3;
        int abs4;
        AbstractC12077zK2 abstractC12077zK2;
        int i3;
        int i4;
        int i5;
        if (!this.w.isLayoutRequested() && this.s == 2) {
            AbstractC1002Hs1 abstractC1002Hs1 = this.r;
            abstractC1002Hs1.getClass();
            int i6 = (int) (this.o + this.m);
            int i7 = (int) (this.p + this.n);
            float abs5 = Math.abs(i7 - dVar.a.getTop());
            View view = dVar.a;
            if (abs5 >= view.getHeight() * 0.5f || Math.abs(i6 - view.getLeft()) >= view.getWidth() * 0.5f) {
                ArrayList arrayList2 = this.z;
                if (arrayList2 == null) {
                    this.z = new ArrayList();
                    this.A = new ArrayList();
                } else {
                    arrayList2.clear();
                    this.A.clear();
                }
                int i8 = 0;
                int round = Math.round(this.o + this.m) - 0;
                int round2 = Math.round(this.p + this.n) - 0;
                int width = view.getWidth() + round + 0;
                int height = view.getHeight() + round2 + 0;
                int i9 = (round + width) / 2;
                int i10 = (round2 + height) / 2;
                AbstractC12077zK2 abstractC12077zK22 = this.w.s;
                int x = abstractC12077zK22.x();
                while (i8 < x) {
                    View w = abstractC12077zK22.w(i8);
                    if (w == view) {
                        i3 = round;
                        i4 = round2;
                        i5 = width;
                        abstractC12077zK2 = abstractC12077zK22;
                    } else {
                        abstractC12077zK2 = abstractC12077zK22;
                        if (w.getBottom() < round2 || w.getTop() > height || w.getRight() < round || w.getLeft() > width) {
                            i3 = round;
                        } else {
                            d K = this.w.K(w);
                            i3 = round;
                            if (abstractC1002Hs1.a(this.h, K)) {
                                int abs6 = Math.abs(i9 - ((w.getRight() + w.getLeft()) / 2));
                                int abs7 = Math.abs(i10 - ((w.getBottom() + w.getTop()) / 2));
                                int i11 = (abs7 * abs7) + (abs6 * abs6);
                                int size = this.z.size();
                                i4 = round2;
                                i5 = width;
                                int i12 = 0;
                                int i13 = 0;
                                while (i12 < size) {
                                    int i14 = size;
                                    if (i11 <= ((Integer) this.A.get(i12)).intValue()) {
                                        break;
                                    }
                                    i13++;
                                    i12++;
                                    size = i14;
                                }
                                this.z.add(i13, K);
                                this.A.add(i13, Integer.valueOf(i11));
                            }
                        }
                        i4 = round2;
                        i5 = width;
                    }
                    i8++;
                    abstractC12077zK22 = abstractC12077zK2;
                    round = i3;
                    round2 = i4;
                    width = i5;
                }
                ArrayList arrayList3 = this.z;
                if (arrayList3.size() == 0) {
                    return;
                }
                int width2 = view.getWidth() + i6;
                int height2 = view.getHeight() + i7;
                int left2 = i6 - view.getLeft();
                int top2 = i7 - view.getTop();
                int size2 = arrayList3.size();
                d dVar2 = null;
                int i15 = 0;
                int i16 = -1;
                while (i15 < size2) {
                    d dVar3 = (d) arrayList3.get(i15);
                    if (left2 > 0) {
                        arrayList = arrayList3;
                        int right = dVar3.a.getRight() - width2;
                        i = width2;
                        if (right < 0) {
                            i2 = size2;
                            if (dVar3.a.getRight() > view.getRight() && (abs4 = Math.abs(right)) > i16) {
                                i16 = abs4;
                                dVar2 = dVar3;
                            }
                            if (left2 < 0 && (left = dVar3.a.getLeft() - i6) > 0 && dVar3.a.getLeft() < view.getLeft() && (abs3 = Math.abs(left)) > i16) {
                                i16 = abs3;
                                dVar2 = dVar3;
                            }
                            if (top2 < 0 && (top = dVar3.a.getTop() - i7) > 0 && dVar3.a.getTop() < view.getTop() && (abs2 = Math.abs(top)) > i16) {
                                i16 = abs2;
                                dVar2 = dVar3;
                            }
                            if (top2 > 0 && (bottom = dVar3.a.getBottom() - height2) < 0 && dVar3.a.getBottom() > view.getBottom() && (abs = Math.abs(bottom)) > i16) {
                                i16 = abs;
                                dVar2 = dVar3;
                            }
                            i15++;
                            arrayList3 = arrayList;
                            width2 = i;
                            size2 = i2;
                        }
                    } else {
                        arrayList = arrayList3;
                        i = width2;
                    }
                    i2 = size2;
                    if (left2 < 0) {
                        i16 = abs3;
                        dVar2 = dVar3;
                    }
                    if (top2 < 0) {
                        i16 = abs2;
                        dVar2 = dVar3;
                    }
                    if (top2 > 0) {
                        i16 = abs;
                        dVar2 = dVar3;
                    }
                    i15++;
                    arrayList3 = arrayList;
                    width2 = i;
                    size2 = i2;
                }
                if (dVar2 == null) {
                    this.z.clear();
                    this.A.clear();
                    return;
                }
                int f = dVar2.f();
                dVar.f();
                if (abstractC1002Hs1.h(this.w, dVar, dVar2)) {
                    RecyclerView recyclerView = this.w;
                    AbstractC12077zK2 abstractC12077zK23 = recyclerView.s;
                    boolean z = abstractC12077zK23 instanceof LinearLayoutManager;
                    View view2 = dVar2.a;
                    if (z) {
                        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) abstractC12077zK23;
                        linearLayoutManager.c("Cannot drop a view during a scroll or layout calculation");
                        linearLayoutManager.M0();
                        linearLayoutManager.g1();
                        int J2 = AbstractC12077zK2.J(view);
                        int J3 = AbstractC12077zK2.J(view2);
                        char c = J2 < J3 ? (char) 1 : (char) 65535;
                        if (linearLayoutManager.u) {
                            if (c == 1) {
                                linearLayoutManager.i1(J3, linearLayoutManager.r.g() - (linearLayoutManager.r.c(view) + linearLayoutManager.r.e(view2)));
                                return;
                            } else {
                                linearLayoutManager.i1(J3, linearLayoutManager.r.g() - linearLayoutManager.r.b(view2));
                                return;
                            }
                        }
                        if (c == 65535) {
                            linearLayoutManager.i1(J3, linearLayoutManager.r.e(view2));
                            return;
                        } else {
                            linearLayoutManager.i1(J3, linearLayoutManager.r.b(view2) - linearLayoutManager.r.c(view));
                            return;
                        }
                    }
                    if (abstractC12077zK23.e()) {
                        if (view2.getLeft() - AbstractC12077zK2.E(view2) <= recyclerView.getPaddingLeft()) {
                            recyclerView.m0(f);
                        }
                        if (AbstractC12077zK2.L(view2) + view2.getRight() >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                            recyclerView.m0(f);
                        }
                    }
                    if (abstractC12077zK23.f()) {
                        if (view2.getTop() - AbstractC12077zK2.N(view2) <= recyclerView.getPaddingTop()) {
                            recyclerView.m0(f);
                        }
                        if (AbstractC12077zK2.v(view2) + view2.getBottom() >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                            recyclerView.m0(f);
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.BK2
    public final void b(View view) {
        s(view);
        d K = this.w.K(view);
        if (K == null) {
            return;
        }
        d dVar = this.h;
        if (dVar != null && K == dVar) {
            t(null, 0);
            return;
        }
        n(K, false);
        if (this.a.remove(K.a)) {
            this.r.b(this.w, K);
        }
    }

    public final void n(d dVar, boolean z) {
        C0482Ds1 c0482Ds1;
        ArrayList arrayList = this.u;
        int size = arrayList.size();
        do {
            size--;
            if (size < 0) {
                return;
            } else {
                c0482Ds1 = (C0482Ds1) arrayList.get(size);
            }
        } while (c0482Ds1.j != dVar);
        c0482Ds1.p |= z;
        if (!c0482Ds1.q) {
            c0482Ds1.l.cancel();
        }
        arrayList.remove(size);
    }

    @Override // defpackage.AbstractC10705vK2
    public final void g(Rect rect, View view, RecyclerView recyclerView, LK2 lk2) {
        rect.setEmpty();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(int r9, int r10, android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1521Ls1.l(int, int, android.view.MotionEvent):void");
    }

    public final View o(MotionEvent motionEvent) {
        C0482Ds1 c0482Ds1;
        View view;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        d dVar = this.h;
        if (dVar != null) {
            float f = this.o + this.m;
            float f2 = this.p + this.n;
            View view2 = dVar.a;
            if (q(view2, x, y, f, f2)) {
                return view2;
            }
        }
        ArrayList arrayList = this.u;
        int size = arrayList.size();
        do {
            size--;
            if (size >= 0) {
                c0482Ds1 = (C0482Ds1) arrayList.get(size);
                view = c0482Ds1.j.a;
            } else {
                return this.w.B(x, y);
            }
        } while (!q(view, x, y, c0482Ds1.n, c0482Ds1.o));
        return view;
    }

    public final void u(d dVar) {
        int i;
        RecyclerView recyclerView = this.w;
        int c = this.r.c(recyclerView, dVar);
        WeakHashMap weakHashMap = Ec4.a;
        int layoutDirection = recyclerView.getLayoutDirection();
        int i2 = c & 3158064;
        if (i2 != 0) {
            int i3 = c & (~i2);
            if (layoutDirection == 0) {
                i = i2 >> 2;
            } else {
                int i4 = i2 >> 1;
                i3 |= (-3158065) & i4;
                i = (i4 & 3158064) >> 2;
            }
            c = i3 | i;
        }
        if (!((16711680 & c) != 0)) {
            Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
            return;
        }
        if (dVar.a.getParent() == this.w) {
            VelocityTracker velocityTracker = this.y;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            this.y = VelocityTracker.obtain();
            this.n = 0.0f;
            this.m = 0.0f;
            t(dVar, 2);
            return;
        }
        Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
    }

    public final void v(int i, int i2, MotionEvent motionEvent) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.i;
        this.m = f;
        this.n = y - this.j;
        if ((i & 4) == 0) {
            this.m = Math.max(0.0f, f);
        }
        if ((i & 8) == 0) {
            this.m = Math.min(0.0f, this.m);
        }
        if ((i & 1) == 0) {
            this.n = Math.max(0.0f, this.n);
        }
        if ((i & 2) == 0) {
            this.n = Math.min(0.0f, this.n);
        }
    }

    public final int k(d dVar, int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = this.m > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.y;
        AbstractC1002Hs1 abstractC1002Hs1 = this.r;
        if (velocityTracker != null && this.q > -1) {
            float f = this.l;
            abstractC1002Hs1.getClass();
            velocityTracker.computeCurrentVelocity(1000, f);
            float xVelocity = this.y.getXVelocity(this.q);
            float yVelocity = this.y.getYVelocity(this.q);
            int i3 = xVelocity <= 0.0f ? 4 : 8;
            float abs = Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3 && abs >= this.k && abs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float d = abstractC1002Hs1.d() * this.w.getWidth();
        if ((i & i2) == 0 || Math.abs(this.m) <= d) {
            return 0;
        }
        return i2;
    }

    public final int m(d dVar, int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = this.n > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.y;
        AbstractC1002Hs1 abstractC1002Hs1 = this.r;
        if (velocityTracker != null && this.q > -1) {
            float f = this.l;
            abstractC1002Hs1.getClass();
            velocityTracker.computeCurrentVelocity(1000, f);
            float xVelocity = this.y.getXVelocity(this.q);
            float yVelocity = this.y.getYVelocity(this.q);
            int i3 = yVelocity <= 0.0f ? 1 : 2;
            float abs = Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2 && abs >= this.k && abs > Math.abs(xVelocity)) {
                return i3;
            }
        }
        float d = abstractC1002Hs1.d() * this.w.getHeight();
        if ((i & i2) == 0 || Math.abs(this.n) <= d) {
            return 0;
        }
        return i2;
    }

    public final void s(View view) {
        if (view == this.B) {
            this.B = null;
        }
    }
}
