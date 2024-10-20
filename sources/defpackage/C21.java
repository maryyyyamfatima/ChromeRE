package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GoogleCertificatesLookupQuery;
import com.google.android.gms.common.GoogleCertificatesLookupResponse;
import com.google.android.gms.common.GoogleCertificatesQuery;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class C21 {
    public static final BinderC10949w21 a;
    public static final BinderC11292x21 b;
    public static volatile InterfaceC9424rc1 c;
    public static final Object d;
    public static Context e;

    static {
        new BinderC10263u21(AbstractBinderC11635y21.h1("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
        new BinderC10606v21(AbstractBinderC11635y21.h1("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
        a = new BinderC10949w21(AbstractBinderC11635y21.h1("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
        b = new BinderC11292x21(AbstractBinderC11635y21.h1("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
        d = new Object();
    }

    public static void a() {
        InterfaceC9424rc1 c8739pc1;
        if (c != null) {
            return;
        }
        synchronized (d) {
            if (c == null) {
                IBinder h = C1146Iv0.i(e, C1146Iv0.m, "com.google.android.gms.googlecertificates").h("com.google.android.gms.common.GoogleCertificatesImpl");
                int i = AbstractBinderC9082qc1.a;
                if (h == null) {
                    c8739pc1 = null;
                } else {
                    IInterface queryLocalInterface = h.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                    if (queryLocalInterface instanceof InterfaceC9424rc1) {
                        c8739pc1 = (InterfaceC9424rc1) queryLocalInterface;
                    } else {
                        c8739pc1 = new C8739pc1(h);
                    }
                }
                c = c8739pc1;
            }
        }
    }

    public static H21 c(String str, boolean z) {
        try {
            a();
            GoogleCertificatesLookupQuery googleCertificatesLookupQuery = new GoogleCertificatesLookupQuery(str, z, false, new ObjectWrapper(e).asBinder(), false);
            try {
                C8739pc1 c8739pc1 = (C8739pc1) c;
                Parcel a2 = c8739pc1.a();
                AbstractC11786yV.b(a2, googleCertificatesLookupQuery);
                Parcel e2 = c8739pc1.e(6, a2);
                GoogleCertificatesLookupResponse googleCertificatesLookupResponse = (GoogleCertificatesLookupResponse) AbstractC11786yV.a(e2, GoogleCertificatesLookupResponse.CREATOR);
                e2.recycle();
                int i = 1;
                if (googleCertificatesLookupResponse.a) {
                    int[] c2 = AbstractC2373Sg3.c(3);
                    int length = c2.length;
                    for (int i2 = 0; i2 < length && AbstractC2373Sg3.b(c2[i2]) != googleCertificatesLookupResponse.i; i2++) {
                    }
                    return new H21(true, null, null);
                }
                String str2 = googleCertificatesLookupResponse.g;
                int[] c3 = AbstractC2373Sg3.c(6);
                int length2 = c3.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        break;
                    }
                    int i4 = c3[i3];
                    if (AbstractC2373Sg3.b(i4) == googleCertificatesLookupResponse.h) {
                        i = i4;
                        break;
                    }
                    i3++;
                }
                PackageManager.NameNotFoundException nameNotFoundException = AbstractC2373Sg3.a(i, 4) ? new PackageManager.NameNotFoundException() : null;
                if (str2 == null) {
                    str2 = "error checking package certificate";
                }
                int[] c4 = AbstractC2373Sg3.c(3);
                int length3 = c4.length;
                for (int i5 = 0; i5 < length3 && AbstractC2373Sg3.b(c4[i5]) != googleCertificatesLookupResponse.i; i5++) {
                }
                int[] c5 = AbstractC2373Sg3.c(6);
                int length4 = c5.length;
                for (int i6 = 0; i6 < length4 && AbstractC2373Sg3.b(c5[i6]) != googleCertificatesLookupResponse.h; i6++) {
                }
                return new H21(false, str2, nameNotFoundException);
            } catch (RemoteException e3) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
                return H21.b("module call", e3);
            }
        } catch (C0626Ev0 e4) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e4);
            return H21.b("module init: " + e4.getMessage(), e4);
        }
    }

    /* JADX WARN: Type inference failed for: r8v5, types: [t21] */
    public static H21 b(final String str, final AbstractBinderC11635y21 abstractBinderC11635y21, final boolean z, boolean z2) {
        try {
            a();
            GoogleCertificatesQuery googleCertificatesQuery = new GoogleCertificatesQuery(str, abstractBinderC11635y21, z, z2);
            try {
                InterfaceC9424rc1 interfaceC9424rc1 = c;
                ObjectWrapper objectWrapper = new ObjectWrapper(e.getPackageManager());
                C8739pc1 c8739pc1 = (C8739pc1) interfaceC9424rc1;
                Parcel a2 = c8739pc1.a();
                AbstractC11786yV.b(a2, googleCertificatesQuery);
                AbstractC11786yV.c(a2, objectWrapper);
                Parcel e2 = c8739pc1.e(5, a2);
                boolean z3 = e2.readInt() != 0;
                e2.recycle();
                if (!z3) {
                    return new G21(new Callable() { // from class: t21
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            MessageDigest messageDigest;
                            boolean z4 = z;
                            String str2 = str;
                            AbstractBinderC11635y21 abstractBinderC11635y212 = abstractBinderC11635y21;
                            Object[] objArr = new Object[5];
                            objArr[0] = !z4 && C21.b(str2, abstractBinderC11635y212, true, false).a ? "debug cert rejected" : "not allowed";
                            objArr[1] = str2;
                            abstractBinderC11635y212.getClass();
                            int i = 0;
                            while (true) {
                                if (i >= 2) {
                                    messageDigest = null;
                                    break;
                                }
                                try {
                                    messageDigest = MessageDigest.getInstance("SHA-256");
                                } catch (NoSuchAlgorithmException unused) {
                                }
                                if (messageDigest != null) {
                                    break;
                                }
                                i++;
                            }
                            byte[] digest = messageDigest.digest(abstractBinderC11635y212.i1());
                            char[] cArr = new char[digest.length * 2];
                            int i2 = 0;
                            for (byte b2 : digest) {
                                int i3 = b2 & 255;
                                int i4 = i2 + 1;
                                char[] cArr2 = E71.a;
                                cArr[i2] = cArr2[i3 >>> 4];
                                i2 = i4 + 1;
                                cArr[i4] = cArr2[i3 & 15];
                            }
                            objArr[2] = new String(cArr);
                            objArr[3] = Boolean.valueOf(z4);
                            objArr[4] = "222980000.false";
                            return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", objArr);
                        }
                    });
                }
                return H21.c;
            } catch (RemoteException e3) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
                return H21.b("module call", e3);
            }
        } catch (C0626Ev0 e4) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e4);
            return H21.b("module init: " + e4.getMessage(), e4);
        }
    }
}
