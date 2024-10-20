package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ou3 */
/* loaded from: classes.dex */
public final class C8506ou3 extends DialogInterfaceOnCancelListenerC7423lm0 {
    public static final String r0 = "SurveySysInfoDialog-".concat(C8506ou3.class.getSimpleName());

    @Override // defpackage.DialogInterfaceOnCancelListenerC7423lm0
    public final Dialog M0(Bundle bundle) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper((VS0) getActivity(), R.style.f99320_resource_name_obfuscated_res_0x7f1502f9);
        View inflate = ((LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater")).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e02a0, (ViewGroup) null);
        inflate.getContext().setTheme(R.style.f99020_resource_name_obfuscated_res_0x7f1502db);
        final DialogC5834h8 a = AbstractC10028tM1.a(contextThemeWrapper).j(inflate).a();
        inflate.findViewById(R.id.survey_system_info_dialog_ok_button).setOnClickListener(new View.OnClickListener() { // from class: mu3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str = C8506ou3.r0;
                DialogC5834h8.this.cancel();
            }
        });
        Bundle bundle2 = this.l;
        String string = bundle2.getString("EXTRA_ACCOUNT_NAME");
        Bundle bundle3 = bundle2.getBundle("EXTRA_PSD_BUNDLE");
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.survey_system_info_dialog_list_items);
        recyclerView.q0(new LinearLayoutManager());
        C9877su3 c9877su3 = new C9877su3();
        recyclerView.n0(c9877su3);
        recyclerView.i(new C8162nu3(this, inflate));
        c9877su3.i = AbstractC3208Yr3.k(contextThemeWrapper, string, bundle3);
        c9877su3.t();
        return a;
    }
}
