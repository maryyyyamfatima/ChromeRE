package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class M74 {
    public float c;
    public LinkedHashMap a = null;
    public ArrayList b = null;
    public long d = 0;

    public abstract float b(long j);

    public final M74 c(String str) {
        String str2;
        LinkedHashMap linkedHashMap = this.a;
        M74 m74 = linkedHashMap == null ? null : (M74) linkedHashMap.get(str);
        if (m74 != null) {
            return m74;
        }
        LinkedHashMap linkedHashMap2 = this.a;
        if (linkedHashMap2 != null) {
            Iterator it = linkedHashMap2.keySet().iterator();
            String str3 = "";
            while (it.hasNext()) {
                str3 = str3 + "'" + ((String) it.next()) + "'";
                if (!it.hasNext()) {
                    str3 = AbstractC7848n0.a(str3, ", ");
                }
            }
            str2 = AbstractC4199cO1.a("[", str3, "]");
        } else {
            str2 = "[]";
        }
        throw new RuntimeException(IR0.a("Tried to get non-existent input '", str, "'. Node only has these inputs: ", str2));
    }
}
