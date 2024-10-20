package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yX, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11796yX extends AX {
    public final HashMap b = new HashMap();
    public final ArrayList c;
    public int d;

    public C11796yX(String[] strArr) {
        String str;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.d = 1;
        if (strArr == null || strArr.length == 0 || (str = strArr[0]) == null) {
            arrayList.add("");
            return;
        }
        arrayList.add(str);
        int i = 1;
        boolean z = true;
        for (String str2 : strArr) {
            if (i > 0) {
                i--;
            } else {
                z = str2.equals("--") ? false : z;
                if (z && str2.startsWith("--")) {
                    String[] split = str2.split("=", 2);
                    b(split[0].substring(2), split.length > 1 ? split[1] : null);
                } else {
                    this.c.add(str2);
                }
            }
        }
    }

    @Override // defpackage.AX
    public final String[] d() {
        ArrayList arrayList = this.c;
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Override // defpackage.AX
    public final boolean g(String str) {
        return this.b.containsKey(str);
    }

    @Override // defpackage.AX
    public final String f(String str) {
        String str2 = (String) this.b.get(str);
        if (str2 == null || str2.isEmpty()) {
            return null;
        }
        return str2;
    }

    @Override // defpackage.AX
    public final void a(String str) {
        b(str, null);
    }

    @Override // defpackage.AX
    public final void b(String str, String str2) {
        this.b.put(str, str2 == null ? "" : str2);
        String str3 = "--" + str;
        if (str2 != null && !str2.isEmpty()) {
            str3 = AbstractC8192o0.a(str3, "=", str2);
        }
        int i = this.d;
        this.d = i + 1;
        this.c.add(i, str3);
    }
}
