package defpackage;

import java.util.logging.Level;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zn3 */
/* loaded from: classes.dex */
public abstract class AbstractC12236zn3 {
    public static String a(String str, Object... objArr) {
        int indexOf;
        String obj;
        String valueOf = String.valueOf(str);
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj2 = objArr[i2];
            if (obj2 == null) {
                obj = "null";
            } else {
                try {
                    obj = obj2.toString();
                } catch (Exception unused) {
                    Integer.toHexString(System.identityHashCode(obj2));
                    Level level = Level.WARNING;
                    throw null;
                }
            }
            objArr[i2] = obj;
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + valueOf.length());
        int i3 = 0;
        while (i < objArr.length && (indexOf = valueOf.indexOf("%s", i3)) != -1) {
            sb.append((CharSequence) valueOf, i3, indexOf);
            sb.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        sb.append((CharSequence) valueOf, i3, valueOf.length());
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
