package defpackage;

import android.app.LocaleManager;
import android.os.LocaleList;
import java.util.Locale;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class HF1 {
    public final LocaleManager a = (LocaleManager) V60.a.getSystemService("locale");

    public final Locale a() {
        boolean isEmpty;
        Locale locale;
        LocaleList applicationLocales = this.a.getApplicationLocales();
        isEmpty = applicationLocales.isEmpty();
        if (isEmpty) {
            return null;
        }
        locale = applicationLocales.get(0);
        return locale;
    }

    public final void c(String str) {
        LocaleList forLanguageTags;
        LocaleList emptyLocaleList;
        LocaleManager localeManager = this.a;
        if (str == null) {
            emptyLocaleList = LocaleList.getEmptyLocaleList();
            localeManager.setApplicationLocales(emptyLocaleList);
        } else {
            forLanguageTags = LocaleList.forLanguageTags(str);
            localeManager.setApplicationLocales(forLanguageTags);
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0010 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList b() {
        /*
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.app.LocaleManager r1 = r4.a
            android.os.LocaleList r1 = r1.getSystemLocales()
            r2 = 0
        Lc:
            int r3 = defpackage.Lu4.a(r1)
            if (r2 >= r3) goto L1c
            java.util.Locale r3 = defpackage.Mu4.a(r1, r2)
            r0.add(r3)
            int r2 = r2 + 1
            goto Lc
        L1c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.HF1.b():java.util.ArrayList");
    }
}
