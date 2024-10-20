package defpackage;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: s21 */
/* loaded from: classes.dex */
public abstract class AbstractC9577s21 {
    public static final String[] a = {"com.google", "com.google.work", "cn.google"};
    public static final ComponentName b = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
    public static final C5200fI1 c = new C5200fI1("GoogleAuthUtil");

    public static TokenData c(Bundle bundle) {
        TokenData tokenData;
        ClassLoader classLoader = TokenData.class.getClassLoader();
        if (classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        Bundle bundle2 = bundle.getBundle("tokenDetails");
        if (bundle2 == null) {
            tokenData = null;
        } else {
            if (classLoader != null) {
                bundle2.setClassLoader(classLoader);
            }
            tokenData = (TokenData) bundle2.getParcelable("TokenData");
        }
        if (tokenData != null) {
            return tokenData;
        }
        String string = bundle.getString("Error");
        int i = 15;
        for (int i2 : AbstractC1743Nk3.a()) {
            if (AbstractC1743Nk3.b(i2).equals(string)) {
                i = i2;
            }
        }
        if (!(AbstractC2373Sg3.a(9, i) || AbstractC2373Sg3.a(19, i) || AbstractC2373Sg3.a(23, i) || AbstractC2373Sg3.a(24, i) || AbstractC2373Sg3.a(14, i) || AbstractC2373Sg3.a(26, i) || AbstractC2373Sg3.a(40, i) || AbstractC2373Sg3.a(32, i) || AbstractC2373Sg3.a(33, i) || AbstractC2373Sg3.a(34, i) || AbstractC2373Sg3.a(35, i) || AbstractC2373Sg3.a(36, i) || AbstractC2373Sg3.a(37, i) || AbstractC2373Sg3.a(39, i) || AbstractC2373Sg3.a(31, i) || AbstractC2373Sg3.a(38, i))) {
            if (AbstractC2373Sg3.a(5, i) || AbstractC2373Sg3.a(6, i) || AbstractC2373Sg3.a(7, i) || AbstractC2373Sg3.a(58, i) || AbstractC2373Sg3.a(60, i)) {
                throw new IOException(string);
            }
            throw new C6486j21(string);
        }
        c.a("isUserRecoverableError status: ".concat(AbstractC1743Nk3.c(i)), new Object[0]);
        throw new UserRecoverableAuthException(string);
    }

    public static TokenData e(Context context, final Account account, final String str, Bundle bundle) {
        j(account);
        b(context);
        final Bundle bundle2 = new Bundle(bundle);
        i(context, bundle2);
        AbstractC0878Gt2.h(context);
        ((YY0) ((XY0) WY0.g.a.get())).getClass();
        if (((Boolean) YY0.c.c()).booleanValue() && g(context)) {
            final C0992Hq1 c0992Hq1 = new C0992Hq1(context);
            C5531gF3 c5531gF3 = new C5531gF3();
            c5531gF3.c = new Feature[]{MI0.c};
            c5531gF3.a = new InterfaceC5565gM2() { // from class: zq1
                @Override // defpackage.InterfaceC5565gM2
                public final void accept(Object obj, Object obj2) {
                    C0992Hq1.this.getClass();
                    InterfaceC8396oc1 interfaceC8396oc1 = (InterfaceC8396oc1) ((C6830k21) obj).m();
                    BinderC0342Cq1 binderC0342Cq1 = new BinderC0342Cq1((C6905kF3) obj2);
                    Bundle bundle3 = bundle2;
                    if (bundle3 == null) {
                        bundle3 = new Bundle();
                    }
                    C7708mc1 c7708mc1 = (C7708mc1) interfaceC8396oc1;
                    Parcel a2 = c7708mc1.a();
                    AbstractC11786yV.c(a2, binderC0342Cq1);
                    AbstractC11786yV.b(a2, account);
                    a2.writeString(str);
                    AbstractC11786yV.b(a2, bundle3);
                    c7708mc1.h(1, a2);
                }
            };
            c5531gF3.d = 1512;
            try {
                Bundle bundle3 = (Bundle) d(c0992Hq1.b(1, c5531gF3.a()), "token retrieval");
                k(bundle3);
                return c(bundle3);
            } catch (C10114td e) {
                h(e, "token retrieval");
            }
        }
        return (TokenData) a(context, b, new InterfaceC9234r21() { // from class: o21
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
                Parcel a2 = c8727pa12.a();
                AbstractC11786yV.b(a2, account);
                a2.writeString(str);
                AbstractC11786yV.b(a2, bundle2);
                Parcel e2 = c8727pa12.e(5, a2);
                Bundle bundle4 = (Bundle) AbstractC11786yV.a(e2, Bundle.CREATOR);
                e2.recycle();
                if (bundle4 == null) {
                    throw new IOException("Service call returned null");
                }
                return AbstractC9577s21.c(bundle4);
            }
        });
    }

