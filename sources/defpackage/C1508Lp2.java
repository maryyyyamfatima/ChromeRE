package defpackage;

import J.N;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.gridlayout.widget.GridLayout;
import com.android.chrome.R;
import java.util.ArrayList;
import org.chromium.chrome.browser.app.ChromeActivity;
import org.chromium.chrome.browser.autofill.PersonalDataManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Lp2 */
/* loaded from: classes.dex */
public final class C1508Lp2 extends AbstractViewOnClickListenerC1897Op2 {
    public final int A;
    public final int B;
    public GridLayout C;
    public ViewGroup D;
    public C8545p13 E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;

    /* renamed from: J */
    public InterfaceC1248Jp2 f11454J;
    public final ArrayList w;
    public boolean x;
    public final int y;
    public final ArrayList z;

    public C1508Lp2(ChromeActivity chromeActivity, String str, InterfaceViewOnClickListenerC1637Mp2 interfaceViewOnClickListenerC1637Mp2) {
        super(chromeActivity, str, interfaceViewOnClickListenerC1637Mp2);
        this.w = new ArrayList();
        this.x = true;
        this.z = new ArrayList();
        this.G = true;
        this.y = chromeActivity.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0801fa);
        this.A = chromeActivity.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0801f6);
        this.B = chromeActivity.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080660);
        f(null, null);
    }

    @Override // defpackage.AbstractViewOnClickListenerC1897Op2
    public final void c(View view) {
        int i;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.z;
            if (i2 >= arrayList.size()) {
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    C1378Kp2 c1378Kp2 = (C1378Kp2) arrayList.get(i3);
                    View view2 = c1378Kp2.b;
                    boolean z = view2 == view || c1378Kp2.c == view || c1378Kp2.d == view;
                    C4733dw0 c4733dw0 = c1378Kp2.a;
                    if (c4733dw0 != null) {
                        ((RadioButton) view2).setChecked(z);
                        if (z) {
                            C1508Lp2 c1508Lp2 = c1378Kp2.f;
                            c1508Lp2.l(c4733dw0);
                            ViewOnClickListenerC5731gq2 viewOnClickListenerC5731gq2 = (ViewOnClickListenerC5731gq2) c1508Lp2.a;
                            C1508Lp2 c1508Lp22 = viewOnClickListenerC5731gq2.B;
                            C2807Vp2 c2807Vp2 = viewOnClickListenerC5731gq2.p;
                            InterfaceC3669aq2 interfaceC3669aq2 = viewOnClickListenerC5731gq2.h;
                            if (c1508Lp2 == c1508Lp22 && viewOnClickListenerC5731gq2.P.c() != c4733dw0) {
                                viewOnClickListenerC5731gq2.P.e(c4733dw0);
                                i = ((C1642Mq2) interfaceC3669aq2).r(1, c4733dw0, c2807Vp2);
                            } else if (c1508Lp2 == viewOnClickListenerC5731gq2.C && viewOnClickListenerC5731gq2.Q.c() != c4733dw0) {
                                viewOnClickListenerC5731gq2.Q.e(c4733dw0);
                                i = ((C1642Mq2) interfaceC3669aq2).r(2, c4733dw0, c2807Vp2);
                            } else if (c1508Lp2 == viewOnClickListenerC5731gq2.D) {
                                viewOnClickListenerC5731gq2.R.e(c4733dw0);
                                i = ((C1642Mq2) interfaceC3669aq2).r(3, c4733dw0, c2807Vp2);
                            } else if (c1508Lp2 == viewOnClickListenerC5731gq2.E) {
                                viewOnClickListenerC5731gq2.O.e(c4733dw0);
                                i = ((C1642Mq2) interfaceC3669aq2).r(4, c4733dw0, null);
                            } else {
                                i = 3;
                            }
                            viewOnClickListenerC5731gq2.r(c1508Lp2, i);
                        }
                    }
                }
                return;
            }
            C1378Kp2 c1378Kp22 = (C1378Kp2) arrayList.get(i2);
            boolean z2 = c1378Kp22.b == view || c1378Kp22.c == view || c1378Kp22.d == view;
            InterfaceViewOnClickListenerC1637Mp2 interfaceViewOnClickListenerC1637Mp2 = this.a;
            C4733dw0 c4733dw02 = c1378Kp22.a;
            if (c4733dw02 == null && z2) {
                ((ViewOnClickListenerC5731gq2) interfaceViewOnClickListenerC1637Mp2).k(this);
                return;
            }
            if (c4733dw02 != null && c1378Kp22.e == view) {
                ViewOnClickListenerC5731gq2 viewOnClickListenerC5731gq22 = (ViewOnClickListenerC5731gq2) interfaceViewOnClickListenerC1637Mp2;
                C1508Lp2 c1508Lp23 = viewOnClickListenerC5731gq22.B;
                InterfaceC3669aq2 interfaceC3669aq22 = viewOnClickListenerC5731gq22.h;
                int q = this == c1508Lp23 ? ((C1642Mq2) interfaceC3669aq22).q(1, c4733dw02, viewOnClickListenerC5731gq22.p) : 3;
                if (this == viewOnClickListenerC5731gq22.D) {
                    q = ((C1642Mq2) interfaceC3669aq22).q(3, c4733dw02, null);
                }
                if (this == viewOnClickListenerC5731gq22.E) {
                    q = ((C1642Mq2) interfaceC3669aq22).q(4, c4733dw02, null);
                }
                viewOnClickListenerC5731gq22.r(this, q);
                return;
            }
            i2++;
        }
    }

    public final void i(boolean z) {
        C8545p13 c8545p13 = this.E;
        if (!(c8545p13 != null && c8545p13.d() > 0) && z) {
            d(3);
            return;
        }
        InterfaceC1248Jp2 interfaceC1248Jp2 = this.f11454J;
        if (interfaceC1248Jp2 != null) {
            int i = this.E.b;
            C1642Mq2 c1642Mq2 = (C1642Mq2) interfaceC1248Jp2;
            if (c1642Mq2.D.c() != null) {
                C1634Mp c1634Mp = (C1634Mp) c1642Mq2.D.c();
                if (!z) {
                    if (c1634Mp.s == null) {
                        PersonalDataManager d = PersonalDataManager.d();
                        c1634Mp.s = N.MGlLlw0K(d.a, d, c1634Mp.q);
                    }
                    PersonalDataManager.AutofillProfile autofillProfile = c1634Mp.q;
                    String str = c1634Mp.s;
                    autofillProfile.p = str;
                    c1634Mp.n[1] = str;
                } else {
                    c1634Mp.m();
                }
                c1642Mq2.z.o(1, c1642Mq2.D);
            }
        }
        int i2 = this.j;
        d(z ? 5 : 4);
        C8545p13 c8545p132 = this.E;
        if (c8545p132 == null || i2 != 3) {
            return;
        }
        l(c8545p132.c());
    }

    @Override // defpackage.AbstractViewOnClickListenerC1897Op2
    public final void a(LinearLayout linearLayout) {
        Context context = linearLayout.getContext();
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(getContext()).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e01f3, (ViewGroup) null);
        ((TextView) viewGroup.findViewById(R.id.message)).setText(getContext().getString(R.string.0_resource_name_obfuscated_res_0x7f14080c));
        this.D = viewGroup;
        GridLayout gridLayout = new GridLayout(context, null);
        this.C = gridLayout;
        gridLayout.a.n(4);
        gridLayout.h();
        gridLayout.requestLayout();
        linearLayout.addView(this.C, new LinearLayout.LayoutParams(-1, -2));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(defpackage.C8545p13 r20) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1508Lp2.k(p13):void");
    }

    public final void j(boolean z) {
        if (z) {
            if (this.D.getParent() != null) {
                return;
            }
            ViewGroup viewGroup = (ViewGroup) this.C.getParent();
            viewGroup.addView(this.D, viewGroup.indexOfChild(this.C));
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.D.getLayoutParams();
            marginLayoutParams.width = -1;
            marginLayoutParams.height = -2;
            marginLayoutParams.bottomMargin = getContext().getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080664);
            this.D.requestLayout();
            return;
        }
        if (this.D.getParent() == null) {
            return;
        }
        ((ViewGroup) this.D.getParent()).removeView(this.D);
    }

    @Override // defpackage.AbstractViewOnClickListenerC1897Op2
    public final void g() {
        if (this.i) {
            int i = this.j;
            if (i == 5) {
                this.v = false;
                this.C.setVisibility(0);
                j(false);
            } else if (i == 6) {
                this.v = false;
                this.C.setVisibility(8);
                j(true);
            } else {
                this.v = true;
                this.C.setVisibility(8);
                j(false);
            }
            super.g();
        }
    }

    @Override // defpackage.AbstractViewOnClickListenerC1897Op2
    public final int b() {
        C8545p13 c8545p13 = this.E;
        if (c8545p13 == null) {
            return 0;
        }
        if (c8545p13.d() == 0 && this.x) {
            return 2;
        }
        return this.E.c() == null ? 1 : 0;
    }

    public final void l(C4733dw0 c4733dw0) {
        if (c4733dw0 == null || (this.j == 3 && this.G)) {
            if (!this.F) {
                e(TextUtils.TruncateAt.END, true);
                this.F = true;
            }
        } else if (this.F) {
            e(null, false);
            this.F = false;
        }
        ImageView imageView = this.o;
        if (c4733dw0 == null) {
            this.u = null;
            imageView.setBackgroundResource(0);
            imageView.setImageDrawable(this.u);
            if (!this.I) {
                AbstractC9771sd.i(R.style.f102770_resource_name_obfuscated_res_0x7f150452, this.s);
                this.I = true;
            }
            Context context = getContext();
            C8545p13 c8545p13 = this.E;
            TextView textView = this.s;
            int d = c8545p13.d();
            if (d == 0) {
                textView.setText((CharSequence) null);
            } else {
                if (textView.getLayout() == null && d > 1) {
                    textView.addOnLayoutChangeListener(new B13(context, textView, c8545p13));
                }
                textView.setText(C13.a(context, c8545p13, textView.getLayout(), textView.getPaint()));
            }
        } else {
            this.u = c4733dw0.m;
            imageView.setBackgroundResource(0);
            imageView.setImageDrawable(this.u);
            if (this.I) {
                AbstractC9771sd.i(R.style.f102580_resource_name_obfuscated_res_0x7f15043f, this.s);
                this.I = false;
            }
            if (this.H && this.j == 3) {
                f(c4733dw0.n[0], h(c4733dw0, true, false, this.F));
            } else {
                f(h(c4733dw0, false, false, this.F), null);
            }
        }
        g();
    }

    public final SpannableStringBuilder h(C4733dw0 c4733dw0, boolean z, boolean z2, boolean z3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!z) {
            spannableStringBuilder.append((CharSequence) c4733dw0.n[0]);
            if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(1), 0, spannableStringBuilder.length(), 0);
            }
        }
        String string = z3 ? getContext().getString(R.string.0_resource_name_obfuscated_res_0x7f14020a) : "\n";
        boolean isEmpty = TextUtils.isEmpty(c4733dw0.n[1]);
        String[] strArr = c4733dw0.n;
        if (!isEmpty) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) string);
            }
            spannableStringBuilder.append((CharSequence) strArr[1]);
        }
        if (!TextUtils.isEmpty(strArr[2])) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) string);
            }
            spannableStringBuilder.append((CharSequence) strArr[2]);
        }
        if (!TextUtils.isEmpty(c4733dw0.k)) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) string);
            }
            spannableStringBuilder.append((CharSequence) c4733dw0.k);
        }
        if (!c4733dw0.d() && !TextUtils.isEmpty(c4733dw0.i)) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) string);
            }
            String str = c4733dw0.i;
            spannableStringBuilder.append((CharSequence) str);
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(AbstractC10957w33.e(getContext()));
            AbsoluteSizeSpan absoluteSizeSpan = new AbsoluteSizeSpan(14, true);
            int length = spannableStringBuilder.length() - str.length();
            spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 0);
            spannableStringBuilder.setSpan(absoluteSizeSpan, length, spannableStringBuilder.length(), 0);
        }
        return spannableStringBuilder;
    }
}
