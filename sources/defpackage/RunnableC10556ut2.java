package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutionException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ut2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC10556ut2 implements Runnable {
    public final /* synthetic */ RD1 a;

    @Override // java.lang.Runnable
    public final void run() {
        RD1 rd1 = this.a;
        try {
            rd1.isDone();
            AbstractC7515m14.a(rd1);
        } catch (ExecutionException e) {
            Runnable runnable = new Runnable() { // from class: vt2
                @Override // java.lang.Runnable
                public final void run() {
                    throw new RuntimeException(e.getCause());
                }
            };
            if (HK3.b == null) {
                HK3.b = new Handler(Looper.getMainLooper());
            }
            HK3.b.post(runnable);
        }
    }
}
