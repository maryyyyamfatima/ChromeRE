package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dP0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4547dP0 implements PendingIntent.OnFinished {
    public final /* synthetic */ AbstractActivityC4890eP0 a;

    public C4547dP0(AbstractActivityC4890eP0 abstractActivityC4890eP0) {
        this.a = abstractActivityC4890eP0;
    }

    @Override // android.app.PendingIntent.OnFinished
    public final void onSendFinished(PendingIntent pendingIntent, Intent intent, int i, String str, Bundle bundle) {
        AbstractActivityC4890eP0.Q0(this.a.getIntent(), true);
    }
}
