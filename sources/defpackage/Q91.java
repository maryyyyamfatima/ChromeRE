package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class Q91 {
    public static final String f = System.getProperty("http.agent");
    public final String a;
    public final ArrayList b = new ArrayList();
    public final Context c;
    public final String d;
    public final C9957t82 e;

    public final boolean a(C4259ca1 c4259ca1) {
        int i = c4259ca1.a;
        if (!(i >= 200 && i <= 299)) {
            Log.e("SurveyHttpBaseReq", "Received non-success status code " + i + " for " + getClass().getSimpleName());
        } else {
            if (c4259ca1.b != null) {
                return true;
            }
            Log.e("SurveyHttpBaseReq", "Received no data for successful response for ".concat(getClass().getSimpleName()));
        }
        return false;
    }

    public Q91(String str, Context context, String str2, C9957t82 c9957t82) {
        this.a = str;
        this.c = context;
        this.d = str2;
        this.e = c9957t82;
    }

    public final void b() {
        String str;
        ArrayList arrayList = this.b;
        arrayList.add(new U91("User-Agent", f));
        Context context = this.c;
        int i = AbstractC3208Yr3.b;
        try {
            str = AbstractC3208Yr3.d(context.getPackageManager().getPackageInfo(context.getPackageName(), 64));
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("SurveyUtils", "Package not found.", e);
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            arrayList.add(new U91("X-Android-Cert", str));
        }
        String packageName = context.getPackageName();
        if (!TextUtils.isEmpty(packageName)) {
            arrayList.add(new U91("X-Android-Package", packageName));
        }
        C9957t82 c9957t82 = this.e;
        if (c9957t82 != null) {
            try {
                TL2 a = c9957t82.a();
                if (a.containsKey("Authorization")) {
                    String str2 = (String) ((List) a.get("Authorization")).get(0);
                    if (!TextUtils.isEmpty(str2)) {
                        arrayList.add(new U91("Authorization", str2));
                    }
                }
                throw new D84();
            } catch (D84 | IOException unused) {
                Log.e("SurveyHttpBaseReq", "Updating auth token failed for " + this.a);
            }
        } else {
            if (!TextUtils.isEmpty("")) {
                arrayList.add(new U91("Cookie", ""));
            }
            String str3 = this.d;
            if (!TextUtils.isEmpty(str3)) {
                arrayList.add(new U91("X-Goog-Api-Key", str3));
            }
        }
        arrayList.add(new U91("Content-Type", "application/x-protobuf"));
    }
}
