package org.chromium.chrome.browser.tasks.tab_management;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import defpackage.AbstractC2348Sb3;
import defpackage.AbstractC5177fD3;
import defpackage.C11814ya2;
import defpackage.C9537rv0;
import defpackage.InterfaceC9975tB3;
import defpackage.ZC3;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class e extends AnimatorListenerAdapter {
    public final /* synthetic */ TabListRecyclerView a;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C9537rv0 c9537rv0;
        TabListRecyclerView tabListRecyclerView = this.a;
        tabListRecyclerView.Q0 = null;
        Iterator it = ((ZC3) tabListRecyclerView.S0).n.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                break;
            } else {
                ((InterfaceC9975tB3) c11814ya2.next()).c();
            }
        }
        AbstractC2348Sb3 abstractC2348Sb3 = tabListRecyclerView.a1;
        if (abstractC2348Sb3 != null) {
            tabListRecyclerView.p0(abstractC2348Sb3);
            tabListRecyclerView.a1 = null;
        }
        tabListRecyclerView.x0(tabListRecyclerView.computeVerticalScrollOffset() > 0);
        f fVar = tabListRecyclerView.U0;
        if (fVar != null) {
            fVar.j.b();
            if (tabListRecyclerView.V0 && (c9537rv0 = tabListRecyclerView.T0) != null) {
                c9537rv0.e(tabListRecyclerView.P0);
                tabListRecyclerView.V0 = false;
            }
        }
        if (AbstractC5177fD3.g()) {
            tabListRecyclerView.requestLayout();
        }
    }

    public e(TabListRecyclerView tabListRecyclerView) {
        this.a = tabListRecyclerView;
    }
}
