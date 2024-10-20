package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import com.android.chrome.R;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: su3 */
/* loaded from: classes.dex */
public final class C9877su3 extends AbstractC8305oK2 {
    public List i;

    @Override // defpackage.AbstractC8305oK2
    public final void C(d dVar, int i) {
        C8776pi2 c8776pi2 = (C8776pi2) this.i.get(i);
        View view = ((C9534ru3) dVar).z;
        ((TextView) view.findViewById(R.id.survey_system_info_item_key)).setText((CharSequence) c8776pi2.a);
        ((TextView) view.findViewById(R.id.survey_system_info_item_value)).setText((CharSequence) c8776pi2.b);
    }

    @Override // defpackage.AbstractC8305oK2
    public final d E(int i, RecyclerView recyclerView) {
        return new C9534ru3(AbstractC9192qu3.a(recyclerView, R.layout.0_resource_name_obfuscated_res_0x7f0e02a1, recyclerView, false));
    }

    @Override // defpackage.AbstractC8305oK2
    public final int q() {
        List list = this.i;
        if (list == null) {
            return 0;
        }
        return list.size();
    }
}
