package defpackage;

import android.os.Parcel;
import com.google.android.gms.location.LocationSettingsResult;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uG1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC10341uG1 extends AbstractBinderC7826mw {
    public final InterfaceC8851pv a;

    public BinderC10341uG1(InterfaceC8851pv interfaceC8851pv) {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
        this.a = interfaceC8851pv;
    }

    @Override // defpackage.AbstractBinderC7826mw
    public final boolean f1(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        LocationSettingsResult locationSettingsResult = (LocationSettingsResult) AbstractC11786yV.a(parcel, LocationSettingsResult.CREATOR);
        AbstractBinderC7826mw.g1(parcel);
        this.a.a(locationSettingsResult);
        return true;
    }
}
