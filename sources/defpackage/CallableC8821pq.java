package defpackage;

import J.N;
import android.content.ContentValues;
import java.util.concurrent.Callable;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.autofill.PersonalDataManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC8821pq implements Callable {
    public final /* synthetic */ ContentValues a;

    public CallableC8821pq(ContentValues contentValues) {
        this.a = contentValues;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ContentValues contentValues = this.a;
        PersonalDataManager.CreditCard creditCard = new PersonalDataManager.CreditCard(contentValues.getAsString("GUID"), contentValues.getAsString("ORIGIN"), contentValues.getAsString("NAME_FULL"), contentValues.getAsString("CREDIT_CARD_NUMBER"), contentValues.getAsString("CREDIT_CARD_NUMBER"), contentValues.getAsString("EXPIRATION_MONTH"), contentValues.getAsString("EXPIRATION_YEAR"));
        PersonalDataManager d = PersonalDataManager.d();
        d.getClass();
        Object obj = ThreadUtils.a;
        return N.M7sdleUt(d.a, d, creditCard);
    }
}
