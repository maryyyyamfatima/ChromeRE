package org.chromium.components.browser_ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.AbstractC8540p04;
import defpackage.JG2;
import defpackage.PG2;
import java.util.List;
import org.chromium.ui.widget.ChromeImageView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class RadioButtonWithDescription extends RelativeLayout implements View.OnClickListener {
    public RadioButton a;
    public ChromeImageView g;
    public TextView h;
    public TextView i;
    public PG2 j;
    public List k;

    public int b() {
        return -1;
    }

    public int c() {
        return R.layout.f60360_resource_name_obfuscated_res_0x7f0e0246;
    }

    public RadioButtonWithDescription(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(c(), (ViewGroup) this, true);
        i();
        if (attributeSet != null) {
            a(attributeSet);
        }
        setMinimumHeight(getResources().getDimensionPixelSize(R.dimen.f35890_resource_name_obfuscated_res_0x7f0804f2));
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f39580_resource_name_obfuscated_res_0x7f0806e9);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.f39590_resource_name_obfuscated_res_0x7f0806ea);
        setPaddingRelative(getPaddingStart() == 0 ? dimensionPixelSize : getPaddingStart(), getPaddingTop() == 0 ? dimensionPixelSize2 : getPaddingTop(), getPaddingEnd() != 0 ? getPaddingEnd() : dimensionPixelSize, getPaddingBottom() != 0 ? getPaddingBottom() : dimensionPixelSize2);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            getContext().getTheme().resolveAttribute(android.R.attr.selectableItemBackground, typedValue, true);
            if (b() != -1) {
                View findViewById = findViewById(R.id.radio_container);
                findViewById.setBackgroundResource(typedValue.resourceId);
                findViewById.setPaddingRelative(getPaddingStart(), findViewById.getPaddingTop(), findViewById.getPaddingEnd(), findViewById.getPaddingBottom());
                setPaddingRelative(0, getPaddingTop(), getPaddingEnd(), getPaddingBottom());
            } else {
                setBackgroundResource(typedValue.resourceId);
            }
        }
        setOnClickListener(this);
        setFocusable(true);
    }

    public void i() {
        this.a = (RadioButton) findViewById(R.id.radio_button);
        this.g = (ChromeImageView) findViewById(R.id.icon);
        this.h = d();
        this.i = (TextView) findViewById(R.id.description);
        int b = b();
        if (b != -1) {
            ViewStub viewStub = (ViewStub) findViewById(R.id.end_view_stub);
            viewStub.setLayoutResource(b);
            viewStub.inflate();
        }
    }

    public TextView d() {
        return (TextView) findViewById(R.id.primary);
    }

    public void a(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, JG2.D0, 0, 0);
        Drawable d = AbstractC8540p04.d(getContext(), obtainStyledAttributes, 1);
        if (d != null) {
            this.g.setImageDrawable(d);
            this.g.setVisibility(0);
        }
        String string = obtainStyledAttributes.getString(2);
        if (string != null) {
            this.h.setText(string);
        }
        String string2 = obtainStyledAttributes.getString(0);
        if (string2 != null) {
            this.i.setText(string2);
            this.i.setVisibility(0);
        } else {
            ((RelativeLayout.LayoutParams) this.h.getLayoutParams()).addRule(15);
        }
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        f(true);
        PG2 pg2 = this.j;
        if (pg2 != null) {
            pg2.a(this);
        }
    }

    public final void h(CharSequence charSequence) {
        this.i.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            ((RelativeLayout.LayoutParams) this.h.getLayoutParams()).addRule(15);
            this.i.setVisibility(8);
        } else {
            ((RelativeLayout.LayoutParams) this.h.getLayoutParams()).removeRule(15);
            this.i.setVisibility(0);
        }
    }

    public final boolean e() {
        return this.a.isChecked();
    }

    public void f(boolean z) {
        g(z);
        if (z) {
            requestFocus();
        }
    }

    public final void g(boolean z) {
        List<RadioButtonWithDescription> list = this.k;
        if (list != null && z) {
            for (RadioButtonWithDescription radioButtonWithDescription : list) {
                if (radioButtonWithDescription != this) {
                    radioButtonWithDescription.f(false);
                }
            }
        }
        this.a.setChecked(z);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.i.setEnabled(z);
        this.h.setEnabled(z);
        this.a.setEnabled(z);
        if (this.g != null) {
            TypedValue typedValue = new TypedValue();
            getContext().getResources().getValue(R.dimen.f30370_resource_name_obfuscated_res_0x7f08016f, typedValue, true);
            this.g.setAlpha(z ? 1.0f : typedValue.getFloat());
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superState", super.onSaveInstanceState());
        bundle.putBoolean("isChecked", e());
        return bundle;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getParcelable("superState"));
            f(bundle.getBoolean("isChecked"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }
}
