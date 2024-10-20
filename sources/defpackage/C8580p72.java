package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: p72, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8580p72 {
    public final Bundle a;

    public C8580p72(Bundle bundle) {
        this.a = new Bundle(bundle);
    }

    public final String e(String str) {
        Bundle bundle = this.a;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String replace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    public final boolean a(String str) {
        String e = e(str);
        return "1".equals(e) || Boolean.parseBoolean(e);
    }

    public final Integer b(String str) {
        String e = e(str);
        if (TextUtils.isEmpty(e)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(e));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", KR0.a("Couldn't parse value of ", h(str), "(", e, ") into an int"));
            return null;
        }
    }

    public final JSONArray c(String str) {
        String e = e(str);
        if (TextUtils.isEmpty(e)) {
            return null;
        }
        try {
            return new JSONArray(e);
        } catch (JSONException unused) {
            Log.w("NotificationParams", KR0.a("Malformed JSON for key ", h(str), ": ", e, ", falling back to default"));
            return null;
        }
    }

    public static String h(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public final Bundle g() {
        Bundle bundle = this.a;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!(str.startsWith("google.c.a.") || str.equals("from"))) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public final String d(Resources resources, String str, String str2) {
        String[] strArr;
        String e = e(str2);
        if (!TextUtils.isEmpty(e)) {
            return e;
        }
        String e2 = e(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(e2)) {
            return null;
        }
        int identifier = resources.getIdentifier(e2, "string", str);
        if (identifier != 0) {
            JSONArray c = c(str2.concat("_loc_args"));
            if (c == null) {
                strArr = null;
            } else {
                int length = c.length();
                strArr = new String[length];
                for (int i = 0; i < length; i++) {
                    strArr[i] = c.optString(i);
                }
            }
            if (strArr == null) {
                return resources.getString(identifier);
            }
            try {
                return resources.getString(identifier, strArr);
            } catch (MissingFormatArgumentException e3) {
                Log.w("NotificationParams", KR0.a("Missing format argument for ", h(str2), ": ", Arrays.toString(strArr), " Default value will be used."), e3);
                return null;
            }
        }
        Log.w("NotificationParams", h(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
        return null;
    }

    public static boolean f(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }
}
