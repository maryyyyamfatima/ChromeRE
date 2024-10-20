package org.chromium.chrome.browser.language;

import android.text.TextUtils;
import defpackage.AbstractC3361Zw1;
import defpackage.AbstractC3710ax1;
import java.util.ArrayList;
import java.util.concurrent.TimeoutException;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class LanguageBridge {
    public static String[] getULPLanguages(String str) {
        ArrayList arrayList;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        boolean z = str != null;
        Object obj = ThreadUtils.a;
        try {
            arrayList = AbstractC3361Zw1.a(str);
            AbstractC3710ax1.a(0, z);
        } catch (TimeoutException unused) {
            AbstractC3710ax1.a(2, z);
            arrayList = new ArrayList();
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        } catch (Exception unused2) {
            AbstractC3710ax1.a(3, z);
            arrayList = new ArrayList();
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
