package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.chrome.R;
import java.util.ArrayList;
import org.chromium.base.Callback;
import org.chromium.components.browser_ui.widget.DualControlLayout;
import org.chromium.components.infobars.InfoBar;
import org.chromium.ui.widget.ButtonCompat;
import org.chromium.ui.widget.ChromeImageButton;
import org.chromium.ui.widget.ChromeImageView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ol1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC1876Ol1 extends ViewGroup implements View.OnClickListener {
    public final int a;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final InterfaceC1487Ll1 l;
    public final ChromeImageButton m;
    public final C1357Kl1 n;
    public final ArrayList o;
    public ViewGroup p;
    public final TextView q;
    public final ChromeImageView r;
    public DualControlLayout s;
    public CharSequence t;
    public String u;

    public static ChromeImageButton b(Context context) {
        ColorStateList b = Y50.b(context, R.color.f17870_resource_name_obfuscated_res_0x7f07012b);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{android.R.attr.selectableItemBackground});
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        ChromeImageButton chromeImageButton = new ChromeImageButton(context);
        chromeImageButton.setId(R.id.infobar_close_button);
        chromeImageButton.setImageResource(R.drawable.f45020_resource_name_obfuscated_res_0x7f0900c5);
        chromeImageButton.setImageTintList(b);
        chromeImageButton.setBackground(drawable);
        chromeImageButton.setContentDescription(context.getString(R.string.f70680_resource_name_obfuscated_res_0x7f140362));
        chromeImageButton.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        return chromeImageButton;
    }

    public ViewOnClickListenerC1876Ol1(Context context, InterfaceC1487Ll1 interfaceC1487Ll1, int i, int i2, Bitmap bitmap, CharSequence charSequence) {
        super(context);
        this.o = new ArrayList();
        this.l = interfaceC1487Ll1;
        Resources resources = getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.f34320_resource_name_obfuscated_res_0x7f080388);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.f34310_resource_name_obfuscated_res_0x7f080387);
        this.a = resources.getDimensionPixelSize(R.dimen.f34150_resource_name_obfuscated_res_0x7f080377);
        this.g = resources.getDimensionPixelSize(R.dimen.f34130_resource_name_obfuscated_res_0x7f080375);
        this.h = resources.getDimensionPixelSize(R.dimen.f34220_resource_name_obfuscated_res_0x7f08037e);
        this.i = resources.getDimensionPixelSize(R.dimen.f34230_resource_name_obfuscated_res_0x7f08037f);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.f34270_resource_name_obfuscated_res_0x7f080383);
        this.j = dimensionPixelOffset;
        this.k = resources.getDimensionPixelSize(R.dimen.f34260_resource_name_obfuscated_res_0x7f080382);
        ChromeImageButton b = b(context);
        this.m = b;
        b.setOnClickListener(this);
        b.setPadding(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        int i3 = -dimensionPixelOffset;
        b.setLayoutParams(new C1746Nl1(i3, i3, i3));
        ChromeImageView c = c(context, i, i2, bitmap);
        this.r = c;
        if (c != null) {
            c.setLayoutParams(new C1746Nl1(0, dimensionPixelSize2, 0));
            c.getLayoutParams().width = dimensionPixelSize;
            c.getLayoutParams().height = dimensionPixelSize;
        }
        this.t = charSequence;
        C1357Kl1 c1357Kl1 = new C1357Kl1(context);
        this.n = c1357Kl1;
        SpannableStringBuilder g = g();
        C1097Il1 c1097Il1 = new C1097Il1();
        c1097Il1.d = true;
        TextView textView = (TextView) C1357Kl1.d(R.layout.f58050_resource_name_obfuscated_res_0x7f0e0137, c1357Kl1.getContext(), c1357Kl1);
        c1357Kl1.addView(textView, c1097Il1);
        textView.setText(g);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        this.q = textView;
    }

    public final void j(CharSequence charSequence) {
        this.t = charSequence;
        this.q.setText(g());
    }

    public final C1357Kl1 a() {
        C1357Kl1 c1357Kl1 = new C1357Kl1(getContext());
        this.o.add(c1357Kl1);
        return c1357Kl1;
    }

    public final void i(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        h(1, !TextUtils.isEmpty(str2) ? DualControlLayout.a(getContext(), false, str2, this) : null, str);
    }

    public final void h(int i, View view, String str) {
        ButtonCompat a = DualControlLayout.a(getContext(), true, str, this);
        DualControlLayout dualControlLayout = new DualControlLayout(getContext(), null);
        this.s = dualControlLayout;
        dualControlLayout.g = i;
        dualControlLayout.h = getResources().getDimensionPixelSize(R.dimen.f34240_resource_name_obfuscated_res_0x7f080380);
        this.s.addView(a);
        if (view != null) {
            this.s.addView(view);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1746Nl1(0, 0, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        boolean z2 = getLayoutDirection() == 1;
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            View childAt = getChildAt(i6);
            C1746Nl1 c1746Nl1 = (C1746Nl1) childAt.getLayoutParams();
            int i7 = c1746Nl1.e;
            int measuredWidth = childAt.getMeasuredWidth() + i7;
            if (z2) {
                int i8 = i5 - measuredWidth;
                measuredWidth = i5 - i7;
                i7 = i8;
            }
            int i9 = c1746Nl1.f;
            childAt.layout(i7, i9, measuredWidth, childAt.getMeasuredHeight() + i9);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int max = Math.max(View.MeasureSpec.getSize(i), this.k);
        int i3 = this.j;
        int i4 = max - i3;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ChromeImageView chromeImageView = this.r;
        if (chromeImageView != null) {
            C1746Nl1 c1746Nl1 = (C1746Nl1) chromeImageView.getLayoutParams();
            measureChild(chromeImageView, makeMeasureSpec, makeMeasureSpec);
            c1746Nl1.e = c1746Nl1.a + i3;
            c1746Nl1.f = c1746Nl1.c + i3;
        }
        int measuredWidth = chromeImageView == null ? 0 : chromeImageView.getMeasuredWidth() + ((C1746Nl1) chromeImageView.getLayoutParams()).a + ((C1746Nl1) chromeImageView.getLayoutParams()).b;
        ChromeImageButton chromeImageButton = this.m;
        C1746Nl1 e = e(chromeImageButton);
        measureChild(chromeImageButton, makeMeasureSpec, makeMeasureSpec);
        e.e = (i4 - e.b) - chromeImageButton.getMeasuredWidth();
        e.f = e.c + i3;
        int i5 = i4 - i3;
        int i6 = i5 - measuredWidth;
        int measuredWidth2 = i6 - ((chromeImageButton.getMeasuredWidth() + ((C1746Nl1) chromeImageButton.getLayoutParams()).a) + ((C1746Nl1) chromeImageButton.getLayoutParams()).b);
        C1357Kl1 c1357Kl1 = this.n;
        C1746Nl1 e2 = e(c1357Kl1);
        f(c1357Kl1, measuredWidth2);
        int i7 = measuredWidth + i3;
        e2.e = i7;
        e2.f = i3;
        int max2 = Math.max(d(c1357Kl1), d(chromeImageButton)) + i3;
        int i8 = 0;
        while (true) {
            ArrayList arrayList = this.o;
            if (i8 >= arrayList.size()) {
                break;
            }
            View view = (View) arrayList.get(i8);
            f(view, i6);
            int i9 = max2 + this.i;
            ((C1746Nl1) view.getLayoutParams()).e = i7;
            ((C1746Nl1) view.getLayoutParams()).f = i9;
            max2 = i9 + view.getMeasuredHeight();
            i8++;
        }
        int max3 = Math.max(max2, d(chromeImageView));
        DualControlLayout dualControlLayout = this.s;
        if (dualControlLayout != null) {
            f(dualControlLayout, i5);
            int i10 = max3 + this.h;
            e(this.s).e = i3;
            e(this.s).f = i10;
            max3 = i10 + this.s.getMeasuredHeight();
        }
        int i11 = max3 + i3;
        ViewGroup viewGroup = this.p;
        if (viewGroup != null) {
            C1746Nl1 c1746Nl12 = (C1746Nl1) viewGroup.getLayoutParams();
            f(this.p, max);
            c1746Nl12.e = 0;
            c1746Nl12.f = i11;
            i11 += this.p.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(max, i), View.resolveSize(i11, i2));
    }

    public static int d(View view) {
        if (view == null) {
            return 0;
        }
        return view.getMeasuredHeight() + ((C1746Nl1) view.getLayoutParams()).c + ((C1746Nl1) view.getLayoutParams()).d;
    }

    public static C1746Nl1 e(View view) {
        return (C1746Nl1) view.getLayoutParams();
    }

    public static void f(View view, int i) {
        C1746Nl1 c1746Nl1 = (C1746Nl1) view.getLayoutParams();
        view.measure(View.MeasureSpec.makeMeasureSpec((i - c1746Nl1.a) - c1746Nl1.b, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1487Ll1 interfaceC1487Ll1 = this.l;
        ((InfoBar) interfaceC1487Ll1).n = false;
        if (view.getId() == R.id.infobar_close_button) {
            interfaceC1487Ll1.i();
        } else if (view.getId() == R.id.button_primary) {
            interfaceC1487Ll1.d(true);
        } else if (view.getId() == R.id.button_secondary) {
            interfaceC1487Ll1.d(false);
        }
    }

    public final SpannableStringBuilder g() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!TextUtils.isEmpty(this.t)) {
            spannableStringBuilder.append((CharSequence) new SpannableString(this.t));
        }
        if (!TextUtils.isEmpty(this.u)) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) " ");
            }
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) this.u);
            spannableStringBuilder.setSpan(new C11997z52(getContext(), new Callback() { // from class: Ml1
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    ViewOnClickListenerC1876Ol1.this.l.e();
                }
            }), length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    public static ChromeImageView c(Context context, int i, int i2, Bitmap bitmap) {
        if (i == 0 && bitmap == null) {
            return null;
        }
        ChromeImageView chromeImageView = new ChromeImageView(context);
        if (i != 0) {
            chromeImageView.setImageDrawable(AbstractC2884Wf.a(context, i));
            if (i2 != 0) {
                chromeImageView.setImageTintList(Y50.b(context, i2));
            }
        } else {
            chromeImageView.setImageBitmap(bitmap);
        }
        chromeImageView.setFocusable(false);
        chromeImageView.setId(R.id.infobar_icon);
        chromeImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        return chromeImageView;
    }
}
