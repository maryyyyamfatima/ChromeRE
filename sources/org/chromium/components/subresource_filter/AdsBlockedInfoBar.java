package org.chromium.components.subresource_filter;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.android.chrome.R;
import defpackage.C0967Hl1;
import defpackage.C1097Il1;
import defpackage.C11997z52;
import defpackage.C1357Kl1;
import defpackage.ViewOnClickListenerC1876Ol1;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.infobar.InfoBarContainer;
import org.chromium.components.browser_ui.widget.DualControlLayout;
import org.chromium.components.infobars.ConfirmInfoBar;
import org.chromium.components.infobars.InfoBar;
import org.chromium.components.subresource_filter.AdsBlockedInfoBar;
import org.chromium.ui.widget.ButtonCompat;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class AdsBlockedInfoBar extends ConfirmInfoBar implements CompoundButton.OnCheckedChangeListener {
    public final String s;
    public final String t;
    public final String u;
    public final String v;
    public final String w;
    public boolean x;
    public boolean y;
    public ButtonCompat z;

    public static InfoBar show(int i, String str, String str2, String str3, String str4, String str5) {
        return new AdsBlockedInfoBar(i, str, str2, str3, str4, str5);
    }

    public AdsBlockedInfoBar(int i, String str, String str2, String str3, String str4, String str5) {
        super(i, R.color.0_resource_name_obfuscated_res_0x7f0705af, null, str, null, null, null);
        this.t = str5;
        this.s = str;
        this.u = str2;
        this.v = str3;
        this.w = str4;
    }

    @Override // org.chromium.components.infobars.ConfirmInfoBar, org.chromium.components.infobars.InfoBar
    public final void m(ViewOnClickListenerC1876Ol1 viewOnClickListenerC1876Ol1) {
        super.m(viewOnClickListenerC1876Ol1);
        if (this.x) {
            viewOnClickListenerC1876Ol1.j(viewOnClickListenerC1876Ol1.getContext().getString(R.string.0_resource_name_obfuscated_res_0x7f140278));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) new SpannableString(this.t));
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) viewOnClickListenerC1876Ol1.getContext().getString(R.string.0_resource_name_obfuscated_res_0x7f1405af));
            spannableStringBuilder.setSpan(new C11997z52(viewOnClickListenerC1876Ol1.getContext(), new Callback() { // from class: Q7
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    AdsBlockedInfoBar.this.e();
                }
            }), length, spannableStringBuilder.length(), 33);
            viewOnClickListenerC1876Ol1.n.a(0, spannableStringBuilder);
            String str = this.u;
            viewOnClickListenerC1876Ol1.i(str, null);
            C1357Kl1 a = viewOnClickListenerC1876Ol1.a();
            LinearLayout linearLayout = (LinearLayout) C1357Kl1.d(R.layout.0_resource_name_obfuscated_res_0x7f0e013b, a.getContext(), a);
            a.addView(linearLayout, new C1097Il1());
            linearLayout.removeView((ImageView) linearLayout.findViewById(R.id.control_icon));
            ((TextView) linearLayout.findViewById(R.id.control_message)).setText(this.w);
            SwitchCompat switchCompat = (SwitchCompat) linearLayout.findViewById(R.id.control_toggle_switch);
            switchCompat.setId(R.id.subresource_filter_infobar_toggle);
            switchCompat.setChecked(false);
            ((SwitchCompat) linearLayout.findViewById(R.id.subresource_filter_infobar_toggle)).setOnCheckedChangeListener(this);
            DualControlLayout dualControlLayout = viewOnClickListenerC1876Ol1.s;
            ButtonCompat buttonCompat = dualControlLayout != null ? (ButtonCompat) dualControlLayout.findViewById(R.id.button_primary) : null;
            this.z = buttonCompat;
            buttonCompat.setMinEms(Math.max(str.length(), this.v.length()));
            return;
        }
        String string = viewOnClickListenerC1876Ol1.getContext().getString(R.string.0_resource_name_obfuscated_res_0x7f1403f2);
        viewOnClickListenerC1876Ol1.j(this.s);
        viewOnClickListenerC1876Ol1.u = string;
        viewOnClickListenerC1876Ol1.q.setText(viewOnClickListenerC1876Ol1.g());
    }

    @Override // org.chromium.components.infobars.InfoBar, defpackage.InterfaceC1487Ll1
    public final void e() {
        if (!this.x) {
            this.x = true;
            this.k = n();
            C0967Hl1 c0967Hl1 = ((InfoBarContainer) this.j).q;
            if (c0967Hl1 != null) {
                c0967Hl1.r.e();
            }
        }
        super.e();
    }

    @Override // org.chromium.components.infobars.ConfirmInfoBar, org.chromium.components.infobars.InfoBar, defpackage.InterfaceC1487Ll1
    public final void d(boolean z) {
        r(this.y ? 2 : 1);
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.z.setText(z ? this.v : this.u);
        this.y = z;
    }
}
