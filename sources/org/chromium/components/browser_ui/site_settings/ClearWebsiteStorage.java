package org.chromium.components.browser_ui.site_settings;

import android.content.Context;
import android.util.AttributeSet;
import com.android.chrome.R;
import defpackage.AbstractC9826sm0;
import defpackage.C1812Ny2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ClearWebsiteStorage extends AbstractC9826sm0 {
    public Context Z;
    public String a0;
    public boolean b0;

    public ClearWebsiteStorage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Y = R.layout.f56390_resource_name_obfuscated_res_0x7f0e0087;
        this.Z = context;
    }

    @Override // androidx.preference.Preference
    public final void v(C1812Ny2 c1812Ny2) {
        super.v(c1812Ny2);
        this.U = this.Z.getString(this.b0 ? R.string.f91700_resource_name_obfuscated_res_0x7f140c4f : R.string.f91690_resource_name_obfuscated_res_0x7f140c4e, this.a0);
    }

    public ClearWebsiteStorage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.Y = R.layout.f56390_resource_name_obfuscated_res_0x7f0e0087;
        this.Z = context;
    }
}
