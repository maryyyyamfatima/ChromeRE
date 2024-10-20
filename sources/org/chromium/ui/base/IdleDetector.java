package org.chromium.ui.base;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.os.SystemClock;
import defpackage.V60;
import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class IdleDetector extends BroadcastReceiver {
    public boolean a;
    public long b;

    public IdleDetector() {
        if (isScreenLocked()) {
            this.a = true;
            this.b = SystemClock.elapsedRealtime();
        } else {
            this.a = false;
            this.b = 0L;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        V60.a.registerReceiver(this, intentFilter);
    }

    public static IdleDetector create() {
        return new IdleDetector();
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            if (intent.getAction().equals("android.intent.action.USER_PRESENT")) {
                this.a = false;
                this.b = 0L;
                return;
            }
            return;
        }
        this.a = true;
        this.b = SystemClock.elapsedRealtime();
    }

    public final boolean isScreenLocked() {
        Context context = V60.a;
        if (((KeyguardManager) context.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return true;
        }
        if (((PowerManager) context.getSystemService("power")) == null) {
            return false;
        }
        return !r0.isInteractive();
    }

    public final long getIdleTime() {
        if (this.a) {
            return TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime() - this.b);
        }
        return 0L;
    }
}
