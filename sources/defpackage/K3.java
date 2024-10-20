package defpackage;

import android.content.Context;
import android.os.UserManager;
import java.util.ArrayList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class K3 extends AbstractC0185Bl {
    public final /* synthetic */ MC2 h;
    public final /* synthetic */ L3 i;

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        this.i.getClass();
        ArrayList arrayList = new ArrayList();
        try {
            Context context = V60.a;
            String[] stringArray = ((UserManager) context.getSystemService("user")).getApplicationRestrictions(context.getPackageName()).getStringArray("RestrictAccountsToPatterns");
            if (stringArray != null) {
                for (String str : stringArray) {
                    arrayList.add(new C3317Zn2(str));
                }
            }
        } catch (C3187Yn2 e) {
            AbstractC4851eH1.a("AccountRestriction", "Can't get account restriction patterns", e);
        }
        return arrayList;
    }

    public K3(L3 l3, MC2 mc2) {
        this.i = l3;
        this.h = mc2;
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        this.h.b((List) obj);
    }
}
