package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Dc2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0403Dc2 implements Runnable {
    public final /* synthetic */ C0533Ec2 a;

    public RunnableC0403Dc2(C0533Ec2 c0533Ec2) {
        this.a = c0533Ec2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a.b) {
            InterfaceC0663Fc2 interfaceC0663Fc2 = this.a.c;
            if (interfaceC0663Fc2 != null) {
                interfaceC0663Fc2.d();
            }
        }
    }
}
