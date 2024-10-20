package org.chromium.chrome.browser.password_manager.settings;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.android.chrome.R;
import defpackage.C5490g8;
import defpackage.DialogInterfaceOnCancelListenerC7423lm0;
import defpackage.EI2;
import defpackage.NF0;
import defpackage.QF0;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ExportWarningDialogFragment extends DialogInterfaceOnCancelListenerC7423lm0 {
    public NF0 r0;

    @Override // defpackage.DialogInterfaceOnCancelListenerC7423lm0
    public final Dialog M0(Bundle bundle) {
        C5490g8 c5490g8 = new C5490g8(getActivity(), R.style.f105210_resource_name_obfuscated_res_0x7f150546);
        c5490g8.f(R.string.f80730_resource_name_obfuscated_res_0x7f1407d5, this.r0);
        c5490g8.e(R.string.f69890_resource_name_obfuscated_res_0x7f1402f4, this.r0);
        c5490g8.c(getActivity().getResources().getString(R.string.f86270_resource_name_obfuscated_res_0x7f140a0c));
        return c5490g8.a();
    }

    @Override // defpackage.DialogInterfaceOnCancelListenerC7423lm0, androidx.fragment.app.c
    public final void g0(Bundle bundle) {
        super.g0(bundle);
        if (bundle != null) {
            L0(false, false);
        }
    }

    @Override // defpackage.DialogInterfaceOnCancelListenerC7423lm0, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        NF0 nf0 = this.r0;
        if (nf0 != null) {
            QF0 qf0 = nf0.a;
            if (qf0.a != 2) {
                EI2.h(1, 3, "PasswordManager.PasswordExport.Event");
                qf0.a = 0;
            }
            qf0.f = null;
            if (qf0.e != null) {
                qf0.b();
            }
        }
    }
}
