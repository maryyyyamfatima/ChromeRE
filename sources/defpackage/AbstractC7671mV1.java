package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mV1 */
/* loaded from: classes.dex */
public abstract class AbstractC7671mV1 {
    /* JADX WARN: Code restructure failed: missing block: B:71:0x018c, code lost:            if (((java.lang.Integer) r4).intValue() == 0) goto L651;     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01e8, code lost:            r6 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x019e, code lost:            if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r4).floatValue()) == 0) goto L651;     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b4, code lost:            if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r4).doubleValue()) == 0) goto L651;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(com.google.protobuf.MessageLite r13, java.lang.StringBuilder r14, int r15) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC7671mV1.c(com.google.protobuf.MessageLite, java.lang.StringBuilder, int):void");
    }

    public static final void b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            ZD zd = AbstractC4147cE.g;
            sb.append(XH3.a(new ZD(((String) obj).getBytes(AbstractC1507Lp1.a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC4147cE) {
            sb.append(": \"");
            sb.append(XH3.a((AbstractC4147cE) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof QX0) {
            sb.append(" {");
            c((QX0) obj, sb, i + 2);
            sb.append("\n");
            while (i2 < i) {
                sb.append(' ');
                i2++;
            }
            sb.append("}");
            return;
        }
        if (obj instanceof Map.Entry) {
            sb.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            int i4 = i + 2;
            b(sb, i4, "key", entry.getKey());
            b(sb, i4, "value", entry.getValue());
            sb.append("\n");
            while (i2 < i) {
                sb.append(' ');
                i2++;
            }
            sb.append("}");
            return;
        }
        sb.append(": ");
        sb.append(obj);
    }

    public static final String a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }
}
