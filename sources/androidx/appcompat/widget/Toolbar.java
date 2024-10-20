package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.customview.view.AbsSavedState;
import com.android.chrome.R;
import defpackage.AO3;
import defpackage.AbstractC3878bS3;
import defpackage.BO3;
import defpackage.BS1;
import defpackage.C10475ug;
import defpackage.C11069wO3;
import defpackage.C11426xR2;
import defpackage.C12098zO3;
import defpackage.C1844Of;
import defpackage.C1898Op3;
import defpackage.C4097c5;
import defpackage.C6287iT1;
import defpackage.C8004nT0;
import defpackage.CO3;
import defpackage.ER3;
import defpackage.Ec4;
import defpackage.I4;
import defpackage.IN3;
import defpackage.InterfaceC11778yT1;
import defpackage.InterfaceC12116zS1;
import defpackage.JG2;
import defpackage.RunnableC11412xO3;
import defpackage.YS1;
import defpackage.ZS1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements YS1 {
    public final int A;
    public final int B;
    public CharSequence C;
    public CharSequence D;
    public ColorStateList E;
    public ColorStateList F;
    public boolean G;
    public boolean H;
    public final ArrayList I;

    /* renamed from: J, reason: collision with root package name */
    public final ArrayList f11483J;
    public final int[] K;
    public final ZS1 L;
    public ArrayList M;
    public BO3 N;
    public final C11069wO3 O;
    public ER3 P;
    public C4097c5 Q;
    public C12098zO3 R;
    public InterfaceC11778yT1 S;
    public InterfaceC12116zS1 T;
    public boolean U;
    public final RunnableC11412xO3 V;
    public ActionMenuView a;
    public C10475ug g;
    public C10475ug h;
    public C1844Of i;
    public AppCompatImageView j;
    public final Drawable k;
    public final CharSequence l;
    public C1844Of m;
    public View n;
    public Context o;
    public int p;
    public int q;
    public int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public C11426xR2 y;
    public final int z;

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new CO3();
        public int h;
        public boolean i;

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.a, i);
            parcel.writeInt(this.h);
            parcel.writeInt(this.i ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.h = parcel.readInt();
            this.i = parcel.readInt() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.f14680_resource_name_obfuscated_res_0x7f0504e9);
        this.B = 8388627;
        this.I = new ArrayList();
        this.f11483J = new ArrayList();
        this.K = new int[2];
        this.L = new ZS1(new Runnable() { // from class: vO3
            @Override // java.lang.Runnable
            public final void run() {
                Toolbar.this.t();
            }
        });
        this.M = new ArrayList();
        this.O = new C11069wO3(this);
        this.V = new RunnableC11412xO3(this);
        Context context2 = getContext();
        int[] iArr = JG2.e1;
        IN3 m = IN3.m(context2, attributeSet, iArr, R.attr.f14680_resource_name_obfuscated_res_0x7f0504e9);
        Ec4.l(this, context, iArr, attributeSet, m.b, R.attr.f14680_resource_name_obfuscated_res_0x7f0504e9, 0);
        this.q = m.i(28, 0);
        this.r = m.i(19, 0);
        TypedArray typedArray = m.b;
        this.B = typedArray.getInteger(0, 8388627);
        this.s = typedArray.getInteger(2, 48);
        int c = m.c(22, 0);
        c = m.l(27) ? m.c(27, c) : c;
        this.x = c;
        this.w = c;
        this.v = c;
        this.u = c;
        int c2 = m.c(25, -1);
        if (c2 >= 0) {
            this.u = c2;
        }
        int c3 = m.c(24, -1);
        if (c3 >= 0) {
            this.v = c3;
        }
        int c4 = m.c(26, -1);
        if (c4 >= 0) {
            this.w = c4;
        }
        int c5 = m.c(23, -1);
        if (c5 >= 0) {
            this.x = c5;
        }
        this.t = m.d(13, -1);
        int c6 = m.c(9, Integer.MIN_VALUE);
        int c7 = m.c(5, Integer.MIN_VALUE);
        int d = m.d(7, 0);
        int d2 = m.d(8, 0);
        if (this.y == null) {
            this.y = new C11426xR2();
        }
        C11426xR2 c11426xR2 = this.y;
        c11426xR2.h = false;
        if (d != Integer.MIN_VALUE) {
            c11426xR2.e = d;
            c11426xR2.a = d;
        }
        if (d2 != Integer.MIN_VALUE) {
            c11426xR2.f = d2;
            c11426xR2.b = d2;
        }
        if (c6 != Integer.MIN_VALUE || c7 != Integer.MIN_VALUE) {
            c11426xR2.a(c6, c7);
        }
        this.z = m.c(10, Integer.MIN_VALUE);
        this.A = m.c(6, Integer.MIN_VALUE);
        this.k = m.e(4);
        this.l = m.k(3);
        CharSequence k = m.k(21);
        if (!TextUtils.isEmpty(k)) {
            G(k);
        }
        CharSequence k2 = m.k(18);
        if (!TextUtils.isEmpty(k2)) {
            E(k2);
        }
        this.o = getContext();
        int i2 = m.i(17, 0);
        if (this.p != i2) {
            this.p = i2;
            if (i2 == 0) {
                this.o = getContext();
            } else {
                this.o = new ContextThemeWrapper(getContext(), i2);
            }
        }
        Drawable e = m.e(16);
        if (e != null) {
            C(e);
        }
        CharSequence k3 = m.k(15);
        if (!TextUtils.isEmpty(k3)) {
            B(k3);
        }
        Drawable e2 = m.e(11);
        if (e2 != null) {
            z(e2);
        }
        CharSequence k4 = m.k(12);
        if (!TextUtils.isEmpty(k4)) {
            if (!TextUtils.isEmpty(k4) && this.j == null) {
                this.j = new AppCompatImageView(getContext(), null);
            }
            AppCompatImageView appCompatImageView = this.j;
            if (appCompatImageView != null) {
                appCompatImageView.setContentDescription(k4);
            }
        }
        if (m.l(29)) {
            ColorStateList b = m.b(29);
            this.E = b;
            C10475ug c10475ug = this.g;
            if (c10475ug != null) {
                c10475ug.setTextColor(b);
            }
        }
        if (m.l(20)) {
            ColorStateList b2 = m.b(20);
            this.F = b2;
            C10475ug c10475ug2 = this.h;
            if (c10475ug2 != null) {
                c10475ug2.setTextColor(b2);
            }
        }
        if (m.l(14)) {
            s(m.i(14, 0));
        }
        m.n();
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.y == null) {
            this.y = new C11426xR2();
        }
        C11426xR2 c11426xR2 = this.y;
        boolean z = i == 1;
        if (z == c11426xR2.g) {
            return;
        }
        c11426xR2.g = z;
        if (!c11426xR2.h) {
            c11426xR2.a = c11426xR2.e;
            c11426xR2.b = c11426xR2.f;
            return;
        }
        if (z) {
            int i2 = c11426xR2.d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = c11426xR2.e;
            }
            c11426xR2.a = i2;
            int i3 = c11426xR2.c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = c11426xR2.f;
            }
            c11426xR2.b = i3;
            return;
        }
        int i4 = c11426xR2.c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = c11426xR2.e;
        }
        c11426xR2.a = i4;
        int i5 = c11426xR2.d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = c11426xR2.f;
        }
        c11426xR2.b = i5;
    }

    public final boolean r() {
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView == null) {
            return false;
        }
        C4097c5 c4097c5 = actionMenuView.y;
        return c4097c5 != null && c4097c5.b();
    }

    public final void z(Drawable drawable) {
        if (drawable == null) {
            AppCompatImageView appCompatImageView = this.j;
            if (appCompatImageView != null && u(appCompatImageView)) {
                removeView(this.j);
                this.f11483J.remove(this.j);
            }
        } else {
            if (this.j == null) {
                this.j = new AppCompatImageView(getContext(), null);
            }
            if (!u(this.j)) {
                c(this.j, true);
            }
        }
        AppCompatImageView appCompatImageView2 = this.j;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    public final void F(int i) {
        G(getContext().getText(i));
    }

    public void G(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.g == null) {
                Context context = getContext();
                C10475ug c10475ug = new C10475ug(context, null);
                this.g = c10475ug;
                c10475ug.setSingleLine();
                this.g.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.q;
                if (i != 0) {
                    this.g.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.E;
                if (colorStateList != null) {
                    this.g.setTextColor(colorStateList);
                }
            }
            if (!u(this.g)) {
                c(this.g, true);
            }
        } else {
            C10475ug c10475ug2 = this.g;
            if (c10475ug2 != null && u(c10475ug2)) {
                removeView(this.g);
                this.f11483J.remove(this.g);
            }
        }
        C10475ug c10475ug3 = this.g;
        if (c10475ug3 != null) {
            c10475ug3.setText(charSequence);
        }
        this.C = charSequence;
    }

    public final void E(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.h == null) {
                Context context = getContext();
                C10475ug c10475ug = new C10475ug(context, null);
                this.h = c10475ug;
                c10475ug.setSingleLine();
                this.h.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.r;
                if (i != 0) {
                    this.h.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.F;
                if (colorStateList != null) {
                    this.h.setTextColor(colorStateList);
                }
            }
            if (!u(this.h)) {
                c(this.h, true);
            }
        } else {
            C10475ug c10475ug2 = this.h;
            if (c10475ug2 != null && u(c10475ug2)) {
                removeView(this.h);
                this.f11483J.remove(this.h);
            }
        }
        C10475ug c10475ug3 = this.h;
        if (c10475ug3 != null) {
            c10475ug3.setText(charSequence);
        }
        this.D = charSequence;
    }

    public final void A(int i) {
        B(i != 0 ? getContext().getText(i) : null);
    }

    public final void B(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        C1844Of c1844Of = this.i;
        if (c1844Of != null) {
            c1844Of.setContentDescription(charSequence);
            AbstractC3878bS3.a(charSequence, this.i);
        }
    }

    public void C(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!u(this.i)) {
                c(this.i, true);
            }
        } else {
            C1844Of c1844Of = this.i;
            if (c1844Of != null && u(c1844Of)) {
                removeView(this.i);
                this.f11483J.remove(this.i);
            }
        }
        C1844Of c1844Of2 = this.i;
        if (c1844Of2 != null) {
            c1844Of2.setImageDrawable(drawable);
        }
    }

    public final Drawable p() {
        C1844Of c1844Of = this.i;
        if (c1844Of != null) {
            return c1844Of.getDrawable();
        }
        return null;
    }

    public final void D(View.OnClickListener onClickListener) {
        i();
        this.i.setOnClickListener(onClickListener);
    }

    public final Menu o() {
        e();
        return this.a.l();
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView.u == null) {
            BS1 bs1 = (BS1) actionMenuView.l();
            if (this.R == null) {
                this.R = new C12098zO3(this);
            }
            this.a.y.v = true;
            bs1.b(this.R, this.o);
        }
    }

    public final void f() {
        if (this.a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.a = actionMenuView;
            int i = this.p;
            if (actionMenuView.w != i) {
                actionMenuView.w = i;
                if (i == 0) {
                    actionMenuView.v = actionMenuView.getContext();
                } else {
                    actionMenuView.v = new ContextThemeWrapper(actionMenuView.getContext(), i);
                }
            }
            ActionMenuView actionMenuView2 = this.a;
            actionMenuView2.F = this.O;
            InterfaceC11778yT1 interfaceC11778yT1 = this.S;
            InterfaceC12116zS1 interfaceC12116zS1 = this.T;
            actionMenuView2.z = interfaceC11778yT1;
            actionMenuView2.A = interfaceC12116zS1;
            AO3 ao3 = new AO3();
            ao3.a = (this.s & 112) | 8388613;
            this.a.setLayoutParams(ao3);
            c(this.a, false);
        }
    }

    public final void s(int i) {
        new C1898Op3(getContext()).inflate(i, o());
    }

    public final int m() {
        if (p() != null) {
            C11426xR2 c11426xR2 = this.y;
            return Math.max(c11426xR2 != null ? c11426xR2.g ? c11426xR2.b : c11426xR2.a : 0, Math.max(this.z, 0));
        }
        C11426xR2 c11426xR22 = this.y;
        return c11426xR22 != null ? c11426xR22.g ? c11426xR22.b : c11426xR22.a : 0;
    }

    public final int l() {
        BS1 bs1;
        ActionMenuView actionMenuView = this.a;
        if ((actionMenuView == null || (bs1 = actionMenuView.u) == null || !bs1.hasVisibleItems()) ? false : true) {
            C11426xR2 c11426xR2 = this.y;
            return Math.max(c11426xR2 != null ? c11426xR2.g ? c11426xR2.a : c11426xR2.b : 0, Math.max(this.A, 0));
        }
        C11426xR2 c11426xR22 = this.y;
        return c11426xR22 != null ? c11426xR22.g ? c11426xR22.a : c11426xR22.b : 0;
    }

    public final void i() {
        if (this.i == null) {
            this.i = new C1844Of(getContext(), null, R.attr.f14670_resource_name_obfuscated_res_0x7f0504e8);
            AO3 ao3 = new AO3();
            ao3.a = (this.s & 112) | 8388611;
            this.i.setLayoutParams(ao3);
        }
    }

    public final void c(View view, boolean z) {
        AO3 ao3;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            if (!checkLayoutParams(layoutParams)) {
                ao3 = j(layoutParams);
            } else {
                ao3 = (AO3) layoutParams;
            }
        } else {
            ao3 = new AO3();
        }
        ao3.b = 1;
        if (z && this.n != null) {
            view.setLayoutParams(ao3);
            this.f11483J.add(view);
        } else {
            addView(view, ao3);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C6287iT1 c6287iT1;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        C12098zO3 c12098zO3 = this.R;
        if (c12098zO3 != null && (c6287iT1 = c12098zO3.g) != null) {
            savedState.h = c6287iT1.a;
        }
        ActionMenuView actionMenuView = this.a;
        boolean z = false;
        if (actionMenuView != null) {
            C4097c5 c4097c5 = actionMenuView.y;
            if (c4097c5 != null && c4097c5.d()) {
                z = true;
            }
        }
        savedState.i = z;
        return savedState;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a);
        ActionMenuView actionMenuView = this.a;
        BS1 bs1 = actionMenuView != null ? actionMenuView.u : null;
        int i = savedState.h;
        if (i != 0 && this.R != null && bs1 != null && (findItem = bs1.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (savedState.i) {
            RunnableC11412xO3 runnableC11412xO3 = this.V;
            removeCallbacks(runnableC11412xO3);
            post(runnableC11412xO3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.V);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.G = false;
        }
        if (!this.G) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.G = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.G = false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.H = false;
        }
        if (!this.H) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.H = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.H = false;
        }
        return true;
    }

    public final void y(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final int x(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0284  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 649
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onMeasure(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02a1 A[LOOP:0: B:46:0x029f->B:47:0x02a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02be A[LOOP:1: B:50:0x02bc->B:51:0x02be, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02dc A[LOOP:2: B:54:0x02da->B:55:0x02dc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x032a A[LOOP:3: B:63:0x0328->B:64:0x032a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c6  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 827
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    public final int v(View view, int i, int i2, int[] iArr) {
        AO3 ao3 = (AO3) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) ao3).leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int k = k(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, k, max + measuredWidth, view.getMeasuredHeight() + k);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) ao3).rightMargin + max;
    }

    public final int w(View view, int i, int i2, int[] iArr) {
        AO3 ao3 = (AO3) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) ao3).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int k = k(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, k, max, view.getMeasuredHeight() + k);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) ao3).leftMargin);
    }

    public final int k(View view, int i) {
        AO3 ao3 = (AO3) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = ao3.a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.B & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) ao3).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i5 = ((ViewGroup.MarginLayoutParams) ao3).topMargin;
        if (i4 < i5) {
            i4 = i5;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
            int i7 = ((ViewGroup.MarginLayoutParams) ao3).bottomMargin;
            if (i6 < i7) {
                i4 = Math.max(0, i4 - (i7 - i6));
            }
        }
        return paddingTop + i4;
    }

    public final void b(int i, ArrayList arrayList) {
        WeakHashMap weakHashMap = Ec4.a;
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                AO3 ao3 = (AO3) childAt.getLayoutParams();
                if (ao3.b == 0 && H(childAt)) {
                    int i3 = ao3.a;
                    WeakHashMap weakHashMap2 = Ec4.a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            AO3 ao32 = (AO3) childAt2.getLayoutParams();
            if (ao32.b == 0 && H(childAt2)) {
                int i5 = ao32.a;
                WeakHashMap weakHashMap3 = Ec4.a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final boolean H(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public static int n(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int q(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new AO3(getContext(), attributeSet);
    }

    public static AO3 j(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof AO3) {
            return new AO3((AO3) layoutParams);
        }
        if (layoutParams instanceof I4) {
            return new AO3((I4) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new AO3((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new AO3(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new AO3();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof AO3);
    }

    public final boolean u(View view) {
        return view.getParent() == this || this.f11483J.contains(view);
    }

    public final void t() {
        Iterator it = this.M.iterator();
        while (it.hasNext()) {
            o().removeItem(((MenuItem) it.next()).getItemId());
        }
        Menu o = o();
        ArrayList arrayList = new ArrayList();
        Menu o2 = o();
        for (int i = 0; i < o2.size(); i++) {
            arrayList.add(o2.getItem(i));
        }
        C1898Op3 c1898Op3 = new C1898Op3(getContext());
        ZS1 zs1 = this.L;
        Iterator it2 = zs1.b.iterator();
        while (it2.hasNext()) {
            ((C8004nT0) it2.next()).a.h(o, c1898Op3);
        }
        ArrayList arrayList2 = new ArrayList();
        Menu o3 = o();
        for (int i2 = 0; i2 < o3.size(); i2++) {
            arrayList2.add(o3.getItem(i2));
        }
        arrayList2.removeAll(arrayList);
        this.M = arrayList2;
        Iterator it3 = zs1.b.iterator();
        while (it3.hasNext()) {
            ((C8004nT0) it3.next()).a.q(o);
        }
    }
}
