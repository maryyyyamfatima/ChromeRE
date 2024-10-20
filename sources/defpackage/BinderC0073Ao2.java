package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import java.util.regex.Pattern;
import org.chromium.base.ThreadUtils;
import org.chromium.base.task.PostTask;
import org.chromium.components.payments.Address;
import org.chromium.components.payments.PaymentRequestUpdateEventListener;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ao2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC0073Ao2 extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public BinderC0073Ao2() {
        attachInterface(this, "org.chromium.components.payments.IPaymentDetailsUpdateService");
    }

    @Override // android.os.Binder
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("org.chromium.components.payments.IPaymentDetailsUpdateService");
        }
        if (i == 1598968902) {
            parcel2.writeString("org.chromium.components.payments.IPaymentDetailsUpdateService");
            return true;
        }
        final InterfaceC1192Je1 interfaceC1192Je1 = null;
        if (i == 1) {
            final Bundle bundle = (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("org.chromium.components.payments.IPaymentDetailsUpdateServiceCallback");
                interfaceC1192Je1 = (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC1192Je1)) ? new C1062Ie1(readStrongBinder) : (InterfaceC1192Je1) queryLocalInterface;
            }
            final int callingUid = Binder.getCallingUid();
            PostTask.d(AbstractC5103f04.a, new Runnable() { // from class: xo2
                @Override // java.lang.Runnable
                public final void run() {
                    PaymentRequestUpdateEventListener paymentRequestUpdateEventListener;
                    if (C0203Bo2.a().b(callingUid)) {
                        C0203Bo2 a = C0203Bo2.a();
                        a.getClass();
                        Object obj = ThreadUtils.a;
                        Bundle bundle2 = bundle;
                        InterfaceC1192Je1 interfaceC1192Je12 = interfaceC1192Je1;
                        if (bundle2 == null) {
                            C0203Bo2.c("Method data required.", interfaceC1192Je12);
                            return;
                        }
                        String string = bundle2.getString("methodName");
                        if (TextUtils.isEmpty(string)) {
                            C0203Bo2.c("Method name required.", interfaceC1192Je12);
                            return;
                        }
                        String string2 = bundle2.getString("details", "{}");
                        if ((a.a != null) || (paymentRequestUpdateEventListener = a.b) == null || !paymentRequestUpdateEventListener.changePaymentMethodFromInvokedApp(string, string2)) {
                            C0203Bo2.c("Invalid state.", interfaceC1192Je12);
                        } else {
                            a.a = interfaceC1192Je12;
                        }
                    }
                }
            });
        } else if (i == 2) {
            final String readString = parcel.readString();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("org.chromium.components.payments.IPaymentDetailsUpdateServiceCallback");
                interfaceC1192Je1 = (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof InterfaceC1192Je1)) ? new C1062Ie1(readStrongBinder2) : (InterfaceC1192Je1) queryLocalInterface2;
            }
            final int callingUid2 = Binder.getCallingUid();
            PostTask.d(AbstractC5103f04.a, new Runnable() { // from class: yo2
                @Override // java.lang.Runnable
                public final void run() {
                    PaymentRequestUpdateEventListener paymentRequestUpdateEventListener;
                    if (C0203Bo2.a().b(callingUid2)) {
                        C0203Bo2 a = C0203Bo2.a();
                        a.getClass();
                        Object obj = ThreadUtils.a;
                        String str = readString;
                        boolean isEmpty = TextUtils.isEmpty(str);
                        InterfaceC1192Je1 interfaceC1192Je12 = interfaceC1192Je1;
                        if (isEmpty) {
                            C0203Bo2.c("Shipping option identifier required.", interfaceC1192Je12);
                            return;
                        }
                        if ((a.a != null) || (paymentRequestUpdateEventListener = a.b) == null || !paymentRequestUpdateEventListener.changeShippingOptionFromInvokedApp(str)) {
                            C0203Bo2.c("Invalid state.", interfaceC1192Je12);
                        } else {
                            a.a = interfaceC1192Je12;
                        }
                    }
                }
            });
        } else {
            if (i != 3) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            final Bundle bundle2 = (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null);
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("org.chromium.components.payments.IPaymentDetailsUpdateServiceCallback");
                interfaceC1192Je1 = (queryLocalInterface3 == null || !(queryLocalInterface3 instanceof InterfaceC1192Je1)) ? new C1062Ie1(readStrongBinder3) : (InterfaceC1192Je1) queryLocalInterface3;
            }
            final int callingUid3 = Binder.getCallingUid();
            PostTask.d(AbstractC5103f04.a, new Runnable() { // from class: zo2
                @Override // java.lang.Runnable
                public final void run() {
                    PaymentRequestUpdateEventListener paymentRequestUpdateEventListener;
                    if (C0203Bo2.a().b(callingUid3)) {
                        C0203Bo2 a = C0203Bo2.a();
                        a.getClass();
                        Object obj = ThreadUtils.a;
                        Bundle bundle3 = bundle2;
                        InterfaceC1192Je1 interfaceC1192Je12 = interfaceC1192Je1;
                        if (bundle3 == null || bundle3.isEmpty()) {
                            C0203Bo2.c("Payment app returned invalid shipping address in response.", interfaceC1192Je12);
                            return;
                        }
                        Address a2 = Address.a(bundle3);
                        if (Address.k == null) {
                            Address.k = Pattern.compile("^[A-Z]{2}$");
                        }
                        if (!Address.k.matcher(a2.a).matches()) {
                            C0203Bo2.c("Payment app returned invalid shipping address in response.", interfaceC1192Je12);
                            return;
                        }
                        if ((a.a != null) || (paymentRequestUpdateEventListener = a.b) == null || !paymentRequestUpdateEventListener.a(AbstractC5031eo2.a(a2))) {
                            C0203Bo2.c("Invalid state.", interfaceC1192Je12);
                        } else {
                            a.a = interfaceC1192Je12;
                        }
                    }
                }
            });
        }
        return true;
    }
}
