package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.android.chrome.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Au0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0101Au0 extends AbstractC3790bB0 {
    public AutoCompleteTextView e;
    public final ViewOnClickListenerC9874su0 f;
    public final ViewOnFocusChangeListenerC10217tu0 g;
    public final C10560uu0 h;
    public boolean i;
    public boolean j;
    public boolean k;
    public long l;
    public AccessibilityManager m;
    public ValueAnimator n;
    public ValueAnimator o;

    @Override // defpackage.AbstractC3790bB0
    public final int c() {
        return R.string.f73470_resource_name_obfuscated_res_0x7f140483;
    }

    @Override // defpackage.AbstractC3790bB0
    public final int d() {
        return R.drawable.f51620_resource_name_obfuscated_res_0x7f0903bf;
    }

    @Override // defpackage.AbstractC3790bB0
    public final boolean i(int i) {
        return i != 0;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [su0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [tu0] */
    public C0101Au0(ZA0 za0) {
        super(za0);
        this.f = new View.OnClickListener() { // from class: su0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0101Au0.this.u();
            }
        };
        this.g = new View.OnFocusChangeListener() { // from class: tu0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                C0101Au0 c0101Au0 = C0101Au0.this;
                c0101Au0.i = z;
                c0101Au0.q();
                if (z) {
                    return;
                }
                c0101Au0.t(false);
                c0101Au0.j = false;
            }
        };
        this.h = new C10560uu0(this);
        this.l = Long.MAX_VALUE;
    }

    @Override // defpackage.AbstractC3790bB0
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.e;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.e.setOnDismissListener(null);
        }
    }

    @Override // defpackage.AbstractC3790bB0
    public final C10560uu0 h() {
        return this.h;
    }

    @Override // defpackage.AbstractC3790bB0
    public final boolean l() {
        return this.k;
    }

    @Override // defpackage.AbstractC3790bB0
    public final boolean j() {
        return this.i;
    }

    @Override // defpackage.AbstractC3790bB0
    public final View.OnClickListener f() {
        return this.f;
    }

    @Override // defpackage.AbstractC3790bB0
    public final void a() {
        if (this.m.isTouchExplorationEnabled()) {
            if ((this.e.getInputType() != 0) && !this.d.hasFocus()) {
                this.e.dismissDropDown();
            }
        }
        this.e.post(new Runnable() { // from class: vu0
            @Override // java.lang.Runnable
            public final void run() {
                C0101Au0 c0101Au0 = C0101Au0.this;
                boolean isPopupShowing = c0101Au0.e.isPopupShowing();
                c0101Au0.t(isPopupShowing);
                c0101Au0.j = isPopupShowing;
            }
        });
    }

    @Override // defpackage.AbstractC3790bB0
    public final View.OnFocusChangeListener e() {
        return this.g;
    }

    @Override // defpackage.AbstractC3790bB0
    public final void n(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        boolean z = true;
        if (!(this.e.getInputType() != 0)) {
            accessibilityNodeInfoCompat.m(Spinner.class.getName());
        }
        if (Build.VERSION.SDK_INT >= 26) {
            z = accessibilityNodeInfoCompat.a.isShowingHintText();
        } else {
            Bundle f = accessibilityNodeInfoCompat.f();
            if (f == null || (f.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & 4) != 4) {
                z = false;
            }
        }
        if (z) {
            accessibilityNodeInfoCompat.p(null);
        }
    }

    @Override // defpackage.AbstractC3790bB0
    public final void o(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 1 && this.m.isEnabled()) {
            if (this.e.getInputType() != 0) {
                return;
            }
            u();
            this.j = true;
            this.l = System.currentTimeMillis();
        }
    }

    public final void u() {
        if (this.e == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.l;
        if (currentTimeMillis < 0 || currentTimeMillis > 300) {
            this.j = false;
        }
        if (!this.j) {
            t(!this.k);
            if (this.k) {
                this.e.requestFocus();
                this.e.showDropDown();
                return;
            } else {
                this.e.dismissDropDown();
                return;
            }
        }
        this.j = false;
    }

    @Override // defpackage.AbstractC3790bB0
    public final void m(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.e = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: wu0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                C0101Au0 c0101Au0 = C0101Au0.this;
                c0101Au0.getClass();
                if (motionEvent.getAction() == 1) {
                    long currentTimeMillis = System.currentTimeMillis() - c0101Au0.l;
                    if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                        c0101Au0.j = false;
                    }
                    c0101Au0.u();
                    c0101Au0.j = true;
                    c0101Au0.l = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.e.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: xu0
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                C0101Au0 c0101Au0 = C0101Au0.this;
                c0101Au0.j = true;
                c0101Au0.l = System.currentTimeMillis();
                c0101Au0.t(false);
            }
        });
        this.e.setThreshold(0);
        TextInputLayout textInputLayout = this.a;
        ZA0 za0 = textInputLayout.h;
        CheckableImageButton checkableImageButton = za0.h;
        checkableImageButton.setImageDrawable(null);
        za0.j();
        AbstractC0292Cg1.a(za0.a, checkableImageButton, za0.i, za0.j);
        if (!(editText.getInputType() != 0) && this.m.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = Ec4.a;
            this.d.setImportantForAccessibility(2);
        }
        textInputLayout.h.g(true);
    }

    public final void t(boolean z) {
        if (this.k != z) {
            this.k = z;
            this.o.cancel();
            this.n.start();
        }
    }

    @Override // defpackage.AbstractC3790bB0
    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        LinearInterpolator linearInterpolator = AbstractC0270Cc.a;
        ofFloat.setInterpolator(linearInterpolator);
        ofFloat.setDuration(67);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: yu0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C0101Au0 c0101Au0 = C0101Au0.this;
                c0101Au0.getClass();
                c0101Au0.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        this.o = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(linearInterpolator);
        ofFloat2.setDuration(50);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: yu0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C0101Au0 c0101Au0 = C0101Au0.this;
                c0101Au0.getClass();
                c0101Au0.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        this.n = ofFloat2;
        ofFloat2.addListener(new C12275zu0(this));
        this.m = (AccessibilityManager) this.c.getSystemService("accessibility");
    }
}
