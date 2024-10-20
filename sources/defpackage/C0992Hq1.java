package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Hq1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0992Hq1 extends AbstractC7856n11 {
    public static final C3588ad k = new C3588ad("GoogleAuthService.API", new C0212Bq1(), new C3259Zc());
    public static final C5200fI1 l = new C5200fI1("GoogleAuthServiceClient");

    public C0992Hq1(Context context) {
        super(context, k, InterfaceC2999Xc.a, C7512m11.c);
    }

    public static void f(Status status, Object obj, C6905kF3 c6905kF3) {
        if (RF3.b(status, obj, c6905kF3)) {
            return;
        }
        l.a("The task is already complete.", new Object[0]);
    }
}
