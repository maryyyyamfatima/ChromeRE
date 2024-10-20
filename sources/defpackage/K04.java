package defpackage;

import J.N;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import org.chromium.chrome.browser.feed.FeedStream;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class K04 implements InterfaceC9395rX {
    @Override // defpackage.InterfaceC9395rX
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.InterfaceC9395rX
    public final VY c(Object obj, AbstractC9053qX abstractC9053qX) {
        Object a;
        InterfaceC3486aJ0 a2 = L44.a(abstractC9053qX);
        if (a2 != null) {
            SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = ((C2924Wn) abstractC9053qX).e;
            if (senderStateOuterClass$SenderState != null) {
                OX0 ox0 = C0206Bp0.n;
                ox0.getClass();
                senderStateOuterClass$SenderState.v(ox0);
                C5563gM0 c5563gM0 = senderStateOuterClass$SenderState.j;
                c5563gM0.getClass();
                NX0 nx0 = ox0.d;
                nx0.getClass();
                if (c5563gM0.a.get(nx0) != null) {
                    senderStateOuterClass$SenderState.v(ox0);
                    Object c = senderStateOuterClass$SenderState.j.c(nx0);
                    if (c == null) {
                        a = ox0.b;
                    } else {
                        a = ox0.a(c);
                    }
                    int i = ((C0206Bp0) a).k;
                    FeedStream feedStream = ((C3835bK0) a2).a;
                    N.MndmRGin(feedStream.d, feedStream, i);
                    return C5971hZ.a;
                }
            }
            return new C6315iZ(new IllegalArgumentException("Ephemeral change ID not present in CommandEventData"));
        }
        return new C6315iZ(new IllegalArgumentException("feedActionsHandler not present in CommandEventData"));
    }

    @Override // defpackage.InterfaceC9395rX
    public final VF0 a() {
        return L04.l;
    }
}
