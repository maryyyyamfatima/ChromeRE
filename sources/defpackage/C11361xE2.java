package defpackage;

import J.N;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.ProxyInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import org.chromium.net.ProxyChangeListener;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xE2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11361xE2 extends BroadcastReceiver {
    public final ProxyChangeListener a;

    public C11361xE2(ProxyChangeListener proxyChangeListener) {
        this.a = proxyChangeListener;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, final Intent intent) {
        if (intent.getAction().equals("android.intent.action.PROXY_CHANGE")) {
            final ProxyChangeListener proxyChangeListener = this.a;
            proxyChangeListener.getClass();
            Runnable runnable = new Runnable() { // from class: zE2
                @Override // java.lang.Runnable
                public final void run() {
                    AE2 a;
                    ProxyChangeListener proxyChangeListener2 = ProxyChangeListener.this;
                    proxyChangeListener2.getClass();
                    ProxyInfo defaultProxy = ((ConnectivityManager) V60.a.getSystemService("connectivity")).getDefaultProxy();
                    if (defaultProxy == null) {
                        a = AE2.e;
                    } else if (Build.VERSION.SDK_INT >= 29 && "localhost".equals(defaultProxy.getHost()) && defaultProxy.getPort() == -1) {
                        Bundle extras = intent.getExtras();
                        a = extras == null ? null : AE2.a((ProxyInfo) extras.get("android.intent.extra.PROXY_INFO"));
                    } else {
                        a = AE2.a(defaultProxy);
                    }
                    long j = proxyChangeListener2.c;
                    if (j == 0) {
                        return;
                    }
                    if (a != null) {
                        N.MyoFZt$2(j, proxyChangeListener2, a.a, a.b, a.c, a.d);
                    } else {
                        N.MCIk73GZ(j, proxyChangeListener2);
                    }
                }
            };
            if (proxyChangeListener.a == Looper.myLooper()) {
                runnable.run();
            } else {
                proxyChangeListener.b.post(runnable);
            }
        }
    }
}
