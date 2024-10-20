package org.chromium.chrome.browser.tasks.tab_management;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import defpackage.C11814ya2;
import defpackage.InterfaceC9975tB3;
import defpackage.ZC3;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class g extends AnimatorListenerAdapter {
    public final /* synthetic */ TabListRecyclerView a;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        TabListRecyclerView tabListRecyclerView = this.a;
        tabListRecyclerView.R0 = null;
        tabListRecyclerView.setVisibility(4);
        Iterator it = ((ZC3) tabListRecyclerView.S0).n.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC9975tB3) c11814ya2.next()).b();
            }
        }
    }

    public g(TabListRecyclerView tabListRecyclerView) {
        this.a = tabListRecyclerView;
    }
}
