package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.android.chrome.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cj3 */
/* loaded from: classes.dex */
public final class C4315cj3 extends LinearLayout {
    public final TextInputLayout a;
    public final C10475ug g;
    public CharSequence h;
    public final CheckableImageButton i;
    public ColorStateList j;
    public PorterDuff.Mode k;
    public int l;
    public View.OnLongClickListener m;
    public boolean n;

    public C4315cj3(TextInputLayout textInputLayout, IN3 in3) {
        super(textInputLayout.getContext());
        CharSequence k;
        this.a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e00ce, (ViewGroup) this, false);
        this.i = checkableImageButton;
        C10475ug c10475ug = new C10475ug(getContext(), null);
        this.g = c10475ug;
        if (AM1.d(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.m;
        checkableImageButton.setOnClickListener(null);
        AbstractC0292Cg1.c(checkableImageButton, onLongClickListener);
        this.m = null;
        checkableImageButton.setOnLongClickListener(null);
        AbstractC0292Cg1.c(checkableImageButton, null);
        if (in3.l(64)) {
            this.j = AM1.a(getContext(), in3, 64);
        }
        if (in3.l(65)) {
            this.k = Ee4.b(in3.h(65, -1), null);
        }
        if (in3.l(62)) {
            Drawable e = in3.e(62);
            checkableImageButton.setImageDrawable(e);
            if (e != null) {
                AbstractC0292Cg1.a(textInputLayout, checkableImageButton, this.j, this.k);
                if (!(checkableImageButton.getVisibility() == 0)) {
                    checkableImageButton.setVisibility(0);
                    a();
                    b();
                }
                AbstractC0292Cg1.b(textInputLayout, checkableImageButton, this.j);
            } else {
                if (checkableImageButton.getVisibility() == 0) {
                    checkableImageButton.setVisibility(8);
                    a();
                    b();
                }
                View.OnLongClickListener onLongClickListener2 = this.m;
                checkableImageButton.setOnClickListener(null);
                AbstractC0292Cg1.c(checkableImageButton, onLongClickListener2);
                this.m = null;
                checkableImageButton.setOnLongClickListener(null);
                AbstractC0292Cg1.c(checkableImageButton, null);
                if (checkableImageButton.getContentDescription() != null) {
                    checkableImageButton.setContentDescription(null);
                }
            }
            if (in3.l(61) && checkableImageButton.getContentDescription() != (k = in3.k(61))) {
                checkableImageButton.setContentDescription(k);
            }
            boolean a = in3.a(60, true);
            if (checkableImageButton.j != a) {
                checkableImageButton.j = a;
                checkableImageButton.sendAccessibilityEvent(0);
            }
        }
        int d = in3.d(63, getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0805a3));
        if (d < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (d != this.l) {
            this.l = d;
            checkableImageButton.setMinimumWidth(d);
            checkableImageButton.setMinimumHeight(d);
        }
        c10475ug.setVisibility(8);
        c10475ug.setId(R.id.textinput_prefix_text);
        c10475ug.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap weakHashMap = Ec4.a;
        c10475ug.setAccessibilityLiveRegion(1);
        c10475ug.setTextAppearance(in3.i(56, 0));
        if (in3.l(57)) {
            c10475ug.setTextColor(in3.b(57));
        }
        CharSequence k2 = in3.k(55);
        this.h = TextUtils.isEmpty(k2) ? null : k2;
        c10475ug.setText(k2);
        b();
        addView(checkableImageButton);
        addView(c10475ug);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        a();
    }

    public final void a() {
        EditText editText = this.a.i;
        if (editText == null) {
            return;
        }
        int i = 0;
        if (!(this.i.getVisibility() == 0)) {
            WeakHashMap weakHashMap = Ec4.a;
            i = editText.getPaddingStart();
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0804ba);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = Ec4.a;
        this.g.setPaddingRelative(i, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void b() {
        int i = (this.h == null || this.n) ? 8 : 0;
        setVisibility(this.i.getVisibility() == 0 || i == 0 ? 0 : 8);
        this.g.setVisibility(i);
        this.a.u();
    }
}
