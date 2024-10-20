package defpackage;

import android.os.Parcel;
import com.google.android.gms.location.internal.FusedLocationProviderResult;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ac1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC3584ac1 extends AbstractBinderC7826mw implements InterfaceC3928bc1 {
    public static final /* synthetic */ int a = 0;

    public AbstractBinderC3584ac1() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    @Override // defpackage.AbstractBinderC7826mw
    public final boolean f1(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            FusedLocationProviderResult fusedLocationProviderResult = (FusedLocationProviderResult) AbstractC11786yV.a(parcel, FusedLocationProviderResult.CREATOR);
            AbstractBinderC7826mw.g1(parcel);
            a0(fusedLocationProviderResult);
        } else {
            if (i != 2) {
                return false;
            }
            L0();
        }
        return true;
    }
}
