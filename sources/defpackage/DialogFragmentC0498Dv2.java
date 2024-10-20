package defpackage;

import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Dv2 */
/* loaded from: classes.dex */
public final class DialogFragmentC0498Dv2 extends DialogFragment {
    public static final String a = "SurveyPlatSysInfoDialog-".concat(DialogFragmentC0498Dv2.class.getSimpleName());

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getActivity(), R.style.f99320_resource_name_obfuscated_res_0x7f1502f9);
        View inflate = ((LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater")).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e02a0, (ViewGroup) null);
        inflate.getContext().setTheme(R.style.f99020_resource_name_obfuscated_res_0x7f1502db);
        final DialogC5834h8 a2 = AbstractC10028tM1.a(contextThemeWrapper).j(inflate).a();
        inflate.findViewById(R.id.survey_system_info_dialog_ok_button).setOnClickListener(new View.OnClickListener() { // from class: Bv2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogC5834h8.this.cancel();
            }
        });
        Bundle arguments = getArguments();
        String string = arguments.getString("EXTRA_ACCOUNT_NAME");
        Bundle bundle2 = arguments.getBundle("EXTRA_PSD_BUNDLE");
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.survey_system_info_dialog_list_items);
        recyclerView.q0(new LinearLayoutManager());
        C9877su3 c9877su3 = new C9877su3();
        recyclerView.n0(c9877su3);
        recyclerView.i(new C0368Cv2(this, inflate));
        c9877su3.i = AbstractC3208Yr3.k(contextThemeWrapper, string, bundle2);
        c9877su3.t();
        return a2;
    }
}
