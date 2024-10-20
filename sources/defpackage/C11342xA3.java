package defpackage;

import java.util.HashMap;
import java.util.List;
import org.chromium.chrome.browser.tasks.tab_management.c;
import org.chromium.chrome.browser.tasks.tab_management.j;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xA3 */
/* loaded from: classes.dex */
public final /* synthetic */ class C11342xA3 {
    public final /* synthetic */ j a;

    public /* synthetic */ C11342xA3(j jVar) {
        this.a = jVar;
    }

    public final void a(int i, List list) {
        c cVar = this.a.b;
        cVar.getClass();
        cVar.k(IE2.d(list), false, false);
        if (list == null || i <= 0 || i >= list.size()) {
            return;
        }
        ID2 id2 = AbstractC1683My3.a;
        HashMap e = PropertyModel.e(new FD2[]{id2});
        DD2 dd2 = new DD2();
        dd2.a = 3;
        e.put(id2, dd2);
        cVar.a(i, 4, new PropertyModel(e));
    }
}
