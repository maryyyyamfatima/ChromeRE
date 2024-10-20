package defpackage;

import android.content.Context;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class M04 extends AbstractC11339xA0 {
    public final /* synthetic */ Q04 a;

    public M04(Q04 q04) {
        this.a = q04;
    }

    @Override // defpackage.AbstractC11339xA0
    public final void a(List list, ArrayList arrayList, boolean z) {
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Tab tab = (Tab) list.get(i);
            arrayList2.add(new P04(tab, ((Integer) arrayList.get(i)).intValue(), z ? ((Tab) list.get(0)).getId() : tab.getId()));
        }
        Q04 q04 = this.a;
        q04.getClass();
        C12188zf3 a = C12188zf3.a(String.format(Locale.getDefault(), "%d", Integer.valueOf(arrayList2.size())), q04, 0, 32);
        Context context = q04.a;
        a.c = context.getString(R.string.0_resource_name_obfuscated_res_0x7f140b72);
        a.d = context.getString(R.string.0_resource_name_obfuscated_res_0x7f140b6e);
        a.e = arrayList2;
        q04.h.c(a);
    }
}
