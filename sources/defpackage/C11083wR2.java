package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.iid.MessengerCompat;
import java.io.IOException;
import java.security.KeyPair;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wR2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11083wR2 {
    public static String g = null;
    public static boolean h = false;
    public static int i;
    public static C10740vR2 j;
    public static final Pattern k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public final Context a;
    public final C4317ck b = new C4317ck();
    public Messenger c;
    public Messenger d;
    public MessengerCompat e;
    public PendingIntent f;

    public C11083wR2(Context context) {
        this.a = context;
    }

    public static String a(Context context) {
        boolean z;
        boolean z2;
        String str = g;
        if (str != null) {
            return str;
        }
        Process.myUid();
        PackageManager packageManager = context.getPackageManager();
        boolean z3 = false;
        if (!AbstractC0758Fv2.a()) {
            Iterator<ResolveInfo> it = packageManager.queryIntentServices(new Intent("com.google.android.c2dm.intent.REGISTER"), 0).iterator();
            while (true) {
                if (!it.hasNext()) {
                    z2 = false;
                    break;
                }
                if (g(packageManager, it.next().serviceInfo.packageName, "com.google.android.c2dm.intent.REGISTER")) {
                    h = false;
                    z2 = true;
                    break;
                }
            }
            if (z2) {
                return g;
            }
        }
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(new Intent("com.google.iid.TOKEN_REQUEST"), 0);
        if (queryBroadcastReceivers != null) {
            Iterator<ResolveInfo> it2 = queryBroadcastReceivers.iterator();
            while (it2.hasNext()) {
                if (g(packageManager, it2.next().activityInfo.packageName, "com.google.iid.TOKEN_REQUEST")) {
                    h = true;
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (z) {
            return g;
        }
        Log.w("InstanceID", "Failed to resolve IID implementation package, falling back");
        try {
            g = packageManager.getApplicationInfo("com.google.android.gms", 0).packageName;
            z3 = true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (z3) {
            h = AbstractC0758Fv2.a();
            return g;
        }
        Log.w("InstanceID", "Google Play services is missing, unable to get tokens");
        return null;
    }

    public static boolean g(PackageManager packageManager, String str, String str2) {
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", str) != 0) {
            Log.w("InstanceID", KR0.a("Possible malicious package ", str, " declares ", str2, " without permission"));
            return false;
        }
        try {
            g = packageManager.getApplicationInfo(str, 0).packageName;
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static String b(Bundle bundle) {
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string == null) {
            string = bundle.getString("unregistered");
        }
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("error");
        if (string2 != null) {
            throw new IOException(string2);
        }
        Log.w("InstanceID", "Unexpected response from GCM ".concat(String.valueOf(bundle)), new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    public static void f(Object obj, Object obj2) {
        if (obj instanceof ConditionVariable) {
            ((ConditionVariable) obj).open();
        }
        if (obj instanceof Messenger) {
            Messenger messenger = (Messenger) obj;
            Message obtain = Message.obtain();
            obtain.obj = obj2;
            try {
                messenger.send(obtain);
            } catch (RemoteException e) {
                Log.w("InstanceID", "Failed to send response ".concat(String.valueOf(e)));
            }
        }
    }

    public final void c(Intent intent) {
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action) && !"com.google.android.gms.iid.InstanceID".equals(action)) {
            if (Log.isLoggable("InstanceID", 3)) {
                intent.getAction();
                return;
            }
            return;
        }
        String stringExtra = intent.getStringExtra("registration_id");
        if (stringExtra == null) {
            stringExtra = intent.getStringExtra("unregistered");
        }
        if (stringExtra == null) {
            String stringExtra2 = intent.getStringExtra("error");
            if (stringExtra2 == null) {
                Log.w("InstanceID", "Unexpected response, no error or registration id ".concat(String.valueOf(intent.getExtras())));
                return;
            }
            String str = null;
            if (stringExtra2.startsWith("|")) {
                String[] split = stringExtra2.split("\\|");
                if (!"ID".equals(split[1])) {
                    Log.w("InstanceID", "Unexpected structured response ".concat(stringExtra2));
                }
                if (split.length > 2) {
                    String str2 = split[2];
                    String str3 = split[3];
                    if (str3.startsWith(":")) {
                        str3 = str3.substring(1);
                    }
                    str = str2;
                    stringExtra2 = str3;
                } else {
                    stringExtra2 = "UNKNOWN";
                }
                intent.putExtra("error", stringExtra2);
            }
            if (str == null) {
                synchronized (C11083wR2.class) {
                    Iterator it = ((C3164Yj) this.b.keySet()).iterator();
                    while (true) {
                        AbstractC3638al1 abstractC3638al1 = (AbstractC3638al1) it;
                        if (abstractC3638al1.hasNext()) {
                            String str4 = (String) abstractC3638al1.next();
                            Object obj = this.b.get(str4);
                            this.b.put(str4, stringExtra2);
                            f(obj, stringExtra2);
                        }
                    }
                }
                return;
            }
            synchronized (C11083wR2.class) {
                Object obj2 = this.b.get(str);
                this.b.put(str, stringExtra2);
                f(obj2, stringExtra2);
            }
            return;
        }
        Matcher matcher = k.matcher(stringExtra);
        if (matcher.matches()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            Bundle extras = intent.getExtras();
            extras.putString("registration_id", group2);
            synchronized (C11083wR2.class) {
                Object obj3 = this.b.get(group);
                this.b.put(group, extras);
                f(obj3, extras);
            }
        }
    }

    public final Bundle d(Bundle bundle, KeyPair keyPair) {
        int i2;
        String str;
        int i3;
        AF3 af3;
        Context context = this.a;
        try {
            i2 = context.getPackageManager().getPackageInfo(a(context), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            i2 = -1;
        }
        bundle.putString("gmsv", Integer.toString(i2));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        Context context2 = this.a;
        bundle.putString("app_ver", Integer.toString(C0457Dn1.c(context2)));
        try {
            str = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("InstanceID", "Never happens: can't find own package ".concat(String.valueOf(e)));
            str = null;
        }
        bundle.putString("app_ver_name", str);
        bundle.putString("cliv", "iid-222980000");
        bundle.putString("appid", C0457Dn1.d(keyPair));
        if (i2 >= 12000000) {
            C8364oW1 c8364oW1 = new C8364oW1(this.a);
            synchronized (c8364oW1) {
                i3 = c8364oW1.d;
                c8364oW1.d = i3 + 1;
            }
            C8020nW1 c8020nW1 = new C8020nW1(i3, bundle);
            synchronized (c8364oW1) {
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    String.valueOf(c8020nW1);
                }
                if (!c8364oW1.c.a(c8020nW1)) {
                    ServiceConnectionC5614gW1 serviceConnectionC5614gW1 = new ServiceConnectionC5614gW1(c8364oW1);
                    c8364oW1.c = serviceConnectionC5614gW1;
                    serviceConnectionC5614gW1.a(c8020nW1);
                }
                af3 = c8020nW1.b.a;
            }
            try {
                return (Bundle) UF3.a(af3);
            } catch (InterruptedException | ExecutionException e2) {
                if (Log.isLoggable("InstanceID", 3)) {
                    String.valueOf(e2);
                }
                if (!(e2.getCause() instanceof C7332lW1) || ((C7332lW1) e2.getCause()).a != 4) {
                    return null;
                }
                Bundle e3 = e(bundle);
                if (e3 == null || !e3.containsKey("google.messenger")) {
                    return e3;
                }
                Bundle e4 = e(bundle);
                if (e4 == null || !e4.containsKey("google.messenger")) {
                    return e4;
                }
                return null;
            }
        }
        Bundle e5 = e(bundle);
        if (e5 == null || !e5.containsKey("google.messenger")) {
            return e5;
        }
        Bundle e6 = e(bundle);
        if (e6 == null || !e6.containsKey("google.messenger")) {
            return e6;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0153 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle e(android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11083wR2.e(android.os.Bundle):android.os.Bundle");
    }
}
