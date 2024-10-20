package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jI, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC6572jI {
    public static Map a(InterfaceC7260lI interfaceC7260lI, C5277fX3 c5277fX3) {
        C1156Ix0 c1156Ix0;
        if (!interfaceC7260lI.isEnabled() || c5277fX3 == null || (c1156Ix0 = (C1156Ix0) c5277fX3.a(C1156Ix0.class)) == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        String str = c1156Ix0.a;
        if (str != null) {
            hashMap.put("CellLogId", str);
        }
        String str2 = c1156Ix0.c;
        if (str2 == null) {
            return hashMap;
        }
        hashMap.put("CELL_NODE_ID", str2);
        return hashMap;
    }
}
