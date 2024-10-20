package org.chromium.chrome.browser.sync.settings;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import com.android.chrome.R;
import defpackage.DialogInterfaceOnCancelListenerC7423lm0;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ClearDataProgressDialog extends DialogInterfaceOnCancelListenerC7423lm0 {
    @Override // defpackage.DialogInterfaceOnCancelListenerC7423lm0, androidx.fragment.app.c
    public final void g0(Bundle bundle) {
        super.g0(bundle);
        if (bundle != null) {
            L0(false, false);
        }
    }

    @Override // defpackage.DialogInterfaceOnCancelListenerC7423lm0
    public final Dialog M0(Bundle bundle) {
        this.h0 = false;
        Dialog dialog = this.m0;
        if (dialog != null) {
            dialog.setCancelable(false);
        }
        ProgressDialog progressDialog = new ProgressDialog(getActivity());
        progressDialog.setTitle(O(R.string.0_resource_name_obfuscated_res_0x7f140c58));
        progressDialog.setMessage(O(R.string.0_resource_name_obfuscated_res_0x7f140c57));
        progressDialog.setIndeterminate(true);
        return progressDialog;
    }
}
