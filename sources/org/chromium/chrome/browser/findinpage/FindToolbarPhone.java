package org.chromium.chrome.browser.findinpage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import com.android.chrome.R;
import defpackage.AbstractC10957w33;
import defpackage.AbstractC11746yN;
import defpackage.Y50;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class FindToolbarPhone extends a {
    public FindToolbarPhone(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // org.chromium.chrome.browser.findinpage.a
    public final void g() {
        setVisibility(0);
        super.g();
    }

    @Override // org.chromium.chrome.browser.findinpage.a
    public final void i(boolean z) {
        setVisibility(8);
        super.i(z);
    }

    @Override // org.chromium.chrome.browser.findinpage.a
    public final void x(boolean z) {
        int i;
        int i2;
        setBackgroundColor(AbstractC11746yN.a(getContext(), z));
        ColorStateList b = Y50.b(getContext(), z ? R.color.0_resource_name_obfuscated_res_0x7f070122 : R.color.0_resource_name_obfuscated_res_0x7f07012b);
        this.j.setImageTintList(b);
        this.i.setImageTintList(b);
        this.h.setImageTintList(b);
        if (z) {
            this.k.setBackgroundResource(R.color.0_resource_name_obfuscated_res_0x7f0708ca);
            i = R.color.0_resource_name_obfuscated_res_0x7f0701a3;
            i2 = R.color.0_resource_name_obfuscated_res_0x7f0701a2;
        } else {
            this.k.setBackgroundColor(AbstractC10957w33.f(getContext()));
            i = R.color.0_resource_name_obfuscated_res_0x7f07014a;
            i2 = R.color.0_resource_name_obfuscated_res_0x7f0701a1;
        }
        this.g.setTextColor(Y50.b(getContext(), i));
        this.g.setHintTextColor(getContext().getColor(i2));
    }

    @Override // org.chromium.chrome.browser.findinpage.a
    public final int f(boolean z, boolean z2) {
        if (z2) {
            return getContext().getColor(z ? R.color.0_resource_name_obfuscated_res_0x7f070130 : R.color.0_resource_name_obfuscated_res_0x7f0708d0);
        }
        return super.f(z, z2);
    }
}
