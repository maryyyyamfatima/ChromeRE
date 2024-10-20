package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ar4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3677ar4 extends ContextWrapper {
    public BroadcastReceiver a;

    public C3677ar4(Context context) {
        super(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler) {
        if (intentFilter.hasAction("com.google.android.gms.auth.api.phone.SMS_CODE_RETRIEVED")) {
            this.a = broadcastReceiver;
        }
        return super.registerReceiver(broadcastReceiver, intentFilter, str, handler);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
        if (intentFilter.hasAction("com.google.android.gms.auth.api.phone.SMS_CODE_RETRIEVED")) {
            this.a = broadcastReceiver;
        }
        return super.registerReceiver(broadcastReceiver, intentFilter, str, handler, i);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        throw new RuntimeException();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        throw new RuntimeException();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        if (broadcastReceiver == this.a) {
            this.a = null;
        }
        super.unregisterReceiver(broadcastReceiver);
    }
}
