package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lL2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC7278lL2 implements Runnable {
    public final /* synthetic */ C7622mL2 a;

    public RunnableC7278lL2(C7622mL2 c7622mL2) {
        this.a = c7622mL2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7622mL2 c7622mL2 = this.a;
        ServiceConnectionC10024tL2 serviceConnectionC10024tL2 = c7622mL2.i;
        if (serviceConnectionC10024tL2.s == c7622mL2) {
            serviceConnectionC10024tL2.k();
        }
    }
}
