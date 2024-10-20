package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xT3 */
/* loaded from: classes2.dex */
public final class C11437xT3 extends AbstractC10705vK2 {
    public final int a;
    public final Context g;

    public C11437xT3(Context context, int i) {
        this.a = i;
        this.g = context;
    }

    @Override // defpackage.AbstractC10705vK2
    public final void g(Rect rect, View view, RecyclerView recyclerView, LK2 lk2) {
        rect.top = this.a;
    }

    @Override // defpackage.AbstractC10705vK2
    public final void h(Canvas canvas, RecyclerView recyclerView) {
        for (int i = 0; i < recyclerView.getChildCount(); i++) {
            View childAt = recyclerView.getChildAt(i);
            int J2 = RecyclerView.J(childAt);
            int s = recyclerView.r.s(J2);
            if (!(s == 1 || !(s == 2 || s == 3))) {
                AbstractC8305oK2 abstractC8305oK2 = recyclerView.r;
                childAt.setBackground(AbstractC2884Wf.a(this.g, !AbstractC0193Bm2.l() ? R.drawable.0_resource_name_obfuscated_res_0x7f0904cf : abstractC8305oK2.s(abstractC8305oK2.q() - 1) == 4 ? R.drawable.0_resource_name_obfuscated_res_0x7f0904d1 : J2 == 1 ? R.drawable.0_resource_name_obfuscated_res_0x7f0904d3 : J2 == recyclerView.r.q() - 1 ? R.drawable.0_resource_name_obfuscated_res_0x7f0904d2 : R.drawable.0_resource_name_obfuscated_res_0x7f0904d0));
            }
        }
    }
}
