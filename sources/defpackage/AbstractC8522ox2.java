package defpackage;

import android.view.View;
import com.android.chrome.R;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ox2 */
/* loaded from: classes.dex */
public abstract class AbstractC8522ox2 {
    public static final void a(View view) {
        AbstractC0087Ar1.e(view, "<this>");
        C4624dd4 c4624dd4 = new C4624dd4(view, null);
        M33 m33 = new M33();
        m33.i = AbstractC0477Dr1.a(m33, m33, c4624dd4);
        while (m33.hasNext()) {
            View view2 = (View) m33.next();
            C8865px2 c8865px2 = (C8865px2) view2.getTag(R.id.pooling_container_listener_holder_tag);
            if (c8865px2 == null) {
                c8865px2 = new C8865px2();
                view2.setTag(R.id.pooling_container_listener_holder_tag, c8865px2);
            }
            ArrayList arrayList = c8865px2.a;
            AbstractC0087Ar1.e(arrayList, "<this>");
            int size = arrayList.size() - 1;
            if (-1 < size) {
                X5.a(arrayList.get(size));
                throw null;
            }
        }
    }
}
