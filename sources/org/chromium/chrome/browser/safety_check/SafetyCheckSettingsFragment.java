package org.chromium.chrome.browser.safety_check;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.AbstractC0123Ay2;
import defpackage.L53;
import org.chromium.ui.widget.ButtonCompat;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SafetyCheckSettingsFragment extends AbstractC0123Ay2 {
    public static final /* synthetic */ int m0 = 0;
    public ButtonCompat j0;
    public TextView k0;
    public boolean l0;

    @Override // defpackage.AbstractC0123Ay2
    public final void O0(String str, Bundle bundle) {
        L53.a(this, R.xml.0_resource_name_obfuscated_res_0x7f180035);
        getActivity().setTitle(O(R.string.0_resource_name_obfuscated_res_0x7f140858));
        Bundle bundle2 = this.l;
        this.l0 = bundle2 != null && bundle2.containsKey("SafetyCheckSettingsFragment.safetyCheckImmediateRun") && this.l.getBoolean("SafetyCheckSettingsFragment.safetyCheckImmediateRun");
    }

    @Override // defpackage.AbstractC0123Ay2, androidx.fragment.app.c
    public final View i0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = (LinearLayout) super.i0(layoutInflater, viewGroup, bundle);
        LinearLayout linearLayout2 = (LinearLayout) layoutInflater.inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0252, (ViewGroup) linearLayout, false);
        this.j0 = (ButtonCompat) linearLayout2.findViewById(R.id.safety_check_button);
        this.k0 = (TextView) linearLayout2.findViewById(R.id.safety_check_timestamp);
        linearLayout.addView(linearLayout2);
        return linearLayout;
    }

    @Override // androidx.fragment.app.c
    public final void p0() {
        this.f11484J = true;
        this.l0 = false;
    }
}
