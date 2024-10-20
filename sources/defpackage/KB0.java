package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.LinkedList;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.enterprise.util.EnterpriseInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class KB0 extends EnterpriseInfo {
    public FB0 c = null;
    public final LinkedList d = new LinkedList();
    public final Handler b = new Handler(Looper.myLooper());

    @Override // org.chromium.chrome.browser.enterprise.util.EnterpriseInfo
    public final void a(final Callback callback) {
        Object obj = ThreadUtils.a;
        FB0 fb0 = this.c;
        Handler handler = this.b;
        if (fb0 != null) {
            handler.post(new Runnable() { // from class: GB0
                @Override // java.lang.Runnable
                public final void run() {
                    callback.onResult(KB0.this.c);
                }
            });
            return;
        }
        LinkedList linkedList = this.d;
        linkedList.add(callback);
        if (linkedList.size() > 1) {
            return;
        }
        try {
            JB0 jb0 = new JB0(this);
            QF3 qf3 = QF3.i;
            jb0.e();
            PostTask.b(qf3, jb0.a, 0L);
        } catch (RejectedExecutionException unused) {
            AbstractC4851eH1.f("EnterpriseInfoImpl", "Thread limit reached, unable to determine managed state.", new Object[0]);
            final Callback callback2 = (Callback) linkedList.remove();
            handler.post(new Runnable() { // from class: HB0
                @Override // java.lang.Runnable
                public final void run() {
                    Callback.this.onResult(null);
                }
            });
        }
    }

    @Override // org.chromium.chrome.browser.enterprise.util.EnterpriseInfo
    public final void c() {
        a(new Callback() { // from class: IB0
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                FB0 fb0 = (FB0) obj;
                if (fb0 == null) {
                    return;
                }
                EI2.b("EnterpriseCheck.IsManaged2", fb0.b);
                EI2.b("EnterpriseCheck.IsFullyManaged2", fb0.a);
            }
        });
    }
}
