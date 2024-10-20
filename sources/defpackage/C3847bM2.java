package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bM2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3847bM2 {
    public final JSONObject a;

    public C3847bM2(String str) {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException e) {
                AbstractC4851eH1.f("ContextualSearch", "RelatedSearchesList cannot parse JSON: " + str + "\n" + e.getMessage(), new Object[0]);
            }
        }
        this.a = jSONObject;
    }

    public final ArrayList a(boolean z) {
        ArrayList arrayList = new ArrayList();
        JSONArray b = b(z);
        if (b == null) {
            return arrayList;
        }
        for (int i = 0; i < b.length(); i++) {
            try {
                arrayList.add(b.getJSONObject(i).getString("title"));
            } catch (JSONException e) {
                AbstractC4851eH1.f("ContextualSearch", "RelatedSearchesList cannot find a query with a title at suggestion index: " + i + "\n" + e.getMessage(), new Object[0]);
            }
        }
        return arrayList;
    }

    public final JSONArray b(boolean z) {
        try {
            return this.a.getJSONArray(z ? "selection" : "content");
        } catch (JSONException e) {
            AbstractC4851eH1.f("ContextualSearch", "No suggestions found!\n" + e.getMessage(), new Object[0]);
            return null;
        }
    }
}
