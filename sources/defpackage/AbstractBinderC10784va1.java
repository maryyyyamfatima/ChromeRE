package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: va1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC10784va1 extends AbstractBinderC7826mw implements InterfaceC11127wa1 {
    public AbstractBinderC10784va1() {
        super("com.google.android.gms.cast.internal.IBundleCallback");
    }

    @Override // defpackage.AbstractBinderC7826mw
    public final boolean f1(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) AbstractC11786yV.a(parcel, Bundle.CREATOR);
        AbstractBinderC7826mw.g1(parcel);
        V0(bundle);
        return true;
    }
}
