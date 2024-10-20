package org.chromium.chrome.browser.infobar;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.android.chrome.R;
import defpackage.AbstractC0619Et3;
import defpackage.AbstractC1658Mt3;
import defpackage.AbstractC2308Rt3;
import defpackage.EI2;
import defpackage.InterfaceC1528Lt3;
import defpackage.O83;
import defpackage.V60;
import defpackage.ViewOnClickListenerC1876Ol1;
import org.chromium.components.infobars.ConfirmInfoBar;
import org.chromium.components.infobars.InfoBar;
import org.chromium.ui.widget.ChromeImageView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SyncErrorInfoBar extends ConfirmInfoBar implements InterfaceC1528Lt3 {
    public final int s;
    public final String t;

    public final void accept() {
        AbstractC1658Mt3.b().l(this);
        v(2);
        AbstractC0619Et3.c(this.s);
    }

    public final void dismissed() {
        AbstractC1658Mt3.b().l(this);
        v(1);
    }

    public static InfoBar show() {
        String c;
        String string;
        Context context = V60.a;
        int a = AbstractC2308Rt3.a();
        int i = AbstractC0619Et3.b;
        if (a == 7) {
            c = context.getString(R.string.0_resource_name_obfuscated_res_0x7f140b0a);
        } else {
            c = AbstractC2308Rt3.c(context, a);
        }
        String b = AbstractC2308Rt3.b(context, a);
        if (a == 2 || a == 3 || a == 4 || a == 5) {
            string = context.getString(R.string.0_resource_name_obfuscated_res_0x7f140b5e);
        } else {
            string = context.getString(R.string.0_resource_name_obfuscated_res_0x7f140727);
        }
        return new SyncErrorInfoBar(b, AbstractC0619Et3.b(a), c, string);
    }

    public SyncErrorInfoBar(String str, int i, String str2, String str3) {
        super(R.drawable.0_resource_name_obfuscated_res_0x7f09032a, R.color.0_resource_name_obfuscated_res_0x7f07012e, null, str, null, str3, null);
        this.s = i;
        this.t = str2;
        AbstractC1658Mt3.b().a(this);
        int i2 = AbstractC0619Et3.b;
        O83.a.s(System.currentTimeMillis(), "sync_error_infobar_shown_shown_at_time");
        v(0);
    }

    @Override // defpackage.InterfaceC1528Lt3
    public final void B() {
        if (this.s != AbstractC0619Et3.b(AbstractC2308Rt3.a())) {
            i();
        }
    }

    @Override // org.chromium.components.infobars.ConfirmInfoBar, org.chromium.components.infobars.InfoBar
    public final void m(ViewOnClickListenerC1876Ol1 viewOnClickListenerC1876Ol1) {
        super.m(viewOnClickListenerC1876Ol1);
        ChromeImageView chromeImageView = viewOnClickListenerC1876Ol1.r;
        ViewGroup.LayoutParams layoutParams = chromeImageView.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = chromeImageView.getLayoutParams();
        int dimensionPixelSize = V60.a.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f08077b);
        layoutParams2.height = dimensionPixelSize;
        layoutParams.width = dimensionPixelSize;
        String str = this.t;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        viewOnClickListenerC1876Ol1.n.a(0, str);
    }

    @Override // org.chromium.components.infobars.InfoBar
    public final void s() {
        if (q()) {
            return;
        }
        int i = AbstractC0619Et3.b;
        O83.a.m("sync_error_infobar_shown_shown_at_time");
    }

    public final void v(int i) {
        EI2.h(i, 3, "Signin.SyncErrorInfoBar.".concat(AbstractC0619Et3.a(this.s)));
    }
}
