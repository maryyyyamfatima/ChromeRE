package defpackage;

import org.chromium.chrome.browser.autofill.PersonalDataManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class E53 implements Runnable {
    public final /* synthetic */ G53 a;
    public final /* synthetic */ PersonalDataManager.CreditCard g;

    public E53(G53 g53, PersonalDataManager.CreditCard creditCard) {
        this.a = g53;
        this.g = creditCard;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2549Tq interfaceC2549Tq;
        C3069Xq a;
        C1642Mq2 c1642Mq2 = (C1642Mq2) this.a;
        if (!c1642Mq2.B || c1642Mq2.C == null || (interfaceC2549Tq = c1642Mq2.F) == null || (a = ((C2809Vq) interfaceC2549Tq).a(this.g)) == null) {
            return;
        }
        c1642Mq2.C.a(a);
        c1642Mq2.w();
        ViewOnClickListenerC5731gq2 viewOnClickListenerC5731gq2 = c1642Mq2.z;
        if (viewOnClickListenerC5731gq2 != null) {
            viewOnClickListenerC5731gq2.o(4, c1642Mq2.C);
        }
    }
}
