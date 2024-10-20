package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ld1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC7370ld1 extends AbstractBinderC7826mw {
    public AbstractBinderC7370ld1() {
        super("com.google.android.libraries.lens.sdk.shared.ILensServiceCallback");
    }

    @Override // defpackage.AbstractBinderC7826mw
    public final boolean f1(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        final Bundle bundle = (Bundle) AbstractC11786yV.a(parcel, Bundle.CREATOR);
        AbstractBinderC7826mw.g1(parcel);
        final ServiceConnectionC4816eA1 serviceConnectionC4816eA1 = (ServiceConnectionC4816eA1) this;
        serviceConnectionC4816eA1.k.execute(new Runnable() { // from class: Wz1
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC4816eA1 serviceConnectionC4816eA12 = ServiceConnectionC4816eA1.this;
                if (serviceConnectionC4816eA12.h1()) {
                    int i2 = serviceConnectionC4816eA12.i;
                    if (!(i2 == 5 || i2 == 6 || i2 == 7)) {
                        Iterator it = serviceConnectionC4816eA12.g.iterator();
                        while (it.hasNext()) {
                            C5504gA1 c5504gA1 = ((C5160fA1) it.next()).a;
                            c5504gA1.getClass();
                            AbstractC5195fH1.a("onServiceEvent", new Object[0]);
                            Bundle bundle2 = bundle;
                            if (bundle2 != null) {
                                c5504gA1.c(1, bundle2);
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
