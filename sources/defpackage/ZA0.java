package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.android.chrome.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ZA0 extends LinearLayout {
    public final TextInputLayout a;
    public final FrameLayout g;
    public final CheckableImageButton h;
    public ColorStateList i;
    public PorterDuff.Mode j;
    public final CheckableImageButton k;
    public final YA0 l;
    public int m;
    public final LinkedHashSet n;
    public ColorStateList o;
    public PorterDuff.Mode p;
    public int q;
    public View.OnLongClickListener r;
    public CharSequence s;
    public final C10475ug t;
    public boolean u;
    public EditText v;
    public final AccessibilityManager w;
    public C10560uu0 x;
    public final VA0 y;

    public ZA0(TextInputLayout textInputLayout, IN3 in3) {
        super(textInputLayout.getContext());
        CharSequence k;
        this.m = 0;
        this.n = new LinkedHashSet();
        this.y = new VA0(this);
        WA0 wa0 = new WA0(this);
        this.w = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.g = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a = a(this, from, R.id.text_input_error_icon);
        this.h = a;
        CheckableImageButton a2 = a(frameLayout, from, R.id.text_input_end_icon);
        this.k = a2;
        this.l = new YA0(this, in3);
        C10475ug c10475ug = new C10475ug(getContext(), null);
        this.t = c10475ug;
        if (in3.l(34)) {
            this.i = AM1.a(getContext(), in3, 34);
        }
        if (in3.l(35)) {
            this.j = Ee4.b(in3.h(35, -1), null);
        }
        if (in3.l(33)) {
            a.setImageDrawable(in3.e(33));
            j();
            AbstractC0292Cg1.a(textInputLayout, a, this.i, this.j);
        }
        a.setContentDescription(getResources().getText(R.string.f73350_resource_name_obfuscated_res_0x7f140477));
        WeakHashMap weakHashMap = Ec4.a;
        a.setImportantForAccessibility(2);
        a.setClickable(false);
        a.k = false;
        a.setFocusable(false);
        if (!in3.l(49)) {
            if (in3.l(29)) {
                this.o = AM1.a(getContext(), in3, 29);
            }
            if (in3.l(30)) {
                this.p = Ee4.b(in3.h(30, -1), null);
            }
        }
        if (in3.l(28)) {
            f(in3.h(28, 0));
            if (in3.l(25) && a2.getContentDescription() != (k = in3.k(25))) {
                a2.setContentDescription(k);
            }
            boolean a3 = in3.a(24, true);
            if (a2.j != a3) {
                a2.j = a3;
                a2.sendAccessibilityEvent(0);
            }
        } else if (in3.l(49)) {
            if (in3.l(50)) {
                this.o = AM1.a(getContext(), in3, 50);
            }
            if (in3.l(51)) {
                this.p = Ee4.b(in3.h(51, -1), null);
            }
            f(in3.a(49, false) ? 1 : 0);
            CharSequence k2 = in3.k(47);
            if (a2.getContentDescription() != k2) {
                a2.setContentDescription(k2);
            }
        }
        int d = in3.d(27, getResources().getDimensionPixelSize(R.dimen.f36890_resource_name_obfuscated_res_0x7f0805a3));
        if (d < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (d != this.q) {
            this.q = d;
            a2.setMinimumWidth(d);
            a2.setMinimumHeight(d);
            a.setMinimumWidth(d);
            a.setMinimumHeight(d);
        }
        c10475ug.setVisibility(8);
        c10475ug.setId(R.id.textinput_suffix_text);
        c10475ug.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        c10475ug.setAccessibilityLiveRegion(1);
        c10475ug.setTextAppearance(in3.i(67, 0));
        if (in3.l(68)) {
            c10475ug.setTextColor(in3.b(68));
        }
        CharSequence k3 = in3.k(66);
        this.s = TextUtils.isEmpty(k3) ? null : k3;
        c10475ug.setText(k3);
        l();
        frameLayout.addView(a2);
        addView(c10475ug);
        addView(frameLayout);
        addView(a);
        textInputLayout.g0.add(wa0);
        if (textInputLayout.i != null) {
            wa0.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new XA0(this));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.f57010_resource_name_obfuscated_res_0x7f0e00cd, viewGroup, false);
        checkableImageButton.setId(i);
        if (AM1.d(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final void j() {
        CheckableImageButton checkableImageButton = this.h;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.a;
        checkableImageButton.setVisibility(drawable != null && textInputLayout.o.k && textInputLayout.r() ? 0 : 8);
        i();
        k();
        if (this.m != 0) {
            return;
        }
        textInputLayout.u();
    }

    public final AbstractC3790bB0 b() {
        AbstractC3790bB0 c0531Ec0;
        int i = this.m;
        YA0 ya0 = this.l;
        SparseArray sparseArray = ya0.a;
        AbstractC3790bB0 abstractC3790bB0 = (AbstractC3790bB0) sparseArray.get(i);
        if (abstractC3790bB0 == null) {
            ZA0 za0 = ya0.b;
            if (i == -1) {
                c0531Ec0 = new C0531Ec0(za0);
            } else if (i == 0) {
                c0531Ec0 = new C6163i52(za0);
            } else if (i == 1) {
                abstractC3790bB0 = new C1887On2(za0, ya0.d);
                sparseArray.append(i, abstractC3790bB0);
            } else if (i == 2) {
                c0531Ec0 = new C9718sT(za0);
            } else if (i == 3) {
                c0531Ec0 = new C0101Au0(za0);
            } else {
                throw new IllegalArgumentException(AbstractC9076qb1.a("Invalid end icon mode: ", i));
            }
            abstractC3790bB0 = c0531Ec0;
            sparseArray.append(i, abstractC3790bB0);
        }
        return abstractC3790bB0;
    }

    public final void f(int i) {
        if (this.m == i) {
            return;
        }
        AbstractC3790bB0 b = b();
        C10560uu0 c10560uu0 = this.x;
        AccessibilityManager accessibilityManager = this.w;
        if (c10560uu0 != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new W0(c10560uu0));
        }
        this.x = null;
        b.s();
        this.m = i;
        Iterator it = this.n.iterator();
        if (!it.hasNext()) {
            g(i != 0);
            AbstractC3790bB0 b2 = b();
            int i2 = this.l.c;
            if (i2 == 0) {
                i2 = b2.d();
            }
            Drawable a = i2 != 0 ? AbstractC2884Wf.a(getContext(), i2) : null;
            CheckableImageButton checkableImageButton = this.k;
            checkableImageButton.setImageDrawable(a);
            TextInputLayout textInputLayout = this.a;
            if (a != null) {
                AbstractC0292Cg1.a(textInputLayout, checkableImageButton, this.o, this.p);
                AbstractC0292Cg1.b(textInputLayout, checkableImageButton, this.o);
            }
            int c = b2.c();
            CharSequence text = c != 0 ? getResources().getText(c) : null;
            if (checkableImageButton.getContentDescription() != text) {
                checkableImageButton.setContentDescription(text);
            }
            boolean k = b2.k();
            if (checkableImageButton.j != k) {
                checkableImageButton.j = k;
                checkableImageButton.sendAccessibilityEvent(0);
            }
            if (!b2.i(textInputLayout.R)) {
                throw new IllegalStateException(AbstractC0800Ge.a("The current box background mode ", textInputLayout.R, " is not supported by the end icon mode ", i));
            }
            b2.r();
            C10560uu0 h = b2.h();
            this.x = h;
            if (h != null && accessibilityManager != null) {
                WeakHashMap weakHashMap = Ec4.a;
                if (isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(new W0(this.x));
                }
            }
            View.OnClickListener f = b2.f();
            View.OnLongClickListener onLongClickListener = this.r;
            checkableImageButton.setOnClickListener(f);
            AbstractC0292Cg1.c(checkableImageButton, onLongClickListener);
            EditText editText = this.v;
            if (editText != null) {
                b2.m(editText);
                h(b2);
            }
            AbstractC0292Cg1.a(textInputLayout, checkableImageButton, this.o, this.p);
            e(true);
            return;
        }
        X5.a(it.next());
        throw null;
    }

    public final void e(boolean z) {
        boolean z2;
        boolean isActivated;
        boolean isChecked;
        AbstractC3790bB0 b = b();
        boolean k = b.k();
        boolean z3 = true;
        CheckableImageButton checkableImageButton = this.k;
        if (!k || (isChecked = checkableImageButton.isChecked()) == b.l()) {
            z2 = false;
        } else {
            checkableImageButton.setChecked(!isChecked);
            z2 = true;
        }
        if (!(b instanceof C0101Au0) || (isActivated = checkableImageButton.isActivated()) == b.j()) {
            z3 = z2;
        } else {
            checkableImageButton.setActivated(!isActivated);
        }
        if (z || z3) {
            AbstractC0292Cg1.b(this.a, checkableImageButton, this.o);
        }
    }

    public final void h(AbstractC3790bB0 abstractC3790bB0) {
        if (this.v == null) {
            return;
        }
        if (abstractC3790bB0.e() != null) {
            this.v.setOnFocusChangeListener(abstractC3790bB0.e());
        }
        if (abstractC3790bB0.g() != null) {
            this.k.setOnFocusChangeListener(abstractC3790bB0.g());
        }
    }

    public final void g(boolean z) {
        if (c() != z) {
            this.k.setVisibility(z ? 0 : 8);
            i();
            k();
            this.a.u();
        }
    }

    public final boolean c() {
        return this.g.getVisibility() == 0 && this.k.getVisibility() == 0;
    }

    public final void l() {
        C10475ug c10475ug = this.t;
        int visibility = c10475ug.getVisibility();
        int i = (this.s == null || this.u) ? 8 : 0;
        if (visibility != i) {
            b().p(i == 0);
        }
        i();
        c10475ug.setVisibility(i);
        this.a.u();
    }

    public final void k() {
        int i;
        TextInputLayout textInputLayout = this.a;
        if (textInputLayout.i == null) {
            return;
        }
        if (c() || d()) {
            i = 0;
        } else {
            EditText editText = textInputLayout.i;
            WeakHashMap weakHashMap = Ec4.a;
            i = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.f35400_resource_name_obfuscated_res_0x7f0804ba);
        int paddingTop = textInputLayout.i.getPaddingTop();
        int paddingBottom = textInputLayout.i.getPaddingBottom();
        WeakHashMap weakHashMap2 = Ec4.a;
        this.t.setPaddingRelative(dimensionPixelSize, paddingTop, i, paddingBottom);
    }

    public final boolean d() {
        return this.h.getVisibility() == 0;
    }

    public final void i() {
        this.g.setVisibility((this.k.getVisibility() != 0 || d()) ? 8 : 0);
        setVisibility(c() || d() || !((this.s == null || this.u) ? 8 : false) ? 0 : 8);
    }
}
