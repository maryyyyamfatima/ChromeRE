package defpackage;

import J.N;
import android.content.Context;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.profiles.ProfileKey;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class FE2 extends S02 {
    public long f;

    @Override // defpackage.InterfaceC2689Us
    public final void a() {
    }

    @Override // defpackage.S02
    public final int d(Context context, KF3 kf3, N02 n02) {
        return 0;
    }

    @Override // defpackage.S02
    public final boolean f() {
        return true;
    }

    @Override // defpackage.S02
    public final void e(Context context, KF3 kf3, final InterfaceC2559Ts interfaceC2559Ts) {
        this.f = N.MFWoHdRt(this, kf3.a, kf3.b.getString("serialized_task_extras"), new Callback() { // from class: DE2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                FE2 fe2 = FE2.this;
                fe2.getClass();
                interfaceC2559Ts.a(((Boolean) obj).booleanValue());
                long j = fe2.f;
                if (j == 0) {
                    return;
                }
                N.MJHnuE5A(j, fe2);
                fe2.f = 0L;
            }
        });
        if (!RC.a().e()) {
            N.MgNysWkl(this.f, this, ProfileKey.a());
            RC.a().a(new EE2(this));
        } else {
            N.Mh0pzgZH(this.f, this, Profile.d());
        }
    }

    @Override // defpackage.S02
    public final boolean g(KF3 kf3) {
        long j = this.f;
        if (j == 0) {
            return false;
        }
        boolean MQTaGJay = N.MQTaGJay(j, this);
        long j2 = this.f;
        if (j2 != 0) {
            N.MJHnuE5A(j2, this);
            this.f = 0L;
        }
        return MQTaGJay;
    }
}
