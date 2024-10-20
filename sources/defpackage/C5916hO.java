package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.BrowserRestartActivity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hO, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5916hO implements InterfaceC8779pj, InterfaceC11179wj {
    public static C5916hO k;
    public final Handler a = new Handler(Looper.getMainLooper());
    public final RunnableC5572gO g = new RunnableC5572gO(this);
    public boolean h;
    public boolean i;
    public int j;

    @Override // defpackage.InterfaceC11179wj
    public final void o(Activity activity, int i) {
        if (i == 6) {
            int i2 = this.j - 1;
            this.j = i2;
            if (i2 == 0) {
                a();
            }
        }
    }

    public final void a() {
        Object obj = ThreadUtils.a;
        if (this.h) {
            return;
        }
        this.h = true;
        this.a.removeCallbacks(this.g);
        Context context = V60.a;
        boolean z = this.i;
        int i = BrowserRestartActivity.a;
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), BrowserRestartActivity.class.getName());
        intent.setFlags(268435456);
        intent.putExtra("org.chromium.chrome.browser.BrowserRestartActivity.main_pid", Process.myPid());
        intent.putExtra("org.chromium.chrome.browser.BrowserRestartActivity.restart", z);
        context.startActivity(intent);
    }
}
