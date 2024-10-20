package org.chromium.chrome.browser.password_manager.settings;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.C5490g8;
import defpackage.DialogInterfaceOnCancelListenerC7423lm0;
import defpackage.IF0;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ExportErrorDialogFragment extends DialogInterfaceOnCancelListenerC7423lm0 {
    public DialogInterface.OnClickListener r0;
    public IF0 s0;

    @Override // defpackage.DialogInterfaceOnCancelListenerC7423lm0
    public final Dialog M0(Bundle bundle) {
        View inflate = getActivity().getLayoutInflater().inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e01e8, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.passwords_error_main_description)).setText(this.s0.b);
        TextView textView = (TextView) inflate.findViewById(R.id.passwords_error_detailed_description);
        String str = this.s0.c;
        if (str != null) {
            textView.setText(str);
        } else {
            textView.setVisibility(8);
        }
        C5490g8 c5490g8 = new C5490g8(getActivity(), R.style.f105210_resource_name_obfuscated_res_0x7f150546);
        c5490g8.j(inflate);
        c5490g8.i(R.string.0_resource_name_obfuscated_res_0x7f1407d7);
        c5490g8.f(this.s0.a, this.r0);
        c5490g8.e(R.string.0_resource_name_obfuscated_res_0x7f140362, this.r0);
        return c5490g8.a();
    }

    @Override // defpackage.DialogInterfaceOnCancelListenerC7423lm0, androidx.fragment.app.c
    public final void g0(Bundle bundle) {
        super.g0(bundle);
        if (bundle != null) {
            L0(false, false);
        }
    }
}
