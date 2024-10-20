package org.chromium.chrome.browser.infobar;

import J.N;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.AbstractC4809e90;
import defpackage.C0967Hl1;
import defpackage.C1357Kl1;
import defpackage.C7074kl1;
import defpackage.ViewOnClickListenerC1876Ol1;
import defpackage.ViewOnClickListenerC7418ll1;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.infobar.FramebustBlockInfoBar;
import org.chromium.components.infobars.InfoBar;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class FramebustBlockInfoBar extends InfoBar {
    public final String p;
    public boolean q;

    public FramebustBlockInfoBar(String str) {
        super(R.drawable.0_resource_name_obfuscated_res_0x7f09035a, R.color.0_resource_name_obfuscated_res_0x7f0705af, null, null);
        this.p = str;
    }

    @Override // org.chromium.components.infobars.InfoBar, defpackage.InterfaceC1487Ll1
    public final void d(boolean z) {
        r(1);
    }

    @Override // org.chromium.components.infobars.InfoBar
    public final void l(ViewOnClickListenerC7418ll1 viewOnClickListenerC7418ll1) {
        C7074kl1 c7074kl1 = new C7074kl1(viewOnClickListenerC7418ll1);
        c7074kl1.b = this.l.getString(R.string.0_resource_name_obfuscated_res_0x7f140948);
        c7074kl1.b(viewOnClickListenerC7418ll1.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f1403f2), new Callback() { // from class: yU0
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                FramebustBlockInfoBar.this.e();
            }
        });
        c7074kl1.a();
    }

    @Override // org.chromium.components.infobars.InfoBar
    public final boolean t() {
        return !this.q;
    }

    @Override // org.chromium.components.infobars.InfoBar, defpackage.InterfaceC1487Ll1
    public final void e() {
        if (!this.q) {
            this.q = true;
            this.k = n();
            C0967Hl1 c0967Hl1 = ((InfoBarContainer) this.j).q;
            if (c0967Hl1 != null) {
                c0967Hl1.r.e();
                return;
            }
            return;
        }
        super.e();
    }

    @Override // org.chromium.components.infobars.InfoBar
    public final void m(ViewOnClickListenerC1876Ol1 viewOnClickListenerC1876Ol1) {
        viewOnClickListenerC1876Ol1.j(this.l.getString(R.string.0_resource_name_obfuscated_res_0x7f140947));
        C1357Kl1 a = viewOnClickListenerC1876Ol1.a();
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.l).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e013c, (ViewGroup) a, false);
        String str = this.p;
        String scheme = Uri.parse(str).getScheme();
        if (scheme == null) {
            str = AbstractC4809e90.a("://", str);
            scheme = "";
        }
        String substring = N.MR6Af3ZS(str, 0).substring(scheme.length() + 3);
        ((TextView) viewGroup.findViewById(R.id.url_scheme)).setText(scheme);
        ((TextViewEllipsizerSafe) ((TextView) viewGroup.findViewById(R.id.url_minus_scheme))).setText(substring);
        viewGroup.setOnClickListener(new View.OnClickListener() { // from class: xU0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FramebustBlockInfoBar.this.e();
            }
        });
        a.addView(viewGroup);
        viewOnClickListenerC1876Ol1.i(this.l.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f1401dd), null);
    }

    public static FramebustBlockInfoBar create(String str) {
        return new FramebustBlockInfoBar(str);
    }
}
