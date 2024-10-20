package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import com.android.chrome.R;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zO3 */
/* loaded from: classes.dex */
public final class C12098zO3 implements InterfaceC12121zT1 {
    public BS1 a;
    public C6287iT1 g;
    public final /* synthetic */ Toolbar h;

    @Override // defpackage.InterfaceC12121zT1
    public final void c(BS1 bs1, boolean z) {
    }

    @Override // defpackage.InterfaceC12121zT1
    public final boolean e(SubMenuC0074Ao3 subMenuC0074Ao3) {
        return false;
    }

    @Override // defpackage.InterfaceC12121zT1
    public final boolean f() {
        return false;
    }

    @Override // defpackage.InterfaceC12121zT1
    public final boolean i(C6287iT1 c6287iT1) {
        Toolbar toolbar = this.h;
        C1844Of c1844Of = toolbar.m;
        int i = toolbar.s;
        if (c1844Of == null) {
            C1844Of c1844Of2 = new C1844Of(toolbar.getContext(), null, R.attr.0_resource_name_obfuscated_res_0x7f0504e8);
            toolbar.m = c1844Of2;
            c1844Of2.setImageDrawable(toolbar.k);
            toolbar.m.setContentDescription(toolbar.l);
            AO3 ao3 = new AO3();
            ao3.a = (i & 112) | 8388611;
            ao3.b = 2;
            toolbar.m.setLayoutParams(ao3);
            toolbar.m.setOnClickListener(new ViewOnClickListenerC11755yO3(toolbar));
        }
        ViewParent parent = toolbar.m.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.m);
            }
            toolbar.addView(toolbar.m);
        }
        View actionView = c6287iT1.getActionView();
        toolbar.n = actionView;
        this.g = c6287iT1;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.n);
            }
            AO3 ao32 = new AO3();
            ao32.a = (i & 112) | 8388611;
            ao32.b = 2;
            toolbar.n.setLayoutParams(ao32);
            toolbar.addView(toolbar.n);
        }
        int childCount = toolbar.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            View childAt = toolbar.getChildAt(childCount);
            if (((AO3) childAt.getLayoutParams()).b != 2 && childAt != toolbar.a) {
                toolbar.removeViewAt(childCount);
                toolbar.f11483J.add(childAt);
            }
        }
        toolbar.requestLayout();
        c6287iT1.C = true;
        c6287iT1.n.p(false);
        KeyEvent.Callback callback = toolbar.n;
        if (callback instanceof OV) {
            ((OV) callback).onActionViewExpanded();
        }
        return true;
    }

    public C12098zO3(Toolbar toolbar) {
        this.h = toolbar;
    }

    @Override // defpackage.InterfaceC12121zT1
    public final void k(Context context, BS1 bs1) {
        C6287iT1 c6287iT1;
        BS1 bs12 = this.a;
        if (bs12 != null && (c6287iT1 = this.g) != null) {
            bs12.d(c6287iT1);
        }
        this.a = bs1;
    }

    @Override // defpackage.InterfaceC12121zT1
    public final void j() {
        if (this.g != null) {
            BS1 bs1 = this.a;
            boolean z = false;
            if (bs1 != null) {
                int size = bs1.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    if (this.a.getItem(i) == this.g) {
                        z = true;
                        break;
                    }
                    i++;
                }
            }
            if (z) {
                return;
            }
            g(this.g);
        }
    }

    @Override // defpackage.InterfaceC12121zT1
    public final boolean g(C6287iT1 c6287iT1) {
        Toolbar toolbar = this.h;
        KeyEvent.Callback callback = toolbar.n;
        if (callback instanceof OV) {
            ((OV) callback).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.n);
        toolbar.removeView(toolbar.m);
        toolbar.n = null;
        ArrayList arrayList = toolbar.f11483J;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                toolbar.addView((View) arrayList.get(size));
            } else {
                arrayList.clear();
                this.g = null;
                toolbar.requestLayout();
                c6287iT1.C = false;
                c6287iT1.n.p(false);
                return true;
            }
        }
    }
}
