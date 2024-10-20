package defpackage;

import com.google.android.gms.common.images.WebImage;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class WW1 {
    public static final C4856eI1 a = new C4856eI1("MetadataUtils");
    public static final String[] b;
    public static final String c;

    static {
        String[] strArr = {"Z", "+hh", "+hhmm", "+hh:mm"};
        b = strArr;
        c = AbstractC4809e90.a("yyyyMMdd'T'HHmmss", strArr[0]);
    }

    public static JSONArray a(List list) {
        if (list == null && list.isEmpty()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            WebImage webImage = (WebImage) it.next();
            webImage.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", webImage.g.toString());
                jSONObject.put("width", webImage.h);
                jSONObject.put("height", webImage.i);
            } catch (JSONException unused) {
            }
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Calendar b(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.WW1.b(java.lang.String):java.util.Calendar");
    }
}
