package defpackage;

import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sF2 */
/* loaded from: classes2.dex */
public final class C9651sF2 extends AbstractC10705vK2 {
    public final /* synthetic */ C9994tF2 a;

    public C9651sF2(C9994tF2 c9994tF2) {
        this.a = c9994tF2;
    }

    @Override // defpackage.AbstractC10705vK2
    public final void f(Rect rect, int i, RecyclerView recyclerView) {
        rect.set(0, 0, 0, 0);
        AbstractC8305oK2 abstractC8305oK2 = recyclerView.r;
        int dimensionPixelSize = this.a.a.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080848);
        rect.left = dimensionPixelSize;
        if (i == abstractC8305oK2.q() - 1) {
            rect.right = dimensionPixelSize;
        }
    }
}
