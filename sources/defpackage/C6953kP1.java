package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.mediarouter.app.MediaRouteButton;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kP1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6953kP1 extends BroadcastReceiver {
    public final Context a;
    public boolean b = true;
    public final ArrayList c = new ArrayList();

    public C6953kP1(Context context) {
        this.a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean z;
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) || this.b == (!intent.getBooleanExtra("noConnectivity", false))) {
            return;
        }
        this.b = z;
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((MediaRouteButton) it.next()).c();
        }
    }
}
