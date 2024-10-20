package org.chromium.chrome.browser.infobar;

import J.N;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.AbstractC9108qg3;
import defpackage.C1129Ir3;
import defpackage.C11997z52;
import defpackage.C8765pg3;
import defpackage.ViewOnClickListenerC1259Jr3;
import defpackage.ViewOnClickListenerC7418ll1;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.infobar.SurveyInfoBar;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.components.infobars.InfoBar;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SurveyInfoBar extends InfoBar {
    public final SurveyInfoBarDelegate p;
    public boolean q;
    public boolean r;
    public C11997z52 s;

    @Override // org.chromium.components.infobars.InfoBar
    public final boolean t() {
        return true;
    }

    public SurveyInfoBar(int i, SurveyInfoBarDelegate surveyInfoBarDelegate) {
        super(i, 0, null, null);
        this.p = surveyInfoBarDelegate;
    }

    @Override // org.chromium.components.infobars.InfoBar, defpackage.InterfaceC1487Ll1
    public final void i() {
        super.i();
        this.p.d(true, true);
        this.r = true;
    }

    public static SurveyInfoBar create(int i, SurveyInfoBarDelegate surveyInfoBarDelegate) {
        return new SurveyInfoBar(i, surveyInfoBarDelegate);
    }

    @Override // org.chromium.components.infobars.InfoBar
    public final void s() {
        if (this.r) {
            return;
        }
        boolean q = q();
        SurveyInfoBarDelegate surveyInfoBarDelegate = this.p;
        if (q) {
            surveyInfoBarDelegate.d(false, true);
        } else {
            surveyInfoBarDelegate.d(false, false);
        }
    }

    public final void v() {
        this.q = true;
        this.p.e();
        super.i();
    }

    @Override // org.chromium.components.infobars.InfoBar
    public final void l(ViewOnClickListenerC7418ll1 viewOnClickListenerC7418ll1) {
        ((Tab) N.MmjlxAU9(this.o, this)).v(new C1129Ir3(this));
        this.s = new C11997z52(viewOnClickListenerC7418ll1.getContext(), new Callback() { // from class: Hr3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                SurveyInfoBar surveyInfoBar = SurveyInfoBar.this;
                if (surveyInfoBar.q) {
                    return;
                }
                surveyInfoBar.v();
                surveyInfoBar.r = true;
            }
        });
        SpannableString a = AbstractC9108qg3.a(this.p.c(), new C8765pg3(this.s, "<LINK>", "</LINK>"));
        TextView textView = new TextView(this.l);
        textView.setText(a);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setGravity(16);
        textView.setTextAppearance(textView.getContext(), R.style.f102580_resource_name_obfuscated_res_0x7f15043f);
        textView.setOnClickListener(new ViewOnClickListenerC1259Jr3(this));
        viewOnClickListenerC7418ll1.a(textView);
    }
}
