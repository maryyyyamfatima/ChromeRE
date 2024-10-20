package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.base.ThreadUtils;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.autofill.PersonalDataManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class H53 {
    public static final ArrayList a = new ArrayList();
    public static H53 b;

    public static H53 a() {
        Object obj = ThreadUtils.a;
        if (b == null) {
            b = new H53();
        }
        return b;
    }

    public static void b(PersonalDataManager.CreditCard creditCard) {
        Iterator it = a.iterator();
        while (it.hasNext()) {
            PostTask.c(AbstractC5103f04.a, new E53((G53) it.next(), creditCard));
        }
    }
}
