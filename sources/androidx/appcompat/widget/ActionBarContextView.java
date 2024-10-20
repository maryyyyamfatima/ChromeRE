package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.AbstractC2884Wf;
import defpackage.AbstractC6160i5;
import defpackage.BS1;
import defpackage.C4097c5;
import defpackage.C5097f;
import defpackage.C6349ie4;
import defpackage.CT1;
import defpackage.Ec4;
import defpackage.He4;
import defpackage.JG2;
import defpackage.L4;
import defpackage.V4;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {
    public final C5097f a;
    public final Context g;
    public ActionMenuView h;
    public C4097c5 i;
    public int j;
    public C6349ie4 k;
    public boolean l;
    public boolean m;
    public CharSequence n;
    public CharSequence o;
    public View p;
    public View q;
    public View r;
    public LinearLayout s;
    public TextView t;
    public TextView u;
    public final int v;
    public final int w;
    public boolean x;
    public final int y;

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.f2390_resource_name_obfuscated_res_0x7f05001c);
        Drawable drawable;
        int resourceId;
        this.a = new C5097f(this);
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.f2130_resource_name_obfuscated_res_0x7f050002, typedValue, true) && typedValue.resourceId != 0) {
            this.g = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.g = context;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, JG2.d, R.attr.f2390_resource_name_obfuscated_res_0x7f05001c, 0);
        if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
            drawable = AbstractC2884Wf.a(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(0);
        }
        WeakHashMap weakHashMap = Ec4.a;
        setBackground(drawable);
        this.v = obtainStyledAttributes.getResourceId(5, 0);
        this.w = obtainStyledAttributes.getResourceId(4, 0);
        this.j = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.y = obtainStyledAttributes.getResourceId(2, R.layout.f55210_resource_name_obfuscated_res_0x7f0e0005);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, JG2.a, R.attr.f2160_resource_name_obfuscated_res_0x7f050005, 0);
        this.j = obtainStyledAttributes.getLayoutDimension(13, 0);
        obtainStyledAttributes.recycle();
        C4097c5 c4097c5 = this.i;
        if (c4097c5 != null) {
            Configuration configuration2 = c4097c5.g.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            c4097c5.u = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            BS1 bs1 = c4097c5.h;
            if (bs1 != null) {
                bs1.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C4097c5 c4097c5 = this.i;
        if (c4097c5 != null) {
            c4097c5.b();
            V4 v4 = this.i.y;
            if (v4 == null || !v4.b()) {
                return;
            }
            v4.j.dismiss();
        }
    }

    @Override // android.view.View
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.l = false;
        }
        if (!this.l) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.l = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.l = false;
        }
        return true;
    }

    public final void k(View view) {
        LinearLayout linearLayout;
        View view2 = this.r;
        if (view2 != null) {
            removeView(view2);
        }
        this.r = view;
        if (view != null && (linearLayout = this.s) != null) {
            removeView(linearLayout);
            this.s = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    @Override // android.view.View
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.m = false;
        }
        if (!this.m) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.m = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.m = false;
        }
        return true;
    }

    public final void d() {
        if (this.s == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.f55170_resource_name_obfuscated_res_0x7f0e0000, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.s = linearLayout;
            this.t = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.u = (TextView) this.s.findViewById(R.id.action_bar_subtitle);
            int i = this.v;
            if (i != 0) {
                this.t.setTextAppearance(getContext(), i);
            }
            int i2 = this.w;
            if (i2 != 0) {
                this.u.setTextAppearance(getContext(), i2);
            }
        }
        this.t.setText(this.n);
        this.u.setText(this.o);
        boolean z = !TextUtils.isEmpty(this.n);
        boolean z2 = !TextUtils.isEmpty(this.o);
        int i3 = 0;
        this.u.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.s;
        if (!z && !z2) {
            i3 = 8;
        }
        linearLayout2.setVisibility(i3);
        if (this.s.getParent() == null) {
            addView(this.s);
        }
    }

    public final C6349ie4 m(int i, long j) {
        C6349ie4 c6349ie4 = this.k;
        if (c6349ie4 != null) {
            c6349ie4.b();
        }
        C5097f c5097f = this.a;
        if (i != 0) {
            C6349ie4 a = Ec4.a(this);
            a.a(0.0f);
            a.c(j);
            c5097f.c.k = a;
            c5097f.b = i;
            a.d(c5097f);
            return a;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C6349ie4 a2 = Ec4.a(this);
        a2.a(1.0f);
        a2.c(j);
        c5097f.c.k = a2;
        c5097f.b = i;
        a2.d(c5097f);
        return a2;
    }

    public final void c(AbstractC6160i5 abstractC6160i5) {
        View view = this.p;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.y, (ViewGroup) this, false);
            this.p = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.p);
        }
        View findViewById = this.p.findViewById(R.id.action_mode_close_button);
        this.q = findViewById;
        findViewById.setOnClickListener(new L4(abstractC6160i5));
        BS1 e = abstractC6160i5.e();
        C4097c5 c4097c5 = this.i;
        if (c4097c5 != null) {
            c4097c5.b();
            V4 v4 = c4097c5.y;
            if (v4 != null && v4.b()) {
                v4.j.dismiss();
            }
        }
        C4097c5 c4097c52 = new C4097c5(getContext());
        this.i = c4097c52;
        c4097c52.q = true;
        c4097c52.r = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        e.b(this.i, this.g);
        C4097c5 c4097c53 = this.i;
        CT1 ct1 = c4097c53.m;
        if (ct1 == null) {
            CT1 ct12 = (CT1) c4097c53.i.inflate(c4097c53.k, (ViewGroup) this, false);
            c4097c53.m = ct12;
            ct12.b(c4097c53.h);
            c4097c53.j();
        }
        CT1 ct13 = c4097c53.m;
        if (ct1 != ct13) {
            ActionMenuView actionMenuView = (ActionMenuView) ct13;
            actionMenuView.y = c4097c53;
            c4097c53.m = actionMenuView;
            actionMenuView.u = c4097c53.h;
        }
        ActionMenuView actionMenuView2 = (ActionMenuView) ct13;
        this.h = actionMenuView2;
        WeakHashMap weakHashMap = Ec4.a;
        actionMenuView2.setBackground(null);
        addView(this.h, layoutParams);
    }

    @Override // android.view.View
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            C6349ie4 c6349ie4 = this.k;
            if (c6349ie4 != null) {
                c6349ie4.b();
            }
            super.setVisibility(i);
        }
    }

    public final void e() {
        removeAllViews();
        this.r = null;
        this.h = null;
        this.i = null;
        View view = this.q;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public static int f(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - 0);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.j;
        if (i3 <= 0) {
            i3 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i4 = i3 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        View view = this.p;
        if (view != null) {
            int f = f(view, paddingLeft, makeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.p.getLayoutParams();
            paddingLeft = f - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.h;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.h, paddingLeft, makeMeasureSpec);
        }
        LinearLayout linearLayout = this.s;
        if (linearLayout != null && this.r == null) {
            if (this.x) {
                this.s.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.s.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.s.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, makeMeasureSpec);
            }
        }
        View view2 = this.r;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i5 = layoutParams.width;
            int i6 = i5 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i5 >= 0) {
                paddingLeft = Math.min(i5, paddingLeft);
            }
            int i7 = layoutParams.height;
            int i8 = i7 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i7 >= 0) {
                i4 = Math.min(i7, i4);
            }
            this.r.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i6), View.MeasureSpec.makeMeasureSpec(i4, i8));
        }
        if (this.j <= 0) {
            int childCount = getChildCount();
            int i9 = 0;
            for (int i10 = 0; i10 < childCount; i10++) {
                int measuredHeight = getChildAt(i10).getMeasuredHeight() + paddingBottom;
                if (measuredHeight > i9) {
                    i9 = measuredHeight;
                }
            }
            setMeasuredDimension(size, i9);
            return;
        }
        setMeasuredDimension(size, i3);
    }

    public static int j(int i, int i2, int i3, View view, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean a = He4.a(this);
        int paddingRight = a ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.p;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.p.getLayoutParams();
            int i5 = a ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = a ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = a ? paddingRight - i5 : paddingRight + i5;
            int j = j(i7, paddingTop, paddingTop2, this.p, a) + i7;
            paddingRight = a ? j - i6 : j + i6;
        }
        LinearLayout linearLayout = this.s;
        if (linearLayout != null && this.r == null && linearLayout.getVisibility() != 8) {
            paddingRight += j(paddingRight, paddingTop, paddingTop2, this.s, a);
        }
        View view2 = this.r;
        if (view2 != null) {
            j(paddingRight, paddingTop, paddingTop2, view2, a);
        }
        int paddingLeft = a ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.h;
        if (actionMenuView != null) {
            j(paddingLeft, paddingTop, paddingTop2, actionMenuView, !a);
        }
    }
}
