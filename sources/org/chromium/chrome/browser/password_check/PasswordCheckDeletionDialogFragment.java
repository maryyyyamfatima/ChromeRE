package org.chromium.chrome.browser.password_check;

import android.app.Dialog;
import android.os.Bundle;
import com.android.chrome.R;
import defpackage.C5490g8;
import defpackage.InterfaceDialogInterfaceOnClickListenerC1742Nk2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PasswordCheckDeletionDialogFragment extends PasswordCheckDialogFragment {
    public final String s0;

    public PasswordCheckDeletionDialogFragment(InterfaceDialogInterfaceOnClickListenerC1742Nk2 interfaceDialogInterfaceOnClickListenerC1742Nk2, String str) {
        super(interfaceDialogInterfaceOnClickListenerC1742Nk2);
        this.s0 = str;
    }

    @Override // defpackage.DialogInterfaceOnCancelListenerC7423lm0
    public final Dialog M0(Bundle bundle) {
        C5490g8 c5490g8 = new C5490g8(getActivity(), R.style.f105210_resource_name_obfuscated_res_0x7f150546);
        c5490g8.i(R.string.0_resource_name_obfuscated_res_0x7f1407b2);
        InterfaceDialogInterfaceOnClickListenerC1742Nk2 interfaceDialogInterfaceOnClickListenerC1742Nk2 = this.r0;
        c5490g8.f(R.string.0_resource_name_obfuscated_res_0x7f1407b1, interfaceDialogInterfaceOnClickListenerC1742Nk2);
        c5490g8.e(R.string.0_resource_name_obfuscated_res_0x7f140793, interfaceDialogInterfaceOnClickListenerC1742Nk2);
        c5490g8.c(Q(R.string.0_resource_name_obfuscated_res_0x7f14079e, this.s0));
        return c5490g8.a();
    }
}
