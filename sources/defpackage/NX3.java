package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class NX3 implements TX3 {
    public final /* synthetic */ String a;
    public final /* synthetic */ UX3 b;
    public final /* synthetic */ VX3 c;

    public NX3(VX3 vx3, String str, B72 b72) {
        this.c = vx3;
        this.a = str;
        this.b = b72;
    }

    @Override // defpackage.TX3
    public final void b(C1193Je2 c1193Je2, final ZX3 zx3) {
        Bundle bundle = new Bundle();
        bundle.putString("notificationChannelName", this.a);
        Bundle b = zx3.b("getNotificationPermissionRequestPendingIntent", bundle, null);
        boolean z = b == null ? false : b.getBoolean("success");
        PendingIntent pendingIntent = z ? (PendingIntent) b.getParcelable("notificationPermissionRequestPendingIntent") : null;
        C10776vY3 c10776vY3 = this.c.c;
        boolean z2 = z && pendingIntent != null;
        c10776vY3.getClass();
        EI2.b("TrustedWebActivity.ExtraCommandSuccess.".concat("getNotificationPermissionRequestPendingIntent"), z2);
        final UX3 ux3 = this.b;
        if (!z || pendingIntent == null) {
            ux3.b(zx3.a.b, 2);
            return;
        }
        Handler handler = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: MX3
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                int i;
                int i2 = message.getData().getInt("permissionStatus", 1);
                if (i2 == 0) {
                    i = 1;
                } else {
                    i = 2;
                    if (i2 == 2) {
                        i = 3;
                    }
                }
                UX3.this.b(zx3.a.b, i);
                return true;
            }
        });
        Intent intent = new Intent();
        intent.putExtra("messenger", new Messenger(handler));
        try {
            pendingIntent.send(V60.a, 0, intent);
        } catch (PendingIntent.CanceledException e) {
            AbstractC4851eH1.a("TWAClient", "The PendingIntent was canceled.", e);
        }
    }

    @Override // defpackage.TX3
    public final void a() {
        this.b.a();
    }
}
