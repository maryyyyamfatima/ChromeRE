package defpackage;

import android.view.View;
import android.widget.OverScroller;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ts3 */
/* loaded from: classes.dex */
public final class RunnableC10208ts3 implements Runnable {
    public final View a;
    public final boolean g;
    public final /* synthetic */ C2579Tw h;

    public RunnableC10208ts3(C2579Tw c2579Tw, View view, boolean z) {
        this.h = c2579Tw;
        this.a = view;
        this.g = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2189Qw c2189Qw;
        C2579Tw c2579Tw = this.h;
        Nc4 nc4 = c2579Tw.a;
        View view = this.a;
        if (nc4 != null) {
            if (nc4.a == 2) {
                OverScroller overScroller = nc4.p;
                boolean computeScrollOffset = overScroller.computeScrollOffset();
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int left = currX - nc4.r.getLeft();
                int top = currY - nc4.r.getTop();
                if (left != 0) {
                    View view2 = nc4.r;
                    WeakHashMap weakHashMap = Ec4.a;
                    view2.offsetLeftAndRight(left);
                }
                if (top != 0) {
                    View view3 = nc4.r;
                    WeakHashMap weakHashMap2 = Ec4.a;
                    view3.offsetTopAndBottom(top);
                }
                if (left != 0 || top != 0) {
                    nc4.q.b(nc4.r, currX);
                }
                if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                    overScroller.abortAnimation();
                    computeScrollOffset = false;
                }
                if (!computeScrollOffset) {
                    nc4.t.post(nc4.u);
                }
            }
            if (nc4.a == 2) {
                WeakHashMap weakHashMap3 = Ec4.a;
                view.postOnAnimation(this);
                return;
            }
        }
        if (!this.g || (c2189Qw = c2579Tw.b) == null) {
            return;
        }
        c2189Qw.a(view);
    }
}
