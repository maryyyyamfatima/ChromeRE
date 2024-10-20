package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Xs2 */
/* loaded from: classes.dex */
public abstract class AbstractC3082Xs2 {
    public static final BT2 a = new BT2(new ConcurrentHashMap());
    public static final BN2 b = new BN2(E4.k);
    public static final Object c = new Object();
    public static volatile C6555jE2 d = null;

    public static C5869hE2 b(C7123kt2 c7123kt2) {
        C5869hE2 c5869hE2;
        C1444Lc3 c1444Lc3 = C1444Lc3.a;
        byte b2 = (byte) (((byte) 2) | 1);
        Context context = c7123kt2.a;
        Pattern pattern = AbstractC3576ab.a;
        C3249Za c3249Za = new C3249Za(context);
        c3249Za.b();
        c3249Za.e = "all_accounts.pb";
        Uri a2 = c3249Za.a();
        if (a2 == null) {
            throw new NullPointerException("Null uri");
        }
        E4 e4 = E4.k;
        if (e4 != null) {
            BN2 bn2 = b;
            if (bn2 == null) {
                throw new NullPointerException("Null handler");
            }
            byte b3 = (byte) (b2 | 2);
            C0172Bi1 c0172Bi1 = AbstractC0562Ei1.g;
            OL2 ol2 = OL2.j;
            if (b3 != 3) {
                StringBuilder sb = new StringBuilder();
                if ((b3 & 1) == 0) {
                    sb.append(" useGeneratedExtensionRegistry");
                }
                if ((2 & b3) == 0) {
                    sb.append(" enableTracing");
                }
                throw new IllegalStateException("Missing required properties:".concat(String.valueOf(sb)));
            }
            C11895yo c11895yo = new C11895yo(a2, e4, bn2, ol2, c1444Lc3, true, false);
            C6555jE2 c6555jE2 = d;
            if (c6555jE2 == null) {
                synchronized (c) {
                    c6555jE2 = d;
                    if (c6555jE2 == null) {
                        HashMap hashMap = new HashMap();
                        InterfaceScheduledExecutorServiceC4493dE1 a3 = c7123kt2.a();
                        C3694au3 c3694au3 = (C3694au3) c7123kt2.e.get();
                        C2743Vc3 c2743Vc3 = C2743Vc3.a;
                        hashMap.containsKey("singleproc");
                        hashMap.put("singleproc", c2743Vc3);
                        C6555jE2 c6555jE22 = new C6555jE2(a3, c3694au3, hashMap);
                        d = c6555jE22;
                        c6555jE2 = c6555jE22;
                    }
                }
            }
            synchronized (c6555jE2) {
                c5869hE2 = (C5869hE2) c6555jE2.a.get(a2);
                if (c5869hE2 == null) {
                    c5869hE2 = c6555jE2.b(c11895yo);
                    c6555jE2.a.put(a2, c5869hE2);
                    c6555jE2.b.put(a2, c11895yo);
                } else {
                    C6555jE2.a(c11895yo, (C11895yo) c6555jE2.b.get(a2));
                }
            }
            return c5869hE2;
        }
        throw new NullPointerException("Null schema");
    }

    public static boolean a(File file) {
        boolean z;
        if (file.isDirectory()) {
            z = true;
            for (File file2 : file.listFiles()) {
                z = z && a(file2);
            }
        } else {
            z = true;
        }
        return z && file.delete();
    }
}
