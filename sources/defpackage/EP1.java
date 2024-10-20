package defpackage;

import android.app.PendingIntent;
import android.util.Log;
import android.view.View;
import androidx.mediarouter.app.d;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class EP1 implements View.OnClickListener {
    public final /* synthetic */ d a;

    public EP1(d dVar) {
        this.a = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PendingIntent sessionActivity;
        d dVar = this.a;
        C12091zN1 c12091zN1 = dVar.W;
        if (c12091zN1 == null || (sessionActivity = c12091zN1.a.a.getSessionActivity()) == null) {
            return;
        }
        try {
            sessionActivity.send();
            dVar.dismiss();
        } catch (PendingIntent.CanceledException unused) {
            Log.e("MediaRouteCtrlDialog", sessionActivity + " was not sent, it had been canceled.");
        }
    }
}
