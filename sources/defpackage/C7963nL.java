package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import org.chromium.components.browser_ui.site_settings.ChosenObjectSettings;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nL */
/* loaded from: classes2.dex */
public final class C7963nL implements No4 {
    public final /* synthetic */ ChosenObjectSettings a;

    public C7963nL(ChosenObjectSettings chosenObjectSettings) {
        this.a = chosenObjectSettings;
    }

    @Override // defpackage.No4
    public final void a(Collection collection) {
        ChosenObjectSettings chosenObjectSettings = this.a;
        if (chosenObjectSettings.getActivity() == null) {
            return;
        }
        String str = ((C5901hL) chosenObjectSettings.l0.get(0)).i;
        chosenObjectSettings.l0.clear();
        chosenObjectSettings.m0 = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C6408io4 c6408io4 = (C6408io4) it.next();
            c6408io4.getClass();
            Iterator it2 = new ArrayList(c6408io4.l).iterator();
            while (it2.hasNext()) {
                C5901hL c5901hL = (C5901hL) it2.next();
                if (c5901hL.i.equals(str)) {
                    chosenObjectSettings.l0.add(c5901hL);
                    if (chosenObjectSettings.o0.isEmpty() || c6408io4.g().toLowerCase(Locale.getDefault()).contains(chosenObjectSettings.o0)) {
                        chosenObjectSettings.m0.add(c6408io4);
                    }
                }
            }
        }
        if (chosenObjectSettings.l0.isEmpty()) {
            chosenObjectSettings.getActivity().finish();
        } else {
            chosenObjectSettings.S0();
        }
    }
}
