package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import com.android.chrome.R;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import java.util.ArrayList;
import org.chromium.base.Callback;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class SG1 implements InterfaceC9914t11, InterfaceC4352cp4, RP2, InterfaceC10257u11 {
    public static final LocationRequest k;
    public final int a;
    public final WindowAndroid g;
    public final Callback h;
    public final AbstractC10600v11 i;
    public final B53 j;

    @Override // defpackage.RP2
    public final void c(QP2 qp2) {
        Status status = ((LocationSettingsResult) qp2).a;
        if (status.g == 6) {
            PendingIntent pendingIntent = status.i;
            if (pendingIntent != null) {
                AbstractC10600v11 abstractC10600v11 = this.i;
                abstractC10600v11.l(this);
                abstractC10600v11.m(this);
                this.g.A(pendingIntent, this, Integer.valueOf(R.string.0_resource_name_obfuscated_res_0x7f1405dd));
                return;
            }
        }
        d(3);
    }

    public SG1(int i, WindowAndroid windowAndroid, NG1 ng1, N11 n11) {
        B53 b53 = MG1.b;
        this.a = i;
        this.g = windowAndroid;
        this.h = ng1;
        this.i = n11;
        this.j = b53;
    }

    @Override // defpackage.C30
    public final void h(Bundle bundle) {
        boolean z = this.a != 2;
        ArrayList arrayList = new ArrayList();
        LocationRequest locationRequest = k;
        if (locationRequest != null) {
            arrayList.add(locationRequest);
        }
        LocationSettingsRequest locationSettingsRequest = new LocationSettingsRequest(arrayList, z, false);
        this.j.getClass();
        AbstractC10600v11 abstractC10600v11 = this.i;
        abstractC10600v11.f(new A53(abstractC10600v11, locationSettingsRequest)).l(this);
    }

    static {
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.a = 100;
        k = locationRequest;
    }

    @Override // defpackage.C30
    public final void e(int i) {
        d(3);
    }

    @Override // defpackage.InterfaceC1962Pc2
    public final void M0(ConnectionResult connectionResult) {
        d(3);
    }

    @Override // defpackage.InterfaceC4352cp4
    public final void b(Intent intent, int i) {
        if (i == -1) {
            d(1);
        } else {
            d(2);
        }
    }

    public final void d(int i) {
        AbstractC10600v11 abstractC10600v11 = this.i;
        abstractC10600v11.l(this);
        abstractC10600v11.m(this);
        abstractC10600v11.e();
        this.h.onResult(Integer.valueOf(i));
    }
}
