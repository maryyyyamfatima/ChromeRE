package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ER3 {
    public final Toolbar a;
    public int b;
    public View c;
    public Drawable d;
    public Drawable e;
    public Drawable f;
    public boolean g;
    public CharSequence h;
    public CharSequence i;
    public CharSequence j;
    public Window.Callback k;
    public boolean l;
    public C4097c5 m;
    public int n;
    public Drawable o;

    public ER3(Toolbar toolbar, boolean z) {
        Drawable drawable;
        this.n = 0;
        this.a = toolbar;
        CharSequence charSequence = toolbar.C;
        this.h = charSequence;
        this.i = toolbar.D;
        this.g = charSequence != null;
        this.f = toolbar.p();
        IN3 m = IN3.m(toolbar.getContext(), null, JG2.a, R.attr.0_resource_name_obfuscated_res_0x7f050005);
        int i = 15;
        this.o = m.e(15);
        if (z) {
            CharSequence k = m.k(27);
            if (!TextUtils.isEmpty(k)) {
                this.g = true;
                this.h = k;
                if ((this.b & 8) != 0) {
                    toolbar.G(k);
                    if (this.g) {
                        Ec4.n(k, toolbar.getRootView());
                    }
                }
            }
            CharSequence k2 = m.k(25);
            if (!TextUtils.isEmpty(k2)) {
                this.i = k2;
                if ((this.b & 8) != 0) {
                    toolbar.E(k2);
                }
            }
            Drawable e = m.e(20);
            if (e != null) {
                this.e = e;
                c();
            }
            Drawable e2 = m.e(17);
            if (e2 != null) {
                this.d = e2;
                c();
            }
            if (this.f == null && (drawable = this.o) != null) {
                this.f = drawable;
                if ((this.b & 4) != 0) {
                    toolbar.C(drawable);
                } else {
                    toolbar.C(null);
                }
            }
            a(m.h(10, 0));
            int i2 = m.i(9, 0);
            if (i2 != 0) {
                View inflate = LayoutInflater.from(toolbar.getContext()).inflate(i2, (ViewGroup) toolbar, false);
                View view = this.c;
                if (view != null && (this.b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.c = inflate;
                if (inflate != null && (this.b & 16) != 0) {
                    toolbar.addView(inflate);
                }
                a(this.b | 16);
            }
            int layoutDimension = m.b.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int c = m.c(7, -1);
            int c2 = m.c(3, -1);
            if (c >= 0 || c2 >= 0) {
                int max = Math.max(c, 0);
                int max2 = Math.max(c2, 0);
                if (toolbar.y == null) {
                    toolbar.y = new C11426xR2();
                }
                toolbar.y.a(max, max2);
            }
            int i3 = m.i(28, 0);
            if (i3 != 0) {
                Context context = toolbar.getContext();
                toolbar.q = i3;
                C10475ug c10475ug = toolbar.g;
                if (c10475ug != null) {
                    c10475ug.setTextAppearance(context, i3);
                }
            }
            int i4 = m.i(26, 0);
            if (i4 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.r = i4;
                C10475ug c10475ug2 = toolbar.h;
                if (c10475ug2 != null) {
                    c10475ug2.setTextAppearance(context2, i4);
                }
            }
            int i5 = m.i(22, 0);
            if (i5 != 0 && toolbar.p != i5) {
                toolbar.p = i5;
                if (i5 == 0) {
                    toolbar.o = toolbar.getContext();
                } else {
                    toolbar.o = new ContextThemeWrapper(toolbar.getContext(), i5);
                }
            }
        } else {
            if (toolbar.p() != null) {
                this.o = toolbar.p();
            } else {
                i = 11;
            }
            this.b = i;
        }
        m.n();
        if (R.string.0_resource_name_obfuscated_res_0x7f140101 != this.n) {
            this.n = R.string.0_resource_name_obfuscated_res_0x7f140101;
            C1844Of c1844Of = toolbar.i;
            if (TextUtils.isEmpty(c1844Of != null ? c1844Of.getContentDescription() : null)) {
                b(this.n);
            }
        }
        C1844Of c1844Of2 = toolbar.i;
        this.j = c1844Of2 != null ? c1844Of2.getContentDescription() : null;
        toolbar.D(new CR3(this));
    }

    public final void b(int i) {
        Toolbar toolbar = this.a;
        String string = i == 0 ? null : toolbar.getContext().getString(i);
        this.j = string;
        if ((this.b & 4) != 0) {
            if (TextUtils.isEmpty(string)) {
                toolbar.A(this.n);
            } else {
                toolbar.B(this.j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i = this.b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.e;
            if (drawable == null) {
                drawable = this.d;
            }
        } else {
            drawable = this.d;
        }
        this.a.z(drawable);
    }

    public final void a(int i) {
        View view;
        int i2 = this.b ^ i;
        this.b = i;
        if (i2 != 0) {
            int i3 = i2 & 4;
            Toolbar toolbar = this.a;
            if (i3 != 0) {
                if ((i & 4) != 0 && (i & 4) != 0) {
                    if (TextUtils.isEmpty(this.j)) {
                        toolbar.A(this.n);
                    } else {
                        toolbar.B(this.j);
                    }
                }
                if ((this.b & 4) != 0) {
                    Drawable drawable = this.f;
                    if (drawable == null) {
                        drawable = this.o;
                    }
                    toolbar.C(drawable);
                } else {
                    toolbar.C(null);
                }
            }
            if ((i2 & 3) != 0) {
                c();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    toolbar.G(this.h);
                    toolbar.E(this.i);
                } else {
                    toolbar.G(null);
                    toolbar.E(null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.c) == null) {
                return;
            }
            if ((i & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }
}
