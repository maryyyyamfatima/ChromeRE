package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iM3 */
/* loaded from: classes2.dex */
public final class C6254iM3 extends AbstractC10705vK2 {
    public final int a;
    public final /* synthetic */ C6940kM3 g;

    public C6254iM3(C6940kM3 c6940kM3, Context context) {
        this.g = c6940kM3;
        this.a = context.getResources().getDimensionPixelOffset(R.dimen.0_resource_name_obfuscated_res_0x7f0807d3);
    }

    @Override // defpackage.AbstractC10705vK2
    public final void g(Rect rect, View view, RecyclerView recyclerView, LK2 lk2) {
        recyclerView.getClass();
        int J2 = RecyclerView.J(view);
        int i = this.a;
        if (J2 != 0) {
            rect.left = i / 2;
        }
        if (J2 != this.g.a.size() - 1) {
            rect.right = i / 2;
        }
    }
}
