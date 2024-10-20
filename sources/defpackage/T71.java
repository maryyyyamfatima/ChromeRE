package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class T71 {
    public static String a(int i, C7177l24 c7177l24) {
        String str = "Unknown";
        String concat = "GoogleUpdate.Result.".concat(i != 0 ? i != 1 ? "Unknown" : "TimeWindow" : "Session");
        if (c7177l24 == null) {
            return concat;
        }
        StringBuilder a = M41.a(concat, ".");
        int i2 = c7177l24.m;
        char c = i2 != -1 ? i2 != 0 ? (char) 0 : (char) 2 : (char) 1;
        if (c == 0) {
            c = 1;
        }
        a.append(c == 2 ? "Intent" : "Unknown");
        StringBuilder a2 = M41.a(a.toString(), ".");
        int a3 = AbstractC6147i24.a(c7177l24.n);
        int i3 = a3 != 0 ? a3 : 1;
        if (i3 == 2) {
            str = "Menu";
        } else if (i3 == 3) {
            str = "Infobar";
        } else if (i3 == 4) {
            str = "Notification";
        }
        a2.append(str);
        return a2.toString();
    }
}
