package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class BD1 implements Q93 {
    public static final Method F;
    public static final Method G;
    public static final Method H;
    public final Handler A;
    public Rect C;
    public boolean D;
    public final C2234Rf E;
    public final Context a;
    public ListAdapter g;
    public C5753gu0 h;
    public int k;
    public int l;
    public boolean n;
    public boolean o;
    public boolean p;
    public C11355xD1 s;
    public View t;
    public AdapterView.OnItemClickListener u;
    public AdapterView.OnItemSelectedListener v;
    public final int i = -2;
    public int j = -2;
    public final int m = 1002;
    public int q = 0;
    public final int r = Integer.MAX_VALUE;
    public final AD1 w = new AD1(this);
    public final ViewOnTouchListenerC12041zD1 x = new ViewOnTouchListenerC12041zD1(this);
    public final C11698yD1 y = new C11698yD1(this);
    public final RunnableC11012wD1 z = new RunnableC11012wD1(this);
    public final Rect B = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                F = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                H = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                G = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public BD1(Context context, AttributeSet attributeSet, int i, int i2) {
        this.a = context;
        this.A = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, JG2.d0, i, i2);
        this.k = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.l = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.n = true;
        }
        obtainStyledAttributes.recycle();
        C2234Rf c2234Rf = new C2234Rf(context, attributeSet, i, i2);
        this.E = c2234Rf;
        c2234Rf.setInputMethodMode(1);
    }

    public void f(ListAdapter listAdapter) {
        C11355xD1 c11355xD1 = this.s;
        if (c11355xD1 == null) {
            this.s = new C11355xD1(this);
        } else {
            ListAdapter listAdapter2 = this.g;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(c11355xD1);
            }
        }
        this.g = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.s);
        }
        C5753gu0 c5753gu0 = this.h;
        if (c5753gu0 != null) {
            c5753gu0.setAdapter(this.g);
        }
    }

    public final Drawable c() {
        return this.E.getBackground();
    }

    public final void e(Drawable drawable) {
        this.E.setBackgroundDrawable(drawable);
    }

    public final int g() {
        return this.k;
    }

    public final void i(int i) {
        this.k = i;
    }

    public final int p() {
        if (this.n) {
            return this.l;
        }
        return 0;
    }

    public final void m(int i) {
        this.l = i;
        this.n = true;
    }

    public final void r(int i) {
        Drawable background = this.E.getBackground();
        if (background == null) {
            this.j = i;
            return;
        }
        Rect rect = this.B;
        background.getPadding(rect);
        this.j = rect.left + rect.right + i;
    }

    @Override // defpackage.Q93
    public final void dismiss() {
        C2234Rf c2234Rf = this.E;
        c2234Rf.dismiss();
        c2234Rf.setContentView(null);
        this.h = null;
        this.A.removeCallbacks(this.w);
    }

    @Override // defpackage.Q93
    public final boolean a() {
        return this.E.isShowing();
    }

    @Override // defpackage.Q93
    public final C5753gu0 d() {
        return this.h;
    }

    public C5753gu0 q(Context context, boolean z) {
        return new C5753gu0(context, z);
    }

    @Override // defpackage.Q93
    public final void b() {
        int i;
        int maxAvailableHeight;
        int paddingBottom;
        C5753gu0 c5753gu0;
        C5753gu0 c5753gu02 = this.h;
        C2234Rf c2234Rf = this.E;
        Context context = this.a;
        if (c5753gu02 == null) {
            C5753gu0 q = q(context, !this.D);
            this.h = q;
            q.setAdapter(this.g);
            this.h.setOnItemClickListener(this.u);
            this.h.setFocusable(true);
            this.h.setFocusableInTouchMode(true);
            this.h.setOnItemSelectedListener(new C9640sD1(this));
            this.h.setOnScrollListener(this.y);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.v;
            if (onItemSelectedListener != null) {
                this.h.setOnItemSelectedListener(onItemSelectedListener);
            }
            c2234Rf.setContentView(this.h);
        }
        Drawable background = c2234Rf.getBackground();
        Rect rect = this.B;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.n) {
                this.l = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        boolean z = c2234Rf.getInputMethodMode() == 2;
        View view = this.t;
        int i3 = this.l;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = G;
            if (method != null) {
                try {
                    maxAvailableHeight = ((Integer) method.invoke(c2234Rf, view, Integer.valueOf(i3), Boolean.valueOf(z))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            maxAvailableHeight = c2234Rf.getMaxAvailableHeight(view, i3);
        } else {
            maxAvailableHeight = c2234Rf.getMaxAvailableHeight(view, i3, z);
        }
        int i4 = this.i;
        if (i4 == -1) {
            paddingBottom = maxAvailableHeight + i;
        } else {
            int i5 = this.j;
            int a = this.h.a(i5 != -2 ? i5 != -1 ? View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), maxAvailableHeight + 0);
            paddingBottom = a + (a > 0 ? this.h.getPaddingBottom() + this.h.getPaddingTop() + i + 0 : 0);
        }
        boolean z2 = c2234Rf.getInputMethodMode() == 2;
        c2234Rf.setWindowLayoutType(this.m);
        if (c2234Rf.isShowing()) {
            View view2 = this.t;
            WeakHashMap weakHashMap = Ec4.a;
            if (view2.isAttachedToWindow()) {
                int i6 = this.j;
                if (i6 == -1) {
                    i6 = -1;
                } else if (i6 == -2) {
                    i6 = this.t.getWidth();
                }
                if (i4 == -1) {
                    i4 = z2 ? paddingBottom : -1;
                    if (z2) {
                        c2234Rf.setWidth(this.j == -1 ? -1 : 0);
                        c2234Rf.setHeight(0);
                    } else {
                        c2234Rf.setWidth(this.j == -1 ? -1 : 0);
                        c2234Rf.setHeight(-1);
                    }
                } else if (i4 == -2) {
                    i4 = paddingBottom;
                }
                c2234Rf.setOutsideTouchable(true);
                View view3 = this.t;
                int i7 = this.k;
                int i8 = this.l;
                if (i6 < 0) {
                    i6 = -1;
                }
                c2234Rf.update(view3, i7, i8, i6, i4 < 0 ? -1 : i4);
                return;
            }
            return;
        }
        int i9 = this.j;
        if (i9 == -1) {
            i9 = -1;
        } else if (i9 == -2) {
            i9 = this.t.getWidth();
        }
        if (i4 == -1) {
            i4 = -1;
        } else if (i4 == -2) {
            i4 = paddingBottom;
        }
        c2234Rf.setWidth(i9);
        c2234Rf.setHeight(i4);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = F;
            if (method2 != null) {
                try {
                    method2.invoke(c2234Rf, Boolean.TRUE);
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            c2234Rf.setIsClippedToScreen(true);
        }
        c2234Rf.setOutsideTouchable(true);
        c2234Rf.setTouchInterceptor(this.x);
        if (this.p) {
            c2234Rf.setOverlapAnchor(this.o);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = H;
            if (method3 != null) {
                try {
                    method3.invoke(c2234Rf, this.C);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            c2234Rf.setEpicenterBounds(this.C);
        }
        c2234Rf.showAsDropDown(this.t, this.k, this.l, this.q);
        this.h.setSelection(-1);
        if ((!this.D || this.h.isInTouchMode()) && (c5753gu0 = this.h) != null) {
            c5753gu0.n = true;
            c5753gu0.requestLayout();
        }
        if (this.D) {
            return;
        }
        this.A.post(this.z);
    }
}
