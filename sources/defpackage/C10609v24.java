package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: v24 */
/* loaded from: classes.dex */
public final class C10609v24 implements InterfaceC9395rX {
    @Override // defpackage.InterfaceC9395rX
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.InterfaceC9395rX
    public final VY c(Object obj, AbstractC9053qX abstractC9053qX) {
        C10952w24 c10952w24 = (C10952w24) obj;
        if (L44.c(abstractC9053qX) != null) {
            C11295x24 c11295x24 = c10952w24.k;
            if (c11295x24 == null) {
                c11295x24 = C11295x24.n;
            }
            int i = c11295x24.k;
            if (i != 0 ? i != 1 ? false : 2 : true) {
            }
            return C5971hZ.a;
        }
        return new C6315iZ(new IllegalArgumentException("actionsHandler not present in CommandEventData"));
    }

    @Override // defpackage.InterfaceC9395rX
    public final VF0 a() {
        return C10952w24.o;
    }
}
