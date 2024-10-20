package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import com.android.chrome.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Locale;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mM1 */
/* loaded from: classes.dex */
public final class C7626mM1 extends C3600af {
    public final BD1 j;
    public final AccessibilityManager k;
    public final Rect l;
    public final float m;
    public final int n;
    public final ColorStateList o;

    public C7626mM1(Context context, AttributeSet attributeSet) {
        super(GM1.a(context, attributeSet, R.attr.0_resource_name_obfuscated_res_0x7f05003c, 0), attributeSet);
        this.l = new Rect();
        Context context2 = getContext();
        TypedArray d = SJ3.d(context2, attributeSet, JG2.h0, R.attr.0_resource_name_obfuscated_res_0x7f05003c, R.style.f107350_resource_name_obfuscated_res_0x7f150620, new int[0]);
        if (d.hasValue(0) && d.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        int resourceId = d.getResourceId(2, R.layout.0_resource_name_obfuscated_res_0x7f0e019f);
        this.m = d.getDimensionPixelOffset(1, R.dimen.0_resource_name_obfuscated_res_0x7f08056d);
        this.n = d.getColor(3, 0);
        this.o = AM1.b(context2, d, 4);
        this.k = (AccessibilityManager) context2.getSystemService("accessibility");
        BD1 bd1 = new BD1(context2, null, R.attr.0_resource_name_obfuscated_res_0x7f0502d5, 0);
        this.j = bd1;
        bd1.D = true;
        C2234Rf c2234Rf = bd1.E;
        c2234Rf.setFocusable(true);
        bd1.t = this;
        c2234Rf.setInputMethodMode(2);
        bd1.f(getAdapter());
        bd1.u = new C6938kM1(this);
        if (d.hasValue(5)) {
            setAdapter(new C7282lM1(this, getContext(), resourceId, getResources().getStringArray(d.getResourceId(5, 0))));
        }
        d.recycle();
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        AccessibilityManager accessibilityManager = this.k;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            this.j.b();
        } else {
            super.showDropDown();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setAdapter(ListAdapter listAdapter) {
        super.setAdapter(listAdapter);
        this.j.f(getAdapter());
    }

    @Override // android.widget.TextView
    public final void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout c = c();
        if (c != null) {
            c.w();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.j.v = getOnItemSelectedListener();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout c = c();
        if (c != null && c.H && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    @Override // android.widget.TextView
    public final CharSequence getHint() {
        TextInputLayout c = c();
        if (c == null || !c.H) {
            return super.getHint();
        }
        if (c.F) {
            return c.G;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout c = c();
            int i3 = 0;
            if (adapter != null && c != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                BD1 bd1 = this.j;
                int min = Math.min(adapter.getCount(), Math.max(0, !bd1.a() ? -1 : bd1.h.getSelectedItemPosition()) + 15);
                View view = null;
                int i4 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i3) {
                        view = null;
                        i3 = itemViewType;
                    }
                    view = adapter.getView(max, view, c);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i4 = Math.max(i4, view.getMeasuredWidth());
                }
                Drawable c2 = bd1.c();
                if (c2 != null) {
                    Rect rect = this.l;
                    c2.getPadding(rect);
                    i4 += rect.left + rect.right;
                }
                i3 = c.h.k.getMeasuredWidth() + i4;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i3), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public final TextInputLayout c() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public static void b(C7626mM1 c7626mM1, Object obj) {
        c7626mM1.setText(c7626mM1.convertSelectionToString(obj), false);
    }
}
