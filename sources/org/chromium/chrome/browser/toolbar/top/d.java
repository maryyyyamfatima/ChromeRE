package org.chromium.chrome.browser.toolbar.top;

import J.N;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.chrome.R;
import defpackage.AbstractC10957w33;
import defpackage.AbstractC3494aK3;
import defpackage.AbstractC3899bX;
import defpackage.C0170Bi;
import defpackage.C10226tv3;
import defpackage.C12157za2;
import defpackage.C3799bD;
import defpackage.C3814bG;
import defpackage.C6621jR3;
import defpackage.C7299lP3;
import defpackage.C7928nE;
import defpackage.C8385oa2;
import defpackage.C8610pD;
import defpackage.EI2;
import defpackage.FI2;
import defpackage.GP2;
import defpackage.GS3;
import defpackage.Ge4;
import defpackage.InterfaceC0079Ap3;
import defpackage.InterfaceC4216cR3;
import defpackage.InterfaceC5925hP3;
import defpackage.InterfaceC7913nB;
import defpackage.InterfaceViewOnTouchListenerC0040Ai;
import defpackage.KH;
import defpackage.KP3;
import defpackage.KU3;
import defpackage.LS1;
import defpackage.LS3;
import defpackage.PJ3;
import defpackage.QJ3;
import defpackage.QQ3;
import defpackage.RJ3;
import defpackage.RunnableC8183ny1;
import defpackage.SF1;
import defpackage.UN;
import defpackage.VQ;
import defpackage.ViewOnClickListenerC0671Fe0;
import defpackage.ViewOnLayoutChangeListenerC6955kP3;
import defpackage.Y50;
import org.chromium.base.Callback;
import org.chromium.base.TraceEvent;
import org.chromium.chrome.browser.omnibox.g;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.toolbar.HomeButton;
import org.chromium.chrome.browser.toolbar.LocationBarModel;
import org.chromium.chrome.browser.toolbar.top.d;
import org.chromium.content_public.browser.LoadUrlParams;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public abstract class d extends FrameLayout implements QJ3, PJ3 {
    public Callback a;
    public final C12157za2 g;
    public final int[] h;
    public final ColorStateList i;
    public InterfaceC5925hP3 j;
    public InterfaceC4216cR3 k;
    public QQ3 l;
    public InterfaceC7913nB m;
    public boolean n;
    public boolean o;
    public long p;
    public boolean q;
    public RJ3 r;
    public LS1 s;
    public InterfaceViewOnTouchListenerC0040Ai t;
    public GS3 u;

    public void A() {
    }

    public void B() {
    }

    public void C() {
    }

    public void F(VQ vq) {
    }

    public void G(C3799bD c3799bD) {
    }

    public void H(Drawable drawable) {
    }

    public void I() {
    }

    public void J(ViewOnClickListenerC0671Fe0 viewOnClickListenerC0671Fe0) {
    }

    public boolean K(boolean z) {
        return false;
    }

    public void L(RunnableC8183ny1 runnableC8183ny1) {
    }

    public void M(org.chromium.chrome.browser.omnibox.a aVar) {
    }

    public void N(View.OnClickListener onClickListener) {
    }

    public void O(View.OnLongClickListener onLongClickListener) {
    }

    public void P(C10226tv3 c10226tv3) {
    }

    public void Q(boolean z, boolean z2, boolean z3, LS1 ls1) {
    }

    public void R(boolean z) {
    }

    public void T(boolean z) {
    }

    public void V(boolean z) {
    }

    public void W(boolean z, boolean z2) {
    }

    public void X() {
    }

    public void Y(int i, Drawable drawable, String str) {
    }

    public void Z(boolean z) {
    }

    public void a0(C8610pD c8610pD) {
    }

    public void b(int i, boolean z) {
    }

    public void b0(boolean z) {
    }

    public void c(int i, ColorStateList colorStateList) {
    }

    public void d(Drawable drawable, String str, View.OnClickListener onClickListener) {
    }

    public void f() {
    }

    public HomeButton g() {
        return null;
    }

    public abstract SF1 h();

    public void m() {
    }

    public void r(boolean z) {
    }

    public void s() {
    }

    public void t(boolean z) {
    }

    public void u() {
    }

    public void w() {
    }

    public void x(boolean z) {
    }

    public void y(boolean z, boolean z2) {
    }

    public void z() {
    }

    public C3814bG p() {
        return new C3814bG(0, 0, 0, true);
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = new C12157za2();
        this.h = new int[2];
        this.i = Y50.b(getContext(), R.color.0_resource_name_obfuscated_res_0x7f070118);
        addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC6955kP3(this));
    }

    public void n(LocationBarModel locationBarModel, C6621jR3 c6621jR3, LS1 ls1, C8385oa2 c8385oa2, KH kh, KP3 kp3, KH kh2) {
        this.j = locationBarModel;
        this.k = c6621jR3;
        this.s = ls1;
        this.m = kp3;
        this.l = new QQ3(getContext(), getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080808), this, c8385oa2);
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        GS3 gs3 = this.u;
        if (gs3 != null) {
            boolean z = i == 0;
            LS3 ls3 = gs3.h;
            ls3.k = z;
            ls3.b();
        }
    }

    public void e() {
        RJ3 rj3 = this.r;
        if (rj3 != null) {
            rj3.j.d(this);
            this.r.i.d(this);
            this.r = null;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.j = new C7299lP3();
    }

    public void v() {
        this.n = true;
        if (this.l.getParent() != null) {
            this.l.e();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        post(new Runnable() { // from class: jP3
            @Override // java.lang.Runnable
            public final void run() {
                d dVar = d.this;
                ViewGroup viewGroup = (ViewGroup) dVar.getRootView().findViewById(R.id.control_container);
                AbstractC8540p04.f(viewGroup, dVar.l, (View) dVar.getParent(), true);
                dVar.l.o = viewGroup;
            }
        });
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.p == 0) {
            this.p = SystemClock.elapsedRealtime();
        }
    }

    public void l(boolean z) {
        this.q = z;
    }

    public int j() {
        return getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0807b5);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        TraceEvent i = TraceEvent.i("ToolbarLayout.draw", null);
        try {
            super.draw(canvas);
            if (i != null) {
                i.close();
            }
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TraceEvent i5 = TraceEvent.i("ToolbarLayout.onLayout", null);
        try {
            super.onLayout(z, i, i2, i3, i4);
            if (i5 != null) {
                i5.close();
            }
        } catch (Throwable th) {
            if (i5 != null) {
                try {
                    i5.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        TraceEvent i3 = TraceEvent.i("ToolbarLayout.onMeasure", null);
        try {
            super.onMeasure(i, i2);
            if (i3 != null) {
                i3.close();
            }
        } catch (Throwable th) {
            if (i3 != null) {
                try {
                    i3.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int actionMasked;
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getToolType(0) == 3 && ((actionMasked = motionEvent.getActionMasked()) == 11 || actionMasked == 12)) {
            return true;
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    public void i(Rect rect) {
        View d = h().d();
        rect.set(d.getPaddingLeft(), d.getPaddingTop(), d.getWidth() - d.getPaddingRight(), d.getHeight() - d.getPaddingBottom());
        View d2 = h().d();
        int[] iArr = this.h;
        Ge4.c(this, d2, iArr);
        rect.offset(iArr[0], iArr[1]);
    }

    public boolean U() {
        if (this.o || this.q) {
            return true;
        }
        InterfaceViewOnTouchListenerC0040Ai interfaceViewOnTouchListenerC0040Ai = this.t;
        if (interfaceViewOnTouchListenerC0040Ai != null) {
            C0170Bi c0170Bi = (C0170Bi) interfaceViewOnTouchListenerC0040Ai;
            if (c0170Bi.h || c0170Bi.a.b()) {
                return true;
            }
        }
        return false;
    }

    public void D(boolean z) {
        this.o = z;
    }

    public final boolean o() {
        return this.j.isIncognito();
    }

    public final void E() {
        KU3 ku3;
        Profile b;
        q();
        InterfaceC4216cR3 interfaceC4216cR3 = this.k;
        if (interfaceC4216cR3 != null) {
            C6621jR3 c6621jR3 = (C6621jR3) interfaceC4216cR3;
            FI2.a("Home");
            InterfaceC0079Ap3 interfaceC0079Ap3 = c6621jR3.a;
            Tab tab = (Tab) interfaceC0079Ap3.get();
            if (tab != null && (b = Profile.b(tab.b())) != null) {
                EI2.h(Profile.c(b), 6, "Android.HomeButton.PerProfileType");
            }
            boolean booleanValue = ((Boolean) c6621jR3.g.get()).booleanValue();
            InterfaceC0079Ap3 interfaceC0079Ap32 = c6621jR3.h;
            if (booleanValue) {
                C7928nE c7928nE = UN.a;
                if (!N.M09VlOh_("ToolbarIphAndroid") || (ku3 = (KU3) interfaceC0079Ap32.get()) == null) {
                    return;
                }
                ku3.notifyEvent("homepage_button_clicked");
                return;
            }
            Tab tab2 = (Tab) interfaceC0079Ap3.get();
            if (tab2 == null) {
                return;
            }
            String str = (String) c6621jR3.j.get();
            boolean z = str.startsWith("about:") || str.startsWith("chrome:") || str.startsWith("chrome-native:");
            EI2.b("Navigation.Home.IsChromeInternal", z);
            if (!z) {
                FI2.a("Navigation.Home.NotChromeInternal");
            }
            Tab tab3 = (Tab) interfaceC0079Ap3.get();
            KU3 ku32 = (KU3) interfaceC0079Ap32.get();
            if (tab3 != null && ku32 != null) {
                ku32.notifyEvent("homepage_button_clicked");
            }
            tab2.d(new LoadUrlParams(str, 67108864));
        }
    }

    public final void q() {
        if (h() == null || h().j() == null) {
            return;
        }
        ((g) h().j()).Z(null, 12, false);
    }

    public final void S(int i) {
        ((ImageView) getRootView().findViewById(R.id.toolbar_hairline)).setImageTintList(ColorStateList.valueOf(k(i)));
    }

    public final int k(int i) {
        Context context = getContext();
        boolean o = o();
        Resources resources = context.getResources();
        if (!AbstractC3494aK3.e(i, context, o)) {
            return AbstractC3899bX.a(i, resources.getColor(R.color.0_resource_name_obfuscated_res_0x7f0708ac) & (-16777216), GP2.a(R.dimen.0_resource_name_obfuscated_res_0x7f080802, resources), false);
        }
        if (o) {
            return resources.getColor(R.color.0_resource_name_obfuscated_res_0x7f07018a);
        }
        return AbstractC10957w33.f(context);
    }
}
