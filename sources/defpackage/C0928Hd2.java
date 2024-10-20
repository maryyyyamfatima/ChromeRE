package defpackage;

import J.N;
import org.chromium.chrome.browser.feed.FeedStream;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Hd2 */
/* loaded from: classes.dex */
public final class C0928Hd2 implements InterfaceC9395rX {
    @Override // defpackage.InterfaceC9395rX
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.InterfaceC9395rX
    public final VY c(Object obj, AbstractC9053qX abstractC9053qX) {
        InterfaceC3486aJ0 a = L44.a(abstractC9053qX);
        if (a != null) {
            FeedStream feedStream = ((C3835bK0) a).a;
            N.MakGUIs_(feedStream.d, feedStream, 40);
            ((C12075zK0) feedStream.k).d();
            return C5971hZ.a;
        }
        return new C6315iZ(new IllegalArgumentException("actionsHandler not present in CommandEventData"));
    }

    @Override // defpackage.InterfaceC9395rX
    public final VF0 a() {
        return C1058Id2.l;
    }
}
