package defpackage;

import android.util.Log;
import com.google.android.gms.phenotype.Configurations;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pt2 */
/* loaded from: classes.dex */
public final class C8842pt2 {
    public final C4374ct2 a;
    public final long b;

    public C8842pt2(C4374ct2 c4374ct2) {
        this.a = c4374ct2;
        synchronized (AbstractC8567p51.a) {
        }
        this.b = Math.max(-1L, 2000L);
    }

    public final boolean a(int i) {
        Configurations configurations;
        long j = this.b;
        if (i > 0) {
            C4374ct2 c4374ct2 = this.a;
            c4374ct2.getClass();
            C5531gF3 c5531gF3 = new C5531gF3();
            c5531gF3.a = new C3687at2("com.google.android.partnersetup", "");
            try {
                configurations = (Configurations) UF3.b(c4374ct2.b(0, c5531gF3.a()), j, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                Log.e("PhenotypeFlagCommitter", "Retrieving snapshot for com.google.android.partnersetup failed", e);
                configurations = null;
            }
            if (configurations == null) {
                return false;
            }
            String str = configurations.a;
            if (str != null && !str.isEmpty()) {
                C5531gF3 c5531gF32 = new C5531gF3();
                c5531gF32.a = new C3342Zs2(str);
                try {
                    UF3.b(c4374ct2.b(0, c5531gF32.a()), j, TimeUnit.MILLISECONDS);
                    W20.e(AbstractC5405ft2.a("com.google.android.partnersetup"));
                } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                    Log.w("PhenotypeFlagCommitter", "Committing snapshot for com.google.android.partnersetup failed, retrying", e2);
                    return a(i - 1);
                }
            }
            return true;
        }
        Log.w("PhenotypeFlagCommitter", "No more attempts remaining, giving up for com.google.android.partnersetup");
        return false;
    }
}
