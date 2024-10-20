package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.vr.audio.DeviceInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Kl0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1356Kl0 extends BroadcastReceiver {
    public final /* synthetic */ DeviceInfo a;

    public C1356Kl0(DeviceInfo deviceInfo) {
        this.a = deviceInfo;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.HEADSET_PLUG")) {
            int intExtra = intent.getIntExtra("state", -1);
            DeviceInfo deviceInfo = this.a;
            if (intExtra == 0) {
                deviceInfo.nativeUpdateHeadphoneStateChange(deviceInfo.a, 2);
            } else if (intExtra != 1) {
                deviceInfo.nativeUpdateHeadphoneStateChange(deviceInfo.a, 0);
            } else {
                deviceInfo.nativeUpdateHeadphoneStateChange(deviceInfo.a, 1);
            }
        }
    }
}
