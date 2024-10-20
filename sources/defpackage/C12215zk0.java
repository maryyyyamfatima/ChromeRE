package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zk0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12215zk0 extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ View g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ C1983Pg3 i;
    public final /* synthetic */ C1091Ik0 j;

    public C12215zk0(ViewGroup viewGroup, View view, boolean z, C1983Pg3 c1983Pg3, C1091Ik0 c1091Ik0) {
        this.a = viewGroup;
        this.g = view;
        this.h = z;
        this.i = c1983Pg3;
        this.j = c1091Ik0;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.a;
        View view = this.g;
        viewGroup.endViewTransition(view);
        if (this.h) {
            AbstractC2503Tg3.a(this.i.a, view);
        }
        this.j.a();
    }
}
