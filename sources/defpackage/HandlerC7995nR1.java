package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nR1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC7995nR1 extends Handler {
    public final /* synthetic */ AbstractC8682pR1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC7995nR1(AbstractC8682pR1 abstractC8682pR1, Looper looper) {
        super(looper);
        this.a = abstractC8682pR1;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        InterfaceC9025qR1 interfaceC9025qR1;
        AbstractC8682pR1 abstractC8682pR1;
        HandlerC7995nR1 handlerC7995nR1;
        if (message.what == 1) {
            synchronized (this.a.a) {
                interfaceC9025qR1 = (InterfaceC9025qR1) this.a.d.get();
                abstractC8682pR1 = this.a;
                handlerC7995nR1 = abstractC8682pR1.e;
            }
            if (interfaceC9025qR1 == null || abstractC8682pR1 != interfaceC9025qR1.e() || handlerC7995nR1 == null) {
                return;
            }
            interfaceC9025qR1.f((JR1) message.obj);
            this.a.a(interfaceC9025qR1, handlerC7995nR1);
            interfaceC9025qR1.f(null);
        }
    }
}
