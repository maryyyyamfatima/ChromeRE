package defpackage;

import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.EqualizerSettings;
import com.google.android.gms.cast.internal.DeviceStatus;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nH */
/* loaded from: classes.dex */
public final class RunnableC7943nH implements Runnable {
    public final /* synthetic */ C9315rH a;
    public final /* synthetic */ DeviceStatus g;

    public RunnableC7943nH(C9315rH c9315rH, DeviceStatus deviceStatus) {
        this.a = c9315rH;
        this.g = deviceStatus;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        boolean z2;
        boolean z3;
        C4856eI1 c4856eI1 = C9315rH.Z;
        C9315rH c9315rH = this.a;
        c9315rH.getClass();
        DeviceStatus deviceStatus = this.g;
        ApplicationMetadata applicationMetadata = deviceStatus.i;
        boolean a = WH.a(applicationMetadata, c9315rH.F);
        YG yg = c9315rH.H;
        if (!a) {
            c9315rH.F = applicationMetadata;
            yg.c(applicationMetadata);
        }
        double d = deviceStatus.a;
        if (Double.isNaN(d) || Math.abs(d - c9315rH.Q) <= 1.0E-7d) {
            z = false;
        } else {
            c9315rH.Q = d;
            z = true;
        }
        boolean z4 = c9315rH.N;
        boolean z5 = deviceStatus.g;
        if (z5 != z4) {
            c9315rH.N = z5;
            z = true;
        }
        Double.isNaN(deviceStatus.l);
        Object[] objArr = {Boolean.valueOf(z), Boolean.valueOf(c9315rH.P)};
        C4856eI1 c4856eI12 = C9315rH.Z;
        c4856eI12.a("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", objArr);
        if (yg != null && (z || c9315rH.P)) {
            yg.f();
        }
        int i = c9315rH.S;
        int i2 = deviceStatus.h;
        if (i2 != i) {
            c9315rH.S = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        c4856eI12.a("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z2), Boolean.valueOf(c9315rH.P));
        if (yg != null && (z2 || c9315rH.P)) {
            yg.a(c9315rH.S);
        }
        int i3 = c9315rH.T;
        int i4 = deviceStatus.j;
        if (i4 != i3) {
            c9315rH.T = i4;
            z3 = true;
        } else {
            z3 = false;
        }
        c4856eI12.a("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z3), Boolean.valueOf(c9315rH.P));
        if (yg != null && (z3 || c9315rH.P)) {
            yg.e(c9315rH.T);
        }
        EqualizerSettings equalizerSettings = c9315rH.R;
        EqualizerSettings equalizerSettings2 = deviceStatus.k;
        if (!WH.a(equalizerSettings, equalizerSettings2)) {
            c9315rH.R = equalizerSettings2;
        }
        c9315rH.P = false;
    }
}
