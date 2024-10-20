package defpackage;

import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class Jk4 {
    public final boolean a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();

    public Jk4(boolean z) {
        this.a = z;
    }

    public static void b(Jk4 jk4, String str, String str2) {
        jk4.b.add(str);
        jk4.c.add(Boolean.FALSE);
        jk4.d.add(str2);
        jk4.e.add("");
        jk4.f.add("text/plain");
    }

    public static void a(Jk4 jk4, String str, String str2, boolean z, String str3, String str4) {
        jk4.b.add(str);
        jk4.d.add(str2);
        jk4.c.add(Boolean.valueOf(z));
        jk4.e.add(str3);
        jk4.f.add(str4);
    }
}
