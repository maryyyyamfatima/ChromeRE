package org.chromium.chrome.browser.password_entry_edit;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.chrome.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import org.chromium.chrome.browser.password_entry_edit.CredentialEditFragmentView;
import org.chromium.ui.widget.ButtonCompat;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class CredentialEditFragmentView extends CredentialEntryFragmentViewBase {
    public static final /* synthetic */ int q0 = 0;
    public TextInputLayout l0;
    public TextInputEditText m0;
    public TextInputLayout n0;
    public TextInputEditText o0;
    public ButtonCompat p0;

    @Override // defpackage.AbstractC0123Ay2
    public final void O0(String str, Bundle bundle) {
        getActivity().setTitle(R.string.0_resource_name_obfuscated_res_0x7f1407bb);
    }

    @Override // defpackage.AbstractC0123Ay2, androidx.fragment.app.c
    public final View i0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        F0();
        return layoutInflater.inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e00ac, viewGroup, false);
    }

    @Override // org.chromium.chrome.browser.password_entry_edit.CredentialEntryFragmentViewBase, defpackage.AbstractC0123Ay2, androidx.fragment.app.c
    public final void t0() {
        this.l0 = (TextInputLayout) this.L.findViewById(R.id.username_text_input_layout);
        this.m0 = (TextInputEditText) this.L.findViewById(R.id.username);
        final View findViewById = this.L.findViewById(R.id.copy_username_button);
        final TextInputEditText textInputEditText = this.m0;
        findViewById.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: Ya0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                int i9 = CredentialEditFragmentView.q0;
                WeakHashMap weakHashMap = Ec4.a;
                TextInputEditText textInputEditText22 = TextInputEditText.this;
                textInputEditText22.setPaddingRelative(textInputEditText22.getPaddingStart(), textInputEditText22.getPaddingTop(), findViewById.getWidth(), textInputEditText22.getPaddingBottom());
            }
        });
        this.n0 = (TextInputLayout) this.L.findViewById(R.id.password_text_input_layout);
        this.o0 = (TextInputEditText) this.L.findViewById(R.id.password);
        final View findViewById2 = this.L.findViewById(R.id.password_icons);
        final TextInputEditText textInputEditText2 = this.o0;
        findViewById2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: Ya0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                int i9 = CredentialEditFragmentView.q0;
                WeakHashMap weakHashMap = Ec4.a;
                TextInputEditText textInputEditText22 = TextInputEditText.this;
                textInputEditText22.setPaddingRelative(textInputEditText22.getPaddingStart(), textInputEditText22.getPaddingTop(), findViewById2.getWidth(), textInputEditText22.getPaddingBottom());
            }
        });
        this.p0 = (ButtonCompat) this.L.findViewById(R.id.button_primary);
        this.L.findViewById(R.id.button_secondary).setOnClickListener(new View.OnClickListener() { // from class: Xa0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = CredentialEditFragmentView.q0;
                CredentialEditFragmentView.this.R0();
            }
        });
        super.t0();
    }
}
