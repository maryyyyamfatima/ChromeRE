package defpackage;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ConnectionInfo;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ZW1 implements InterfaceC1702Nc2 {
    public final C5800h21 a;
    public final int g;
    public final C0540Ee h;
    public final long i;
    public final long j;

    public ZW1(C5800h21 c5800h21, int i, C0540Ee c0540Ee, long j, long j2) {
        this.a = c5800h21;
        this.g = i;
        this.h = c0540Ee;
        this.i = j;
        this.j = j2;
    }

    @Override // defpackage.InterfaceC1702Nc2
    public final void b(AF3 af3) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j;
        long j2;
        int i7;
        if (this.a.b()) {
            RootTelemetryConfiguration rootTelemetryConfiguration = C10735vQ2.a().a;
            if (rootTelemetryConfiguration == null || rootTelemetryConfiguration.g) {
                C4425d21 c4425d21 = (C4425d21) this.a.o.get(this.h);
                if (c4425d21 != null) {
                    Object obj = c4425d21.g;
                    if (obj instanceof BaseGmsClient) {
                        BaseGmsClient baseGmsClient = (BaseGmsClient) obj;
                        boolean z = this.i > 0;
                        int i8 = baseGmsClient.v;
                        if (rootTelemetryConfiguration != null) {
                            z &= rootTelemetryConfiguration.h;
                            int i9 = rootTelemetryConfiguration.i;
                            int i10 = rootTelemetryConfiguration.j;
                            i = rootTelemetryConfiguration.a;
                            if ((baseGmsClient.A != null) && !baseGmsClient.r()) {
                                ConnectionTelemetryConfiguration a = a(c4425d21, baseGmsClient, this.g);
                                if (a == null) {
                                    return;
                                }
                                boolean z2 = a.h && this.i > 0;
                                i10 = a.j;
                                z = z2;
                            }
                            i3 = i9;
                            i2 = i10;
                        } else {
                            i = 0;
                            i2 = 100;
                            i3 = 5000;
                        }
                        C5800h21 c5800h21 = this.a;
                        if (af3.l()) {
                            i6 = 0;
                            i5 = 0;
                        } else {
                            if (af3.d) {
                                i4 = 100;
                            } else {
                                Exception j3 = af3.j();
                                if (j3 instanceof C10114td) {
                                    Status status = ((C10114td) j3).a;
                                    int i11 = status.g;
                                    ConnectionResult connectionResult = status.j;
                                    i5 = connectionResult == null ? -1 : connectionResult.g;
                                    i6 = i11;
                                } else {
                                    i4 = 101;
                                }
                            }
                            i6 = i4;
                            i5 = -1;
                        }
                        if (z) {
                            long j4 = this.i;
                            j = System.currentTimeMillis();
                            j2 = j4;
                            i7 = (int) (SystemClock.elapsedRealtime() - this.j);
                        } else {
                            j = 0;
                            j2 = 0;
                            i7 = -1;
                        }
                        MethodInvocation methodInvocation = new MethodInvocation(this.g, i6, i5, j2, j, null, null, i8, i7);
                        long j5 = i3;
                        HandlerC10413uU3 handlerC10413uU3 = c5800h21.s;
                        handlerC10413uU3.sendMessage(handlerC10413uU3.obtainMessage(18, new C3557aX1(methodInvocation, i, j5, i2)));
                    }
                }
            }
        }
    }

    public static ConnectionTelemetryConfiguration a(C4425d21 c4425d21, BaseGmsClient baseGmsClient, int i) {
        ConnectionInfo connectionInfo = baseGmsClient.A;
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration = connectionInfo == null ? null : connectionInfo.i;
        if (connectionTelemetryConfiguration == null) {
            return null;
        }
        boolean z = false;
        if (connectionTelemetryConfiguration.g) {
            int[] iArr = connectionTelemetryConfiguration.i;
            if (iArr == null) {
                int[] iArr2 = connectionTelemetryConfiguration.k;
                if (iArr2 != null) {
                    int length = iArr2.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        }
                        if (iArr2[i2] == i) {
                            z = true;
                            break;
                        }
                        i2++;
                    }
                    z = !z;
                }
                z = true;
                break;
            }
            for (int i3 : iArr) {
                if (i3 == i) {
                    z = true;
                    break;
                }
            }
        }
        if (z && c4425d21.q < connectionTelemetryConfiguration.j) {
            return connectionTelemetryConfiguration;
        }
        return null;
    }
}
