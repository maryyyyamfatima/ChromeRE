package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5414fv {
    public Object a;
    public boolean b;
    public final /* synthetic */ BaseGmsClient c;
    public final int d;
    public final Bundle e;
    public final /* synthetic */ BaseGmsClient f;

    public abstract void b(ConnectionResult connectionResult);

    public abstract boolean c();

    public final void a(Object obj) {
        BaseGmsClient baseGmsClient = this.f;
        int i = this.d;
        if (i == 0) {
            if (c()) {
                return;
            }
            baseGmsClient.w(1, null);
            b(new ConnectionResult(8, null));
            return;
        }
        baseGmsClient.w(1, null);
        Bundle bundle = this.e;
        b(new ConnectionResult(i, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
    }

    public AbstractC5414fv(BaseGmsClient baseGmsClient, int i, Bundle bundle) {
        this.f = baseGmsClient;
        Boolean bool = Boolean.TRUE;
        this.c = baseGmsClient;
        this.a = bool;
        this.b = false;
        this.d = i;
        this.e = bundle;
    }
}
