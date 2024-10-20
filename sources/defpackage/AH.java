package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class AH {
    public static String b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("applicationId cannot be null");
        }
        return a(str, null);
    }

    public static String a(String str, List list) {
        StringBuilder sb = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
        if (str != null) {
            String upperCase = str.toUpperCase();
            if (!upperCase.matches("[A-F0-9]+")) {
                throw new IllegalArgumentException("Invalid application ID: ".concat(str));
            }
            sb.append("/");
            sb.append(upperCase);
        }
        if (list != null) {
            if (list.isEmpty()) {
                throw new IllegalArgumentException("Must specify at least one namespace");
            }
            if (str == null) {
                sb.append("/");
            }
            sb.append("/");
            Iterator it = list.iterator();
            boolean z = true;
            while (it.hasNext()) {
                String str2 = (String) it.next();
                WH.e(str2);
                if (z) {
                    z = false;
                } else {
                    sb.append(",");
                }
                if (!WH.a.matcher(str2).matches()) {
                    StringBuilder sb2 = new StringBuilder(str2.length());
                    for (int i = 0; i < str2.length(); i++) {
                        char charAt = str2.charAt(i);
                        if (((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z') || ((charAt >= '0' && charAt <= '9') || charAt == '_' || charAt == '-')) || charAt == '.' || charAt == ':') {
                            sb2.append(charAt);
                        } else {
                            sb2.append(String.format("%%%04x", Integer.valueOf(charAt & 65535)));
                        }
                    }
                    str2 = sb2.toString();
                }
                sb.append(str2);
            }
        }
        if (str == null && list == null) {
            sb.append("/");
        }
        if (list == null) {
            sb.append("/");
        }
        sb.append("//ALLOW_IPV6");
        return sb.toString();
    }
}
