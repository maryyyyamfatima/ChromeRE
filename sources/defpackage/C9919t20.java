package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.Surface;
import org.chromium.chrome.browser.compositor.CompositorView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: t20 */
/* loaded from: classes.dex */
public final class C9919t20 extends BroadcastReceiver {
    public boolean a;
    public Surface b;
    public final /* synthetic */ CompositorView c;

    public C9919t20(CompositorView compositorView) {
        this.c = compositorView;
        compositorView.getContext().getApplicationContext().registerReceiver(this, new IntentFilter("android.intent.action.SCREEN_OFF"));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            CompositorView compositorView = this.c;
            if (compositorView.g == null || compositorView.t || compositorView.k == 0) {
                return;
            }
            this.a = true;
        }
    }
}
