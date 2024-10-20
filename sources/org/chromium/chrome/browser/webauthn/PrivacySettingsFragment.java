package org.chromium.chrome.browser.webauthn;

import J.N;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.c;
import com.android.chrome.R;
import defpackage.ZN3;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class PrivacySettingsFragment extends c implements View.OnClickListener {
    @Override // androidx.fragment.app.c
    public final View i0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        getActivity().setTitle(R.string.0_resource_name_obfuscated_res_0x7f1402dd);
        View inflate = layoutInflater.inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0078, viewGroup, false);
        inflate.findViewById(R.id.unlink_button).setOnClickListener(this);
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        N.MV9JyCNy();
        ZN3.c(getActivity(), N().getString(R.string.0_resource_name_obfuscated_res_0x7f1402ee), 0).d();
    }
}
