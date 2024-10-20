package defpackage;

import J.N;
import org.chromium.chrome.browser.feed.FeedStream;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cK3 */
/* loaded from: classes.dex */
public final class C4181cK3 implements InterfaceC9395rX {
    @Override // defpackage.InterfaceC9395rX
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.InterfaceC9395rX
    public final VY c(Object obj, AbstractC9053qX abstractC9053qX) {
        C4525dK3 c4525dK3 = (C4525dK3) obj;
        if (c4525dK3 != null && abstractC9053qX != null) {
            InterfaceC3486aJ0 a = L44.a(abstractC9053qX);
            if (a != null) {
                C4868eK3 c4868eK3 = c4525dK3.k;
                if (c4868eK3 == null) {
                    c4868eK3 = C4868eK3.k;
                }
                byte[] byteArray = c4868eK3.toByteArray();
                C7954nJ0 c7954nJ0 = (C7954nJ0) CS.a(L44.b(abstractC9053qX)).b.orElse(null);
                FeedStream feedStream = ((C3835bK0) a).a;
                N.MqUxQ31h(feedStream.d, feedStream, byteArray, C7954nJ0.a(c7954nJ0).toByteArray());
                return C5971hZ.a;
            }
            return new C6315iZ(new IllegalArgumentException("feedActionsHandler not present in ChromeElementBuilder"));
        }
        return new C6315iZ(new IllegalArgumentException("Invalid command parameter to ThereAndBackAgainCommandHandler.onCommand"));
    }

    @Override // defpackage.InterfaceC9395rX
    public final VF0 a() {
        return C4525dK3.o;
    }
}