    public static boolean g(Context context) {
        if (C8543p11.d.c(context, 17895000) != 0) {
            return false;
        }
        ((YY0) ((XY0) WY0.g.a.get())).getClass();
        return f(context, ((C9409rZ3) YY0.a.c()).j);
    }

    public static Object d(AF3 af3, String str) {
        C5200fI1 c5200fI1 = c;
        try {
            return UF3.a(af3);
        } catch (InterruptedException e) {
            String format = String.format("Interrupted while waiting for the task of %s to finish.", str);
            c5200fI1.a(format, new Object[0]);
            throw new IOException(format, e);
        } catch (CancellationException e2) {
            String format2 = String.format("Canceled while waiting for the task of %s to finish.", str);
            c5200fI1.a(format2, new Object[0]);
            throw new IOException(format2, e2);
        } catch (ExecutionException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof C10114td) {
                throw ((C10114td) cause);
            }
            String format3 = String.format("Unable to get a result for %s due to ExecutionException.", str);
            c5200fI1.a(format3, new Object[0]);
            throw new IOException(format3, e3);
        }
    }

    public static void h(C10114td c10114td, String str) {
        c.a("%s failed via GoogleAuthServiceClient, falling back to previous approach:\n%s", str, Log.getStackTraceString(c10114td));
    }

    public static void i(Context context, Bundle bundle) {
        String str = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str);
        if (TextUtils.isEmpty(bundle.getString("androidPackageName"))) {
            bundle.putString("androidPackageName", str);
        }
        bundle.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
    }

    public static boolean f(Context context, InterfaceC1377Kp1 interfaceC1377Kp1) {
        String str = context.getApplicationInfo().packageName;
        Iterator it = interfaceC1377Kp1.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals(str)) {
                return false;
            }
        }
        return true;
    }

    public static void j(Account account) {
        if (account == null) {
            throw new IllegalArgumentException("Account cannot be null");
        }
        if (TextUtils.isEmpty(account.name)) {
            throw new IllegalArgumentException("Account name cannot be empty!");
        }
        String[] strArr = a;
        for (int i = 0; i < 3; i++) {
            if (strArr[i].equals(account.type)) {
                return;
            }
        }
        throw new IllegalArgumentException("Account type not supported");
    }

    public static void b(Context context) {
        try {
            X31.b(context.getApplicationContext());
        } catch (S31 e) {
            e = e;
            throw new C6486j21(e.getMessage(), e);
        } catch (T31 e2) {
            String message = e2.getMessage();
            new Intent(e2.a);
            throw new R31(e2.g, message);
        } catch (GooglePlayServicesIncorrectManifestValueException e3) {
            e = e3;
            throw new C6486j21(e.getMessage(), e);
        }
    }

    public static void k(Object obj) {
        if (obj != null) {
            return;
        }
        c.a("Service call returned null.", new Object[0]);
        throw new IOException("Service unavailable.");
    }

    public static Object a(Context context, ComponentName componentName, InterfaceC9234r21 interfaceC9234r21) {
        ServiceConnectionC8529oz serviceConnectionC8529oz = new ServiceConnectionC8529oz();
        D01 b2 = D01.b(context);
        try {
            b2.getClass();
            try {
                if (!b2.a(new A01(componentName), serviceConnectionC8529oz, "GoogleAuthUtil", null)) {
                    throw new IOException("Could not bind to service.");
                }
                try {
                    return interfaceC9234r21.a(serviceConnectionC8529oz.a());
                } catch (RemoteException | InterruptedException | TimeoutException e) {
                    Log.i("GoogleAuthUtil", "Error on service connection.", e);
                    throw new IOException("Error on service connection.", e);
                }
            } finally {
                b2.c(new A01(componentName), serviceConnectionC8529oz);
            }
        } catch (SecurityException e2) {
            Log.w("GoogleAuthUtil", String.format("SecurityException while bind to auth service: %s", e2.getMessage()));
            throw new IOException("SecurityException while binding to Auth service.", e2);
        }
    }
}
