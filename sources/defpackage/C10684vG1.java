package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.ConnectionInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vG1 */
/* loaded from: classes.dex */
public final class C10684vG1 extends AbstractC11280x01 {
    public final C1439Lb3 F;
    public final C1439Lb3 G;
    public final C1439Lb3 H;
    public final String I;

    @Override // com.google.android.gms.common.internal.BaseGmsClient, defpackage.InterfaceC3129Yc
    public final int getMinApkVersion() {
        return 11717000;
    }

    @Override // defpackage.AbstractC11280x01, com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] k() {
        return new Feature[0];
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String n() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String o() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean x() {
        return true;
    }

    public C10684vG1(Context context, Looper looper, JU ju, C30 c30, InterfaceC1962Pc2 interfaceC1962Pc2) {
        super(context, looper, 23, ju, c30, interfaceC1962Pc2);
        this.F = new C1439Lb3(0);
        this.G = new C1439Lb3(0);
        this.H = new C1439Lb3(0);
        this.I = "locationServices";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Bundle i() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.I);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface e(IBinder iBinder) {
        int i = AbstractBinderC11482xc1.a;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (queryLocalInterface instanceof InterfaceC11825yc1) {
            return (InterfaceC11825yc1) queryLocalInterface;
        }
        return new C11139wc1(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] g() {
        return AbstractC12065zI0.b;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final void t(int i) {
        super.t(i);
        synchronized (this.F) {
            this.F.clear();
        }
        synchronized (this.G) {
            this.G.clear();
        }
        synchronized (this.H) {
            this.H.clear();
        }
    }

    public final boolean y(Feature feature) {
        ConnectionInfo connectionInfo = this.A;
        Feature feature2 = null;
        Feature[] featureArr = connectionInfo == null ? null : connectionInfo.g;
        if (featureArr == null) {
            return false;
        }
        int length = featureArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Feature feature3 = featureArr[i];
            if (feature.a.equals(feature3.a)) {
                feature2 = feature3;
                break;
            }
            i++;
        }
        return feature2 != null && feature2.r1() >= feature.r1();
    }
}
