package org.chromium.chrome.browser.password_entry_edit;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.chrome.browser.password_entry_edit.FederatedCredentialFragmentView;
import org.chromium.ui.widget.ChromeImageButton;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class FederatedCredentialFragmentView extends CredentialEntryFragmentViewBase {
    public static final /* synthetic */ int n0 = 0;
    public ChromeImageButton l0;
    public TextView m0;

    @Override // defpackage.AbstractC0123Ay2
    public final void O0(String str, Bundle bundle) {
        getActivity().setTitle(R.string.0_resource_name_obfuscated_res_0x7f1407c1);
    }

    @Override // defpackage.AbstractC0123Ay2, androidx.fragment.app.c
    public final View i0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        F0();
        return layoutInflater.inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0109, viewGroup, false);
    }

    @Override // defpackage.AbstractC0123Ay2, androidx.fragment.app.c
    public final void v0(View view, Bundle bundle) {
        this.m0 = (TextView) this.L.findViewById(R.id.username);
        this.l0 = (ChromeImageButton) this.L.findViewById(R.id.copy_username_button);
        final View findViewById = this.L.findViewById(R.id.username_layout);
        final TextView textView = (TextView) this.L.findViewById(R.id.username_label);
        findViewById.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: NI0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                int i9 = FederatedCredentialFragmentView.n0;
                FederatedCredentialFragmentView federatedCredentialFragmentView = FederatedCredentialFragmentView.this;
                federatedCredentialFragmentView.getClass();
                View view3 = findViewById;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
                int dimensionPixelSize = federatedCredentialFragmentView.N().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080220);
                if (federatedCredentialFragmentView.l0.getHeight() < view3.getHeight()) {
                    marginLayoutParams.bottomMargin = dimensionPixelSize;
                } else {
                    marginLayoutParams.bottomMargin = dimensionPixelSize - ((federatedCredentialFragmentView.l0.getHeight() - federatedCredentialFragmentView.m0.getHeight()) - textView.getHeight());
                }
                view3.setLayoutParams(marginLayoutParams);
            }
        });
    }
}
