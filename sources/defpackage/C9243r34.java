package defpackage;

import android.text.TextUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: r34 */
/* loaded from: classes.dex */
public final class C9243r34 implements InterfaceC9395rX {
    @Override // defpackage.InterfaceC9395rX
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.InterfaceC9395rX
    public final VY c(Object obj, AbstractC9053qX abstractC9053qX) {
        C9586s34 c9586s34 = (C9586s34) obj;
        if (c9586s34 != null && abstractC9053qX != null) {
            InterfaceC2548Tp3 c = L44.c(abstractC9053qX);
            if (c != null) {
                String str = c9586s34.k;
                if (!TextUtils.isEmpty(str)) {
                    ((C6241iK0) c).b(((C2924Wn) abstractC9053qX).a, str);
                    return C5971hZ.a;
                }
                return new C6315iZ(new IllegalArgumentException("empty URL supplied to command handler"));
            }
            return new C6315iZ(new IllegalArgumentException("actionsHandler not present in CommandEventData"));
        }
        return new C6315iZ(new IllegalArgumentException("Invalid command parameter to UrlCommandHandler.onCommand"));
    }

    @Override // defpackage.InterfaceC9395rX
    public final VF0 a() {
        return C9586s34.o;
    }
}
