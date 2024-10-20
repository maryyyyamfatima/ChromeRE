package org.chromium.chrome.browser.password_check;

import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.C5490g8;
import defpackage.InterfaceDialogInterfaceOnClickListenerC1742Nk2;
import defpackage.YH2;
import org.chromium.chrome.browser.password_check.PasswordCheckViewDialogFragment;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PasswordCheckViewDialogFragment extends PasswordCheckDialogFragment {
    public final CompromisedCredential s0;

    public PasswordCheckViewDialogFragment(InterfaceDialogInterfaceOnClickListenerC1742Nk2 interfaceDialogInterfaceOnClickListenerC1742Nk2, CompromisedCredential compromisedCredential) {
        super(interfaceDialogInterfaceOnClickListenerC1742Nk2);
        this.s0 = compromisedCredential;
    }

    @Override // defpackage.DialogInterfaceOnCancelListenerC7423lm0
    public final Dialog M0(Bundle bundle) {
        getActivity().getWindow().setFlags(8192, 8192);
        View inflate = getActivity().getLayoutInflater().inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e01e0, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.view_dialog_compromised_password);
        CompromisedCredential compromisedCredential = this.s0;
        textView.setText(compromisedCredential.getPassword());
        textView.setInputType(131217);
        final ClipboardManager clipboardManager = (ClipboardManager) getActivity().getApplicationContext().getSystemService("clipboard");
        ImageButton imageButton = (ImageButton) inflate.findViewById(R.id.view_dialog_copy_button);
        imageButton.setClickable(true);
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: tl2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                clipboardManager.setPrimaryClip(ClipData.newPlainText("password", PasswordCheckViewDialogFragment.this.s0.getPassword()));
            }
        });
        C5490g8 c5490g8 = new C5490g8(getActivity());
        c5490g8.a.d = compromisedCredential.i;
        c5490g8.e(R.string.0_resource_name_obfuscated_res_0x7f140362, this.r0);
        c5490g8.j(inflate);
        return c5490g8.a();
    }

    @Override // org.chromium.chrome.browser.password_check.PasswordCheckDialogFragment, defpackage.DialogInterfaceOnCancelListenerC7423lm0, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        getActivity().getWindow().clearFlags(8192);
    }

    @Override // androidx.fragment.app.c
    public final void r0() {
        this.f11484J = true;
        if (YH2.a(0)) {
            return;
        }
        L0(false, false);
    }
}
