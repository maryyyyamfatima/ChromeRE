package defpackage;

import J.N;
import android.app.Activity;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ZK0 extends C2303Rs3 implements InterfaceC6999kY2 {
    public final Activity I;

    /* renamed from: J, reason: collision with root package name */
    public final int f11479J;
    public View K;
    public final int L;
    public final C12157za2 M;
    public float N;
    public boolean O;
    public FY2 P;
    public int Q;

    @Override // defpackage.InterfaceC6999kY2
    public final void a(int i) {
    }

    @Override // defpackage.InterfaceC6999kY2
    public final void b(int i) {
    }

    public static ZK0 l(Activity activity) {
        C7928nE c7928nE = UN.a;
        if (!AbstractC8293oI0.a() || !N.M09VlOh_("FeedInteractiveRefresh")) {
            return null;
        }
        ZK0 zk0 = new ZK0(activity);
        zk0.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        int c = AbstractC11746yN.c(activity, R.dimen.f30400_resource_name_obfuscated_res_0x7f080172);
        zk0.o.setBackgroundColor(c);
        zk0.t.g.w = c;
        int[] iArr = {AbstractC10957w33.b(activity)};
        C11400xM1 c11400xM1 = zk0.t.g;
        c11400xM1.j = iArr;
        c11400xM1.b(0);
        c11400xM1.b(0);
        zk0.setEnabled(false);
        int i = (int) (16.0f * activity.getResources().getDisplayMetrics().density);
        zk0.m = false;
        zk0.o.setVisibility(8);
        zk0.j = i;
        zk0.s = i;
        zk0.x = (int) (r2 * 80.0f);
        zk0.C = true;
        zk0.o.invalidate();
        zk0.M.a(new XK0(zk0, activity));
        return zk0;
    }

    public ZK0(Activity activity) {
        super(activity);
        this.M = new C12157za2();
        this.I = activity;
        this.f11479J = R.id.toolbar_container;
        this.L = ViewConfiguration.get(activity).getScaledTouchSlop();
        this.a = new YK0(this);
    }

    public final void m() {
        if (isEnabled()) {
            setEnabled(false);
            FY2 fy2 = this.P;
            if (fy2 != null) {
                fy2.c(this);
                this.P = null;
            }
        }
    }

    public final void n() {
        if (this.K == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!(childAt instanceof C3874bS)) {
                    this.K = childAt;
                    return;
                }
            }
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 8) {
            f();
        }
    }

    @Override // defpackage.C2303Rs3, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        n();
        if (this.K == null) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        View view = this.K;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
    }

    @Override // defpackage.C2303Rs3, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        n();
        View view = this.K;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:            if (r0 != 3) goto L37;     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            boolean r0 = r5.isEnabled()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            FY2 r0 = r5.P
            if (r0 == 0) goto L11
            int r0 = r5.Q
            if (r0 == 0) goto L20
            return r1
        L11:
            r5.n()
            android.view.View r0 = r5.K
            if (r0 == 0) goto L62
            r2 = -1
            boolean r0 = r0.canScrollVertically(r2)
            if (r0 == 0) goto L20
            goto L62
        L20:
            int r0 = r6.getAction()
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 == 0) goto L52
            r3 = 1
            if (r0 == r3) goto L4f
            r4 = 2
            if (r0 == r4) goto L32
            r6 = 3
            if (r0 == r6) goto L4f
            goto L5f
        L32:
            float r6 = r6.getY()
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 != 0) goto L3b
            return r1
        L3b:
            float r0 = r5.N
            float r6 = r6 - r0
            int r0 = r5.L
            float r0 = (float) r0
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 <= 0) goto L5f
            boolean r6 = r5.O
            if (r6 != 0) goto L5f
            r5.O = r3
            r5.j(r1)
            goto L5f
        L4f:
            r5.O = r1
            goto L5f
        L52:
            r5.O = r1
            float r6 = r6.getY()
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 != 0) goto L5d
            return r1
        L5d:
            r5.N = r6
        L5f:
            boolean r6 = r5.O
            return r6
        L62:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ZK0.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0015, code lost:            if (r0 != 3) goto L17;     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = r5.getAction()
            r2 = 1
            if (r0 == 0) goto L2f
            if (r0 == r2) goto L29
            r3 = 2
            if (r0 == r3) goto L18
            r5 = 3
            if (r0 == r5) goto L29
            goto L31
        L18:
            float r0 = r5.getY()
            float r1 = r4.N
            float r0 = r0 - r1
            r4.d(r0)
            float r5 = r5.getY()
            r4.N = r5
            goto L31
        L29:
            r4.e(r2)
            r4.O = r1
            return r1
        L2f:
            r4.O = r1
        L31:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ZK0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // defpackage.InterfaceC6999kY2
    public final void c(int i) {
        this.Q = i;
    }
}
