package defpackage;

import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zS0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC12115zS0 implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final float a;
    public final int g;
    public final int h;
    public final View i;
    public RunnableC11429xS0 j;
    public RunnableC11772yS0 k;
    public boolean l;
    public int m;
    public final int[] n = new int[2];

    public abstract Q93 b();

    public abstract boolean c();

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    public AbstractViewOnTouchListenerC12115zS0(View view) {
        this.i = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.g = tapTimeout;
        this.h = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0080, code lost:            if (r4 != 3) goto L61;     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010c  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractViewOnTouchListenerC12115zS0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.l = false;
        this.m = -1;
        RunnableC11429xS0 runnableC11429xS0 = this.j;
        if (runnableC11429xS0 != null) {
            this.i.removeCallbacks(runnableC11429xS0);
        }
    }

    public boolean d() {
        Q93 b = b();
        if (b == null || !b.a()) {
            return true;
        }
        b.dismiss();
        return true;
    }

    public final void a() {
        RunnableC11772yS0 runnableC11772yS0 = this.k;
        View view = this.i;
        if (runnableC11772yS0 != null) {
            view.removeCallbacks(runnableC11772yS0);
        }
        RunnableC11429xS0 runnableC11429xS0 = this.j;
        if (runnableC11429xS0 != null) {
            view.removeCallbacks(runnableC11429xS0);
        }
    }
}
