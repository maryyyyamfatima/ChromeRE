package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ar2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3675ar2 {
    public final HashMap a = new HashMap();

    public final void a(int i, int i2, PropertyModel propertyModel, boolean z) {
        Integer valueOf = Integer.valueOf((i * 10) + i2);
        HashMap hashMap = this.a;
        List list = (List) hashMap.get(valueOf);
        if (list == null) {
            list = new ArrayList();
            hashMap.put(valueOf, list);
        }
        list.add(z ? 0 : list.size(), propertyModel);
    }
}
