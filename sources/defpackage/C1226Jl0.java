package defpackage;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import org.chromium.net.NetworkChangeNotifier;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Jl0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1226Jl0 {
    public final boolean a;
    public final int b;
    public final boolean c;
    public final int d;
    public final boolean e;

    public C1226Jl0(int i, int i2, boolean z, boolean z2, boolean z3) {
        this.d = 0;
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = i2;
        this.e = z3;
    }

    public C1226Jl0() {
        this.d = 0;
        this.c = true;
        this.e = true;
    }

    public static int b(Context context) {
        int i;
        NetworkChangeNotifier networkChangeNotifier = NetworkChangeNotifier.f;
        int currentConnectionType = networkChangeNotifier != null ? networkChangeNotifier.getCurrentConnectionType() : 6;
        if (currentConnectionType == 6) {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting()) {
                int type = activeNetworkInfo.getType();
                if (type == 1) {
                    i = 2;
                } else if (type == 0) {
                    i = 3;
                } else {
                    currentConnectionType = 7;
                    if (type != 7) {
                        return 0;
                    }
                }
                return i;
            }
        }
        return currentConnectionType;
    }

    public static boolean c(Context context) {
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        if (keyguardManager == null || keyguardManager.isKeyguardLocked()) {
            return false;
        }
        return ((PowerManager) context.getSystemService("power")).isInteractive();
    }

    public static C1226Jl0 a(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return new C1226Jl0();
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        boolean z = intExtra == 2 || intExtra == 5;
        int intExtra2 = registerReceiver.getIntExtra("scale", -1);
        int round = intExtra2 == 0 ? 0 : Math.round((registerReceiver.getIntExtra("level", -1) * 100) / intExtra2);
        int b = b(context);
        boolean isPowerSaveMode = ((PowerManager) context.getSystemService("power")).isPowerSaveMode();
        boolean isActiveNetworkMetered = ((ConnectivityManager) context.getSystemService("connectivity")).isActiveNetworkMetered();
        c(context);
        return new C1226Jl0(round, b, z, isPowerSaveMode, isActiveNetworkMetered);
    }
}
