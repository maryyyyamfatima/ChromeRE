package org.chromium.chrome.browser.infobar;

import android.graphics.Bitmap;
import com.android.chrome.R;
import defpackage.C1357Kl1;
import defpackage.C4501dG;
import defpackage.ViewOnClickListenerC1876Ol1;
import java.util.ArrayList;
import org.chromium.components.infobars.ConfirmInfoBar;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class AutofillCreditCardFillingInfoBar extends ConfirmInfoBar {
    public final ArrayList s;

    public AutofillCreditCardFillingInfoBar(int i, Bitmap bitmap, String str, String str2, String str3) {
        super(i, R.color.f22500_resource_name_obfuscated_res_0x7f0705af, bitmap, str, null, str2, str3);
        this.s = new ArrayList();
    }

    public static AutofillCreditCardFillingInfoBar create(long j, int i, Bitmap bitmap, String str, String str2, String str3) {
        return new AutofillCreditCardFillingInfoBar(i, bitmap, str, str2, str3);
    }

    public final void addDetail(int i, String str, String str2) {
        this.s.add(new C4501dG(i, str, str2));
    }

    @Override // org.chromium.components.infobars.ConfirmInfoBar, org.chromium.components.infobars.InfoBar
    public final void m(ViewOnClickListenerC1876Ol1 viewOnClickListenerC1876Ol1) {
        super.m(viewOnClickListenerC1876Ol1);
        C1357Kl1 a = viewOnClickListenerC1876Ol1.a();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.s;
            if (i >= arrayList.size()) {
                return;
            }
            C4501dG c4501dG = (C4501dG) arrayList.get(i);
            a.b(c4501dG.a, R.dimen.f34330_resource_name_obfuscated_res_0x7f080389, c4501dG.b, c4501dG.c);
            i++;
        }
    }
}
