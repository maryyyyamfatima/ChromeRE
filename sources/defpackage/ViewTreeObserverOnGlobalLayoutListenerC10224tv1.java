package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tv1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC10224tv1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final View a;
    public final Runnable g;
    public final RunnableC9881sv1 h = new RunnableC9881sv1(this);
    public final Rect i = new Rect();
    public C8820pp4 j;
    public boolean k;
    public int l;

    public ViewTreeObserverOnGlobalLayoutListenerC10224tv1(View view, X24 x24) {
        this.a = view;
        this.g = x24;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (a() > this.l) {
            this.g.run();
            b();
        }
    }

    public final int a() {
        C8820pp4 c8820pp4 = this.j;
        if (c8820pp4 != null) {
            View decorView = c8820pp4.a.getDecorView();
            Rect rect = this.i;
            decorView.getWindowVisibleDisplayFrame(rect);
            return Math.min(rect.height(), this.j.a.getDecorView().getHeight());
        }
        return this.a.getRootView().getHeight();
    }

    public final void b() {
        if (this.k) {
            View view = this.a;
            view.removeCallbacks(this.h);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.k = false;
        }
    }
}
