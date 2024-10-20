package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Mn1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1626Mn1 {
    public static final HashMap b = new HashMap();
    public static final Object c = new Object();
    public final C0457Dn1 a;

    public C1626Mn1(C0457Dn1 c0457Dn1) {
        this.a = c0457Dn1;
    }

    public static C1626Mn1 a(String str) {
        C1626Mn1 c1626Mn1;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("subtype must not be empty");
        }
        synchronized (c) {
            HashMap hashMap = b;
            c1626Mn1 = (C1626Mn1) hashMap.get(str);
            if (c1626Mn1 == null) {
                Bundle bundle = new Bundle();
                bundle.putCharSequence("subtype", str);
                C1626Mn1 c1626Mn12 = new C1626Mn1(C0457Dn1.e(V60.a, bundle));
                hashMap.put(str, c1626Mn12);
                c1626Mn1 = c1626Mn12;
            }
        }
        return c1626Mn1;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String b(java.lang.String r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1626Mn1.b(java.lang.String, java.lang.String):java.lang.String");
    }
}
