package defpackage;

import J.N;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import java.lang.ref.WeakReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kl0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7073kl0 extends BroadcastReceiver {
    public final Handler a = new Handler();
    public final RunnableC6729jl0 b = new Runnable() { // from class: jl0
        @Override // java.lang.Runnable
        public final void run() {
            C7073kl0.this.a(null);
        }
    };
    public final WeakReference c;
    public Intent d;
    public boolean e;

    /* JADX WARN: Type inference failed for: r0v1, types: [jl0] */
    public C7073kl0(Activity activity) {
        this.c = new WeakReference(activity);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!"android.intent.action.USER_PRESENT".equals(intent.getAction()) || this.d == null) {
            return;
        }
        Activity activity = (Activity) this.c.get();
        if (activity != null) {
            try {
                activity.startActivity(this.d);
            } catch (ActivityNotFoundException e) {
                N.MLlibBXh(false, e);
            }
        }
        a(null);
    }

    public final void a(Intent intent) {
        Handler handler = this.a;
        RunnableC6729jl0 runnableC6729jl0 = this.b;
        handler.removeCallbacks(runnableC6729jl0);
        handler.postDelayed(runnableC6729jl0, 10000L);
        this.d = intent;
        boolean z = intent != null;
        if (z == this.e) {
            return;
        }
        this.e = z;
        Context context = V60.a;
        if (z) {
            context.registerReceiver(this, new IntentFilter("android.intent.action.USER_PRESENT"));
        } else {
            context.unregisterReceiver(this);
        }
    }
}
