package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Cv2 */
/* loaded from: classes.dex */
public final class C0368Cv2 extends DK2 {
    public final /* synthetic */ View a;
    public final /* synthetic */ DialogFragmentC0498Dv2 g;

    public C0368Cv2(DialogFragmentC0498Dv2 dialogFragmentC0498Dv2, View view) {
        this.g = dialogFragmentC0498Dv2;
        this.a = view;
    }

    @Override // defpackage.DK2
    public final void s(RecyclerView recyclerView, int i, int i2) {
        boolean z = !recyclerView.canScrollVertically(-1);
        View view = this.a;
        if (z) {
            view.findViewById(R.id.survey_system_info_dialog_title).setElevation(0.0f);
        } else {
            view.findViewById(R.id.survey_system_info_dialog_title).setElevation(this.g.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080772));
        }
        view.findViewById(R.id.survey_system_info_dialog_section_divider).setVisibility(recyclerView.canScrollVertically(1) ^ true ? 8 : 0);
    }
}
