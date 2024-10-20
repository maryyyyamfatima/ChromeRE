package org.chromium.chrome.browser.toolbar.top;

import J.N;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Property;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.AQ3;
import defpackage.AbstractC10957w33;
import defpackage.AbstractC11495xe2;
import defpackage.AbstractC11746yN;
import defpackage.AbstractC2277Rn2;
import defpackage.AbstractC3494aK3;
import defpackage.AbstractC3899bX;
import defpackage.AbstractC4242cX;
import defpackage.AbstractC5647gc2;
import defpackage.AbstractC8142nr1;
import defpackage.BQ3;
import defpackage.BS3;
import defpackage.C10226tv3;
import defpackage.C1096Il0;
import defpackage.C11422xQ3;
import defpackage.C11765yQ3;
import defpackage.C11814ya2;
import defpackage.C2913Wk3;
import defpackage.C3799bD;
import defpackage.C3814bG;
import defpackage.C7928nE;
import defpackage.C8267oD;
import defpackage.C8609pC3;
import defpackage.C8610pD;
import defpackage.DQ3;
import defpackage.EQ3;
import defpackage.FQ3;
import defpackage.GQ3;
import defpackage.Ge4;
import defpackage.HQ3;
import defpackage.IQ3;
import defpackage.InterfaceC11299x32;
import defpackage.InterfaceC5925hP3;
import defpackage.InterfaceC9883sv3;
import defpackage.InterpolatorC0485Dt;
import defpackage.JQ3;
import defpackage.KQ3;
import defpackage.LS1;
import defpackage.LU3;
import defpackage.ND2;
import defpackage.PD2;
import defpackage.Q44;
import defpackage.QZ2;
import defpackage.RJ3;
import defpackage.RS1;
import defpackage.RunnableC12108zQ3;
import defpackage.RunnableC8183ny1;
import defpackage.SF1;
import defpackage.T34;
import defpackage.TS1;
import defpackage.UN;
import defpackage.VQ3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import org.chromium.base.Callback;
import org.chromium.base.TraceEvent;
import org.chromium.chrome.browser.omnibox.status.StatusView;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.toolbar.HomeButton;
import org.chromium.chrome.browser.toolbar.menu_button.MenuButton;
import org.chromium.chrome.browser.toolbar.top.ToolbarPhone;
import org.chromium.ui.base.LocalizationUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ToolbarPhone extends d implements View.OnClickListener, InterfaceC9883sv3 {
    public static final /* synthetic */ int L0 = 0;
    public TextView A;
    public C8610pD A0;
    public View B;
    public int B0;
    public ImageView C;
    public float C0;
    public org.chromium.chrome.browser.toolbar.optional_button.b D;
    public int D0;
    public boolean E;
    public int E0;
    public ObjectAnimator F;
    public boolean F0;
    public ObjectAnimator G;
    public int G0;
    public int H;
    public float H0;
    public boolean I;
    public boolean I0;

    /* renamed from: J */
    public boolean f11531J;
    public final BQ3 J0;
    public C3799bD K;
    public final DQ3 K0;
    public int L;
    public boolean M;
    public boolean N;
    public C8609pC3 O;
    public float P;
    public Rect Q;
    public boolean R;
    public float S;
    public float T;
    public AnimatorSet U;
    public boolean V;
    public boolean W;
    public boolean a0;
    public int b0;
    public int c0;
    public boolean d0;
    public int e0;
    public float f0;
    public float g0;
    public ColorDrawable h0;
    public Drawable i0;
    public Drawable j0;
    public boolean k0;
    public final Rect l0;
    public final Rect m0;
    public final Rect n0;
    public float o0;
    public float p0;
    public final Rect q0;
    public final Point r0;
    public final int s0;
    public ValueAnimator t0;
    public boolean u0;
    public C10226tv3 v;
    public boolean v0;
    public org.chromium.chrome.browser.omnibox.a w;
    public Runnable w0;
    public ViewGroup x;
    public int x0;
    public ToggleTabStackButton y;
    public int y0;
    public HomeButton z;
    public VQ3 z0;

    public ToolbarPhone(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.L = -1;
        this.e0 = 255;
        this.f0 = -1.0f;
        this.g0 = -1.0f;
        this.l0 = new Rect();
        this.m0 = new Rect();
        this.n0 = new Rect();
        this.q0 = new Rect();
        this.r0 = new Point();
        this.B0 = 0;
        this.C0 = 1.0f;
        this.J0 = new BQ3(this);
        this.K0 = new DQ3(this);
        new EQ3(this);
        this.s0 = getResources().getDimensionPixelOffset(R.dimen.0_resource_name_obfuscated_res_0x7f080800);
    }

    public final void u0() {
        this.l.setVisibility((this.H != 0 || this.j.g()) ? 4 : 0);
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final void M(org.chromium.chrome.browser.omnibox.a aVar) {
        this.w = aVar;
        this.x0 = getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0803cb);
        Context context = getContext();
        Drawable drawable = context.getDrawable(R.drawable.0_resource_name_obfuscated_res_0x7f09039a);
        drawable.mutate();
        drawable.setColorFilter(AbstractC11746yN.c(context, R.dimen.0_resource_name_obfuscated_res_0x7f080811), PorterDuff.Mode.SRC_IN);
        this.i0 = drawable;
        this.j0 = drawable;
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final void G(C3799bD c3799bD) {
        this.K = c3799bD;
    }

    public final void d0(Canvas canvas, float f) {
        if (this.n) {
            float f2 = 1.0f - f;
            int i = (int) (255.0f * f2);
            canvas.save();
            Rect rect = this.m0;
            canvas.translate(0.0f, (-f) * rect.height());
            canvas.clipRect(rect);
            if (this.z.getVisibility() != 8) {
                float alpha = this.z.getAlpha();
                this.z.setAlpha(alpha * f2);
                drawChild(canvas, this.z, SystemClock.uptimeMillis());
                this.z.setAlpha(alpha);
            }
            float alpha2 = ((org.chromium.chrome.browser.omnibox.b) this.w.g).a.getAlpha();
            ((org.chromium.chrome.browser.omnibox.b) this.w.g).a.setAlpha(f2 * alpha2);
            boolean z = false;
            if (((org.chromium.chrome.browser.omnibox.b) this.w.g).a.getAlpha() != 0.0f) {
                if (!l0() || this.T > 0.0f) {
                    c0(canvas, SystemClock.uptimeMillis());
                }
            }
            ((org.chromium.chrome.browser.omnibox.b) this.w.g).a.setAlpha(alpha2);
            Ge4.h(this, this.x, canvas);
            org.chromium.chrome.browser.toolbar.optional_button.b bVar = this.D;
            if (bVar != null && bVar.b.getVisibility() != 8) {
                canvas.save();
                Ge4.h(this.x, this.D.b, canvas);
                this.D.b.draw(canvas);
                canvas.restore();
            }
            if (this.O != null && this.y != null && this.T != 1.0f) {
                canvas.save();
                Ge4.h(this.x, this.y, canvas);
                canvas.translate(this.y.getPaddingLeft() + ((((this.y.getWidth() - this.y.getPaddingLeft()) - this.y.getPaddingRight()) - this.y.getDrawable().getIntrinsicWidth()) / 2), this.y.getPaddingTop() + ((((this.y.getHeight() - this.y.getPaddingTop()) - this.y.getPaddingBottom()) - this.y.getDrawable().getIntrinsicHeight()) / 2));
                this.O.setBounds(this.y.getDrawable().getBounds());
                this.O.setAlpha(i);
                this.O.draw(canvas);
                canvas.restore();
            }
            LS1 ls1 = this.s;
            if (ls1 != null) {
                ViewGroup viewGroup = this.x;
                canvas.save();
                Ge4.h(viewGroup, ls1.e, canvas);
                MenuButton menuButton = ls1.e;
                if (menuButton.p == null && menuButton.o == null) {
                    menuButton.a();
                }
                ImageView imageView = menuButton.g;
                if (imageView != null && imageView.getVisibility() == 0) {
                    z = true;
                }
                BitmapDrawable bitmapDrawable = z ? menuButton.p : menuButton.o;
                bitmapDrawable.setAlpha(i);
                bitmapDrawable.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final void Q(boolean z, boolean z2, boolean z3, LS1 ls1) {
        int i;
        int i2;
        if (this.j.c()) {
            return;
        }
        if (z && ((i2 = this.H) == 1 || i2 == 2)) {
            return;
        }
        if (z || !((i = this.H) == 0 || i == 3)) {
            this.H = z ? 2 : 3;
            requestLayout();
            this.w.t(false);
            f();
            this.N = z3;
            DQ3 dq3 = this.K0;
            if (z) {
                AnimatorSet animatorSet = this.U;
                if (animatorSet != null && animatorSet.isRunning()) {
                    this.U.end();
                    this.U = null;
                    int measuredWidth = getMeasuredWidth();
                    TraceEvent.b("ToolbarPhone.layoutLocationBar", null);
                    if (m0(measuredWidth)) {
                        q0();
                    }
                    TraceEvent.c("ToolbarPhone.layoutLocationBar");
                    if (!this.I0) {
                        y0();
                    }
                }
                A0();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, dq3, 1.0f);
                ofFloat.setDuration(200L);
                ofFloat.setInterpolator(AbstractC8142nr1.f);
                this.F = ofFloat;
            } else if (!z3) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, dq3, 0.0f);
                ofFloat2.setDuration(z2 ? 200L : 100L);
                ofFloat2.setInterpolator(AbstractC8142nr1.f);
                ofFloat2.addListener(new HQ3(this));
                this.F = ofFloat2;
            }
            float min = this.H == 0 ? Math.min(this.r0.y, 0) : 0;
            this.x.setTranslationY(min);
            this.z.setTranslationY(min);
            this.M = z2;
            ObjectAnimator objectAnimator = this.F;
            if (objectAnimator != null) {
                objectAnimator.start();
            }
            if (C1096Il0.a(getContext())) {
                f();
            }
            postInvalidateOnAnimation();
        }
    }

    public final boolean l0() {
        return this.j.j().i();
    }

    public final void s0() {
        InterfaceC11299x32 j = this.j.j();
        boolean e = j.e();
        float f = this.f0;
        n0();
        j.g(new Callback() { // from class: tQ3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                float floatValue = ((Float) obj).floatValue();
                ToolbarPhone toolbarPhone = ToolbarPhone.this;
                toolbarPhone.f0 = floatValue;
                toolbarPhone.z0();
                toolbarPhone.y0();
            }
        });
        if (j.i()) {
            if (Build.VERSION.SDK_INT >= 28) {
                KQ3 kq3 = new KQ3(getContext(), this);
                j.f(kq3);
                this.j0 = kq3;
            }
            requestLayout();
            return;
        }
        if (e) {
            if (this.H == 0 && f > 0.0f) {
                this.S = Math.max(f, this.S);
                o0(false);
            }
            requestLayout();
        }
    }

    public final void r0(int i) {
        if (this.y0 == i) {
            return;
        }
        this.y0 = i;
        this.i0.setColorFilter(i, PorterDuff.Mode.SRC_IN);
        org.chromium.chrome.browser.toolbar.optional_button.b bVar = this.D;
        if (bVar != null) {
            bVar.a.a.m(AbstractC11495xe2.h, i);
        }
    }

    public final int h0(int i) {
        return AbstractC3494aK3.b(i, getContext(), o());
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final void v() {
        super.v();
        C7928nE c7928nE = UN.a;
        this.I0 = N.M09VlOh_("ToolbarPhoneOptimizations");
        this.y.setOnKeyListener(new FQ3(this));
        this.z.setOnClickListener(this);
        LS1 ls1 = this.s;
        GQ3 gq3 = new GQ3(this);
        MenuButton menuButton = ls1.e;
        if (menuButton != null) {
            menuButton.setOnKeyListener(gq3);
        }
        B0();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f = this.f0;
        if (f == 0.0f || f == 1.0f || f == -1.0f) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.r0.y < 0 && ((org.chromium.chrome.browser.omnibox.b) this.w.g).a.getTranslationY() > 0.0f) {
            return this.j.j().dispatchTouchEvent(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.chromium.chrome.browser.omnibox.a aVar = this.w;
        if ((aVar == null || !((org.chromium.chrome.browser.omnibox.b) aVar.g).a.hasFocus()) && this.z == view) {
            E();
            if (this.n && this.m.a()) {
                LU3.a(this.j.b()).notifyEvent("partner_home_page_button_pressed");
            }
        }
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean m0;
        if (!this.V) {
            super.onMeasure(i, i2);
            if (this.I0) {
                m0 = m0(View.MeasureSpec.getSize(i));
                y0();
            } else {
                int size = View.MeasureSpec.getSize(i);
                TraceEvent.b("ToolbarPhone.layoutLocationBar", null);
                m0 = m0(size);
                if (m0) {
                    q0();
                }
                TraceEvent.c("ToolbarPhone.layoutLocationBar");
                if (!(this.H != 0)) {
                    y0();
                }
            }
            if (!m0) {
                return;
            }
        } else {
            x0();
        }
        super.onMeasure(i, i2);
    }

    public final boolean x0() {
        int j0 = j0(this.B0);
        int k0 = k0(this.B0);
        this.c0 = j0;
        int i = k0 - j0;
        if (this.b0 == i) {
            return false;
        }
        this.b0 = i;
        this.w.o.h.e(i);
        return true;
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d, android.view.View
    public final void onFinishInflate() {
        TraceEvent i = TraceEvent.i("ToolbarPhone.onFinishInflate", null);
        try {
            super.onFinishInflate();
            this.x = (ViewGroup) findViewById(R.id.toolbar_buttons);
            this.z = (HomeButton) findViewById(R.id.home_button);
            this.A = (TextView) findViewById(R.id.url_bar);
            this.B = findViewById(R.id.url_action_container);
            this.h0 = new ColorDrawable(i0(0));
            setLayoutTransition(null);
            LS1 ls1 = this.s;
            if (ls1 != null) {
                ls1.d(true);
            }
            ToggleTabStackButton toggleTabStackButton = (ToggleTabStackButton) findViewById(R.id.tab_switcher_button);
            this.y = toggleTabStackButton;
            toggleTabStackButton.setClickable(false);
            setWillNotDraw(false);
            this.G0 = getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080813);
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

    public final void o0(boolean z) {
        ImageView imageView;
        boolean z2 = this.o;
        TraceEvent.b("ToolbarPhone.triggerUrlFocusAnimation", null);
        AnimatorSet animatorSet = this.U;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.U.cancel();
            this.U = null;
        }
        if (this.F0) {
            this.D.a.a.k(AbstractC11495xe2.j, true);
        }
        ArrayList arrayList = new ArrayList();
        BQ3 bq3 = this.J0;
        if (z) {
            TraceEvent.b("ToolbarPhone.populateUrlFocusingAnimatorSet", null);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, bq3, 1.0f);
            ofFloat.setDuration(225L);
            InterpolatorC0485Dt interpolatorC0485Dt = InterpolatorC0485Dt.c;
            ofFloat.setInterpolator(interpolatorC0485Dt);
            arrayList.add(ofFloat);
            ((org.chromium.chrome.browser.omnibox.b) this.w.g).b(arrayList, 0L, 225L, 0.0f);
            float f = getContext().getResources().getDisplayMetrics().density;
            boolean z3 = getLayoutDirection() == 1;
            int i = this.G0;
            if (z3) {
                i = -i;
            }
            float f2 = i * f;
            AnimatorSet b = this.s.b(true);
            b.setDuration(100L);
            InterpolatorC0485Dt interpolatorC0485Dt2 = InterpolatorC0485Dt.d;
            b.setInterpolator(interpolatorC0485Dt2);
            arrayList.add(b);
            ToggleTabStackButton toggleTabStackButton = this.y;
            if (toggleTabStackButton != null) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(toggleTabStackButton, (Property<ToggleTabStackButton, Float>) FrameLayout.TRANSLATION_X, f2);
                ofFloat2.setDuration(100L);
                ofFloat2.setInterpolator(interpolatorC0485Dt2);
                arrayList.add(ofFloat2);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.y, (Property<ToggleTabStackButton, Float>) FrameLayout.ALPHA, 0.0f);
                ofFloat3.setDuration(100L);
                ofFloat3.setInterpolator(interpolatorC0485Dt2);
                arrayList.add(ofFloat3);
            }
            ImageView imageView2 = this.C;
            if (imageView2 != null) {
                Property property = FrameLayout.ALPHA;
                float[] fArr = new float[1];
                fArr[0] = this.o ? 0.0f : 1.0f;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, fArr);
                ofFloat4.setDuration(225L);
                ofFloat4.setInterpolator(interpolatorC0485Dt);
                arrayList.add(ofFloat4);
            }
            TraceEvent.c("ToolbarPhone.populateUrlFocusingAnimatorSet");
        } else {
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this, bq3, 0.0f);
            ofFloat5.setDuration(225L);
            InterpolatorC0485Dt interpolatorC0485Dt3 = InterpolatorC0485Dt.c;
            ofFloat5.setInterpolator(interpolatorC0485Dt3);
            arrayList.add(ofFloat5);
            AnimatorSet b2 = this.s.b(false);
            b2.setDuration(100L);
            b2.setInterpolator(InterpolatorC0485Dt.d);
            arrayList.add(b2);
            ToggleTabStackButton toggleTabStackButton2 = this.y;
            if (toggleTabStackButton2 != null) {
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(toggleTabStackButton2, (Property<ToggleTabStackButton, Float>) FrameLayout.TRANSLATION_X, 0.0f);
                ofFloat6.setDuration(100L);
                ofFloat6.setStartDelay(200L);
                ofFloat6.setInterpolator(interpolatorC0485Dt3);
                arrayList.add(ofFloat6);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.y, (Property<ToggleTabStackButton, Float>) FrameLayout.ALPHA, 1.0f);
                ofFloat7.setDuration(100L);
                ofFloat7.setStartDelay(200L);
                ofFloat7.setInterpolator(interpolatorC0485Dt3);
                arrayList.add(ofFloat7);
            }
            ((org.chromium.chrome.browser.omnibox.b) this.w.g).b(arrayList, 100L, 250L, 1.0f);
            if ((!l0() || this.f0 != 0.0f) && (imageView = this.C) != null) {
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) FrameLayout.ALPHA, 1.0f);
                ofFloat8.setDuration(225L);
                ofFloat8.setInterpolator(interpolatorC0485Dt3);
                arrayList.add(ofFloat8);
            }
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.U = animatorSet2;
        animatorSet2.playTogether(arrayList);
        this.R = true;
        this.U.addListener(new JQ3(this, z, z2));
        this.U.start();
        TraceEvent.c("ToolbarPhone.triggerUrlFocusAnimation");
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final void D(boolean z) {
        this.o = z;
        ToggleTabStackButton toggleTabStackButton = this.y;
        if (toggleTabStackButton != null) {
            toggleTabStackButton.setClickable(!z);
        }
        o0(z);
    }

    public final int j0(int i) {
        if (i == 3 && this.H == 0) {
            return this.s0;
        }
        if (getLayoutDirection() == 1) {
            return g0();
        }
        return f0();
    }

    public final int f0() {
        if (this.z.getVisibility() == 8) {
            if (!(this.j.g() && this.g0 != 1.0f)) {
                return this.s0;
            }
        }
        return this.z.getMeasuredWidth();
    }

    public final int k0(int i) {
        int measuredWidth;
        int g0;
        if (i == 3 && this.H == 0) {
            measuredWidth = getMeasuredWidth();
            g0 = this.s0;
        } else if (getLayoutDirection() == 1) {
            measuredWidth = getMeasuredWidth();
            g0 = f0();
        } else {
            measuredWidth = getMeasuredWidth();
            g0 = g0();
        }
        return measuredWidth - g0;
    }

    public final int g0() {
        float f = this.g0;
        int i = this.s0;
        if (f == 1.0f) {
            return i;
        }
        int measuredWidth = this.x.getMeasuredWidth();
        if (this.F0) {
            measuredWidth = this.x.getWidth();
        }
        return Math.max(i, measuredWidth);
    }

    public final void w0(int i) {
        if (this.h0.getColor() == i) {
            return;
        }
        this.h0.setColor(i);
        S(i);
        invalidate();
    }

    public final void B0() {
        Runnable runnable;
        HomeButton homeButton;
        TraceEvent.b("ToolbarPhone.updateVisualsForLocationBarState", null);
        int i = this.H;
        boolean z = i == 0 || i == 3;
        int i2 = l0() ? 3 : o() ? 1 : this.j.d() ? 2 : 0;
        if (i2 != 3 || (homeButton = this.z) == null) {
            this.z.setAccessibilityTraversalBefore(-1);
        } else {
            homeButton.setAccessibilityTraversalBefore(R.id.toolbar_buttons);
        }
        if (this.u0) {
            int i3 = this.B0;
            if (i3 == 0 || i3 == 2) {
                if (i2 == 0 || i2 == 2) {
                    TraceEvent.c("ToolbarPhone.updateVisualsForLocationBarState");
                    return;
                }
            }
        }
        ValueAnimator valueAnimator = this.t0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.t0.end();
        }
        boolean z2 = this.B0 != i2;
        int i4 = this.j.i();
        int i5 = this.j.i();
        InterfaceC5925hP3 interfaceC5925hP3 = this.j;
        if (interfaceC5925hP3 != null && interfaceC5925hP3.a() != null && this.j.a().isNativePage()) {
            i5 = i0(o() ? 1 : 0);
        }
        boolean z3 = z2;
        z3 = z2;
        if (this.B0 == 2 && !z2) {
            if ((!AbstractC3899bX.h(i4)) != this.d0) {
                z3 = true;
            } else {
                w0(i0(2));
                this.l.g(i5, o());
                z3 = z2;
            }
        }
        this.B0 = i2;
        if ((i2 == 2 || z3) && (runnable = this.w0) != null) {
            runnable.run();
        }
        v0();
        y0();
        if (this.H != 3) {
            w0(i0(this.B0));
        }
        if (!z3) {
            if (this.B0 == 3) {
                t0();
            } else {
                n0();
            }
            TraceEvent.c("ToolbarPhone.updateVisualsForLocationBarState");
            return;
        }
        this.d0 = false;
        this.e0 = 255;
        this.l.g(i5, o());
        if (o()) {
            this.e0 = 51;
        } else if (this.B0 == 2) {
            boolean z4 = !AbstractC3899bX.h(i4);
            this.d0 = z4;
            this.e0 = z4 ? 51 : 255;
        }
        r0(h0(i4));
        this.w.q();
        if (l0() && z) {
            t0();
        }
        this.s.d(true);
        TraceEvent.c("ToolbarPhone.updateVisualsForLocationBarState");
    }

    public final boolean c0(Canvas canvas, long j) {
        TraceEvent.b("ToolbarPhone.drawLocationBar", null);
        boolean z = false;
        if (this.i0 != null && (this.H == 0 || this.I)) {
            canvas.save();
            if ((((org.chromium.chrome.browser.omnibox.b) this.w.g).a.getAlpha() > 0.0f || this.k0) && !this.I) {
                z = true;
            }
            Rect rect = this.n0;
            Rect rect2 = this.l0;
            if (z) {
                Drawable drawable = this.j0;
                if (drawable instanceof KQ3) {
                    ((KQ3) drawable).l = true;
                }
                drawable.setBounds(rect2.left + rect.left, rect2.top + rect.top, rect2.right + rect.right, rect2.bottom + rect.bottom);
                this.j0.draw(canvas);
            }
            float f = rect2.left + rect.left;
            float f2 = rect2.right + rect.right;
            float f3 = rect2.top + rect.top;
            float f4 = rect2.bottom + rect.bottom;
            int paddingStart = ((org.chromium.chrome.browser.omnibox.b) this.w.g).a.getPaddingStart();
            int paddingEnd = ((org.chromium.chrome.browser.omnibox.b) this.w.g).a.getPaddingEnd();
            int layoutDirection = ((org.chromium.chrome.browser.omnibox.b) this.w.g).a.getLayoutDirection();
            if (this.T != 1.0f && !this.F0) {
                int j0 = this.c0 - j0(this.B0);
                int k0 = (k0(this.B0) - this.c0) - this.b0;
                float f5 = 1.0f - this.T;
                f += j0 * f5;
                f2 -= k0 * f5;
                if (layoutDirection == 1) {
                    f += paddingStart * f5;
                } else {
                    f2 -= paddingEnd * f5;
                }
            }
            if (this.F0) {
                if (layoutDirection == 1) {
                    f += paddingStart;
                } else {
                    f2 -= paddingEnd;
                }
            }
            QZ2 a = QZ2.a();
            boolean o = o();
            a.getClass();
            if ((!o) && l0() && this.o && this.R) {
                float f6 = paddingStart;
                if (layoutDirection == 1) {
                    f2 -= f6;
                } else {
                    f += f6;
                }
            }
            canvas.clipRect(f, f3, f2, f4);
            z = true;
        }
        boolean drawChild = super.drawChild(canvas, ((org.chromium.chrome.browser.omnibox.b) this.w.g).a, j);
        if (z) {
            canvas.restore();
        }
        TraceEvent.c("ToolbarPhone.drawLocationBar");
        return drawChild;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x01b0, code lost:            if (r13 != false) goto L398;     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b5, code lost:            r14 = -r14;     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01b3, code lost:            if (r13 != false) goto L398;     */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q0() {
        /*
            Method dump skipped, instructions count: 563
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.toolbar.top.ToolbarPhone.q0():void");
    }

    public final int i0(int i) {
        getResources();
        if (i == 0) {
            return AbstractC11746yN.a(getContext(), false);
        }
        if (i == 1) {
            return AbstractC11746yN.a(getContext(), true);
        }
        if (i == 2) {
            return this.j.i();
        }
        if (i != 3) {
            return AbstractC10957w33.a(getContext());
        }
        return AbstractC4242cX.g(AbstractC11746yN.a(getContext(), false), Math.round(this.T * 255.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z = false;
        if (!this.I && this.h0.getColor() != 0) {
            this.h0.setBounds(0, 0, getWidth(), getHeight());
            this.h0.draw(canvas);
        }
        if (this.i0 != null && (((org.chromium.chrome.browser.omnibox.b) this.w.g).a.getVisibility() == 0 || this.I)) {
            p0(this.B0, this.l0);
        }
        if (this.I) {
            d0(canvas, 0.0f);
            return;
        }
        ObjectAnimator objectAnimator = this.F;
        if (objectAnimator != null) {
            boolean z2 = !objectAnimator.isRunning();
            if (!this.M) {
                float f = this.P;
                setAlpha(f);
                if (z2) {
                    this.Q = null;
                } else if (this.Q == null) {
                    this.Q = new Rect();
                }
                Rect rect = this.Q;
                if (rect != null) {
                    rect.set(0, 0, getWidth(), (int) (getHeight() * f));
                }
            }
            z = z2;
        }
        super.dispatchDraw(canvas);
        if (this.F != null) {
            if (this.M) {
                d0(canvas, this.P);
            }
            if (z) {
                this.F = null;
            }
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.j0;
    }

    public final void y0() {
        if (this.H != 0) {
            return;
        }
        int i = (this.T == 1.0f || this.j.g()) ? 4 : 0;
        this.x.setVisibility(i);
        if (this.z.getVisibility() != 8) {
            this.z.setVisibility(i);
        }
        q0();
    }

    public final void p0(int i, Rect rect) {
        float f = (i == 3 && this.H == 0) ? 1.0f : this.T;
        float j0 = j0(i);
        int a = (int) AbstractC2277Rn2.a(this.s0, j0, f, j0);
        float f2 = (i == 3 && this.H == 0) ? 1.0f : this.T;
        float k0 = k0(i);
        rect.set(a, ((org.chromium.chrome.browser.omnibox.b) this.w.g).a.getTop() + this.x0, (int) AbstractC2277Rn2.a(getWidth() - r4, k0, f2, k0), ((org.chromium.chrome.browser.omnibox.b) this.w.g).a.getBottom() - this.x0);
    }

    public final void z0() {
        this.T = Math.max(Math.max(this.f0, this.g0), this.S);
        Iterator it = this.g.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            }
            C2913Wk3 c2913Wk3 = (C2913Wk3) ((BS3) c11814ya2.next());
            c2913Wk3.y = this.T;
            if (c2913Wk3.z) {
                c2913Wk3.j();
            }
        }
    }

    public final void n0() {
        ImageView imageView;
        this.n0.setEmpty();
        this.j0 = this.i0;
        this.r0.set(0, 0);
        ((org.chromium.chrome.browser.omnibox.b) this.w.g).a.setTranslationY(0.0f);
        if (!this.R) {
            this.x.setTranslationY(0.0f);
            this.z.setTranslationY(0.0f);
        }
        if (!this.R && (imageView = this.C) != null) {
            imageView.setAlpha(this.A.hasFocus() ? 0.0f : 1.0f);
        }
        ((org.chromium.chrome.browser.omnibox.b) this.w.g).a.setAlpha(1.0f);
        this.k0 = false;
        this.e0 = 255;
        if (o() || (this.d0 && !this.R && !((org.chromium.chrome.browser.omnibox.b) this.w.g).a.hasFocus())) {
            this.e0 = 51;
        }
        if (l0()) {
            Ge4.f(this, true);
        }
        this.f0 = -1.0f;
        z0();
    }

    public final void t0() {
        int i = this.H;
        if (i == 1 || i == 2) {
            return;
        }
        float f = 0.0f;
        boolean z = this.T > 0.0f;
        boolean z2 = !z;
        if (l0()) {
            Ge4.f(this, z2);
        }
        if (!this.R) {
            if (!this.A.hasFocus() && this.f0 == 1.0f) {
                f = 1.0f;
            }
            this.C.setAlpha(f);
        }
        InterfaceC11299x32 j = this.j.j();
        Point point = this.r0;
        Rect rect = this.q0;
        j.b(rect, point);
        int max = Math.max(0, rect.top - ((org.chromium.chrome.browser.omnibox.b) this.w.g).a.getTop());
        ((org.chromium.chrome.browser.omnibox.b) this.w.g).a.setTranslationY(max);
        float min = this.H == 0 ? Math.min(point.y, 0) : 0;
        this.x.setTranslationY(min);
        this.z.setTranslationY(min);
        float interpolation = 1.0f - AbstractC8142nr1.e.getInterpolation(this.T);
        int i2 = rect.left;
        Rect rect2 = this.l0;
        int i3 = i2 - rect2.left;
        int i4 = rect.right - rect2.right;
        int dimensionPixelSize = (int) ((1.0f - this.T) * getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080616));
        float f2 = i3 * interpolation;
        int round = Math.round(f2);
        float f3 = i4 * interpolation;
        int round2 = Math.round(f3);
        Rect rect3 = this.n0;
        rect3.set(round, max, round2, max);
        rect3.inset(0, dimensionPixelSize);
        this.o0 = f2;
        this.p0 = f3;
        int i5 = z ? 255 : 0;
        this.e0 = i5;
        this.k0 = i5 > 0;
        float f4 = i5 / 255.0f;
        ((org.chromium.chrome.browser.omnibox.b) this.w.g).a.setAlpha(f4);
        j.j(1.0f - f4);
        if (!this.k0) {
            Drawable drawable = this.j0;
            if (drawable instanceof KQ3) {
                KQ3 kq3 = (KQ3) drawable;
                kq3.setBounds(kq3.h, kq3.i, kq3.j, kq3.k);
            }
        }
        w0(i0(this.B0));
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        org.chromium.chrome.browser.omnibox.a aVar = this.w;
        if (aVar != null && view == ((org.chromium.chrome.browser.omnibox.b) aVar.g).a) {
            return c0(canvas, j);
        }
        if (this.i0 != null) {
            canvas.save();
            int translationY = (int) ((org.chromium.chrome.browser.omnibox.b) this.w.g).a.getTranslationY();
            Rect rect = this.l0;
            int i = rect.top + translationY;
            if (this.T != 0.0f && i < view.getBottom()) {
                boolean isLayoutRtl = (view == this.z) ^ LocalizationUtils.isLayoutRtl();
                int i2 = rect.bottom + translationY;
                if (translationY > 0.0f) {
                    i = view.getTop();
                    i2 = i;
                    z = true;
                } else {
                    z = false;
                }
                if (isLayoutRtl) {
                    canvas.clipRect(0, i, z ? view.getMeasuredWidth() : rect.left, i2);
                } else {
                    canvas.clipRect(z ? 0 : rect.right, i, getMeasuredWidth(), i2);
                }
            }
            r1 = 1;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        if (r1 != 0) {
            canvas.restore();
        }
        return drawChild;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        this.m0.set(0, 0, i, i2);
        super.onSizeChanged(i, i2, i3, i4);
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.C = (ImageView) getRootView().findViewById(R.id.toolbar_hairline);
        v0();
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d, android.view.View
    public final void draw(Canvas canvas) {
        boolean z = (this.I || this.Q == null) ? false : true;
        if (z) {
            canvas.save();
            canvas.clipRect(this.Q);
        }
        super.draw(canvas);
        if (z) {
            canvas.restore();
            if (this.Q == null) {
                postInvalidate();
            }
        }
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final void z() {
        ToggleTabStackButton toggleTabStackButton = this.y;
        if (toggleTabStackButton != null) {
            toggleTabStackButton.setClickable(true);
        }
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final C3814bG p() {
        C7928nE c7928nE = UN.a;
        int i = 8;
        if (N.M09VlOh_("ToolbarScrollAblationAndroid")) {
            return C3814bG.a(8);
        }
        if (this.f11531J) {
            return new C3814bG(1, 0, 0, true);
        }
        if (!N.M09VlOh_("SuppressToolbarCaptures")) {
            return new C3814bG(0, 0, 0, (this.o || this.R) ? false : true);
        }
        VQ3 e0 = e0();
        VQ3 vq3 = this.z0;
        if (vq3 == null) {
            i = 1;
        } else if (e0.a != vq3.a) {
            i = 2;
        } else if (e0.b != vq3.b) {
            i = 3;
        } else if (!Objects.equals(e0.c, vq3.c)) {
            i = 4;
        } else if (e0.d != vq3.d) {
            i = 5;
        } else if (e0.f != vq3.f) {
            i = 6;
        } else if (e0.h != vq3.h) {
            i = 7;
        } else if (e0.i == vq3.i) {
            if (e0.j != vq3.j) {
                i = 10;
            } else if (Objects.equals(e0.e, vq3.e)) {
                i = !Objects.equals(e0.g, vq3.g) ? 12 : 0;
            } else {
                i = 11;
            }
        }
        if (i != 0) {
            if (this.o) {
                return C3814bG.a(4);
            }
            if (this.R) {
                return C3814bG.a(5);
            }
            if (!this.F0) {
                StatusView statusView = this.w.k.a;
                if (!(statusView.n || statusView.o || statusView.p)) {
                    return new C3814bG(2, 0, i, true);
                }
                return C3814bG.a(7);
            }
            return C3814bG.a(6);
        }
        return C3814bG.a(3);
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final boolean K(boolean z) {
        if (z) {
            if (this.z0 == null) {
                this.z0 = e0();
            }
            int i = this.z0.a;
            RJ3 rj3 = this.r;
            boolean z2 = i != (rj3 == null ? this.i : rj3.h).getDefaultColor();
            this.f11531J = z2;
            C8609pC3 c8609pC3 = this.O;
            if (c8609pC3 != null && this.y != null) {
                this.f11531J = z2 || this.z0.b != c8609pC3.f;
            }
            return this.f11531J;
        }
        this.f11531J = z;
        return false;
    }

    public final VQ3 e0() {
        RJ3 rj3 = this.r;
        int defaultColor = (rj3 == null ? this.i : rj3.h).getDefaultColor();
        int i = this.v.f;
        C8610pD c8610pD = this.A0;
        int i2 = this.B0;
        String h = this.j.h();
        int f = this.j.f(false);
        ColorStateList imageTintList = this.z.getImageTintList();
        boolean z = ((RS1) this.s.b.i(TS1.h)).a;
        boolean k = this.j.k();
        float f2 = this.l.h;
        return new VQ3(defaultColor, i, c8610pD, i2, h, f, imageTintList, z, k, this.b0);
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final void L(RunnableC8183ny1 runnableC8183ny1) {
        this.w0 = runnableC8183ny1;
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final void f() {
        this.Q = null;
        ObjectAnimator objectAnimator = this.F;
        if (objectAnimator != null) {
            objectAnimator.end();
            this.F = null;
        }
        ObjectAnimator objectAnimator2 = this.G;
        if (objectAnimator2 != null) {
            objectAnimator2.end();
            this.G = null;
        }
        u0();
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final void i(Rect rect) {
        p0(0, rect);
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final void t(boolean z) {
        this.v0 = z;
        X();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        X();
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final void X() {
        int i;
        if (!this.v0 || this.j.g()) {
            this.z.setVisibility(8);
        } else {
            HomeButton homeButton = this.z;
            if (!this.o) {
                int i2 = this.H;
                if (!(i2 == 2 || i2 == 3)) {
                    i = 0;
                    homeButton.setVisibility(i);
                }
            }
            i = 4;
            homeButton.setVisibility(i);
        }
        if (this.D != null) {
            MenuButton menuButton = this.s.e;
            boolean z = menuButton != null && menuButton.getVisibility() == 0;
            ND2 nd2 = AbstractC11495xe2.i;
            if (z) {
                this.D.a.a.m(nd2, getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080807));
            } else {
                this.D.a.a.m(nd2, 0);
            }
        }
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d, defpackage.QJ3
    public final void c(int i, ColorStateList colorStateList) {
        this.z.setImageTintList(colorStateList);
        ToggleTabStackButton toggleTabStackButton = this.y;
        if (toggleTabStackButton != null) {
            toggleTabStackButton.s.c(AbstractC3494aK3.c(toggleTabStackButton.getContext(), i));
            C8609pC3 c8609pC3 = this.O;
            if (c8609pC3 != null) {
                c8609pC3.c(colorStateList);
            }
        }
        org.chromium.chrome.browser.toolbar.optional_button.b bVar = this.D;
        if (bVar != null && this.E) {
            bVar.a.a.o(AbstractC11495xe2.g, colorStateList);
        }
        org.chromium.chrome.browser.omnibox.a aVar = this.w;
        if (aVar != null) {
            aVar.q();
        }
        Runnable runnable = this.w0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final HomeButton g() {
        return this.z;
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final void R(boolean z) {
        this.I = z;
        if (!z) {
            setAlpha(this.C0);
            setVisibility(this.D0);
            v0();
            this.C0 = 1.0f;
            this.z0 = e0();
            return;
        }
        if (!(o() && T34.j(this.j.h()))) {
            InterfaceC5925hP3 interfaceC5925hP3 = this.j;
            if (!((interfaceC5925hP3 == null || interfaceC5925hP3.a() == null || !this.j.a().n()) ? false : true)) {
                if (!(!o() && T34.j(this.j.h()) && this.f0 < 1.0f)) {
                    this.C.setVisibility(0);
                }
            }
        }
        this.C0 = getAlpha();
        this.D0 = getVisibility();
        setAlpha(1.0f);
        setVisibility(0);
    }

    public final void A0() {
        setVisibility(this.H == 0 ? 0 : 4);
        u0();
        v0();
        ToggleTabStackButton toggleTabStackButton = this.y;
        if (toggleTabStackButton == null) {
            return;
        }
        if (this.H == 2) {
            toggleTabStackButton.setBackgroundColor(getContext().getColor(android.R.color.transparent));
            return;
        }
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(R.style.f107050_resource_name_obfuscated_res_0x7f1505fe, typedValue, true);
        this.y.setBackgroundResource(typedValue.resourceId);
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final void I() {
        B0();
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final void y(boolean z, boolean z2) {
        setVisibility(z ? 0 : 8);
        u0();
        v0();
        this.w.t(true);
        float f = (z && z2) ? 1.0f : 0.0f;
        if (this.g0 != f) {
            this.g0 = f;
            z0();
        }
        B0();
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final void C() {
        setAlpha(1.0f);
        this.Q = null;
        if (this.H == 3) {
            this.w.t(true);
            this.H = 0;
            B0();
        }
        if (this.H == 2) {
            this.H = 1;
        }
        requestLayout();
        this.P = this.H == 0 ? 0.0f : 1.0f;
        if (!this.M) {
            f();
            B0();
        }
        if (this.N) {
            this.N = false;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<ToolbarPhone, Float>) View.TRANSLATION_Y, -getHeight(), 0.0f);
            ofFloat.setDuration(100L);
            ofFloat.setInterpolator(InterpolatorC0485Dt.c);
            ofFloat.addListener(new IQ3(this));
            this.G = ofFloat;
            ofFloat.start();
            return;
        }
        A0();
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final void N(View.OnClickListener onClickListener) {
        ToggleTabStackButton toggleTabStackButton = this.y;
        if (toggleTabStackButton != null) {
            toggleTabStackButton.u = onClickListener;
        }
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final void O(View.OnLongClickListener onLongClickListener) {
        ToggleTabStackButton toggleTabStackButton = this.y;
        if (toggleTabStackButton != null) {
            toggleTabStackButton.v = onLongClickListener;
        }
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final boolean U() {
        return super.U() || this.T > 0.0f || ((float) this.r0.y) < 0.0f;
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final void P(C10226tv3 c10226tv3) {
        this.v = c10226tv3;
        c10226tv3.a.a(this);
        ToggleTabStackButton toggleTabStackButton = this.y;
        if (toggleTabStackButton != null) {
            toggleTabStackButton.t = c10226tv3;
            c10226tv3.a(toggleTabStackButton);
        }
    }

    @Override // defpackage.InterfaceC9883sv3
    public final void a(int i, boolean z) {
        int i0;
        this.z.setEnabled(true);
        if (this.y == null) {
            return;
        }
        Context context = getContext();
        InterfaceC5925hP3 interfaceC5925hP3 = this.j;
        if (interfaceC5925hP3 != null) {
            i0 = interfaceC5925hP3.i();
        } else {
            i0 = i0(o() ? 1 : 0);
        }
        int a = AbstractC5647gc2.a(i0, context, z);
        if (this.O == null || this.E0 != a) {
            C8609pC3 d = C8609pC3.d(getContext(), a);
            this.O = d;
            d.setState(new int[]{android.R.attr.state_enabled});
            this.E0 = a;
        }
        C8609pC3 c8609pC3 = this.O;
        if (c8609pC3 != null) {
            c8609pC3.e(i, z);
        }
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final void A() {
        s0();
        B0();
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final void B() {
        s0();
        B0();
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final void x(boolean z) {
        if (this.u0) {
            this.t0.end();
        }
        int color = this.h0.getColor();
        int i = this.j.i();
        if (color == i) {
            return;
        }
        int h0 = h0(color);
        int h02 = h0(i);
        int i2 = this.B0;
        if (i2 == 0 || i2 == 2) {
            if (!z) {
                w0(i);
                return;
            }
            boolean h = AbstractC3899bX.h(i);
            int i3 = this.e0;
            int i4 = h ? 255 : 51;
            boolean z2 = i3 != i4;
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
            this.t0 = duration;
            duration.setInterpolator(InterpolatorC0485Dt.c);
            this.t0.addUpdateListener(new C11422xQ3(this, z2, i3, i4, color, i, h0, h02));
            this.t0.addListener(new C11765yQ3(this));
            this.t0.start();
            this.u0 = true;
            Runnable runnable = this.w0;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final void s() {
        post(new RunnableC12108zQ3(this));
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final void l(boolean z) {
        int i;
        if (z) {
            i = 8;
        } else {
            i = this.H == 0 ? 0 : 4;
        }
        setVisibility(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:            if (getVisibility() == 0) goto L129;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v0() {
        /*
            r3 = this;
            int r0 = r3.H
            r1 = 0
            if (r0 != 0) goto L3f
            boolean r0 = r3.o()
            r2 = 1
            if (r0 == 0) goto L1a
            hP3 r0 = r3.j
            java.lang.String r0 = r0.h()
            boolean r0 = defpackage.T34.j(r0)
            if (r0 == 0) goto L1a
            r0 = r2
            goto L1b
        L1a:
            r0 = r1
        L1b:
            if (r0 != 0) goto L3f
            hP3 r0 = r3.j
            if (r0 == 0) goto L35
            org.chromium.chrome.browser.tab.Tab r0 = r0.a()
            if (r0 == 0) goto L35
            hP3 r0 = r3.j
            org.chromium.chrome.browser.tab.Tab r0 = r0.a()
            boolean r0 = r0.n()
            if (r0 == 0) goto L35
            r0 = r2
            goto L36
        L35:
            r0 = r1
        L36:
            if (r0 != 0) goto L3f
            int r0 = r3.getVisibility()
            if (r0 != 0) goto L3f
            goto L40
        L3f:
            r2 = r1
        L40:
            if (r2 == 0) goto L43
            goto L44
        L43:
            r1 = 4
        L44:
            android.widget.ImageView r0 = r3.C
            if (r0 == 0) goto L53
            int r0 = r0.getVisibility()
            if (r0 == r1) goto L53
            android.widget.ImageView r0 = r3.C
            r0.setVisibility(r1)
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.toolbar.top.ToolbarPhone.v0():void");
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final SF1 h() {
        return this.w;
    }

    public final boolean m0(int i) {
        int i2;
        int i3;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.w.a.getLayoutParams();
        layoutParams.gravity = 51;
        boolean x0 = x0() | false;
        boolean z = this.W;
        int i4 = this.s0;
        if (z || (this.B0 == 3 && this.H == 0)) {
            int a = ((org.chromium.chrome.browser.omnibox.b) this.w.g).a();
            i2 = (i - (i4 * 2)) + a;
            i3 = ((org.chromium.chrome.browser.omnibox.b) this.w.g).a.getLayoutDirection() == 1 ? i4 : i4 - a;
        } else {
            i2 = this.b0;
            i3 = this.c0;
        }
        if (this.a0) {
            float width = this.D.b.getWidth();
            MenuButton menuButton = this.s.e;
            if (!(menuButton != null && menuButton.getVisibility() == 0)) {
                width -= i4;
            }
            if (getLayoutDirection() == 1) {
                i3 -= (int) width;
            }
            i2 += (int) width;
        }
        boolean z2 = x0 | (i2 != layoutParams.width);
        layoutParams.width = i2;
        boolean z3 = z2 | (i3 != layoutParams.leftMargin);
        layoutParams.leftMargin = i3;
        return z3;
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final void a0(C8610pD c8610pD) {
        ViewStub viewStub;
        this.A0 = c8610pD;
        C8267oD c8267oD = c8610pD.c;
        org.chromium.chrome.browser.toolbar.optional_button.b bVar = this.D;
        if (bVar == null && bVar == null && (viewStub = (ViewStub) findViewById(R.id.optional_button_stub)) != null) {
            viewStub.setLayoutResource(R.layout.0_resource_name_obfuscated_res_0x7f0e01cd);
            org.chromium.chrome.browser.toolbar.optional_button.b bVar2 = new org.chromium.chrome.browser.toolbar.optional_button.b(viewStub.inflate(), new Q44((Activity) getContext(), new Handler()), this.x, new AQ3(this), LU3.a(Profile.d()));
            this.D = bVar2;
            bVar2.a.a.m(AbstractC11495xe2.h, this.y0);
            this.D.a.a.o(AbstractC11495xe2.e, new Runnable() { // from class: uQ3
                @Override // java.lang.Runnable
                public final void run() {
                    ToolbarPhone.this.a0 = true;
                }
            });
            this.D.a.a.o(AbstractC11495xe2.c, new Callback() { // from class: vQ3
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    C3799bD c3799bD;
                    Integer num = (Integer) obj;
                    ToolbarPhone toolbarPhone = ToolbarPhone.this;
                    toolbarPhone.F0 = true;
                    if (toolbarPhone.isShown() && (c3799bD = toolbarPhone.K) != null) {
                        toolbarPhone.L = c3799bD.w(toolbarPhone.L);
                    }
                    int intValue = num.intValue();
                    if (intValue != 1) {
                        if (intValue != 2) {
                            if (intValue != 3) {
                                if (intValue != 4) {
                                    return;
                                }
                            }
                        }
                        toolbarPhone.a0 = true;
                        toolbarPhone.requestLayout();
                        return;
                    }
                    toolbarPhone.V = true;
                }
            });
            this.D.e = new Callback() { // from class: wQ3
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    int i = ToolbarPhone.L0;
                    ToolbarPhone toolbarPhone = ToolbarPhone.this;
                    toolbarPhone.getClass();
                    if (((Integer) obj).intValue() == 3) {
                        return;
                    }
                    toolbarPhone.a0 = false;
                    toolbarPhone.V = false;
                    toolbarPhone.F0 = false;
                    C3799bD c3799bD = toolbarPhone.K;
                    if (c3799bD != null) {
                        c3799bD.u(toolbarPhone.L);
                        toolbarPhone.L = -1;
                    }
                    Runnable runnable = toolbarPhone.w0;
                    if (runnable != null) {
                        runnable.run();
                    }
                    toolbarPhone.requestLayout();
                }
            };
        }
        this.E = c8267oD.e;
        this.D.a(c8610pD);
        boolean z = this.E;
        PD2 pd2 = AbstractC11495xe2.g;
        if (!z) {
            this.D.a.a.o(pd2, null);
            return;
        }
        org.chromium.chrome.browser.toolbar.optional_button.b bVar3 = this.D;
        RJ3 rj3 = this.r;
        bVar3.a.a.o(pd2, rj3 == null ? this.i : rj3.h);
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final void m() {
        this.A0 = null;
        org.chromium.chrome.browser.toolbar.optional_button.b bVar = this.D;
        if (bVar == null || bVar.b.getVisibility() == 8 || this.a0) {
            return;
        }
        org.chromium.chrome.browser.toolbar.optional_button.b bVar2 = this.D;
        bVar2.f = null;
        bVar2.a.a.o(AbstractC11495xe2.a, null);
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final void e() {
        AnimatorSet animatorSet = this.U;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.U.cancel();
        }
        ValueAnimator valueAnimator = this.t0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.t0.cancel();
        }
        super.e();
    }
}
