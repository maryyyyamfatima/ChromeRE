package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ft2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5405ft2 {
    public static final C4317ck a = new C4317ck();

    public static synchronized Uri a(String str) {
        Uri uri;
        synchronized (AbstractC5405ft2.class) {
            C4317ck c4317ck = a;
            uri = (Uri) c4317ck.get(str);
            if (uri == null) {
                uri = Uri.parse("content://com.google.android.gms.phenotype/" + Uri.encode(str));
                c4317ck.put(str, uri);
            }
        }
        return uri;
    }

    public static String b(Context context, String str) {
        if (str.contains("#")) {
            throw new IllegalArgumentException("The passed in package cannot already have a subpackage: ".concat(str));
        }
        return str + "#" + context.getPackageName();
    }
}
