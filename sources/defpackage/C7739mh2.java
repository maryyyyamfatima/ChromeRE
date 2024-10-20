package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.util.Property;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import java.util.HashMap;
import org.chromium.components.browser_ui.widget.FadingEdgeScrollView;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mh2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7739mh2 {
    public final C0813Gg2 a;
    public final FadingEdgeScrollView b;
    public final boolean c;
    public final DialogC6707jh2 d;
    public final PropertyModel e;
    public final ZX1 f;
    public final InterfaceC3906bY1 g;
    public Animator h;
    public boolean i;

    public C7739mh2(Context context, C0813Gg2 c0813Gg2, View view, boolean z, ZX1 zx1, InterfaceC3906bY1 interfaceC3906bY1) {
        this.a = c0813Gg2;
        this.c = z;
        this.f = zx1;
        this.g = interfaceC3906bY1;
        if (z) {
            this.b = new C7051kh2(this, context, context, view);
        } else {
            this.b = new FadingEdgeScrollView(context, null);
        }
        this.b.setVisibility(4);
        this.b.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC5677gh2(this));
        this.b.addView(c0813Gg2);
        if (z) {
            FadingEdgeScrollView fadingEdgeScrollView = this.b;
            DialogC6707jh2 dialogC6707jh2 = new DialogC6707jh2(this, context);
            dialogC6707jh2.requestWindowFeature(1);
            dialogC6707jh2.setCanceledOnTouchOutside(true);
            Window window = dialogC6707jh2.getWindow();
            window.setGravity(48);
            window.setBackgroundDrawable(new ColorDrawable(0));
            dialogC6707jh2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: fh2
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    C7739mh2.this.g.a(0);
                }
            });
            dialogC6707jh2.addContentView(fadingEdgeScrollView, new LinearLayout.LayoutParams(-1, -1));
            window.setLayout(-1, -2);
            this.d = dialogC6707jh2;
            this.e = null;
            return;
        }
        FadingEdgeScrollView fadingEdgeScrollView2 = this.b;
        HashMap e = PropertyModel.e(AbstractC4249cY1.B);
        JD2 jd2 = AbstractC4249cY1.a;
        GD2 gd2 = new GD2();
        gd2.a = interfaceC3906bY1;
        e.put(jd2, gd2);
        PD2 pd2 = AbstractC4249cY1.h;
        GD2 gd22 = new GD2();
        gd22.a = fadingEdgeScrollView2;
        e.put(pd2, gd22);
        LD2 ld2 = AbstractC4249cY1.r;
        AD2 ad2 = new AD2();
        ad2.a = true;
        e.put(ld2, ad2);
        this.e = new PropertyModel(e);
        this.d = null;
    }

    public final void b(boolean z) {
        this.i = !z;
        if (this.c) {
            this.d.dismiss();
        } else {
            this.f.c(0, this.e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Animator a(C7739mh2 c7739mh2, boolean z, RunnableC6021hh2 runnableC6021hh2) {
        AnimatorSet animatorSet;
        ObjectAnimator objectAnimator;
        if (c7739mh2.c) {
            FadingEdgeScrollView fadingEdgeScrollView = c7739mh2.b;
            float f = -fadingEdgeScrollView.getHeight();
            if (z) {
                fadingEdgeScrollView.setTranslationY(f);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fadingEdgeScrollView, (Property<FadingEdgeScrollView, Float>) View.TRANSLATION_Y, 0.0f);
                ofFloat.setInterpolator(InterpolatorC0485Dt.e);
                objectAnimator = ofFloat;
            } else {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fadingEdgeScrollView, (Property<FadingEdgeScrollView, Float>) View.TRANSLATION_Y, f);
                ofFloat2.setInterpolator(InterpolatorC0485Dt.d);
                objectAnimator = ofFloat2;
            }
            objectAnimator.setDuration(200L);
            animatorSet = objectAnimator;
        } else {
            animatorSet = new AnimatorSet();
        }
        if (z) {
            animatorSet.setStartDelay(100L);
        }
        animatorSet.addListener(new C7395lh2(c7739mh2, runnableC6021hh2));
        Animator animator = c7739mh2.h;
        if (animator != null) {
            animator.cancel();
        }
        c7739mh2.h = animatorSet;
        return animatorSet;
    }
}
