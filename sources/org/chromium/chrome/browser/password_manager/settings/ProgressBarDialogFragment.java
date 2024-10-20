package org.chromium.chrome.browser.password_manager.settings;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.android.chrome.R;
import defpackage.C4115c8;
import defpackage.C5490g8;
import defpackage.DialogInterfaceOnCancelListenerC7423lm0;
import org.chromium.components.browser_ui.widget.MaterialProgressBar;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ProgressBarDialogFragment extends DialogInterfaceOnCancelListenerC7423lm0 {
    public DialogInterface.OnClickListener r0;

    @Override // defpackage.DialogInterfaceOnCancelListenerC7423lm0
    public final Dialog M0(Bundle bundle) {
        View inflate = getActivity().getLayoutInflater().inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e01e9, (ViewGroup) null);
        MaterialProgressBar materialProgressBar = (MaterialProgressBar) inflate.findViewById(R.id.passwords_progress_bar);
        if (!materialProgressBar.i) {
            materialProgressBar.i = true;
            materialProgressBar.b();
            materialProgressBar.postInvalidateOnAnimation();
        }
        C5490g8 c5490g8 = new C5490g8(getActivity(), R.style.f105210_resource_name_obfuscated_res_0x7f150546);
        C4115c8 c4115c8 = c5490g8.a;
        c4115c8.q = inflate;
        c5490g8.e(R.string.0_resource_name_obfuscated_res_0x7f1402f4, this.r0);
        c4115c8.d = getActivity().getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f140a0d);
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
