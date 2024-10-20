package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: q21 */
/* loaded from: classes.dex */
public final class C8892q21 implements InterfaceC9234r21 {
    public final /* synthetic */ AccountChangeEventsRequest a;

    public C8892q21(AccountChangeEventsRequest accountChangeEventsRequest) {
        this.a = accountChangeEventsRequest;
    }

    @Override // defpackage.InterfaceC9234r21
    public final Object a(IBinder iBinder) {
        InterfaceC9412ra1 c8727pa1;
        int i = AbstractBinderC9070qa1.a;
        if (iBinder == null) {
            c8727pa1 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
            if (queryLocalInterface instanceof InterfaceC9412ra1) {
                c8727pa1 = (InterfaceC9412ra1) queryLocalInterface;
            } else {
                c8727pa1 = new C8727pa1(iBinder);
            }
        }
        C8727pa1 c8727pa12 = (C8727pa1) c8727pa1;
        Parcel a = c8727pa12.a();
        AbstractC11786yV.b(a, this.a);
        Parcel e = c8727pa12.e(3, a);
        AccountChangeEventsResponse accountChangeEventsResponse = (AccountChangeEventsResponse) AbstractC11786yV.a(e, AccountChangeEventsResponse.CREATOR);
        e.recycle();
        AbstractC9577s21.k(accountChangeEventsResponse);
        return accountChangeEventsResponse.g;
    }
}
