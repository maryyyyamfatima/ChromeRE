package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.chrome.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gl1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5700gl1 {
    public final Context a;
    public final TextInputLayout b;
    public LinearLayout c;
    public int d;
    public FrameLayout e;
    public Animator f;
    public final float g;
    public int h;
    public int i;
    public CharSequence j;
    public boolean k;
    public C10475ug l;
    public CharSequence m;
    public int n;
    public ColorStateList o;
    public CharSequence p;
    public boolean q;
    public C10475ug r;
    public int s;
    public ColorStateList t;

    public C5700gl1(TextInputLayout textInputLayout) {
        this.a = textInputLayout.getContext();
        this.b = textInputLayout;
        this.g = r0.getResources().getDimensionPixelSize(R.dimen.f30950_resource_name_obfuscated_res_0x7f0801b5);
    }

    public final void f() {
        this.j = null;
        c();
        if (this.h == 1) {
            if (this.q && !TextUtils.isEmpty(this.p)) {
                this.i = 2;
            } else {
                this.i = 0;
            }
        }
        i(this.h, this.i, h(this.l, ""));
    }

    public final boolean h(TextView textView, CharSequence charSequence) {
        WeakHashMap weakHashMap = Ec4.a;
        TextInputLayout textInputLayout = this.b;
        return textInputLayout.isLaidOut() && textInputLayout.isEnabled() && !(this.i == this.h && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    public final void i(int i, int i2, boolean z) {
        TextView e;
        TextView e2;
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.q, this.r, 2, i, i2);
            d(arrayList, this.k, this.l, 1, i, i2);
            AbstractC1180Jc.a(animatorSet, arrayList);
            animatorSet.addListener(new C5012el1(this, i2, e(i), i, e(i2)));
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (e2 = e(i2)) != null) {
                e2.setVisibility(0);
                e2.setAlpha(1.0f);
            }
            if (i != 0 && (e = e(i)) != null) {
                e.setVisibility(4);
                if (i == 1) {
                    e.setText((CharSequence) null);
                }
            }
            this.h = i2;
        }
        TextInputLayout textInputLayout = this.b;
        textInputLayout.v();
        textInputLayout.y(z, false);
        textInputLayout.B();
    }

    public final void d(ArrayList arrayList, boolean z, TextView textView, int i, int i2, int i3) {
        if (textView == null || !z) {
            return;
        }
        if (i == i3 || i == i2) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, i3 == i ? 1.0f : 0.0f);
            ofFloat.setDuration(167L);
            ofFloat.setInterpolator(AbstractC0270Cc.a);
            arrayList.add(ofFloat);
            if (i3 == i) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.g, 0.0f);
                ofFloat2.setDuration(217L);
                ofFloat2.setInterpolator(AbstractC0270Cc.d);
                arrayList.add(ofFloat2);
            }
        }
    }

    public final void c() {
        Animator animator = this.f;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final TextView e(int i) {
        if (i == 1) {
            return this.l;
        }
        if (i != 2) {
            return null;
        }
        return this.r;
    }

    public final void b() {
        LinearLayout linearLayout = this.c;
        TextInputLayout textInputLayout = this.b;
        if ((linearLayout == null || textInputLayout.i == null) ? false : true) {
            EditText editText = textInputLayout.i;
            Context context = this.a;
            boolean d = AM1.d(context);
            LinearLayout linearLayout2 = this.c;
            WeakHashMap weakHashMap = Ec4.a;
            int paddingStart = editText.getPaddingStart();
            if (d) {
                paddingStart = context.getResources().getDimensionPixelSize(R.dimen.f35380_resource_name_obfuscated_res_0x7f0804b8);
            }
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f35370_resource_name_obfuscated_res_0x7f0804b7);
            if (d) {
                dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f35390_resource_name_obfuscated_res_0x7f0804b9);
            }
            int paddingEnd = editText.getPaddingEnd();
            if (d) {
                paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.f35380_resource_name_obfuscated_res_0x7f0804b8);
            }
            linearLayout2.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
        }
    }

    public final void a(int i, TextView textView) {
        if (this.c == null && this.e == null) {
            Context context = this.a;
            LinearLayout linearLayout = new LinearLayout(context);
            this.c = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.c;
            TextInputLayout textInputLayout = this.b;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.e = new FrameLayout(context);
            this.c.addView(this.e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.i != null) {
                b();
            }
        }
        if (i == 0 || i == 1) {
            this.e.setVisibility(0);
            this.e.addView(textView);
        } else {
            this.c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.c.setVisibility(0);
        this.d++;
    }

    public final void g(int i, TextView textView) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.c;
        if (linearLayout == null) {
            return;
        }
        boolean z = true;
        if (i != 0 && i != 1) {
            z = false;
        }
        if (z && (frameLayout = this.e) != null) {
            frameLayout.removeView(textView);
        } else {
            linearLayout.removeView(textView);
        }
        int i2 = this.d - 1;
        this.d = i2;
        LinearLayout linearLayout2 = this.c;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }
}
