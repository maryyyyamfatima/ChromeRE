package defpackage;

import android.os.CountDownTimer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: x22, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CountDownTimerC11293x22 extends CountDownTimer {
    public final /* synthetic */ C9934t43 a;
    public final /* synthetic */ AbstractC11636y22 b;

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC11293x22(AbstractC11636y22 abstractC11636y22, long j, C9934t43 c9934t43) {
        super(j, 100L);
        this.b = abstractC11636y22;
        this.a = c9934t43;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        AbstractC11636y22 abstractC11636y22 = this.b;
        abstractC11636y22.e.b(abstractC11636y22.a(this.a));
    }
}
