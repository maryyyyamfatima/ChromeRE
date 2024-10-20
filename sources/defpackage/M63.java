package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.android.chrome.R;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class M63 extends BroadcastReceiver implements InterfaceC4352cp4 {
    public static final Object g = new Object();
    public static String h;
    public static M63 i;
    public InterfaceC6518j73 a;

    public static void a(WindowAndroid windowAndroid, Intent intent, InterfaceC6518j73 interfaceC6518j73) {
        Context context = V60.a;
        String packageName = context.getPackageName();
        synchronized (g) {
            try {
                if (h == null) {
                    h = packageName + "/" + M63.class.getName() + "_ACTION";
                }
                M63 m63 = i;
                if (m63 != null) {
                    context.unregisterReceiver(m63);
                    M63 m632 = i;
                    InterfaceC6518j73 interfaceC6518j732 = m632.a;
                    if (interfaceC6518j732 != null) {
                        interfaceC6518j732.onCancel();
                        m632.a = null;
                    }
                }
                M63 m633 = new M63(interfaceC6518j73);
                i = m633;
                V60.d(context, m633, new IntentFilter(h));
            } catch (Throwable th) {
                throw th;
            }
        }
        Intent intent2 = new Intent(h);
        intent2.setPackage(packageName);
        intent2.putExtra("receiver_token", i.hashCode());
        N63.a(windowAndroid, Intent.createChooser(intent, context.getString(R.string.0_resource_name_obfuscated_res_0x7f140a1a), PendingIntent.getBroadcast((Activity) windowAndroid.k().get(), 0, intent2, AbstractC2281Ro1.d(true) | 1342177280).getIntentSender()), i);
    }

    public M63(InterfaceC6518j73 interfaceC6518j73) {
        this.a = interfaceC6518j73;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (g) {
            M63 m63 = i;
            if (m63 != this) {
                return;
            }
            V60.a.unregisterReceiver(m63);
            i = null;
            if (intent.hasExtra("receiver_token") && intent.getIntExtra("receiver_token", 0) == hashCode()) {
                ComponentName componentName = (ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT");
                InterfaceC6518j73 interfaceC6518j73 = this.a;
                if (interfaceC6518j73 != null) {
                    interfaceC6518j73.a(componentName);
                    this.a = null;
                }
            }
        }
    }

    @Override // defpackage.InterfaceC4352cp4
    public final void b(Intent intent, int i2) {
        InterfaceC6518j73 interfaceC6518j73;
        if (i2 != 0 || (interfaceC6518j73 = this.a) == null) {
            return;
        }
        interfaceC6518j73.onCancel();
        this.a = null;
    }
}
