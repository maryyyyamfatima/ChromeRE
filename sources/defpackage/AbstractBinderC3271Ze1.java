package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.apps.gsa.publicsearch.SystemParcelableWrapper;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ze1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC3271Ze1 extends AbstractBinderC7826mw implements InterfaceC3602af1 {
    public AbstractBinderC3271Ze1() {
        super("com.google.android.apps.gsa.publicsearch.IPublicSearchServiceSessionCallback");
    }

    @Override // defpackage.AbstractBinderC7826mw
    public final boolean f1(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        parcel.createByteArray();
        final SystemParcelableWrapper systemParcelableWrapper = (SystemParcelableWrapper) AbstractC11786yV.a(parcel, SystemParcelableWrapper.CREATOR);
        AbstractBinderC7826mw.g1(parcel);
        final XY2 xy2 = (XY2) this;
        xy2.k.execute(new Runnable() { // from class: UY2
            @Override // java.lang.Runnable
            public final void run() {
                Bundle bundle;
                XY2 xy22 = XY2.this;
                if (xy22.h1()) {
                    AbstractC5434fy2.a();
                    int i2 = xy22.i;
                    if (!(i2 == 5 || i2 == 6 || i2 == 7)) {
                        Iterator it = xy22.g.iterator();
                        while (it.hasNext()) {
                            W7 w7 = ((V7) it.next()).a;
                            w7.getClass();
                            AbstractC5195fH1.a("onServiceEvent", new Object[0]);
                            SystemParcelableWrapper systemParcelableWrapper2 = systemParcelableWrapper;
                            if (systemParcelableWrapper2 != null && (bundle = (Bundle) systemParcelableWrapper2.a) != null) {
                                w7.c(1, bundle);
                            }
                        }
                        return;
                    }
                }
                Log.w("LensSdk", "ServiceEvent received after connection disposed.");
            }
        });
        return true;
    }
}
