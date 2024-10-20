package defpackage;

import android.view.View;
import com.android.chrome.R;
import java.util.HashMap;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sU */
/* loaded from: classes.dex */
public final class C9723sU implements InterfaceC7833mx0, InterfaceC6457ix0 {
    public final InterfaceC5323ff4 a;
    public final C10409uU b;
    public final U80 c;
    public final /* synthetic */ C10066tU d;

    public C9723sU(C10066tU c10066tU, InterfaceC5323ff4 interfaceC5323ff4, C10409uU c10409uU, U80 u80) {
        this.d = c10066tU;
        this.a = interfaceC5323ff4;
        this.b = c10409uU;
        this.c = u80;
    }

    @Override // defpackage.InterfaceC7833mx0
    public final void b(View view, View view2) {
        C6492j31 c6492j31 = C10066tU.c;
        InterfaceC5462g31 interfaceC5462g31 = (InterfaceC5462g31) c6492j31.c().g("com/google/android/libraries/search/rendering/xuikit/elements/logging/ClientLoggingPropertiesConverter$ElementVisibilityHandler", 138, "onVisible", "ClientLoggingPropertiesConverter.java");
        C10409uU c10409uU = this.b;
        interfaceC5462g31.o(c10409uU, "onVisible called on VE with ClientLoggingProperties: %s");
        if (view2 == null) {
            InterfaceC5462g31 interfaceC5462g312 = (InterfaceC5462g31) ((InterfaceC5462g31) c6492j31.f().l(Tr4.c, Ur4.a(this.d.b.a(), this.c))).g("com/google/android/libraries/search/rendering/xuikit/elements/logging/ClientLoggingPropertiesConverter$ElementVisibilityHandler", 153, "onVisible", "ClientLoggingPropertiesConverter.java");
            VT vt = c10409uU.l;
            if (vt == null) {
                vt = VT.v;
            }
            interfaceC5462g312.d(vt.n, "VE with ve type %d has attention tracking enabled, but there is no corresponding Elements view.");
            return;
        }
        Map map = (Map) view.getTag(R.id.tag_visibility_tracking_map);
        if (map == null) {
            map = new HashMap();
            view.setTag(R.id.tag_visibility_tracking_map, map);
        }
        map.put(c10409uU, view2);
        this.a.b(view2, c10409uU);
    }

    @Override // defpackage.InterfaceC6457ix0
    public final void a(View view) {
        Map map = (Map) view.getTag(R.id.tag_visibility_tracking_map);
        if (map == null) {
            map = new HashMap();
            view.setTag(R.id.tag_visibility_tracking_map, map);
        }
        C10409uU c10409uU = this.b;
        View view2 = (View) map.get(c10409uU);
        if (view2 != null) {
            this.a.a(view2);
            map.remove(c10409uU);
        }
    }
}
