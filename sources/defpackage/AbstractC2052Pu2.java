package defpackage;

import java.lang.reflect.InvocationTargetException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Pu2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2052Pu2 {
    public static final AbstractC2312Ru2 a;

    static {
        String[] strArr;
        AbstractC2312Ru2 abstractC2312Ru2;
        strArr = AbstractC2312Ru2.d;
        try {
            abstractC2312Ru2 = AbstractC10911vv2.a();
        } catch (NoClassDefFoundError unused) {
            abstractC2312Ru2 = null;
        }
        if (abstractC2312Ru2 == null) {
            StringBuilder sb = new StringBuilder();
            for (String str : strArr) {
                try {
                    abstractC2312Ru2 = (AbstractC2312Ru2) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    th = th;
                    if (th instanceof InvocationTargetException) {
                        th = th.getCause();
                    }
                    sb.append('\n');
                    sb.append(str);
                    sb.append(": ");
                    sb.append(th);
                }
            }
            throw new IllegalStateException(sb.insert(0, "No logging platforms found:").toString());
        }
        a = abstractC2312Ru2;
    }
}
