package defpackage;

import android.database.Cursor;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public abstract class Kk4 {
    public static String b(Uri uri) {
        if (uri.getScheme().equals("content")) {
            Cursor query = V60.a.getContentResolver().query(uri, null, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        String string = query.getString(query.getColumnIndexOrThrow("_display_name"));
                        if (string != null) {
                            return string;
                        }
                    }
                } finally {
                    try {
                        query.close();
                    } catch (Throwable unused) {
                    }
                }
            }
            if (query != null) {
                query.close();
            }
        }
        return uri.getPath();
    }

    public static String a(Uri uri, String str, String[] strArr, String[][] strArr2) {
        if (strArr == null || strArr2 == null || strArr.length != strArr2.length) {
            return null;
        }
        for (int i = 0; i < strArr.length; i++) {
            List asList = Arrays.asList(strArr2[i]);
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            Iterator it = asList.iterator();
            boolean z = true;
            boolean z2 = false;
            while (it.hasNext()) {
                String lowerCase = ((String) it.next()).trim().toLowerCase(Locale.US);
                if (lowerCase.startsWith(".")) {
                    hashSet.add(lowerCase.substring(1));
                } else if (lowerCase.equals("*/*")) {
                    z2 = true;
                } else if (lowerCase.endsWith("/*")) {
                    hashSet3.add(lowerCase.substring(0, lowerCase.length() - 2));
                } else if (lowerCase.contains("/")) {
                    hashSet2.add(lowerCase);
                }
            }
            MimeTypeMap.getSingleton();
            if ((uri == null || !hashSet.contains(MimeTypeMap.getFileExtensionFromUrl(uri.toString()).toLowerCase(Locale.US))) && !z2 && !hashSet2.contains(str) && !hashSet3.contains(str.split("/", 2)[0])) {
                z = false;
            }
            if (z) {
                return strArr[i];
            }
        }
        return null;
    }
}
