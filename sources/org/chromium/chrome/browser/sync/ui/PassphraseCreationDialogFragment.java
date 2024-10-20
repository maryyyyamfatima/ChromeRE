package org.chromium.chrome.browser.sync.ui;

import J.N;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.AbstractC1658Mt3;
import defpackage.AbstractC9108qg3;
import defpackage.C5351fk2;
import defpackage.C5490g8;
import defpackage.C5695gk2;
import defpackage.C8765pg3;
import defpackage.DialogC5834h8;
import defpackage.DialogInterfaceOnCancelListenerC7423lm0;
import defpackage.InterfaceC6382ik2;
import defpackage.LayoutInflaterFactory2C0545Ef;
import defpackage.ViewOnClickListenerC6039hk2;
import org.chromium.chrome.browser.sync.SyncServiceImpl;
import org.chromium.chrome.browser.sync.settings.ManageSyncSettings;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PassphraseCreationDialogFragment extends DialogInterfaceOnCancelListenerC7423lm0 {
    public EditText r0;
    public EditText s0;

    @Override // defpackage.DialogInterfaceOnCancelListenerC7423lm0
    public final Dialog M0(Bundle bundle) {
        super.M0(bundle);
        View inflate = getActivity().getLayoutInflater().inflate(R.layout.f61280_resource_name_obfuscated_res_0x7f0e02a4, (ViewGroup) null);
        this.r0 = (EditText) inflate.findViewById(R.id.passphrase);
        EditText editText = (EditText) inflate.findViewById(R.id.confirm_passphrase);
        this.s0 = editText;
        editText.setOnEditorActionListener(new C5351fk2(this));
        TextView textView = (TextView) inflate.findViewById(R.id.custom_passphrase_instructions);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        Activity activity = getActivity();
        textView.setText(AbstractC9108qg3.a(activity.getString(R.string.f88200_resource_name_obfuscated_res_0x7f140ad3), new C8765pg3(new C5695gk2(activity), "<learnmore>", "</learnmore>")));
        C5490g8 c5490g8 = new C5490g8(getActivity(), R.style.f105200_resource_name_obfuscated_res_0x7f150545);
        c5490g8.a.q = inflate;
        c5490g8.i(R.string.f88510_resource_name_obfuscated_res_0x7f140af2);
        c5490g8.f(R.string.f85220_resource_name_obfuscated_res_0x7f14099e, null);
        c5490g8.e(R.string.f69890_resource_name_obfuscated_res_0x7f1402f4, null);
        DialogC5834h8 a = c5490g8.a();
        ((LayoutInflaterFactory2C0545Ef) a.c()).y = false;
        return a;
    }

    @Override // defpackage.DialogInterfaceOnCancelListenerC7423lm0, androidx.fragment.app.c
    public final void t0() {
        super.t0();
        DialogC5834h8 dialogC5834h8 = (DialogC5834h8) this.m0;
        if (dialogC5834h8 != null) {
            dialogC5834h8.j.k.setOnClickListener(new ViewOnClickListenerC6039hk2(this));
        }
    }

    public static void R0(PassphraseCreationDialogFragment passphraseCreationDialogFragment) {
        String obj = passphraseCreationDialogFragment.r0.getText().toString();
        if (!obj.equals(passphraseCreationDialogFragment.s0.getText().toString())) {
            passphraseCreationDialogFragment.r0.setError(null);
            passphraseCreationDialogFragment.s0.setError(passphraseCreationDialogFragment.O(R.string.f88540_resource_name_obfuscated_res_0x7f140af5));
            passphraseCreationDialogFragment.s0.requestFocus();
        } else if (obj.isEmpty()) {
            passphraseCreationDialogFragment.s0.setError(null);
            passphraseCreationDialogFragment.r0.setError(passphraseCreationDialogFragment.O(R.string.f88460_resource_name_obfuscated_res_0x7f140aed));
            passphraseCreationDialogFragment.r0.requestFocus();
        } else {
            ManageSyncSettings manageSyncSettings = (ManageSyncSettings) ((InterfaceC6382ik2) passphraseCreationDialogFragment.R(true));
            AbstractC1658Mt3 abstractC1658Mt3 = manageSyncSettings.j0;
            if (abstractC1658Mt3.h()) {
                N.Mr3aSNk6(((SyncServiceImpl) abstractC1658Mt3).c, obj);
                manageSyncSettings.V0();
            }
            passphraseCreationDialogFragment.m0.dismiss();
        }
    }
}
