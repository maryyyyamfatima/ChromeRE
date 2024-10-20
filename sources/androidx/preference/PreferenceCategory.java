package androidx.preference;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import com.android.chrome.R;
import defpackage.AbstractC9067qZ3;
import defpackage.C1812Ny2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PreferenceCategory extends d {
    @Override // androidx.preference.Preference
    public final boolean o() {
        return false;
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, AbstractC9067qZ3.a(R.attr.0_resource_name_obfuscated_res_0x7f0503a8, android.R.attr.preferenceCategoryStyle, context));
    }

    @Override // androidx.preference.Preference
    public final boolean T() {
        return !super.o();
    }

    @Override // androidx.preference.Preference
    public final void v(C1812Ny2 c1812Ny2) {
        super.v(c1812Ny2);
        if (Build.VERSION.SDK_INT >= 28) {
            c1812Ny2.a.setAccessibilityHeading(true);
        }
    }
}
