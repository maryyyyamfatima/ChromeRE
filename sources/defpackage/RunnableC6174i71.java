package defpackage;

import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: i71 */
/* loaded from: classes.dex */
public final class RunnableC6174i71 implements Runnable {
    public final CoordinatorLayout a;
    public final View g;
    public final /* synthetic */ AbstractC6516j71 h;

    public RunnableC6174i71(AbstractC6516j71 abstractC6516j71, CoordinatorLayout coordinatorLayout, View view) {
        this.h = abstractC6516j71;
        this.a = coordinatorLayout;
        this.g = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC6516j71 abstractC6516j71;
        OverScroller overScroller;
        View view = this.g;
        if (view == null || (overScroller = (abstractC6516j71 = this.h).d) == null) {
            return;
        }
        boolean computeScrollOffset = overScroller.computeScrollOffset();
        CoordinatorLayout coordinatorLayout = this.a;
        if (computeScrollOffset) {
            abstractC6516j71.u(coordinatorLayout, view, abstractC6516j71.d.getCurrY());
            view.postOnAnimation(this);
            return;
        }
        AppBarLayout appBarLayout = (AppBarLayout) view;
        ((AppBarLayout.Behavior) abstractC6516j71).z(coordinatorLayout, appBarLayout);
        if (appBarLayout.p) {
            appBarLayout.j(appBarLayout.k(AppBarLayout.Behavior.w(coordinatorLayout)));
        }
    }
}
