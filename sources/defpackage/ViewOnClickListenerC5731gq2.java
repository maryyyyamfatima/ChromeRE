package defpackage;

import J.N;
import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.gridlayout.widget.GridLayout;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.chromium.chrome.browser.app.ChromeActivity;
import org.chromium.chrome.browser.payments.ui.PaymentRequestHeader;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.browser_ui.widget.FadingEdgeScrollView;
import org.chromium.components.payments.PaymentApp;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gq2 */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC5731gq2 implements InterfaceC2535Tn0, View.OnClickListener, InterfaceViewOnClickListenerC1637Mp2, InterfaceC3657ao2 {
    public C1118Ip2 A;
    public C1508Lp2 B;
    public C1508Lp2 C;
    public C1508Lp2 D;
    public C1508Lp2 E;
    public ArrayList F;
    public AbstractViewOnClickListenerC1897Op2 G;
    public boolean H;
    public boolean I;

    /* renamed from: J */
    public boolean f11508J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public C8545p13 O;
    public C8545p13 P;
    public C8545p13 Q;
    public C8545p13 R;
    public Animator S;
    public C3526aR0 T;
    public final Activity g;
    public final InterfaceC3669aq2 h;
    public final boolean i;
    public final C1513Lq2 j;
    public final Profile k;
    public final C2665Un0 l;
    public final ViewOnClickListenerC0501Dw0 m;
    public final ViewOnClickListenerC0501Dw0 n;
    public final ViewGroup o;
    public final T83 q;
    public final int r;
    public FadingEdgeScrollView s;
    public LinearLayout t;
    public TextView u;
    public ViewGroup v;
    public Button w;
    public Button x;
    public View y;
    public View z;
    public final C4356cq2 a = new C4356cq2(new RunnableC2677Up2(this));
    public final C2807Vp2 p = new C2807Vp2(this);

    @Override // defpackage.InterfaceC3657ao2
    public final void e() {
    }

    public final void m(U83 u83) {
        if (u83 == null || u83.a == null) {
            this.A.setVisibility(8);
            return;
        }
        this.A.setVisibility(0);
        C1118Ip2 c1118Ip2 = this.A;
        Context context = c1118Ip2.w.getContext();
        AB1 ab1 = u83.a;
        SpannableStringBuilder h = C1118Ip2.h(ab1.b, ab1.c, true);
        if (c1118Ip2.t.getText() != null && !TextUtils.equals(c1118Ip2.t.getText(), h) && c1118Ip2.t.getVisibility() == 0) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(c1118Ip2.x.getAlpha(), 1.0f);
            alphaAnimation.setDuration(500L);
            alphaAnimation.setInterpolator(AbstractC8142nr1.g);
            alphaAnimation.setFillAfter(true);
            c1118Ip2.x.startAnimation(alphaAnimation);
            Handler handler = c1118Ip2.A;
            RunnableC0988Hp2 runnableC0988Hp2 = c1118Ip2.z;
            handler.removeCallbacks(runnableC0988Hp2);
            handler.postDelayed(runnableC0988Hp2, 5000L);
        }
        c1118Ip2.f(u83.a.a, h);
        c1118Ip2.w.removeAllViews();
        ArrayList arrayList = c1118Ip2.y;
        arrayList.clear();
        if (u83.a() == null) {
            return;
        }
        int i = 2;
        int width = (((View) c1118Ip2.w.getParent()).getWidth() * 2) / 3;
        int size = u83.a().size();
        GridLayout gridLayout = c1118Ip2.w;
        gridLayout.g.n(size);
        gridLayout.h();
        gridLayout.requestLayout();
        int i2 = 0;
        while (i2 < size) {
            AB1 ab12 = (AB1) u83.a().get(i2);
            TextView textView = new TextView(context);
            textView.setTextAppearance(textView.getContext(), ab12.d ? R.style.f102360_resource_name_obfuscated_res_0x7f150429 : R.style.f102350_resource_name_obfuscated_res_0x7f150428);
            textView.setText(ab12.a);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setMaxLines(i);
            if (width > 0) {
                textView.setMaxWidth(width);
            }
            TextView textView2 = new TextView(context);
            textView2.setTextAppearance(textView2.getContext(), ab12.d ? R.style.f102360_resource_name_obfuscated_res_0x7f150429 : R.style.f102350_resource_name_obfuscated_res_0x7f150428);
            textView2.setText(C1118Ip2.h(ab12.b, ab12.c, false));
            arrayList.add(textView2);
            D41 d41 = GridLayout.y;
            R41 r41 = new R41(GridLayout.l(i2, 1, d41, 0.0f), GridLayout.l(0, 1, d41, 0.0f));
            R41 r412 = new R41(GridLayout.l(i2, 1, d41, 0.0f), GridLayout.l(1, 1, d41, 0.0f));
            r412.setMarginStart(context.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080665));
            c1118Ip2.w.addView(textView, r41);
            c1118Ip2.w.addView(textView2, r412);
            i2++;
            i = 2;
        }
    }

    public final boolean h() {
        return (this.l.e || this.S != null || this.T != null || this.I || this.M || this.N) ? false : true;
    }

    @Override // defpackage.InterfaceC3657ao2
    public final void c() {
        N8 n8 = this.l.a;
        n8.getWindow().setAttributes(n8.getWindow().getAttributes());
    }

    public ViewOnClickListenerC5731gq2(ChromeActivity chromeActivity, C1642Mq2 c1642Mq2, boolean z, boolean z2, String str, String str2, int i, T83 t83, C1513Lq2 c1513Lq2, Profile profile) {
        this.g = chromeActivity;
        this.h = c1642Mq2;
        this.i = z2;
        this.r = chromeActivity.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080668);
        this.k = profile;
        this.q = t83;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(chromeActivity).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e01ec, (ViewGroup) null);
        this.o = viewGroup;
        this.z = viewGroup.findViewById(R.id.payment_request_spinny);
        this.L = true;
        ((TextView) viewGroup.findViewById(R.id.message)).setText(R.string.0_resource_name_obfuscated_res_0x7f14081b);
        PaymentRequestHeader paymentRequestHeader = (PaymentRequestHeader) viewGroup.findViewById(R.id.header);
        ((TextView) paymentRequestHeader.findViewById(R.id.page_title)).setText(str);
        TextView textView = (TextView) paymentRequestHeader.findViewById(R.id.hostname);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        boolean z3 = !AbstractC3899bX.g(paymentRequestHeader.a);
        C11055wM c11055wM = new C11055wM(profile);
        AbstractC11140wc2.a(spannableStringBuilder, paymentRequestHeader.g, c11055wM, i, false, z3, true);
        c11055wM.a();
        textView.setText(spannableStringBuilder);
        if (str2.startsWith("https://")) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(LN3.a(R.drawable.0_resource_name_obfuscated_res_0x7f0903f0, R.color.0_resource_name_obfuscated_res_0x7f07010f, paymentRequestHeader.g), (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setPaddingRelative(0, 0, 0, 0);
        }
        View findViewById = viewGroup.findViewById(R.id.close_button);
        this.y = findViewById;
        findViewById.setOnClickListener(this);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.bottom_bar);
        this.v = viewGroup2;
        Button button = (Button) viewGroup2.findViewById(R.id.button_primary);
        this.x = button;
        button.setOnClickListener(this);
        Button button2 = (Button) this.v.findViewById(R.id.button_secondary);
        this.w = button2;
        button2.setOnClickListener(this);
        this.F = new ArrayList();
        this.s = (FadingEdgeScrollView) viewGroup.findViewById(R.id.option_container);
        this.t = (LinearLayout) viewGroup.findViewById(R.id.payment_container_layout);
        this.u = (TextView) viewGroup.findViewById(R.id.retry_error);
        this.A = new C1118Ip2(chromeActivity, chromeActivity.getString(R.string.0_resource_name_obfuscated_res_0x7f140821), this, chromeActivity.getString(R.string.0_resource_name_obfuscated_res_0x7f140834));
        this.B = new C1508Lp2(chromeActivity, chromeActivity.getString(t83.a), this);
        this.C = new C1508Lp2(chromeActivity, chromeActivity.getString(t83.b), this);
        this.D = new C1508Lp2(chromeActivity, chromeActivity.getString(R.string.0_resource_name_obfuscated_res_0x7f14080d), this);
        C1508Lp2 c1508Lp2 = new C1508Lp2(chromeActivity, chromeActivity.getString(R.string.0_resource_name_obfuscated_res_0x7f14081c), this);
        this.E = c1508Lp2;
        this.B.G = false;
        C1508Lp2 c1508Lp22 = this.C;
        c1508Lp22.H = true;
        c1508Lp22.x = false;
        c1508Lp2.x = z;
        boolean M1X7xdZV = N.M1X7xdZV("WebPaymentsMethodSectionOrderV2");
        this.t.addView(this.A, new LinearLayout.LayoutParams(-1, -2));
        if (M1X7xdZV) {
            this.F.add(new C1767Np2(-1, this.t));
            this.t.addView(this.E, new LinearLayout.LayoutParams(-1, -2));
        }
        C1767Np2 c1767Np2 = new C1767Np2(-1, this.t);
        this.F.add(c1767Np2);
        this.t.addView(this.B, new LinearLayout.LayoutParams(-1, -2));
        if (!c1642Mq2.u()) {
            this.B.setVisibility(8);
            c1767Np2.setVisibility(8);
        }
        if (!M1X7xdZV) {
            this.F.add(new C1767Np2(-1, this.t));
            this.t.addView(this.E, new LinearLayout.LayoutParams(-1, -2));
        }
        C1767Np2 c1767Np22 = new C1767Np2(-1, this.t);
        this.F.add(c1767Np22);
        this.t.addView(this.D, new LinearLayout.LayoutParams(-1, -2));
        if (!c1642Mq2.t()) {
            this.D.setVisibility(8);
            c1767Np22.setVisibility(8);
        }
        viewGroup.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC4699dq2(this));
        this.x.setEnabled(false);
        ViewOnClickListenerC0501Dw0 viewOnClickListenerC0501Dw0 = new ViewOnClickListenerC0501Dw0(chromeActivity, null, profile);
        this.m = viewOnClickListenerC0501Dw0;
        C2665Un0.b(viewOnClickListenerC0501Dw0.getWindow());
        ViewOnClickListenerC0501Dw0 viewOnClickListenerC0501Dw02 = new ViewOnClickListenerC0501Dw0(chromeActivity, null, profile);
        this.n = viewOnClickListenerC0501Dw02;
        C2665Un0.b(viewOnClickListenerC0501Dw02.getWindow());
        WindowManager.LayoutParams attributes = viewOnClickListenerC0501Dw02.getWindow().getAttributes();
        attributes.flags |= 8192;
        viewOnClickListenerC0501Dw02.getWindow().setAttributes(attributes);
        this.l = new C2665Un0(chromeActivity, this);
        this.j = c1513Lq2;
    }

    public final void l(String str) {
        TextView textView = this.u;
        if (textView == null) {
            return;
        }
        textView.setText(str);
        if (TextUtils.isEmpty(str)) {
            this.u.setVisibility(8);
            return;
        }
        if (this.H) {
            int dimensionPixelSize = this.g.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0801f9);
            TextView textView2 = this.u;
            WeakHashMap weakHashMap = Ec4.a;
            textView2.setPaddingRelative(0, dimensionPixelSize, 0, dimensionPixelSize);
        } else {
            TextView textView3 = this.u;
            WeakHashMap weakHashMap2 = Ec4.a;
            textView3.setPaddingRelative(0, 0, 0, 0);
        }
        this.u.setVisibility(0);
    }

    public final void o(int i, C8545p13 c8545p13) {
        if (i == 1) {
            this.P = c8545p13;
            this.B.k(c8545p13);
        } else if (i == 2) {
            this.Q = c8545p13;
            this.C.k(c8545p13);
            if (((C1642Mq2) this.h).u() && !this.Q.a.isEmpty() && this.t.indexOfChild(this.C) == -1) {
                int indexOfChild = this.t.indexOfChild(this.B);
                C1767Np2 c1767Np2 = new C1767Np2(indexOfChild + 1, this.t);
                this.F.add(c1767Np2);
                if (this.H) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) c1767Np2.getLayoutParams();
                    layoutParams.setMarginStart(0);
                    layoutParams.setMarginEnd(0);
                }
                this.t.addView(this.C, indexOfChild + 2, new LinearLayout.LayoutParams(-1, -2));
                this.t.requestLayout();
            }
        } else if (i == 3) {
            this.R = c8545p13;
            this.D.k(c8545p13);
        } else if (i == 4) {
            this.O = c8545p13;
            this.E.k(c8545p13);
        }
        this.M = false;
        p();
        n();
    }

    public final void k(AbstractViewOnClickListenerC1897Op2 abstractViewOnClickListenerC1897Op2) {
        int p;
        C1508Lp2 c1508Lp2 = this.B;
        InterfaceC3669aq2 interfaceC3669aq2 = this.h;
        if (abstractViewOnClickListenerC1897Op2 == c1508Lp2) {
            p = ((C1642Mq2) interfaceC3669aq2).p(this.p, 1);
        } else if (abstractViewOnClickListenerC1897Op2 == this.D) {
            p = ((C1642Mq2) interfaceC3669aq2).p(null, 3);
        } else {
            p = abstractViewOnClickListenerC1897Op2 == this.E ? ((C1642Mq2) interfaceC3669aq2).p(null, 4) : 3;
        }
        r(abstractViewOnClickListenerC1897Op2, p);
    }

    public final void r(AbstractViewOnClickListenerC1897Op2 abstractViewOnClickListenerC1897Op2, int i) {
        boolean z = i == 1;
        this.K = z;
        this.M = i == 2;
        if (z) {
            this.G = abstractViewOnClickListenerC1897Op2;
            q();
            abstractViewOnClickListenerC1897Op2.d(6);
        } else {
            d(null);
        }
        n();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (h()) {
            if (view == this.y) {
                b(true);
                return;
            }
            if (j()) {
                if (!(view instanceof AbstractViewOnClickListenerC1897Op2) || ((AbstractViewOnClickListenerC1897Op2) view).b() == 0) {
                    C1118Ip2 c1118Ip2 = this.A;
                    if (view == c1118Ip2) {
                        d(c1118Ip2);
                    } else {
                        C1508Lp2 c1508Lp2 = this.B;
                        if (view == c1508Lp2) {
                            d(c1508Lp2);
                        } else {
                            C1508Lp2 c1508Lp22 = this.C;
                            if (view == c1508Lp22) {
                                d(c1508Lp22);
                            } else {
                                C1508Lp2 c1508Lp23 = this.D;
                                if (view == c1508Lp23) {
                                    d(c1508Lp23);
                                } else {
                                    C1508Lp2 c1508Lp24 = this.E;
                                    if (view == c1508Lp24) {
                                        d(c1508Lp24);
                                    } else if (view != this.x) {
                                        if (view == this.w) {
                                            if (this.H) {
                                                b(true);
                                            } else {
                                                d(c1118Ip2);
                                            }
                                        }
                                    } else {
                                        this.I = true;
                                        C8545p13 c8545p13 = this.P;
                                        C4733dw0 c = c8545p13 == null ? null : c8545p13.c();
                                        C8545p13 c8545p132 = this.Q;
                                        C4733dw0 c2 = c8545p132 == null ? null : c8545p132.c();
                                        C4733dw0 c3 = this.O.c();
                                        C1642Mq2 c1642Mq2 = (C1642Mq2) this.h;
                                        c1642Mq2.getClass();
                                        if (!((C4546dP) c1642Mq2.p).c(c, c2, (PaymentApp) c3)) {
                                            C1513Lq2 c1513Lq2 = this.j;
                                            c1513Lq2.b = false;
                                            c1513Lq2.a();
                                        } else {
                                            a(true);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    l(null);
                    n();
                }
            }
        }
    }

    public final void b(boolean z) {
        this.N = true;
        C2665Un0 c2665Un0 = this.l;
        if (!z) {
            c2665Un0.a.dismiss();
            c2665Un0.a();
        } else {
            c2665Un0.getClass();
            new C2275Rn0(c2665Un0);
        }
    }

    public final void a(boolean z) {
        if (this.L == z) {
            return;
        }
        this.L = z;
        ViewGroup viewGroup = this.o;
        if (z) {
            this.s.setVisibility(8);
            this.v.setVisibility(8);
            this.y.setVisibility(8);
            this.z.setVisibility(0);
            ((FrameLayout.LayoutParams) viewGroup.getLayoutParams()).height = -2;
            viewGroup.requestLayout();
            return;
        }
        this.s.setVisibility(0);
        this.v.setVisibility(0);
        this.y.setVisibility(0);
        this.z.setVisibility(8);
        if (this.H) {
            ((FrameLayout.LayoutParams) viewGroup.getLayoutParams()).height = -1;
            viewGroup.requestLayout();
        }
    }

    public final void n() {
        C8545p13 c8545p13;
        C8545p13 c8545p132;
        C8545p13 c8545p133;
        C8545p13 c8545p134;
        C1642Mq2 c1642Mq2 = (C1642Mq2) this.h;
        boolean z = false;
        boolean z2 = (c1642Mq2.t() && ((c8545p134 = this.R) == null || c8545p134.c() == null)) ? false : true;
        boolean z3 = (c1642Mq2.u() && ((c8545p133 = this.P) == null || c8545p133.c() == null)) ? false : true;
        boolean z4 = (c1642Mq2.u() && ((c8545p132 = this.Q) == null || c8545p132.c() == null)) ? false : true;
        Button button = this.x;
        if (z2 && z3 && z4 && (c8545p13 = this.O) != null && c8545p13.c() != null && !this.K && !this.M && !this.N) {
            z = true;
        }
        button.setEnabled(z);
        C8545p13 c8545p135 = this.O;
        PaymentApp paymentApp = c8545p135 == null ? null : (PaymentApp) c8545p135.c();
        this.x.setText((paymentApp == null || paymentApp.p() == 1) ? R.string.0_resource_name_obfuscated_res_0x7f140822 : R.string.0_resource_name_obfuscated_res_0x7f14080e);
        C4356cq2 c4356cq2 = this.a;
        if (c4356cq2.c) {
            return;
        }
        c4356cq2.c = true;
        c4356cq2.a.post(c4356cq2.b);
    }

    public final boolean j() {
        return (!h() || this.O == null || this.K) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(defpackage.AbstractViewOnClickListenerC1897Op2 r12) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ViewOnClickListenerC5731gq2.d(Op2):void");
    }

    public final void p() {
        boolean z = !this.K;
        for (int i = 0; i < this.t.getChildCount(); i++) {
            View childAt = this.t.getChildAt(i);
            if (childAt instanceof AbstractViewOnClickListenerC1897Op2) {
                AbstractViewOnClickListenerC1897Op2 abstractViewOnClickListenerC1897Op2 = (AbstractViewOnClickListenerC1897Op2) childAt;
                abstractViewOnClickListenerC1897Op2.h.setEnabled(z);
                if (abstractViewOnClickListenerC1897Op2.b() != 0) {
                    z = false;
                }
            }
        }
    }

    public final void q() {
        this.T = new C3526aR0(this.t, this.G, new RunnableC3327Zp2(this));
        C1118Ip2 c1118Ip2 = this.A;
        boolean z = this.G == c1118Ip2;
        c1118Ip2.getClass();
        c1118Ip2.d(z ? 5 : 4);
        C1642Mq2 c1642Mq2 = (C1642Mq2) this.h;
        if (c1642Mq2.u()) {
            C1508Lp2 c1508Lp2 = this.B;
            c1508Lp2.i(this.G == c1508Lp2);
            C1508Lp2 c1508Lp22 = this.C;
            c1508Lp22.i(this.G == c1508Lp22);
        }
        if (c1642Mq2.t()) {
            C1508Lp2 c1508Lp23 = this.D;
            c1508Lp23.i(this.G == c1508Lp23);
        }
        C1508Lp2 c1508Lp24 = this.E;
        c1508Lp24.i(this.G == c1508Lp24);
        p();
    }
}
