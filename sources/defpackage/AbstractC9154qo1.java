package defpackage;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.instantapps.InstantAppIntentData;
import com.google.android.gms.instantapps.internal.RoutingOptions;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qo1 */
/* loaded from: classes.dex */
public abstract class AbstractC9154qo1 {
    public static Boolean a;
    public static ContentProviderClient b;

    public static InstantAppIntentData b(Context context, String str, boolean z, RoutingOptions routingOptions, Bundle bundle) {
        boolean booleanValue;
        InstantAppIntentData instantAppIntentData;
        Intent intent;
        if (context == null || str == null) {
            throw new IllegalArgumentException("Parameter is null");
        }
        EX0 a2 = AbstractC7236lD0.a(Yo4.J5);
        synchronized (AbstractC9154qo1.class) {
            Boolean bool = a;
            if (bool != null) {
                booleanValue = bool.booleanValue();
            } else {
                Boolean valueOf = Boolean.valueOf(c(context));
                a = valueOf;
                booleanValue = valueOf.booleanValue();
            }
        }
        if (!booleanValue) {
            return InstantAppIntentData.i;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("key_preferParcelableIntentData", true);
        bundle2.putByteArray("key_routingOptions", ST2.b(routingOptions));
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        BX0 bx0 = null;
        try {
            Bundle a3 = a(context, str, bundle2);
            if (a3 == null) {
                return InstantAppIntentData.i;
            }
            a3.setClassLoader(InstantAppIntentData.class.getClassLoader());
            try {
                instantAppIntentData = (InstantAppIntentData) a3.getParcelable("key_instantAppIntentDataParcelable");
            } catch (Exception unused) {
                instantAppIntentData = null;
            }
            if (instantAppIntentData == null) {
                byte[] byteArray = a3.getByteArray("key_instantAppIntentData");
                if (byteArray == null) {
                    return InstantAppIntentData.i;
                }
                instantAppIntentData = (InstantAppIntentData) ST2.a(byteArray, InstantAppIntentData.CREATOR);
            }
            if (instantAppIntentData != null && (intent = instantAppIntentData.a) != null && intent.hasExtra("key_eventListProtoBytes")) {
                EX0 a4 = AbstractC7236lD0.a(Yo4.K5);
                byte[] byteArrayExtra = intent.getByteArrayExtra("key_eventListProtoBytes");
                if (byteArrayExtra != null) {
                    try {
                        BX0 bx02 = (BX0) CX0.k.j();
                        XF0 c = XF0.c();
                        bx02.getClass();
                        bx02.n(byteArrayExtra, byteArrayExtra.length, c);
                        bx0 = bx02;
                    } catch (C1127Ir1 e) {
                        Log.e("EventLogHelper", "Could not read event list proto", e);
                    }
                }
                if (bx0 != null) {
                    bx0.o(0, a2);
                    bx0.o(((CX0) bx0.g).j.size(), a4);
                } else {
                    bx0 = (BX0) CX0.k.j();
                    bx0.p(a2);
                    bx0.p(a4);
                }
                intent.putExtra("key_eventListProtoBytes", ((CX0) bx0.j()).toByteArray());
            }
            return instantAppIntentData;
        } catch (DeadObjectException e2) {
            Log.e("InstantAppsApi", String.format("While calling %s %s:\n", AbstractC9588s40.a, "method_getInstantAppIntentData"), e2);
            synchronized (AbstractC9154qo1.class) {
                ContentProviderClient contentProviderClient = b;
                if (contentProviderClient != null) {
                    contentProviderClient.release();
                    b = null;
                }
                a = null;
                if (z) {
                    return b(context, str, false, routingOptions, bundle);
                }
                return InstantAppIntentData.i;
            }
        } catch (RemoteException e3) {
            e = e3;
            Log.e("InstantAppsApi", String.format("While calling %s %s:\n", AbstractC9588s40.a, "method_getInstantAppIntentData"), e);
            return InstantAppIntentData.i;
        } catch (IllegalArgumentException e4) {
            e = e4;
            Log.e("InstantAppsApi", String.format("While calling %s %s:\n", AbstractC9588s40.a, "method_getInstantAppIntentData"), e);
            return InstantAppIntentData.i;
        }
    }

    public static synchronized Bundle a(Context context, String str, Bundle bundle) {
        Bundle call;
        synchronized (AbstractC9154qo1.class) {
            if (b != null) {
                synchronized (AbstractC9154qo1.class) {
                    call = b.call("method_getInstantAppIntentData", str, bundle);
                }
                return call;
            }
            return context.getContentResolver().call(AbstractC9588s40.a, "method_getInstantAppIntentData", str, bundle);
        }
    }

    public static synchronized boolean c(Context context) {
        boolean z;
        synchronized (AbstractC9154qo1.class) {
            if (!AbstractC9414ra3.a(context)) {
                return false;
            }
            PackageManager packageManager = context.getPackageManager();
            Uri uri = AbstractC9588s40.a;
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(uri.getAuthority(), 0);
            if (resolveContentProvider == null) {
                return false;
            }
            if (resolveContentProvider.packageName.equals("com.google.android.gms")) {
                synchronized (AbstractC9154qo1.class) {
                    if (b == null) {
                        b = context.getApplicationContext().getContentResolver().acquireUnstableContentProviderClient(uri);
                    }
                    z = b != null;
                }
                return z;
            }
            Log.e("InstantAppsApi", "Incorrect package name for instant apps content provider: " + resolveContentProvider.packageName);
            return false;
        }
    }
}
