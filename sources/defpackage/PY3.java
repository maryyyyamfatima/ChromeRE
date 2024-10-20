package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class PY3 extends AbstractC10705vK2 {
    public final int a;
    public final int g;

    public PY3(Resources resources) {
        this.a = resources.getDimensionPixelOffset(R.dimen.0_resource_name_obfuscated_res_0x7f0800a8);
        this.g = resources.getDimensionPixelOffset(R.dimen.0_resource_name_obfuscated_res_0x7f0800a8);
    }

    @Override // defpackage.AbstractC10705vK2
    public final void g(Rect rect, View view, RecyclerView recyclerView, LK2 lk2) {
        int i = this.a;
        rect.top = i / 2;
        rect.bottom = i / 2;
        int i2 = this.g;
        rect.left = i2;
        rect.right = i2;
    }
}
