package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import androidx.appcompat.widget.AppCompatSpinner;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5668gg extends BD1 implements InterfaceC6012hg {
    public CharSequence I;

    /* renamed from: J, reason: collision with root package name */
    public ListAdapter f11507J;
    public final Rect K;
    public int L;
    public final /* synthetic */ AppCompatSpinner M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5668gg(AppCompatSpinner appCompatSpinner, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.f12650_resource_name_obfuscated_res_0x7f05041e, 0);
        this.M = appCompatSpinner;
        this.K = new Rect();
        this.t = appCompatSpinner;
        this.D = true;
        this.E.setFocusable(true);
        this.u = new C4637dg(this);
    }

    @Override // defpackage.BD1, defpackage.InterfaceC6012hg
    public final void f(ListAdapter listAdapter) {
        super.f(listAdapter);
        this.f11507J = listAdapter;
    }

    @Override // defpackage.InterfaceC6012hg
    public final CharSequence j() {
        return this.I;
    }

    @Override // defpackage.InterfaceC6012hg
    public final void k(CharSequence charSequence) {
        this.I = charSequence;
    }

    public final void s() {
        int i;
        Drawable c = c();
        AppCompatSpinner appCompatSpinner = this.M;
        if (c != null) {
            c.getPadding(appCompatSpinner.m);
            i = He4.a(appCompatSpinner) ? appCompatSpinner.m.right : -appCompatSpinner.m.left;
        } else {
            Rect rect = appCompatSpinner.m;
            rect.right = 0;
            rect.left = 0;
            i = 0;
        }
        int paddingLeft = appCompatSpinner.getPaddingLeft();
        int paddingRight = appCompatSpinner.getPaddingRight();
        int width = appCompatSpinner.getWidth();
        int i2 = appCompatSpinner.l;
        if (i2 == -2) {
            int a = appCompatSpinner.a((SpinnerAdapter) this.f11507J, c());
            int i3 = appCompatSpinner.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = appCompatSpinner.m;
            int i4 = (i3 - rect2.left) - rect2.right;
            if (a > i4) {
                a = i4;
            }
            r(Math.max(a, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i2);
        }
        this.k = He4.a(appCompatSpinner) ? (((width - paddingRight) - this.j) - this.L) + i : paddingLeft + this.L + i;
    }

    @Override // defpackage.InterfaceC6012hg
    public final void o(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        boolean a = a();
        s();
        C2234Rf c2234Rf = this.E;
        c2234Rf.setInputMethodMode(2);
        b();
        C5753gu0 c5753gu0 = this.h;
        c5753gu0.setChoiceMode(1);
        c5753gu0.setTextDirection(i);
        c5753gu0.setTextAlignment(i2);
        AppCompatSpinner appCompatSpinner = this.M;
        int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
        C5753gu0 c5753gu02 = this.h;
        if (a() && c5753gu02 != null) {
            c5753gu02.n = false;
            c5753gu02.setSelection(selectedItemPosition);
            if (c5753gu02.getChoiceMode() != 0) {
                c5753gu02.setItemChecked(selectedItemPosition, true);
            }
        }
        if (a || (viewTreeObserver = appCompatSpinner.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC4980eg viewTreeObserverOnGlobalLayoutListenerC4980eg = new ViewTreeObserverOnGlobalLayoutListenerC4980eg(this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC4980eg);
        c2234Rf.setOnDismissListener(new C5324fg(this, viewTreeObserverOnGlobalLayoutListenerC4980eg));
    }

    @Override // defpackage.InterfaceC6012hg
    public final void n(int i) {
        this.L = i;
    }
}
