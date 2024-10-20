package org.chromium.chrome.browser.infobar;

import J.N;
import android.graphics.Bitmap;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.AbstractC1774Nr;
import defpackage.AbstractC8540p04;
import defpackage.C10245tz1;
import defpackage.C1097Il1;
import defpackage.C11997z52;
import defpackage.C1357Kl1;
import defpackage.C9902sz1;
import defpackage.ViewOnClickListenerC1876Ol1;
import java.util.LinkedList;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.infobar.AutofillVirtualCardEnrollmentInfoBar;
import org.chromium.components.infobars.ConfirmInfoBar;
import org.chromium.ui.widget.ChromeImageView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class AutofillVirtualCardEnrollmentInfoBar extends ConfirmInfoBar {
    public final LinkedList A;
    public final long s;
    public Bitmap t;
    public String u;
    public final int v;
    public final String w;
    public String x;
    public String y;
    public final LinkedList z;

    public AutofillVirtualCardEnrollmentInfoBar(long j, int i, Bitmap bitmap, String str, String str2, String str3, String str4) {
        super(0, 0, bitmap, str, str2, str3, str4);
        this.v = -1;
        this.z = new LinkedList();
        this.A = new LinkedList();
        this.v = i;
        this.w = str;
        this.s = j;
    }

    public static AutofillVirtualCardEnrollmentInfoBar create(long j, int i, Bitmap bitmap, String str, String str2, String str3, String str4) {
        return new AutofillVirtualCardEnrollmentInfoBar(j, i, bitmap, str, str2, str3, str4);
    }

    public final void addCardDetail(Bitmap bitmap, String str) {
        this.t = bitmap;
        this.u = str;
    }

    public final void setDescription(String str, String str2) {
        this.x = str;
        this.y = str2;
    }

    public final void addGoogleLegalMessageLine(String str) {
        this.z.add(new C10245tz1(str));
    }

    public final void addIssuerLegalMessageLine(String str) {
        this.A.add(new C10245tz1(str));
    }

    public final void addLinkToLastGoogleLegalMessageLine(int i, int i2, String str) {
        ((C10245tz1) this.z.getLast()).b.add(new C9902sz1(i, i2, str));
    }

    public final void addLinkToLastIssuerLegalMessageLine(int i, int i2, String str) {
        ((C10245tz1) this.A.getLast()).b.add(new C9902sz1(i, i2, str));
    }

    @Override // org.chromium.components.infobars.ConfirmInfoBar, org.chromium.components.infobars.InfoBar
    public final void m(ViewOnClickListenerC1876Ol1 viewOnClickListenerC1876Ol1) {
        super.m(viewOnClickListenerC1876Ol1);
        AbstractC8540p04.i(viewOnClickListenerC1876Ol1.q);
        C1357Kl1 a = viewOnClickListenerC1876Ol1.a();
        ChromeImageView chromeImageView = new ChromeImageView(a.getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        chromeImageView.setLayoutParams(layoutParams);
        a.addView(chromeImageView, new C1097Il1());
        chromeImageView.setImageResource(R.drawable.0_resource_name_obfuscated_res_0x7f0904e3);
        a.c(this.v, this.w);
        final int i = 0;
        if (!TextUtils.isEmpty(this.x) && !TextUtils.isEmpty(this.y)) {
            SpannableString spannableString = new SpannableString(this.x);
            int length = this.x.length() - this.y.length();
            spannableString.setSpan(new C11997z52(viewOnClickListenerC1876Ol1.getContext(), new Callback() { // from class: Tr
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    AutofillVirtualCardEnrollmentInfoBar autofillVirtualCardEnrollmentInfoBar = AutofillVirtualCardEnrollmentInfoBar.this;
                    N.ML4fygsm(autofillVirtualCardEnrollmentInfoBar.s, autofillVirtualCardEnrollmentInfoBar, "https://support.google.com/googlepay/answer/11234179", 2);
                }
            }), length, this.y.length() + length, 17);
            a.a(0, spannableString);
        }
        String string = viewOnClickListenerC1876Ol1.getContext().getString(R.string.0_resource_name_obfuscated_res_0x7f14025a);
        final int i2 = 1;
        SpannableString spannableString2 = new SpannableString(String.format("%s\n%s %s", string, viewOnClickListenerC1876Ol1.getContext().getString(R.string.0_resource_name_obfuscated_res_0x7f14025e), this.u));
        spannableString2.setSpan(new TextAppearanceSpan(viewOnClickListenerC1876Ol1.getContext(), R.style.f103070_resource_name_obfuscated_res_0x7f150470), string.length() + 1, spannableString2.length(), 17);
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(this.t, viewOnClickListenerC1876Ol1.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080831), viewOnClickListenerC1876Ol1.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080830), true);
        LinearLayout linearLayout = (LinearLayout) C1357Kl1.d(R.layout.0_resource_name_obfuscated_res_0x7f0e0135, a.getContext(), a);
        a.addView(linearLayout, new C1097Il1());
        ((ImageView) linearLayout.findViewById(R.id.control_icon)).setImageBitmap(createScaledBitmap);
        TextView textView = (TextView) linearLayout.findViewById(R.id.control_message);
        textView.setText(spannableString2);
        textView.setTextSize(0, a.getContext().getResources().getDimension(R.dimen.0_resource_name_obfuscated_res_0x7f08037c));
        linearLayout.removeView((TextView) linearLayout.findViewById(R.id.control_secondary_message));
        a.a(R.style.f103070_resource_name_obfuscated_res_0x7f150470, AbstractC1774Nr.c(viewOnClickListenerC1876Ol1.getContext(), this.z, true, new Callback() { // from class: Ur
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                AutofillVirtualCardEnrollmentInfoBar autofillVirtualCardEnrollmentInfoBar = AutofillVirtualCardEnrollmentInfoBar.this;
                N.ML4fygsm(autofillVirtualCardEnrollmentInfoBar.s, autofillVirtualCardEnrollmentInfoBar, (String) obj, i);
            }
        }));
        a.a(R.style.f103070_resource_name_obfuscated_res_0x7f150470, AbstractC1774Nr.c(viewOnClickListenerC1876Ol1.getContext(), this.A, true, new Callback() { // from class: Ur
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                AutofillVirtualCardEnrollmentInfoBar autofillVirtualCardEnrollmentInfoBar = AutofillVirtualCardEnrollmentInfoBar.this;
                N.ML4fygsm(autofillVirtualCardEnrollmentInfoBar.s, autofillVirtualCardEnrollmentInfoBar, (String) obj, i2);
            }
        }));
    }
}
