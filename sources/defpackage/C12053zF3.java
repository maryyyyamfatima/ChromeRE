package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zF3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12053zF3 extends AbstractRunnableC4843eF3 {
    public final Runnable h;

    public C12053zF3(Runnable runnable, long j, C7249lF3 c7249lF3) {
        super(j, c7249lF3);
        this.h = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.h.run();
        } finally {
            this.g.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.h;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC6711ji0.a(runnable));
        sb.append(", ");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.g);
        sb.append(']');
        return sb.toString();
    }
}
