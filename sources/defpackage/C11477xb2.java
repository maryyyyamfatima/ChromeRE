package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import org.chromium.chrome.browser.tab.Tab;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xb2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11477xb2 {
    public final String a;
    public final String[] b;

    public C11477xb2(String str) {
        String str2 = "";
        String[] strArr = null;
        try {
            try {
                JSONArray jSONArray = new JSONArray(str);
                if (jSONArray.length() == 2) {
                    String string = jSONArray.getString(0);
                    try {
                        JSONArray jSONArray2 = jSONArray.getJSONArray(1);
                        int length = jSONArray2.length();
                        String[] strArr2 = new String[length];
                        for (int i = 0; i < length; i++) {
                            try {
                                strArr2[i] = jSONArray2.getString(i);
                            } catch (Throwable th) {
                                th = th;
                                str2 = string;
                                strArr = strArr2;
                                this.a = str2;
                                this.b = strArr;
                                throw th;
                            }
                        }
                        str2 = string;
                        strArr = strArr2;
                    } catch (Throwable th2) {
                        th = th2;
                        str2 = string;
                    }
                }
                this.a = str2;
                this.b = strArr;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (JSONException unused) {
            this.a = "";
            this.b = null;
        }
    }

    public C11477xb2(Context context, Tab tab) {
        C1663Mu3 c1663Mu3 = (C1663Mu3) tab.F().b(C1663Mu3.class);
        String[] strArr = null;
        String str = c1663Mu3 != null ? c1663Mu3.g : null;
        if (TextUtils.isEmpty(str)) {
            this.a = "";
            this.b = null;
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo(str, 64).signatures;
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                int length = signatureArr.length;
                String[] strArr2 = new String[length];
                for (int i = 0; i < length; i++) {
                    messageDigest.update(signatureArr[i].toByteArray());
                    byte[] digest = messageDigest.digest();
                    strArr2[i] = digest == null ? null : Base64.encodeToString(digest, 0);
                }
                Arrays.sort(strArr2);
                strArr = strArr2;
            } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
            }
        }
        this.b = strArr;
        if (strArr == null) {
            this.a = "";
        } else {
            this.a = str;
        }
    }

    public C11477xb2() {
        this.a = "";
        this.b = null;
    }

    public final String a() {
        String str = this.a;
        boolean isEmpty = TextUtils.isEmpty(str);
        String[] strArr = this.b;
        if (isEmpty || strArr == null) {
            return "";
        }
        JSONArray jSONArray = new JSONArray();
        for (String str2 : strArr) {
            jSONArray.put(str2);
        }
        return new JSONArray().put(str).put(jSONArray).toString();
    }

    public final String toString() {
        return a();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C11477xb2)) {
            return false;
        }
        C11477xb2 c11477xb2 = (C11477xb2) obj;
        return this.a.equals(c11477xb2.a) && Arrays.equals(this.b, c11477xb2.b);
    }

    public final int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.a, this.b});
    }
}
