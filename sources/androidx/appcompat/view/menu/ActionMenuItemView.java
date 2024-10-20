package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import defpackage.AS1;
import defpackage.AbstractC3878bS3;
import defpackage.BT1;
import defpackage.C10475ug;
import defpackage.C6287iT1;
import defpackage.InterfaceC4441d5;
import defpackage.JG2;
import defpackage.U4;
import defpackage.W4;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ActionMenuItemView extends C10475ug implements BT1, View.OnClickListener, InterfaceC4441d5 {
    public C6287iT1 k;
    public CharSequence l;
    public Drawable m;
    public AS1 n;
    public U4 o;
    public W4 p;
    public boolean q;
    public final int r;
    public int s;
    public final int t;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.q = h();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, JG2.c, 0, 0);
        this.r = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.t = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.s = -1;
        setSaveEnabled(false);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.q = h();
        i();
    }

    @Override // android.widget.TextView, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    public final boolean h() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.s = i;
        super.setPadding(i, i2, i3, i4);
    }

    @Override // defpackage.BT1
    public final C6287iT1 d() {
        return this.k;
    }

    @Override // defpackage.BT1
    public final void c(C6287iT1 c6287iT1) {
        this.k = c6287iT1;
        Drawable icon = c6287iT1.getIcon();
        this.m = icon;
        if (icon != null) {
            int intrinsicWidth = icon.getIntrinsicWidth();
            int intrinsicHeight = icon.getIntrinsicHeight();
            int i = this.t;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            icon.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(icon, null, null, null);
        i();
        this.l = c6287iT1.getTitleCondensed();
        i();
        setId(c6287iT1.a);
        setVisibility(c6287iT1.isVisible() ? 0 : 8);
        setEnabled(c6287iT1.isEnabled());
        if (c6287iT1.hasSubMenu() && this.o == null) {
            this.o = new U4(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        U4 u4;
        if (this.k.hasSubMenu() && (u4 = this.o) != null && u4.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AS1 as1 = this.n;
        if (as1 != null) {
            as1.a(this.k);
        }
    }

    public final void i() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.l);
        if (this.m != null) {
            if (!((this.k.y & 4) == 4) || !this.q) {
                z = false;
            }
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.l : null);
        CharSequence charSequence = this.k.q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.k.e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.k.r;
        if (TextUtils.isEmpty(charSequence2)) {
            AbstractC3878bS3.a(z3 ? null : this.k.e, this);
        } else {
            AbstractC3878bS3.a(charSequence2, this);
        }
    }

    public final boolean g() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // defpackage.InterfaceC4441d5
    public final boolean e() {
        return g() && this.k.getIcon() == null;
    }

    @Override // defpackage.InterfaceC4441d5
    public final boolean b() {
        return g();
    }

    @Override // defpackage.C10475ug, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean g = g();
        if (g && (i3 = this.s) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.r;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (g || this.m == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.m.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }
}
