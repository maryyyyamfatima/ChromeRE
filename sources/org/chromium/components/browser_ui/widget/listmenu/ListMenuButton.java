package org.chromium.components.browser_ui.widget.listmenu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.PopupWindow;
import com.android.chrome.R;
import defpackage.C12157za2;
import defpackage.JG2;
import defpackage.R8;
import defpackage.T8;
import defpackage.TC1;
import defpackage.XC1;
import defpackage.ZC1;
import java.util.Iterator;
import org.chromium.components.browser_ui.widget.listmenu.ListMenuButton;
import org.chromium.ui.widget.ChromeImageButton;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ListMenuButton extends ChromeImageButton implements R8 {
    public static final /* synthetic */ int r = 0;
    public final boolean i;
    public final boolean j;
    public int k;
    public T8 l;
    public ZC1 m;
    public final C12157za2 n;
    public boolean o;
    public final boolean p;
    public boolean q;

    public ListMenuButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.n = new C12157za2();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, JG2.c0);
        this.k = obtainStyledAttributes.getDimensionPixelSize(1, getResources().getDimensionPixelSize(R.dimen.f34810_resource_name_obfuscated_res_0x7f0803b9));
        this.j = obtainStyledAttributes.getBoolean(0, true);
        this.i = obtainStyledAttributes.getBoolean(3, true);
        this.p = obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.recycle();
    }

    public final void e(ZC1 zc1, boolean z) {
        d();
        this.m = zc1;
        if (z) {
            setOnClickListener(new View.OnClickListener() { // from class: UC1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i = ListMenuButton.r;
                    ListMenuButton.this.f();
                }
            });
        }
    }

    public final void d() {
        T8 t8 = this.l;
        if (t8 != null) {
            t8.b();
        }
    }

    public final void f() {
        if (this.q) {
            d();
            ZC1 zc1 = this.m;
            if (zc1 == null) {
                throw new IllegalStateException("Delegate was not set.");
            }
            TC1 b = zc1.b();
            b.a(new Runnable() { // from class: VC1
                @Override // java.lang.Runnable
                public final void run() {
                    ListMenuButton.this.d();
                }
            });
            View c = b.c();
            ViewParent parent = c.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(c);
            }
            T8 t8 = new T8(getContext(), this, new ColorDrawable(0), c, this.m.a(this));
            this.l = t8;
            t8.x = this.i;
            t8.y = this.j;
            t8.s = this.k;
            if (this.o) {
                int paddingRight = c.getPaddingRight() + c.getPaddingLeft();
                this.l.t = b.b() + paddingRight;
            }
            this.l.k.setFocusable(true);
            T8 t82 = this.l;
            t82.q = this;
            t82.a(new PopupWindow.OnDismissListener() { // from class: WC1
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    ListMenuButton listMenuButton = ListMenuButton.this;
                    listMenuButton.l = null;
                    Iterator it = listMenuButton.n.a.iterator();
                    while (it.hasNext()) {
                        ((XC1) it.next()).b();
                    }
                }
            });
            this.l.k.setOutsideTouchable(true);
            this.l.e();
            Iterator it = this.n.a.iterator();
            while (it.hasNext()) {
                ((XC1) it.next()).a();
            }
        }
    }

    @Override // defpackage.R8
    public final void c(boolean z, int i, int i2, Rect rect) {
        if (this.p) {
            this.l.d(z ? R.style.f96280_resource_name_obfuscated_res_0x7f1501c2 : R.style.f96290_resource_name_obfuscated_res_0x7f1501c3);
        } else {
            this.l.d(z ? R.style.f98970_resource_name_obfuscated_res_0x7f1502d5 : R.style.f98980_resource_name_obfuscated_res_0x7f1502d6);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        if (TextUtils.isEmpty(getContentDescription())) {
            if (TextUtils.isEmpty("")) {
                setContentDescription(getContext().getResources().getString(R.string.f66670_resource_name_obfuscated_res_0x7f14018d));
            } else {
                setContentDescription(getContext().getResources().getString(R.string.f65930_resource_name_obfuscated_res_0x7f14013d, ""));
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.q = true;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        d();
        this.q = false;
        super.onDetachedFromWindow();
    }
}
