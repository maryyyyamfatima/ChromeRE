package defpackage;

import android.accounts.Account;
import android.content.ContentProviderClient;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.auth.GetAccountsRequest;
import com.google.android.gms.auth.HasCapabilitiesRequest;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import java.io.IOException;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: l21 */
/* loaded from: classes.dex */
public abstract class AbstractC7174l21 extends AbstractC9577s21 {
    public static final /* synthetic */ int d = 0;

    public static int r(Context context, final HasCapabilitiesRequest hasCapabilitiesRequest) {
        String str = hasCapabilitiesRequest.a.name;
        AbstractC0878Gt2.h(context);
        TF tf = TF.g;
        ((WF) ((UF) tf.a.get())).getClass();
        if (((Boolean) WF.b.c()).booleanValue()) {
            Bundle bundle = new Bundle();
            AbstractC9577s21.i(context, bundle);
            hasCapabilitiesRequest.h = bundle;
        }
        InterfaceC0209Bp3 interfaceC0209Bp3 = tf.a;
        ((WF) ((UF) interfaceC0209Bp3.get())).getClass();
        if (((Boolean) WF.c.c()).booleanValue()) {
            ((WF) ((UF) interfaceC0209Bp3.get())).getClass();
            if (AbstractC9577s21.f(context, ((C9409rZ3) WF.a.c()).j)) {
                final C0992Hq1 c0992Hq1 = new C0992Hq1(context);
                C5531gF3 c5531gF3 = new C5531gF3();
                c5531gF3.c = new Feature[]{MI0.a};
                c5531gF3.a = new InterfaceC5565gM2() { // from class: xq1
                    @Override // defpackage.InterfaceC5565gM2
                    public final void accept(Object obj, Object obj2) {
                        C0992Hq1.this.getClass();
                        InterfaceC8396oc1 interfaceC8396oc1 = (InterfaceC8396oc1) ((C6830k21) obj).m();
                        BinderC0862Gq1 binderC0862Gq1 = new BinderC0862Gq1((C6905kF3) obj2);
                        C7708mc1 c7708mc1 = (C7708mc1) interfaceC8396oc1;
                        Parcel a = c7708mc1.a();
                        AbstractC11786yV.c(a, binderC0862Gq1);
                        AbstractC11786yV.b(a, hasCapabilitiesRequest);
                        c7708mc1.h(7, a);
                    }
                };
                c5531gF3.d = 1644;
                try {
                    Integer num = (Integer) AbstractC9577s21.d(c0992Hq1.b(1, c5531gF3.a()), "hasCapabilities ");
                    AbstractC9577s21.k(num);
                    return num.intValue();
                } catch (C10114td e) {
                    AbstractC9577s21.h(e, "hasCapabilities ");
                }
            }
        }
        return ((Integer) AbstractC9577s21.a(context, AbstractC9577s21.b, new InterfaceC9234r21() { // from class: n21
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
                AbstractC11786yV.b(a, HasCapabilitiesRequest.this);
                Parcel e2 = c8727pa12.e(9, a);
                int readInt = e2.readInt();
                e2.recycle();
                return Integer.valueOf(readInt);
            }
        })).intValue();
    }

    public static Account[] o(Context context) {
        try {
            C9228r11.b.getClass();
            X31.b(context);
            C5200fI1 c5200fI1 = AbstractC9577s21.c;
            ContentProviderClient acquireContentProviderClient = context.getContentResolver().acquireContentProviderClient("com.google.android.gms.auth.accounts");
            try {
                if (acquireContentProviderClient == null) {
                    throw new RemoteException("The com.google.android.gms.auth.accounts provider is not available.");
                }
                try {
                    Bundle call = acquireContentProviderClient.call("get_accounts", "com.google", new Bundle());
                    if (call == null) {
                        throw new RemoteException("Null result from AccountChimeraContentProvider");
                    }
                    Parcelable[] parcelableArray = call.getParcelableArray("accounts");
                    if (parcelableArray == null) {
                        throw new RemoteException("Key_Accounts is Null");
                    }
                    Account[] accountArr = new Account[parcelableArray.length];
                    for (int i = 0; i < parcelableArray.length; i++) {
                        accountArr[i] = (Account) parcelableArray[i];
                    }
                    acquireContentProviderClient.release();
                    return accountArr;
                } catch (RemoteException e) {
                    c5200fI1.getClass();
                    Log.e(c5200fI1.a, c5200fI1.b.concat("RemoteException when fetching accounts"), e);
                    throw e;
                } catch (Exception e2) {
                    c5200fI1.getClass();
                    Log.e(c5200fI1.a, c5200fI1.b.concat("Exception when getting accounts"), e2);
                    throw new RemoteException("Accounts ContentProvider failed: " + e2.getMessage());
                }
            } catch (Throwable th) {
                acquireContentProviderClient.release();
                throw th;
            }
        } catch (GooglePlayServicesIncorrectManifestValueException unused) {
            throw new S31();
        }
    }

    public static TokenData q(Context context, Account account, String str) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("handle_notification", true);
        try {
            TokenData e = AbstractC9577s21.e(context, account, str, bundle);
            X31.a(context);
            return e;
        } catch (R31 e2) {
            int i = W31.e;
            C8543p11 c8543p11 = C8543p11.d;
            int i2 = e2.a;
            if (!X31.e(context, i2)) {
                if (!(i2 == 9 ? X31.f(context, "com.android.vending") : false)) {
                    c8543p11.k(context, i2);
                    Log.w("GoogleAuthUtil", "Error when getting token", e2);
                    throw new W44(e2);
                }
            }
            new HandlerC8200o11(c8543p11, context).sendEmptyMessageDelayed(1, 120000L);
            Log.w("GoogleAuthUtil", "Error when getting token", e2);
            throw new W44(e2);
        } catch (UserRecoverableAuthException e3) {
            X31.a(context);
            Log.w("GoogleAuthUtil", "Error when getting token", e3);
            throw new W44(e3);
        }
    }

    public static void l(Context context, String str) {
        AbstractC9577s21.b(context);
        Bundle bundle = new Bundle();
        AbstractC9577s21.i(context, bundle);
        AbstractC0878Gt2.h(context);
        ((YY0) ((XY0) WY0.g.a.get())).getClass();
        if (((Boolean) YY0.c.c()).booleanValue() && AbstractC9577s21.g(context)) {
            final C0992Hq1 c0992Hq1 = new C0992Hq1(context);
            final ClearTokenRequest clearTokenRequest = new ClearTokenRequest();
            clearTokenRequest.g = str;
            C5531gF3 c5531gF3 = new C5531gF3();
            c5531gF3.c = new Feature[]{MI0.c};
            c5531gF3.a = new InterfaceC5565gM2() { // from class: wq1
                @Override // defpackage.InterfaceC5565gM2
                public final void accept(Object obj, Object obj2) {
                    C0992Hq1.this.getClass();
                    InterfaceC8396oc1 interfaceC8396oc1 = (InterfaceC8396oc1) ((C6830k21) obj).m();
                    BinderC0472Dq1 binderC0472Dq1 = new BinderC0472Dq1((C6905kF3) obj2);
                    C7708mc1 c7708mc1 = (C7708mc1) interfaceC8396oc1;
                    Parcel a = c7708mc1.a();
                    AbstractC11786yV.c(a, binderC0472Dq1);
                    AbstractC11786yV.b(a, clearTokenRequest);
                    c7708mc1.h(2, a);
                }
            };
            c5531gF3.d = 1513;
            try {
                AbstractC9577s21.d(c0992Hq1.b(1, c5531gF3.a()), "clear token");
                return;
            } catch (C10114td e) {
                AbstractC9577s21.h(e, "clear token");
            }
        }
        AbstractC9577s21.a(context, AbstractC9577s21.b, new C8549p21(str, bundle));
    }

    public static List m(Context context, String str) {
        AbstractC9577s21.b(context);
        final AccountChangeEventsRequest accountChangeEventsRequest = new AccountChangeEventsRequest();
        accountChangeEventsRequest.h = str;
        accountChangeEventsRequest.g = 0;
        AbstractC0878Gt2.h(context);
        ((YY0) ((XY0) WY0.g.a.get())).getClass();
        if (((Boolean) YY0.b.c()).booleanValue() && AbstractC9577s21.g(context)) {
            final C0992Hq1 c0992Hq1 = new C0992Hq1(context);
            C5531gF3 c5531gF3 = new C5531gF3();
            c5531gF3.c = new Feature[]{MI0.b};
            c5531gF3.a = new InterfaceC5565gM2() { // from class: Aq1
                @Override // defpackage.InterfaceC5565gM2
                public final void accept(Object obj, Object obj2) {
                    C0992Hq1.this.getClass();
                    BinderC0602Eq1 binderC0602Eq1 = new BinderC0602Eq1((C6905kF3) obj2);
                    C7708mc1 c7708mc1 = (C7708mc1) ((InterfaceC8396oc1) ((C6830k21) obj).m());
                    Parcel a = c7708mc1.a();
                    AbstractC11786yV.c(a, binderC0602Eq1);
                    AbstractC11786yV.b(a, accountChangeEventsRequest);
                    c7708mc1.h(4, a);
                }
            };
            c5531gF3.d = 1515;
            try {
                AccountChangeEventsResponse accountChangeEventsResponse = (AccountChangeEventsResponse) AbstractC9577s21.d(c0992Hq1.b(1, c5531gF3.a()), "account change events retrieval");
                AbstractC9577s21.k(accountChangeEventsResponse);
                return accountChangeEventsResponse.g;
            } catch (C10114td e) {
                AbstractC9577s21.h(e, "account change events retrieval");
            }
        }
        return (List) AbstractC9577s21.a(context, AbstractC9577s21.b, new C8892q21(accountChangeEventsRequest));
    }

    public static String n(Context context, String str) {
        AbstractC9577s21.b(context);
        Bundle bundle = new Bundle();
        Account account = new Account(str, "com.google");
        AbstractC9577s21.j(account);
        return AbstractC9577s21.e(context, account, "^^_account_id_^^", bundle).g;
    }

    public static Account[] p(Context context, final String str, final String[] strArr) {
        AbstractC9577s21.b(context);
        AbstractC0878Gt2.h(context);
        ((YY0) ((XY0) WY0.g.a.get())).getClass();
        if (((Boolean) YY0.b.c()).booleanValue() && AbstractC9577s21.g(context)) {
            final C0992Hq1 c0992Hq1 = new C0992Hq1(context);
            final GetAccountsRequest getAccountsRequest = new GetAccountsRequest(str, strArr);
            C5531gF3 c5531gF3 = new C5531gF3();
            c5531gF3.c = new Feature[]{MI0.b};
            c5531gF3.a = new InterfaceC5565gM2() { // from class: yq1
                @Override // defpackage.InterfaceC5565gM2
                public final void accept(Object obj, Object obj2) {
                    C0992Hq1.this.getClass();
                    InterfaceC8396oc1 interfaceC8396oc1 = (InterfaceC8396oc1) ((C6830k21) obj).m();
                    BinderC0732Fq1 binderC0732Fq1 = new BinderC0732Fq1((C6905kF3) obj2);
                    C7708mc1 c7708mc1 = (C7708mc1) interfaceC8396oc1;
                    Parcel a = c7708mc1.a();
                    AbstractC11786yV.c(a, binderC0732Fq1);
                    AbstractC11786yV.b(a, getAccountsRequest);
                    c7708mc1.h(5, a);
                }
            };
            c5531gF3.d = 1516;
            try {
                List list = (List) AbstractC9577s21.d(c0992Hq1.b(1, c5531gF3.a()), "Accounts retrieval");
                AbstractC9577s21.k(list);
                return (Account[]) list.toArray(new Account[0]);
            } catch (C10114td e) {
                AbstractC9577s21.h(e, "Accounts retrieval");
            }
        }
        return (Account[]) AbstractC9577s21.a(context, AbstractC9577s21.b, new InterfaceC9234r21() { // from class: m21
            @Override // defpackage.InterfaceC9234r21
            public final Object a(IBinder iBinder) {
                InterfaceC9412ra1 c8727pa1;
                Parcelable[] parcelableArray;
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
                Bundle bundle = new Bundle();
                bundle.putString("accountType", str);
                bundle.putStringArray("account_features", strArr);
                C8727pa1 c8727pa12 = (C8727pa1) c8727pa1;
                Parcel a = c8727pa12.a();
                AbstractC11786yV.b(a, bundle);
                Parcel e2 = c8727pa12.e(6, a);
                Bundle bundle2 = (Bundle) AbstractC11786yV.a(e2, Bundle.CREATOR);
                e2.recycle();
                if (bundle2 != null && (parcelableArray = bundle2.getParcelableArray("accounts")) != null) {
                    Account[] accountArr = new Account[parcelableArray.length];
                    for (int i2 = 0; i2 < parcelableArray.length; i2++) {
                        accountArr[i2] = (Account) parcelableArray[i2];
                    }
                    return accountArr;
                }
                throw new IOException("Receive null result from service call.");
            }
        });
    }
}
