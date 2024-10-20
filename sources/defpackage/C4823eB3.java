package defpackage;

import J.N;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eB3 */
/* loaded from: classes.dex */
public final class C4823eB3 implements InterfaceC5167fB3 {
    public final ArrayList a;

    @Override // defpackage.InterfaceC5167fB3
    public final boolean isEnabled() {
        return true;
    }

    public C4823eB3() {
        C7928nE c7928nE = UN.a;
        if (N.M6bsIDpc("CloseTabSuggestions", "baseline_tab_suggestions", false)) {
            ArrayList arrayList = new ArrayList();
            this.a = arrayList;
            if (N.M6bsIDpc("CloseTabSuggestions", "baseline_group_tab_suggestions", false)) {
                arrayList.add(new C3099Xw(0));
            }
            if (N.M6bsIDpc("CloseTabSuggestions", "baseline_close_tab_suggestions", false)) {
                arrayList.add(new C3099Xw(1));
                return;
            }
            return;
        }
        this.a = new ArrayList(Arrays.asList(new C1603Mi3()));
    }

    @Override // defpackage.InterfaceC5167fB3
    public final void a(C6448iv3 c6448iv3, C6199iB3 c6199iB3) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            List a = ((InterfaceC4480dB3) it.next()).a(c6448iv3);
            if (a != null && !a.isEmpty()) {
                arrayList.addAll(a);
            }
        }
        c6199iB3.onResult(new C5511gB3(arrayList, c6448iv3));
    }
}
