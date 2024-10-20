package defpackage;

import J.N;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.autofill.PersonalDataManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC9164qq implements Callable {
    public final /* synthetic */ String a;

    public CallableC9164qq(String str) {
        this.a = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (PersonalDataManager.h()) {
            String str = this.a;
            if (TextUtils.isEmpty(str)) {
                return PersonalDataManager.d().f();
            }
            PersonalDataManager d = PersonalDataManager.d();
            d.getClass();
            Object obj = ThreadUtils.a;
            PersonalDataManager.AutofillProfile autofillProfile = (PersonalDataManager.AutofillProfile) N.M172IO7Q(d.a, d, str);
            if (autofillProfile != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(autofillProfile);
                return arrayList;
            }
        }
        return null;
    }
}
