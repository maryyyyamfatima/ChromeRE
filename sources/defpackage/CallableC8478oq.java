package defpackage;

import J.N;
import android.content.ContentValues;
import java.util.concurrent.Callable;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.autofill.PersonalDataManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC8478oq implements Callable {
    public final /* synthetic */ ContentValues a;

    public CallableC8478oq(ContentValues contentValues) {
        this.a = contentValues;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        StringBuilder sb = new StringBuilder();
        ContentValues contentValues = this.a;
        sb.append(contentValues.getAsString("ADDRESS_LINE1"));
        sb.append("\n");
        sb.append(contentValues.getAsString("ADDRESS_LINE2"));
        String sb2 = sb.toString();
        PersonalDataManager.AutofillProfile autofillProfile = new PersonalDataManager.AutofillProfile(contentValues.getAsString("GUID"), contentValues.getAsString("ORIGIN"), true, new C2042Ps2("", 4), new C2042Ps2(contentValues.getAsString("NAME_FULL"), 4), new C2042Ps2(contentValues.getAsString("COMPANY_NAME"), 4), new C2042Ps2(sb2, 4), new C2042Ps2(contentValues.getAsString("ADDRESS_STATE"), 4), new C2042Ps2(contentValues.getAsString("ADDRESS_CITY"), 4), new C2042Ps2("", 4), new C2042Ps2(contentValues.getAsString("ADDRESS_ZIP"), 4), new C2042Ps2("", 4), new C2042Ps2(contentValues.getAsString("ADDRESS_COUNTRY_CODE"), 4), new C2042Ps2(contentValues.getAsString("PHONE_WHOLE_NUMBER"), 4), new C2042Ps2(contentValues.getAsString("EMAIL_ADDRESS"), 4), "");
        PersonalDataManager d = PersonalDataManager.d();
        d.getClass();
        Object obj = ThreadUtils.a;
        return N.MgzFcfQz(d.a, d, autofillProfile);
    }
}
