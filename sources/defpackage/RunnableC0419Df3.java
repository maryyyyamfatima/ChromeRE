package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Df3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC0419Df3 implements Runnable {
    public final /* synthetic */ ViewOnClickListenerC1069If3 a;

    @Override // java.lang.Runnable
    public final void run() {
        ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3 = this.a;
        C0289Cf3 c0289Cf3 = viewOnClickListenerC1069If3.i;
        if (!(c0289Cf3.a().l == 2)) {
            c0289Cf3.b(false);
            while (true) {
                C12188zf3 a = c0289Cf3.a();
                if (a != null) {
                    if (!(a.l == 0)) {
                        break;
                    } else {
                        c0289Cf3.b(false);
                    }
                } else {
                    break;
                }
            }
        }
        viewOnClickListenerC1069If3.d();
    }

    public RunnableC0419Df3(ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3) {
        this.a = viewOnClickListenerC1069If3;
    }
}
