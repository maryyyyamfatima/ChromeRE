package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.android.chrome.R;
import defpackage.AbstractC0123Ay2;
import defpackage.AbstractC9067qZ3;
import defpackage.InterfaceC1033Hy2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class PreferenceScreen extends d {
    public boolean c0;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, AbstractC9067qZ3.a(R.attr.f11540_resource_name_obfuscated_res_0x7f0503af, android.R.attr.preferenceScreenStyle, context));
        this.c0 = true;
    }

    @Override // androidx.preference.Preference
    public final void w() {
        InterfaceC1033Hy2 interfaceC1033Hy2;
        if (this.r != null || this.s != null || Z() == 0 || (interfaceC1033Hy2 = this.g.j) == null) {
            return;
        }
        AbstractC0123Ay2 abstractC0123Ay2 = (AbstractC0123Ay2) interfaceC1033Hy2;
        for (androidx.fragment.app.c cVar = abstractC0123Ay2; cVar != null; cVar = cVar.A) {
        }
        abstractC0123Ay2.K();
        abstractC0123Ay2.getActivity();
    }
}
