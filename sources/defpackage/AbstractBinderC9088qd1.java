package defpackage;

import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qd1 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC9088qd1 extends AbstractBinderC7826mw implements InterfaceC9430rd1 {
    public static final /* synthetic */ int a = 0;

    public AbstractBinderC9088qd1() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    @Override // defpackage.AbstractBinderC7826mw
    public final boolean f1(int i, Parcel parcel, Parcel parcel2) {
        C3462aE1 c3462aE1;
        C3462aE1 c3462aE12;
        if (i == 1) {
            LocationResult locationResult = (LocationResult) AbstractC11786yV.a(parcel, LocationResult.CREATOR);
            AbstractBinderC7826mw.g1(parcel);
            YV0 yv0 = ((BinderC9998tG1) this).g;
            synchronized (yv0) {
                c3462aE1 = yv0.b;
            }
            C8970qG1 c8970qG1 = new C8970qG1(locationResult);
            c3462aE1.getClass();
            c3462aE1.a.execute(new XD1(c3462aE1, c8970qG1));
        } else if (i == 2) {
            LocationAvailability locationAvailability = (LocationAvailability) AbstractC11786yV.a(parcel, LocationAvailability.CREATOR);
            AbstractBinderC7826mw.g1(parcel);
            YV0 yv02 = ((BinderC9998tG1) this).g;
            synchronized (yv02) {
                c3462aE12 = yv02.b;
            }
            C9312rG1 c9312rG1 = new C9312rG1(locationAvailability);
            c3462aE12.getClass();
            c3462aE12.a.execute(new XD1(c3462aE12, c9312rG1));
        } else {
            if (i != 3) {
                return false;
            }
            ((BinderC9998tG1) this).H0();
        }
        return true;
    }
}
