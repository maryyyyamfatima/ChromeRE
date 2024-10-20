package defpackage;

import android.app.PendingIntent;
import android.content.IntentSender;
import androidx.fragment.app.c;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Pt3 */
/* loaded from: classes.dex */
public final /* synthetic */ class C2048Pt3 implements Callback {
    public final /* synthetic */ c a;
    public final /* synthetic */ int g;

    public /* synthetic */ C2048Pt3(int i, AbstractC0123Ay2 abstractC0123Ay2) {
        this.a = abstractC0123Ay2;
        this.g = i;
    }

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        c cVar = this.a;
        int i = this.g;
        try {
            cVar.K0(((PendingIntent) obj).getIntentSender(), i, null, 0, 0, 0, null);
        } catch (IntentSender.SendIntentException e) {
            AbstractC4851eH1.f("SyncSettingsUtils", "Error sending trusted vault intent for code ", Integer.valueOf(i), ": ", e);
        }
    }
}
