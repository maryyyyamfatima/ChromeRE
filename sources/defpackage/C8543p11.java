package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import androidx.fragment.app.h;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: p11, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8543p11 extends C9228r11 {
    public static final Object c = new Object();
    public static final C8543p11 d = new C8543p11();
    public static final int e = C9228r11.a;

    public final PendingIntent f(int i, Context context, String str) {
        Intent b = b(i, context, null);
        if (b == null) {
            return null;
        }
        int i2 = AbstractC4362cr2.a;
        return PendingIntent.getActivity(context, 0, b, 201326592);
    }

    public final void k(Context context, int i) {
        PendingIntent activity;
        Intent b = b(i, context, "n");
        if (b == null) {
            activity = null;
        } else {
            int i2 = AbstractC4362cr2.a;
            activity = PendingIntent.getActivity(context, 0, b, 201326592);
        }
        l(context, i, activity);
    }

    public static V31 h(Context context, U31 u31) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        V31 v31 = new V31(u31);
        int i = X50.c;
        int i2 = Build.VERSION.SDK_INT;
        boolean z = true;
        if (i2 >= 33 || Build.VERSION.CODENAME.charAt(0) == 'T') {
            if (i2 < 33 && Build.VERSION.CODENAME.charAt(0) != 'T') {
                z = false;
            }
            context.registerReceiver(v31, intentFilter, z ? 2 : 0);
        } else {
            context.registerReceiver(v31, intentFilter);
        }
        v31.a = context;
        if (X31.f(context, "com.google.android.gms")) {
            return v31;
        }
        u31.a();
        v31.a();
        return null;
    }

    @Override // defpackage.C9228r11
    public final int c(Context context, int i) {
        return super.c(context, i);
    }

    public final int g(Context context) {
        return super.c(context, C9228r11.a);
    }

    @Override // defpackage.C9228r11
    public final Intent a(int i) {
        return super.b(i, null, null);
    }

    @Override // defpackage.C9228r11
    public final Intent b(int i, Context context, String str) {
        return super.b(i, context, str);
    }

    public final AlertDialog d(int i, int i2, Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        return e(activity, i, new C10169tm0(activity, i2, super.b(i, activity, "d")), onCancelListener);
    }

    public final void j(Activity activity, DA1 da1, int i, AbstractDialogInterfaceOnCancelListenerC0365Cv abstractDialogInterfaceOnCancelListenerC0365Cv) {
        AlertDialog e2 = e(activity, i, new C10512um0(super.b(i, activity, "d"), da1), abstractDialogInterfaceOnCancelListenerC0365Cv);
        if (e2 == null) {
            return;
        }
        i(activity, e2, "GooglePlayServicesErrorDialog", abstractDialogInterfaceOnCancelListenerC0365Cv);
    }

    public static AlertDialog e(Context context, int i, AbstractDialogInterfaceOnClickListenerC10855vm0 abstractDialogInterfaceOnClickListenerC10855vm0, DialogInterface.OnCancelListener onCancelListener) {
        String string;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(E30.b(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = context.getResources();
        if (i == 1) {
            string = resources.getString(com.android.chrome.R.string.f70940_resource_name_obfuscated_res_0x7f14037c);
        } else if (i == 2) {
            string = resources.getString(com.android.chrome.R.string.f71010_resource_name_obfuscated_res_0x7f140383);
        } else if (i == 3) {
            string = resources.getString(com.android.chrome.R.string.f70910_resource_name_obfuscated_res_0x7f140379);
        } else {
            string = resources.getString(R.string.ok);
        }
        if (string != null) {
            builder.setPositiveButton(string, abstractDialogInterfaceOnClickListenerC10855vm0);
        }
        String c2 = E30.c(context, i);
        if (c2 != null) {
            builder.setTitle(c2);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i)), new IllegalArgumentException());
        return builder.create();
    }

    public static void i(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        boolean z;
        try {
            z = activity instanceof VS0;
        } catch (NoClassDefFoundError unused) {
            z = false;
        }
        if (z) {
            h h0 = ((VS0) activity).h0();
            C1119Ip3 c1119Ip3 = new C1119Ip3();
            alertDialog.setOnCancelListener(null);
            alertDialog.setOnDismissListener(null);
            c1119Ip3.r0 = alertDialog;
            if (onCancelListener != null) {
                c1119Ip3.s0 = onCancelListener;
            }
            c1119Ip3.Q0(h0, str);
            return;
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        TC0 tc0 = new TC0();
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        tc0.a = alertDialog;
        if (onCancelListener != null) {
            tc0.g = onCancelListener;
        }
        tc0.show(fragmentManager, str);
    }

    public final void l(Context context, int i, PendingIntent pendingIntent) {
        String c2;
        String d2;
        int i2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i), null), new IllegalArgumentException());
        if (i == 18) {
            new HandlerC8200o11(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        if (i == 6) {
            c2 = E30.e(context, "common_google_play_services_resolution_required_title");
        } else {
            c2 = E30.c(context, i);
        }
        if (c2 == null) {
            c2 = context.getResources().getString(com.android.chrome.R.string.f70980_resource_name_obfuscated_res_0x7f140380);
        }
        if (i == 6 || i == 19) {
            d2 = E30.d(context, "common_google_play_services_resolution_required_text", E30.a(context));
        } else {
            d2 = E30.b(context, i);
        }
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        K62 k62 = new K62(context, null);
        k62.t = true;
        k62.h(16, true);
        k62.f(c2);
        J62 j62 = new J62();
        j62.d = K62.c(d2);
        k62.k(j62);
        PackageManager packageManager = context.getPackageManager();
        if (AbstractC2655Ul0.a == null) {
            AbstractC2655Ul0.a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (AbstractC2655Ul0.a.booleanValue()) {
            k62.E.icon = context.getApplicationInfo().icon;
            k62.k = 2;
            if (AbstractC2655Ul0.a(context)) {
                k62.a(com.android.chrome.R.drawable.f45870_resource_name_obfuscated, resources.getString(com.android.chrome.R.string.f71060_resource_name_obfuscated_res_0x7f140388), pendingIntent);
            } else {
                k62.g = pendingIntent;
            }
        } else {
            k62.E.icon = R.drawable.stat_sys_warning;
            k62.E.tickerText = K62.c(resources.getString(com.android.chrome.R.string.f70980_resource_name_obfuscated_res_0x7f140380));
            k62.E.when = System.currentTimeMillis();
            k62.g = pendingIntent;
            k62.e(d2);
        }
        if (AbstractC0758Fv2.a()) {
            synchronized (c) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(com.android.chrome.R.string.f70970_resource_name_obfuscated_res_0x7f14037f);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            k62.B = "com.google.android.gms.availability";
        }
        Notification b = k62.b();
        if (i == 1 || i == 2 || i == 3) {
            X31.c.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, b);
    }
}
