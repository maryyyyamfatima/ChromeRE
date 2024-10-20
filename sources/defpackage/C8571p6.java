package defpackage;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.metrics.PageLoadMetrics;
import org.chromium.chrome.browser.metrics.UmaUtils;
import org.chromium.components.safe_browsing.SafeBrowsingApiBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: p6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8571p6 {
    public long b;
    public String c;
    public C7196l6 d;
    public C8228o6 e;
    public C7540m6 f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public final AtomicLong l = new AtomicLong();
    public final long a = SystemClock.uptimeMillis();

    public C8571p6(C0649Ez3 c0649Ez3) {
        c0649Ez3.m(new Callback() { // from class: j6
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                InterfaceC10590uz3 interfaceC10590uz3 = (InterfaceC10590uz3) obj;
                C8571p6 c8571p6 = C8571p6.this;
                if (c8571p6.g) {
                    c8571p6.d = new C7196l6(c8571p6, interfaceC10590uz3);
                    C8228o6 c8228o6 = new C8228o6(c8571p6);
                    c8571p6.e = c8228o6;
                    PageLoadMetrics.a(c8228o6);
                    C7540m6 c7540m6 = new C7540m6(c8571p6);
                    c8571p6.f = c7540m6;
                    Object obj2 = ThreadUtils.a;
                    if (UmaUtils.a == null) {
                        UmaUtils.a = new C12157za2();
                    }
                    UmaUtils.a.a(c7540m6);
                }
            }
        });
        C6852k6 c6852k6 = new C6852k6(this);
        synchronized (SafeBrowsingApiBridge.a) {
            SafeBrowsingApiBridge.d = c6852k6;
        }
    }
}
