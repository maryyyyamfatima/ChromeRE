package defpackage;

import java.util.HashMap;
import java.util.Map;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qO3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C9012qO3 implements Callback {
    public final /* synthetic */ C10383uO3 a;
    public final /* synthetic */ String g;
    public final /* synthetic */ MC2 h;

    public /* synthetic */ C9012qO3(C10383uO3 c10383uO3, String str, MC2 mc2) {
        this.a = c10383uO3;
        this.g = str;
        this.h = mc2;
    }

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        final Map map = (Map) obj;
        C10383uO3 c10383uO3 = this.a;
        c10383uO3.getClass();
        final String str = this.g;
        boolean containsKey = map.containsKey(str);
        final MC2 mc2 = this.h;
        if (!containsKey) {
            mc2.b(null);
            return;
        }
        AbstractC7533m44.a(3);
        HashMap hashMap = new HashMap(map);
        hashMap.remove(str);
        c10383uO3.c.a(hashMap, new Callback() { // from class: rO3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj2) {
                return new ZE(this, obj2);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj2) {
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                MC2 mc22 = mc2;
                if (booleanValue) {
                    map.remove(str);
                    mc22.b(null);
                } else {
                    mc22.e(null);
                }
            }
        });
    }
}
