package org.chromium.chrome.browser.infobar;

import J.N;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import com.android.chrome.R;
import defpackage.AbstractC4809e90;
import defpackage.AbstractC8540p04;
import defpackage.C11997z52;
import defpackage.C1357Kl1;
import defpackage.ViewOnClickListenerC1876Ol1;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.infobar.AutofillOfferNotificationInfoBar;
import org.chromium.components.infobars.ConfirmInfoBar;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class AutofillOfferNotificationInfoBar extends ConfirmInfoBar {
    public final long s;
    public String t;
    public final GURL u;
    public final String v;
    public final int w;

    public AutofillOfferNotificationInfoBar(long j, int i, String str, String str2, GURL gurl) {
        super(0, 0, null, str, null, str2, null);
        this.s = j;
        this.u = gurl;
        this.v = str;
        this.w = i;
    }

    public static AutofillOfferNotificationInfoBar create(long j, int i, String str, String str2, GURL gurl) {
        return new AutofillOfferNotificationInfoBar(j, i, str, str2, gurl);
    }

    public final void setCreditCardDetails(String str, int i) {
        this.t = str;
    }

    @Override // org.chromium.components.infobars.ConfirmInfoBar, org.chromium.components.infobars.InfoBar
    public final void m(ViewOnClickListenerC1876Ol1 viewOnClickListenerC1876Ol1) {
        int i;
        super.m(viewOnClickListenerC1876Ol1);
        if (TextUtils.isEmpty(this.t) || (i = this.w) == 0) {
            return;
        }
        AbstractC8540p04.i(viewOnClickListenerC1876Ol1.q);
        viewOnClickListenerC1876Ol1.n.c(i, this.v);
        C1357Kl1 a = viewOnClickListenerC1876Ol1.a();
        String string = this.l.getString(R.string.0_resource_name_obfuscated_res_0x7f140241, this.t);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int indexOf = string.indexOf(this.t);
        spannableStringBuilder.setSpan(new StyleSpan(1), indexOf, this.t.length() + indexOf, 33);
        if (this.u.b) {
            String string2 = this.l.getString(R.string.0_resource_name_obfuscated_res_0x7f140240);
            C11997z52 c11997z52 = new C11997z52(this.l, new Callback() { // from class: Sq
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    AutofillOfferNotificationInfoBar autofillOfferNotificationInfoBar = AutofillOfferNotificationInfoBar.this;
                    N.MPhRlych(autofillOfferNotificationInfoBar.s, autofillOfferNotificationInfoBar, autofillOfferNotificationInfoBar.u);
                }
            });
            SpannableString spannableString = new SpannableString(AbstractC4809e90.a(" ", string2));
            spannableString.setSpan(c11997z52, 1, string2.length() + 1, 18);
            spannableStringBuilder.append((CharSequence) spannableString);
        }
        a.a(0, spannableStringBuilder);
    }
}
