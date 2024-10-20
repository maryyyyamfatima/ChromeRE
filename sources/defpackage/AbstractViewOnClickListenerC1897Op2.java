package defpackage;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.chrome.browser.app.ChromeActivity;
import org.chromium.components.browser_ui.widget.DualControlLayout;
import org.chromium.ui.widget.ButtonCompat;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Op2 */
/* loaded from: classes.dex */
public abstract class AbstractViewOnClickListenerC1897Op2 extends LinearLayout implements View.OnClickListener {
    public final InterfaceViewOnClickListenerC1637Mp2 a;
    public final int g;
    public final ButtonCompat h;
    public final boolean i;
    public int j;
    public final int k;
    public final int l;
    public final int m;
    public final LinearLayout n;
    public final ImageView o;
    public final ImageView p;
    public TextView q;
    public LinearLayout r;
    public TextView s;
    public TextView t;
    public Drawable u;
    public boolean v;

    public abstract void a(LinearLayout linearLayout);

    public int b() {
        return 0;
    }

    public void c(View view) {
    }

    public AbstractViewOnClickListenerC1897Op2(ChromeActivity chromeActivity, String str, InterfaceViewOnClickListenerC1637Mp2 interfaceViewOnClickListenerC1637Mp2) {
        super(chromeActivity);
        this.j = 3;
        this.v = true;
        this.a = interfaceViewOnClickListenerC1637Mp2;
        setOnClickListener(interfaceViewOnClickListenerC1637Mp2);
        setOrientation(0);
        setGravity(16);
        this.l = AbstractC11746yN.c(chromeActivity, R.dimen.0_resource_name_obfuscated_res_0x7f08072c);
        this.m = getContext().getColor(R.color.0_resource_name_obfuscated_res_0x7f07080e);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0801f9);
        this.g = dimensionPixelSize;
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080666);
        this.k = dimensionPixelSize2;
        setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        addView(linearLayout, layoutParams);
        TextView textView = new TextView(getContext());
        this.q = textView;
        textView.setText(str);
        AbstractC9771sd.i(R.style.f102660_resource_name_obfuscated_res_0x7f150447, this.q);
        linearLayout.addView(this.q, new LinearLayout.LayoutParams(-1, -2));
        TextView textView2 = new TextView(getContext());
        this.s = textView2;
        textView2.setId(R.id.payments_left_summary_label);
        AbstractC9771sd.i(R.style.f102580_resource_name_obfuscated_res_0x7f15043f, this.s);
        TextView textView3 = new TextView(getContext());
        this.t = textView3;
        textView3.setTextAppearance(textView3.getContext(), R.style.f102580_resource_name_obfuscated_res_0x7f15043f);
        this.t.setTextAlignment(3);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
        layoutParams2.weight = 1.0f;
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.setMarginStart(getContext().getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0801fa));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.r = linearLayout2;
        linearLayout2.addView(this.s, layoutParams2);
        this.r.addView(this.t, layoutParams3);
        linearLayout.addView(this.r, new LinearLayout.LayoutParams(-1, -2));
        ImageView imageView = null;
        f(null, null);
        a(linearLayout);
        this.n = linearLayout;
        if (this instanceof C1508Lp2) {
            imageView = new ImageView(getContext());
            imageView.setMaxWidth(getContext().getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0801f6));
            imageView.setAdjustViewBounds(true);
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams4.setMarginStart(dimensionPixelSize);
            addView(imageView, layoutParams4);
        }
        this.o = imageView;
        ButtonCompat a = DualControlLayout.a(getContext(), true, getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f14032d), this);
        a.setId(R.id.payments_section);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.setMarginStart(dimensionPixelSize);
        addView(a, layoutParams5);
        this.h = a;
        LN3 a2 = LN3.a(R.drawable.0_resource_name_obfuscated_res_0x7f090201, R.color.0_resource_name_obfuscated_res_0x7f07080d, getContext());
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setImageDrawable(a2);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.setMarginStart(dimensionPixelSize);
        addView(imageView2, layoutParams6);
        this.p = imageView2;
        this.i = true;
        d(3);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !((ViewOnClickListenerC5731gq2) this.a).j();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ViewOnClickListenerC5731gq2 viewOnClickListenerC5731gq2 = (ViewOnClickListenerC5731gq2) this.a;
        if (viewOnClickListenerC5731gq2.j()) {
            if (view == this.h) {
                if (b() == 2) {
                    viewOnClickListenerC5731gq2.k(this);
                    return;
                } else {
                    viewOnClickListenerC5731gq2.d(this);
                    return;
                }
            }
            c(view);
            g();
        }
    }

    public void d(int i) {
        this.j = i;
        g();
    }

    public final void f(CharSequence charSequence, SpannableStringBuilder spannableStringBuilder) {
        this.s.setText(charSequence);
        this.t.setText(spannableStringBuilder);
        this.t.setVisibility(TextUtils.isEmpty(spannableStringBuilder) ? 8 : 0);
        g();
    }

    public final void e(TextUtils.TruncateAt truncateAt, boolean z) {
        this.s.setEllipsize(truncateAt);
        this.s.setSingleLine(z);
        this.t.setEllipsize(null);
        this.t.setSingleLine(false);
    }

    public void g() {
        if (this.i) {
            int i = this.j;
            boolean z = i == 5 || i == 6;
            setBackgroundColor(z ? this.m : this.l);
            ImageView imageView = this.o;
            if (imageView != null) {
                imageView.setVisibility(this.u != null && this.j != 5 ? 0 : 8);
            }
            int b = b();
            ImageView imageView2 = this.p;
            ButtonCompat buttonCompat = this.h;
            if (b == 0) {
                buttonCompat.setVisibility(8);
                imageView2.setVisibility(this.j == 4 ? 0 : 8);
            } else {
                int i2 = this.j;
                boolean z2 = i2 == 4 || i2 == 3;
                imageView2.setVisibility(8);
                buttonCompat.setVisibility(z2 ? 0 : 8);
                buttonCompat.setText(b == 1 ? R.string.0_resource_name_obfuscated_res_0x7f14032d : R.string.0_resource_name_obfuscated_res_0x7f1401c5);
            }
            this.r.setVisibility(this.v ? 0 : 8);
            int i3 = 0;
            int i4 = 0;
            while (true) {
                LinearLayout linearLayout = this.n;
                if (i3 >= linearLayout.getChildCount()) {
                    break;
                }
                if (linearLayout.getChildAt(i3).getVisibility() == 0) {
                    i4++;
                }
                i3++;
            }
            boolean z3 = i4 > 1 && z;
            int i5 = ((ViewGroup.MarginLayoutParams) this.q.getLayoutParams()).bottomMargin;
            int i6 = z3 ? this.k : 0;
            if (i5 != i6) {
                ((ViewGroup.MarginLayoutParams) this.q.getLayoutParams()).bottomMargin = i6;
                requestLayout();
            }
        }
    }
}
