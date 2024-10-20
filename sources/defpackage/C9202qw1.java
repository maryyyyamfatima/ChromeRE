package defpackage;

import J.N;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qw1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9202qw1 implements InterfaceC3906bY1 {
    public ZX1 a;
    public HashSet g;
    public HashSet h;

    @Override // defpackage.InterfaceC3906bY1
    public final void a(int i) {
        if (i == 1) {
            EI2.h(1, 2, "Translate.ExplicitLanguageAsk.Event");
        } else {
            EI2.h(2, 2, "Translate.ExplicitLanguageAsk.Event");
        }
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void c(int i, PropertyModel propertyModel) {
        if (i != 1) {
            TreeSet treeSet = new TreeSet(this.g);
            treeSet.removeAll(this.h);
            Iterator it = treeSet.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                N.Me60Lv4_(str, true);
                N.MC39_Sil(str, true);
            }
            HashSet hashSet = new HashSet(this.h);
            hashSet.removeAll(this.g);
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                N.Me60Lv4_(str2, false);
                N.MC39_Sil(str2, false);
            }
            this.a.c(1, propertyModel);
            return;
        }
        this.a.c(2, propertyModel);
    }
}
