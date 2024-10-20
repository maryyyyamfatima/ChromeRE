package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.TimeZone;
import org.chromium.chrome.browser.locale.LocaleManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class LB2 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        MK mk = LocaleManager.getInstance().a.j;
        mk.a();
        mk.b.getClass();
        TimeZone c = LF1.c();
        String trim = c.getID().trim();
        ArrayList arrayList = MK.d;
        int i2 = 1;
        if (arrayList.contains(trim)) {
            i = arrayList.indexOf(trim);
        } else {
            i = c.getRawOffset() == 28800000 ? 1 : 0;
        }
        EI2.h(i, arrayList.size(), "China.UserTimeZone");
        String b = LF1.b();
        boolean isEmpty = TextUtils.isEmpty(b);
        String[] strArr = MK.e;
        if (!isEmpty) {
            i2 = 2;
            while (true) {
                if (i2 >= strArr.length) {
                    i2 = 0;
                    break;
                } else if (strArr[i2].equals(b)) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        EI2.h(i2, strArr.length, "China.UserSimCountry");
    }
}
