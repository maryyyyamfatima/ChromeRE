package com.google.vr.ndk.base;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.vr.sdk.common.deps.c;
import com.google.vr.sdk.proto.nano.CardboardDevice$DeviceParams;
import com.google.vr.vrcore.base.api.VrCoreUtils;
import defpackage.AbstractBinderC0677Ff1;
import defpackage.AbstractBinderC2106Qf1;
import defpackage.C10790vb1;
import defpackage.C1976Pf1;
import defpackage.C6029hi4;
import defpackage.InterfaceC0807Gf1;
import defpackage.InterfaceC11476xb1;
import defpackage.InterfaceC2236Rf1;
import defpackage.Qi4;
import defpackage.Ri4;
import defpackage.Si4;
import defpackage.Ui4;
import java.util.ArrayList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public class DaydreamApi implements AutoCloseable {
    private static final String TAG = "DaydreamApi";
    private boolean closed;
    private final Context context;
    private InterfaceC11476xb1 daydreamManager;
    private int vrCoreApiVersion;
    private InterfaceC2236Rf1 vrCoreSdkService;
    private ArrayList queuedRunnables = new ArrayList();
    private final ServiceConnection connection = new ServiceConnection() { // from class: com.google.vr.ndk.base.DaydreamApi.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            InterfaceC2236Rf1 c1976Pf1;
            DaydreamApi daydreamApi = DaydreamApi.this;
            int i = AbstractBinderC2106Qf1.a;
            if (iBinder == null) {
                c1976Pf1 = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.vr.vrcore.common.api.IVrCoreSdkService");
                if (queryLocalInterface instanceof InterfaceC2236Rf1) {
                    c1976Pf1 = (InterfaceC2236Rf1) queryLocalInterface;
                } else {
                    c1976Pf1 = new C1976Pf1(iBinder);
                }
            }
            daydreamApi.vrCoreSdkService = c1976Pf1;
            try {
                DaydreamApi daydreamApi2 = DaydreamApi.this;
                daydreamApi2.daydreamManager = ((C1976Pf1) daydreamApi2.vrCoreSdkService).a();
            } catch (RemoteException unused) {
                Log.e(DaydreamApi.TAG, "RemoteException in onServiceConnected");
            }
            if (DaydreamApi.this.daydreamManager == null) {
                Log.w(DaydreamApi.TAG, "Daydream service component unavailable.");
            }
            ArrayList arrayList = DaydreamApi.this.queuedRunnables;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ((Runnable) obj).run();
            }
            DaydreamApi.this.queuedRunnables.clear();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            DaydreamApi.this.vrCoreSdkService = null;
        }
    };

    public static DaydreamApi create(Context context) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("DaydreamApi must only be used from the main thread.");
        }
        if (!DaydreamUtils.isDaydreamPhone(context)) {
            Log.i(TAG, "Phone is not Daydream-compatible");
            return null;
        }
        DaydreamApi daydreamApi = new DaydreamApi(context);
        if (daydreamApi.init()) {
            return daydreamApi;
        }
        Log.w(TAG, "Failed to initialize DaydreamApi object.");
        return null;
    }

    public static boolean isDaydreamReadyPlatform(Context context) {
        return DaydreamUtils.isDaydreamPhone(context);
    }

    public int getCurrentViewerType() {
        checkNotClosed();
        if (!isDaydreamReadyPlatform(this.context)) {
            return 0;
        }
        Qi4 a = Si4.a(this.context);
        try {
            CardboardDevice$DeviceParams a2 = a.a();
            if (a2 == null) {
                return 0;
            }
            if (!DaydreamUtils.isDaydreamViewer(a2)) {
                return 0;
            }
            a.close();
            return 1;
        } finally {
            a.close();
        }
    }

    public static boolean supports2dInVr(Context context) {
        Boolean bool = SdkConfigurationReader.getParams(context).allowVrcoreCompositing;
        return bool != null && bool.booleanValue();
    }

    public static boolean isInVrSession(Context context) {
        return getBooleanSetting(context, "is_in_vr_session", false);
    }

    private static boolean getBooleanSetting(Context context, String str, boolean z) {
        Ri4 c = Si4.c(context);
        if (c == null) {
            String str2 = TAG;
            String valueOf = String.valueOf(str);
            Log.e(str2, valueOf.length() != 0 ? "No ContentProvider available for ".concat(valueOf) : new String("No ContentProvider available for "));
            return z;
        }
        Cursor cursor = null;
        try {
            try {
                try {
                    cursor = c.a.query(Ui4.a(c.b, str), null, null, null, null);
                    if (cursor == null || !cursor.moveToFirst()) {
                        if (cursor != null) {
                            cursor.close();
                        }
                        return z;
                    }
                    boolean z2 = cursor.getInt(0) == 1;
                    cursor.close();
                    return z2;
                } catch (RemoteException e) {
                    String str3 = TAG;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 42);
                    sb.append("Failed to read ");
                    sb.append(str);
                    sb.append(" state from ContentProvider");
                    Log.e(str3, sb.toString(), e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return z;
                }
            } catch (SecurityException e2) {
                String str4 = TAG;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 60);
                sb2.append("Insufficient permissions to read ");
                sb2.append(str);
                sb2.append(" state from ContentProvider");
                Log.e(str4, sb2.toString(), e2);
                if (cursor != null) {
                    cursor.close();
                }
                return z;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public void launchInVr(PendingIntent pendingIntent) {
        checkNotClosed();
        launchInVr(pendingIntent, null);
    }

    private void launchInVr(final PendingIntent pendingIntent, final ComponentName componentName) {
        runWhenServiceConnected(new Runnable() { // from class: com.google.vr.ndk.base.DaydreamApi.3
            @Override // java.lang.Runnable
            public void run() {
                if (DaydreamApi.this.daydreamManager == null) {
                    Log.w(DaydreamApi.TAG, "Can't launch PendingIntent via DaydreamManager: not available.");
                    try {
                        pendingIntent.send();
                        return;
                    } catch (Exception e) {
                        Log.e(DaydreamApi.TAG, "Couldn't launch PendingIntent: ", e);
                        return;
                    }
                }
                try {
                    InterfaceC11476xb1 interfaceC11476xb1 = DaydreamApi.this.daydreamManager;
                    PendingIntent pendingIntent2 = pendingIntent;
                    ComponentName componentName2 = componentName;
                    C10790vb1 c10790vb1 = (C10790vb1) interfaceC11476xb1;
                    Parcel obtainAndWriteInterfaceToken = c10790vb1.obtainAndWriteInterfaceToken();
                    c.a(obtainAndWriteInterfaceToken, pendingIntent2);
                    c.a(obtainAndWriteInterfaceToken, componentName2);
                    Parcel transactAndReadException = c10790vb1.transactAndReadException(7, obtainAndWriteInterfaceToken);
                    c.a(transactAndReadException);
                    transactAndReadException.recycle();
                } catch (RemoteException e2) {
                    Log.e(DaydreamApi.TAG, "RemoteException while launching PendingIntent in VR.", e2);
                }
            }
        });
    }

    private void launchTransitionCallbackInVr(final InterfaceC0807Gf1 interfaceC0807Gf1) {
        runWhenServiceConnected(new Runnable() { // from class: com.google.vr.ndk.base.DaydreamApi.4
            /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:5:0x0034  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    r3 = this;
                    com.google.vr.ndk.base.DaydreamApi r0 = com.google.vr.ndk.base.DaydreamApi.this
                    xb1 r0 = com.google.vr.ndk.base.DaydreamApi.access$100(r0)
                    if (r0 == 0) goto L31
                    com.google.vr.ndk.base.DaydreamApi r0 = com.google.vr.ndk.base.DaydreamApi.this     // Catch: android.os.RemoteException -> L27
                    xb1 r0 = com.google.vr.ndk.base.DaydreamApi.access$100(r0)     // Catch: android.os.RemoteException -> L27
                    Gf1 r1 = r2     // Catch: android.os.RemoteException -> L27
                    vb1 r0 = (defpackage.C10790vb1) r0     // Catch: android.os.RemoteException -> L27
                    android.os.Parcel r2 = r0.obtainAndWriteInterfaceToken()     // Catch: android.os.RemoteException -> L27
                    com.google.vr.sdk.common.deps.c.a(r2, r1)     // Catch: android.os.RemoteException -> L27
                    r1 = 9
                    android.os.Parcel r0 = r0.transactAndReadException(r1, r2)     // Catch: android.os.RemoteException -> L27
                    boolean r1 = com.google.vr.sdk.common.deps.c.a(r0)     // Catch: android.os.RemoteException -> L27
                    r0.recycle()     // Catch: android.os.RemoteException -> L27
                    goto L32
                L27:
                    r0 = move-exception
                    java.lang.String r1 = com.google.vr.ndk.base.DaydreamApi.access$200()
                    java.lang.String r2 = "RemoteException while launching VR transition: "
                    android.util.Log.e(r1, r2, r0)
                L31:
                    r1 = 0
                L32:
                    if (r1 != 0) goto L42
                    java.lang.String r0 = com.google.vr.ndk.base.DaydreamApi.access$200()
                    java.lang.String r1 = "Can't launch callbacks via DaydreamManager, sending manually"
                    android.util.Log.w(r0, r1)
                    Gf1 r0 = r2     // Catch: android.os.RemoteException -> L42
                    r0.onTransitionComplete()     // Catch: android.os.RemoteException -> L42
                L42:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.vr.ndk.base.DaydreamApi.AnonymousClass4.run():void");
            }
        });
    }

    public void launchVrHomescreen() {
        checkNotClosed();
        runWhenServiceConnected(new Runnable() { // from class: com.google.vr.ndk.base.DaydreamApi.5
            @Override // java.lang.Runnable
            public void run() {
                if (DaydreamApi.this.daydreamManager == null) {
                    Log.e(DaydreamApi.TAG, "Can't launch VR homescreen via DaydreamManager. Giving up trying to leave current VR activity...");
                    return;
                }
                try {
                    C10790vb1 c10790vb1 = (C10790vb1) DaydreamApi.this.daydreamManager;
                    Parcel transactAndReadException = c10790vb1.transactAndReadException(8, c10790vb1.obtainAndWriteInterfaceToken());
                    boolean a = c.a(transactAndReadException);
                    transactAndReadException.recycle();
                    if (a) {
                        return;
                    }
                    Log.e(DaydreamApi.TAG, "There is no VR homescreen installed.");
                } catch (RemoteException e) {
                    String str = DaydreamApi.TAG;
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 47);
                    sb.append("RemoteException while launching VR homescreen: ");
                    sb.append(valueOf);
                    Log.e(str, sb.toString());
                }
            }
        });
    }

    public void launchInVr(Intent intent) {
        checkNotClosed();
        if (intent == null) {
            throw new IllegalArgumentException("Null argument 'intent' passed to launchInVr");
        }
        checkIntent(intent);
        launchInVr(PendingIntent.getActivity(this.context, 0, intent, 1207959552), intent.getComponent());
    }

    public void launchInVr(ComponentName componentName) {
        checkNotClosed();
        if (componentName == null) {
            throw new IllegalArgumentException("Null argument 'componentName' passed to launchInVr");
        }
        Intent createVrIntent = createVrIntent(componentName);
        checkIntent(createVrIntent);
        launchInVr(PendingIntent.getActivity(this.context, 0, createVrIntent, 1073741824), createVrIntent.getComponent());
    }

    public void launchInVrForResult(final Activity activity, final PendingIntent pendingIntent, final int i) {
        checkNotClosed();
        launchTransitionCallbackInVr(new AbstractBinderC0677Ff1(this) { // from class: com.google.vr.ndk.base.DaydreamApi.6
            @Override // defpackage.InterfaceC0807Gf1
            public void onTransitionComplete() {
                activity.runOnUiThread(new Runnable() { // from class: com.google.vr.ndk.base.DaydreamApi.6.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, null, 0, 0, 0);
                        } catch (IntentSender.SendIntentException e) {
                            String str = DaydreamApi.TAG;
                            String valueOf = String.valueOf(e);
                            StringBuilder sb = new StringBuilder(valueOf.length() + 43);
                            sb.append("Exception while starting next VR activity: ");
                            sb.append(valueOf);
                            Log.e(str, sb.toString());
                        }
                    }
                });
            }
        });
    }

    public static Intent createVrIntent(ComponentName componentName) {
        Intent intent = new Intent();
        intent.setComponent(componentName);
        return setupVrIntent(intent);
    }

    public static Intent setupVrIntent(Intent intent) {
        intent.addCategory("com.google.intent.category.DAYDREAM");
        intent.addFlags(335609856);
        return intent;
    }

    public void exitFromVr(Activity activity, int i, Intent intent) {
        checkNotClosed();
        if (intent == null) {
            intent = new Intent();
        }
        final PendingIntent createPendingResult = activity.createPendingResult(i, intent, 1073741824);
        final Runnable runnable = new Runnable(this) { // from class: com.google.vr.ndk.base.DaydreamApi.7
            @Override // java.lang.Runnable
            public void run() {
                try {
                    createPendingResult.send(0);
                } catch (Exception e) {
                    String str = DaydreamApi.TAG;
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 31);
                    sb.append("Couldn't launch PendingIntent: ");
                    sb.append(valueOf);
                    Log.e(str, sb.toString());
                }
            }
        };
        runWhenServiceConnected(new Runnable() { // from class: com.google.vr.ndk.base.DaydreamApi.8
            @Override // java.lang.Runnable
            public void run() {
                if (DaydreamApi.this.daydreamManager == null) {
                    Log.w(DaydreamApi.TAG, "Failed to exit VR: Daydream service unavailable.");
                    runnable.run();
                    return;
                }
                try {
                    InterfaceC11476xb1 interfaceC11476xb1 = DaydreamApi.this.daydreamManager;
                    PendingIntent pendingIntent = createPendingResult;
                    C10790vb1 c10790vb1 = (C10790vb1) interfaceC11476xb1;
                    Parcel obtainAndWriteInterfaceToken = c10790vb1.obtainAndWriteInterfaceToken();
                    c.a(obtainAndWriteInterfaceToken, pendingIntent);
                    Parcel transactAndReadException = c10790vb1.transactAndReadException(10, obtainAndWriteInterfaceToken);
                    boolean a = c.a(transactAndReadException);
                    transactAndReadException.recycle();
                    if (a) {
                        return;
                    }
                    Log.w(DaydreamApi.TAG, "Failed to exit VR: Invalid request.");
                    runnable.run();
                } catch (RemoteException e) {
                    String str = DaydreamApi.TAG;
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 49);
                    sb.append("Failed to exit VR: RemoteException while exiting:");
                    sb.append(valueOf);
                    Log.e(str, sb.toString());
                    runnable.run();
                }
            }
        });
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        this.closed = true;
        runWhenServiceConnected(new Runnable() { // from class: com.google.vr.ndk.base.DaydreamApi.12
            @Override // java.lang.Runnable
            public void run() {
                DaydreamApi.this.context.unbindService(DaydreamApi.this.connection);
                DaydreamApi.this.vrCoreSdkService = null;
            }
        });
    }

    public DaydreamApi(Context context) {
        this.context = context;
    }

    public boolean init() {
        int vrCoreClientApiVersion;
        try {
            vrCoreClientApiVersion = VrCoreUtils.getVrCoreClientApiVersion(this.context);
            this.vrCoreApiVersion = vrCoreClientApiVersion;
        } catch (C6029hi4 e) {
            String str = TAG;
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(valueOf.length() + 22);
            sb.append("VrCore not available: ");
            sb.append(valueOf);
            Log.e(str, sb.toString());
        }
        if (vrCoreClientApiVersion < 8) {
            String str2 = TAG;
            StringBuilder sb2 = new StringBuilder(69);
            sb2.append("VrCore out of date, current version: ");
            sb2.append(vrCoreClientApiVersion);
            sb2.append(", required version: 8");
            Log.e(str2, sb2.toString());
            return false;
        }
        Intent intent = new Intent("com.google.vr.vrcore.BIND_SDK_SERVICE");
        intent.setPackage("com.google.vr.vrcore");
        if (this.context.bindService(intent, this.connection, 1)) {
            return true;
        }
        Log.e(TAG, "Unable to bind to VrCoreSdkService");
        return false;
    }

    public void runWhenServiceConnected(Runnable runnable) {
        if (this.vrCoreSdkService != null) {
            runnable.run();
        } else {
            this.queuedRunnables.add(runnable);
        }
    }

    private void checkIntent(Intent intent) {
        List<ResolveInfo> queryIntentActivities = this.context.getPackageManager().queryIntentActivities(intent, 0);
        if (queryIntentActivities == null || queryIntentActivities.isEmpty()) {
            String valueOf = String.valueOf(intent);
            StringBuilder sb = new StringBuilder(valueOf.length() + 43);
            sb.append("No activity is available to handle intent: ");
            sb.append(valueOf);
            throw new ActivityNotFoundException(sb.toString());
        }
    }

    private void checkNotClosed() {
        if (this.closed) {
            throw new IllegalStateException("DaydreamApi object is closed and can no longer be used.");
        }
    }
}
