package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ht, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6090ht implements IF3 {
    public final AlarmManager a;
    public final PendingIntent b;

    public C6090ht(AlarmManager alarmManager, PendingIntent pendingIntent) {
        this.a = alarmManager;
        this.b = pendingIntent;
    }

    @Override // defpackage.IF3
    public final void a(FF3 ff3) {
        throw new RuntimeException("One-off tasks should not be scheduled with AlarmManager.");
    }

    @Override // defpackage.IF3
    public final void c(HF3 hf3) {
        throw new RuntimeException("Periodic tasks should not be scheduled with AlarmManager.");
    }

    @Override // defpackage.IF3
    public final void b(DF3 df3) {
        this.a.setExactAndAllowWhileIdle(0, df3.a, this.b);
    }
}
