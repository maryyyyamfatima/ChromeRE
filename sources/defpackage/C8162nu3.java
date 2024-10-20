package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nu3 */
/* loaded from: classes.dex */
public final class C8162nu3 extends DK2 {
    public final /* synthetic */ View a;
    public final /* synthetic */ C8506ou3 g;

    public C8162nu3(C8506ou3 c8506ou3, View view) {
        this.g = c8506ou3;
        this.a = view;
    }

    @Override // defpackage.DK2
    public final void s(RecyclerView recyclerView, int i, int i2) {
        boolean z = !recyclerView.canScrollVertically(-1);
        View view = this.a;
        if (z) {
            view.findViewById(R.id.survey_system_info_dialog_title).setElevation(0.0f);
        } else {
            view.findViewById(R.id.survey_system_info_dialog_title).setElevation(this.g.N().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080772));
        }
        view.findViewById(R.id.survey_system_info_dialog_section_divider).setVisibility(recyclerView.canScrollVertically(1) ^ true ? 8 : 0);
    }
}
