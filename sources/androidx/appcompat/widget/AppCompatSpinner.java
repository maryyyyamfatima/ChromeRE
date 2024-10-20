package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import defpackage.AbstractC2884Wf;
import defpackage.C3274Zf;
import defpackage.C3944bf;
import defpackage.C4293cg;
import defpackage.InterfaceC6012hg;
import defpackage.ViewTreeObserverOnGlobalLayoutListenerC3606ag;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class AppCompatSpinner extends Spinner {
    public static final int[] n = {R.attr.spinnerMode};
    public final C3944bf a;
    public final Context g;
    public final C3274Zf h;
    public SpinnerAdapter i;
    public final boolean j;
    public final InterfaceC6012hg k;
    public int l;
    public final Rect m;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:            if (r6 == null) goto L23;     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AppCompatSpinner(android.content.Context r12, android.util.AttributeSet r13) {
        /*
            r11 = this;
            r0 = 2131035166(0x7f05041e, float:1.768087E38)
            r11.<init>(r12, r13, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r11.m = r1
            android.content.Context r1 = r11.getContext()
            defpackage.AbstractC3838bK3.a(r1, r11)
            int[] r1 = defpackage.JG2.M0
            r2 = 0
            android.content.res.TypedArray r3 = r12.obtainStyledAttributes(r13, r1, r0, r2)
            bf r4 = new bf
            r4.<init>(r11)
            r11.a = r4
            r4 = 4
            int r4 = r3.getResourceId(r4, r2)
            if (r4 == 0) goto L31
            R60 r5 = new R60
            r5.<init>(r12, r4)
            r11.g = r5
            goto L33
        L31:
            r11.g = r12
        L33:
            r4 = -1
            r5 = 0
            int[] r6 = androidx.appcompat.widget.AppCompatSpinner.n     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4f
            android.content.res.TypedArray r6 = r12.obtainStyledAttributes(r13, r6, r0, r2)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4f
            boolean r7 = r6.hasValue(r2)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L4a
            if (r7 == 0) goto L5b
            int r4 = r6.getInt(r2, r2)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L4a
            goto L5b
        L46:
            r12 = move-exception
            r5 = r6
            goto Lce
        L4a:
            r7 = move-exception
            goto L52
        L4c:
            r12 = move-exception
            goto Lce
        L4f:
            r6 = move-exception
            r7 = r6
            r6 = r5
        L52:
            java.lang.String r8 = "AppCompatSpinner"
            java.lang.String r9 = "Could not read android:spinnerMode"
            android.util.Log.i(r8, r9, r7)     // Catch: java.lang.Throwable -> L46
            if (r6 == 0) goto L5e
        L5b:
            r6.recycle()
        L5e:
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L96
            if (r4 == r7) goto L65
            goto La3
        L65:
            gg r4 = new gg
            android.content.Context r8 = r11.g
            r4.<init>(r11, r8, r13)
            android.content.Context r8 = r11.g
            IN3 r1 = defpackage.IN3.m(r8, r13, r1, r0)
            android.content.res.TypedArray r8 = r1.b
            r9 = 3
            r10 = -2
            int r8 = r8.getLayoutDimension(r9, r10)
            r11.l = r8
            android.graphics.drawable.Drawable r8 = r1.e(r7)
            r4.e(r8)
            java.lang.String r6 = r3.getString(r6)
            r4.I = r6
            r1.n()
            r11.k = r4
            Zf r1 = new Zf
            r1.<init>(r11, r11, r4)
            r11.h = r1
            goto La3
        L96:
            bg r1 = new bg
            r1.<init>(r11)
            r11.k = r1
            java.lang.String r4 = r3.getString(r6)
            r1.h = r4
        La3:
            java.lang.CharSequence[] r1 = r3.getTextArray(r2)
            if (r1 == 0) goto Lba
            android.widget.ArrayAdapter r2 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r2.<init>(r12, r4, r1)
            r12 = 2131624587(0x7f0e028b, float:1.8876358E38)
            r2.setDropDownViewResource(r12)
            r11.setAdapter(r2)
        Lba:
            r3.recycle()
            r11.j = r7
            android.widget.SpinnerAdapter r12 = r11.i
            if (r12 == 0) goto Lc8
            r11.setAdapter(r12)
            r11.i = r5
        Lc8:
            bf r12 = r11.a
            r12.d(r13, r0)
            return
        Lce:
            if (r5 == 0) goto Ld3
            r5.recycle()
        Ld3:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // android.widget.Spinner
    public final Context getPopupContext() {
        return this.g;
    }

    @Override // android.widget.Spinner
    public final void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC6012hg interfaceC6012hg = this.k;
        if (interfaceC6012hg != null) {
            interfaceC6012hg.e(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public final void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(AbstractC2884Wf.a(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public final Drawable getPopupBackground() {
        InterfaceC6012hg interfaceC6012hg = this.k;
        if (interfaceC6012hg != null) {
            return interfaceC6012hg.c();
        }
        return super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public final void setDropDownVerticalOffset(int i) {
        InterfaceC6012hg interfaceC6012hg = this.k;
        if (interfaceC6012hg != null) {
            interfaceC6012hg.m(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public final int getDropDownVerticalOffset() {
        InterfaceC6012hg interfaceC6012hg = this.k;
        if (interfaceC6012hg != null) {
            return interfaceC6012hg.p();
        }
        return super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public final void setDropDownHorizontalOffset(int i) {
        InterfaceC6012hg interfaceC6012hg = this.k;
        if (interfaceC6012hg != null) {
            interfaceC6012hg.n(i);
            interfaceC6012hg.i(i);
        } else {
            super.setDropDownHorizontalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public final int getDropDownHorizontalOffset() {
        InterfaceC6012hg interfaceC6012hg = this.k;
        if (interfaceC6012hg != null) {
            return interfaceC6012hg.g();
        }
        return super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public final void setDropDownWidth(int i) {
        if (this.k != null) {
            this.l = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public final int getDropDownWidth() {
        if (this.k != null) {
            return this.l;
        }
        return super.getDropDownWidth();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.j) {
            this.i = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC6012hg interfaceC6012hg = this.k;
        if (interfaceC6012hg != null) {
            Context context = this.g;
            if (context == null) {
                context = getContext();
            }
            interfaceC6012hg.f(new C4293cg(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC6012hg interfaceC6012hg = this.k;
        if (interfaceC6012hg == null || !interfaceC6012hg.a()) {
            return;
        }
        interfaceC6012hg.dismiss();
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C3274Zf c3274Zf = this.h;
        if (c3274Zf == null || !c3274Zf.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.k == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC6012hg interfaceC6012hg = this.k;
        if (interfaceC6012hg != null) {
            if (interfaceC6012hg.a()) {
                return true;
            }
            interfaceC6012hg.o(getTextDirection(), getTextAlignment());
            return true;
        }
        return super.performClick();
    }

    @Override // android.widget.Spinner
    public final void setPrompt(CharSequence charSequence) {
        InterfaceC6012hg interfaceC6012hg = this.k;
        if (interfaceC6012hg != null) {
            interfaceC6012hg.k(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // android.widget.Spinner
    public final CharSequence getPrompt() {
        InterfaceC6012hg interfaceC6012hg = this.k;
        return interfaceC6012hg != null ? interfaceC6012hg.j() : super.getPrompt();
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C3944bf c3944bf = this.a;
        if (c3944bf != null) {
            c3944bf.f(i);
        }
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3944bf c3944bf = this.a;
        if (c3944bf != null) {
            c3944bf.e();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C3944bf c3944bf = this.a;
        if (c3944bf != null) {
            c3944bf.a();
        }
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        Rect rect = this.m;
        drawable.getPadding(rect);
        return i2 + rect.left + rect.right;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        InterfaceC6012hg interfaceC6012hg = this.k;
        savedState.a = interfaceC6012hg != null && interfaceC6012hg.a();
        return savedState;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!savedState.a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC3606ag(this));
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new a();
        public boolean a;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readByte() != 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
        }
    }
}
