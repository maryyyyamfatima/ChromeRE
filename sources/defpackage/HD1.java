package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class HD1 implements TD2 {
    @Override // defpackage.TD2
    public final void d(WD2 wd2, Object obj, Object obj2) {
        PropertyModel propertyModel = (PropertyModel) wd2;
        RecyclerView recyclerView = (RecyclerView) obj;
        FD2 fd2 = (FD2) obj2;
        LD2 ld2 = GD1.l;
        if (fd2 == ld2) {
            if (propertyModel.j(ld2)) {
                if (recyclerView.S == null) {
                    recyclerView.p0((AbstractC2348Sb3) recyclerView.getTag(R.id.item_animator));
                    recyclerView.setTag(R.id.item_animator, null);
                    return;
                }
                return;
            }
            AbstractC2348Sb3 abstractC2348Sb3 = recyclerView.S;
            if (abstractC2348Sb3 != null) {
                recyclerView.setTag(R.id.item_animator, abstractC2348Sb3);
                recyclerView.p0(null);
                return;
            }
            return;
        }
        if (fd2 == GD1.m || fd2 == GD1.n || fd2 == GD1.o || fd2 == GD1.p || fd2 == GD1.q || fd2 == GD1.r || fd2 == GD1.t || fd2 == GD1.v || fd2 == GD1.s || fd2 == GD1.w) {
            AbstractC8305oK2 abstractC8305oK2 = recyclerView.r;
            abstractC8305oK2.a.d(null, 0, abstractC8305oK2.q());
        }
    }
}
