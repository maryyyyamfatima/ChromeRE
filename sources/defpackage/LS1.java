package defpackage;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.res.ColorStateList;
import java.util.HashMap;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.toolbar.menu_button.MenuButton;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class LS1 {
    public final Activity a;
    public final PropertyModel b;
    public QS1 c;
    public InterfaceViewOnTouchListenerC0040Ai d;
    public MenuButton e;
    public UD2 f;

    /* JADX WARN: Type inference failed for: r4v5, types: [IS1] */
    public LS1(C0538Ed2 c0538Ed2, C3799bD c3799bD, C10285u6 c10285u6, KS1 ks1, DP3 dp3, boolean z, InterfaceC0079Ap3 interfaceC0079Ap3, RJ3 rj3, TP3 tp3, UP3 up3, int i) {
        Activity activity = (Activity) c10285u6.k().get();
        this.a = activity;
        this.e = (MenuButton) activity.findViewById(i);
        HashMap e = PropertyModel.e(TS1.k);
        PD2 pd2 = TS1.h;
        RS1 rs1 = new RS1(false, false);
        GD2 gd2 = new GD2();
        gd2.a = rs1;
        e.put(pd2, gd2);
        PD2 pd22 = TS1.i;
        ColorStateList colorStateList = rj3.h;
        Integer num = rj3.g;
        SS1 ss1 = new SS1(num != null ? num.intValue() : 3, colorStateList);
        GD2 gd22 = new GD2();
        gd22.a = ss1;
        e.put(pd22, gd22);
        LD2 ld2 = TS1.f;
        AD2 ad2 = new AD2();
        ad2.a = true;
        e.put(ld2, ad2);
        PD2 pd23 = TS1.g;
        GD2 gd23 = new GD2();
        gd23.a = tp3;
        PropertyModel a = AbstractC5266fV2.a(e, pd23, gd23, e);
        this.b = a;
        QS1 qs1 = new QS1(a, z, new InterfaceC0079Ap3() { // from class: IS1
            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                Activity activity2 = LS1.this.a;
                return Boolean.valueOf(activity2.isFinishing() || activity2.isDestroyed());
            }
        }, dp3, rj3, interfaceC0079Ap3, c3799bD, ks1, c0538Ed2, c10285u6, tp3, up3);
        this.c = qs1;
        qs1.c.m(new Callback() { // from class: JS1
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                LS1.this.d = (InterfaceViewOnTouchListenerC0040Ai) obj;
            }
        });
        MenuButton menuButton = this.e;
        if (menuButton != null) {
            this.f = UD2.a(a, menuButton, new VS1());
        }
    }

    public final void a() {
        QS1 qs1 = this.c;
        if (qs1 != null) {
            if (qs1.b != null) {
                qs1.d.i.remove(qs1);
                qs1.b = null;
            }
            this.c = null;
        }
        UD2 ud2 = this.f;
        if (ud2 != null) {
            ud2.b();
            this.f = null;
        }
        this.e = null;
        this.d = null;
    }

    public final void c(boolean z) {
        QS1 qs1 = this.c;
        if (qs1 == null) {
            return;
        }
        qs1.p = z;
        if (z) {
            qs1.a(false);
            return;
        }
        if ((qs1.r.get() != null) && qs1.k) {
            qs1.b(false);
        }
    }

    public final void d(boolean z) {
        QS1 qs1 = this.c;
        if (qs1 == null) {
            return;
        }
        qs1.g.k(TS1.f, z);
    }

    public final AnimatorSet b(boolean z) {
        float f;
        QS1 qs1 = this.c;
        MenuButton menuButton = this.e;
        boolean z2 = menuButton != null && menuButton.getLayoutDirection() == 1;
        float f2 = 0.0f;
        if (!z) {
            qs1.getClass();
            f = 1.0f;
        } else {
            float f3 = qs1.q.getDisplayMetrics().density;
            int i = qs1.t;
            if (z2) {
                i = -i;
            }
            float f4 = i * f3;
            f = 0.0f;
            f2 = f4;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        MD2 md2 = TS1.j;
        PropertyModel propertyModel = qs1.g;
        animatorSet.playTogether(RD2.a(propertyModel, md2, f2), RD2.a(propertyModel, TS1.a, f));
        return animatorSet;
    }
}
