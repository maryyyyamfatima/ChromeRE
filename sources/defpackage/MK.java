package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class MK {
    public static final List c;
    public static final ArrayList d;
    public static final String[] e;
    public int a = -1;
    public final LF1 b;

    static {
        List asList = Arrays.asList("Asia/Shanghai", "Asia/Harbin", "Asia/Chongqing", "Asia/Urumqi", "Asia/Kashgar");
        c = asList;
        List asList2 = Arrays.asList("Asia/Hong_Kong", "Asia/Taipei", "Asia/Macau", "Asia/Chungking", "Hongkong", "PRC", "ROC", "Etc/GMT-8");
        ArrayList arrayList = new ArrayList();
        d = arrayList;
        e = new String[]{"", "", "CN", "TW", "MO", "HK"};
        arrayList.add("");
        arrayList.add("");
        arrayList.addAll(asList);
        arrayList.addAll(asList2);
    }

    public MK(LF1 lf1) {
        this.b = lf1;
    }

    public final int a() {
        int i;
        int i2 = this.a;
        if (i2 != -1) {
            return i2;
        }
        Q83 q83 = O83.a;
        int f = q83.f(-1, "LocaleManager_USR_TYPE");
        this.a = f;
        if (f == -1) {
            this.b.getClass();
            String a = LF1.a();
            if (a != null && !TextUtils.isEmpty(a)) {
                i = "CN".equals(a) ? 0 : 3;
            } else {
                String b = LF1.b();
                if (b != null && !TextUtils.isEmpty(b)) {
                    i = "CN".equals(b) ? 1 : 4;
                } else {
                    i = c.contains(LF1.c().getID()) ? 2 : 5;
                }
            }
            this.a = i;
            q83.q(i, "LocaleManager_USR_TYPE");
        }
        return this.a;
    }
}
