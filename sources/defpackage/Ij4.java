package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Ij4 extends Hj4 {
    public final C6905kF3 a;

    public Ij4(C6905kF3 c6905kF3) {
        this.a = c6905kF3;
    }

    @Override // defpackage.Hj4, defpackage.InterfaceC3146Yf1
    public final void Z(int i, boolean z) {
        RF3.a(new Status(i, null, 0), Boolean.valueOf(z), this.a);
    }

    @Override // defpackage.Hj4, defpackage.InterfaceC3146Yf1
    public final void Y(Status status, boolean z) {
        RF3.a(status, Boolean.valueOf(z), this.a);
    }
}
