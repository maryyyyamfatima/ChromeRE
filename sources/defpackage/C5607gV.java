package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.lang.ref.WeakReference;
import org.chromium.chrome.browser.tasks.tab_management.ClosableTabGridView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gV, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5607gV extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ View g;
    public final /* synthetic */ ClosableTabGridView h;

    public C5607gV(ClosableTabGridView closableTabGridView, boolean z, View view) {
        this.h = closableTabGridView;
        this.a = z;
        this.g = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.a) {
            this.g.setVisibility(8);
        }
        WeakReference weakReference = ClosableTabGridView.h;
        this.h.getClass();
    }
}
