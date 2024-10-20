package org.chromium.net;

import J.N;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ProxyInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import defpackage.C11361xE2;
import defpackage.V60;
import org.chromium.base.TraceEvent;
import org.chromium.net.ProxyChangeListener;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ProxyChangeListener {
    public final Looper a;
    public final Handler b;
    public long c;
    public ProxyReceiver d;
    public C11361xE2 e;

    public ProxyChangeListener() {
        Looper myLooper = Looper.myLooper();
        this.a = myLooper;
        this.b = new Handler(myLooper);
    }

    public static ProxyChangeListener create() {
        return new ProxyChangeListener();
    }

    public static String getProperty(String str) {
        return System.getProperty(str);
    }

    public void stop() {
        this.c = 0L;
        V60.a.unregisterReceiver(this.d);
        C11361xE2 c11361xE2 = this.e;
        if (c11361xE2 != null) {
            V60.a.unregisterReceiver(c11361xE2);
        }
        this.d = null;
        this.e = null;
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes2.dex */
    public class ProxyReceiver extends BroadcastReceiver {
        public static final /* synthetic */ int b = 0;

        public ProxyReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, final Intent intent) {
            if (intent.getAction().equals("android.intent.action.PROXY_CHANGE")) {
                Runnable runnable = new Runnable() { // from class: BE2
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i = ProxyChangeListener.ProxyReceiver.b;
                        ProxyChangeListener.ProxyReceiver proxyReceiver = ProxyChangeListener.ProxyReceiver.this;
                        proxyReceiver.getClass();
                        Bundle extras = intent.getExtras();
                        AE2 a = extras == null ? null : AE2.a((ProxyInfo) extras.get("android.intent.extra.PROXY_INFO"));
                        ProxyChangeListener proxyChangeListener = ProxyChangeListener.this;
                        long j = proxyChangeListener.c;
                        if (j == 0) {
                            return;
                        }
                        if (a != null) {
                            N.MyoFZt$2(j, proxyChangeListener, a.a, a.b, a.c, a.d);
                        } else {
                            N.MCIk73GZ(j, proxyChangeListener);
                        }
                    }
                };
                ProxyChangeListener proxyChangeListener = ProxyChangeListener.this;
                if (proxyChangeListener.a == Looper.myLooper()) {
                    runnable.run();
                } else {
                    proxyChangeListener.b.post(runnable);
                }
            }
        }
    }

    public final void a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PROXY_CHANGE");
        ProxyReceiver proxyReceiver = new ProxyReceiver();
        this.d = proxyReceiver;
        V60.d(V60.a, proxyReceiver, new IntentFilter());
        C11361xE2 c11361xE2 = new C11361xE2(this);
        this.e = c11361xE2;
        V60.d(V60.a, c11361xE2, intentFilter);
    }

    public void start(long j) {
        TraceEvent i = TraceEvent.i("ProxyChangeListener.start", null);
        try {
            this.c = j;
            a();
            if (i != null) {
                i.close();
            }
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }
}
