package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import defpackage.AbstractC3878bS3;
import defpackage.AbstractC6623jS0;
import defpackage.BT1;
import defpackage.C6287iT1;
import defpackage.Ec4;
import defpackage.LB1;
import defpackage.M12;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class NavigationMenuItemView extends AbstractC6623jS0 implements BT1 {
    public static final int[] G = {R.attr.state_checked};
    public int A;
    public boolean B;
    public final CheckedTextView C;
    public FrameLayout D;
    public C6287iT1 E;
    public final M12 F;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        M12 m12 = new M12(this);
        this.F = m12;
        if (this.i != 0) {
            this.i = 0;
            requestLayout();
        }
        LayoutInflater.from(context).inflate(com.android.chrome.R.layout.f57000_resource_name_obfuscated_res_0x7f0e00cc, (ViewGroup) this, true);
        this.A = context.getResources().getDimensionPixelSize(com.android.chrome.R.dimen.f30760_resource_name_obfuscated_res_0x7f08019f);
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.android.chrome.R.id.design_menu_item_text);
        this.C = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        Ec4.m(checkedTextView, m12);
    }

    @Override // defpackage.BT1
    public final void c(C6287iT1 c6287iT1) {
        StateListDrawable stateListDrawable;
        this.E = c6287iT1;
        int i = c6287iT1.a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(c6287iT1.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.android.chrome.R.attr.f4860_resource_name_obfuscated_res_0x7f050113, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(G, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = Ec4.a;
            setBackground(stateListDrawable);
        }
        boolean isCheckable = c6287iT1.isCheckable();
        refreshDrawableState();
        boolean z = this.B;
        CheckedTextView checkedTextView = this.C;
        if (z != isCheckable) {
            this.B = isCheckable;
            this.F.h(checkedTextView, 2048);
        }
        boolean isChecked = c6287iT1.isChecked();
        refreshDrawableState();
        checkedTextView.setChecked(isChecked);
        setEnabled(c6287iT1.isEnabled());
        checkedTextView.setText(c6287iT1.e);
        Drawable icon = c6287iT1.getIcon();
        if (icon != null) {
            int i2 = this.A;
            icon.setBounds(0, 0, i2, i2);
        }
        checkedTextView.setCompoundDrawablesRelative(icon, null, null, null);
        View actionView = c6287iT1.getActionView();
        if (actionView != null) {
            if (this.D == null) {
                this.D = (FrameLayout) ((ViewStub) findViewById(com.android.chrome.R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.D.removeAllViews();
            this.D.addView(actionView);
        }
        setContentDescription(c6287iT1.q);
        AbstractC3878bS3.a(c6287iT1.r, this);
        C6287iT1 c6287iT12 = this.E;
        if (c6287iT12.e == null && c6287iT12.getIcon() == null && this.E.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.D;
            if (frameLayout != null) {
                LB1 lb1 = (LB1) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) lb1).width = -1;
                this.D.setLayoutParams(lb1);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.D;
        if (frameLayout2 != null) {
            LB1 lb12 = (LB1) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) lb12).width = -2;
            this.D.setLayoutParams(lb12);
        }
    }

    @Override // defpackage.BT1
    public final C6287iT1 d() {
        return this.E;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C6287iT1 c6287iT1 = this.E;
        if (c6287iT1 != null && c6287iT1.isCheckable() && this.E.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, G);
        }
        return onCreateDrawableState;
    }
}
