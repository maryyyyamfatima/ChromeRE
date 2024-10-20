package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import com.android.chrome.R;
import com.google.android.material.internal.CheckableImageButton;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sT */
/* loaded from: classes.dex */
public final class C9718sT extends AbstractC3790bB0 {
    public EditText e;
    public final ViewOnClickListenerC7659mT f;
    public final ViewOnFocusChangeListenerC8003nT g;
    public AnimatorSet h;
    public ValueAnimator i;

    @Override // defpackage.AbstractC3790bB0
    public final int c() {
        return R.string.0_resource_name_obfuscated_res_0x7f14035a;
    }

    @Override // defpackage.AbstractC3790bB0
    public final int d() {
        return R.drawable.0_resource_name_obfuscated_res_0x7f0903c2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [mT] */
    /* JADX WARN: Type inference failed for: r1v2, types: [nT] */
    public C9718sT(ZA0 za0) {
        super(za0);
        this.f = new View.OnClickListener() { // from class: mT
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C9718sT c9718sT = C9718sT.this;
                EditText editText = c9718sT.e;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                c9718sT.q();
            }
        };
        this.g = new View.OnFocusChangeListener() { // from class: nT
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                C9718sT c9718sT = C9718sT.this;
                c9718sT.t(c9718sT.u());
            }
        };
    }

    @Override // defpackage.AbstractC3790bB0
    public final void s() {
        EditText editText = this.e;
        if (editText != null) {
            editText.post(new Runnable() { // from class: lT
                @Override // java.lang.Runnable
                public final void run() {
                    C9718sT.this.t(true);
                }
            });
        }
    }

    @Override // defpackage.AbstractC3790bB0
    public final View.OnClickListener f() {
        return this.f;
    }

    @Override // defpackage.AbstractC3790bB0
    public final void m(EditText editText) {
        this.e = editText;
        this.a.h.g(u());
    }

    @Override // defpackage.AbstractC3790bB0
    public final View.OnFocusChangeListener e() {
        return this.g;
    }

    @Override // defpackage.AbstractC3790bB0
    public final View.OnFocusChangeListener g() {
        return this.g;
    }

    public final void t(boolean z) {
        boolean z2 = this.b.c() == z;
        if (z && !this.h.isRunning()) {
            this.i.cancel();
            this.h.start();
            if (z2) {
                this.h.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.h.cancel();
        this.i.start();
        if (z2) {
            this.i.end();
        }
    }

    @Override // defpackage.AbstractC3790bB0
    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(AbstractC0270Cc.d);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: oT
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C9718sT c9718sT = C9718sT.this;
                c9718sT.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CheckableImageButton checkableImageButton = c9718sT.d;
                checkableImageButton.setScaleX(floatValue);
                checkableImageButton.setScaleY(floatValue);
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        LinearInterpolator linearInterpolator = AbstractC0270Cc.a;
        ofFloat2.setInterpolator(linearInterpolator);
        ofFloat2.setDuration(100L);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: pT
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C9718sT c9718sT = C9718sT.this;
                c9718sT.getClass();
                c9718sT.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.h = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.h.addListener(new C9033qT(this));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(linearInterpolator);
        ofFloat3.setDuration(100L);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: pT
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C9718sT c9718sT = C9718sT.this;
                c9718sT.getClass();
                c9718sT.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        this.i = ofFloat3;
        ofFloat3.addListener(new C9375rT(this));
    }

    public final boolean u() {
        EditText editText = this.e;
        return editText != null && (editText.hasFocus() || this.d.hasFocus()) && this.e.getText().length() > 0;
    }

    @Override // defpackage.AbstractC3790bB0
    public final void a() {
        if (this.b.s != null) {
            return;
        }
        t(u());
    }

    @Override // defpackage.AbstractC3790bB0
    public final void p(boolean z) {
        if (this.b.s == null) {
            return;
        }
        t(z);
    }
}
