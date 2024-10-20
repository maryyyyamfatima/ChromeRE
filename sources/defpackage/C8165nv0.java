package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nv0 */
/* loaded from: classes.dex */
public final class C8165nv0 extends AbstractC10705vK2 {
    public final Class a;

    public C8165nv0(Class cls) {
        this.a = cls;
    }

    @Override // defpackage.AbstractC10705vK2
    public final void g(Rect rect, View view, RecyclerView recyclerView, LK2 lk2) {
        int indexOfChild;
        super.g(rect, view, recyclerView, lk2);
        String canonicalName = view.getClass().getCanonicalName();
        Class cls = this.a;
        if (!canonicalName.equals(cls.getCanonicalName()) && recyclerView.indexOfChild(view) - 1 >= 0 && recyclerView.getChildAt(indexOfChild).getClass().getCanonicalName().equals(cls.getCanonicalName())) {
            rect.top = view.getContext().getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0803a5);
        }
    }
}
