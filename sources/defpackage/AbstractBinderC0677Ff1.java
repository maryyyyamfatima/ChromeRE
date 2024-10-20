package defpackage;

import android.os.Parcel;
import com.google.vr.sdk.common.deps.b;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ff1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractBinderC0677Ff1 extends b implements InterfaceC0807Gf1 {
    public AbstractBinderC0677Ff1() {
        attachInterface(this, "com.google.vr.vrcore.common.api.ITransitionCallbacks");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (routeToSuperOrEnforceInterface(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        onTransitionComplete();
        return true;
    }
}
