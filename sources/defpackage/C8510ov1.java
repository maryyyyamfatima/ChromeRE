package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.chromium.ui.base.LocalizationUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ov1 */
/* loaded from: classes.dex */
public class C8510ov1 extends AbstractC10705vK2 {
    public final int a;

    public C8510ov1(int i) {
        this.a = i;
    }

    @Override // defpackage.AbstractC10705vK2
    public final void g(Rect rect, View view, RecyclerView recyclerView, LK2 lk2) {
        if (LocalizationUtils.isLayoutRtl()) {
            rect.right = j(view, recyclerView, lk2);
        } else {
            rect.left = j(view, recyclerView, lk2);
        }
    }

    public int j(View view, RecyclerView recyclerView, LK2 lk2) {
        return this.a;
    }
}
