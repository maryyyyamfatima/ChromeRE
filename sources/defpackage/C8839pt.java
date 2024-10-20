package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pt, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8839pt implements IF3 {
    public final int a;

    public C8839pt(int i) {
        this.a = i;
    }

    @Override // defpackage.IF3
    public final void a(FF3 ff3) {
        C0225Bt c = C0225Bt.c();
        boolean z = ff3.d;
        c.getClass();
        int i = this.a;
        if (z) {
            C0225Bt.b(AbstractC7464lt.a(i), "Android.BackgroundTaskScheduler.TaskCreated.WithExpiration");
        } else {
            C0225Bt.b(AbstractC7464lt.a(i), "Android.BackgroundTaskScheduler.TaskCreated.WithoutExpiration");
        }
    }

    @Override // defpackage.IF3
    public final void c(HF3 hf3) {
        C0225Bt c = C0225Bt.c();
        boolean z = hf3.d;
        c.getClass();
        int i = this.a;
        if (z) {
            C0225Bt.b(AbstractC7464lt.a(i), "Android.BackgroundTaskScheduler.TaskCreated.WithExpiration");
        } else {
            C0225Bt.b(AbstractC7464lt.a(i), "Android.BackgroundTaskScheduler.TaskCreated.WithoutExpiration");
        }
    }

    @Override // defpackage.IF3
    public final void b(DF3 df3) {
        C0225Bt c = C0225Bt.c();
        int a = AbstractC7464lt.a(this.a);
        c.getClass();
        C0225Bt.b(a, "Android.BackgroundTaskScheduler.ExactTaskCreated");
    }
}
