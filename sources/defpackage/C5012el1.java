package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: el1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5012el1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ TextView g;
    public final /* synthetic */ int h;
    public final /* synthetic */ TextView i;
    public final /* synthetic */ C5700gl1 j;

    public C5012el1(C5700gl1 c5700gl1, int i, TextView textView, int i2, TextView textView2) {
        this.j = c5700gl1;
        this.a = i;
        this.g = textView;
        this.h = i2;
        this.i = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C10475ug c10475ug;
        int i = this.a;
        C5700gl1 c5700gl1 = this.j;
        c5700gl1.h = i;
        c5700gl1.f = null;
        TextView textView = this.g;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.h == 1 && (c10475ug = c5700gl1.l) != null) {
                c10475ug.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.i;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.i;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }
}
