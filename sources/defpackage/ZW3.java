package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class ZW3 {
    public String a;
    public String b;
    public final ArrayList c;
    public String[] d;
    public final HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public final boolean g;
    public final boolean[] h;

    public ZW3(String str, String str2, ArrayList arrayList, String[] strArr, boolean z, boolean z2, boolean z3, boolean z4) {
        this.h = r0;
        boolean[] zArr = {z, z2, z3};
        this.a = str;
        this.b = str2;
        this.g = z4;
        this.c = arrayList;
        this.d = strArr;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            YW3 yw3 = (YW3) it.next();
            this.e.put(yw3.a, yw3.b);
            this.f.put(yw3.a, yw3.c);
        }
    }

    public final String c() {
        return a(this.a);
    }

    public final void d(boolean z) {
        boolean[] zArr = this.h;
        if (zArr[0] && z) {
            boolean z2 = zArr[2];
            zArr[0] = false;
        }
        zArr[2] = z;
    }

    public final String a(String str) {
        return b(str) ? (String) this.e.get(str) : "";
    }

    public final boolean b(String str) {
        return !TextUtils.isEmpty(str) && this.e.containsKey(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(" -> ");
        sb.append(this.b);
        sb.append(" - Never Language:");
        boolean[] zArr = this.h;
        sb.append(zArr[0]);
        sb.append(" Always Language:");
        sb.append(zArr[2]);
        sb.append(" Never Domain:");
        sb.append(zArr[1]);
        return sb.toString();
    }
}
