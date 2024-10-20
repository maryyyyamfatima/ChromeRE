package org.chromium.chrome.browser.sync.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import androidx.fragment.app.h;
import com.android.chrome.R;
import defpackage.AbstractC9108qg3;
import defpackage.C5490g8;
import defpackage.C8765pg3;
import defpackage.C9473rk2;
import defpackage.DialogInterfaceOnCancelListenerC7423lm0;
import org.chromium.chrome.browser.sync.settings.ManageSyncSettings;
import org.chromium.chrome.browser.sync.ui.PassphraseCreationDialogFragment;
import org.chromium.chrome.browser.sync.ui.PassphraseTypeDialogFragment;
import org.chromium.ui.widget.TextViewWithClickableSpans;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PassphraseTypeDialogFragment extends DialogInterfaceOnCancelListenerC7423lm0 implements DialogInterface.OnClickListener {
    public static final /* synthetic */ int r0 = 0;

    @Override // defpackage.DialogInterfaceOnCancelListenerC7423lm0
    public final Dialog M0(Bundle bundle) {
        View inflate = getActivity().getLayoutInflater().inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e02a6, (ViewGroup) null);
        CheckedTextView checkedTextView = (CheckedTextView) inflate.findViewById(R.id.explicit_passphrase_checkbox);
        CheckedTextView checkedTextView2 = (CheckedTextView) inflate.findViewById(R.id.keystore_passphrase_checkbox);
        TextViewWithClickableSpans textViewWithClickableSpans = (TextViewWithClickableSpans) inflate.findViewById(R.id.reset_sync_link);
        int i = this.l.getInt("arg_current_type");
        if ((i == 0 || i == 1 || (i != 2 && i != 3)) ? false : true) {
            checkedTextView.setChecked(true);
            checkedTextView.setEnabled(false);
            checkedTextView2.setEnabled(false);
            textViewWithClickableSpans.setMovementMethod(LinkMovementMethod.getInstance());
            textViewWithClickableSpans.setText(AbstractC9108qg3.a(O(R.string.0_resource_name_obfuscated_res_0x7f140aee), new C8765pg3(new C9473rk2(this), "<resetlink>", "</resetlink>")));
        } else {
            checkedTextView2.setChecked(true);
            textViewWithClickableSpans.setVisibility(8);
            if (this.l.getBoolean("arg_is_custom_passphrase_allowed")) {
                checkedTextView.setOnClickListener(new View.OnClickListener() { // from class: qk2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i2 = PassphraseTypeDialogFragment.r0;
                        PassphraseTypeDialogFragment passphraseTypeDialogFragment = PassphraseTypeDialogFragment.this;
                        ManageSyncSettings manageSyncSettings = (ManageSyncSettings) ((InterfaceC9816sk2) passphraseTypeDialogFragment.R(true));
                        if (manageSyncSettings.j0.h()) {
                            h hVar = manageSyncSettings.x;
                            hVar.getClass();
                            C10547us c10547us = new C10547us(hVar);
                            PassphraseCreationDialogFragment passphraseCreationDialogFragment = new PassphraseCreationDialogFragment();
                            passphraseCreationDialogFragment.H0(-1, manageSyncSettings);
                            passphraseCreationDialogFragment.P0(c10547us, "custom_password");
                        }
                        passphraseTypeDialogFragment.L0(false, false);
                    }
                });
            } else {
                checkedTextView.setEnabled(false);
            }
        }
        C5490g8 c5490g8 = new C5490g8(getActivity(), R.style.f105200_resource_name_obfuscated_res_0x7f150545);
        c5490g8.e(R.string.0_resource_name_obfuscated_res_0x7f1402f4, this);
        c5490g8.i(R.string.0_resource_name_obfuscated_res_0x7f140af4);
        c5490g8.j(inflate);
        return c5490g8.a();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -2) {
            L0(false, false);
        }
    }
}
