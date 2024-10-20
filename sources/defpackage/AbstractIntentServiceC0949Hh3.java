package defpackage;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import org.chromium.base.BundleUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Hh3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractIntentServiceC0949Hh3 extends IntentService {
    public final String a;
    public AbstractC0819Gh3 g;

    public AbstractIntentServiceC0949Hh3(String str, String str2) {
        super(str2);
        this.a = str;
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Context b = AbstractApplicationC9799sh3.b(context);
        AbstractC0819Gh3 abstractC0819Gh3 = (AbstractC0819Gh3) BundleUtils.e(b, this.a);
        this.g = abstractC0819Gh3;
        abstractC0819Gh3.a = this;
        abstractC0819Gh3.b();
        super.attachBaseContext(b);
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        this.g.a(intent);
    }
}
