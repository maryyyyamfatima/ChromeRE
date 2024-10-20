package org.chromium.components.browser_ui.widget.chips;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.android.chrome.R;
import defpackage.C10475ug;
import defpackage.C8335oQ2;
import defpackage.Ec4;
import defpackage.JG2;
import defpackage.Y50;
import java.util.WeakHashMap;
import org.chromium.ui.widget.ChromeImageView;
import org.chromium.ui.widget.LoadingView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ChipView extends LinearLayout {
    public final C8335oQ2 a;
    public final C10475ug g;
    public final ChromeImageView h;
    public final LoadingView i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public FrameLayout p;
    public C10475ug q;

    public ChipView(Context context, int i) {
        this(new ContextThemeWrapper(context, i), null, R.attr.f4500_resource_name_obfuscated_res_0x7f0500ef, 0);
    }

    public ChipView(Context context, AttributeSet attributeSet) {
        this(new ContextThemeWrapper(context, R.style.f99010_resource_name_obfuscated_res_0x7f1502d9), attributeSet, R.attr.f4500_resource_name_obfuscated_res_0x7f0500ef, 0);
    }

    public ChipView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int dimensionPixelSize3;
        int dimensionPixelSize4;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, JG2.C, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(8, false);
        boolean z2 = obtainStyledAttributes.getBoolean(13, false);
        if (z) {
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f29020_resource_name_obfuscated_res_0x7f0800e1);
        } else {
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f29030_resource_name_obfuscated_res_0x7f0800e2);
        }
        if (z2) {
            dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.f29160_resource_name_obfuscated_res_0x7f0800ef);
        } else {
            dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.f29060_resource_name_obfuscated_res_0x7f0800e5);
        }
        if (z) {
            dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.f29040_resource_name_obfuscated_res_0x7f0800e3);
        } else {
            dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.f29050_resource_name_obfuscated_res_0x7f0800e4);
        }
        this.m = dimensionPixelSize3;
        if (z) {
            dimensionPixelSize4 = getResources().getDimensionPixelSize(R.dimen.f29080_resource_name_obfuscated_res_0x7f0800e7);
        } else {
            dimensionPixelSize4 = getResources().getDimensionPixelSize(R.dimen.f29070_resource_name_obfuscated_res_0x7f0800e6);
        }
        this.n = dimensionPixelSize4;
        int i3 = obtainStyledAttributes.getBoolean(17, false) ? R.dimen.f29170_resource_name_obfuscated_res_0x7f0800f0 : R.dimen.f28990_resource_name_obfuscated_res_0x7f0800de;
        int resourceId = obtainStyledAttributes.getResourceId(1, R.color.f17120_resource_name_obfuscated_res_0x7f0700b5);
        int resourceId2 = obtainStyledAttributes.getResourceId(2, R.color.f17150_resource_name_obfuscated_res_0x7f0700be);
        int resourceId3 = obtainStyledAttributes.getResourceId(15, R.color.f17140_resource_name_obfuscated_res_0x7f0700bd);
        int resourceId4 = obtainStyledAttributes.getResourceId(3, R.color.f17160_resource_name_obfuscated_res_0x7f0700c5);
        int dimensionPixelSize5 = obtainStyledAttributes.getDimensionPixelSize(5, getContext().getResources().getDimensionPixelSize(R.dimen.f29000_resource_name_obfuscated_res_0x7f0800df));
        this.o = dimensionPixelSize5;
        int dimensionPixelSize6 = obtainStyledAttributes.getDimensionPixelSize(10, getResources().getDimensionPixelSize(R.dimen.f29090_resource_name_obfuscated_res_0x7f0800e8));
        int dimensionPixelSize7 = obtainStyledAttributes.getDimensionPixelSize(9, getResources().getDimensionPixelSize(R.dimen.f29090_resource_name_obfuscated_res_0x7f0800e8));
        boolean z3 = obtainStyledAttributes.getBoolean(19, false);
        int resourceId5 = obtainStyledAttributes.getResourceId(12, R.style.f100270_resource_name_obfuscated_res_0x7f150358);
        this.k = obtainStyledAttributes.getDimensionPixelSize(7, getResources().getDimensionPixelSize(R.dimen.f29090_resource_name_obfuscated_res_0x7f0800e8));
        this.l = obtainStyledAttributes.getDimensionPixelSize(6, getResources().getDimensionPixelSize(R.dimen.f29090_resource_name_obfuscated_res_0x7f0800e8));
        this.j = obtainStyledAttributes.getResourceId(16, R.style.f100270_resource_name_obfuscated_res_0x7f150358);
        int dimensionPixelSize8 = obtainStyledAttributes.getDimensionPixelSize(20, getResources().getDimensionPixelSize(R.dimen.f28980_resource_name_obfuscated_res_0x7f0800dd));
        boolean z4 = obtainStyledAttributes.getBoolean(0, false);
        int i4 = dimensionPixelSize;
        int dimensionPixelSize9 = obtainStyledAttributes.getDimensionPixelSize(11, getResources().getDimensionPixelSize(R.dimen.f29300_resource_name_obfuscated_res_0x7f0800fd));
        boolean z5 = obtainStyledAttributes.getBoolean(18, false);
        boolean z6 = obtainStyledAttributes.getBoolean(14, false);
        obtainStyledAttributes.recycle();
        ChromeImageView chromeImageView = new ChromeImageView(getContext());
        this.h = chromeImageView;
        chromeImageView.setLayoutParams(new LinearLayout.LayoutParams(dimensionPixelSize6, dimensionPixelSize7));
        addView(chromeImageView);
        int dimensionPixelOffset = z3 ? (getResources().getDimensionPixelOffset(R.dimen.f29010_resource_name_obfuscated_res_0x7f0800e0) - dimensionPixelSize7) / 2 : i4;
        int dimensionPixelSize10 = getResources().getDimensionPixelSize(R.dimen.f29120_resource_name_obfuscated_res_0x7f0800eb);
        int i5 = (dimensionPixelSize7 - dimensionPixelSize10) / 2;
        int i6 = (dimensionPixelSize6 - dimensionPixelSize10) / 2;
        LoadingView loadingView = new LoadingView(getContext());
        this.i = loadingView;
        loadingView.setVisibility(8);
        loadingView.setIndeterminateTintList(ColorStateList.valueOf(getContext().getColor(R.color.f17700_resource_name_obfuscated_res_0x7f070112)));
        loadingView.setPaddingRelative(i6, i5, i6, i5);
        addView(loadingView, new LinearLayout.LayoutParams(dimensionPixelSize6, dimensionPixelSize7));
        WeakHashMap weakHashMap = Ec4.a;
        setPaddingRelative(dimensionPixelOffset, 0, dimensionPixelSize2, 0);
        C10475ug c10475ug = new C10475ug(new ContextThemeWrapper(getContext(), R.style.f96050_resource_name_obfuscated_res_0x7f1501aa), null);
        this.g = c10475ug;
        c10475ug.setTextAppearance(c10475ug.getContext(), resourceId5);
        if (z4) {
            c10475ug.setMaxLines(2);
            c10475ug.setPaddingRelative(c10475ug.getPaddingStart(), dimensionPixelSize9, c10475ug.getPaddingEnd(), dimensionPixelSize9);
        }
        if (z5) {
            c10475ug.setTextAlignment(5);
        }
        if (z6) {
            c10475ug.setPaddingRelative(getResources().getDimensionPixelSize(R.dimen.f29310_resource_name_obfuscated_res_0x7f0800fe), c10475ug.getPaddingTop(), c10475ug.getPaddingEnd(), c10475ug.getPaddingBottom());
        }
        addView(c10475ug);
        float f = dimensionPixelSize5;
        C8335oQ2 c8335oQ2 = new C8335oQ2(this, resourceId, resourceId3, new float[]{f, f, f, f, f, f, f, f}, resourceId4, i3, dimensionPixelSize8);
        ColorStateList b = Y50.b(getContext(), resourceId2);
        if (b != c8335oQ2.c) {
            c8335oQ2.c = b;
            if (Build.VERSION.SDK_INT < 26) {
                c8335oQ2.f.setDrawable(1, c8335oQ2.e);
            }
            c8335oQ2.e.setColor(b);
        }
        this.a = c8335oQ2;
        b(-1, false);
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        this.g.setEnabled(z);
        this.h.setEnabled(z);
        C10475ug c10475ug = this.q;
        if (c10475ug != null) {
            c10475ug.setEnabled(z);
        }
    }

    public final void b(int i, boolean z) {
        ChromeImageView chromeImageView = this.h;
        if (i == -1) {
            chromeImageView.setVisibility(8);
            return;
        }
        chromeImageView.setVisibility(0);
        chromeImageView.setImageResource(i);
        C10475ug c10475ug = this.g;
        if (c10475ug.getTextColors() == null || !z) {
            chromeImageView.setImageTintList(null);
        } else {
            chromeImageView.setImageTintList(c10475ug.getTextColors());
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.a.d.setColor(i);
    }

    public final C10475ug a() {
        if (this.q == null) {
            C10475ug c10475ug = new C10475ug(new ContextThemeWrapper(getContext(), R.style.f96050_resource_name_obfuscated_res_0x7f1501aa), null);
            this.q = c10475ug;
            c10475ug.setTextAppearance(c10475ug.getContext(), this.j);
            this.q.setSelected(isSelected());
            this.q.setEnabled(isEnabled());
            addView(this.q);
        }
        return this.q;
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        this.a.a(colorStateList);
    }
}
