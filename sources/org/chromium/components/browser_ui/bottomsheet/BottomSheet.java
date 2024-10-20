package org.chromium.components.browser_ui.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.android.chrome.R;
import defpackage.AbstractC4851eH1;
import defpackage.AbstractC9076qb1;
import defpackage.C11814ya2;
import defpackage.C12157za2;
import defpackage.C5168fC;
import defpackage.H1;
import defpackage.InterfaceC0079Ap3;
import defpackage.InterfaceC4481dC;
import defpackage.InterfaceC4824eC;
import defpackage.JM1;
import defpackage.M41;
import defpackage.PB;
import defpackage.QF3;
import java.util.Iterator;
import org.chromium.base.Callback;
import org.chromium.base.task.PostTask;
import org.chromium.ui.base.LocalizationUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class BottomSheet extends FrameLayout implements InterfaceC4824eC, View.OnLayoutChangeListener {
    public static Callback F;
    public boolean A;
    public float B;
    public H1 C;
    public Window D;
    public InterfaceC0079Ap3 E;
    public final DecelerateInterpolator a;
    public final C12157za2 g;
    public final Rect h;
    public final int[] i;
    public final float j;
    public ViewGroup k;
    public final C5168fC l;
    public ValueAnimator m;
    public int n;
    public int o;
    public float p;
    public float q;
    public int r;
    public int s;
    public int t;
    public PB u;
    public TouchRestrictingFrameLayout v;
    public float w;
    public TouchRestrictingFrameLayout x;
    public boolean y;
    public boolean z;

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes2.dex */
    public class ShadowLayerView extends View {
        public final int a;

        public ShadowLayerView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = context.getResources().getDimensionPixelSize(R.dimen.f28650_resource_name_obfuscated_res_0x7f08009d);
            setTranslationX((LocalizationUtils.isLayoutRtl() ? 1 : -1) * r1);
            setTranslationY(-r1);
        }

        @Override // android.view.View
        public final void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            int i3 = this.a;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((i3 * 2) + size, 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2) + i3, 1073741824));
        }
    }

    public BottomSheet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new DecelerateInterpolator(1.0f);
        this.g = new C12157za2();
        this.h = new Rect();
        this.i = new int[2];
        this.p = -1.0f;
        this.r = 0;
        this.s = -1;
        this.t = -1;
        this.j = getResources().getDimensionPixelSize(R.dimen.f28610_resource_name_obfuscated_res_0x7f080099);
        this.l = new C5168fC(context, this);
        this.y = true;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            requestLayout();
        }
    }

    public final boolean u(MotionEvent motionEvent) {
        if (this.q < l(1) || j() > 0.0f) {
            return false;
        }
        if (this.z || this.C.c()) {
            return true;
        }
        Rect rect = this.h;
        return motionEvent.getRawX() > ((float) rect.left) && motionEvent.getRawX() < ((float) (getWidth() + rect.left));
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!(motionEvent.getY() > 0.0f) && motionEvent.getActionMasked() == 0) {
            return false;
        }
        if (!this.y) {
            return true;
        }
        if (this.m != null && this.s == 0) {
            return false;
        }
        C5168fC c5168fC = this.l;
        GestureDetector gestureDetector = c5168fC.a;
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(motionEvent.getRawX(), motionEvent.getRawY());
        gestureDetector.onTouchEvent(obtain);
        return c5168fC.d;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!(motionEvent.getY() > 0.0f) && motionEvent.getActionMasked() == 0) {
            return false;
        }
        if (!this.y) {
            return true;
        }
        C5168fC c5168fC = this.l;
        c5168fC.getClass();
        if (motionEvent.getActionMasked() != 0) {
            GestureDetector gestureDetector = c5168fC.a;
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setLocation(motionEvent.getRawX(), motionEvent.getRawY());
            gestureDetector.onTouchEvent(obtain);
        }
        if (c5168fC.d && (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3)) {
            c5168fC.d = false;
            VelocityTracker velocityTracker = c5168fC.c;
            velocityTracker.computeCurrentVelocity(1000);
            BottomSheet bottomSheet = (BottomSheet) c5168fC.b;
            bottomSheet.r(JM1.b((((-velocityTracker.getYVelocity()) * 218.0f) / 2000.0f) + bottomSheet.q, bottomSheet.h(), bottomSheet.f()), true);
        }
        return true;
    }

    public final float h() {
        PB pb = this.u;
        return (pb != null ? pb.v() : true ? 0.0f : k()) * this.o;
    }

    public final int i() {
        PB pb = this.u;
        return ((pb != null ? pb.v() : true) || !p()) ? 0 : 1;
    }

    public final float f() {
        return d() * this.o;
    }

    public final void v(PB pb) {
        if (this.u == pb) {
            return;
        }
        StringBuilder sb = new StringBuilder("Setting sheet content: state: ");
        sb.append(this.r);
        sb.append(", content null: ");
        sb.append(pb == null);
        AbstractC4851eH1.d("BottomSheet", sb.toString(), new Object[0]);
        if (pb == null) {
            Thread.dumpStack();
        }
        PB pb2 = this.u;
        if (pb2 != null) {
            pb2.k();
            this.u.c().removeOnLayoutChangeListener(this);
        }
        if (pb != null && getParent() == null) {
            this.k.addView(this);
        } else if (pb == null) {
            if (this.k.getParent() == null) {
                throw new RuntimeException("Attempting to detach sheet that was not in the hierarchy!");
            }
            this.k.removeView(this);
        }
        View c = pb != null ? pb.c() : null;
        PB pb3 = this.u;
        View c2 = pb3 != null ? pb3.c() : null;
        TouchRestrictingFrameLayout touchRestrictingFrameLayout = this.v;
        if (c2 != null && c2.getParent() != null) {
            touchRestrictingFrameLayout.removeView(c2);
        }
        if (c != null && touchRestrictingFrameLayout != c.getParent()) {
            touchRestrictingFrameLayout.addView(c);
        }
        View e = pb != null ? pb.e() : null;
        PB pb4 = this.u;
        View e2 = pb4 != null ? pb4.e() : null;
        TouchRestrictingFrameLayout touchRestrictingFrameLayout2 = this.x;
        if (e2 != null && e2.getParent() != null) {
            touchRestrictingFrameLayout2.removeView(e2);
        }
        if (e != null && touchRestrictingFrameLayout2 != e.getParent()) {
            touchRestrictingFrameLayout2.addView(e);
        }
        this.u = pb;
        if (pb != null) {
            if (n()) {
                pb.k();
                pb.c().addOnLayoutChangeListener(this);
                this.p = -1.0f;
                int i = this.r;
                if (i != 0 && i != 1) {
                    if ((this.m != null) || i != 4) {
                        t(i, 0, true);
                    }
                }
                if (this.r == 2) {
                    t(3, 0, true);
                }
            }
            pb.f();
        }
        Iterator it = this.g.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (c11814ya2.hasNext()) {
                ((InterfaceC4481dC) c11814ya2.next()).b(pb);
            } else {
                this.x.setBackgroundColor(0);
                return;
            }
        }
    }

    public final void a() {
        ValueAnimator valueAnimator = this.m;
        if (valueAnimator == null) {
            return;
        }
        valueAnimator.cancel();
        this.m = null;
    }

    public final void b(int i, int i2) {
        this.s = i;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.q, l(i));
        this.m = ofFloat;
        ofFloat.setDuration(218L);
        this.m.setInterpolator(this.a);
        this.m.addListener(new d(this, i, i2));
        this.m.addUpdateListener(new e(this, i2));
        StringBuilder sb = new StringBuilder("Starting settle animation: target: ");
        sb.append(i);
        sb.append(", content null: ");
        sb.append(this.u == null);
        AbstractC4851eH1.d("BottomSheet", sb.toString(), new Object[0]);
        q(4, i2);
        this.m.start();
    }

    public final float j() {
        PB pb = this.u;
        if (pb != null && pb.u() && p()) {
            return k() * this.o * this.B;
        }
        return 0.0f;
    }

    public final void s(float f, int i, boolean z) {
        this.q = f;
        float j = (this.o - f) + j();
        if (this.z && JM1.a(j, getTranslationY())) {
            return;
        }
        setTranslationY(j);
        C12157za2 c12157za2 = this.g;
        if (z) {
            int i2 = i();
            if (p() && (!this.z || this.s == 1)) {
                i2 = 1;
            }
            float l = l(i2);
            boolean a = JM1.a(this.q, l);
            boolean z2 = this.q < l;
            boolean z3 = !p() && this.s == 0;
            boolean z4 = this.z;
            if (z4 && (z2 || a || z3)) {
                if (z4) {
                    this.z = false;
                    Iterator it = c12157za2.iterator();
                    while (true) {
                        C11814ya2 c11814ya2 = (C11814ya2) it;
                        if (!c11814ya2.hasNext()) {
                            break;
                        } else {
                            ((InterfaceC4481dC) c11814ya2.next()).d(i);
                        }
                    }
                    if (this.u != null) {
                        announceForAccessibility(getResources().getString(this.u.l()));
                    }
                    clearFocus();
                    setFocusable(false);
                    setFocusableInTouchMode(false);
                    setContentDescription(null);
                }
            } else if (!z4 && this.s != 0 && this.q > l && !z4) {
                this.z = true;
                Iterator it2 = c12157za2.iterator();
                while (true) {
                    C11814ya2 c11814ya22 = (C11814ya2) it2;
                    if (!c11814ya22.hasNext()) {
                        break;
                    } else {
                        ((InterfaceC4481dC) c11814ya22.next()).j();
                    }
                }
            }
        }
        float j2 = this.q - j();
        if (j2 <= l(0) && this.w <= 0.0f) {
            return;
        }
        int i3 = this.o;
        float f2 = i3 > 0 ? j2 / i3 : 0.0f;
        float d = d() - 0.0f;
        float b = d == 0.0f ? 0.0f : JM1.b((f2 - 0.0f) / d, 0.0f, 1.0f);
        if (j2 < l(0)) {
            this.w = 0.0f;
        } else {
            this.w = JM1.a(b, 0.0f) ? 0.0f : b;
        }
        Iterator it3 = c12157za2.iterator();
        while (true) {
            C11814ya2 c11814ya23 = (C11814ya2) it3;
            if (!c11814ya23.hasNext()) {
                return;
            } else {
                ((InterfaceC4481dC) c11814ya23.next()).a(this.w);
            }
        }
    }

    public final void r(float f, boolean z) {
        a();
        if (this.u == null) {
            return;
        }
        if (z) {
            t(m(f, -(this.q - f)), 1, true);
        } else {
            q(4, 1);
            s(f, 1, true);
        }
    }

    public final boolean p() {
        PB pb = this.u;
        return (pb == null || pb.m() == -2) ? false : true;
    }

    public final boolean o() {
        PB pb = this.u;
        if (pb == null) {
            return false;
        }
        return ((((((float) this.o) * 0.25f) > this.j ? 1 : ((((float) this.o) * 0.25f) == this.j ? 0 : -1)) < 0) || pb.p() == -2.0f || this.u.t() == -1.0f) ? false : true;
    }

    public final boolean n() {
        PB pb = this.u;
        return pb != null && pb.t() == -1.0f;
    }

    public final float k() {
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (this.o <= 0 || !p()) {
            return 0.0f;
        }
        PB pb = this.u;
        if (pb != null && pb.m() != 0) {
            return this.u.m() / this.o;
        }
        PB pb2 = this.u;
        View e = (pb2 == null || pb2.e() == null) ? null : this.u.e();
        if (e == null) {
            i = getResources().getDimensionPixelSize(R.dimen.f28640_resource_name_obfuscated_res_0x7f08009c);
        } else {
            int height = e.getHeight();
            if (height != 0 || (layoutParams = e.getLayoutParams()) == null || (height = layoutParams.height) > 0) {
                i = height;
            } else {
                e.measure(View.MeasureSpec.makeMeasureSpec(g(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.o, Integer.MIN_VALUE));
                i = e.getMeasuredHeight();
            }
        }
        return i / this.o;
    }

    public final float d() {
        PB pb;
        if (this.o <= 0 || (pb = this.u) == null) {
            return 0.0f;
        }
        float t = pb.t();
        if (n()) {
            c();
            return Math.min(this.o, this.p) / this.o;
        }
        if (t == 0.0f) {
            return 1.0f;
        }
        return t;
    }

    public final void t(int i, int i2, boolean z) {
        StringBuilder sb = new StringBuilder("Setting sheet state: state: ");
        sb.append(this.r);
        sb.append(", content null: ");
        sb.append(this.u == null);
        AbstractC4851eH1.d("BottomSheet", sb.toString(), new Object[0]);
        if (i == 4) {
            return;
        }
        if (i == 2 && !o()) {
            i = 3;
        }
        a();
        this.s = i;
        if (!z || i == this.r) {
            s(l(i), i2, true);
            q(this.s, i2);
            this.s = -1;
            return;
        }
        b(i, i2);
    }

    public final void q(int i, int i2) {
        int g;
        int i3 = this.r;
        if (i == i3) {
            return;
        }
        PB pb = this.u;
        if (pb == null && i != 0) {
            AbstractC4851eH1.d("BottomSheet", "Content null while open! ", new Object[0]);
            final Throwable th = new Throwable("This is not a crash. See https://crbug.com/1126872 for details.");
            PostTask.c(QF3.h, new Runnable() { // from class: org.chromium.components.browser_ui.bottomsheet.a
                @Override // java.lang.Runnable
                public final void run() {
                    BottomSheet.F.onResult(th);
                }
            });
            t(0, 0, false);
            return;
        }
        if (i == -1) {
            t(m(this.q, 0.0f), 0, false);
            return;
        }
        if (i != 4 || i3 == 4) {
            i3 = -1;
        }
        this.t = i3;
        this.r = i;
        if (i == 2 || i == 3) {
            if (i == 3) {
                g = pb.s();
            } else {
                g = pb.g();
            }
            announceForAccessibility(getResources().getString(g));
            setFocusable(true);
            setFocusableInTouchMode(true);
            String string = getResources().getString(this.u.q());
            if (this.u.v()) {
                StringBuilder a = M41.a(string, ". ");
                a.append(getResources().getString(R.string.f69560_resource_name_obfuscated_res_0x7f1402b7));
                string = a.toString();
            }
            setContentDescription(string);
            if (getFocusedChild() == null) {
                requestFocus();
            }
        }
        w();
        Iterator it = this.g.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC4481dC) c11814ya2.next()).h(this.r, i2);
            }
        }
    }

    public final float l(int i) {
        if (n() && i == 3) {
            c();
        }
        float f = 0.0f;
        if (i != 0) {
            if (i == 1) {
                f = k();
            } else if (i != 2) {
                if (i == 3) {
                    f = d();
                } else {
                    throw new IllegalArgumentException(AbstractC9076qb1.a("Invalid state: ", i));
                }
            } else if (this.o > 0 && o()) {
                float p = this.u.p();
                if (p == 0.0f) {
                    p = 0.75f;
                }
                f = p;
            }
        }
        return f * this.o;
    }

    public final int g() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f28630_resource_name_obfuscated_res_0x7f08009b);
        int i = this.n;
        return i > dimensionPixelSize ? getResources().getDimensionPixelSize(R.dimen.f28620_resource_name_obfuscated_res_0x7f08009a) : i;
    }

    public final void w() {
        int i;
        getLayoutParams().width = g();
        setTranslationX(((this.n - r0) * (LocalizationUtils.isLayoutRtl() ? -1 : 1)) / 2.0f);
        if (this.D.getAttributes().y != 0 && ((i = this.r) == 1 || i == 2 || i == 3)) {
            this.u.c().getLayoutParams().height = ((Integer) this.E.get()).intValue() - ((int) getTranslationY());
        }
        requestLayout();
    }

    public final void c() {
        if (this.p != -1.0f) {
            return;
        }
        this.u.c().measure(View.MeasureSpec.makeMeasureSpec(g(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.o, Integer.MIN_VALUE));
        this.p = this.u.c().getMeasuredHeight();
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a8, code lost:            if (r9 <= r0) goto L71;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m(float r9, float r10) {
        /*
            r8 = this;
            float r0 = r8.h()
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 > 0) goto Ld
            int r9 = r8.i()
            return r9
        Ld:
            float r0 = r8.f()
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            r1 = 3
            if (r0 < 0) goto L17
            return r1
        L17:
            r0 = 0
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r2 = 0
            r3 = 1
            if (r0 >= 0) goto L20
            r0 = r3
            goto L21
        L20:
            r0 = r2
        L21:
            if (r0 == 0) goto L30
            PB r4 = r8.u
            if (r4 == 0) goto L2c
            boolean r4 = r4.v()
            goto L2d
        L2c:
            r4 = r3
        L2d:
            if (r4 != 0) goto L30
            float r9 = r9 - r10
        L30:
            int r10 = r8.t
            r4 = 2
            if (r0 == 0) goto L3a
            int r1 = r8.e(r9, r0)
            goto L61
        L3a:
            int r5 = r8.e(r9, r0)
            r6 = r4
        L3f:
            int r7 = r5 + 1
            if (r6 <= r7) goto L61
            if (r6 != r4) goto L4c
            boolean r7 = r8.o()
            if (r7 != 0) goto L4c
            goto L5e
        L4c:
            if (r6 != r3) goto L55
            boolean r7 = r8.p()
            if (r7 != 0) goto L55
            goto L5e
        L55:
            float r7 = r8.l(r6)
            int r7 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r7 > 0) goto L5e
            r1 = r6
        L5e:
            int r6 = r6 + (-1)
            goto L3f
        L61:
            if (r1 != r10) goto L64
            goto Lab
        L64:
            r5 = -1
            if (r10 == r5) goto Laa
            r5 = 4
            if (r10 != r5) goto L6b
            goto Laa
        L6b:
            float r5 = r8.l(r10)
            float r6 = r8.l(r1)
            float r6 = r6 - r5
            float r9 = r9 - r5
            float r9 = r9 / r6
            float r9 = java.lang.Math.abs(r9)
            if (r1 != r4) goto L7d
            goto L9f
        L7d:
            if (r0 == 0) goto L83
            if (r10 <= r4) goto L83
            if (r1 < r4) goto L89
        L83:
            if (r0 != 0) goto L8b
            if (r10 >= r4) goto L8b
            if (r1 <= r4) goto L8b
        L89:
            r0 = r3
            goto L8c
        L8b:
            r0 = r2
        L8c:
            if (r0 != 0) goto L8f
            goto L9f
        L8f:
            PB r0 = r8.u
            if (r0 == 0) goto L9c
            boolean r0 = r0.r()
            if (r0 == 0) goto L9a
            goto L9c
        L9a:
            r0 = r2
            goto L9d
        L9c:
            r0 = r3
        L9d:
            if (r0 != 0) goto La3
        L9f:
            r0 = 1053609165(0x3ecccccd, float:0.4)
            goto La6
        La3:
            r0 = 1050253722(0x3e99999a, float:0.3)
        La6:
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 <= 0) goto Lab
        Laa:
            r2 = r3
        Lab:
            if (r2 == 0) goto Lae
            r10 = r1
        Lae:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.components.browser_ui.bottomsheet.BottomSheet.m(float, float):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:            if ((r1 == null || r1.r()) != false) goto L12;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(float r6, boolean r7) {
        /*
            r5 = this;
            int r0 = r5.i()
            boolean r1 = r5.o()
            r2 = 1
            if (r1 == 0) goto L1c
            PB r1 = r5.u
            r3 = 0
            if (r1 == 0) goto L19
            boolean r1 = r1.r()
            if (r1 == 0) goto L17
            goto L19
        L17:
            r1 = r3
            goto L1a
        L19:
            r1 = r2
        L1a:
            if (r1 == 0) goto L1d
        L1c:
            r3 = r2
        L1d:
            int r1 = r0 + 1
        L1f:
            r4 = 3
            if (r1 >= r4) goto L47
            if (r1 != r2) goto L2b
            boolean r4 = r5.p()
            if (r4 != 0) goto L2b
            goto L44
        L2b:
            r4 = 2
            if (r1 != r4) goto L31
            if (r3 == 0) goto L31
            goto L44
        L31:
            float r4 = r5.l(r1)
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 > 0) goto L43
            float r4 = r5.l(r1)
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 != 0) goto L44
            if (r7 != 0) goto L44
        L43:
            r0 = r1
        L44:
            int r1 = r1 + 1
            goto L1f
        L47:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.components.browser_ui.bottomsheet.BottomSheet.e(float, boolean):int");
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.p = -1.0f;
        int i9 = this.r;
        if (i9 == 0 || i9 == 1) {
            return;
        }
        if ((this.m != null) || i9 != 4) {
            t(i9, 0, true);
        }
    }
}
