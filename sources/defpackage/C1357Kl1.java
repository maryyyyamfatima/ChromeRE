package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Kl1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1357Kl1 extends ViewGroup {
    public final int a;
    public final int g;

    public C1357Kl1(Context context) {
        super(context, null);
        Resources resources = context.getResources();
        this.a = resources.getDimensionPixelSize(R.dimen.f34190_resource_name_obfuscated_res_0x7f08037b);
        this.g = resources.getDimensionPixelSize(R.dimen.f34180_resource_name_obfuscated_res_0x7f08037a);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getMode(i) == 0 ? Integer.MAX_VALUE : View.MeasureSpec.getSize(i);
        int i3 = this.g;
        int max = Math.max(0, (size - i3) / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(0, 0);
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            measureChild(childAt, makeMeasureSpec, makeMeasureSpec4);
            if (childAt.getMeasuredWidth() > max || ((C1097Il1) childAt.getLayoutParams()).d) {
                ((C1097Il1) childAt.getLayoutParams()).c = 2;
            } else {
                ((C1097Il1) childAt.getLayoutParams()).c = 1;
            }
        }
        int i5 = 0;
        while (i5 < getChildCount()) {
            C1097Il1 c1097Il1 = (C1097Il1) getChildAt(i5).getLayoutParams();
            if (i5 == getChildCount() - 1) {
                c1097Il1.c = 2;
            } else {
                int i6 = i5 + 1;
                if (c1097Il1.c + ((C1097Il1) getChildAt(i6).getLayoutParams()).c > 2) {
                    c1097Il1.c = 2;
                } else {
                    i5 = i6;
                }
            }
            i5++;
        }
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt2 = getChildAt(i7);
            measureChild(childAt2, ((C1097Il1) childAt2.getLayoutParams()).c == 1 ? makeMeasureSpec3 : makeMeasureSpec2, makeMeasureSpec4);
        }
        int i8 = 2;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt3 = getChildAt(i13);
            C1097Il1 c1097Il12 = (C1097Il1) childAt3.getLayoutParams();
            if (i8 < c1097Il12.c) {
                i9 += i10 + this.a;
                i8 = 2;
                i10 = 0;
                i11 = 0;
                i12 = i9;
            }
            c1097Il12.b = i12;
            c1097Il12.a = i11;
            i10 = Math.max(i10, childAt3.getMeasuredHeight());
            int i14 = c1097Il12.c;
            i8 -= i14;
            i11 += (max + i3) * i14;
        }
        setMeasuredDimension(View.resolveSize(size, i), View.resolveSize(i9 + i10, i2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        boolean z2 = getLayoutDirection() == 1;
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            View childAt = getChildAt(i6);
            int i7 = ((C1097Il1) childAt.getLayoutParams()).a;
            if (z2) {
                i7 = (i5 - i7) - childAt.getMeasuredWidth();
            }
            int i8 = ((C1097Il1) childAt.getLayoutParams()).b;
            childAt.layout(i7, i8, childAt.getMeasuredWidth() + i7, childAt.getMeasuredHeight() + i8);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1097Il1();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public final void c(int i, String str) {
        LinearLayout linearLayout = (LinearLayout) d(R.layout.f58040_resource_name_obfuscated_res_0x7f0e0136, getContext(), this);
        addView(linearLayout, new C1097Il1());
        ((ImageView) linearLayout.findViewById(R.id.control_title_icon)).setImageResource(i);
        TextView textView = (TextView) linearLayout.findViewById(R.id.control_title);
        textView.setText(str);
        textView.setTextSize(0, getContext().getResources().getDimension(R.dimen.f34330_resource_name_obfuscated_res_0x7f080389));
    }

    public final LinearLayout b(int i, int i2, String str, String str2) {
        LinearLayout linearLayout = (LinearLayout) d(R.layout.f58030_resource_name_obfuscated_res_0x7f0e0135, getContext(), this);
        addView(linearLayout, new C1097Il1());
        ((ImageView) linearLayout.findViewById(R.id.control_icon)).setImageResource(i);
        TextView textView = (TextView) linearLayout.findViewById(R.id.control_message);
        textView.setText(str);
        textView.setTextSize(0, getContext().getResources().getDimension(i2));
        TextView textView2 = (TextView) linearLayout.findViewById(R.id.control_secondary_message);
        if (str2 == null) {
            linearLayout.removeView(textView2);
        } else {
            textView2.setText(str2);
            textView2.setTextSize(0, getContext().getResources().getDimension(i2));
        }
        return linearLayout;
    }

    public final TextView a(int i, CharSequence charSequence) {
        C1097Il1 c1097Il1 = new C1097Il1();
        c1097Il1.d = true;
        TextView textView = (TextView) d(R.layout.f57040_resource_name_obfuscated_res_0x7f0e00d0, getContext(), this);
        addView(textView, c1097Il1);
        textView.setText(charSequence);
        if (i != 0) {
            textView.setTextAppearance(getContext(), i);
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        return textView;
    }

    public static View d(int i, Context context, ViewGroup viewGroup) {
        C7432ln3 c = C7432ln3.c();
        try {
            View inflate = LayoutInflater.from(context).inflate(i, viewGroup, false);
            c.close();
            return inflate;
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }
}
