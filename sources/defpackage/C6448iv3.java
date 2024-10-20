package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iv3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6448iv3 {
    public final List a;
    public final List b;

    public C6448iv3(ArrayList arrayList, ArrayList arrayList2) {
        this.a = Collections.unmodifiableList(arrayList);
        this.b = Collections.unmodifiableList(arrayList2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C6448iv3)) {
            return false;
        }
        C6448iv3 c6448iv3 = (C6448iv3) obj;
        List list = c6448iv3.b;
        List list2 = this.b;
        if (list2 != null ? list2.equals(list) : list == null) {
            List list3 = c6448iv3.a;
            List list4 = this.a;
            if (list4 == null) {
                if (list3 == null) {
                    return true;
                }
            } else if (list4.equals(list3)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        List list = this.b;
        int hashCode = (527 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.a;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public static LinkedList a(String str) {
        JSONArray jSONArray = new JSONArray(str);
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            linkedList.add(new C6106hv3(Integer.parseInt(jSONObject.getString("id")), jSONObject.getString("title"), jSONObject.getString("url"), jSONObject.getString("referrer"), Long.parseLong(jSONObject.getString("timestamp")), null, false));
        }
        return linkedList;
    }
}
