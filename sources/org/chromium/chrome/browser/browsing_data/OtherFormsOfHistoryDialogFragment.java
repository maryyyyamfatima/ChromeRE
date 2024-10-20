package org.chromium.chrome.browser.browsing_data;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.AbstractC9108qg3;
import defpackage.C11997z52;
import defpackage.C5490g8;
import defpackage.C8765pg3;
import defpackage.DialogC5834h8;
import defpackage.DialogInterfaceOnCancelListenerC7423lm0;
import defpackage.O83;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.browsing_data.OtherFormsOfHistoryDialogFragment;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class OtherFormsOfHistoryDialogFragment extends DialogInterfaceOnCancelListenerC7423lm0 implements DialogInterface.OnClickListener {
    public static final /* synthetic */ int r0 = 0;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        O83.a.p("org.chromium.chrome.browser.settings.privacy.PREF_OTHER_FORMS_OF_HISTORY_DIALOG_SHOWN", true);
        getActivity().finish();
    }

    @Override // defpackage.DialogInterfaceOnCancelListenerC7423lm0
    public final Dialog M0(Bundle bundle) {
        super.M0(bundle);
        View inflate = getActivity().getLayoutInflater().inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e01d0, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.text);
        textView.setText(AbstractC9108qg3.a(textView.getText().toString(), new C8765pg3(new C11997z52(K(), new Callback() { // from class: Oe2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                int i = OtherFormsOfHistoryDialogFragment.r0;
                new C11598xv3(false).f(2, "https://myactivity.google.com/myactivity/?utm_source=chrome_n");
            }
        }), "<link>", "</link>")));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        C5490g8 c5490g8 = new C5490g8(getActivity(), R.style.f105200_resource_name_obfuscated_res_0x7f150545);
        c5490g8.j(inflate);
        c5490g8.i(R.string.0_resource_name_obfuscated_res_0x7f14033d);
        c5490g8.f(R.string.0_resource_name_obfuscated_res_0x7f140718, this);
        DialogC5834h8 a = c5490g8.a();
        a.setCanceledOnTouchOutside(false);
        return a;
    }
}
