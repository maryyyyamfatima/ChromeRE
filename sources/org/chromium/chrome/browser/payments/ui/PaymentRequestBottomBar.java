package org.chromium.chrome.browser.payments.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PaymentRequestBottomBar extends ViewGroup {
    public ImageView a;
    public ImageView g;
    public View h;
    public View i;
    public View j;

    public PaymentRequestBottomBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        ImageView imageView = (ImageView) findViewById(R.id.logo_name);
        this.a = imageView;
        imageView.setImageResource(R.drawable.f52270_resource_name_obfuscated_res_0x7f09041c);
        ImageView imageView2 = (ImageView) findViewById(R.id.logo);
        this.g = imageView2;
        imageView2.setImageResource(R.drawable.f46410_resource_name_obfuscated_res_0x7f090181);
        this.h = findViewById(R.id.button_primary);
        this.i = findViewById(R.id.button_secondary);
        this.j = findViewById(R.id.space);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        measureChild(this.a, i, i2);
        int measuredWidth = this.a.getMeasuredWidth();
        measureChild(this.g, i, i2);
        int measuredWidth2 = this.g.getMeasuredWidth();
        measureChild(this.h, i, i2);
        int measuredWidth3 = this.h.getMeasuredWidth();
        measureChild(this.i, i, i2);
        int measuredWidth4 = this.i.getMeasuredWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth3 + measuredWidth4 + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
        int size = View.MeasureSpec.getSize(i);
        if (paddingRight + measuredWidth <= size) {
            this.g.setVisibility(8);
            this.a.setVisibility(0);
            i3 = (size - paddingRight) - measuredWidth;
        } else if (paddingRight + measuredWidth2 <= size) {
            this.g.setVisibility(0);
            this.a.setVisibility(8);
            i3 = (size - paddingRight) - measuredWidth2;
        } else {
            this.g.setVisibility(8);
            this.a.setVisibility(8);
            i3 = size >= paddingRight ? size - paddingRight : 0;
        }
        this.j.getLayoutParams().width = i3;
        measureChild(this.j, View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        setMeasuredDimension(i, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + Math.max(this.a.getMeasuredHeight(), Math.max(this.h.getMeasuredHeight(), this.i.getMeasuredHeight())) + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 1073741824));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        int paddingLeft = getPaddingLeft() + marginLayoutParams.leftMargin;
        int paddingRight = getPaddingRight() + marginLayoutParams.rightMargin;
        int paddingTop = getPaddingTop() + marginLayoutParams.topMargin;
        int i5 = i3 - i;
        int paddingBottom = ((i4 - i2) - paddingTop) - (getPaddingBottom() + marginLayoutParams.bottomMargin);
        boolean z2 = getLayoutDirection() == 1;
        if (z2) {
            paddingLeft = i5 - paddingRight;
        }
        int i6 = paddingLeft;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (z2) {
                    paddingLeft = i6 - measuredWidth;
                } else {
                    i6 = paddingLeft + measuredWidth;
                }
                int i8 = ((paddingBottom - measuredHeight) / 2) + paddingTop;
                childAt.layout(paddingLeft, i8, i6, measuredHeight + i8);
                int i9 = paddingLeft;
                paddingLeft = i6;
                i6 = i9;
            }
        }
    }
}
